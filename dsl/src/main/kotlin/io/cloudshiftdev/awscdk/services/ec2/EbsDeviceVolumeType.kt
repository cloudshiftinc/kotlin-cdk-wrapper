package io.cloudshiftdev.awscdk.services.ec2

public enum class EbsDeviceVolumeType(
  private val cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceVolumeType,
) {
  STANDARD(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.STANDARD),
  IO1(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.IO1),
  IO2(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.IO2),
  GP2(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.GP2),
  GP3(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.GP3),
  ST1(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.ST1),
  SC1(software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.SC1),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EbsDeviceVolumeType):
        EbsDeviceVolumeType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.STANDARD ->
          EbsDeviceVolumeType.STANDARD
      software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.IO1 -> EbsDeviceVolumeType.IO1
      software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.IO2 -> EbsDeviceVolumeType.IO2
      software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.GP2 -> EbsDeviceVolumeType.GP2
      software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.GP3 -> EbsDeviceVolumeType.GP3
      software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.ST1 -> EbsDeviceVolumeType.ST1
      software.amazon.awscdk.services.ec2.EbsDeviceVolumeType.SC1 -> EbsDeviceVolumeType.SC1
    }

    internal fun unwrap(wrapped: EbsDeviceVolumeType):
        software.amazon.awscdk.services.ec2.EbsDeviceVolumeType = wrapped.cdkObject
  }
}
