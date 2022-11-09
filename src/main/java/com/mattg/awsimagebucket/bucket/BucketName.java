package com.mattg.awsimagebucket.bucket;

public enum BucketName {

    PROFILE_IMAGE("aws-image-uploader-bucket");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
