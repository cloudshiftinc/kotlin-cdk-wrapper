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

package cloudshift.awscdk.dsl.services.iotthingsgraph

import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import kotlin.Unit

public inline fun CfnFlowTemplate.setDefinition(
    block: CfnFlowTemplateDefinitionDocumentPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFlowTemplateDefinitionDocumentPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}
