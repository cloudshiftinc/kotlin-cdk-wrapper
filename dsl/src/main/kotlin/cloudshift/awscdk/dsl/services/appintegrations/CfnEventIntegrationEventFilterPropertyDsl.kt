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

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration
import kotlin.String

@CdkDslMarker
public class CfnEventIntegrationEventFilterPropertyDsl {
    private val cdkBuilder: CfnEventIntegration.EventFilterProperty.Builder =
        CfnEventIntegration.EventFilterProperty.builder()

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnEventIntegration.EventFilterProperty = cdkBuilder.build()
}
