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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * LambdaConfigurationProperty lambdaConfigurationProperty = LambdaConfigurationProperty.builder()
 * .event("event")
 * .function("function")
 * // the properties below are optional
 * .filter(NotificationFilterProperty.builder()
 * .s3Key(S3KeyFilterProperty.builder()
 * .rules(List.of(FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketLambdaConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.LambdaConfigurationProperty.Builder =
        CfnBucket.LambdaConfigurationProperty.builder()

    /**
     * @param event The Amazon S3 bucket event for which to invoke the AWS Lambda function. For more
     *   information, see
     *   [Supported Event Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun event(event: String) {
        cdkBuilder.event(event)
    }

    /**
     * @param filter The filtering rules that determine which objects invoke the AWS Lambda
     *   function. For example, you can create a filter so that only image files with a `.jpg`
     *   extension invoke the function when they are added to the Amazon S3 bucket.
     */
    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param filter The filtering rules that determine which objects invoke the AWS Lambda
     *   function. For example, you can create a filter so that only image files with a `.jpg`
     *   extension invoke the function when they are added to the Amazon S3 bucket.
     */
    public fun filter(filter: CfnBucket.NotificationFilterProperty) {
        cdkBuilder.filter(filter)
    }

    /**
     * @param function The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
     *   invokes when the specified event type occurs.
     */
    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    public fun build(): CfnBucket.LambdaConfigurationProperty = cdkBuilder.build()
}
