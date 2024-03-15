@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

public enum class InstanceType(
  private val cdkObject: software.amazon.awscdk.services.rds.InstanceType,
) {
  PROVISIONED(software.amazon.awscdk.services.rds.InstanceType.PROVISIONED),
  SERVERLESS_V2(software.amazon.awscdk.services.rds.InstanceType.SERVERLESS_V2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceType): InstanceType =
        when (cdkObject) {
      software.amazon.awscdk.services.rds.InstanceType.PROVISIONED -> InstanceType.PROVISIONED
      software.amazon.awscdk.services.rds.InstanceType.SERVERLESS_V2 -> InstanceType.SERVERLESS_V2
    }

    internal fun unwrap(wrapped: InstanceType): software.amazon.awscdk.services.rds.InstanceType =
        wrapped.cdkObject
  }
}
