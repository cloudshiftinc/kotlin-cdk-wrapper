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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import kotlin.String

@CdkDslMarker
public class CfnResponsePlanNotificationTargetItemPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.NotificationTargetItemProperty.Builder =
        CfnResponsePlan.NotificationTargetItemProperty.builder()

    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnResponsePlan.NotificationTargetItemProperty = cdkBuilder.build()
}
