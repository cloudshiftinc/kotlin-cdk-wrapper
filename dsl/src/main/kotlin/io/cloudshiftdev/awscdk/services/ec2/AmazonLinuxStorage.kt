package io.cloudshiftdev.awscdk.services.ec2

public enum class AmazonLinuxStorage(
  private val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxStorage,
) {
  EBS(software.amazon.awscdk.services.ec2.AmazonLinuxStorage.EBS),
  S3(software.amazon.awscdk.services.ec2.AmazonLinuxStorage.S3),
  GENERAL_PURPOSE(software.amazon.awscdk.services.ec2.AmazonLinuxStorage.GENERAL_PURPOSE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxStorage):
        AmazonLinuxStorage = when (cdkObject) {
      software.amazon.awscdk.services.ec2.AmazonLinuxStorage.EBS -> AmazonLinuxStorage.EBS
      software.amazon.awscdk.services.ec2.AmazonLinuxStorage.S3 -> AmazonLinuxStorage.S3
      software.amazon.awscdk.services.ec2.AmazonLinuxStorage.GENERAL_PURPOSE ->
          AmazonLinuxStorage.GENERAL_PURPOSE
    }

    internal fun unwrap(wrapped: AmazonLinuxStorage):
        software.amazon.awscdk.services.ec2.AmazonLinuxStorage = wrapped.cdkObject
  }
}
