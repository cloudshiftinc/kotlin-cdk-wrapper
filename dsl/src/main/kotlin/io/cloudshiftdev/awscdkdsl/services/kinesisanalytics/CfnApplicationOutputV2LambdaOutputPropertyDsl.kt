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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

/**
 * When you configure a SQL-based Managed Service for Apache Flink application's output, identifies
 * an Amazon Lambda function as the destination.
 *
 * You provide the function Amazon Resource Name (ARN) of the Lambda function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html)
 */
@CdkDslMarker
public class CfnApplicationOutputV2LambdaOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutputV2.LambdaOutputProperty.Builder =
        CfnApplicationOutputV2.LambdaOutputProperty.builder()

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

    public fun build(): CfnApplicationOutputV2.LambdaOutputProperty = cdkBuilder.build()
}
