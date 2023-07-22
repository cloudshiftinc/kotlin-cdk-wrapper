@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

@CdkDslMarker
public class CfnContainerRecipeInstanceBlockDeviceMappingPropertyDsl {
  private val cdkBuilder: CfnContainerRecipe.InstanceBlockDeviceMappingProperty.Builder =
      CfnContainerRecipe.InstanceBlockDeviceMappingProperty.builder()

  /**
   * @param deviceName The device to which these mappings apply.
   */
  public fun deviceName(deviceName: String) {
    cdkBuilder.deviceName(deviceName)
  }

  /**
   * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
   */
  public fun ebs(ebs: IResolvable) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * @param ebs Use to manage Amazon EBS-specific configuration for this mapping.
   */
  public fun ebs(ebs: CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * @param noDevice Use to remove a mapping from the base image.
   */
  public fun noDevice(noDevice: String) {
    cdkBuilder.noDevice(noDevice)
  }

  /**
   * @param virtualName Use to manage instance ephemeral devices.
   */
  public fun virtualName(virtualName: String) {
    cdkBuilder.virtualName(virtualName)
  }

  public fun build(): CfnContainerRecipe.InstanceBlockDeviceMappingProperty = cdkBuilder.build()
}
