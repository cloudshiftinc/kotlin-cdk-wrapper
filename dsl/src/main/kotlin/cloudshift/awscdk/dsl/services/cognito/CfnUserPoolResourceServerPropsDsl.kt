@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps

/**
 * Properties for defining a `CfnUserPoolResourceServer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolResourceServerProps cfnUserPoolResourceServerProps =
 * CfnUserPoolResourceServerProps.builder()
 * .identifier("identifier")
 * .name("name")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .scopes(List.of(ResourceServerScopeTypeProperty.builder()
 * .scopeDescription("scopeDescription")
 * .scopeName("scopeName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html)
 */
@CdkDslMarker
public class CfnUserPoolResourceServerPropsDsl {
  private val cdkBuilder: CfnUserPoolResourceServerProps.Builder =
      CfnUserPoolResourceServerProps.builder()

  private val _scopes: MutableList<Any> = mutableListOf()

  /**
   * @param identifier A unique resource server identifier for the resource server. 
   * This could be an HTTPS endpoint where the resource server is located. For example:
   * `https://my-weather-api.example.com` .
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  /**
   * @param name A friendly name for the resource server. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param scopes A list of scopes.
   * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
   */
  public fun scopes(vararg scopes: Any) {
    _scopes.addAll(listOf(*scopes))
  }

  /**
   * @param scopes A list of scopes.
   * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
   */
  public fun scopes(scopes: Collection<Any>) {
    _scopes.addAll(scopes)
  }

  /**
   * @param scopes A list of scopes.
   * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
   */
  public fun scopes(scopes: IResolvable) {
    cdkBuilder.scopes(scopes)
  }

  /**
   * @param userPoolId The user pool ID for the user pool. 
   */
  public fun userPoolId(userPoolId: String) {
    cdkBuilder.userPoolId(userPoolId)
  }

  public fun build(): CfnUserPoolResourceServerProps {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
