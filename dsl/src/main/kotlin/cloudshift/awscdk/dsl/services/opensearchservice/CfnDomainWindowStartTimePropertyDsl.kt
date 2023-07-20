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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import kotlin.Number

@CdkDslMarker
public class CfnDomainWindowStartTimePropertyDsl {
    private val cdkBuilder: CfnDomain.WindowStartTimeProperty.Builder =
        CfnDomain.WindowStartTimeProperty.builder()

    public fun hours(hours: Number) {
        cdkBuilder.hours(hours)
    }

    public fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
    }

    public fun build(): CfnDomain.WindowStartTimeProperty = cdkBuilder.build()
}
