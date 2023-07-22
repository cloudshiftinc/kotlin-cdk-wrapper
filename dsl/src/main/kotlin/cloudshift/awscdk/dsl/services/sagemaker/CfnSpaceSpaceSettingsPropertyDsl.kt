@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

@CdkDslMarker
public class CfnSpaceSpaceSettingsPropertyDsl {
  private val cdkBuilder: CfnSpace.SpaceSettingsProperty.Builder =
      CfnSpace.SpaceSettingsProperty.builder()

  /**
   * @param jupyterServerAppSettings The JupyterServer app settings.
   */
  public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  /**
   * @param jupyterServerAppSettings The JupyterServer app settings.
   */
  public
      fun jupyterServerAppSettings(jupyterServerAppSettings: CfnSpace.JupyterServerAppSettingsProperty) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  /**
   * @param kernelGatewayAppSettings The KernelGateway app settings.
   */
  public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  /**
   * @param kernelGatewayAppSettings The KernelGateway app settings.
   */
  public
      fun kernelGatewayAppSettings(kernelGatewayAppSettings: CfnSpace.KernelGatewayAppSettingsProperty) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  public fun build(): CfnSpace.SpaceSettingsProperty = cdkBuilder.build()
}
