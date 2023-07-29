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

package cloudshift.awscdk.dsl.services.iot1click

import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnProject

/** An object describing the project's placement specifications. */
public inline fun CfnProject.setPlacementTemplate(
    block: CfnProjectPlacementTemplatePropertyDsl.() -> Unit = {}
) {
    val builder = CfnProjectPlacementTemplatePropertyDsl()
    builder.apply(block)
    return setPlacementTemplate(builder.build())
}
