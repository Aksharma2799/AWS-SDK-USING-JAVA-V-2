package org.btc.aws;


import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.DeleteBucketRequest;

public class DeleteBucket {
	  public static void main(String[] args) {
	        String bucketName = "new-26-dec-2022";
	        S3Client client = S3Client.builder().build();
	         
	        DeleteBucketRequest request = DeleteBucketRequest.builder()
	                            .bucket(bucketName).build();
	         
	        client.deleteBucket(request);
	                 
	        System.out.println("Bucket " + bucketName + " was deleted.");      
	    }

}
