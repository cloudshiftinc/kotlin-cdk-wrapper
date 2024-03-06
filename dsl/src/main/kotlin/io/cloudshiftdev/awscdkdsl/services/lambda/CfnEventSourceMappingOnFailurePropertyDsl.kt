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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * A destination for events that failed processing.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * OnFailureProperty onFailureProperty = OnFailureProperty.builder()
 * .destination("destination")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingOnFailurePropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.OnFailureProperty.Builder =
        CfnEventSourceMapping.OnFailureProperty.builder()

    /**
     * @param destination The Amazon Resource Name (ARN) of the destination resource. To retain
     *   records of
     *   [asynchronous invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
     *   , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
     *   EventBridge event bus as the destination.
     *
     * To retain records of failed invocations from
     * [Kinesis and DynamoDB event sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
     * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
     *
     * To retain records of failed invocations from
     * [self-managed Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
     * or
     * [Amazon MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
     * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
     * destination.
     */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun build(): CfnEventSourceMapping.OnFailureProperty = cdkBuilder.build()
}
