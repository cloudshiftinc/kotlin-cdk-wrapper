@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class InstanceSize(
  private val cdkObject: software.amazon.awscdk.services.ec2.InstanceSize,
) {
  NANO(software.amazon.awscdk.services.ec2.InstanceSize.NANO),
  MICRO(software.amazon.awscdk.services.ec2.InstanceSize.MICRO),
  SMALL(software.amazon.awscdk.services.ec2.InstanceSize.SMALL),
  MEDIUM(software.amazon.awscdk.services.ec2.InstanceSize.MEDIUM),
  LARGE(software.amazon.awscdk.services.ec2.InstanceSize.LARGE),
  XLARGE(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE),
  XLARGE2(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE2),
  XLARGE3(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE3),
  XLARGE4(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE4),
  XLARGE6(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE6),
  XLARGE8(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE8),
  XLARGE9(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE9),
  XLARGE10(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE10),
  XLARGE12(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE12),
  XLARGE16(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE16),
  XLARGE18(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE18),
  XLARGE24(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE24),
  XLARGE32(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE32),
  XLARGE48(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE48),
  XLARGE56(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE56),
  XLARGE96(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE96),
  XLARGE112(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE112),
  XLARGE224(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE224),
  XLARGE480(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE480),
  METAL(software.amazon.awscdk.services.ec2.InstanceSize.METAL),
  XLARGE16METAL(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE16METAL),
  XLARGE24METAL(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE24METAL),
  XLARGE32METAL(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE32METAL),
  XLARGE48METAL(software.amazon.awscdk.services.ec2.InstanceSize.XLARGE48METAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceSize): InstanceSize =
        when (cdkObject) {
      software.amazon.awscdk.services.ec2.InstanceSize.NANO -> InstanceSize.NANO
      software.amazon.awscdk.services.ec2.InstanceSize.MICRO -> InstanceSize.MICRO
      software.amazon.awscdk.services.ec2.InstanceSize.SMALL -> InstanceSize.SMALL
      software.amazon.awscdk.services.ec2.InstanceSize.MEDIUM -> InstanceSize.MEDIUM
      software.amazon.awscdk.services.ec2.InstanceSize.LARGE -> InstanceSize.LARGE
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE -> InstanceSize.XLARGE
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE2 -> InstanceSize.XLARGE2
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE3 -> InstanceSize.XLARGE3
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE4 -> InstanceSize.XLARGE4
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE6 -> InstanceSize.XLARGE6
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE8 -> InstanceSize.XLARGE8
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE9 -> InstanceSize.XLARGE9
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE10 -> InstanceSize.XLARGE10
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE12 -> InstanceSize.XLARGE12
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE16 -> InstanceSize.XLARGE16
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE18 -> InstanceSize.XLARGE18
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE24 -> InstanceSize.XLARGE24
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE32 -> InstanceSize.XLARGE32
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE48 -> InstanceSize.XLARGE48
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE56 -> InstanceSize.XLARGE56
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE96 -> InstanceSize.XLARGE96
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE112 -> InstanceSize.XLARGE112
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE224 -> InstanceSize.XLARGE224
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE480 -> InstanceSize.XLARGE480
      software.amazon.awscdk.services.ec2.InstanceSize.METAL -> InstanceSize.METAL
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE16METAL -> InstanceSize.XLARGE16METAL
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE24METAL -> InstanceSize.XLARGE24METAL
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE32METAL -> InstanceSize.XLARGE32METAL
      software.amazon.awscdk.services.ec2.InstanceSize.XLARGE48METAL -> InstanceSize.XLARGE48METAL
    }

    internal fun unwrap(wrapped: InstanceSize): software.amazon.awscdk.services.ec2.InstanceSize =
        wrapped.cdkObject
  }
}
