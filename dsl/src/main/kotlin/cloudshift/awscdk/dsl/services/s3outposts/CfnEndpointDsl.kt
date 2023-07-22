@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnEndpoint
import software.constructs.Construct

@CdkDslMarker
public class CfnEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEndpoint.Builder = CfnEndpoint.Builder.create(scope, id)

  /**
   * The container for the type of connectivity used to access the Amazon S3 on Outposts endpoint.
   *
   * To use the Amazon VPC , choose `Private` . To use the endpoint with an on-premises network,
   * choose `CustomerOwnedIp` . If you choose `CustomerOwnedIp` , you must also provide the
   * customer-owned IP address pool (CoIP pool).
   *
   *
   * `Private` is the default access type value.
   *
   *
   * Default: - "Private"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-accesstype)
   * @param accessType The container for the type of connectivity used to access the Amazon S3 on
   * Outposts endpoint. 
   */
  public fun accessType(accessType: String) {
    cdkBuilder.accessType(accessType)
  }

  /**
   * The ID of the customer-owned IPv4 address pool (CoIP pool) for the endpoint.
   *
   * IP addresses are allocated from this pool for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-customerownedipv4pool)
   * @param customerOwnedIpv4Pool The ID of the customer-owned IPv4 address pool (CoIP pool) for the
   * endpoint. 
   */
  public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
    cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
   * @param failedReason 
   */
  public fun failedReason(failedReason: IResolvable) {
    cdkBuilder.failedReason(failedReason)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-failedreason)
   * @param failedReason 
   */
  public fun failedReason(failedReason: CfnEndpoint.FailedReasonProperty) {
    cdkBuilder.failedReason(failedReason)
  }

  /**
   * The ID of the Outpost.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-outpostid)
   * @param outpostId The ID of the Outpost. 
   */
  public fun outpostId(outpostId: String) {
    cdkBuilder.outpostId(outpostId)
  }

  /**
   * The ID of the security group to use with the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-securitygroupid)
   * @param securityGroupId The ID of the security group to use with the endpoint. 
   */
  public fun securityGroupId(securityGroupId: String) {
    cdkBuilder.securityGroupId(securityGroupId)
  }

  /**
   * The ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-endpoint.html#cfn-s3outposts-endpoint-subnetid)
   * @param subnetId The ID of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnEndpoint = cdkBuilder.build()
}
