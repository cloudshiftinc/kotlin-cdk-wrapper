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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.ActionConfig

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * Object configuration;
 * ActionConfig actionConfig = ActionConfig.builder()
 * .configuration(configuration)
 * .build();
 * ```
 */
@CdkDslMarker
public class ActionConfigDsl {
    private val cdkBuilder: ActionConfig.Builder = ActionConfig.builder()

    /** @param configuration the value to be set. */
    public fun configuration(configuration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(configuration)
        cdkBuilder.configuration(builder.map)
    }

    /** @param configuration the value to be set. */
    public fun configuration(configuration: Any) {
        cdkBuilder.configuration(configuration)
    }

    public fun build(): ActionConfig = cdkBuilder.build()
}
