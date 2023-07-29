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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.LambdaActionConfig

/**
 * LambdaAction configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * LambdaActionConfig lambdaActionConfig = LambdaActionConfig.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .invocationType("invocationType")
 * .topicArn("topicArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaActionConfigDsl {
    private val cdkBuilder: LambdaActionConfig.Builder = LambdaActionConfig.builder()

    /** @param functionArn The Amazon Resource Name (ARN) of the AWS Lambda function. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    /** @param invocationType The invocation type of the AWS Lambda function. */
    public fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     *   Lambda action is executed.
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): LambdaActionConfig = cdkBuilder.build()
}
