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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride
import software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskProps
import software.amazon.awscdk.services.stepfunctions.tasks.IEcsLaunchTarget
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class EcsRunTaskPropsDsl {
    private val cdkBuilder: EcsRunTaskProps.Builder = EcsRunTaskProps.builder()

    private val _containerOverrides: MutableList<ContainerOverride> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun assignPublicIp(assignPublicIp: Boolean) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun containerOverrides(containerOverrides: ContainerOverrideDsl.() -> Unit) {
        _containerOverrides.add(ContainerOverrideDsl().apply(containerOverrides).build())
    }

    public fun containerOverrides(containerOverrides: Collection<ContainerOverride>) {
        _containerOverrides.addAll(containerOverrides)
    }

    public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(block)
        cdkBuilder.credentials(builder.build())
    }

    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    public fun launchTarget(launchTarget: IEcsLaunchTarget) {
        cdkBuilder.launchTarget(launchTarget)
    }

    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun propagatedTagSource(propagatedTagSource: PropagatedTagSource) {
        cdkBuilder.propagatedTagSource(propagatedTagSource)
    }

    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    public fun resultSelector(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.resultSelector(builder.map)
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    public fun revisionNumber(revisionNumber: Number) {
        cdkBuilder.revisionNumber(revisionNumber)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun subnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.subnets(builder.build())
    }

    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    public fun taskDefinition(taskDefinition: TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): EcsRunTaskProps {
        if (_containerOverrides.isNotEmpty()) cdkBuilder.containerOverrides(_containerOverrides)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
