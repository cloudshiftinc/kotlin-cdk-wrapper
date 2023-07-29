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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

/**
 * A general abstraction of a signal.
 *
 * A node can be specified as an actuator, attribute, branch, or sensor.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * NodeProperty nodeProperty = NodeProperty.builder()
 * .actuator(ActuatorProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .assignedValue("assignedValue")
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .attribute(AttributeProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .assignedValue("assignedValue")
 * .defaultValue("defaultValue")
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .branch(BranchProperty.builder()
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .sensor(SensorProperty.builder()
 * .dataType("dataType")
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .allowedValues(List.of("allowedValues"))
 * .description("description")
 * .max(123)
 * .min(123)
 * .unit("unit")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-node.html)
 */
@CdkDslMarker
public class CfnSignalCatalogNodePropertyDsl {
    private val cdkBuilder: CfnSignalCatalog.NodeProperty.Builder =
        CfnSignalCatalog.NodeProperty.builder()

    /**
     * @param actuator (Optional) Information about a node specified as an actuator.
     *
     * An actuator is a digital representation of a vehicle device.
     */
    public fun actuator(actuator: IResolvable) {
        cdkBuilder.actuator(actuator)
    }

    /**
     * @param actuator (Optional) Information about a node specified as an actuator.
     *
     * An actuator is a digital representation of a vehicle device.
     */
    public fun actuator(actuator: CfnSignalCatalog.ActuatorProperty) {
        cdkBuilder.actuator(actuator)
    }

    /**
     * @param attribute (Optional) Information about a node specified as an attribute.
     *
     * An attribute represents static information about a vehicle.
     */
    public fun attribute(attribute: IResolvable) {
        cdkBuilder.attribute(attribute)
    }

    /**
     * @param attribute (Optional) Information about a node specified as an attribute.
     *
     * An attribute represents static information about a vehicle.
     */
    public fun attribute(attribute: CfnSignalCatalog.AttributeProperty) {
        cdkBuilder.attribute(attribute)
    }

    /**
     * @param branch (Optional) Information about a node specified as a branch.
     *
     * A group of signals that are defined in a hierarchical structure.
     */
    public fun branch(branch: IResolvable) {
        cdkBuilder.branch(branch)
    }

    /**
     * @param branch (Optional) Information about a node specified as a branch.
     *
     * A group of signals that are defined in a hierarchical structure.
     */
    public fun branch(branch: CfnSignalCatalog.BranchProperty) {
        cdkBuilder.branch(branch)
    }

    /**
     * @param sensor (Optional) An input component that reports the environmental condition of a
     *   vehicle.
     *
     * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
     * sensors.
     */
    public fun sensor(sensor: IResolvable) {
        cdkBuilder.sensor(sensor)
    }

    /**
     * @param sensor (Optional) An input component that reports the environmental condition of a
     *   vehicle.
     *
     * You can collect data about fluid levels, temperatures, vibrations, or battery voltage from
     * sensors.
     */
    public fun sensor(sensor: CfnSignalCatalog.SensorProperty) {
        cdkBuilder.sensor(sensor)
    }

    public fun build(): CfnSignalCatalog.NodeProperty = cdkBuilder.build()
}
