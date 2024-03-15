@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class SubnetType(
  private val cdkObject: software.amazon.awscdk.services.ec2.SubnetType,
) {
  PRIVATE_ISOLATED(software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_ISOLATED),
  PRIVATE_WITH_EGRESS(software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_WITH_EGRESS),
  PRIVATE_WITH_NAT(software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_WITH_NAT),
  PUBLIC(software.amazon.awscdk.services.ec2.SubnetType.PUBLIC),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetType): SubnetType = when
        (cdkObject) {
      software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_ISOLATED -> SubnetType.PRIVATE_ISOLATED
      software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_WITH_EGRESS ->
          SubnetType.PRIVATE_WITH_EGRESS
      software.amazon.awscdk.services.ec2.SubnetType.PRIVATE_WITH_NAT -> SubnetType.PRIVATE_WITH_NAT
      software.amazon.awscdk.services.ec2.SubnetType.PUBLIC -> SubnetType.PUBLIC
    }

    internal fun unwrap(wrapped: SubnetType): software.amazon.awscdk.services.ec2.SubnetType =
        wrapped.cdkObject
  }
}
