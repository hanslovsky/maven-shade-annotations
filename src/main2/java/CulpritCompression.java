import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.janelia.saalfeldlab.n5.Compression;
import org.janelia.saalfeldlab.n5.DefaultBlockReader;
import org.janelia.saalfeldlab.n5.DefaultBlockWriter;
import org.janelia.saalfeldlab.n5.Compression.CompressionType;

@CompressionType("culprit")
public class CulpritCompression implements DefaultBlockReader, DefaultBlockWriter, Compression {

    	private static final long serialVersionUID = -1L;

	@Override
	public InputStream getInputStream(final InputStream in) throws IOException {
		return in;
	}

	@Override
	public OutputStream getOutputStream(final OutputStream out) throws IOException {
		return out;
	}

	@Override
	public CulpritCompression getReader() {
		return this;
	}

	@Override
	public CulpritCompression getWriter() {
		return this;
	}
    
}
