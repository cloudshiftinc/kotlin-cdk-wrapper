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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import software.amazon.awscdk.services.customerprofiles.CfnDomain
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/** Mathematical expression and a list of attribute items specified in that expression. */
public inline fun CfnCalculatedAttributeDefinition.setAttributeDetails(
    block: CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl()
    builder.apply(block)
    return setAttributeDetails(builder.build())
}

/** The conditions including range, object count, and threshold for the calculated attribute. */
public inline fun CfnCalculatedAttributeDefinition.setConditions(
    block: CfnCalculatedAttributeDefinitionConditionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCalculatedAttributeDefinitionConditionsPropertyDsl()
    builder.apply(block)
    return setConditions(builder.build())
}

/** The process of matching duplicate profiles. */
public inline fun CfnDomain.setMatching(block: CfnDomainMatchingPropertyDsl.() -> Unit = {}) {
    val builder = CfnDomainMatchingPropertyDsl()
    builder.apply(block)
    return setMatching(builder.build())
}

/** The process of matching duplicate profiles using Rule-Based matching. */
public inline fun CfnDomain.setRuleBasedMatching(
    block: CfnDomainRuleBasedMatchingPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainRuleBasedMatchingPropertyDsl()
    builder.apply(block)
    return setRuleBasedMatching(builder.build())
}

/** The configuration that controls how Customer Profiles retrieves data from the source. */
public inline fun CfnIntegration.setFlowDefinition(
    block: CfnIntegrationFlowDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnIntegrationFlowDefinitionPropertyDsl()
    builder.apply(block)
    return setFlowDefinition(builder.build())
}
