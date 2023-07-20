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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalableTargetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnScalableTarget.Builder = CfnScalableTarget.Builder.create(scope, id)

    private val _scheduledActions: MutableList<Any> = mutableListOf()

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun scalableDimension(scalableDimension: String) {
        cdkBuilder.scalableDimension(scalableDimension)
    }

    public fun scheduledActions(vararg scheduledActions: Any) {
        _scheduledActions.addAll(listOf(*scheduledActions))
    }

    public fun scheduledActions(scheduledActions: Collection<Any>) {
        _scheduledActions.addAll(scheduledActions)
    }

    public fun scheduledActions(scheduledActions: IResolvable) {
        cdkBuilder.scheduledActions(scheduledActions)
    }

    public fun serviceNamespace(serviceNamespace: String) {
        cdkBuilder.serviceNamespace(serviceNamespace)
    }

    public fun suspendedState(suspendedState: IResolvable) {
        cdkBuilder.suspendedState(suspendedState)
    }

    public fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty) {
        cdkBuilder.suspendedState(suspendedState)
    }

    public fun build(): CfnScalableTarget {
        if (_scheduledActions.isNotEmpty()) cdkBuilder.scheduledActions(_scheduledActions)
        return cdkBuilder.build()
    }
}
