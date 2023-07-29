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

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.ses.actions.LambdaInvocationType
import software.amazon.awscdk.services.ses.actions.LambdaProps
import software.amazon.awscdk.services.sns.ITopic

/**
 * Construction properties for a Lambda action.
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
 * LambdaProps lambdaProps = LambdaProps.builder()
 * .function(function_)
 * // the properties below are optional
 * .invocationType(LambdaInvocationType.EVENT)
 * .topic(topic)
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaPropsDsl {
    private val cdkBuilder: LambdaProps.Builder = LambdaProps.builder()

    /** @param function The Lambda function to invoke. */
    public fun function(function: IFunction) {
        cdkBuilder.function(function)
    }

    /** @param invocationType The invocation type of the Lambda function. */
    public fun invocationType(invocationType: LambdaInvocationType) {
        cdkBuilder.invocationType(invocationType)
    }

    /** @param topic The SNS topic to notify when the Lambda action is taken. */
    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): LambdaProps = cdkBuilder.build()
}
