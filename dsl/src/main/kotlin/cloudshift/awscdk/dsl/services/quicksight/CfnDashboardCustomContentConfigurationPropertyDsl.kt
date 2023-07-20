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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardCustomContentConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomContentConfigurationProperty.Builder =
        CfnDashboard.CustomContentConfigurationProperty.builder()

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun contentUrl(contentUrl: String) {
        cdkBuilder.contentUrl(contentUrl)
    }

    public fun imageScaling(imageScaling: String) {
        cdkBuilder.imageScaling(imageScaling)
    }

    public fun build(): CfnDashboard.CustomContentConfigurationProperty = cdkBuilder.build()
}
