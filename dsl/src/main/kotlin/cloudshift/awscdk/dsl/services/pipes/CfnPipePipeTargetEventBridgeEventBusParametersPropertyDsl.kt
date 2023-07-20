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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipePipeTargetEventBridgeEventBusParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.Builder =
        CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.builder()

    private val _resources: MutableList<String> = mutableListOf()

    public fun detailType(detailType: String) {
        cdkBuilder.detailType(detailType)
    }

    public fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
    }

    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun time(time: String) {
        cdkBuilder.time(time)
    }

    public fun build(): CfnPipe.PipeTargetEventBridgeEventBusParametersProperty {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}
