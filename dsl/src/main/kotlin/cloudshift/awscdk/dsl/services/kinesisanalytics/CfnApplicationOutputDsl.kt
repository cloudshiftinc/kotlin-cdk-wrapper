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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import software.constructs.Construct

/**
 * Adds an external destination to your Amazon Kinesis Analytics application.
 *
 * If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your
 * application to an external destination (such as an Amazon Kinesis stream, an Amazon Kinesis
 * Firehose delivery stream, or an Amazon Lambda function), you add the relevant configuration to
 * your application using this operation. You can configure one or more outputs for your
 * application. Each output configuration maps an in-application stream and an external destination.
 *
 * You can use one of the output configurations to deliver data from your in-application error
 * stream to an external destination so that you can analyze the errors. For more information, see
 * [Understanding Application Output (Destination)](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html)
 * .
 *
 * Any configuration update, including adding a streaming source using this operation, results in a
 * new version of the application. You can use the `DescribeApplication` operation to find the
 * current application version.
 *
 * For the limits on the number of application inputs and outputs you can configure, see
 * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
 *
 * This operation requires permissions to perform the `kinesisanalytics:AddApplicationOutput`
 * action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * CfnApplicationOutput cfnApplicationOutput = CfnApplicationOutput.Builder.create(this,
 * "MyCfnApplicationOutput")
 * .applicationName("applicationName")
 * .output(OutputProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplicationOutput.Builder =
        CfnApplicationOutput.Builder.create(scope, id)

    /**
     * Name of the application to which you want to add the output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
     *
     * @param applicationName Name of the application to which you want to add the output
     *   configuration.
     */
    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS
     * Lambda function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     *
     * @param output An array of objects, each describing one output configuration.
     */
    public fun output(output: IResolvable) {
        cdkBuilder.output(output)
    }

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS
     * Lambda function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     *
     * @param output An array of objects, each describing one output configuration.
     */
    public fun output(output: CfnApplicationOutput.OutputProperty) {
        cdkBuilder.output(output)
    }

    public fun build(): CfnApplicationOutput = cdkBuilder.build()
}
