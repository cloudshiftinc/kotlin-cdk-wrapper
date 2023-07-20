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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnJob
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnJobDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnJob.Builder = CfnJob.Builder.create(scope, id)

    public fun allocatedCapacity(allocatedCapacity: Number) {
        cdkBuilder.allocatedCapacity(allocatedCapacity)
    }

    public fun command(command: IResolvable) {
        cdkBuilder.command(command)
    }

    public fun command(command: CfnJob.JobCommandProperty) {
        cdkBuilder.command(command)
    }

    public fun connections(connections: IResolvable) {
        cdkBuilder.connections(connections)
    }

    public fun connections(connections: CfnJob.ConnectionsListProperty) {
        cdkBuilder.connections(connections)
    }

    public fun defaultArguments(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.defaultArguments(builder.map)
    }

    public fun defaultArguments(defaultArguments: Any) {
        cdkBuilder.defaultArguments(defaultArguments)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun executionClass(executionClass: String) {
        cdkBuilder.executionClass(executionClass)
    }

    public fun executionProperty(executionProperty: IResolvable) {
        cdkBuilder.executionProperty(executionProperty)
    }

    public fun executionProperty(executionProperty: CfnJob.ExecutionPropertyProperty) {
        cdkBuilder.executionProperty(executionProperty)
    }

    public fun glueVersion(glueVersion: String) {
        cdkBuilder.glueVersion(glueVersion)
    }

    public fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
    }

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun nonOverridableArguments(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.nonOverridableArguments(builder.map)
    }

    public fun nonOverridableArguments(nonOverridableArguments: Any) {
        cdkBuilder.nonOverridableArguments(nonOverridableArguments)
    }

    public fun notificationProperty(notificationProperty: IResolvable) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    public fun notificationProperty(notificationProperty: CfnJob.NotificationPropertyProperty) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    public fun numberOfWorkers(numberOfWorkers: Number) {
        cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun workerType(workerType: String) {
        cdkBuilder.workerType(workerType)
    }

    public fun build(): CfnJob = cdkBuilder.build()
}
