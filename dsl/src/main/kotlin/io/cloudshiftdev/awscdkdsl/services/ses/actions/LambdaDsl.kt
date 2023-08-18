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

package io.cloudshiftdev.awscdkdsl.services.ses.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.ses.actions.Lambda
import software.amazon.awscdk.services.ses.actions.LambdaInvocationType
import software.amazon.awscdk.services.sns.ITopic

/**
 * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * import software.amazon.awscdk.services.ses.actions.*;
 * import software.amazon.awscdk.services.sns.*;
 * Function function_;
 * Topic topic;
 * Lambda lambda = Lambda.Builder.create()
 * .function(function_)
 * // the properties below are optional
 * .invocationType(LambdaInvocationType.EVENT)
 * .topic(topic)
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaDsl {
    private val cdkBuilder: Lambda.Builder = Lambda.Builder.create()

    /**
     * The Lambda function to invoke.
     *
     * @param function The Lambda function to invoke.
     */
    public fun function(function: IFunction) {
        cdkBuilder.function(function)
    }

    /**
     * The invocation type of the Lambda function.
     *
     * Default: Event
     *
     * @param invocationType The invocation type of the Lambda function.
     */
    public fun invocationType(invocationType: LambdaInvocationType) {
        cdkBuilder.invocationType(invocationType)
    }

    /**
     * The SNS topic to notify when the Lambda action is taken.
     *
     * Default: no notification
     *
     * @param topic The SNS topic to notify when the Lambda action is taken.
     */
    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): Lambda = cdkBuilder.build()
}
