@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDomain
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDomainUserSettingsPropertyDsl {
    private val cdkBuilder: CfnDomain.UserSettingsProperty.Builder =
        CfnDomain.UserSettingsProperty.builder()

    private val _securityGroups: MutableList<String> = mutableListOf()

    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun jupyterServerAppSettings(jupyterServerAppSettings: IResolvable) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    public fun jupyterServerAppSettings(jupyterServerAppSettings: CfnDomain.JupyterServerAppSettingsProperty) {
        cdkBuilder.jupyterServerAppSettings(jupyterServerAppSettings)
    }

    public fun kernelGatewayAppSettings(kernelGatewayAppSettings: IResolvable) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    public fun kernelGatewayAppSettings(kernelGatewayAppSettings: CfnDomain.KernelGatewayAppSettingsProperty) {
        cdkBuilder.kernelGatewayAppSettings(kernelGatewayAppSettings)
    }

    public fun rSessionAppSettings(rSessionAppSettings: IResolvable) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings)
    }

    public fun rSessionAppSettings(rSessionAppSettings: CfnDomain.RSessionAppSettingsProperty) {
        cdkBuilder.rSessionAppSettings(rSessionAppSettings)
    }

    public fun rStudioServerProAppSettings(rStudioServerProAppSettings: IResolvable) {
        cdkBuilder.rStudioServerProAppSettings(rStudioServerProAppSettings)
    }

    public fun rStudioServerProAppSettings(rStudioServerProAppSettings: CfnDomain.RStudioServerProAppSettingsProperty) {
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

    public fun sharingSettings(sharingSettings: CfnDomain.SharingSettingsProperty) {
        cdkBuilder.sharingSettings(sharingSettings)
    }

    public fun build(): CfnDomain.UserSettingsProperty {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
