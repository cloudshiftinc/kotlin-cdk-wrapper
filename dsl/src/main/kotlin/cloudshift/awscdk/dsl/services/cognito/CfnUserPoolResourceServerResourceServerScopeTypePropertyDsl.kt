@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer

/**
 * A resource server scope.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * ResourceServerScopeTypeProperty resourceServerScopeTypeProperty =
 * ResourceServerScopeTypeProperty.builder()
 * .scopeDescription("scopeDescription")
 * .scopeName("scopeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html)
 */
@CdkDslMarker
public class CfnUserPoolResourceServerResourceServerScopeTypePropertyDsl {
  private val cdkBuilder: CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder =
      CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.builder()

  /**
   * @param scopeDescription A description of the scope. 
   */
  public fun scopeDescription(scopeDescription: String) {
    cdkBuilder.scopeDescription(scopeDescription)
  }

  /**
   * @param scopeName The name of the scope. 
   */
  public fun scopeName(scopeName: String) {
    cdkBuilder.scopeName(scopeName)
  }

  public fun build(): CfnUserPoolResourceServer.ResourceServerScopeTypeProperty = cdkBuilder.build()
}
