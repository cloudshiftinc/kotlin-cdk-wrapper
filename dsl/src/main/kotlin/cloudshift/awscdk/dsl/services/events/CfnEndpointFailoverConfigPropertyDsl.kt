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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEndpoint

@CdkDslMarker
public class CfnEndpointFailoverConfigPropertyDsl {
    private val cdkBuilder: CfnEndpoint.FailoverConfigProperty.Builder =
        CfnEndpoint.FailoverConfigProperty.builder()

    public fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary)
    }

    public fun primary(primary: CfnEndpoint.PrimaryProperty) {
        cdkBuilder.primary(primary)
    }

    public fun secondary(secondary: IResolvable) {
        cdkBuilder.secondary(secondary)
    }

    public fun secondary(secondary: CfnEndpoint.SecondaryProperty) {
        cdkBuilder.secondary(secondary)
    }

    public fun build(): CfnEndpoint.FailoverConfigProperty = cdkBuilder.build()
}
