package webencoder.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
Properties for the S3 storage service.

It stores the S3 bucket name, as well the public and private key for
accessing S3 and the region selected for the bucket.
*/
@ConfigurationProperties("storage.s3")
public class S3StorageProperties {

  private String bucket_name = "unknown";
  private String key = System.getenv("AWS_ACCESS_KEY_ID");
  private String private_key = System.getenv("AWS_SECRET_ACCESS_KEY");
  private String region = "unknown";

  public String getRegion() {
    return this.region;
  }
  public void setRegion(String name) {
    this.region = name;
  }

  public String getKey() {
    return this.key;
  }
  public void setKey(String name) {
    this.key = name;
  }

  public String getPrivateKey() {
    return this.private_key;
  }

  public void setPrivateKey(String name) {
    this.private_key = name;
  }

  public String getBucketName() {
    return this.bucket_name;
  }

  public void setBucketName(String name) {
    this.bucket_name = name;
  }

}
