@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint(
  private val cdkObject:
      software.amazon.awscdk.services.ec2.VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint,
) {
  ALL_RESOLVERS(software.amazon.awscdk.services.ec2.VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint.ALL_RESOLVERS),
  ONLY_INBOUND_RESOLVER(software.amazon.awscdk.services.ec2.VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint.ONLY_INBOUND_RESOLVER),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint):
        VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint = when (cdkObject) {
      software.amazon.awscdk.services.ec2.VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint.ALL_RESOLVERS ->
          VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint.ALL_RESOLVERS
      software.amazon.awscdk.services.ec2.VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint.ONLY_INBOUND_RESOLVER ->
          VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint.ONLY_INBOUND_RESOLVER
    }

    internal fun unwrap(wrapped: VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint):
        software.amazon.awscdk.services.ec2.VpcEndpointPrivateDnsOnlyForInboundResolverEndpoint =
        wrapped.cdkObject
  }
}
