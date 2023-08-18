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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

/**
 * An activity that adds data from the AWS IoT device registry to your message.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * DeviceRegistryEnrichProperty deviceRegistryEnrichProperty =
 * DeviceRegistryEnrichProperty.builder()
 * .attribute("attribute")
 * .name("name")
 * .roleArn("roleArn")
 * .thingName("thingName")
 * // the properties below are optional
 * .next("next")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-deviceregistryenrich.html)
 */
@CdkDslMarker
public class CfnPipelineDeviceRegistryEnrichPropertyDsl {
    private val cdkBuilder: CfnPipeline.DeviceRegistryEnrichProperty.Builder =
        CfnPipeline.DeviceRegistryEnrichProperty.builder()

    /** @param attribute The name of the attribute that is added to the message. */
    public fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
    }

    /** @param name The name of the 'deviceRegistryEnrich' activity. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param next The next activity in the pipeline. */
    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    /**
     * @param roleArn The ARN of the role that allows access to the device's registry information.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param thingName The name of the IoT device whose registry information is added to the
     *   message.
     */
    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnPipeline.DeviceRegistryEnrichProperty = cdkBuilder.build()
}
