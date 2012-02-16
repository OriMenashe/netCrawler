package at.netcrawler.network.manager;

import java.io.IOException;

import at.netcrawler.network.CDPNeighbors;
import at.netcrawler.network.model.extension.CiscoDeviceExtension;


public abstract class CiscoDeviceExtensionManager extends
		DeviceExtensionManager {
	
	private static final Class<CiscoDeviceExtension> EXTENSION_CLASS = CiscoDeviceExtension.class;
	
	public CiscoDeviceExtensionManager() {
		super(EXTENSION_CLASS);
	}
	
	@Override
	public final Object getValue(String key) throws IOException {
		if (key.equals(CiscoDeviceExtension.CDP_NEIGHBORS)) {
			return getCDPNeighbors();
		}
		
		throw new IllegalArgumentException("Unsupported key!");
	}
	
	protected abstract CDPNeighbors getCDPNeighbors() throws IOException;
	
	@Override
	public final boolean setValue(String key, Object value) throws IOException {
		throw new IllegalArgumentException("Unsupported key!");
	}
	
	// TODO: implement
	@Override
	public boolean hasExtension() throws IOException {
		return false;
	}
	
}