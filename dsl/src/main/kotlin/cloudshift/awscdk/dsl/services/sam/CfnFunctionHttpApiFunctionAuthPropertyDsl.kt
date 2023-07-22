@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * HttpApiFunctionAuthProperty httpApiFunctionAuthProperty = HttpApiFunctionAuthProperty.builder()
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizer("authorizer")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-httpapifunctionauth.html)
 */
@CdkDslMarker
public class CfnFunctionHttpApiFunctionAuthPropertyDsl {
  private val cdkBuilder: CfnFunction.HttpApiFunctionAuthProperty.Builder =
      CfnFunction.HttpApiFunctionAuthProperty.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

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

  public fun build(): CfnFunction.HttpApiFunctionAuthProperty {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    return cdkBuilder.build()
  }
}
