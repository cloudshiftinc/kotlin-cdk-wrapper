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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.services.stepfunctions.CredentialsDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.IntegrationPattern
import software.amazon.awscdk.services.stepfunctions.Timeout
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps

/**
 * Properties for EmrCreateCluster.
 *
 * See the RunJobFlow API for complete documentation on input parameters
 *
 * Example:
 * ```
 * Role clusterRole = Role.Builder.create(this, "ClusterRole")
 * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
 * .build();
 * Role serviceRole = Role.Builder.create(this, "ServiceRole")
 * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
 * .build();
 * Role autoScalingRole = Role.Builder.create(this, "AutoScalingRole")
 * .assumedBy(new ServicePrincipal("elasticmapreduce.amazonaws.com"))
 * .build();
 * autoScalingRole.assumeRolePolicy.addStatements(
 * PolicyStatement.Builder.create()
 * .effect(Effect.ALLOW)
 * .principals(List.of(
 * new ServicePrincipal("application-autoscaling.amazonaws.com")))
 * .actions(List.of("sts:AssumeRole"))
 * .build());
 * EmrCreateCluster.Builder.create(this, "Create Cluster")
 * .instances(InstancesConfigProperty.builder().build())
 * .clusterRole(clusterRole)
 * .name(TaskInput.fromJsonPathAt("$.ClusterName").getValue())
 * .serviceRole(serviceRole)
 * .autoScalingRole(autoScalingRole)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html)
 */
@CdkDslMarker
public class EmrCreateClusterPropsDsl {
    private val cdkBuilder: EmrCreateClusterProps.Builder = EmrCreateClusterProps.builder()

    private val _applications: MutableList<EmrCreateCluster.ApplicationConfigProperty> =
        mutableListOf()

    private val _bootstrapActions: MutableList<EmrCreateCluster.BootstrapActionConfigProperty> =
        mutableListOf()

    private val _configurations: MutableList<EmrCreateCluster.ConfigurationProperty> =
        mutableListOf()

    /** @param additionalInfo A JSON string for selecting additional features. */
    public fun additionalInfo(additionalInfo: String) {
        cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     *   configure when launching the cluster.
     */
    public fun applications(applications: EmrCreateClusterApplicationConfigPropertyDsl.() -> Unit) {
        _applications.add(
            EmrCreateClusterApplicationConfigPropertyDsl().apply(applications).build()
        )
    }

    /**
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     *   configure when launching the cluster.
     */
    public fun applications(applications: Collection<EmrCreateCluster.ApplicationConfigProperty>) {
        _applications.addAll(applications)
    }

    /** @param autoScalingRole An IAM role for automatic scaling policies. */
    public fun autoScalingRole(autoScalingRole: IRole) {
        cdkBuilder.autoScalingRole(autoScalingRole)
    }

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     *   cluster nodes.
     */
    public fun bootstrapActions(
        bootstrapActions: EmrCreateClusterBootstrapActionConfigPropertyDsl.() -> Unit
    ) {
        _bootstrapActions.add(
            EmrCreateClusterBootstrapActionConfigPropertyDsl().apply(bootstrapActions).build()
        )
    }

    /**
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     *   cluster nodes.
     */
    public fun bootstrapActions(
        bootstrapActions: Collection<EmrCreateCluster.BootstrapActionConfigProperty>
    ) {
        _bootstrapActions.addAll(bootstrapActions)
    }

    /**
     * @param clusterRole Also called instance profile and EC2 role. An IAM role for an EMR cluster.
     *   The EC2 instances of the cluster assume this role.
     *
     * This attribute has been renamed from jobFlowRole to clusterRole to align with other
     * ERM/StepFunction integration parameters.
     */
    public fun clusterRole(clusterRole: IRole) {
        cdkBuilder.clusterRole(clusterRole)
    }

    /** @param comment An optional description for this state. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param configurations The list of configurations supplied for the EMR cluster you are
     *   creating.
     */
    public fun configurations(configurations: EmrCreateClusterConfigurationPropertyDsl.() -> Unit) {
        _configurations.add(
            EmrCreateClusterConfigurationPropertyDsl().apply(configurations).build()
        )
    }

    /**
     * @param configurations The list of configurations supplied for the EMR cluster you are
     *   creating.
     */
    public fun configurations(configurations: Collection<EmrCreateCluster.ConfigurationProperty>) {
        _configurations.addAll(configurations)
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: CredentialsDsl.() -> Unit = {}) {
        val builder = CredentialsDsl()
        builder.apply(credentials)
        cdkBuilder.credentials(builder.build())
    }

    /**
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     *   the task. This enables cross-account resource invocations.
     */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /** @param customAmiId The ID of a custom Amazon EBS-backed Linux AMI. */
    public fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * @param ebsRootVolumeSize The size of the EBS root device volume of the Linux AMI that is used
     *   for each EC2 instance.
     */
    public fun ebsRootVolumeSize(ebsRootVolumeSize: Size) {
        cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize)
    }

