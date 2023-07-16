@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardContainerPropertyDsl {
  private val cdkBuilder: CfnModelCard.ContainerProperty.Builder =
      CfnModelCard.ContainerProperty.builder()

  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  public fun modelDataUrl(modelDataUrl: String) {
    cdkBuilder.modelDataUrl(modelDataUrl)
  }

  public fun nearestModelName(nearestModelName: String) {
    cdkBuilder.nearestModelName(nearestModelName)
  }

  public fun build(): CfnModelCard.ContainerProperty = cdkBuilder.build()
}
