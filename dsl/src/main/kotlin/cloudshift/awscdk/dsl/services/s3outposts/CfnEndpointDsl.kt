@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnEndpoint
import software.constructs.Construct

@CdkDslMarker
public class CfnEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEndpoint.Builder = CfnEndpoint.Builder.create(scope, id)

  public fun accessType(accessType: String) {
    cdkBuilder.accessType(accessType)
  }

  public fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String) {
    cdkBuilder.customerOwnedIpv4Pool(customerOwnedIpv4Pool)
  }

  public fun outpostId(outpostId: String) {
    cdkBuilder.outpostId(outpostId)
  }

  public fun securityGroupId(securityGroupId: String) {
    cdkBuilder.securityGroupId(securityGroupId)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnEndpoint = cdkBuilder.build()
}
