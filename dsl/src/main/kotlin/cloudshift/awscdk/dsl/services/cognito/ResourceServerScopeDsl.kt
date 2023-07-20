@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.ResourceServerScope

@CdkDslMarker
public class ResourceServerScopeDsl {
  private val cdkBuilder: ResourceServerScope.Builder = ResourceServerScope.Builder.create()

  public fun scopeDescription(scopeDescription: String) {
    cdkBuilder.scopeDescription(scopeDescription)
  }

  public fun scopeName(scopeName: String) {
    cdkBuilder.scopeName(scopeName)
  }

  public fun build(): ResourceServerScope = cdkBuilder.build()
}
