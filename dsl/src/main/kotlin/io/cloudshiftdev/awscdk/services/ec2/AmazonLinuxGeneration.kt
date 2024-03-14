package io.cloudshiftdev.awscdk.services.ec2

public enum class AmazonLinuxGeneration(
  private val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxGeneration,
) {
  AMAZON_LINUX(software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX),
  AMAZON_LINUX_2(software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX_2),
  AMAZON_LINUX_2022(software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX_2022),
  AMAZON_LINUX_2023(software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX_2023),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxGeneration):
        AmazonLinuxGeneration = when (cdkObject) {
      software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX ->
          AmazonLinuxGeneration.AMAZON_LINUX
      software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX_2 ->
          AmazonLinuxGeneration.AMAZON_LINUX_2
      software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX_2022 ->
          AmazonLinuxGeneration.AMAZON_LINUX_2022
      software.amazon.awscdk.services.ec2.AmazonLinuxGeneration.AMAZON_LINUX_2023 ->
          AmazonLinuxGeneration.AMAZON_LINUX_2023
    }

    internal fun unwrap(wrapped: AmazonLinuxGeneration):
        software.amazon.awscdk.services.ec2.AmazonLinuxGeneration = wrapped.cdkObject
  }
}
