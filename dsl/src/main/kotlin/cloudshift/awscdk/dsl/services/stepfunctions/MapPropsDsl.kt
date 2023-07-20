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
import software.amazon.awscdk.services.stepfunctions.MapProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class MapPropsDsl {
    private val cdkBuilder: MapProps.Builder = MapProps.builder()

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

    public fun parameters(parameters: Map<String, Any>) {
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

    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    public fun build(): MapProps = cdkBuilder.build()
}
