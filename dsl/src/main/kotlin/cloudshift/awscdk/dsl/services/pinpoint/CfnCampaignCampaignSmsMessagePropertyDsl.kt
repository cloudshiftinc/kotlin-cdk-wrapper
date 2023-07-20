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
public class CfnCampaignCampaignSmsMessagePropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignSmsMessageProperty.Builder =
        CfnCampaign.CampaignSmsMessageProperty.builder()

    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    public fun messageType(messageType: String) {
        cdkBuilder.messageType(messageType)
    }

    public fun originationNumber(originationNumber: String) {
        cdkBuilder.originationNumber(originationNumber)
    }

    public fun senderId(senderId: String) {
        cdkBuilder.senderId(senderId)
    }

    public fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
    }

    public fun build(): CfnCampaign.CampaignSmsMessageProperty = cdkBuilder.build()
}
