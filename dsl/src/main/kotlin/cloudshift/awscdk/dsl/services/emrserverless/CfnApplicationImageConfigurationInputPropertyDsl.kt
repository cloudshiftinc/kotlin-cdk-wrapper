@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationImageConfigurationInputPropertyDsl {
  private val cdkBuilder: CfnApplication.ImageConfigurationInputProperty.Builder =
      CfnApplication.ImageConfigurationInputProperty.builder()

  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  public fun build(): CfnApplication.ImageConfigurationInputProperty = cdkBuilder.build()
}
