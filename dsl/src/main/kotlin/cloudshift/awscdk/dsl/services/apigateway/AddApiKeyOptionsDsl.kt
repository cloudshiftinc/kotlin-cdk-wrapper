@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.AddApiKeyOptions

@CdkDslMarker
public class AddApiKeyOptionsDsl {
  private val cdkBuilder: AddApiKeyOptions.Builder = AddApiKeyOptions.builder()

  public fun overrideLogicalId(overrideLogicalId: String) {
    cdkBuilder.overrideLogicalId(overrideLogicalId)
  }

  public fun build(): AddApiKeyOptions = cdkBuilder.build()
}
