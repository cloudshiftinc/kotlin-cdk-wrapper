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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.ProcessorConfig
import software.amazon.awscdk.services.stepfunctions.ProcessorMode
import software.amazon.awscdk.services.stepfunctions.ProcessorType

/**
 * Specifies the configuration for the processor Map state.
 *
 * Example:
 * ```
 * Map map = Map.Builder.create(this, "Map State")
 * .maxConcurrency(1)
 * .itemsPath(JsonPath.stringAt("$.inputForMap"))
 * .itemSelector(Map.of(
 * "item", JsonPath.stringAt("$.Map.Item.Value")))
 * .resultPath("$.mapOutput")
 * .build();
 * map.itemProcessor(new Pass(this, "Pass State"), ProcessorConfig.builder()
 * .mode(ProcessorMode.DISTRIBUTED)
 * .executionType(ProcessorType.STANDARD)
 * .build());
 * ```
 */
@CdkDslMarker
public class ProcessorConfigDsl {
    private val cdkBuilder: ProcessorConfig.Builder = ProcessorConfig.builder()

    /**
     * @param executionType Specifies the execution type for the Map workflow. You must provide this
     *   field if you specified `DISTRIBUTED` for the `mode` sub-field.
     */
    public fun executionType(executionType: ProcessorType) {
        cdkBuilder.executionType(executionType)
    }

    /** @param mode Specifies the execution mode for the Map workflow. */
    public fun mode(mode: ProcessorMode) {
        cdkBuilder.mode(mode)
    }

    public fun build(): ProcessorConfig = cdkBuilder.build()
}
