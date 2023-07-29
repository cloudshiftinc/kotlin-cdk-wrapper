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

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnPlacementProps

/**
 * Properties for defining a `CfnPlacement`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot1click.*;
 * Object associatedDevices;
 * Object attributes;
 * CfnPlacementProps cfnPlacementProps = CfnPlacementProps.builder()
 * .projectName("projectName")
 * // the properties below are optional
 * .associatedDevices(associatedDevices)
 * .attributes(attributes)
 * .placementName("placementName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html)
 */
@CdkDslMarker
public class CfnPlacementPropsDsl {
    private val cdkBuilder: CfnPlacementProps.Builder = CfnPlacementProps.builder()

    /**
     * @param associatedDevices The devices to associate with the placement, as defined by a mapping
     *   of zero or more key-value pairs wherein the key is a template name and the value is a
     *   device ID.
     */
    public fun associatedDevices(associatedDevices: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(associatedDevices)
        cdkBuilder.associatedDevices(builder.map)
    }

    /**
     * @param associatedDevices The devices to associate with the placement, as defined by a mapping
     *   of zero or more key-value pairs wherein the key is a template name and the value is a
     *   device ID.
     */
    public fun associatedDevices(associatedDevices: Any) {
        cdkBuilder.associatedDevices(associatedDevices)
    }

    /** @param attributes The user-defined attributes associated with the placement. */
    public fun attributes(attributes: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(attributes)
        cdkBuilder.attributes(builder.map)
    }

    /** @param attributes The user-defined attributes associated with the placement. */
    public fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
    }

    /** @param placementName The name of the placement. */
    public fun placementName(placementName: String) {
        cdkBuilder.placementName(placementName)
    }

    /** @param projectName The name of the project containing the placement. */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun build(): CfnPlacementProps = cdkBuilder.build()
}
