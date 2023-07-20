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
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModelProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class SageMakerCreateModelPropsDsl {
    private val cdkBuilder: SageMakerCreateModelProps.Builder = SageMakerCreateModelProps.builder()

    private val _containers: MutableList<IContainerDefinition> = mutableListOf()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun containers(vararg containers: IContainerDefinition) {
        _containers.addAll(listOf(*containers))
    }

    public fun containers(containers: Collection<IContainerDefinition>) {
        _containers.addAll(containers)
    }

    public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(block)
        cdkBuilder.credentials(builder.build())
    }

    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
        cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
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

    public fun modelName(modelName: String) {
        cdkBuilder.modelName(modelName)
    }

    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun primaryContainer(primaryContainer: IContainerDefinition) {
        cdkBuilder.primaryContainer(primaryContainer)
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

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.subnetSelection(builder.build())
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    public fun tags(tags: TaskInput) {
        cdkBuilder.tags(tags)
    }

    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): SageMakerCreateModelProps {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        return cdkBuilder.build()
    }
}
