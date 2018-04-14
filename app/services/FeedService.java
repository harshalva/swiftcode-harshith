package services;

import data.FeedResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import play.libs.ws.WS;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

public class FeedService {
    public FeedResponse getFeedByQuery(String query){
        FeedResponse feedResponseObject=new FeedResponse();
    }
    try{
        WSRequest feedRequest=WS.url("https://news.google.com/news");
        CompletionStage<WSResponse> responsePromise= feedRequest
                .setQueryParameter("q",query)
                .setQueryParameter("output","rss")
                .get();
        Document feedResponse=responsePromise.thenApply(WSResponse::asXml).toCompletableFuture().get();
        Node item=feedResponse.getFirstChild().getFirstChild()
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
