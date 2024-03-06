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
import software.amazon.awscdk.services.appconfig.Action
import software.amazon.awscdk.services.appconfig.ActionPoint
import software.amazon.awscdk.services.appconfig.IEventDestination
import software.amazon.awscdk.services.iam.IRole

/**
 * Defines an action for an extension.
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
public class ActionDsl {
    private val cdkBuilder: Action.Builder = Action.Builder.create()

    private val _actionPoints: MutableList<ActionPoint> = mutableListOf()

    /**
     * The action points that will trigger the extension action.
     *
     * @param actionPoints The action points that will trigger the extension action.
     */
    public fun actionPoints(vararg actionPoints: ActionPoint) {
        _actionPoints.addAll(listOf(*actionPoints))
    }

    /**
     * The action points that will trigger the extension action.
     *
     * @param actionPoints The action points that will trigger the extension action.
     */
    public fun actionPoints(actionPoints: Collection<ActionPoint>) {
        _actionPoints.addAll(actionPoints)
    }

    /**
     * The description for the action.
     *
     * Default: - No description.
     *
     * @param description The description for the action.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The event destination for the action.
     *
     * @param eventDestination The event destination for the action.
     */
    public fun eventDestination(eventDestination: IEventDestination) {
        cdkBuilder.eventDestination(eventDestination)
    }

    /**
     * The execution role for the action.
     *
     * Default: - A role is generated.
     *
     * @param executionRole The execution role for the action.
     */
    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    /**
     * The flag that specifies whether or not to create the execution role.
     *
     * If set to true, then the role will not be auto-generated under the assumption there is
     * already the corresponding resource-based policy attached to the event destination. If false,
     * the execution role will be generated if not provided.
     *
     * Default: false
     *
     * @param invokeWithoutExecutionRole The flag that specifies whether or not to create the
     *   execution role.
     */
    public fun invokeWithoutExecutionRole(invokeWithoutExecutionRole: Boolean) {
        cdkBuilder.invokeWithoutExecutionRole(invokeWithoutExecutionRole)
    }

    /**
     * The name for the action.
     *
     * Default: - A name is generated.
     *
     * @param name The name for the action.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): Action {
        if (_actionPoints.isNotEmpty()) cdkBuilder.actionPoints(_actionPoints)
        return cdkBuilder.build()
    }
}
