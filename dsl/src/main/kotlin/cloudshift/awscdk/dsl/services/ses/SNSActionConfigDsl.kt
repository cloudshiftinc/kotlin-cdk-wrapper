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
import software.amazon.awscdk.services.ses.SNSActionConfig

/**
 * SNSAction configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * SNSActionConfig sNSActionConfig = SNSActionConfig.builder()
 * .encoding("encoding")
 * .topicArn("topicArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class SNSActionConfigDsl {
    private val cdkBuilder: SNSActionConfig.Builder = SNSActionConfig.builder()

    /** @param encoding The encoding to use for the email within the Amazon SNS notification. */
    public fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
    }

    /** @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): SNSActionConfig = cdkBuilder.build()
}
