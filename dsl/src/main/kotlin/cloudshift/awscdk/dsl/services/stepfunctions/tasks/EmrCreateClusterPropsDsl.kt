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
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps
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
public class EmrCreateClusterPropsDsl {
    private val cdkBuilder: EmrCreateClusterProps.Builder = EmrCreateClusterProps.builder()

    private val _applications: MutableList<EmrCreateCluster.ApplicationConfigProperty> =
        mutableListOf()

    private val _bootstrapActions: MutableList<EmrCreateCluster.BootstrapActionConfigProperty> =
        mutableListOf()

    private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> = mutableListOf()

    public fun additionalInfo(additionalInfo: String) {
        cdkBuilder.additionalInfo(additionalInfo)
    }

    public fun applications(applications: EmrCreateClusterApplicationConfigPropertyDsl.() -> Unit) {
        _applications.add(EmrCreateClusterApplicationConfigPropertyDsl().apply(applications).build())
    }

    public fun applications(applications: Collection<EmrCreateCluster.ApplicationConfigProperty>) {
        _applications.addAll(applications)
    }

    public fun autoScalingRole(autoScalingRole: IRole) {
        cdkBuilder.autoScalingRole(autoScalingRole)
    }

    public fun bootstrapActions(bootstrapActions: EmrCreateClusterBootstrapActionConfigPropertyDsl.() -> Unit) {
        _bootstrapActions.add(EmrCreateClusterBootstrapActionConfigPropertyDsl().apply(bootstrapActions).build())
    }

    public fun bootstrapActions(bootstrapActions: Collection<EmrCreateCluster.BootstrapActionConfigProperty>) {
        _bootstrapActions.addAll(bootstrapActions)
    }

    public fun clusterRole(clusterRole: IRole) {
        cdkBuilder.clusterRole(clusterRole)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
        _configurations.add(EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build())
    }

    public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
        _configurations.addAll(configurations)
    }

    public fun credentials(block: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(block)
        cdkBuilder.credentials(builder.build())
    }

    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    public fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
    }

    public fun ebsRootVolumeSize(ebsRootVolumeSize: Size) {
        cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize)
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

    public fun instances(block: EmrCreateClusterInstancesConfigPropertyDsl.() -> Unit = {}) {
        val builder = EmrCreateClusterInstancesConfigPropertyDsl()
        builder.apply(block)
        cdkBuilder.instances(builder.build())
    }

    public fun instances(instances: EmrCreateCluster.InstancesConfigProperty) {
        cdkBuilder.instances(instances)
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    public fun kerberosAttributes(
        block: EmrCreateClusterKerberosAttributesPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = EmrCreateClusterKerberosAttributesPropertyDsl()
        builder.apply(block)
        cdkBuilder.kerberosAttributes(builder.build())
    }

    public fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty) {
        cdkBuilder.kerberosAttributes(kerberosAttributes)
    }

    public fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    public fun releaseLabel(releaseLabel: String) {
        cdkBuilder.releaseLabel(releaseLabel)
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

    public fun scaleDownBehavior(scaleDownBehavior: EmrCreateCluster.EmrClusterScaleDownBehavior) {
        cdkBuilder.scaleDownBehavior(scaleDownBehavior)
    }

    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
        cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun visibleToAllUsers(visibleToAllUsers: Boolean) {
        cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    public fun build(): EmrCreateClusterProps {
        if (_applications.isNotEmpty()) cdkBuilder.applications(_applications)
        if (_bootstrapActions.isNotEmpty()) cdkBuilder.bootstrapActions(_bootstrapActions)
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
