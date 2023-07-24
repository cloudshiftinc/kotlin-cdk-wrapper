@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * The current status of the entity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * Object error;
 * StatusProperty statusProperty = StatusProperty.builder()
 * .error(error)
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-entity-status.html)
 */
@CdkDslMarker
public class CfnEntityStatusPropertyDsl {
    private val cdkBuilder: CfnEntity.StatusProperty.Builder = CfnEntity.StatusProperty.builder()

    /**
     * @param error The error message.
     */
    public fun error(error: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(error)
        cdkBuilder.error(builder.map)
    }

    /**
     * @param error The error message.
     */
    public fun error(error: Any) {
        cdkBuilder.error(error)
    }

    /**
     * @param state The current state of the entity, component, component type, or workspace.
     * Valid Values: `CREATING | UPDATING | DELETING | ACTIVE | ERROR`
     */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnEntity.StatusProperty = cdkBuilder.build()
}
