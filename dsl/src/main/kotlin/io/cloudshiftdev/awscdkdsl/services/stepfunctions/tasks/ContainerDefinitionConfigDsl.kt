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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionConfig

/**
 * Configuration options for the ContainerDefinition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * Object parameters;
 * ContainerDefinitionConfig containerDefinitionConfig = ContainerDefinitionConfig.builder()
 * .parameters(Map.of(
 * "parametersKey", parameters))
 * .build();
 * ```
 */
@CdkDslMarker
public class ContainerDefinitionConfigDsl {
    private val cdkBuilder: ContainerDefinitionConfig.Builder = ContainerDefinitionConfig.builder()

    /** @param parameters Additional parameters to pass to the base task. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters Additional parameters to pass to the base task. */
    public fun parameters(parameters: Map<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): ContainerDefinitionConfig = cdkBuilder.build()
}
