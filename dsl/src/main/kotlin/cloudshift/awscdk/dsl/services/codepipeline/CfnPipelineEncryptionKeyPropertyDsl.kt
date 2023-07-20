@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineEncryptionKeyPropertyDsl {
  private val cdkBuilder: CfnPipeline.EncryptionKeyProperty.Builder =
      CfnPipeline.EncryptionKeyProperty.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPipeline.EncryptionKeyProperty = cdkBuilder.build()
}
