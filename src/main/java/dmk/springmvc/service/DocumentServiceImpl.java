package dmk.springmvc.service;

import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService {

	public ByteArrayOutputStream getById(final long id) {
		try (final ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			final String doc = String.format("document %d", id);
			baos.write(doc.getBytes("UTF-8"));
			return baos;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
