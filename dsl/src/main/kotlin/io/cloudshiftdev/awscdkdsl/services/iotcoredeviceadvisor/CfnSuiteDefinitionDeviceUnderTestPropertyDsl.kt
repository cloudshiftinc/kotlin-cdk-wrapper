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
import kotlin.String
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition

/**
 * Information of a test device.
 *
 * A thing ARN, certificate ARN or device role ARN is required.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotcoredeviceadvisor.*;
 * DeviceUnderTestProperty deviceUnderTestProperty = DeviceUnderTestProperty.builder()
 * .certificateArn("certificateArn")
 * .thingArn("thingArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotcoredeviceadvisor-suitedefinition-deviceundertest.html)
 */
@CdkDslMarker
public class CfnSuiteDefinitionDeviceUnderTestPropertyDsl {
    private val cdkBuilder: CfnSuiteDefinition.DeviceUnderTestProperty.Builder =
        CfnSuiteDefinition.DeviceUnderTestProperty.builder()

    /** @param certificateArn Lists device's certificate ARN. */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /** @param thingArn Lists device's thing ARN. */
    public fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
    }

    public fun build(): CfnSuiteDefinition.DeviceUnderTestProperty = cdkBuilder.build()
}
