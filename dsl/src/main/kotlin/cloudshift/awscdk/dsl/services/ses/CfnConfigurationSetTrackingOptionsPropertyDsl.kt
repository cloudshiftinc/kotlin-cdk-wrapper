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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetTrackingOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.TrackingOptionsProperty.Builder =
        CfnConfigurationSet.TrackingOptionsProperty.builder()

    public fun customRedirectDomain(customRedirectDomain: String) {
        cdkBuilder.customRedirectDomain(customRedirectDomain)
    }

    public fun build(): CfnConfigurationSet.TrackingOptionsProperty = cdkBuilder.build()
}
