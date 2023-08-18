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

    /** @param devicePermissionRoleArn The device permission role arn of the test suite. */
    public fun devicePermissionRoleArn(devicePermissionRoleArn: String) {
        cdkBuilder.devicePermissionRoleArn(devicePermissionRoleArn)
    }

    /** @param devices The devices being tested in the test suite. */
    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    /** @param devices The devices being tested in the test suite. */
    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    /** @param devices The devices being tested in the test suite. */
    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    /**
     * @param intendedForQualification Whether the tests are intended for qualification in a suite.
     */
    public fun intendedForQualification(intendedForQualification: Boolean) {
        cdkBuilder.intendedForQualification(intendedForQualification)
    }

    /**
     * @param intendedForQualification Whether the tests are intended for qualification in a suite.
     */
    public fun intendedForQualification(intendedForQualification: IResolvable) {
        cdkBuilder.intendedForQualification(intendedForQualification)
    }

    /** @param rootGroup The root group of the test suite. */
    public fun rootGroup(rootGroup: String) {
        cdkBuilder.rootGroup(rootGroup)
    }

    /** @param suiteDefinitionName The Name of the suite definition. */
    public fun suiteDefinitionName(suiteDefinitionName: String) {
        cdkBuilder.suiteDefinitionName(suiteDefinitionName)
    }

    public fun build(): CfnSuiteDefinition.SuiteDefinitionConfigurationProperty {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        return cdkBuilder.build()
    }
}
