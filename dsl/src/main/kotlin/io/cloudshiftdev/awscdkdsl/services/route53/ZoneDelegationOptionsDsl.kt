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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.ZoneDelegationOptions

/**
 * Options available when creating a delegation relationship from one PublicHostedZone to another.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.route53.*;
 * ZoneDelegationOptions zoneDelegationOptions = ZoneDelegationOptions.builder()
 * .comment("comment")
 * .ttl(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class ZoneDelegationOptionsDsl {
    private val cdkBuilder: ZoneDelegationOptions.Builder = ZoneDelegationOptions.builder()

    /** @param comment A comment to add on the DNS record created to incorporate the delegation. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param ttl The TTL (Time To Live) of the DNS delegation record in DNS caches. */
    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): ZoneDelegationOptions = cdkBuilder.build()
}
