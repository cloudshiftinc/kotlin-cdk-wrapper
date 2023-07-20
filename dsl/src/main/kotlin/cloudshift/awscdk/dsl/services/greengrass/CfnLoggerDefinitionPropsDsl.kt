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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinition
import software.amazon.awscdk.services.greengrass.CfnLoggerDefinitionProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnLoggerDefinitionPropsDsl {
    private val cdkBuilder: CfnLoggerDefinitionProps.Builder = CfnLoggerDefinitionProps.builder()

    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    public fun initialVersion(initialVersion: CfnLoggerDefinition.LoggerDefinitionVersionProperty) {
        cdkBuilder.initialVersion(initialVersion)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnLoggerDefinitionProps = cdkBuilder.build()
}
