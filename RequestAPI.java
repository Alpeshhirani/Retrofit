

public interface RequestAPI {

  
    @POST("abc.php")
    Call<TopStreetviewResponse> getabc(@Body AbcRequest request);

}
