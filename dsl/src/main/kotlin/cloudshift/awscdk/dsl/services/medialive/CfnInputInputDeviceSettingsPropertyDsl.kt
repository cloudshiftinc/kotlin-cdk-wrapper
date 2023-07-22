@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnInput

/**
 * Settings that apply only if the input is an Elemental Link input.
 *
 * The parent of this entity is Input.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputDeviceSettingsProperty inputDeviceSettingsProperty = InputDeviceSettingsProperty.builder()
 * .id("id")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicesettings.html)
 */
@CdkDslMarker
public class CfnInputInputDeviceSettingsPropertyDsl {
  private val cdkBuilder: CfnInput.InputDeviceSettingsProperty.Builder =
      CfnInput.InputDeviceSettingsProperty.builder()

  /**
   * @param id The unique ID for the device.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnInput.InputDeviceSettingsProperty = cdkBuilder.build()
}
