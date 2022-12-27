package org.btc.aws;

import java.util.List;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.ListBucketsRequest;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import software.amazon.awssdk.awscore.client.builder.AwsClientBuilder;
//import software.amazon.awssdk.services.s3.model.Bucket;

//import software.amazon.awssdk.services.s3.model.S3Exception;
//import software.amazon.awssdk.services.s3.model.S3Object;
//import java.util.ListIterator;
//import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
//import software.amazon.awssdk.services.s3.model.ListObjectsResponse;

@SpringBootApplication
public class S3Application {

	public static void main(String[] args) {
		
		System.out.println("*******S3 Buckets*******");
        Region region = Region.US_EAST_1;
        S3Client client = S3Client.builder().region(region).build();
         
        ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();
        ListBucketsResponse listBuckets = client.listBuckets(listBucketsRequest);
         
        List<Bucket> buckets = listBuckets.buckets();
         
        for (Bucket bucket : buckets) {
            System.out.println(bucket.name() + " - " + bucket.creationDate());
        }
    }
}