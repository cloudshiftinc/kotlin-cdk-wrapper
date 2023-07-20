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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionTaskDefinitionPlacementConstraintPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.Builder =
        CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty.builder()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTaskDefinition.TaskDefinitionPlacementConstraintProperty =
        cdkBuilder.build()
}
