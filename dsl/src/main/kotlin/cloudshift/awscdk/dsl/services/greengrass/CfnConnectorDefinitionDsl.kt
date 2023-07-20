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
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnConnectorDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectorDefinition.Builder =
        CfnConnectorDefinition.Builder.create(scope, id)

    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    public fun initialVersion(initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty) {
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

    public fun build(): CfnConnectorDefinition = cdkBuilder.build()
}
