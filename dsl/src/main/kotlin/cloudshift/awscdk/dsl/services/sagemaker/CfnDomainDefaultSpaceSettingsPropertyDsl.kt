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

  /**
   * @param executionRole The ARN of the execution role for the space. 
   */
  public fun executionRole(executionRole: String) {
    cdkBuilder.executionRole(executionRole)
  }

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
      fun jupyterServerAppSettings(jupyterServerAppSettings: CfnDomain.JupyterServerAppSettingsProperty) {
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
      fun kernelGatewayAppSettings(kernelGatewayAppSettings: CfnDomain.KernelGatewayAppSettingsProperty) {
    cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
  }

  /**
   * @param securityGroups The security group IDs for the Amazon Virtual Private Cloud that the
   * space uses for communication.
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security group IDs for the Amazon Virtual Private Cloud that the
   * space uses for communication.
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): CfnDomain.DefaultSpaceSettingsProperty {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
