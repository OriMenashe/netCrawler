package at.netcrawler.network.connection;

import at.netcrawler.network.accessor.IPDeviceAccessor;


public abstract class IPDeviceConnection extends Connection {
	
	public IPDeviceConnection(IPDeviceAccessor accessor,
			ConnectionSettings settings) {
		super(accessor, settings);
	}
	
}