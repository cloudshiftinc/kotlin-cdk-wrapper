@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

public enum class LoadBalancerType(
  private val cdkObject: software.amazon.awscdk.cloud_assembly_schema.LoadBalancerType,
) {
  NETWORK(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerType.NETWORK),
  APPLICATION(software.amazon.awscdk.cloud_assembly_schema.LoadBalancerType.APPLICATION),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.LoadBalancerType):
        LoadBalancerType = when (cdkObject) {
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerType.NETWORK ->
          LoadBalancerType.NETWORK
      software.amazon.awscdk.cloud_assembly_schema.LoadBalancerType.APPLICATION ->
          LoadBalancerType.APPLICATION
    }

    internal fun unwrap(wrapped: LoadBalancerType):
        software.amazon.awscdk.cloud_assembly_schema.LoadBalancerType = wrapped.cdkObject
  }
}
