@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnSpace

@CdkDslMarker
public class CfnSpaceCustomImagePropertyDsl {
  private val cdkBuilder: CfnSpace.CustomImageProperty.Builder =
      CfnSpace.CustomImageProperty.builder()

  /**
   * @param appImageConfigName The name of the AppImageConfig. 
   */
  public fun appImageConfigName(appImageConfigName: String) {
    cdkBuilder.appImageConfigName(appImageConfigName)
  }

  /**
   * @param imageName The name of the CustomImage. 
   * Must be unique to your account.
   */
  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  /**
   * @param imageVersionNumber The version number of the CustomImage.
   */
  public fun imageVersionNumber(imageVersionNumber: Number) {
    cdkBuilder.imageVersionNumber(imageVersionNumber)
  }

  public fun build(): CfnSpace.CustomImageProperty = cdkBuilder.build()
}
