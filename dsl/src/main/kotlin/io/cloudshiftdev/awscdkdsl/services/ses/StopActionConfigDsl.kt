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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.StopActionConfig

/**
 * StopAction configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * StopActionConfig stopActionConfig = StopActionConfig.builder()
 * .scope("scope")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class StopActionConfigDsl {
    private val cdkBuilder: StopActionConfig.Builder = StopActionConfig.builder()

    /** @param scope The scope of the StopAction. The only acceptable value is RuleSet. */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     *   stop action is taken.
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): StopActionConfig = cdkBuilder.build()
}
