@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIdentityPoolRoleAttachment.Builder =
      CfnIdentityPoolRoleAttachment.Builder.create(scope, id)

  public fun identityPoolId(identityPoolId: String) {
    cdkBuilder.identityPoolId(identityPoolId)
  }

  public fun roleMappings(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.roleMappings(builder.map)
  }

  public fun roleMappings(roleMappings: Map<String, *>) {
    cdkBuilder.roleMappings(roleMappings)
  }

  public fun roleMappings(roleMappings: IResolvable) {
    cdkBuilder.roleMappings(roleMappings)
  }

  public fun roles(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.roles(builder.map)
  }

  public fun roles(roles: Any) {
    cdkBuilder.roles(roles)
  }

  public fun build(): CfnIdentityPoolRoleAttachment = cdkBuilder.build()
}
