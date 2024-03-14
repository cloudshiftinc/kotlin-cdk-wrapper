package io.cloudshiftdev.awscdk.services.ec2

public enum class AmazonLinuxVirt(
  private val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxVirt,
) {
  HVM(software.amazon.awscdk.services.ec2.AmazonLinuxVirt.HVM),
  PV(software.amazon.awscdk.services.ec2.AmazonLinuxVirt.PV),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxVirt):
        AmazonLinuxVirt = when (cdkObject) {
      software.amazon.awscdk.services.ec2.AmazonLinuxVirt.HVM -> AmazonLinuxVirt.HVM
      software.amazon.awscdk.services.ec2.AmazonLinuxVirt.PV -> AmazonLinuxVirt.PV
    }

    internal fun unwrap(wrapped: AmazonLinuxVirt):
        software.amazon.awscdk.services.ec2.AmazonLinuxVirt = wrapped.cdkObject
  }
}
