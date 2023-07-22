@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps

@CdkDslMarker
public class CfnIdentityPoolPrincipalTagPropsDsl {
  private val cdkBuilder: CfnIdentityPoolPrincipalTagProps.Builder =
      CfnIdentityPoolPrincipalTagProps.builder()

  /**
   * @param identityPoolId The identity pool that you want to associate with this principal tag map.
   * 
   */
  public fun identityPoolId(identityPoolId: String) {
    cdkBuilder.identityPoolId(identityPoolId)
  }

  /**
   * @param identityProviderName The identity pool identity provider (IdP) that you want to
   * associate with this principal tag map. 
   */
  public fun identityProviderName(identityProviderName: String) {
    cdkBuilder.identityProviderName(identityProviderName)
  }

  /**
   * @param principalTags A JSON-formatted list of user claims and the principal tags that you want
   * to associate with them.
   * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
   * of the user's claim.
   */
  public fun principalTags(principalTags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(principalTags)
    cdkBuilder.principalTags(builder.map)
  }

  /**
   * @param principalTags A JSON-formatted list of user claims and the principal tags that you want
   * to associate with them.
   * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
   * of the user's claim.
   */
  public fun principalTags(principalTags: Any) {
    cdkBuilder.principalTags(principalTags)
  }

  /**
   * @param useDefaults Use a default set of mappings between claims and tags for this provider,
   * instead of a custom map.
   */
  public fun useDefaults(useDefaults: Boolean) {
    cdkBuilder.useDefaults(useDefaults)
  }

  /**
   * @param useDefaults Use a default set of mappings between claims and tags for this provider,
   * instead of a custom map.
   */
  public fun useDefaults(useDefaults: IResolvable) {
    cdkBuilder.useDefaults(useDefaults)
  }

  public fun build(): CfnIdentityPoolPrincipalTagProps = cdkBuilder.build()
}