    /**
     * @param heartbeat Timeout for the heartbeat.
     * @deprecated use `heartbeatTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
        cdkBuilder.heartbeat(heartbeat)
    }

    /**
     * @param heartbeatTimeout Timeout for the heartbeat. [disable-awslint:duration-prop-type] is
     *   needed because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
        cdkBuilder.heartbeatTimeout(heartbeatTimeout)
    }

    /**
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     *   state. May also be the special value JsonPath.DISCARD, which will cause the effective input
     *   to be the empty object {}.
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /** @param instances A specification of the number and type of Amazon EC2 instances. */
    public fun instances(instances: EmrCreateClusterInstancesConfigPropertyDsl.() -> Unit = {}) {
        val builder = EmrCreateClusterInstancesConfigPropertyDsl()
        builder.apply(instances)
        cdkBuilder.instances(builder.build())
    }

    /** @param instances A specification of the number and type of Amazon EC2 instances. */
    public fun instances(instances: EmrCreateCluster.InstancesConfigProperty) {
        cdkBuilder.instances(instances)
    }

    /**
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     *   States Language. You can control these AWS services using service integration patterns
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern) {
        cdkBuilder.integrationPattern(integrationPattern)
    }

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     *   is enabled using a security configuration.
     */
    public fun kerberosAttributes(
        kerberosAttributes: EmrCreateClusterKerberosAttributesPropertyDsl.() -> Unit = {}
    ) {
        val builder = EmrCreateClusterKerberosAttributesPropertyDsl()
        builder.apply(kerberosAttributes)
        cdkBuilder.kerberosAttributes(builder.build())
    }

    /**
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     *   is enabled using a security configuration.
     */
    public fun kerberosAttributes(kerberosAttributes: EmrCreateCluster.KerberosAttributesProperty) {
        cdkBuilder.kerberosAttributes(kerberosAttributes)
    }

    /** @param logUri The location in Amazon S3 to write the log files of the job flow. */
    public fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
    }

    /** @param name The Name of the Cluster. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     *   to the next state. May also be the special value JsonPath.DISCARD, which will cause the
     *   effective output to be the empty object {}.
     */
    public fun outputPath(outputPath: String) {
        cdkBuilder.outputPath(outputPath)
    }

    /**
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     *   application packages installed on the cluster.
     */
    public fun releaseLabel(releaseLabel: String) {
        cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * @param resultPath JSONPath expression to indicate where to inject the state's output. May
     *   also be the special value JsonPath.DISCARD, which will cause the state's input to become
     *   its output.
     */
    public fun resultPath(resultPath: String) {
        cdkBuilder.resultPath(resultPath)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resultSelector)
        cdkBuilder.resultSelector(builder.map)
    }

    /**
     * @param resultSelector The JSON that will replace the state's raw result and become the
     *   effective result before ResultPath is applied. You can use ResultSelector to create a
     *   payload with values that are static or selected from the state's raw result.
     */
    public fun resultSelector(resultSelector: Map<String, Any>) {
        cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * @param scaleDownBehavior Specifies the way that individual Amazon EC2 instances terminate
     *   when an automatic scale-in activity occurs or an instance group is resized.
     */
    public fun scaleDownBehavior(scaleDownBehavior: EmrCreateCluster.EmrClusterScaleDownBehavior) {
        cdkBuilder.scaleDownBehavior(scaleDownBehavior)
    }

    /**
     * @param securityConfiguration The name of a security configuration to apply to the cluster.
     */
    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access AWS
     *   resources on your behalf.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param stepConcurrencyLevel Specifies the step concurrency level to allow multiple steps to
     *   run in parallel. Requires EMR release label 5.28.0 or above. Must be in range [1, 256].
     */
    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
        cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    /**
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * @param taskTimeout Timeout for the task. [disable-awslint:duration-prop-type] is needed
     *   because all props interface in aws-stepfunctions-tasks extend this interface
     */
    public fun taskTimeout(taskTimeout: Timeout) {
        cdkBuilder.taskTimeout(taskTimeout)
    }

    /**
     * @param timeout Timeout for the task.
     * @deprecated use `taskTimeout`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param visibleToAllUsers A value of true indicates that all IAM users in the AWS account can
     *   perform cluster actions if they have the proper IAM policy permissions.
     */
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
