@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceImageRepositoryPropertyDsl {
  private val cdkBuilder: CfnService.ImageRepositoryProperty.Builder =
      CfnService.ImageRepositoryProperty.builder()

  public fun imageConfiguration(imageConfiguration: IResolvable) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public fun imageConfiguration(imageConfiguration: CfnService.ImageConfigurationProperty) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  public fun imageIdentifier(imageIdentifier: String) {
    cdkBuilder.imageIdentifier(imageIdentifier)
  }

  public fun imageRepositoryType(imageRepositoryType: String) {
    cdkBuilder.imageRepositoryType(imageRepositoryType)
  }

  public fun build(): CfnService.ImageRepositoryProperty = cdkBuilder.build()
}
