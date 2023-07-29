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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to invoke a Lambda function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * LambdaActionProperty lambdaActionProperty = LambdaActionProperty.builder()
 * .functionArn("functionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleLambdaActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.LambdaActionProperty.Builder =
        CfnTopicRule.LambdaActionProperty.builder()

    /** @param functionArn The ARN of the Lambda function. */
    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun build(): CfnTopicRule.LambdaActionProperty = cdkBuilder.build()
}
