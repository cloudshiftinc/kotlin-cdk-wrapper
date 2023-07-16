@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain

@CdkDslMarker
public class CfnDomainDefaultSpaceSettingsPropertyDsl {
  private val cdkBuilder: CfnDomain.DefaultSpaceSettingsProperty.Builder =
      CfnDomain.DefaultSpaceSettingsProperty.builder()

  private val _securityGroups: MutableList<String> = mutableListOf()

  public fun executionRole(executionRole: String) {
    cdkBuilder.executionRole(executionRole)
  }

  public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  public
      fun jupyterServerAppSettings(jupyterServerAppSettings: CfnDomain.JupyterServerAppSettingsProperty) {
    cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
  }

  public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  public
      fun kernelGatewayAppSettings(kernelGatewayAppSettings: CfnDomain.KernelGatewayAppSettingsProperty) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): CfnDomain.DefaultSpaceSettingsProperty {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
