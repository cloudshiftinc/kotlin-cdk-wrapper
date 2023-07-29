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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * An object that contains the Amazon Resource Name (ARN) of the
 * [AWS Lambda](https://docs.aws.amazon.com/lambda/) function that is used to preprocess records in
 * the stream, and the ARN of the IAM role that is used to access the AWS Lambda function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * InputLambdaProcessorProperty inputLambdaProcessorProperty =
 * InputLambdaProcessorProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
 */
@CdkDslMarker
public class CfnApplicationInputLambdaProcessorPropertyDsl {
    private val cdkBuilder: CfnApplication.InputLambdaProcessorProperty.Builder =
        CfnApplication.InputLambdaProcessorProperty.builder()

    /**
     * @param resourceArn The ARN of the [AWS Lambda](https://docs.aws.amazon.com/lambda/) function
     *   that operates on records in the stream.
     *
     * To specify an earlier version of the Lambda function than the latest, include the Lambda
     * function version in the Lambda function ARN. For more information about Lambda ARNs, see
     * [Example ARNs: AWS Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /** @param roleArn The ARN of the IAM role that is used to access the AWS Lambda function. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnApplication.InputLambdaProcessorProperty = cdkBuilder.build()
}
