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

package cloudshift.awscdk.dsl.services.iotcoredeviceadvisor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition

/**
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

    /** @param certificateArn the value to be set. */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /** @param thingArn the value to be set. */
    public fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
    }

    public fun build(): CfnSuiteDefinition.DeviceUnderTestProperty = cdkBuilder.build()
}
