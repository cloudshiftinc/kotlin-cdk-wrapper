@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineBlockerDeclarationPropertyDsl {
  private val cdkBuilder: CfnPipeline.BlockerDeclarationProperty.Builder =
      CfnPipeline.BlockerDeclarationProperty.builder()

  /**
   * @param name Reserved for future use. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type Reserved for future use. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPipeline.BlockerDeclarationProperty = cdkBuilder.build()
}
