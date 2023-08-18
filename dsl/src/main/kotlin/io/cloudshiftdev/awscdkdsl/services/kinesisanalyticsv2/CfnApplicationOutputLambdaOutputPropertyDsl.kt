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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

/**
 * When you configure a SQL-based Kinesis Data Analytics application's output, identifies an Amazon
 * Lambda function as the destination.
 *
 * You provide the function Amazon Resource Name (ARN) of the Lambda function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputLambdaOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.LambdaOutputProperty.Builder =
        CfnApplicationOutput.LambdaOutputProperty.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the destination Lambda function to write
     *   to.
     *
     * To specify an earlier version of the Lambda function than the latest, include the Lambda
     * function version in the Lambda function ARN. For more information about Lambda ARNs, see
     * [Example ARNs: Amazon Lambda](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationOutput.LambdaOutputProperty = cdkBuilder.build()
}
