@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.ResourceServerScope

@CdkDslMarker
public class ResourceServerScopeDsl {
  private val cdkBuilder: ResourceServerScope.Builder = ResourceServerScope.Builder.create()

  /**
   * A description of the scope.
   *
   * @param scopeDescription A description of the scope. 
   */
  public fun scopeDescription(scopeDescription: String) {
    cdkBuilder.scopeDescription(scopeDescription)
  }

  /**
   * The name of the scope.
   *
   * @param scopeName The name of the scope. 
   */
  public fun scopeName(scopeName: String) {
    cdkBuilder.scopeName(scopeName)
  }

  public fun build(): ResourceServerScope = cdkBuilder.build()
}
