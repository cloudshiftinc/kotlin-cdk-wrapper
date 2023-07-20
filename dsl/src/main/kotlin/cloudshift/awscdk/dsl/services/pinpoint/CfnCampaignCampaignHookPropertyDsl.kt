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
public class CfnCampaignCampaignHookPropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignHookProperty.Builder =
        CfnCampaign.CampaignHookProperty.builder()

    public fun lambdaFunctionName(lambdaFunctionName: String) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun webUrl(webUrl: String) {
        cdkBuilder.webUrl(webUrl)
    }

    public fun build(): CfnCampaign.CampaignHookProperty = cdkBuilder.build()
}
