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
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Configuration information for delivery of dataset contents to AWS IoT Events .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * IotEventsDestinationConfigurationProperty iotEventsDestinationConfigurationProperty =
 * IotEventsDestinationConfigurationProperty.builder()
 * .inputName("inputName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-ioteventsdestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDatasetIotEventsDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.IotEventsDestinationConfigurationProperty.Builder =
        CfnDataset.IotEventsDestinationConfigurationProperty.builder()

    /**
     * @param inputName The name of the AWS IoT Events input to which dataset contents are
     *   delivered.
     */
    public fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
    }

    /**
     * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to deliver
     *   dataset contents to an AWS IoT Events input.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDataset.IotEventsDestinationConfigurationProperty = cdkBuilder.build()
}
