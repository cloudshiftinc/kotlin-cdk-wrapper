@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ssmincidents

import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/** The AWS Chatbot chat channel used for collaboration during an incident. */
public inline fun CfnResponsePlan.setChatChannel(
    block: CfnResponsePlanChatChannelPropertyDsl.() -> Unit = {}
) {
    val builder = CfnResponsePlanChatChannelPropertyDsl()
    builder.apply(block)
    return setChatChannel(builder.build())
}

/** Details used to create an incident when using this response plan. */
public inline fun CfnResponsePlan.setIncidentTemplate(
    block: CfnResponsePlanIncidentTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnResponsePlanIncidentTemplatePropertyDsl()
    builder.apply(block)
    return setIncidentTemplate(builder.build())
}
