package io.cloudshiftdev.awscdk.services.ec2

public enum class AmazonLinuxEdition(
  private val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxEdition,
) {
  STANDARD(software.amazon.awscdk.services.ec2.AmazonLinuxEdition.STANDARD),
  MINIMAL(software.amazon.awscdk.services.ec2.AmazonLinuxEdition.MINIMAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxEdition):
        AmazonLinuxEdition = when (cdkObject) {
      software.amazon.awscdk.services.ec2.AmazonLinuxEdition.STANDARD -> AmazonLinuxEdition.STANDARD
      software.amazon.awscdk.services.ec2.AmazonLinuxEdition.MINIMAL -> AmazonLinuxEdition.MINIMAL
    }

    internal fun unwrap(wrapped: AmazonLinuxEdition):
        software.amazon.awscdk.services.ec2.AmazonLinuxEdition = wrapped.cdkObject
  }
}
