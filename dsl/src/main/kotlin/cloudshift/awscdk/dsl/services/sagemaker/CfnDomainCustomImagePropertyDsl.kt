@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDomain

@CdkDslMarker
public class CfnDomainCustomImagePropertyDsl {
  private val cdkBuilder: CfnDomain.CustomImageProperty.Builder =
      CfnDomain.CustomImageProperty.builder()

  public fun appImageConfigName(appImageConfigName: String) {
    cdkBuilder.appImageConfigName(appImageConfigName)
  }

  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  public fun imageVersionNumber(imageVersionNumber: Number) {
    cdkBuilder.imageVersionNumber(imageVersionNumber)
  }

  public fun build(): CfnDomain.CustomImageProperty = cdkBuilder.build()
}
