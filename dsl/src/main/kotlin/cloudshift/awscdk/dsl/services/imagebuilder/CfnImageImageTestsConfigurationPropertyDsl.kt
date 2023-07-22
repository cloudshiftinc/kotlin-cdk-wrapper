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

  /**
   * @param imageTestsEnabled Determines if tests should run after building the image.
   * Image Builder defaults to enable tests to run following the image build, before image
   * distribution.
   */
  public fun imageTestsEnabled(imageTestsEnabled: Boolean) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  /**
   * @param imageTestsEnabled Determines if tests should run after building the image.
   * Image Builder defaults to enable tests to run following the image build, before image
   * distribution.
   */
  public fun imageTestsEnabled(imageTestsEnabled: IResolvable) {
    cdkBuilder.imageTestsEnabled(imageTestsEnabled)
  }

  /**
   * @param timeoutMinutes The maximum time in minutes that tests are permitted to run.
   *
   * The timeoutMinutes attribute is not currently active. This value is ignored.
   */
  public fun timeoutMinutes(timeoutMinutes: Number) {
    cdkBuilder.timeoutMinutes(timeoutMinutes)
  }

  public fun build(): CfnImage.ImageTestsConfigurationProperty = cdkBuilder.build()
}
