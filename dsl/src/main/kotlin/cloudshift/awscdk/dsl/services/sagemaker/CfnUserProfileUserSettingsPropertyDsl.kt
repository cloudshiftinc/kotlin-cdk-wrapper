@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@CdkDslMarker
public class CfnUserProfileUserSettingsPropertyDsl {
  private val cdkBuilder: CfnUserProfile.UserSettingsProperty.Builder =
      CfnUserProfile.UserSettingsProperty.builder()

  private val _securityGroups: MutableList<String> = mutableListOf()

  /**
   * @param executionRole The execution role for the user.
   */
  public fun executionRole(executionRole: String) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * @param jupyterServerAppSettings The Jupyter server's app settings.
   */
  public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  /**
   * @param jupyterServerAppSettings The Jupyter server's app settings.
   */
  public
      fun jupyterServerAppSettings(jupyterServerAppSettings: CfnUserProfile.JupyterServerAppSettingsProperty) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  /**
   * @param kernelGatewayAppSettings The kernel gateway app settings.
   */
  public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  /**
   * @param kernelGatewayAppSettings The kernel gateway app settings.
   */
  public
      fun kernelGatewayAppSettings(kernelGatewayAppSettings: CfnUserProfile.KernelGatewayAppSettingsProperty) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  /**
   * @param rStudioServerProAppSettings A collection of settings that configure user interaction
   * with the `RStudioServerPro` app.
   */
  public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
    cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings)
  }

  /**
   * @param rStudioServerProAppSettings A collection of settings that configure user interaction
   * with the `RStudioServerPro` app.
   */
  public
      fun rStudioServerProAppSettings(rStudioServerProAppSettings: CfnUserProfile.RStudioServerProAppSettingsProperty) {
    cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings)
  }

  /**
   * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
   * Studio uses for communication.
   * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to `PublicInternetOnly`
   * .
   *
   * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` , unless
   * specified as part of the `DefaultUserSettings` for the domain.
   *
   * Amazon SageMaker adds a security group to allow NFS traffic from SageMaker Studio. Therefore,
   * the number of security groups that you can specify is one less than the maximum number shown.
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups for the Amazon Virtual Private Cloud (VPC) that
   * Studio uses for communication.
   * Optional when the `CreateDomain.AppNetworkAccessType` parameter is set to `PublicInternetOnly`
   * .
   *
   * Required when the `CreateDomain.AppNetworkAccessType` parameter is set to `VpcOnly` , unless
   * specified as part of the `DefaultUserSettings` for the domain.
   *
   * Amazon SageMaker adds a security group to allow NFS traffic from SageMaker Studio. Therefore,
   * the number of security groups that you can specify is one less than the maximum number shown.
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param sharingSettings Specifies options for sharing SageMaker Studio notebooks.
   */
  public fun sharingSettings(sharingSettings: IResolvable) {
    cdkBuilder.sharingSettings(sharingSettings)
  }

  /**
   * @param sharingSettings Specifies options for sharing SageMaker Studio notebooks.
   */
  public fun sharingSettings(sharingSettings: CfnUserProfile.SharingSettingsProperty) {
    cdkBuilder.sharingSettings(sharingSettings)
  }

  public fun build(): CfnUserProfile.UserSettingsProperty {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
