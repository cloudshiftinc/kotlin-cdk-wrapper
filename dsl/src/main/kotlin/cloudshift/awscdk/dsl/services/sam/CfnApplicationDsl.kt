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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApplication
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _notificationArns: MutableList<String> = mutableListOf()

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    public fun location(location: CfnApplication.ApplicationLocationProperty) {
        cdkBuilder.location(location)
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

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): CfnApplication {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        return cdkBuilder.build()
    }
}
