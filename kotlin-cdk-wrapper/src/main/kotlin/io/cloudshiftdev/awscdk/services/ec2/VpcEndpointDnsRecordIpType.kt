@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class VpcEndpointDnsRecordIpType(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType,
) {
  IPV4(software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.IPV4),
  IPV6(software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.IPV6),
  DUALSTACK(software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.DUALSTACK),
  SERVICE_DEFINED(software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.SERVICE_DEFINED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType):
        VpcEndpointDnsRecordIpType = when (cdkObject) {
      software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.IPV4 ->
          VpcEndpointDnsRecordIpType.IPV4
      software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.IPV6 ->
          VpcEndpointDnsRecordIpType.IPV6
      software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.DUALSTACK ->
          VpcEndpointDnsRecordIpType.DUALSTACK
      software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType.SERVICE_DEFINED ->
          VpcEndpointDnsRecordIpType.SERVICE_DEFINED
    }

    internal fun unwrap(wrapped: VpcEndpointDnsRecordIpType):
        software.amazon.awscdk.services.ec2.VpcEndpointDnsRecordIpType = wrapped.cdkObject
  }
}
