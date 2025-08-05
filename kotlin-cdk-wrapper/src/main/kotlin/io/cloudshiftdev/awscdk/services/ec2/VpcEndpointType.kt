@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class VpcEndpointType(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointType,
) {
  INTERFACE(software.amazon.awscdk.services.ec2.VpcEndpointType.INTERFACE),
  GATEWAY(software.amazon.awscdk.services.ec2.VpcEndpointType.GATEWAY),
  GATEWAYLOADBALANCER(software.amazon.awscdk.services.ec2.VpcEndpointType.GATEWAYLOADBALANCER),
  SERVICENETWORK(software.amazon.awscdk.services.ec2.VpcEndpointType.SERVICENETWORK),
  RESOURCE(software.amazon.awscdk.services.ec2.VpcEndpointType.RESOURCE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointType):
        VpcEndpointType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.VpcEndpointType.INTERFACE -> VpcEndpointType.INTERFACE
      software.amazon.awscdk.services.ec2.VpcEndpointType.GATEWAY -> VpcEndpointType.GATEWAY
      software.amazon.awscdk.services.ec2.VpcEndpointType.GATEWAYLOADBALANCER ->
          VpcEndpointType.GATEWAYLOADBALANCER
      software.amazon.awscdk.services.ec2.VpcEndpointType.SERVICENETWORK ->
          VpcEndpointType.SERVICENETWORK
      software.amazon.awscdk.services.ec2.VpcEndpointType.RESOURCE -> VpcEndpointType.RESOURCE
    }

    internal fun unwrap(wrapped: VpcEndpointType):
        software.amazon.awscdk.services.ec2.VpcEndpointType = wrapped.cdkObject
  }
}
