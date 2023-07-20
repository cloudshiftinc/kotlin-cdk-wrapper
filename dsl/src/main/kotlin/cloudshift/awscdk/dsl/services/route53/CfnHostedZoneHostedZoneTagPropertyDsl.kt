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
import software.amazon.awscdk.services.route53.CfnHostedZone
import kotlin.String

@CdkDslMarker
public class CfnHostedZoneHostedZoneTagPropertyDsl {
    private val cdkBuilder: CfnHostedZone.HostedZoneTagProperty.Builder =
        CfnHostedZone.HostedZoneTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnHostedZone.HostedZoneTagProperty = cdkBuilder.build()
}
