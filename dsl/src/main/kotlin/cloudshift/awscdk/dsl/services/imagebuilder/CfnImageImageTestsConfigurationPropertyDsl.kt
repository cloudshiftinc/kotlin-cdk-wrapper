@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImage

@CdkDslMarker
public class CfnImageImageTestsConfigurationPropertyDsl {
  private val cdkBuilder: CfnImage.ImageTestsConfigurationProperty.Builder =
      CfnImage.ImageTestsConfigurationProperty.builder()

  public fun imageTestsEnabled(imageTestsEnabled: Boolean) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  public fun imageTestsEnabled(imageTestsEnabled: IResolvable) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  public fun timeoutMinutes(timeoutMinutes: Number) {
    cdkBuilder.timeoutMinutes(timeoutMinutes)
  }

  public fun build(): CfnImage.ImageTestsConfigurationProperty = cdkBuilder.build()
}
