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
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map as CollectionsMap
import software.amazon.awscdk.services.stepfunctions.Map as StepfunctionsMap

@CdkDslMarker
public class MapDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: StepfunctionsMap.Builder = StepfunctionsMap.Builder.create(scope, id)

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    public fun itemsPath(itemsPath: String) {
        cdkBuilder.itemsPath(itemsPath)
    }

    public fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: CollectionsMap<String, Any>) {
        cdkBuilder.parameters(parameters)
    }

    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    public fun resultSelector(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.resultSelector(builder.map)
    }

    public fun resultSelector(resultSelector: CollectionsMap<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    public fun build(): StepfunctionsMap = cdkBuilder.build()
}
