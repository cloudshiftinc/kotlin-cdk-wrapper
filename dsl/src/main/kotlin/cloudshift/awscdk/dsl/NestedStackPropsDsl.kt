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
import software.amazon.awscdk.NestedStackProps
import software.amazon.awscdk.RemovalPolicy
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class NestedStackPropsDsl {
    private val cdkBuilder: NestedStackProps.Builder = NestedStackProps.builder()

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

    public fun build(): NestedStackProps {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        return cdkBuilder.build()
    }
}
