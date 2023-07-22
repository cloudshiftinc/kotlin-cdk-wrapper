@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object customStatements;
 * AuthProperty authProperty = AuthProperty.builder()
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizer("authorizer")
 * .resourcePolicy(AuthResourcePolicyProperty.builder()
 * .awsAccountBlacklist(List.of("awsAccountBlacklist"))
 * .awsAccountWhitelist(List.of("awsAccountWhitelist"))
 * .customStatements(List.of(customStatements))
 * .intrinsicVpcBlacklist(List.of("intrinsicVpcBlacklist"))
 * .intrinsicVpceBlacklist(List.of("intrinsicVpceBlacklist"))
 * .intrinsicVpceWhitelist(List.of("intrinsicVpceWhitelist"))
 * .intrinsicVpcWhitelist(List.of("intrinsicVpcWhitelist"))
 * .ipRangeBlacklist(List.of("ipRangeBlacklist"))
 * .ipRangeWhitelist(List.of("ipRangeWhitelist"))
 * .sourceVpcBlacklist(List.of("sourceVpcBlacklist"))
 * .sourceVpcWhitelist(List.of("sourceVpcWhitelist"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-auth.html)
 */
@CdkDslMarker
public class CfnFunctionAuthPropertyDsl {
  private val cdkBuilder: CfnFunction.AuthProperty.Builder = CfnFunction.AuthProperty.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  /**
   * @param apiKeyRequired the value to be set.
   */
  public fun apiKeyRequired(apiKeyRequired: Boolean) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  /**
   * @param apiKeyRequired the value to be set.
   */
  public fun apiKeyRequired(apiKeyRequired: IResolvable) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  /**
   * @param authorizationScopes the value to be set.
   */
  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

  /**
   * @param authorizationScopes the value to be set.
   */
  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

  /**
   * @param authorizer the value to be set.
   */
  public fun authorizer(authorizer: String) {
    cdkBuilder.authorizer(authorizer)
  }

  /**
   * @param resourcePolicy the value to be set.
   */
  public fun resourcePolicy(resourcePolicy: IResolvable) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  /**
   * @param resourcePolicy the value to be set.
   */
  public fun resourcePolicy(resourcePolicy: CfnFunction.AuthResourcePolicyProperty) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  public fun build(): CfnFunction.AuthProperty {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    return cdkBuilder.build()
  }
}
