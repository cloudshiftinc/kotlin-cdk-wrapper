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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.String

@CdkDslMarker
public class CfnCampaignInAppMessageHeaderConfigPropertyDsl {
    private val cdkBuilder: CfnCampaign.InAppMessageHeaderConfigProperty.Builder =
        CfnCampaign.InAppMessageHeaderConfigProperty.builder()

    public fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
    }

    public fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
    }

    public fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnCampaign.InAppMessageHeaderConfigProperty = cdkBuilder.build()
}
