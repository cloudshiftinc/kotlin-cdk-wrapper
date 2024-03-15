@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

public enum class LoadBalancerType(
  private val cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerType,
) {
  NETWORK(software.amazon.awscdk.cloudassembly.schema.LoadBalancerType.NETWORK),
  APPLICATION(software.amazon.awscdk.cloudassembly.schema.LoadBalancerType.APPLICATION),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.LoadBalancerType):
        LoadBalancerType = when (cdkObject) {
      software.amazon.awscdk.cloudassembly.schema.LoadBalancerType.NETWORK ->
          LoadBalancerType.NETWORK
      software.amazon.awscdk.cloudassembly.schema.LoadBalancerType.APPLICATION ->
          LoadBalancerType.APPLICATION
    }

    internal fun unwrap(wrapped: LoadBalancerType):
        software.amazon.awscdk.cloudassembly.schema.LoadBalancerType = wrapped.cdkObject
  }
}
