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
import software.amazon.awscdk.services.ses.WorkmailActionConfig

/**
 * WorkmailAction configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * WorkmailActionConfig workmailActionConfig = WorkmailActionConfig.builder()
 * .organizationArn("organizationArn")
 * // the properties below are optional
 * .topicArn("topicArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class WorkmailActionConfigDsl {
    private val cdkBuilder: WorkmailActionConfig.Builder = WorkmailActionConfig.builder()

    /**
     * @param organizationArn The Amazon Resource Name (ARN) of the Amazon WorkMail organization.
     */
    public fun organizationArn(organizationArn: String) {
        cdkBuilder.organizationArn(organizationArn)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     *   WorkMail action is called.
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): WorkmailActionConfig = cdkBuilder.build()
}
