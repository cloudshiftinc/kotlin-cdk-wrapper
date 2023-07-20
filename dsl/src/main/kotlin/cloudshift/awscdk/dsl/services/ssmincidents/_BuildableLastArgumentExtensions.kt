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

import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import kotlin.Unit

public inline fun CfnResponsePlan.setIncidentTemplate(
    block: CfnResponsePlanIncidentTemplatePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnResponsePlanIncidentTemplatePropertyDsl()
    builder.apply(block)
    return setIncidentTemplate(builder.build())
}

public inline fun CfnResponsePlan.setChatChannel(
    block: CfnResponsePlanChatChannelPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnResponsePlanChatChannelPropertyDsl()
    builder.apply(block)
    return setChatChannel(builder.build())
}
