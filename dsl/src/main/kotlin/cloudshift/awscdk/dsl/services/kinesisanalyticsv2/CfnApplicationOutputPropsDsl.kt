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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutputProps

/**
 * Properties for defining a `CfnApplicationOutput`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CfnApplicationOutputProps cfnApplicationOutputProps = CfnApplicationOutputProps.builder()
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
public class CfnApplicationOutputPropsDsl {
    private val cdkBuilder: CfnApplicationOutputProps.Builder = CfnApplicationOutputProps.builder()

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
    public fun output(output: CfnApplicationOutput.OutputProperty) {
        cdkBuilder.output(output)
    }

    public fun build(): CfnApplicationOutputProps = cdkBuilder.build()
}
