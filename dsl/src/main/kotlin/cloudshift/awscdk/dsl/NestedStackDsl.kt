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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.RemovalPolicy
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class NestedStackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: NestedStack.Builder = NestedStack.Builder.create(scope, id)

    private val _notificationArns: MutableList<String> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun notificationArns(vararg notificationArns: String) {
        _notificationArns.addAll(listOf(*notificationArns))
    }

    public fun notificationArns(notificationArns: Collection<String>) {
        _notificationArns.addAll(notificationArns)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): NestedStack {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        return cdkBuilder.build()
    }
}
