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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.codepipeline.ActionConfig
import kotlin.Any
import kotlin.Unit

@CdkDslMarker
public class ActionConfigDsl {
    private val cdkBuilder: ActionConfig.Builder = ActionConfig.builder()

    public fun configuration(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.configuration(builder.map)
    }

    public fun configuration(configuration: Any) {
        cdkBuilder.configuration(configuration)
    }

    public fun build(): ActionConfig = cdkBuilder.build()
}
