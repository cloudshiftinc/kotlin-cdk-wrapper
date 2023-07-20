@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
import software.constructs.Construct

@CdkDslMarker
public class CfnClientVpnAuthorizationRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnClientVpnAuthorizationRule.Builder =
      CfnClientVpnAuthorizationRule.Builder.create(scope, id)

  public fun accessGroupId(accessGroupId: String) {
    cdkBuilder.accessGroupId(accessGroupId)
  }

  public fun authorizeAllGroups(authorizeAllGroups: Boolean) {
    cdkBuilder.authorizeAllGroups(authorizeAllGroups)
  }

  public fun authorizeAllGroups(authorizeAllGroups: IResolvable) {
    cdkBuilder.authorizeAllGroups(authorizeAllGroups)
  }

  public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun targetNetworkCidr(targetNetworkCidr: String) {
    cdkBuilder.targetNetworkCidr(targetNetworkCidr)
  }

  public fun build(): CfnClientVpnAuthorizationRule = cdkBuilder.build()
}
