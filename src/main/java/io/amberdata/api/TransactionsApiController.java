package io.amberdata.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.amberdata.model.PendingTransactions;
import io.amberdata.model.PendingTransactions1;
import io.amberdata.model.Transaction;
import io.amberdata.model.Transaction1;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

@Controller
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> transactionsIdDelete(@ApiParam(value = "The transaction hash",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transactionsIdGet(@ApiParam(value = "The transaction hash",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transactionsIdPatch(@ApiParam(value = "The transaction hash",required=true) @PathVariable("id") String id,@ApiParam(value = "an example" ,required=true )  @Valid @RequestBody Transaction1 ERROR_UNKNOWN) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transactionsPendingIdDelete(@ApiParam(value = "Pending transaction hash",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transactionsPendingIdGet(@ApiParam(value = "Pending transaction hash",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transactionsPendingIdPatch(@ApiParam(value = "Pending transaction hash",required=true) @PathVariable("id") String id,@ApiParam(value = "an example" ,required=true )  @Valid @RequestBody PendingTransactions1 pendingTransaction) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transactionsPendingPost(@ApiParam(value = "an example" ,required=true )  @Valid @RequestBody PendingTransactions pendingTransaction) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transactionsPost(@ApiParam(value = "Specify an entire transaction object or an array of transaction objects" ,required=true )  @Valid @RequestBody Transaction transaction) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
