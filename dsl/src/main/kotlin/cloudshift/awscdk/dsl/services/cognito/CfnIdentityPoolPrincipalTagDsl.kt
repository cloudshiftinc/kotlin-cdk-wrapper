@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag
import software.constructs.Construct

@CdkDslMarker
public class CfnIdentityPoolPrincipalTagDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIdentityPoolPrincipalTag.Builder =
      CfnIdentityPoolPrincipalTag.Builder.create(scope, id)

  public fun identityPoolId(identityPoolId: String) {
    cdkBuilder.identityPoolId(identityPoolId)
  }

  public fun identityProviderName(identityProviderName: String) {
    cdkBuilder.identityProviderName(identityProviderName)
  }

  public fun principalTags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.principalTags(builder.map)
  }

  public fun principalTags(principalTags: Any) {
    cdkBuilder.principalTags(principalTags)
  }

  public fun useDefaults(useDefaults: Boolean) {
    cdkBuilder.useDefaults(useDefaults)
  }

  public fun useDefaults(useDefaults: IResolvable) {
    cdkBuilder.useDefaults(useDefaults)
  }

  public fun build(): CfnIdentityPoolPrincipalTag = cdkBuilder.build()
}
