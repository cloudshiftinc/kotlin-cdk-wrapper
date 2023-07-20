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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnEndpoint
import kotlin.String

@CdkDslMarker
public class CfnEndpointPrimaryPropertyDsl {
    private val cdkBuilder: CfnEndpoint.PrimaryProperty.Builder =
        CfnEndpoint.PrimaryProperty.builder()

    public fun healthCheck(healthCheck: String) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun build(): CfnEndpoint.PrimaryProperty = cdkBuilder.build()
}
