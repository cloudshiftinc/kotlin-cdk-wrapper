@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer

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
