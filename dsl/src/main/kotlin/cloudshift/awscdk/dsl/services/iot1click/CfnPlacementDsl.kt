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

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.iot1click.CfnPlacement
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnPlacementDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPlacement.Builder = CfnPlacement.Builder.create(scope, id)

    public fun associatedDevices(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.associatedDevices(builder.map)
    }

    public fun associatedDevices(associatedDevices: Any) {
        cdkBuilder.associatedDevices(associatedDevices)
    }

    public fun attributes(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.attributes(builder.map)
    }

    public fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
    }

    public fun placementName(placementName: String) {
        cdkBuilder.placementName(placementName)
    }

    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun build(): CfnPlacement = cdkBuilder.build()
}
