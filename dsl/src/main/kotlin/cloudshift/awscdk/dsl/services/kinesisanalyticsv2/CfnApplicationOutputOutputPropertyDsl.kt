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

/**
 * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
 * identify an in-application stream and a destination where you want the in-application stream data
 * to be written.
 *
 * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * OutputProperty outputProperty = OutputProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html)
 */
@CdkDslMarker
public class CfnApplicationOutputOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.OutputProperty.Builder =
        CfnApplicationOutput.OutputProperty.builder()

    /**
     * @param destinationSchema Describes the data format when records are written to the
     *   destination.
     */
    public fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    /**
     * @param destinationSchema Describes the data format when records are written to the
     *   destination.
     */
    public fun destinationSchema(
        destinationSchema: CfnApplicationOutput.DestinationSchemaProperty
    ) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    /**
     * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
     *   destination.
     */
    public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    /**
     * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
     *   destination.
     */
    public fun kinesisFirehoseOutput(
        kinesisFirehoseOutput: CfnApplicationOutput.KinesisFirehoseOutputProperty
    ) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    /** @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination. */
    public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    /** @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination. */
    public fun kinesisStreamsOutput(
        kinesisStreamsOutput: CfnApplicationOutput.KinesisStreamsOutputProperty
    ) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    /** @param lambdaOutput Identifies an Amazon Lambda function as the destination. */
    public fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    /** @param lambdaOutput Identifies an Amazon Lambda function as the destination. */
    public fun lambdaOutput(lambdaOutput: CfnApplicationOutput.LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    /** @param name The name of the in-application stream. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnApplicationOutput.OutputProperty = cdkBuilder.build()
}
