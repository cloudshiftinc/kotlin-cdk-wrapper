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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

/**
 * Describes application output configuration in which you identify an in-application stream and a
 * destination where you want the in-application stream data to be written.
 *
 * The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
 *
 * For limits on how many destinations an application can write and other limitations, see
 * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * OutputProperty outputProperty = OutputProperty.builder()
 * .destinationSchema(DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build())
 * // the properties below are optional
 * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .lambdaOutput(LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html)
 */
@CdkDslMarker
public class CfnApplicationOutputOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.OutputProperty.Builder =
        CfnApplicationOutput.OutputProperty.builder()

    /**
     * @param destinationSchema Describes the data format when records are written to the
     *   destination.
     *
     * For more information, see
     * [Configuring Application Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html)
     * .
     */
    public fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    /**
     * @param destinationSchema Describes the data format when records are written to the
     *   destination.
     *
     * For more information, see
     * [Configuring Application Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html)
     * .
     */
    public fun destinationSchema(
        destinationSchema: CfnApplicationOutput.DestinationSchemaProperty
    ) {
        cdkBuilder.destinationSchema(destinationSchema)
    }

    /**
     * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
     *   destination.
     */
    public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    /**
     * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
     *   destination.
     */
    public fun kinesisFirehoseOutput(
        kinesisFirehoseOutput: CfnApplicationOutput.KinesisFirehoseOutputProperty
    ) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput)
    }

    /** @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination. */
    public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    /** @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination. */
    public fun kinesisStreamsOutput(
        kinesisStreamsOutput: CfnApplicationOutput.KinesisStreamsOutputProperty
    ) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput)
    }

    /** @param lambdaOutput Identifies an AWS Lambda function as the destination. */
    public fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    /** @param lambdaOutput Identifies an AWS Lambda function as the destination. */
    public fun lambdaOutput(lambdaOutput: CfnApplicationOutput.LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput)
    }

    /** @param name Name of the in-application stream. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnApplicationOutput.OutputProperty = cdkBuilder.build()
}
