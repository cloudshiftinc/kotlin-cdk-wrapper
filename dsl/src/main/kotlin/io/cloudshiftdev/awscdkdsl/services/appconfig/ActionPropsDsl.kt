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

package io.cloudshiftdev.awscdkdsl.services.appconfig

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.ActionPoint
import software.amazon.awscdk.services.appconfig.ActionProps
import software.amazon.awscdk.services.appconfig.IEventDestination
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for the Action construct.
 *
 * Example:
 * ```
 * Function fn;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new LambdaDestination(fn))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ActionPropsDsl {
    private val cdkBuilder: ActionProps.Builder = ActionProps.builder()

    private val _actionPoints: MutableList<ActionPoint> = mutableListOf()

    /** @param actionPoints The action points that will trigger the extension action. */
    public fun actionPoints(vararg actionPoints: ActionPoint) {
        _actionPoints.addAll(listOf(*actionPoints))
    }

    /** @param actionPoints The action points that will trigger the extension action. */
    public fun actionPoints(actionPoints: Collection<ActionPoint>) {
        _actionPoints.addAll(actionPoints)
    }

    /** @param description The description for the action. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param eventDestination The event destination for the action. */
    public fun eventDestination(eventDestination: IEventDestination) {
        cdkBuilder.eventDestination(eventDestination)
    }

    /** @param executionRole The execution role for the action. */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param invokeWithoutExecutionRole The flag that specifies whether or not to create the
     *   execution role. If set to true, then the role will not be auto-generated under the
     *   assumption there is already the corresponding resource-based policy attached to the event
     *   destination. If false, the execution role will be generated if not provided.
     */
    public fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean) {
        cdkBuilder.invokeWithoutExecutionRole(invokeWithoutExecutionRole)
    }

    /** @param name The name for the action. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): ActionProps {
        if (_actionPoints.isNotEmpty()) cdkBuilder.actionPoints(_actionPoints)
        return cdkBuilder.build()
    }
}
