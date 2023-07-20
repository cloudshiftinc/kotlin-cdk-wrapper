@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.ZoneDelegationOptions
import kotlin.String

@CdkDslMarker
public class ZoneDelegationOptionsDsl {
    private val cdkBuilder: ZoneDelegationOptions.Builder = ZoneDelegationOptions.builder()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): ZoneDelegationOptions = cdkBuilder.build()
}
