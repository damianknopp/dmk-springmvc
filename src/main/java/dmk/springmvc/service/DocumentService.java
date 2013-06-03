package dmk.springmvc.service;

import java.io.ByteArrayOutputStream;


public interface DocumentService {

	public ByteArrayOutputStream getById(final long id);
}
