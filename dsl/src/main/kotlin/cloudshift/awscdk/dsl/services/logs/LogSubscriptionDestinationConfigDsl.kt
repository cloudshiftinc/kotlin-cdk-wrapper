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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig

/**
 * Properties returned by a Subscription destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.logs.*;
 * Role role;
 * LogSubscriptionDestinationConfig logSubscriptionDestinationConfig =
 * LogSubscriptionDestinationConfig.builder()
 * .arn("arn")
 * // the properties below are optional
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class LogSubscriptionDestinationConfigDsl {
    private val cdkBuilder: LogSubscriptionDestinationConfig.Builder =
        LogSubscriptionDestinationConfig.builder()

    /** @param arn The ARN of the subscription's destination. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /** @param role The role to assume to write log events to the destination. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): LogSubscriptionDestinationConfig = cdkBuilder.build()
}
