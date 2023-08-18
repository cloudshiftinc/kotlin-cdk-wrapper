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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.EmailSettings

/**
 * Email settings for the user pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * EmailSettings emailSettings = EmailSettings.builder()
 * .from("from")
 * .replyTo("replyTo")
 * .build();
 * ```
 */
@CdkDslMarker
public class EmailSettingsDsl {
    private val cdkBuilder: EmailSettings.Builder = EmailSettings.builder()

    /** @param from The 'from' address on the emails received by the user. */
    public fun from(from: String) {
        cdkBuilder.from(from)
    }

    /**
     * @param replyTo The 'replyTo' address on the emails received by the user as defined by IETF
     *   RFC-5322. When set, most email clients recognize to change 'to' line to this address when a
     *   reply is drafted.
     */
    public fun replyTo(replyTo: String) {
        cdkBuilder.replyTo(replyTo)
    }

    public fun build(): EmailSettings = cdkBuilder.build()
}
