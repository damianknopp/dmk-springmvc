package dmk.springmvc.controller;

import java.io.ByteArrayOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dmk.springmvc.service.DocumentService;
 
@Controller
@RequestMapping("/doc")
public class DocumentController {
     
    DocumentService documentService;
     
    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }
 
    @RequestMapping(value="/test", method=RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "yeah boiiee!";
    }
 
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Long id) {
        return new String(documentService.getById(id).toByteArray());
    }
     
    @RequestMapping(value="/params", params="id", method=RequestMethod.GET)
    @ResponseBody
    public ByteArrayOutputStream getByIdFromParam(@RequestParam Long id) {
        return documentService.getById(id);
    }
     
}