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

  public fun executionRole(executionRole: String) {
    cdkBuilder.executionRole(executionRole)
  }

  public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  public
      fun jupyterServerAppSettings(jupyterServerAppSettings: CfnUserProfile.JupyterServerAppSettingsProperty) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  public
      fun kernelGatewayAppSettings(kernelGatewayAppSettings: CfnUserProfile.KernelGatewayAppSettingsProperty) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
    cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings)
  }

  public
      fun rStudioServerProAppSettings(rStudioServerProAppSettings: CfnUserProfile.RStudioServerProAppSettingsProperty) {
    cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun sharingSettings(sharingSettings: IResolvable) {
    cdkBuilder.sharingSettings(sharingSettings)
  }

  public fun sharingSettings(sharingSettings: CfnUserProfile.SharingSettingsProperty) {
    cdkBuilder.sharingSettings(sharingSettings)
  }

  public fun build(): CfnUserProfile.UserSettingsProperty {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
