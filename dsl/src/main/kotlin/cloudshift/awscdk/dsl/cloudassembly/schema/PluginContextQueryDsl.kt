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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.PluginContextQuery
import kotlin.String

@CdkDslMarker
public class PluginContextQueryDsl {
    private val cdkBuilder: PluginContextQuery.Builder = PluginContextQuery.builder()

    public fun pluginName(pluginName: String) {
        cdkBuilder.pluginName(pluginName)
    }

    public fun build(): PluginContextQuery = cdkBuilder.build()
}
