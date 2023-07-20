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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.stepfunctions.CustomState
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CustomStateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CustomState.Builder = CustomState.Builder.create(scope, id)

    public fun stateJson(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.stateJson(builder.map)
    }

    public fun stateJson(stateJson: Map<String, Any>) {
        cdkBuilder.stateJson(stateJson)
    }

    public fun build(): CustomState = cdkBuilder.build()
}
