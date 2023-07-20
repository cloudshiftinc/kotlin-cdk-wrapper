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

package cloudshift.awscdk.dsl.services.iotcoredeviceadvisor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSuiteDefinitionSuiteDefinitionConfigurationPropertyDsl {
    private val cdkBuilder: CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.Builder =
        CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.builder()

    private val _devices: MutableList<Any> = mutableListOf()

    public fun devicePermissionRoleArn(devicePermissionRoleArn: String) {
        cdkBuilder.devicePermissionRoleArn(devicePermissionRoleArn)
    }

    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    public fun intendedForQualification(intendedForQualification: Boolean) {
        cdkBuilder.intendedForQualification(intendedForQualification)
    }

    public fun intendedForQualification(intendedForQualification: IResolvable) {
        cdkBuilder.intendedForQualification(intendedForQualification)
    }

    public fun rootGroup(rootGroup: String) {
        cdkBuilder.rootGroup(rootGroup)
    }

    public fun suiteDefinitionName(suiteDefinitionName: String) {
        cdkBuilder.suiteDefinitionName(suiteDefinitionName)
    }

    public fun build(): CfnSuiteDefinition.SuiteDefinitionConfigurationProperty {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        return cdkBuilder.build()
    }
}
