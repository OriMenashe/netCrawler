package at.netcrawler.cli.agent;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

import at.andiwand.library.cli.CommandLine;


public class CiscoCommandLineAgent extends CommandLineAgent {
	
	private static final String COMMENT_PREFIX = "!";
	private static final Pattern PROMT_PATTERN = Pattern.compile(
			"(.*?)(/.*?)?(\\((.*?)\\))?(>|#)", Pattern.MULTILINE);
	private static final Charset CHARSET = Charset.forName("UTF-8");
	public static final Pattern MORE_PATTERN = Pattern.compile(
			".*?(.+)more\\1.*?", Pattern.CASE_INSENSITIVE);
	
	public CiscoCommandLineAgent(CommandLine commandLine) {
		super(commandLine, CHARSET, PROMT_PATTERN, COMMENT_PREFIX);
	}
	
	public CiscoCommandLineAgent(CommandLineSocket socket) {
		super(socket, PROMT_PATTERN, COMMENT_PREFIX);
	}
	
}