@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
import software.constructs.Construct

@CdkDslMarker
public class CfnEgressOnlyInternetGatewayDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEgressOnlyInternetGateway.Builder =
      CfnEgressOnlyInternetGateway.Builder.create(scope, id)

  /**
   * The ID of the VPC for which to create the egress-only internet gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
   * @param vpcId The ID of the VPC for which to create the egress-only internet gateway. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnEgressOnlyInternetGateway = cdkBuilder.build()
}
