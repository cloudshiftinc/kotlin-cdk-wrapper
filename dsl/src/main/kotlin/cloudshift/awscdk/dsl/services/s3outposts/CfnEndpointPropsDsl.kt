@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnEndpoint
import software.amazon.awscdk.services.s3outposts.CfnEndpointProps

@CdkDslMarker
public class CfnEndpointPropsDsl {
  private val cdkBuilder: CfnEndpointProps.Builder = CfnEndpointProps.builder()

  /**
   * @param accessType The container for the type of connectivity used to access the Amazon S3 on
   * Outposts endpoint.
   * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
   * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
   * customer-owned IP address pool (CoIP pool).
   *
   *
   * `Private` is the default access type value.
   */
  public fun accessType(accessType: String) {
    cdkBuilder.accessType(accessType)
  }

  /**
   * @param customerOwnedIpv4Pool The ID of the customer-owned IPv4 address pool (CoIP pool) for the
   * endpoint.
   * IP addresses are allocated from this pool for the endpoint.
   */
  public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
    cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
  }

  /**
   * @param failedReason the value to be set.
   */
  public fun failedReason(failedReason: IResolvable) {
    cdkBuilder.failedReason(failedReason)
  }

  /**
   * @param failedReason the value to be set.
   */
  public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty) {
    cdkBuilder.failedReason(failedReason)
  }

  /**
   * @param outpostId The ID of the Outpost. 
   */
  public fun outpostId(outpostId: String) {
    cdkBuilder.outpostId(outpostId)
  }

  /**
   * @param securityGroupId The ID of the security group to use with the endpoint. 
   */
  public fun securityGroupId(securityGroupId: String) {
    cdkBuilder.securityGroupId(securityGroupId)
  }

  /**
   * @param subnetId The ID of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnEndpointProps = cdkBuilder.build()
}
