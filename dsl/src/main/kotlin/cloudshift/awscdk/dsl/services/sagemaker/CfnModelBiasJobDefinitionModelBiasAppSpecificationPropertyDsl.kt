@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@CdkDslMarker
public class CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl {
  private val cdkBuilder: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder =
      CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.builder()

  public fun configUri(configUri: String) {
    cdkBuilder.configUri(configUri)
  }

  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  public fun build(): CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty =
      cdkBuilder.build()
}
