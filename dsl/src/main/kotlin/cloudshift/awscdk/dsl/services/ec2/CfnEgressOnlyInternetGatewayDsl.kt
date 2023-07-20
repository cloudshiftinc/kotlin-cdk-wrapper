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

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnEgressOnlyInternetGateway = cdkBuilder.build()
}
