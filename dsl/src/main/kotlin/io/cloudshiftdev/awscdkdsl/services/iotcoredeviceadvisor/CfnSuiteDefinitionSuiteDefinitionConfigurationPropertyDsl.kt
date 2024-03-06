@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotcoredeviceadvisor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition

/**
 * Gets the suite definition configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotcoredeviceadvisor.*;
 * SuiteDefinitionConfigurationProperty suiteDefinitionConfigurationProperty =
 * SuiteDefinitionConfigurationProperty.builder()
 * .devicePermissionRoleArn("devicePermissionRoleArn")
 * .rootGroup("rootGroup")
 * // the properties below are optional
 * .devices(List.of(DeviceUnderTestProperty.builder()
 * .certificateArn("certificateArn")
 * .thingArn("thingArn")
 * .build()))
 * .intendedForQualification(false)
 * .suiteDefinitionName("suiteDefinitionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-suitedefinitionconfiguration.html)
 */
@CdkDslMarker
public class CfnSuiteDefinitionSuiteDefinitionConfigurationPropertyDsl {
    private val cdkBuilder: CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.Builder =
        CfnSuiteDefinition.SuiteDefinitionConfigurationProperty.builder()

    private val _devices: MutableList<Any> = mutableListOf()

    /**
     * @param devicePermissionRoleArn Gets the device permission ARN. This is a required parameter.
     */
    public fun devicePermissionRoleArn(devicePermissionRoleArn: String) {
        cdkBuilder.devicePermissionRoleArn(devicePermissionRoleArn)
    }

    /** @param devices Gets the devices configured. */
    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    /** @param devices Gets the devices configured. */
    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    /** @param devices Gets the devices configured. */
    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    /** @param intendedForQualification Gets the tests intended for qualification in a suite. */
    public fun intendedForQualification(intendedForQualification: Boolean) {
        cdkBuilder.intendedForQualification(intendedForQualification)
    }

    /** @param intendedForQualification Gets the tests intended for qualification in a suite. */
    public fun intendedForQualification(intendedForQualification: IResolvable) {
        cdkBuilder.intendedForQualification(intendedForQualification)
    }

    /**
     * @param rootGroup Gets the test suite root group. This is a required parameter. For updating
     *   or creating the latest qualification suite, if `intendedForQualification` is set to true,
     *   `rootGroup` can be an empty string. If `intendedForQualification` is false, `rootGroup`
     *   cannot be an empty string. If `rootGroup` is empty, and `intendedForQualification` is set
     *   to true, all the qualification tests are included, and the configuration is default.
     *
     * For a qualification suite, the minimum length is 0, and the maximum is 2048. For a
     * non-qualification suite, the minimum length is 1, and the maximum is 2048.
     */
    public fun rootGroup(rootGroup: String) {
        cdkBuilder.rootGroup(rootGroup)
    }

    /** @param suiteDefinitionName Gets the suite definition name. This is a required parameter. */
    public fun suiteDefinitionName(suiteDefinitionName: String) {
        cdkBuilder.suiteDefinitionName(suiteDefinitionName)
    }

    public fun build(): CfnSuiteDefinition.SuiteDefinitionConfigurationProperty {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        return cdkBuilder.build()
    }
}
