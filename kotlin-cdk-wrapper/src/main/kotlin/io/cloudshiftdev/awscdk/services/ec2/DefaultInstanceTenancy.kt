@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class DefaultInstanceTenancy(
  private val cdkObject: software.amazon.awscdk.services.ec2.DefaultInstanceTenancy,
) {
  DEFAULT(software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEFAULT),
  DEDICATED(software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEDICATED),
  HOST(software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.HOST),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.DefaultInstanceTenancy):
        DefaultInstanceTenancy = when (cdkObject) {
      software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEFAULT ->
          DefaultInstanceTenancy.DEFAULT
      software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.DEDICATED ->
          DefaultInstanceTenancy.DEDICATED
      software.amazon.awscdk.services.ec2.DefaultInstanceTenancy.HOST -> DefaultInstanceTenancy.HOST
    }

    internal fun unwrap(wrapped: DefaultInstanceTenancy):
        software.amazon.awscdk.services.ec2.DefaultInstanceTenancy = wrapped.cdkObject
  }
}
