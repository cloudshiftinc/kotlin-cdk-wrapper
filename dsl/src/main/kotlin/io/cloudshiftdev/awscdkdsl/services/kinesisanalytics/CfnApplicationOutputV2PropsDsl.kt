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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2Props

/**
 * Properties for defining a `CfnApplicationOutput`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CfnApplicationOutputV2Props cfnApplicationOutputV2Props = CfnApplicationOutputV2Props.builder()
 * .applicationName("applicationName")
 * .output(OutputProperty.builder()
 * .destinationSchema(DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build())
 * // the properties below are optional
 * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .lambdaOutput(LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputV2PropsDsl {
    private val cdkBuilder: CfnApplicationOutputV2Props.Builder =
        CfnApplicationOutputV2Props.builder()

    /** @param applicationName The name of the application. */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     *   configuration, in which you identify an in-application stream and a destination where you
     *   want the in-application stream data to be written. The destination can be a Kinesis data
     *   stream or a Kinesis Data Firehose delivery stream.
     */
    public fun output(output: IResolvable) {
        cdkBuilder.output(output)
    }

    /**
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     *   configuration, in which you identify an in-application stream and a destination where you
     *   want the in-application stream data to be written. The destination can be a Kinesis data
     *   stream or a Kinesis Data Firehose delivery stream.
     */
    public fun output(output: CfnApplicationOutputV2.OutputProperty) {
        cdkBuilder.output(output)
    }

    public fun build(): CfnApplicationOutputV2Props = cdkBuilder.build()
}
