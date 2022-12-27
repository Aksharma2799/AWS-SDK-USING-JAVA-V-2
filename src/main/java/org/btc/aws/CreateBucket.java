package org.btc.aws;

import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CreateBucketRequest;

public class CreateBucket {
	
	    public static void main(String[] args) {
	        String bucketName = "new-26-dec-2022";
	         
	        S3Client client = S3Client.builder().build();
	         
	        CreateBucketRequest request = CreateBucketRequest.builder().bucket(bucketName).build();
	        client.createBucket(request);
	        System.out.println("Bucket created successfully!" + bucketName);
	      
	    }
	    
	}
	

