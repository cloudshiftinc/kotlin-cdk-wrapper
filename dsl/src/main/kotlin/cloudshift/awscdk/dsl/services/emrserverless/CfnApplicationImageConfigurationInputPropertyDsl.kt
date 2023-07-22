@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationImageConfigurationInputPropertyDsl {
  private val cdkBuilder: CfnApplication.ImageConfigurationInputProperty.Builder =
      CfnApplication.ImageConfigurationInputProperty.builder()

  /**
   * @param imageUri The URI of an image in the Amazon ECR registry.
   * This field is required when you create a new application. If you leave this field blank in an
   * update, Amazon EMR will remove the image configuration.
   */
  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  public fun build(): CfnApplication.ImageConfigurationInputProperty = cdkBuilder.build()
}
