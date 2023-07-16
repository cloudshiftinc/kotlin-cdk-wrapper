@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineActionTypeIdPropertyDsl {
  private val cdkBuilder: CfnPipeline.ActionTypeIdProperty.Builder =
      CfnPipeline.ActionTypeIdProperty.builder()

  public fun category(category: String) {
    cdkBuilder.category(category)
  }

  public fun owner(owner: String) {
    cdkBuilder.owner(owner)
  }

  public fun provider(provider: String) {
    cdkBuilder.provider(provider)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnPipeline.ActionTypeIdProperty = cdkBuilder.build()
}
