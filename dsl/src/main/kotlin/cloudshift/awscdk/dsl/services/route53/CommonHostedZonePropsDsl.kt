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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.route53.CommonHostedZoneProps

/**
 * Common properties to create a Route 53 hosted zone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CommonHostedZoneProps commonHostedZoneProps = CommonHostedZoneProps.builder()
 * .zoneName("zoneName")
 * // the properties below are optional
 * .addTrailingDot(false)
 * .comment("comment")
 * .queryLogsLogGroupArn("queryLogsLogGroupArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class CommonHostedZonePropsDsl {
    private val cdkBuilder: CommonHostedZoneProps.Builder = CommonHostedZoneProps.builder()

    /** @param addTrailingDot Whether to add a trailing dot to the zone name. */
    public fun addTrailingDot(addTrailingDot: Boolean) {
        cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /** @param comment Any comments that you want to include about the hosted zone. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     *   Amazon Route 53 to send query logs to.
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
        cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * @param zoneName The name of the domain. For resource record types that include a domain name,
     *   specify a fully qualified domain name.
     */
    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): CommonHostedZoneProps = cdkBuilder.build()
}
