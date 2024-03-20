@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Step Functions Task to create an EMR Cluster.
 *
 * The ClusterConfiguration is defined as Parameters in the state machine definition.
 *
 * OUTPUT: the ClusterId.
 *
 * Example:
 *
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
 */
public open class EmrCreateCluster internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster,
) : TaskStateBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EmrCreateClusterProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(EmrCreateClusterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EmrCreateClusterProps.Builder.() -> Unit,
  ) : this(scope, id, EmrCreateClusterProps(props)
  )

  /**
   * The autoscaling role for the EMR Cluster.
   *
   * Only available after task has been added to a state machine.
   */
  public open fun autoScalingRole(): IRole = unwrap(this).getAutoScalingRole().let(IRole::wrap)

  /**
   * The instance role for the EMR Cluster.
   *
   * Only available after task has been added to a state machine.
   */
  public open fun clusterRole(): IRole = unwrap(this).getClusterRole().let(IRole::wrap)

  /**
   * The service role for the EMR Cluster.
   *
   * Only available after task has been added to a state machine.
   */
  public open fun serviceRole(): IRole = unwrap(this).getServiceRole().let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.tasks.EmrCreateCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A JSON string for selecting additional features.
     *
     * Default: - None
     *
     * @param additionalInfo A JSON string for selecting additional features. 
     */
    public fun additionalInfo(additionalInfo: String)

    /**
     * A case-insensitive list of applications for Amazon EMR to install and configure when
     * launching the cluster.
     *
     * Default: - EMR selected default
     *
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster. 
     */
    public fun applications(applications: List<ApplicationConfigProperty>)

    /**
     * A case-insensitive list of applications for Amazon EMR to install and configure when
     * launching the cluster.
     *
     * Default: - EMR selected default
     *
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster. 
     */
    public fun applications(vararg applications: ApplicationConfigProperty)

    /**
     * An IAM role for automatic scaling policies.
     *
     * Default: - A role will be created.
     *
     * @param autoScalingRole An IAM role for automatic scaling policies. 
     */
    public fun autoScalingRole(autoScalingRole: IRole)

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * Default: - None
     *
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    public fun bootstrapActions(bootstrapActions: List<BootstrapActionConfigProperty>)

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * Default: - None
     *
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    public fun bootstrapActions(vararg bootstrapActions: BootstrapActionConfigProperty)

    /**
     * Also called instance profile and EC2 role.
     *
     * An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role.
     *
     * This attribute has been renamed from jobFlowRole to clusterRole to align with other
     * ERM/StepFunction integration parameters.
     *
     * Default: - * A Role will be created
     *
     * @param clusterRole Also called instance profile and EC2 role. 
     */
    public fun clusterRole(clusterRole: IRole)

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    public fun comment(comment: String)

    /**
     * The list of configurations supplied for the EMR cluster you are creating.
     *
     * Default: - None
     *
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating. 
     */
    public fun configurations(configurations: List<ConfigurationProperty>)

    /**
     * The list of configurations supplied for the EMR cluster you are creating.
     *
     * Default: - None
     *
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating. 
     */
    public fun configurations(vararg configurations: ConfigurationProperty)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    public fun credentials(credentials: Credentials)

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5f460e0e2cfd6af91ce0e7b89d551a99a1db683817e26654ab34ee73268da1")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    /**
     * The ID of a custom Amazon EBS-backed Linux AMI.
     *
     * Default: - None
     *
     * @param customAmiId The ID of a custom Amazon EBS-backed Linux AMI. 
     */
    public fun customAmiId(customAmiId: String)

    /**
     * The size of the EBS root device volume of the Linux AMI that is used for each EC2 instance.
     *
     * Default: - EMR selected default
     *
     * @param ebsRootVolumeSize The size of the EBS root device volume of the Linux AMI that is used
     * for each EC2 instance. 
     */
    public fun ebsRootVolumeSize(ebsRootVolumeSize: Size)

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    public fun inputPath(inputPath: String)

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    public fun instances(instances: InstancesConfigProperty)

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10af92922533ae8a24ffcad71bb2c27c2cd7261090d74dc74f03665583298f1d")
    public fun instances(instances: InstancesConfigProperty.Builder.() -> Unit)

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    public fun integrationPattern(integrationPattern: IntegrationPattern)

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * Default: - None
     *
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty)

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * Default: - None
     *
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("009696d119485783fe485fae2584ed39873548c64acbcf4b360c05866bd665ec")
    public fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit)

    /**
     * The location in Amazon S3 to write the log files of the job flow.
     *
     * Default: - None
     *
     * @param logUri The location in Amazon S3 to write the log files of the job flow. 
     */
    public fun logUri(logUri: String)

    /**
     * The Name of the Cluster.
     *
     * @param name The Name of the Cluster. 
     */
    public fun name(name: String)

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    public fun outputPath(outputPath: String)

    /**
     * The Amazon EMR release label, which determines the version of open-source application
     * packages installed on the cluster.
     *
     * Default: - EMR selected default
     *
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. 
     */
    public fun releaseLabel(releaseLabel: String)

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    public fun resultPath(resultPath: String)

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    public fun resultSelector(resultSelector: Map<String, Any>)

    /**
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in
     * activity occurs or an instance group is resized.
     *
     * Default: - EMR selected default
     *
     * @param scaleDownBehavior Specifies the way that individual Amazon EC2 instances terminate
     * when an automatic scale-in activity occurs or an instance group is resized. 
     */
    public fun scaleDownBehavior(scaleDownBehavior: EmrClusterScaleDownBehavior)

    /**
     * The name of a security configuration to apply to the cluster.
     *
     * Default: - None
     *
     * @param securityConfiguration The name of a security configuration to apply to the cluster. 
     */
    public fun securityConfiguration(securityConfiguration: String)

    /**
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your
     * behalf.
     *
     * Default: - A role will be created that Amazon EMR service can assume.
     *
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf. 
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    public fun stateName(stateName: String)

    /**
     * Specifies the step concurrency level to allow multiple steps to run in parallel.
     *
     * Requires EMR release label 5.28.0 or above.
     * Must be in range [1, 256].
     *
     * Default: 1 - no step concurrency allowed
     *
     * @param stepConcurrencyLevel Specifies the step concurrency level to allow multiple steps to
     * run in parallel. 
     */
    public fun stepConcurrencyLevel(stepConcurrencyLevel: Number)

    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     *
     * Default: - None
     *
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    public fun taskTimeout(taskTimeout: Timeout)

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)

    /**
     * A value of true indicates that all IAM users in the AWS account can perform cluster actions
     * if they have the proper IAM policy permissions.
     *
     * Default: true
     *
     * @param visibleToAllUsers A value of true indicates that all IAM users in the AWS account can
     * perform cluster actions if they have the proper IAM policy permissions. 
     */
    public fun visibleToAllUsers(visibleToAllUsers: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.Builder.create(scope,
        id)

    /**
     * A JSON string for selecting additional features.
     *
     * Default: - None
     *
     * @param additionalInfo A JSON string for selecting additional features. 
     */
    override fun additionalInfo(additionalInfo: String) {
      cdkBuilder.additionalInfo(additionalInfo)
    }

    /**
     * A case-insensitive list of applications for Amazon EMR to install and configure when
     * launching the cluster.
     *
     * Default: - EMR selected default
     *
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster. 
     */
    override fun applications(applications: List<ApplicationConfigProperty>) {
      cdkBuilder.applications(applications.map(ApplicationConfigProperty::unwrap))
    }

    /**
     * A case-insensitive list of applications for Amazon EMR to install and configure when
     * launching the cluster.
     *
     * Default: - EMR selected default
     *
     * @param applications A case-insensitive list of applications for Amazon EMR to install and
     * configure when launching the cluster. 
     */
    override fun applications(vararg applications: ApplicationConfigProperty): Unit =
        applications(applications.toList())

    /**
     * An IAM role for automatic scaling policies.
     *
     * Default: - A role will be created.
     *
     * @param autoScalingRole An IAM role for automatic scaling policies. 
     */
    override fun autoScalingRole(autoScalingRole: IRole) {
      cdkBuilder.autoScalingRole(autoScalingRole.let(IRole::unwrap))
    }

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * Default: - None
     *
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    override fun bootstrapActions(bootstrapActions: List<BootstrapActionConfigProperty>) {
      cdkBuilder.bootstrapActions(bootstrapActions.map(BootstrapActionConfigProperty::unwrap))
    }

    /**
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     *
     * Default: - None
     *
     * @param bootstrapActions A list of bootstrap actions to run before Hadoop starts on the
     * cluster nodes. 
     */
    override fun bootstrapActions(vararg bootstrapActions: BootstrapActionConfigProperty): Unit =
        bootstrapActions(bootstrapActions.toList())

    /**
     * Also called instance profile and EC2 role.
     *
     * An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role.
     *
     * This attribute has been renamed from jobFlowRole to clusterRole to align with other
     * ERM/StepFunction integration parameters.
     *
     * Default: - * A Role will be created
     *
     * @param clusterRole Also called instance profile and EC2 role. 
     */
    override fun clusterRole(clusterRole: IRole) {
      cdkBuilder.clusterRole(clusterRole.let(IRole::unwrap))
    }

    /**
     * An optional description for this state.
     *
     * Default: - No comment
     *
     * @param comment An optional description for this state. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The list of configurations supplied for the EMR cluster you are creating.
     *
     * Default: - None
     *
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating. 
     */
    override fun configurations(configurations: List<ConfigurationProperty>) {
      cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
    }

    /**
     * The list of configurations supplied for the EMR cluster you are creating.
     *
     * Default: - None
     *
     * @param configurations The list of configurations supplied for the EMR cluster you are
     * creating. 
     */
    override fun configurations(vararg configurations: ConfigurationProperty): Unit =
        configurations(configurations.toList())

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    /**
     * Credentials for an IAM Role that the State Machine assumes for executing the task.
     *
     * This enables cross-account resource invocations.
     *
     * Default: - None (Task is executed using the State Machine's execution role)
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html)
     * @param credentials Credentials for an IAM Role that the State Machine assumes for executing
     * the task. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb5f460e0e2cfd6af91ce0e7b89d551a99a1db683817e26654ab34ee73268da1")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    /**
     * The ID of a custom Amazon EBS-backed Linux AMI.
     *
     * Default: - None
     *
     * @param customAmiId The ID of a custom Amazon EBS-backed Linux AMI. 
     */
    override fun customAmiId(customAmiId: String) {
      cdkBuilder.customAmiId(customAmiId)
    }

    /**
     * The size of the EBS root device volume of the Linux AMI that is used for each EC2 instance.
     *
     * Default: - EMR selected default
     *
     * @param ebsRootVolumeSize The size of the EBS root device volume of the Linux AMI that is used
     * for each EC2 instance. 
     */
    override fun ebsRootVolumeSize(ebsRootVolumeSize: Size) {
      cdkBuilder.ebsRootVolumeSize(ebsRootVolumeSize.let(Size::unwrap))
    }

    /**
     * (deprecated) Timeout for the heartbeat.
     *
     * Default: - None
     *
     * @deprecated use `heartbeatTimeout`
     * @param heartbeat Timeout for the heartbeat. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    /**
     * Timeout for the heartbeat.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param heartbeatTimeout Timeout for the heartbeat. 
     */
    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    /**
     * JSONPath expression to select part of the state to be the input to this state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * input to be the empty object {}.
     *
     * Default: - The entire task input (JSON path '$')
     *
     * @param inputPath JSONPath expression to select part of the state to be the input to this
     * state. 
     */
    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    override fun instances(instances: InstancesConfigProperty) {
      cdkBuilder.instances(instances.let(InstancesConfigProperty::unwrap))
    }

    /**
     * A specification of the number and type of Amazon EC2 instances.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10af92922533ae8a24ffcad71bb2c27c2cd7261090d74dc74f03665583298f1d")
    override fun instances(instances: InstancesConfigProperty.Builder.() -> Unit): Unit =
        instances(InstancesConfigProperty(instances))

    /**
     * AWS Step Functions integrates with services directly in the Amazon States Language.
     *
     * You can control these AWS services using service integration patterns.
     *
     * Depending on the AWS Service, the Service Integration Pattern availability will vary.
     *
     * Default: - `IntegrationPattern.REQUEST_RESPONSE` for most tasks.
     * `IntegrationPattern.RUN_JOB` for the following exceptions:
     * `BatchSubmitJob`, `EmrAddStep`, `EmrCreateCluster`, `EmrTerminationCluster`, and
     * `EmrContainersStartJobRun`.
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/connect-supported-services.html)
     * @param integrationPattern AWS Step Functions integrates with services directly in the Amazon
     * States Language. 
     */
    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * Default: - None
     *
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    override fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty) {
      cdkBuilder.kerberosAttributes(kerberosAttributes.let(KerberosAttributesProperty::unwrap))
    }

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a
     * security configuration.
     *
     * Default: - None
     *
     * @param kerberosAttributes Attributes for Kerberos configuration when Kerberos authentication
     * is enabled using a security configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("009696d119485783fe485fae2584ed39873548c64acbcf4b360c05866bd665ec")
    override
        fun kerberosAttributes(kerberosAttributes: KerberosAttributesProperty.Builder.() -> Unit):
        Unit = kerberosAttributes(KerberosAttributesProperty(kerberosAttributes))

    /**
     * The location in Amazon S3 to write the log files of the job flow.
     *
     * Default: - None
     *
     * @param logUri The location in Amazon S3 to write the log files of the job flow. 
     */
    override fun logUri(logUri: String) {
      cdkBuilder.logUri(logUri)
    }

    /**
     * The Name of the Cluster.
     *
     * @param name The Name of the Cluster. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * JSONPath expression to select select a portion of the state output to pass to the next state.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the effective
     * output to be the empty object {}.
     *
     * Default: - The entire JSON node determined by the state input, the task result,
     * and resultPath is passed to the next state (JSON path '$')
     *
     * @param outputPath JSONPath expression to select select a portion of the state output to pass
     * to the next state. 
     */
    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    /**
     * The Amazon EMR release label, which determines the version of open-source application
     * packages installed on the cluster.
     *
     * Default: - EMR selected default
     *
     * @param releaseLabel The Amazon EMR release label, which determines the version of open-source
     * application packages installed on the cluster. 
     */
    override fun releaseLabel(releaseLabel: String) {
      cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * JSONPath expression to indicate where to inject the state's output.
     *
     * May also be the special value JsonPath.DISCARD, which will cause the state's
     * input to become its output.
     *
     * Default: - Replaces the entire input with the result (JSON path '$')
     *
     * @param resultPath JSONPath expression to indicate where to inject the state's output. 
     */
    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    /**
     * The JSON that will replace the state's raw result and become the effective result before
     * ResultPath is applied.
     *
     * You can use ResultSelector to create a payload with values that are static
     * or selected from the state's raw result.
     *
     * Default: - None
     *
     * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/input-output-inputpath-params.html#input-output-resultselector)
     * @param resultSelector The JSON that will replace the state's raw result and become the
     * effective result before ResultPath is applied. 
     */
    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    /**
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in
     * activity occurs or an instance group is resized.
     *
     * Default: - EMR selected default
     *
     * @param scaleDownBehavior Specifies the way that individual Amazon EC2 instances terminate
     * when an automatic scale-in activity occurs or an instance group is resized. 
     */
    override fun scaleDownBehavior(scaleDownBehavior: EmrClusterScaleDownBehavior) {
      cdkBuilder.scaleDownBehavior(scaleDownBehavior.let(EmrClusterScaleDownBehavior::unwrap))
    }

    /**
     * The name of a security configuration to apply to the cluster.
     *
     * Default: - None
     *
     * @param securityConfiguration The name of a security configuration to apply to the cluster. 
     */
    override fun securityConfiguration(securityConfiguration: String) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    /**
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your
     * behalf.
     *
     * Default: - A role will be created that Amazon EMR service can assume.
     *
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access AWS
     * resources on your behalf. 
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    /**
     * Optional name for this state.
     *
     * Default: - The construct ID will be used as state name
     *
     * @param stateName Optional name for this state. 
     */
    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    /**
     * Specifies the step concurrency level to allow multiple steps to run in parallel.
     *
     * Requires EMR release label 5.28.0 or above.
     * Must be in range [1, 256].
     *
     * Default: 1 - no step concurrency allowed
     *
     * @param stepConcurrencyLevel Specifies the step concurrency level to allow multiple steps to
     * run in parallel. 
     */
    override fun stepConcurrencyLevel(stepConcurrencyLevel: Number) {
      cdkBuilder.stepConcurrencyLevel(stepConcurrencyLevel)
    }

    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     *
     * Default: - None
     *
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * Timeout for the task.
     *
     * [disable-awslint:duration-prop-type] is needed because all props interface in
     * aws-stepfunctions-tasks extend this interface
     *
     * Default: - None
     *
     * @param taskTimeout Timeout for the task. 
     */
    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    /**
     * (deprecated) Timeout for the task.
     *
     * Default: - None
     *
     * @deprecated use `taskTimeout`
     * @param timeout Timeout for the task. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * A value of true indicates that all IAM users in the AWS account can perform cluster actions
     * if they have the proper IAM policy permissions.
     *
     * Default: true
     *
     * @param visibleToAllUsers A value of true indicates that all IAM users in the AWS account can
     * perform cluster actions if they have the proper IAM policy permissions. 
     */
    override fun visibleToAllUsers(visibleToAllUsers: Boolean) {
      cdkBuilder.visibleToAllUsers(visibleToAllUsers)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrCreateCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrCreateCluster(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster):
        EmrCreateCluster = EmrCreateCluster(cdkObject)

    internal fun unwrap(wrapped: EmrCreateCluster):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster = wrapped.cdkObject
  }

  /**
   * An optional configuration specification to be used when provisioning cluster instances, which
   * can include configurations for applications and software bundled with Amazon EMR.
   *
   * See the RunJobFlow API for complete documentation on input parameters
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ConfigurationProperty configurationProperty_;
   * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
   * .classification("classification")
   * .configurations(List.of(configurationProperty_))
   * .properties(Map.of(
   * "propertiesKey", "properties"))
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_Configuration.html)
   */
  public interface ConfigurationProperty {
    /**
     * The classification within a configuration.
     *
     * Default: No classification
     */
    public fun classification(): String? = unwrap(this).getClassification()

    /**
     * A list of additional configurations to apply within a configuration object.
     *
     * Default: No configurations
     */
    public fun configurations(): List<ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

    /**
     * A set of properties specified within a configuration classification.
     *
     * Default: No properties
     */
    public fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()

    /**
     * A builder for [ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classification The classification within a configuration.
       */
      public fun classification(classification: String)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(configurations: List<ConfigurationProperty>)

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      public fun configurations(vararg configurations: ConfigurationProperty)

      /**
       * @param properties A set of properties specified within a configuration classification.
       */
      public fun properties(properties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty.builder()

      /**
       * @param classification The classification within a configuration.
       */
      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      /**
       * @param configurations A list of additional configurations to apply within a configuration
       * object.
       */
      override fun configurations(vararg configurations: ConfigurationProperty): Unit =
          configurations(configurations.toList())

      /**
       * @param properties A set of properties specified within a configuration classification.
       */
      override fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty,
    ) : CdkObject(cdkObject), ConfigurationProperty {
      /**
       * The classification within a configuration.
       *
       * Default: No classification
       */
      override fun classification(): String? = unwrap(this).getClassification()

      /**
       * A list of additional configurations to apply within a configuration object.
       *
       * Default: No configurations
       */
      override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      /**
       * A set of properties specified within a configuration classification.
       *
       * Default: No properties
       */
      override fun properties(): Map<String, String> = unwrap(this).getProperties() ?: emptyMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty):
          ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? ConfigurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ConfigurationProperty
    }
  }

  public enum class ScalingAdjustmentType(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType,
  ) {
    CHANGE_IN_CAPACITY(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.CHANGE_IN_CAPACITY),
    PERCENT_CHANGE_IN_CAPACITY(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.PERCENT_CHANGE_IN_CAPACITY),
    EXACT_CAPACITY(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.EXACT_CAPACITY),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType):
          ScalingAdjustmentType = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.CHANGE_IN_CAPACITY ->
            ScalingAdjustmentType.CHANGE_IN_CAPACITY
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.PERCENT_CHANGE_IN_CAPACITY ->
            ScalingAdjustmentType.PERCENT_CHANGE_IN_CAPACITY
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.EXACT_CAPACITY ->
            ScalingAdjustmentType.EXACT_CAPACITY
      }

      internal fun unwrap(wrapped: ScalingAdjustmentType):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType
          = wrapped.cdkObject
    }
  }

  /**
   * Configuration of a bootstrap action.
   *
   * See the RunJobFlow API for complete documentation on input parameters
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * BootstrapActionConfigProperty bootstrapActionConfigProperty =
   * BootstrapActionConfigProperty.builder()
   * .name("name")
   * .scriptBootstrapAction(ScriptBootstrapActionConfigProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .args(List.of("args"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_BootstrapActionConfig.html)
   */
  public interface BootstrapActionConfigProperty {
    /**
     * The name of the bootstrap action.
     */
    public fun name(): String

    /**
     * The script run by the bootstrap action.
     */
    public fun scriptBootstrapAction(): ScriptBootstrapActionConfigProperty

    /**
     * A builder for [BootstrapActionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the bootstrap action. 
       */
      public fun name(name: String)

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      public fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty)

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e46424a100529b23b874f3d97c0f1eb4a4773b914c6ee48bbba8948c430ae044")
      public
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty.builder()

      /**
       * @param name The name of the bootstrap action. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty) {
        cdkBuilder.scriptBootstrapAction(scriptBootstrapAction.let(ScriptBootstrapActionConfigProperty::unwrap))
      }

      /**
       * @param scriptBootstrapAction The script run by the bootstrap action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e46424a100529b23b874f3d97c0f1eb4a4773b914c6ee48bbba8948c430ae044")
      override
          fun scriptBootstrapAction(scriptBootstrapAction: ScriptBootstrapActionConfigProperty.Builder.() -> Unit):
          Unit = scriptBootstrapAction(ScriptBootstrapActionConfigProperty(scriptBootstrapAction))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty,
    ) : CdkObject(cdkObject), BootstrapActionConfigProperty {
      /**
       * The name of the bootstrap action.
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The script run by the bootstrap action.
       */
      override fun scriptBootstrapAction(): ScriptBootstrapActionConfigProperty =
          unwrap(this).getScriptBootstrapAction().let(ScriptBootstrapActionConfigProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty):
          BootstrapActionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BootstrapActionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BootstrapActionConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.BootstrapActionConfigProperty
    }
  }

  public enum class EbsBlockDeviceVolumeType(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType,
  ) {
    GP3(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP3),
    GP2(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP2),
    IO1(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.IO1),
    ST1(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.ST1),
    SC1(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.SC1),
    STANDARD(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.STANDARD),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType):
          EbsBlockDeviceVolumeType = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP3 ->
            EbsBlockDeviceVolumeType.GP3
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.GP2 ->
            EbsBlockDeviceVolumeType.GP2
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.IO1 ->
            EbsBlockDeviceVolumeType.IO1
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.ST1 ->
            EbsBlockDeviceVolumeType.ST1
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.SC1 ->
            EbsBlockDeviceVolumeType.SC1
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType.STANDARD ->
            EbsBlockDeviceVolumeType.STANDARD
      }

      internal fun unwrap(wrapped: EbsBlockDeviceVolumeType):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceVolumeType
          = wrapped.cdkObject
    }
  }

  /**
   * Configuration of requested EBS block device associated with the instance group with count of
   * volumes that will be associated to every instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * Size size;
   * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
   * EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .volumeSize(size)
   * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
   * // the properties below are optional
   * .iops(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_EbsBlockDeviceConfig.html)
   */
  public interface EbsBlockDeviceConfigProperty {
    /**
     * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested
     * for the EBS volume attached to an EC2 instance in the cluster.
     */
    public fun volumeSpecification(): VolumeSpecificationProperty

    /**
     * Number of EBS volumes with a specific volume configuration that will be associated with every
     * instance in the instance group.
     *
     * Default: EMR selected default
     */
    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    /**
     * A builder for [EbsBlockDeviceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size
       * (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster. 
       */
      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty)

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size
       * (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6f90ce225f535e721d478357450c309793426146555761af77137d6011275d2")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit)

      /**
       * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that
       * will be associated with every instance in the instance group.
       */
      public fun volumesPerInstance(volumesPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty.builder()

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size
       * (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster. 
       */
      override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      /**
       * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size
       * (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6f90ce225f535e721d478357450c309793426146555761af77137d6011275d2")
      override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      /**
       * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that
       * will be associated with every instance in the instance group.
       */
      override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty,
    ) : CdkObject(cdkObject), EbsBlockDeviceConfigProperty {
      /**
       * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested
       * for the EBS volume attached to an EC2 instance in the cluster.
       */
      override fun volumeSpecification(): VolumeSpecificationProperty =
          unwrap(this).getVolumeSpecification().let(VolumeSpecificationProperty::wrap)

      /**
       * Number of EBS volumes with a specific volume configuration that will be associated with
       * every instance in the instance group.
       *
       * Default: EMR selected default
       */
      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EbsBlockDeviceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsBlockDeviceConfigProperty
    }
  }

  /**
   * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for
   * the EBS volume attached to an EC2 instance in the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * Size size;
   * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
   * .volumeSize(size)
   * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
   * // the properties below are optional
   * .iops(123)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_VolumeSpecification.html)
   */
  public interface VolumeSpecificationProperty {
    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     *
     * Default: - EMR selected default
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The volume size.
     *
     * If the volume type is EBS-optimized, the minimum value is 10GiB.
     * Maximum size is 1TiB
     */
    public fun volumeSize(): Size

    /**
     * The volume type.
     *
     * Volume types supported are gp2, io1, standard.
     */
    public fun volumeType(): EbsBlockDeviceVolumeType

    /**
     * A builder for [VolumeSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       */
      public fun iops(iops: Number)

      /**
       * @param volumeSize The volume size. 
       * If the volume type is EBS-optimized, the minimum value is 10GiB.
       * Maximum size is 1TiB
       */
      public fun volumeSize(volumeSize: Size)

      /**
       * @param volumeType The volume type. 
       * Volume types supported are gp2, io1, standard.
       */
      public fun volumeType(volumeType: EbsBlockDeviceVolumeType)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty.builder()

      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param volumeSize The volume size. 
       * If the volume type is EBS-optimized, the minimum value is 10GiB.
       * Maximum size is 1TiB
       */
      override fun volumeSize(volumeSize: Size) {
        cdkBuilder.volumeSize(volumeSize.let(Size::unwrap))
      }

      /**
       * @param volumeType The volume type. 
       * Volume types supported are gp2, io1, standard.
       */
      override fun volumeType(volumeType: EbsBlockDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType.let(EbsBlockDeviceVolumeType::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty,
    ) : CdkObject(cdkObject), VolumeSpecificationProperty {
      /**
       * The number of I/O operations per second (IOPS) that the volume supports.
       *
       * Default: - EMR selected default
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The volume size.
       *
       * If the volume type is EBS-optimized, the minimum value is 10GiB.
       * Maximum size is 1TiB
       */
      override fun volumeSize(): Size = unwrap(this).getVolumeSize().let(Size::wrap)

      /**
       * The volume type.
       *
       * Volume types supported are gp2, io1, standard.
       */
      override fun volumeType(): EbsBlockDeviceVolumeType =
          unwrap(this).getVolumeType().let(EbsBlockDeviceVolumeType::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty):
          VolumeSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VolumeSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.VolumeSpecificationProperty
    }
  }

  /**
   * Properties for the EMR Cluster Applications.
   *
   * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for
   * Amazon EMR to install and configure when launching
   * the cluster.
   *
   * See the RunJobFlow API for complete documentation on input parameters
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ApplicationConfigProperty applicationConfigProperty = ApplicationConfigProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .additionalInfo(Map.of(
   * "additionalInfoKey", "additionalInfo"))
   * .args(List.of("args"))
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_Application.html)
   */
  public interface ApplicationConfigProperty {
    /**
     * This option is for advanced users only.
     *
     * This is meta information about third-party applications that third-party vendors use
     * for testing purposes.
     *
     * Default: No additionalInfo
     */
    public fun additionalInfo(): Map<String, String> = unwrap(this).getAdditionalInfo() ?:
        emptyMap()

    /**
     * Arguments for Amazon EMR to pass to the application.
     *
     * Default: No args
     */
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * The name of the application.
     */
    public fun name(): String

    /**
     * The version of the application.
     *
     * Default: No version
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [ApplicationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalInfo This option is for advanced users only.
       * This is meta information about third-party applications that third-party vendors use
       * for testing purposes.
       */
      public fun additionalInfo(additionalInfo: Map<String, String>)

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      public fun args(args: List<String>)

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      public fun args(vararg args: String)

      /**
       * @param name The name of the application. 
       */
      public fun name(name: String)

      /**
       * @param version The version of the application.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty.builder()

      /**
       * @param additionalInfo This option is for advanced users only.
       * This is meta information about third-party applications that third-party vendors use
       * for testing purposes.
       */
      override fun additionalInfo(additionalInfo: Map<String, String>) {
        cdkBuilder.additionalInfo(additionalInfo)
      }

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      /**
       * @param args Arguments for Amazon EMR to pass to the application.
       */
      override fun args(vararg args: String): Unit = args(args.toList())

      /**
       * @param name The name of the application. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param version The version of the application.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty,
    ) : CdkObject(cdkObject), ApplicationConfigProperty {
      /**
       * This option is for advanced users only.
       *
       * This is meta information about third-party applications that third-party vendors use
       * for testing purposes.
       *
       * Default: No additionalInfo
       */
      override fun additionalInfo(): Map<String, String> = unwrap(this).getAdditionalInfo() ?:
          emptyMap()

      /**
       * Arguments for Amazon EMR to pass to the application.
       *
       * Default: No args
       */
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      /**
       * The name of the application.
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The version of the application.
       *
       * Default: No version
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty):
          ApplicationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ApplicationConfigProperty
    }
  }

  /**
   * An instance type configuration for each instance type in an instance fleet, which determines
   * the EC2 instances Amazon EMR attempts to provision to fulfill On-Demand and Spot target
   * capacities.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ConfigurationProperty configurationProperty_;
   * Size size;
   * InstanceTypeConfigProperty instanceTypeConfigProperty = InstanceTypeConfigProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .bidPrice("bidPrice")
   * .bidPriceAsPercentageOfOnDemandPrice(123)
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurations(List.of(configurationProperty_))
   * .properties(Map.of(
   * "propertiesKey", "properties"))
   * .build()))
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .volumeSize(size)
   * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
   * // the properties below are optional
   * .iops(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .weightedCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceTypeConfig.html)
   */
  public interface InstanceTypeConfigProperty {
    /**
     * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD.
     *
     * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
     *
     * Default: - None
     */
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    /**
     * The bid price, as a percentage of On-Demand price.
     *
     * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
     *
     * Default: - None
     */
    public fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
        unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

    /**
     * A configuration classification that applies when provisioning cluster instances, which can
     * include configurations for applications and software that run on the cluster.
     *
     * Default: - None
     */
    public fun configurations(): List<ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

    /**
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined
     * by InstanceType.
     *
     * Default: - None
     */
    public fun ebsConfiguration(): EbsConfigurationProperty? =
        unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

    /**
     * An EC2 instance type.
     */
    public fun instanceType(): String

    /**
     * The number of units that a provisioned instance of this type provides toward fulfilling the
     * target capacities defined in the InstanceFleetConfig.
     *
     * Default: - None
     */
    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [InstanceTypeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bidPrice The bid price for each EC2 Spot instance type as defined by InstanceType.
       * Expressed in USD.
       * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
       */
      public fun bidPrice(bidPrice: String)

      /**
       * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand
       * price.
       * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
       */
      public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number)

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      public fun configurations(configurations: List<ConfigurationProperty>)

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      public fun configurations(vararg configurations: ConfigurationProperty)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Storage (EBS) attached to
       * each instance as defined by InstanceType.
       */
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Storage (EBS) attached to
       * each instance as defined by InstanceType.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133da82e296eb42525c1f9483336b2cf7e322346309773613f5c5555f23f23a1")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param instanceType An EC2 instance type. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param weightedCapacity The number of units that a provisioned instance of this type
       * provides toward fulfilling the target capacities defined in the InstanceFleetConfig.
       */
      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty.builder()

      /**
       * @param bidPrice The bid price for each EC2 Spot instance type as defined by InstanceType.
       * Expressed in USD.
       * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
       */
      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      /**
       * @param bidPriceAsPercentageOfOnDemandPrice The bid price, as a percentage of On-Demand
       * price.
       * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
       */
      override
          fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
      }

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      /**
       * @param configurations A configuration classification that applies when provisioning cluster
       * instances, which can include configurations for applications and software that run on the
       * cluster.
       */
      override fun configurations(vararg configurations: ConfigurationProperty): Unit =
          configurations(configurations.toList())

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Storage (EBS) attached to
       * each instance as defined by InstanceType.
       */
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      /**
       * @param ebsConfiguration The configuration of Amazon Elastic Block Storage (EBS) attached to
       * each instance as defined by InstanceType.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("133da82e296eb42525c1f9483336b2cf7e322346309773613f5c5555f23f23a1")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      /**
       * @param instanceType An EC2 instance type. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param weightedCapacity The number of units that a provisioned instance of this type
       * provides toward fulfilling the target capacities defined in the InstanceFleetConfig.
       */
      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty,
    ) : CdkObject(cdkObject), InstanceTypeConfigProperty {
      /**
       * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD.
       *
       * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
       *
       * Default: - None
       */
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      /**
       * The bid price, as a percentage of On-Demand price.
       *
       * Cannot specify both `bidPrice` and `bidPriceAsPercentageOfOnDemandPrice`.
       *
       * Default: - None
       */
      override fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
          unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

      /**
       * A configuration classification that applies when provisioning cluster instances, which can
       * include configurations for applications and software that run on the cluster.
       *
       * Default: - None
       */
      override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      /**
       * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as
       * defined by InstanceType.
       *
       * Default: - None
       */
      override fun ebsConfiguration(): EbsConfigurationProperty? =
          unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

      /**
       * An EC2 instance type.
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * The number of units that a provisioned instance of this type provides toward fulfilling the
       * target capacities defined in the InstanceFleetConfig.
       *
       * Default: - None
       */
      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty):
          InstanceTypeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceTypeConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceTypeConfigProperty
    }
  }

  /**
   * Configuration defining a new instance group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ConfigurationProperty configurationProperty_;
   * Size size;
   * InstanceGroupConfigProperty instanceGroupConfigProperty = InstanceGroupConfigProperty.builder()
   * .instanceCount(123)
   * .instanceRole(EmrCreateCluster.getInstanceRoleType().MASTER)
   * .instanceType("instanceType")
   * // the properties below are optional
   * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
   * .constraints(ScalingConstraintsProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build())
   * .rules(List.of(ScalingRuleProperty.builder()
   * .action(ScalingActionProperty.builder()
   * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
   * .metricName("metricName")
   * .period(Duration.minutes(30))
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
   * .threshold(123)
   * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build())
   * .bidPrice("bidPrice")
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurations(List.of(configurationProperty_))
   * .properties(Map.of(
   * "propertiesKey", "properties"))
   * .build()))
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .volumeSize(size)
   * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
   * // the properties below are optional
   * .iops(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceGroupConfig.html)
   */
  public interface InstanceGroupConfigProperty {
    /**
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR
     * cluster.
     *
     * Default: - None
     */
    public fun autoScalingPolicy(): AutoScalingPolicyProperty? =
        unwrap(this).getAutoScalingPolicy()?.let(AutoScalingPolicyProperty::wrap)

    /**
     * The bid price for each EC2 Spot instance type as defined by InstanceType.
     *
     * Expressed in USD.
     *
     * Default: - None
     */
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    /**
     * The list of configurations supplied for an EMR cluster instance group.
     *
     * Default: - None
     */
    public fun configurations(): List<ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

    /**
     * EBS configurations that will be attached to each EC2 instance in the instance group.
     *
     * Default: - None
     */
    public fun ebsConfiguration(): EbsConfigurationProperty? =
        unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

    /**
     * Target number of instances for the instance group.
     */
    public fun instanceCount(): Number

    /**
     * The role of the instance group in the cluster.
     */
    public fun instanceRole(): InstanceRoleType

    /**
     * The EC2 instance type for all instances in the instance group.
     */
    public fun instanceType(): String

    /**
     * Market type of the EC2 instances used to create a cluster node.
     *
     * Default: - EMR selected default
     */
    public fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

    /**
     * Friendly name given to the instance group.
     *
     * Default: - None
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [InstanceGroupConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoScalingPolicy An automatic scaling policy for a core instance group or task
       * instance group in an Amazon EMR cluster.
       */
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

      /**
       * @param autoScalingPolicy An automatic scaling policy for a core instance group or task
       * instance group in an Amazon EMR cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac2482af47863b3a51f0bc8765595bbe84c51d68d67eae14b91ffa4868f55b85")
      public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

      /**
       * @param bidPrice The bid price for each EC2 Spot instance type as defined by InstanceType.
       * Expressed in USD.
       */
      public fun bidPrice(bidPrice: String)

      /**
       * @param configurations The list of configurations supplied for an EMR cluster instance
       * group.
       */
      public fun configurations(configurations: List<ConfigurationProperty>)

      /**
       * @param configurations The list of configurations supplied for an EMR cluster instance
       * group.
       */
      public fun configurations(vararg configurations: ConfigurationProperty)

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in
       * the instance group.
       */
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in
       * the instance group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14867309e2488f898214a5b68d3ac2bc85d329c3b00acb0ef46ad1903ac33246")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param instanceCount Target number of instances for the instance group. 
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceRole The role of the instance group in the cluster. 
       */
      public fun instanceRole(instanceRole: InstanceRoleType)

      /**
       * @param instanceType The EC2 instance type for all instances in the instance group. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param market Market type of the EC2 instances used to create a cluster node.
       */
      public fun market(market: InstanceMarket)

      /**
       * @param name Friendly name given to the instance group.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty.builder()

      /**
       * @param autoScalingPolicy An automatic scaling policy for a core instance group or task
       * instance group in an Amazon EMR cluster.
       */
      override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
      }

      /**
       * @param autoScalingPolicy An automatic scaling policy for a core instance group or task
       * instance group in an Amazon EMR cluster.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac2482af47863b3a51f0bc8765595bbe84c51d68d67eae14b91ffa4868f55b85")
      override
          fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
          Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

      /**
       * @param bidPrice The bid price for each EC2 Spot instance type as defined by InstanceType.
       * Expressed in USD.
       */
      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      /**
       * @param configurations The list of configurations supplied for an EMR cluster instance
       * group.
       */
      override fun configurations(configurations: List<ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(ConfigurationProperty::unwrap))
      }

      /**
       * @param configurations The list of configurations supplied for an EMR cluster instance
       * group.
       */
      override fun configurations(vararg configurations: ConfigurationProperty): Unit =
          configurations(configurations.toList())

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in
       * the instance group.
       */
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      /**
       * @param ebsConfiguration EBS configurations that will be attached to each EC2 instance in
       * the instance group.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("14867309e2488f898214a5b68d3ac2bc85d329c3b00acb0ef46ad1903ac33246")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      /**
       * @param instanceCount Target number of instances for the instance group. 
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceRole The role of the instance group in the cluster. 
       */
      override fun instanceRole(instanceRole: InstanceRoleType) {
        cdkBuilder.instanceRole(instanceRole.let(InstanceRoleType::unwrap))
      }

      /**
       * @param instanceType The EC2 instance type for all instances in the instance group. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param market Market type of the EC2 instances used to create a cluster node.
       */
      override fun market(market: InstanceMarket) {
        cdkBuilder.market(market.let(InstanceMarket::unwrap))
      }

      /**
       * @param name Friendly name given to the instance group.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty,
    ) : CdkObject(cdkObject), InstanceGroupConfigProperty {
      /**
       * An automatic scaling policy for a core instance group or task instance group in an Amazon
       * EMR cluster.
       *
       * Default: - None
       */
      override fun autoScalingPolicy(): AutoScalingPolicyProperty? =
          unwrap(this).getAutoScalingPolicy()?.let(AutoScalingPolicyProperty::wrap)

      /**
       * The bid price for each EC2 Spot instance type as defined by InstanceType.
       *
       * Expressed in USD.
       *
       * Default: - None
       */
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      /**
       * The list of configurations supplied for an EMR cluster instance group.
       *
       * Default: - None
       */
      override fun configurations(): List<ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(ConfigurationProperty::wrap) ?: emptyList()

      /**
       * EBS configurations that will be attached to each EC2 instance in the instance group.
       *
       * Default: - None
       */
      override fun ebsConfiguration(): EbsConfigurationProperty? =
          unwrap(this).getEbsConfiguration()?.let(EbsConfigurationProperty::wrap)

      /**
       * Target number of instances for the instance group.
       */
      override fun instanceCount(): Number = unwrap(this).getInstanceCount()

      /**
       * The role of the instance group in the cluster.
       */
      override fun instanceRole(): InstanceRoleType =
          unwrap(this).getInstanceRole().let(InstanceRoleType::wrap)

      /**
       * The EC2 instance type for all instances in the instance group.
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * Market type of the EC2 instances used to create a cluster node.
       *
       * Default: - EMR selected default
       */
      override fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

      /**
       * Friendly name given to the instance group.
       *
       * Default: - None
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty):
          InstanceGroupConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceGroupConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceGroupConfigProperty
    }
  }

  /**
   * The definition of a CloudWatch metric alarm, which determines when an automatic scaling
   * activity is triggered.
   *
   * When the defined alarm conditions
   * are satisfied, scaling activity begins.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * CloudWatchAlarmDefinitionProperty cloudWatchAlarmDefinitionProperty =
   * CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
   * .metricName("metricName")
   * .period(Duration.minutes(30))
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
   * .threshold(123)
   * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_CloudWatchAlarmDefinition.html)
   */
  public interface CloudWatchAlarmDefinitionProperty {
    /**
     * Determines how the metric specified by MetricName is compared to the value specified by
     * Threshold.
     */
    public fun comparisonOperator(): CloudWatchAlarmComparisonOperator

    /**
     * A CloudWatch metric dimension.
     *
     * Default: - No dimensions
     */
    public fun dimensions(): List<MetricDimensionProperty> =
        unwrap(this).getDimensions()?.map(MetricDimensionProperty::wrap) ?: emptyList()

    /**
     * The number of periods, in five-minute increments, during which the alarm condition must exist
     * before the alarm triggers automatic scaling activity.
     *
     * Default: 1
     */
    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    /**
     * The name of the CloudWatch metric that is watched to determine an alarm condition.
     */
    public fun metricName(): String

    /**
     * The namespace for the CloudWatch metric.
     *
     * Default: 'AWS/ElasticMapReduce'
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The period, in seconds, over which the statistic is applied.
     *
     * EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if
     * an EMR CloudWatch metric is specified, specify 300.
     */
    public fun period(): Duration

    /**
     * The statistic to apply to the metric associated with the alarm.
     *
     * Default: CloudWatchAlarmStatistic.AVERAGE
     */
    public fun statistic(): CloudWatchAlarmStatistic? =
        unwrap(this).getStatistic()?.let(CloudWatchAlarmStatistic::wrap)

    /**
     * The value against which the specified statistic is compared.
     *
     * Default: - None
     */
    public fun threshold(): Number? = unwrap(this).getThreshold()

    /**
     * The unit of measure associated with the CloudWatch metric being watched.
     *
     * The value specified for Unit must correspond to the units
     * specified in the CloudWatch metric.
     *
     * Default: CloudWatchAlarmUnit.NONE
     */
    public fun unit(): CloudWatchAlarmUnit? = unwrap(this).getUnit()?.let(CloudWatchAlarmUnit::wrap)

    /**
     * A builder for [CloudWatchAlarmDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator Determines how the metric specified by MetricName is compared to
       * the value specified by Threshold. 
       */
      public fun comparisonOperator(comparisonOperator: CloudWatchAlarmComparisonOperator)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(dimensions: List<MetricDimensionProperty>)

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      public fun dimensions(vararg dimensions: MetricDimensionProperty)

      /**
       * @param evaluationPeriods The number of periods, in five-minute increments, during which the
       * alarm condition must exist before the alarm triggers automatic scaling activity.
       */
      public fun evaluationPeriods(evaluationPeriods: Number)

      /**
       * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
       * condition. 
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace for the CloudWatch metric.
       */
      public fun namespace(namespace: String)

      /**
       * @param period The period, in seconds, over which the statistic is applied. 
       * EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if
       * an EMR CloudWatch metric is specified, specify 300.
       */
      public fun period(period: Duration)

      /**
       * @param statistic The statistic to apply to the metric associated with the alarm.
       */
      public fun statistic(statistic: CloudWatchAlarmStatistic)

      /**
       * @param threshold The value against which the specified statistic is compared.
       */
      public fun threshold(threshold: Number)

      /**
       * @param unit The unit of measure associated with the CloudWatch metric being watched.
       * The value specified for Unit must correspond to the units
       * specified in the CloudWatch metric.
       */
      public fun unit(unit: CloudWatchAlarmUnit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.builder()

      /**
       * @param comparisonOperator Determines how the metric specified by MetricName is compared to
       * the value specified by Threshold. 
       */
      override fun comparisonOperator(comparisonOperator: CloudWatchAlarmComparisonOperator) {
        cdkBuilder.comparisonOperator(comparisonOperator.let(CloudWatchAlarmComparisonOperator::unwrap))
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(dimensions: List<MetricDimensionProperty>) {
        cdkBuilder.dimensions(dimensions.map(MetricDimensionProperty::unwrap))
      }

      /**
       * @param dimensions A CloudWatch metric dimension.
       */
      override fun dimensions(vararg dimensions: MetricDimensionProperty): Unit =
          dimensions(dimensions.toList())

      /**
       * @param evaluationPeriods The number of periods, in five-minute increments, during which the
       * alarm condition must exist before the alarm triggers automatic scaling activity.
       */
      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      /**
       * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
       * condition. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace for the CloudWatch metric.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param period The period, in seconds, over which the statistic is applied. 
       * EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if
       * an EMR CloudWatch metric is specified, specify 300.
       */
      override fun period(period: Duration) {
        cdkBuilder.period(period.let(Duration::unwrap))
      }

      /**
       * @param statistic The statistic to apply to the metric associated with the alarm.
       */
      override fun statistic(statistic: CloudWatchAlarmStatistic) {
        cdkBuilder.statistic(statistic.let(CloudWatchAlarmStatistic::unwrap))
      }

      /**
       * @param threshold The value against which the specified statistic is compared.
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param unit The unit of measure associated with the CloudWatch metric being watched.
       * The value specified for Unit must correspond to the units
       * specified in the CloudWatch metric.
       */
      override fun unit(unit: CloudWatchAlarmUnit) {
        cdkBuilder.unit(unit.let(CloudWatchAlarmUnit::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty,
    ) : CdkObject(cdkObject), CloudWatchAlarmDefinitionProperty {
      /**
       * Determines how the metric specified by MetricName is compared to the value specified by
       * Threshold.
       */
      override fun comparisonOperator(): CloudWatchAlarmComparisonOperator =
          unwrap(this).getComparisonOperator().let(CloudWatchAlarmComparisonOperator::wrap)

      /**
       * A CloudWatch metric dimension.
       *
       * Default: - No dimensions
       */
      override fun dimensions(): List<MetricDimensionProperty> =
          unwrap(this).getDimensions()?.map(MetricDimensionProperty::wrap) ?: emptyList()

      /**
       * The number of periods, in five-minute increments, during which the alarm condition must
       * exist before the alarm triggers automatic scaling activity.
       *
       * Default: 1
       */
      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      /**
       * The name of the CloudWatch metric that is watched to determine an alarm condition.
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The namespace for the CloudWatch metric.
       *
       * Default: 'AWS/ElasticMapReduce'
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The period, in seconds, over which the statistic is applied.
       *
       * EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if
       * an EMR CloudWatch metric is specified, specify 300.
       */
      override fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

      /**
       * The statistic to apply to the metric associated with the alarm.
       *
       * Default: CloudWatchAlarmStatistic.AVERAGE
       */
      override fun statistic(): CloudWatchAlarmStatistic? =
          unwrap(this).getStatistic()?.let(CloudWatchAlarmStatistic::wrap)

      /**
       * The value against which the specified statistic is compared.
       *
       * Default: - None
       */
      override fun threshold(): Number? = unwrap(this).getThreshold()

      /**
       * The unit of measure associated with the CloudWatch metric being watched.
       *
       * The value specified for Unit must correspond to the units
       * specified in the CloudWatch metric.
       *
       * Default: CloudWatchAlarmUnit.NONE
       */
      override fun unit(): CloudWatchAlarmUnit? =
          unwrap(this).getUnit()?.let(CloudWatchAlarmUnit::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchAlarmDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty):
          CloudWatchAlarmDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchAlarmDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchAlarmDefinitionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty
    }
  }

  /**
   * A specification of the number and type of Amazon EC2 instances.
   *
   * See the RunJobFlow API for complete documentation on input parameters
   *
   * Example:
   *
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
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_JobFlowInstancesConfig.html)
   */
  public interface InstancesConfigProperty {
    /**
     * A list of additional Amazon EC2 security group IDs for the master node.
     *
     * Default: - None
     */
    public fun additionalMasterSecurityGroups(): List<String> =
        unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

    /**
     * A list of additional Amazon EC2 security group IDs for the core and task nodes.
     *
     * Default: - None
     */
    public fun additionalSlaveSecurityGroups(): List<String> =
        unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

    /**
     * The name of the EC2 key pair that can be used to ssh to the master node as the user called
     * "hadoop.".
     *
     * Default: - None
     */
    public fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

    /**
     * Applies to clusters that use the uniform instance group configuration.
     *
     * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC),
     * set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to
     * launch.
     *
     * Default: EMR selected default
     */
    public fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

    /**
     * Applies to clusters that use the instance fleet configuration.
     *
     * When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
     * launches instances in the optimal subnet.
     *
     * Default: EMR selected default
     */
    public fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

    /**
     * The identifier of the Amazon EC2 security group for the master node.
     *
     * Default: - None
     */
    public fun emrManagedMasterSecurityGroup(): String? =
        unwrap(this).getEmrManagedMasterSecurityGroup()

    /**
     * The identifier of the Amazon EC2 security group for the core and task nodes.
     *
     * Default: - None
     */
    public fun emrManagedSlaveSecurityGroup(): String? =
        unwrap(this).getEmrManagedSlaveSecurityGroup()

    /**
     * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop version for the
     * cluster.
     *
     * Default: - 0.18 if the AmiVersion parameter is not set. If AmiVersion is set, the version of
     * Hadoop for that AMI version is used.
     */
    public fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

    /**
     * The number of EC2 instances in the cluster.
     *
     * Default: 0
     */
    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    /**
     * Describes the EC2 instances and instance configurations for clusters that use the instance
     * fleet configuration.
     *
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
     * excluding 5.0.x versions.
     *
     * Default: - None
     */
    public fun instanceFleets(): List<InstanceFleetConfigProperty> =
        unwrap(this).getInstanceFleets()?.map(InstanceFleetConfigProperty::wrap) ?: emptyList()

    /**
     * Configuration for the instance groups in a cluster.
     *
     * Default: - None
     */
    public fun instanceGroups(): List<InstanceGroupConfigProperty> =
        unwrap(this).getInstanceGroups()?.map(InstanceGroupConfigProperty::wrap) ?: emptyList()

    /**
     * The EC2 instance type of the master node.
     *
     * Default: - None
     */
    public fun masterInstanceType(): String? = unwrap(this).getMasterInstanceType()

    /**
     * The Availability Zone in which the cluster runs.
     *
     * Default: - EMR selected default
     */
    public fun placement(): PlacementTypeProperty? =
        unwrap(this).getPlacement()?.let(PlacementTypeProperty::wrap)

    /**
     * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters
     * in VPC private subnets.
     *
     * Default: - None
     */
    public fun serviceAccessSecurityGroup(): String? = unwrap(this).getServiceAccessSecurityGroup()

    /**
     * The EC2 instance type of the core and task nodes.
     *
     * Default: - None
     */
    public fun slaveInstanceType(): String? = unwrap(this).getSlaveInstanceType()

    /**
     * Specifies whether to lock the cluster to prevent the Amazon EC2 instances from being
     * terminated by API call, user intervention, or in the event of a job-flow error.
     *
     * Default: false
     */
    public fun terminationProtected(): Boolean? = unwrap(this).getTerminationProtected()

    /**
     * A builder for [InstancesConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      public fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>)

      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      public fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String)

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      public fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>)

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      public fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String)

      /**
       * @param ec2KeyName The name of the EC2 key pair that can be used to ssh to the master node
       * as the user called "hadoop.".
       */
      public fun ec2KeyName(ec2KeyName: String)

      /**
       * @param ec2SubnetId Applies to clusters that use the uniform instance group configuration.
       * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC),
       * set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to
       * launch.
       */
      public fun ec2SubnetId(ec2SubnetId: String)

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
       * launches instances in the optimal subnet.
       */
      public fun ec2SubnetIds(ec2SubnetIds: List<String>)

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
       * launches instances in the optimal subnet.
       */
      public fun ec2SubnetIds(vararg ec2SubnetIds: String)

      /**
       * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group for
       * the master node.
       */
      public fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String)

      /**
       * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group for the
       * core and task nodes.
       */
      public fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String)

      /**
       * @param hadoopVersion Applies only to Amazon EMR release versions earlier than 4.0. The
       * Hadoop version for the cluster.
       */
      public fun hadoopVersion(hadoopVersion: String)

      /**
       * @param instanceCount The number of EC2 instances in the cluster.
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceFleets Describes the EC2 instances and instance configurations for clusters
       * that use the instance fleet configuration.
       * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      public fun instanceFleets(instanceFleets: List<InstanceFleetConfigProperty>)

      /**
       * @param instanceFleets Describes the EC2 instances and instance configurations for clusters
       * that use the instance fleet configuration.
       * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      public fun instanceFleets(vararg instanceFleets: InstanceFleetConfigProperty)

      /**
       * @param instanceGroups Configuration for the instance groups in a cluster.
       */
      public fun instanceGroups(instanceGroups: List<InstanceGroupConfigProperty>)

      /**
       * @param instanceGroups Configuration for the instance groups in a cluster.
       */
      public fun instanceGroups(vararg instanceGroups: InstanceGroupConfigProperty)

      /**
       * @param masterInstanceType The EC2 instance type of the master node.
       */
      public fun masterInstanceType(masterInstanceType: String)

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      public fun placement(placement: PlacementTypeProperty)

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3b0f389fd006aec3b704b161d2f4aadc8aa927fc43eb4badeb7b51c29ca11f")
      public fun placement(placement: PlacementTypeProperty.Builder.() -> Unit)

      /**
       * @param serviceAccessSecurityGroup The identifier of the Amazon EC2 security group for the
       * Amazon EMR service to access clusters in VPC private subnets.
       */
      public fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String)

      /**
       * @param slaveInstanceType The EC2 instance type of the core and task nodes.
       */
      public fun slaveInstanceType(slaveInstanceType: String)

      /**
       * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
       * instances from being terminated by API call, user intervention, or in the event of a job-flow
       * error.
       */
      public fun terminationProtected(terminationProtected: Boolean)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty.builder()

      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      override fun additionalMasterSecurityGroups(additionalMasterSecurityGroups: List<String>) {
        cdkBuilder.additionalMasterSecurityGroups(additionalMasterSecurityGroups)
      }

      /**
       * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs
       * for the master node.
       */
      override fun additionalMasterSecurityGroups(vararg additionalMasterSecurityGroups: String):
          Unit = additionalMasterSecurityGroups(additionalMasterSecurityGroups.toList())

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      override fun additionalSlaveSecurityGroups(additionalSlaveSecurityGroups: List<String>) {
        cdkBuilder.additionalSlaveSecurityGroups(additionalSlaveSecurityGroups)
      }

      /**
       * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for
       * the core and task nodes.
       */
      override fun additionalSlaveSecurityGroups(vararg additionalSlaveSecurityGroups: String): Unit
          = additionalSlaveSecurityGroups(additionalSlaveSecurityGroups.toList())

      /**
       * @param ec2KeyName The name of the EC2 key pair that can be used to ssh to the master node
       * as the user called "hadoop.".
       */
      override fun ec2KeyName(ec2KeyName: String) {
        cdkBuilder.ec2KeyName(ec2KeyName)
      }

      /**
       * @param ec2SubnetId Applies to clusters that use the uniform instance group configuration.
       * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC),
       * set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to
       * launch.
       */
      override fun ec2SubnetId(ec2SubnetId: String) {
        cdkBuilder.ec2SubnetId(ec2SubnetId)
      }

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
       * launches instances in the optimal subnet.
       */
      override fun ec2SubnetIds(ec2SubnetIds: List<String>) {
        cdkBuilder.ec2SubnetIds(ec2SubnetIds)
      }

      /**
       * @param ec2SubnetIds Applies to clusters that use the instance fleet configuration.
       * When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
       * launches instances in the optimal subnet.
       */
      override fun ec2SubnetIds(vararg ec2SubnetIds: String): Unit =
          ec2SubnetIds(ec2SubnetIds.toList())

      /**
       * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group for
       * the master node.
       */
      override fun emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup: String) {
        cdkBuilder.emrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup)
      }

      /**
       * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group for the
       * core and task nodes.
       */
      override fun emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup: String) {
        cdkBuilder.emrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup)
      }

      /**
       * @param hadoopVersion Applies only to Amazon EMR release versions earlier than 4.0. The
       * Hadoop version for the cluster.
       */
      override fun hadoopVersion(hadoopVersion: String) {
        cdkBuilder.hadoopVersion(hadoopVersion)
      }

      /**
       * @param instanceCount The number of EC2 instances in the cluster.
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceFleets Describes the EC2 instances and instance configurations for clusters
       * that use the instance fleet configuration.
       * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      override fun instanceFleets(instanceFleets: List<InstanceFleetConfigProperty>) {
        cdkBuilder.instanceFleets(instanceFleets.map(InstanceFleetConfigProperty::unwrap))
      }

      /**
       * @param instanceFleets Describes the EC2 instances and instance configurations for clusters
       * that use the instance fleet configuration.
       * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
       * excluding 5.0.x versions.
       */
      override fun instanceFleets(vararg instanceFleets: InstanceFleetConfigProperty): Unit =
          instanceFleets(instanceFleets.toList())

      /**
       * @param instanceGroups Configuration for the instance groups in a cluster.
       */
      override fun instanceGroups(instanceGroups: List<InstanceGroupConfigProperty>) {
        cdkBuilder.instanceGroups(instanceGroups.map(InstanceGroupConfigProperty::unwrap))
      }

      /**
       * @param instanceGroups Configuration for the instance groups in a cluster.
       */
      override fun instanceGroups(vararg instanceGroups: InstanceGroupConfigProperty): Unit =
          instanceGroups(instanceGroups.toList())

      /**
       * @param masterInstanceType The EC2 instance type of the master node.
       */
      override fun masterInstanceType(masterInstanceType: String) {
        cdkBuilder.masterInstanceType(masterInstanceType)
      }

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      override fun placement(placement: PlacementTypeProperty) {
        cdkBuilder.placement(placement.let(PlacementTypeProperty::unwrap))
      }

      /**
       * @param placement The Availability Zone in which the cluster runs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3b0f389fd006aec3b704b161d2f4aadc8aa927fc43eb4badeb7b51c29ca11f")
      override fun placement(placement: PlacementTypeProperty.Builder.() -> Unit): Unit =
          placement(PlacementTypeProperty(placement))

      /**
       * @param serviceAccessSecurityGroup The identifier of the Amazon EC2 security group for the
       * Amazon EMR service to access clusters in VPC private subnets.
       */
      override fun serviceAccessSecurityGroup(serviceAccessSecurityGroup: String) {
        cdkBuilder.serviceAccessSecurityGroup(serviceAccessSecurityGroup)
      }

      /**
       * @param slaveInstanceType The EC2 instance type of the core and task nodes.
       */
      override fun slaveInstanceType(slaveInstanceType: String) {
        cdkBuilder.slaveInstanceType(slaveInstanceType)
      }

      /**
       * @param terminationProtected Specifies whether to lock the cluster to prevent the Amazon EC2
       * instances from being terminated by API call, user intervention, or in the event of a job-flow
       * error.
       */
      override fun terminationProtected(terminationProtected: Boolean) {
        cdkBuilder.terminationProtected(terminationProtected)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty,
    ) : CdkObject(cdkObject), InstancesConfigProperty {
      /**
       * A list of additional Amazon EC2 security group IDs for the master node.
       *
       * Default: - None
       */
      override fun additionalMasterSecurityGroups(): List<String> =
          unwrap(this).getAdditionalMasterSecurityGroups() ?: emptyList()

      /**
       * A list of additional Amazon EC2 security group IDs for the core and task nodes.
       *
       * Default: - None
       */
      override fun additionalSlaveSecurityGroups(): List<String> =
          unwrap(this).getAdditionalSlaveSecurityGroups() ?: emptyList()

      /**
       * The name of the EC2 key pair that can be used to ssh to the master node as the user called
       * "hadoop.".
       *
       * Default: - None
       */
      override fun ec2KeyName(): String? = unwrap(this).getEc2KeyName()

      /**
       * Applies to clusters that use the uniform instance group configuration.
       *
       * To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC),
       * set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to
       * launch.
       *
       * Default: EMR selected default
       */
      override fun ec2SubnetId(): String? = unwrap(this).getEc2SubnetId()

      /**
       * Applies to clusters that use the instance fleet configuration.
       *
       * When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and
       * launches instances in the optimal subnet.
       *
       * Default: EMR selected default
       */
      override fun ec2SubnetIds(): List<String> = unwrap(this).getEc2SubnetIds() ?: emptyList()

      /**
       * The identifier of the Amazon EC2 security group for the master node.
       *
       * Default: - None
       */
      override fun emrManagedMasterSecurityGroup(): String? =
          unwrap(this).getEmrManagedMasterSecurityGroup()

      /**
       * The identifier of the Amazon EC2 security group for the core and task nodes.
       *
       * Default: - None
       */
      override fun emrManagedSlaveSecurityGroup(): String? =
          unwrap(this).getEmrManagedSlaveSecurityGroup()

      /**
       * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop version for the
       * cluster.
       *
       * Default: - 0.18 if the AmiVersion parameter is not set. If AmiVersion is set, the version
       * of Hadoop for that AMI version is used.
       */
      override fun hadoopVersion(): String? = unwrap(this).getHadoopVersion()

      /**
       * The number of EC2 instances in the cluster.
       *
       * Default: 0
       */
      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      /**
       * Describes the EC2 instances and instance configurations for clusters that use the instance
       * fleet configuration.
       *
       * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later,
       * excluding 5.0.x versions.
       *
       * Default: - None
       */
      override fun instanceFleets(): List<InstanceFleetConfigProperty> =
          unwrap(this).getInstanceFleets()?.map(InstanceFleetConfigProperty::wrap) ?: emptyList()

      /**
       * Configuration for the instance groups in a cluster.
       *
       * Default: - None
       */
      override fun instanceGroups(): List<InstanceGroupConfigProperty> =
          unwrap(this).getInstanceGroups()?.map(InstanceGroupConfigProperty::wrap) ?: emptyList()

      /**
       * The EC2 instance type of the master node.
       *
       * Default: - None
       */
      override fun masterInstanceType(): String? = unwrap(this).getMasterInstanceType()

      /**
       * The Availability Zone in which the cluster runs.
       *
       * Default: - EMR selected default
       */
      override fun placement(): PlacementTypeProperty? =
          unwrap(this).getPlacement()?.let(PlacementTypeProperty::wrap)

      /**
       * The identifier of the Amazon EC2 security group for the Amazon EMR service to access
       * clusters in VPC private subnets.
       *
       * Default: - None
       */
      override fun serviceAccessSecurityGroup(): String? =
          unwrap(this).getServiceAccessSecurityGroup()

      /**
       * The EC2 instance type of the core and task nodes.
       *
       * Default: - None
       */
      override fun slaveInstanceType(): String? = unwrap(this).getSlaveInstanceType()

      /**
       * Specifies whether to lock the cluster to prevent the Amazon EC2 instances from being
       * terminated by API call, user intervention, or in the event of a job-flow error.
       *
       * Default: false
       */
      override fun terminationProtected(): Boolean? = unwrap(this).getTerminationProtected()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstancesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty):
          InstancesConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? InstancesConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstancesConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstancesConfigProperty
    }
  }

  public enum class InstanceMarket(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket,
  ) {
    ON_DEMAND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.ON_DEMAND),
    SPOT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.SPOT),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket):
          InstanceMarket = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.ON_DEMAND ->
            InstanceMarket.ON_DEMAND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket.SPOT ->
            InstanceMarket.SPOT
      }

      internal fun unwrap(wrapped: InstanceMarket):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceMarket =
          wrapped.cdkObject
    }
  }

  /**
   * The conditions that trigger an automatic scaling activity and the definition of a CloudWatch
   * metric alarm.
   *
   * When the defined alarm conditions are met along with other trigger parameters, scaling activity
   * begins.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ScalingTriggerProperty scalingTriggerProperty = ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
   * .metricName("metricName")
   * .period(Duration.minutes(30))
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
   * .threshold(123)
   * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingTrigger.html)
   */
  public interface ScalingTriggerProperty {
    /**
     * The definition of a CloudWatch metric alarm.
     *
     * When the defined alarm conditions are met along with other trigger parameters,
     * scaling activity begins.
     */
    public fun cloudWatchAlarmDefinition(): CloudWatchAlarmDefinitionProperty

    /**
     * A builder for [ScalingTriggerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters,
       * scaling activity begins.
       */
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty)

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters,
       * scaling activity begins.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c5143f0f368b10f8293c7c19139035f9e5f156e01d3eb4a4af5de4067bfb8bd")
      public
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty.builder()

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters,
       * scaling activity begins.
       */
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition.let(CloudWatchAlarmDefinitionProperty::unwrap))
      }

      /**
       * @param cloudWatchAlarmDefinition The definition of a CloudWatch metric alarm. 
       * When the defined alarm conditions are met along with other trigger parameters,
       * scaling activity begins.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c5143f0f368b10f8293c7c19139035f9e5f156e01d3eb4a4af5de4067bfb8bd")
      override
          fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CloudWatchAlarmDefinitionProperty.Builder.() -> Unit):
          Unit =
          cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty(cloudWatchAlarmDefinition))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty,
    ) : CdkObject(cdkObject), ScalingTriggerProperty {
      /**
       * The definition of a CloudWatch metric alarm.
       *
       * When the defined alarm conditions are met along with other trigger parameters,
       * scaling activity begins.
       */
      override fun cloudWatchAlarmDefinition(): CloudWatchAlarmDefinitionProperty =
          unwrap(this).getCloudWatchAlarmDefinition().let(CloudWatchAlarmDefinitionProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingTriggerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty):
          ScalingTriggerProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingTriggerProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingTriggerProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingTriggerProperty
    }
  }

  public enum class InstanceRoleType(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType,
  ) {
    MASTER(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.MASTER),
    CORE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.CORE),
    TASK(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.TASK),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType):
          InstanceRoleType = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.MASTER ->
            InstanceRoleType.MASTER
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.CORE ->
            InstanceRoleType.CORE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType.TASK ->
            InstanceRoleType.TASK
      }

      internal fun unwrap(wrapped: InstanceRoleType):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceRoleType =
          wrapped.cdkObject
    }
  }

  /**
   * The launch specification for On-Demand and Spot instances in the fleet, which determines the
   * defined duration and provisioning timeout behavior, and allocation strategy.
   *
   * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
   * excluding 5.0.x versions.
   * On-Demand and Spot instance allocation strategies are available in Amazon EMR releases 5.12.1
   * and later.
   *
   * Example:
   *
   * ```
   * EmrCreateCluster.Builder.create(this, "OnDemandSpecification")
   * .instances(InstancesConfigProperty.builder()
   * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
   * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
   * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
   * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
   * .allocationStrategy(EmrCreateCluster.getOnDemandAllocationStrategy().LOWEST_PRICE)
   * .build())
   * .build())
   * .build()))
   * .build())
   * .name("OnDemandCluster")
   * .integrationPattern(IntegrationPattern.RUN_JOB)
   * .build();
   * EmrCreateCluster.Builder.create(this, "SpotSpecification")
   * .instances(InstancesConfigProperty.builder()
   * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
   * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
   * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
   * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().TERMINATE_CLUSTER)
   * .timeout(Duration.minutes(5))
   * .build())
   * .build())
   * .build()))
   * .build())
   * .name("SpotCluster")
   * .integrationPattern(IntegrationPattern.RUN_JOB)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceFleetProvisioningSpecifications.html)
   */
  public interface InstanceFleetProvisioningSpecificationsProperty {
    /**
     * The launch specification for On-Demand Instances in the instance fleet, which determines the
     * allocation strategy.
     *
     * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
     * excluding 5.0.x versions.
     * On-Demand Instances allocation strategy is available in Amazon EMR releases 5.12.1 and later.
     *
     * Default: - no on-demand specification
     */
    public fun onDemandSpecification(): OnDemandProvisioningSpecificationProperty? =
        unwrap(this).getOnDemandSpecification()?.let(OnDemandProvisioningSpecificationProperty::wrap)

    /**
     * The launch specification for Spot instances in the fleet, which determines the defined
     * duration and provisioning timeout behavior.
     *
     * Default: - no spot specification
     */
    public fun spotSpecification(): SpotProvisioningSpecificationProperty? =
        unwrap(this).getSpotSpecification()?.let(SpotProvisioningSpecificationProperty::wrap)

    /**
     * A builder for [InstanceFleetProvisioningSpecificationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       * On-Demand Instances allocation strategy is available in Amazon EMR releases 5.12.1 and
       * later.
       */
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty)

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       * On-Demand Instances allocation strategy is available in Amazon EMR releases 5.12.1 and
       * later.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cc5c6e36111350c146653cc34d554ba1cb7c4998de9d5153e62997276118c5d")
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration and provisioning timeout behavior.
       */
      public fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty)

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration and provisioning timeout behavior.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb28faea62562f38e013d4b232ac177ef55ad2d2f527c7520bd0752b03f014d1")
      public
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       * On-Demand Instances allocation strategy is available in Amazon EMR releases 5.12.1 and
       * later.
       */
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(OnDemandProvisioningSpecificationProperty::unwrap))
      }

      /**
       * @param onDemandSpecification The launch specification for On-Demand Instances in the
       * instance fleet, which determines the allocation strategy.
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       * On-Demand Instances allocation strategy is available in Amazon EMR releases 5.12.1 and
       * later.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2cc5c6e36111350c146653cc34d554ba1cb7c4998de9d5153e62997276118c5d")
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit =
          onDemandSpecification(OnDemandProvisioningSpecificationProperty(onDemandSpecification))

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration and provisioning timeout behavior.
       */
      override fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification.let(SpotProvisioningSpecificationProperty::unwrap))
      }

      /**
       * @param spotSpecification The launch specification for Spot instances in the fleet, which
       * determines the defined duration and provisioning timeout behavior.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb28faea62562f38e013d4b232ac177ef55ad2d2f527c7520bd0752b03f014d1")
      override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit = spotSpecification(SpotProvisioningSpecificationProperty(spotSpecification))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty,
    ) : CdkObject(cdkObject), InstanceFleetProvisioningSpecificationsProperty {
      /**
       * The launch specification for On-Demand Instances in the instance fleet, which determines
       * the allocation strategy.
       *
       * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
       * excluding 5.0.x versions.
       * On-Demand Instances allocation strategy is available in Amazon EMR releases 5.12.1 and
       * later.
       *
       * Default: - no on-demand specification
       */
      override fun onDemandSpecification(): OnDemandProvisioningSpecificationProperty? =
          unwrap(this).getOnDemandSpecification()?.let(OnDemandProvisioningSpecificationProperty::wrap)

      /**
       * The launch specification for Spot instances in the fleet, which determines the defined
       * duration and provisioning timeout behavior.
       *
       * Default: - no spot specification
       */
      override fun spotSpecification(): SpotProvisioningSpecificationProperty? =
          unwrap(this).getSpotSpecification()?.let(SpotProvisioningSpecificationProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceFleetProvisioningSpecificationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty):
          InstanceFleetProvisioningSpecificationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceFleetProvisioningSpecificationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetProvisioningSpecificationsProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty
    }
  }

  /**
   * The configuration that defines an instance fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ConfigurationProperty configurationProperty_;
   * Size size;
   * InstanceFleetConfigProperty instanceFleetConfigProperty = InstanceFleetConfigProperty.builder()
   * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
   * // the properties below are optional
   * .instanceTypeConfigs(List.of(InstanceTypeConfigProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .bidPrice("bidPrice")
   * .bidPriceAsPercentageOfOnDemandPrice(123)
   * .configurations(List.of(ConfigurationProperty.builder()
   * .classification("classification")
   * .configurations(List.of(configurationProperty_))
   * .properties(Map.of(
   * "propertiesKey", "properties"))
   * .build()))
   * .ebsConfiguration(EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .volumeSize(size)
   * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
   * // the properties below are optional
   * .iops(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build())
   * .weightedCapacity(123)
   * .build()))
   * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
   * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
   * .allocationStrategy(EmrCreateCluster.getOnDemandAllocationStrategy().LOWEST_PRICE)
   * .build())
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().SWITCH_TO_ON_DEMAND)
   * // the properties below are optional
   * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
   * .blockDurationMinutes(123)
   * .timeout(Duration.minutes(30))
   * .timeoutDurationMinutes(123)
   * .build())
   * .build())
   * .name("name")
   * .targetOnDemandCapacity(123)
   * .targetSpotCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceFleetConfig.html)
   */
  public interface InstanceFleetConfigProperty {
    /**
     * The node type that the instance fleet hosts.
     *
     * Valid values are MASTER,CORE,and TASK.
     */
    public fun instanceFleetType(): InstanceRoleType

    /**
     * The instance type configurations that define the EC2 instances in the instance fleet.
     *
     * Default: No instanceTpeConfigs
     */
    public fun instanceTypeConfigs(): List<InstanceTypeConfigProperty> =
        unwrap(this).getInstanceTypeConfigs()?.map(InstanceTypeConfigProperty::wrap) ?: emptyList()

    /**
     * The launch specification for the instance fleet.
     *
     * Default: No launchSpecifications
     */
    public fun launchSpecifications(): InstanceFleetProvisioningSpecificationsProperty? =
        unwrap(this).getLaunchSpecifications()?.let(InstanceFleetProvisioningSpecificationsProperty::wrap)

    /**
     * The friendly name of the instance fleet.
     *
     * Default: No name
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The target capacity of On-Demand units for the instance fleet, which determines how many
     * On-Demand instances to provision.
     *
     * If not specified or set to 0, only Spot Instances are provisioned for the instance fleet
     * using `targetSpotCapacity`.
     *
     * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
     * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
     * can be specified, and its value
     * must be 1.
     *
     * Default: No targetOnDemandCapacity
     */
    public fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

    /**
     * The target capacity of Spot units for the instance fleet, which determines how many Spot
     * instances to provision.
     *
     * If not specified or set to 0, only On-Demand Instances are provisioned for the instance fleet
     * using `targetOnDemandCapacity`.
     *
     * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
     * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
     * can be specified, and its value
     * must be 1.
     *
     * Default: No targetSpotCapacity
     */
    public fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

    /**
     * A builder for [InstanceFleetConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceFleetType The node type that the instance fleet hosts. 
       * Valid values are MASTER,CORE,and TASK.
       */
      public fun instanceFleetType(instanceFleetType: InstanceRoleType)

      /**
       * @param instanceTypeConfigs The instance type configurations that define the EC2 instances
       * in the instance fleet.
       */
      public fun instanceTypeConfigs(instanceTypeConfigs: List<InstanceTypeConfigProperty>)

      /**
       * @param instanceTypeConfigs The instance type configurations that define the EC2 instances
       * in the instance fleet.
       */
      public fun instanceTypeConfigs(vararg instanceTypeConfigs: InstanceTypeConfigProperty)

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty)

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb2478130551805471ecf26441a7e34a3479fc96116d2c647f7b4de2d1ba04fc")
      public
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

      /**
       * @param name The friendly name of the instance fleet.
       */
      public fun name(name: String)

      /**
       * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance
       * fleet, which determines how many On-Demand instances to provision.
       * If not specified or set to 0, only Spot Instances are provisioned for the instance fleet
       * using `targetSpotCapacity`.
       *
       * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
       * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
       * can be specified, and its value
       * must be 1.
       */
      public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

      /**
       * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
       * determines how many Spot instances to provision.
       * If not specified or set to 0, only On-Demand Instances are provisioned for the instance
       * fleet using `targetOnDemandCapacity`.
       *
       * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
       * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
       * can be specified, and its value
       * must be 1.
       */
      public fun targetSpotCapacity(targetSpotCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty.builder()

      /**
       * @param instanceFleetType The node type that the instance fleet hosts. 
       * Valid values are MASTER,CORE,and TASK.
       */
      override fun instanceFleetType(instanceFleetType: InstanceRoleType) {
        cdkBuilder.instanceFleetType(instanceFleetType.let(InstanceRoleType::unwrap))
      }

      /**
       * @param instanceTypeConfigs The instance type configurations that define the EC2 instances
       * in the instance fleet.
       */
      override fun instanceTypeConfigs(instanceTypeConfigs: List<InstanceTypeConfigProperty>) {
        cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.map(InstanceTypeConfigProperty::unwrap))
      }

      /**
       * @param instanceTypeConfigs The instance type configurations that define the EC2 instances
       * in the instance fleet.
       */
      override fun instanceTypeConfigs(vararg instanceTypeConfigs: InstanceTypeConfigProperty): Unit
          = instanceTypeConfigs(instanceTypeConfigs.toList())

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
      }

      /**
       * @param launchSpecifications The launch specification for the instance fleet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb2478130551805471ecf26441a7e34a3479fc96116d2c647f7b4de2d1ba04fc")
      override
          fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
          Unit =
          launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

      /**
       * @param name The friendly name of the instance fleet.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param targetOnDemandCapacity The target capacity of On-Demand units for the instance
       * fleet, which determines how many On-Demand instances to provision.
       * If not specified or set to 0, only Spot Instances are provisioned for the instance fleet
       * using `targetSpotCapacity`.
       *
       * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
       * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
       * can be specified, and its value
       * must be 1.
       */
      override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
        cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
      }

      /**
       * @param targetSpotCapacity The target capacity of Spot units for the instance fleet, which
       * determines how many Spot instances to provision.
       * If not specified or set to 0, only On-Demand Instances are provisioned for the instance
       * fleet using `targetOnDemandCapacity`.
       *
       * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
       * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
       * can be specified, and its value
       * must be 1.
       */
      override fun targetSpotCapacity(targetSpotCapacity: Number) {
        cdkBuilder.targetSpotCapacity(targetSpotCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty,
    ) : CdkObject(cdkObject), InstanceFleetConfigProperty {
      /**
       * The node type that the instance fleet hosts.
       *
       * Valid values are MASTER,CORE,and TASK.
       */
      override fun instanceFleetType(): InstanceRoleType =
          unwrap(this).getInstanceFleetType().let(InstanceRoleType::wrap)

      /**
       * The instance type configurations that define the EC2 instances in the instance fleet.
       *
       * Default: No instanceTpeConfigs
       */
      override fun instanceTypeConfigs(): List<InstanceTypeConfigProperty> =
          unwrap(this).getInstanceTypeConfigs()?.map(InstanceTypeConfigProperty::wrap) ?:
          emptyList()

      /**
       * The launch specification for the instance fleet.
       *
       * Default: No launchSpecifications
       */
      override fun launchSpecifications(): InstanceFleetProvisioningSpecificationsProperty? =
          unwrap(this).getLaunchSpecifications()?.let(InstanceFleetProvisioningSpecificationsProperty::wrap)

      /**
       * The friendly name of the instance fleet.
       *
       * Default: No name
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The target capacity of On-Demand units for the instance fleet, which determines how many
       * On-Demand instances to provision.
       *
       * If not specified or set to 0, only Spot Instances are provisioned for the instance fleet
       * using `targetSpotCapacity`.
       *
       * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
       * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
       * can be specified, and its value
       * must be 1.
       *
       * Default: No targetOnDemandCapacity
       */
      override fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

      /**
       * The target capacity of Spot units for the instance fleet, which determines how many Spot
       * instances to provision.
       *
       * If not specified or set to 0, only On-Demand Instances are provisioned for the instance
       * fleet using `targetOnDemandCapacity`.
       *
       * At least one of `targetSpotCapacity` and `targetOnDemandCapacity` should be greater than 0.
       * For a master instance fleet, only one of `targetSpotCapacity` and `targetOnDemandCapacity`
       * can be specified, and its value
       * must be 1.
       *
       * Default: No targetSpotCapacity
       */
      override fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceFleetConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty):
          InstanceFleetConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceFleetConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.InstanceFleetConfigProperty
    }
  }

  public enum class CloudWatchAlarmStatistic(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic,
  ) {
    SAMPLE_COUNT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SAMPLE_COUNT),
    AVERAGE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.AVERAGE),
    SUM(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SUM),
    MINIMUM(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MINIMUM),
    MAXIMUM(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MAXIMUM),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic):
          CloudWatchAlarmStatistic = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SAMPLE_COUNT ->
            CloudWatchAlarmStatistic.SAMPLE_COUNT
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.AVERAGE ->
            CloudWatchAlarmStatistic.AVERAGE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SUM ->
            CloudWatchAlarmStatistic.SUM
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MINIMUM ->
            CloudWatchAlarmStatistic.MINIMUM
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MAXIMUM ->
            CloudWatchAlarmStatistic.MAXIMUM
      }

      internal fun unwrap(wrapped: CloudWatchAlarmStatistic):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic
          = wrapped.cdkObject
    }
  }

  /**
   * A CloudWatch dimension, which is specified using a Key (known as a Name in CloudWatch), Value
   * pair.
   *
   * By default, Amazon EMR uses
   * one dimension whose Key is JobFlowID and Value is a variable representing the cluster ID, which
   * is ${emr.clusterId}. This enables
   * the rule to bootstrap when the cluster ID becomes available
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_MetricDimension.html)
   */
  public interface MetricDimensionProperty {
    /**
     * The dimension name.
     */
    public fun key(): String

    /**
     * The dimension value.
     */
    public fun `value`(): String

    /**
     * A builder for [MetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The dimension name. 
       */
      public fun key(key: String)

      /**
       * @param value The dimension value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty.builder()

      /**
       * @param key The dimension name. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The dimension value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      /**
       * The dimension name.
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The dimension value.
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty):
          MetricDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty
    }
  }

  /**
   * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR
   * cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
   * .constraints(ScalingConstraintsProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build())
   * .rules(List.of(ScalingRuleProperty.builder()
   * .action(ScalingActionProperty.builder()
   * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
   * .metricName("metricName")
   * .period(Duration.minutes(30))
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
   * .threshold(123)
   * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_AutoScalingPolicy.html)
   */
  public interface AutoScalingPolicyProperty {
    /**
     * The upper and lower EC2 instance limits for an automatic scaling policy.
     *
     * Automatic scaling activity will not cause an instance
     * group to grow above or below these limits.
     */
    public fun constraints(): ScalingConstraintsProperty

    /**
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     */
    public fun rules(): List<ScalingRuleProperty>

    /**
     * A builder for [AutoScalingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy.
       * 
       * Automatic scaling activity will not cause an instance
       * group to grow above or below these limits.
       */
      public fun constraints(constraints: ScalingConstraintsProperty)

      /**
       * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy.
       * 
       * Automatic scaling activity will not cause an instance
       * group to grow above or below these limits.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fc13e916d8f62d76ddddc327ded07f986aa53a7deb5d169ecc47452ad10bcb")
      public fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(rules: List<ScalingRuleProperty>)

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      public fun rules(vararg rules: ScalingRuleProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty.builder()

      /**
       * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy.
       * 
       * Automatic scaling activity will not cause an instance
       * group to grow above or below these limits.
       */
      override fun constraints(constraints: ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints.let(ScalingConstraintsProperty::unwrap))
      }

      /**
       * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy.
       * 
       * Automatic scaling activity will not cause an instance
       * group to grow above or below these limits.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51fc13e916d8f62d76ddddc327ded07f986aa53a7deb5d169ecc47452ad10bcb")
      override fun constraints(constraints: ScalingConstraintsProperty.Builder.() -> Unit): Unit =
          constraints(ScalingConstraintsProperty(constraints))

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(rules: List<ScalingRuleProperty>) {
        cdkBuilder.rules(rules.map(ScalingRuleProperty::unwrap))
      }

      /**
       * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
       */
      override fun rules(vararg rules: ScalingRuleProperty): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty,
    ) : CdkObject(cdkObject), AutoScalingPolicyProperty {
      /**
       * The upper and lower EC2 instance limits for an automatic scaling policy.
       *
       * Automatic scaling activity will not cause an instance
       * group to grow above or below these limits.
       */
      override fun constraints(): ScalingConstraintsProperty =
          unwrap(this).getConstraints().let(ScalingConstraintsProperty::wrap)

      /**
       * The scale-in and scale-out rules that comprise the automatic scaling policy.
       */
      override fun rules(): List<ScalingRuleProperty> =
          unwrap(this).getRules().map(ScalingRuleProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoScalingPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.AutoScalingPolicyProperty
    }
  }

  public enum class OnDemandAllocationStrategy(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy,
  ) {
    LOWEST_PRICE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy.LOWEST_PRICE),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy):
          OnDemandAllocationStrategy = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy.LOWEST_PRICE ->
            OnDemandAllocationStrategy.LOWEST_PRICE
      }

      internal fun unwrap(wrapped: OnDemandAllocationStrategy):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandAllocationStrategy
          = wrapped.cdkObject
    }
  }

  public enum class SpotTimeoutAction(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction,
  ) {
    SWITCH_TO_ON_DEMAND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.SWITCH_TO_ON_DEMAND),
    TERMINATE_CLUSTER(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.TERMINATE_CLUSTER),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction):
          SpotTimeoutAction = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.SWITCH_TO_ON_DEMAND ->
            SpotTimeoutAction.SWITCH_TO_ON_DEMAND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction.TERMINATE_CLUSTER ->
            SpotTimeoutAction.TERMINATE_CLUSTER
      }

      internal fun unwrap(wrapped: SpotTimeoutAction):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotTimeoutAction =
          wrapped.cdkObject
    }
  }

  public enum class CloudWatchAlarmComparisonOperator(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator,
  ) {
    GREATER_THAN_OR_EQUAL(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN_OR_EQUAL),
    GREATER_THAN(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN),
    LESS_THAN(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN),
    LESS_THAN_OR_EQUAL(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN_OR_EQUAL),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator):
          CloudWatchAlarmComparisonOperator = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN_OR_EQUAL ->
            CloudWatchAlarmComparisonOperator.GREATER_THAN_OR_EQUAL
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN ->
            CloudWatchAlarmComparisonOperator.GREATER_THAN
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN ->
            CloudWatchAlarmComparisonOperator.LESS_THAN
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN_OR_EQUAL ->
            CloudWatchAlarmComparisonOperator.LESS_THAN_OR_EQUAL
      }

      internal fun unwrap(wrapped: CloudWatchAlarmComparisonOperator):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator
          = wrapped.cdkObject
    }
  }

  /**
   * The launch specification for Spot instances in the instance fleet, which determines the defined
   * duration and provisioning timeout behavior.
   *
   * Example:
   *
   * ```
   * EmrCreateCluster.Builder.create(this, "OnDemandSpecification")
   * .instances(InstancesConfigProperty.builder()
   * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
   * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
   * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
   * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
   * .allocationStrategy(EmrCreateCluster.getOnDemandAllocationStrategy().LOWEST_PRICE)
   * .build())
   * .build())
   * .build()))
   * .build())
   * .name("OnDemandCluster")
   * .integrationPattern(IntegrationPattern.RUN_JOB)
   * .build();
   * EmrCreateCluster.Builder.create(this, "SpotSpecification")
   * .instances(InstancesConfigProperty.builder()
   * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
   * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
   * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
   * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().TERMINATE_CLUSTER)
   * .timeout(Duration.minutes(5))
   * .build())
   * .build())
   * .build()))
   * .build())
   * .name("SpotCluster")
   * .integrationPattern(IntegrationPattern.RUN_JOB)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_SpotProvisioningSpecification.html)
   */
  public interface SpotProvisioningSpecificationProperty {
    /**
     * Specifies the strategy to use in launching Spot Instance fleets.
     *
     * Default: - No allocation strategy, i.e. spot instance type will be chosen based on current
     * price only
     */
    public fun allocationStrategy(): SpotAllocationStrategy? =
        unwrap(this).getAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

    /**
     * (deprecated) The defined duration for Spot instances (also known as Spot blocks) in minutes.
     *
     * Default: - No blockDurationMinutes
     *
     * * Spot Instances with a defined duration (also known as Spot blocks) are no longer available
     * to new customers from July 1, 2021.
     * For customers who have previously used the feature, we will continue to support Spot
     * Instances with a defined duration until December 31, 2022.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    /**
     * The spot provisioning timeout period in minutes.
     *
     * The value must be between 5 and 1440 minutes.
     *
     * You must specify one of `timeout` and `timeoutDurationMinutes`.
     *
     * Default: - The value in `timeoutDurationMinutes` is used
     */
    public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The action to take when TargetSpotCapacity has not been fulfilled when the
     * TimeoutDurationMinutes has expired.
     */
    public fun timeoutAction(): SpotTimeoutAction

    /**
     * (deprecated) The spot provisioning timeout period in minutes.
     *
     * The value must be between 5 and 1440 minutes.
     *
     * You must specify one of `timeout` and `timeoutDurationMinutes`.
     *
     * Default: - The value in `timeout` is used
     *
     * * Use `timeout`.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeoutDurationMinutes(): Number? = unwrap(this).getTimeoutDurationMinutes()

    /**
     * A builder for [SpotProvisioningSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy Specifies the strategy to use in launching Spot Instance fleets.
       */
      public fun allocationStrategy(allocationStrategy: SpotAllocationStrategy)

      /**
       * @param blockDurationMinutes The defined duration for Spot instances (also known as Spot
       * blocks) in minutes.
       * @deprecated - Spot Instances with a defined duration (also known as Spot blocks) are no
       * longer available to new customers from July 1, 2021.
       * For customers who have previously used the feature, we will continue to support Spot
       * Instances with a defined duration until December 31, 2022.
       */
      @Deprecated(message = "deprecated in CDK")
      public fun blockDurationMinutes(blockDurationMinutes: Number)

      /**
       * @param timeout The spot provisioning timeout period in minutes.
       * The value must be between 5 and 1440 minutes.
       *
       * You must specify one of `timeout` and `timeoutDurationMinutes`.
       */
      public fun timeout(timeout: Duration)

      /**
       * @param timeoutAction The action to take when TargetSpotCapacity has not been fulfilled when
       * the TimeoutDurationMinutes has expired. 
       */
      public fun timeoutAction(timeoutAction: SpotTimeoutAction)

      /**
       * @param timeoutDurationMinutes The spot provisioning timeout period in minutes.
       * The value must be between 5 and 1440 minutes.
       *
       * You must specify one of `timeout` and `timeoutDurationMinutes`.
       * @deprecated - Use `timeout`.
       */
      @Deprecated(message = "deprecated in CDK")
      public fun timeoutDurationMinutes(timeoutDurationMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty.builder()

      /**
       * @param allocationStrategy Specifies the strategy to use in launching Spot Instance fleets.
       */
      override fun allocationStrategy(allocationStrategy: SpotAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy.let(SpotAllocationStrategy::unwrap))
      }

      /**
       * @param blockDurationMinutes The defined duration for Spot instances (also known as Spot
       * blocks) in minutes.
       * @deprecated - Spot Instances with a defined duration (also known as Spot blocks) are no
       * longer available to new customers from July 1, 2021.
       * For customers who have previously used the feature, we will continue to support Spot
       * Instances with a defined duration until December 31, 2022.
       */
      @Deprecated(message = "deprecated in CDK")
      override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      /**
       * @param timeout The spot provisioning timeout period in minutes.
       * The value must be between 5 and 1440 minutes.
       *
       * You must specify one of `timeout` and `timeoutDurationMinutes`.
       */
      override fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout.let(Duration::unwrap))
      }

      /**
       * @param timeoutAction The action to take when TargetSpotCapacity has not been fulfilled when
       * the TimeoutDurationMinutes has expired. 
       */
      override fun timeoutAction(timeoutAction: SpotTimeoutAction) {
        cdkBuilder.timeoutAction(timeoutAction.let(SpotTimeoutAction::unwrap))
      }

      /**
       * @param timeoutDurationMinutes The spot provisioning timeout period in minutes.
       * The value must be between 5 and 1440 minutes.
       *
       * You must specify one of `timeout` and `timeoutDurationMinutes`.
       * @deprecated - Use `timeout`.
       */
      @Deprecated(message = "deprecated in CDK")
      override fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), SpotProvisioningSpecificationProperty {
      /**
       * Specifies the strategy to use in launching Spot Instance fleets.
       *
       * Default: - No allocation strategy, i.e. spot instance type will be chosen based on current
       * price only
       */
      override fun allocationStrategy(): SpotAllocationStrategy? =
          unwrap(this).getAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

      /**
       * (deprecated) The defined duration for Spot instances (also known as Spot blocks) in
       * minutes.
       *
       * Default: - No blockDurationMinutes
       *
       * * Spot Instances with a defined duration (also known as Spot blocks) are no longer
       * available to new customers from July 1, 2021.
       * For customers who have previously used the feature, we will continue to support Spot
       * Instances with a defined duration until December 31, 2022.
       */
      @Deprecated(message = "deprecated in CDK")
      override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      /**
       * The spot provisioning timeout period in minutes.
       *
       * The value must be between 5 and 1440 minutes.
       *
       * You must specify one of `timeout` and `timeoutDurationMinutes`.
       *
       * Default: - The value in `timeoutDurationMinutes` is used
       */
      override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

      /**
       * The action to take when TargetSpotCapacity has not been fulfilled when the
       * TimeoutDurationMinutes has expired.
       */
      override fun timeoutAction(): SpotTimeoutAction =
          unwrap(this).getTimeoutAction().let(SpotTimeoutAction::wrap)

      /**
       * (deprecated) The spot provisioning timeout period in minutes.
       *
       * The value must be between 5 and 1440 minutes.
       *
       * You must specify one of `timeout` and `timeoutDurationMinutes`.
       *
       * Default: - The value in `timeout` is used
       *
       * * Use `timeout`.
       */
      @Deprecated(message = "deprecated in CDK")
      override fun timeoutDurationMinutes(): Number? = unwrap(this).getTimeoutDurationMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty):
          SpotProvisioningSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SpotProvisioningSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotProvisioningSpecificationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotProvisioningSpecificationProperty
    }
  }

  /**
   * The launch specification for On-Demand Instances in the instance fleet, which determines the
   * allocation strategy.
   *
   * Example:
   *
   * ```
   * EmrCreateCluster.Builder.create(this, "OnDemandSpecification")
   * .instances(InstancesConfigProperty.builder()
   * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
   * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
   * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
   * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
   * .allocationStrategy(EmrCreateCluster.getOnDemandAllocationStrategy().LOWEST_PRICE)
   * .build())
   * .build())
   * .build()))
   * .build())
   * .name("OnDemandCluster")
   * .integrationPattern(IntegrationPattern.RUN_JOB)
   * .build();
   * EmrCreateCluster.Builder.create(this, "SpotSpecification")
   * .instances(InstancesConfigProperty.builder()
   * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
   * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
   * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
   * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
   * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
   * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().TERMINATE_CLUSTER)
   * .timeout(Duration.minutes(5))
   * .build())
   * .build())
   * .build()))
   * .build())
   * .name("SpotCluster")
   * .integrationPattern(IntegrationPattern.RUN_JOB)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ondemandprovisioningspecification.html)
   */
  public interface OnDemandProvisioningSpecificationProperty {
    /**
     * Specifies the strategy to use in launching On-Demand instance fleets.
     *
     * Currently, the only option is lowest-price (the default), which launches the lowest price
     * first.
     */
    public fun allocationStrategy(): OnDemandAllocationStrategy

    /**
     * A builder for [OnDemandProvisioningSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
       * fleets. 
       * Currently, the only option is lowest-price (the default), which launches the lowest price
       * first.
       */
      public fun allocationStrategy(allocationStrategy: OnDemandAllocationStrategy)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty.builder()

      /**
       * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
       * fleets. 
       * Currently, the only option is lowest-price (the default), which launches the lowest price
       * first.
       */
      override fun allocationStrategy(allocationStrategy: OnDemandAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy.let(OnDemandAllocationStrategy::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), OnDemandProvisioningSpecificationProperty {
      /**
       * Specifies the strategy to use in launching On-Demand instance fleets.
       *
       * Currently, the only option is lowest-price (the default), which launches the lowest price
       * first.
       */
      override fun allocationStrategy(): OnDemandAllocationStrategy =
          unwrap(this).getAllocationStrategy().let(OnDemandAllocationStrategy::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnDemandProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty):
          OnDemandProvisioningSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OnDemandProvisioningSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandProvisioningSpecificationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.OnDemandProvisioningSpecificationProperty
    }
  }

  public enum class SpotAllocationStrategy(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy,
  ) {
    CAPACITY_OPTIMIZED(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.CAPACITY_OPTIMIZED),
    PRICE_CAPACITY_OPTIMIZED(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED),
    LOWEST_PRICE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.LOWEST_PRICE),
    DIVERSIFIED(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.DIVERSIFIED),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy):
          SpotAllocationStrategy = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.CAPACITY_OPTIMIZED ->
            SpotAllocationStrategy.CAPACITY_OPTIMIZED
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED ->
            SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.LOWEST_PRICE ->
            SpotAllocationStrategy.LOWEST_PRICE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.DIVERSIFIED ->
            SpotAllocationStrategy.DIVERSIFIED
      }

      internal fun unwrap(wrapped: SpotAllocationStrategy):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy
          = wrapped.cdkObject
    }
  }

  /**
   * The Amazon EC2 Availability Zone configuration of the cluster (job flow).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * PlacementTypeProperty placementTypeProperty = PlacementTypeProperty.builder()
   * .availabilityZone("availabilityZone")
   * .availabilityZones(List.of("availabilityZones"))
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_PlacementType.html)
   */
  public interface PlacementTypeProperty {
    /**
     * The Amazon EC2 Availability Zone for the cluster.
     *
     * AvailabilityZone is used for uniform instance groups, while AvailabilityZones
     * (plural) is used for instance fleets.
     *
     * Default: - EMR selected default
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches
     * instances in the optimal Availability Zone.
     *
     * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used for
     * uniform instance groups.
     *
     * Default: - EMR selected default
     */
    public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * A builder for [PlacementTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Amazon EC2 Availability Zone for the cluster.
       * AvailabilityZone is used for uniform instance groups, while AvailabilityZones
       * (plural) is used for instance fleets.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param availabilityZones When multiple Availability Zones are specified, Amazon EMR
       * evaluates them and launches instances in the optimal Availability Zone.
       * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used
       * for uniform instance groups.
       */
      public fun availabilityZones(availabilityZones: List<String>)

      /**
       * @param availabilityZones When multiple Availability Zones are specified, Amazon EMR
       * evaluates them and launches instances in the optimal Availability Zone.
       * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used
       * for uniform instance groups.
       */
      public fun availabilityZones(vararg availabilityZones: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty.builder()

      /**
       * @param availabilityZone The Amazon EC2 Availability Zone for the cluster.
       * AvailabilityZone is used for uniform instance groups, while AvailabilityZones
       * (plural) is used for instance fleets.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param availabilityZones When multiple Availability Zones are specified, Amazon EMR
       * evaluates them and launches instances in the optimal Availability Zone.
       * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used
       * for uniform instance groups.
       */
      override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      /**
       * @param availabilityZones When multiple Availability Zones are specified, Amazon EMR
       * evaluates them and launches instances in the optimal Availability Zone.
       * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used
       * for uniform instance groups.
       */
      override fun availabilityZones(vararg availabilityZones: String): Unit =
          availabilityZones(availabilityZones.toList())

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty,
    ) : CdkObject(cdkObject), PlacementTypeProperty {
      /**
       * The Amazon EC2 Availability Zone for the cluster.
       *
       * AvailabilityZone is used for uniform instance groups, while AvailabilityZones
       * (plural) is used for instance fleets.
       *
       * Default: - EMR selected default
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches
       * instances in the optimal Availability Zone.
       *
       * AvailabilityZones is used for instance fleets, while AvailabilityZone (singular) is used
       * for uniform instance groups.
       *
       * Default: - EMR selected default
       */
      override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty):
          PlacementTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? PlacementTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementTypeProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.PlacementTypeProperty
    }
  }

  /**
   * Configuration of the script to run during a bootstrap action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ScriptBootstrapActionConfigProperty scriptBootstrapActionConfigProperty =
   * ScriptBootstrapActionConfigProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .args(List.of("args"))
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScriptBootstrapActionConfig.html)
   */
  public interface ScriptBootstrapActionConfigProperty {
    /**
     * A list of command line arguments to pass to the bootstrap action script.
     *
     * Default: No args
     */
    public fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

    /**
     * Location of the script to run during a bootstrap action.
     *
     * Can be either a location in Amazon S3 or on a local file system.
     */
    public fun path(): String

    /**
     * A builder for [ScriptBootstrapActionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      public fun args(args: List<String>)

      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      public fun args(vararg args: String)

      /**
       * @param path Location of the script to run during a bootstrap action. 
       * Can be either a location in Amazon S3 or on a local file system.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty.builder()

      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      override fun args(args: List<String>) {
        cdkBuilder.args(args)
      }

      /**
       * @param args A list of command line arguments to pass to the bootstrap action script.
       */
      override fun args(vararg args: String): Unit = args(args.toList())

      /**
       * @param path Location of the script to run during a bootstrap action. 
       * Can be either a location in Amazon S3 or on a local file system.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty,
    ) : CdkObject(cdkObject), ScriptBootstrapActionConfigProperty {
      /**
       * A list of command line arguments to pass to the bootstrap action script.
       *
       * Default: No args
       */
      override fun args(): List<String> = unwrap(this).getArgs() ?: emptyList()

      /**
       * Location of the script to run during a bootstrap action.
       *
       * Can be either a location in Amazon S3 or on a local file system.
       */
      override fun path(): String = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ScriptBootstrapActionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty):
          ScriptBootstrapActionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScriptBootstrapActionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptBootstrapActionConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty
    }
  }

  /**
   * The upper and lower EC2 instance limits for an automatic scaling policy.
   *
   * Automatic scaling activities triggered by automatic scaling
   * rules will not cause an instance group to grow above or below these limits.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ScalingConstraintsProperty scalingConstraintsProperty = ScalingConstraintsProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingConstraints.html)
   */
  public interface ScalingConstraintsProperty {
    /**
     * The upper boundary of EC2 instances in an instance group beyond which scaling activities are
     * not allowed to grow.
     *
     * Scale-out
     * activities will not add instances beyond this boundary.
     */
    public fun maxCapacity(): Number

    /**
     * The lower boundary of EC2 instances in an instance group below which scaling activities are
     * not allowed to shrink.
     *
     * Scale-in
     * activities will not terminate instances below this boundary.
     */
    public fun minCapacity(): Number

    /**
     * A builder for [ScalingConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The upper boundary of EC2 instances in an instance group beyond which
       * scaling activities are not allowed to grow. 
       * Scale-out
       * activities will not add instances beyond this boundary.
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The lower boundary of EC2 instances in an instance group below which
       * scaling activities are not allowed to shrink. 
       * Scale-in
       * activities will not terminate instances below this boundary.
       */
      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty.builder()

      /**
       * @param maxCapacity The upper boundary of EC2 instances in an instance group beyond which
       * scaling activities are not allowed to grow. 
       * Scale-out
       * activities will not add instances beyond this boundary.
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The lower boundary of EC2 instances in an instance group below which
       * scaling activities are not allowed to shrink. 
       * Scale-in
       * activities will not terminate instances below this boundary.
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty,
    ) : CdkObject(cdkObject), ScalingConstraintsProperty {
      /**
       * The upper boundary of EC2 instances in an instance group beyond which scaling activities
       * are not allowed to grow.
       *
       * Scale-out
       * activities will not add instances beyond this boundary.
       */
      override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

      /**
       * The lower boundary of EC2 instances in an instance group below which scaling activities are
       * not allowed to shrink.
       *
       * Scale-in
       * activities will not terminate instances below this boundary.
       */
      override fun minCapacity(): Number = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty):
          ScalingConstraintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScalingConstraintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConstraintsProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingConstraintsProperty
    }
  }

  /**
   * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
   * configuration.
   *
   * See the RunJobFlow API for complete documentation on input parameters
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * KerberosAttributesProperty kerberosAttributesProperty = KerberosAttributesProperty.builder()
   * .realm("realm")
   * // the properties below are optional
   * .adDomainJoinPassword("adDomainJoinPassword")
   * .adDomainJoinUser("adDomainJoinUser")
   * .crossRealmTrustPrincipalPassword("crossRealmTrustPrincipalPassword")
   * .kdcAdminPassword("kdcAdminPassword")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_KerberosAttributes.html)
   */
  public interface KerberosAttributesProperty {
    /**
     * The Active Directory password for ADDomainJoinUser.
     *
     * Default: No adDomainJoinPassword
     */
    public fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

    /**
     * Required only when establishing a cross-realm trust with an Active Directory domain.
     *
     * A user with sufficient privileges to join
     * resources to the domain.
     *
     * Default: No adDomainJoinUser
     */
    public fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

    /**
     * Required only when establishing a cross-realm trust with a KDC in a different realm.
     *
     * The cross-realm principal password, which
     * must be identical across realms.
     *
     * Default: No crossRealmTrustPrincipalPassword
     */
    public fun crossRealmTrustPrincipalPassword(): String? =
        unwrap(this).getCrossRealmTrustPrincipalPassword()

    /**
     * The password used within the cluster for the kadmin service on the cluster-dedicated KDC,
     * which maintains Kerberos principals, password policies, and keytabs for the cluster.
     *
     * Default: No kdcAdminPassword
     */
    public fun kdcAdminPassword(): String? = unwrap(this).getKdcAdminPassword()

    /**
     * The name of the Kerberos realm to which all nodes in a cluster belong.
     *
     * For example, EC2.INTERNAL.
     */
    public fun realm(): String

    /**
     * A builder for [KerberosAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adDomainJoinPassword The Active Directory password for ADDomainJoinUser.
       */
      public fun adDomainJoinPassword(adDomainJoinPassword: String)

      /**
       * @param adDomainJoinUser Required only when establishing a cross-realm trust with an Active
       * Directory domain.
       * A user with sufficient privileges to join
       * resources to the domain.
       */
      public fun adDomainJoinUser(adDomainJoinUser: String)

      /**
       * @param crossRealmTrustPrincipalPassword Required only when establishing a cross-realm trust
       * with a KDC in a different realm.
       * The cross-realm principal password, which
       * must be identical across realms.
       */
      public fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String)

      /**
       * @param kdcAdminPassword The password used within the cluster for the kadmin service on the
       * cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for
       * the cluster.
       */
      public fun kdcAdminPassword(kdcAdminPassword: String)

      /**
       * @param realm The name of the Kerberos realm to which all nodes in a cluster belong. 
       * For example, EC2.INTERNAL.
       */
      public fun realm(realm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty.builder()

      /**
       * @param adDomainJoinPassword The Active Directory password for ADDomainJoinUser.
       */
      override fun adDomainJoinPassword(adDomainJoinPassword: String) {
        cdkBuilder.adDomainJoinPassword(adDomainJoinPassword)
      }

      /**
       * @param adDomainJoinUser Required only when establishing a cross-realm trust with an Active
       * Directory domain.
       * A user with sufficient privileges to join
       * resources to the domain.
       */
      override fun adDomainJoinUser(adDomainJoinUser: String) {
        cdkBuilder.adDomainJoinUser(adDomainJoinUser)
      }

      /**
       * @param crossRealmTrustPrincipalPassword Required only when establishing a cross-realm trust
       * with a KDC in a different realm.
       * The cross-realm principal password, which
       * must be identical across realms.
       */
      override fun crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword: String) {
        cdkBuilder.crossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword)
      }

      /**
       * @param kdcAdminPassword The password used within the cluster for the kadmin service on the
       * cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for
       * the cluster.
       */
      override fun kdcAdminPassword(kdcAdminPassword: String) {
        cdkBuilder.kdcAdminPassword(kdcAdminPassword)
      }

      /**
       * @param realm The name of the Kerberos realm to which all nodes in a cluster belong. 
       * For example, EC2.INTERNAL.
       */
      override fun realm(realm: String) {
        cdkBuilder.realm(realm)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty,
    ) : CdkObject(cdkObject), KerberosAttributesProperty {
      /**
       * The Active Directory password for ADDomainJoinUser.
       *
       * Default: No adDomainJoinPassword
       */
      override fun adDomainJoinPassword(): String? = unwrap(this).getAdDomainJoinPassword()

      /**
       * Required only when establishing a cross-realm trust with an Active Directory domain.
       *
       * A user with sufficient privileges to join
       * resources to the domain.
       *
       * Default: No adDomainJoinUser
       */
      override fun adDomainJoinUser(): String? = unwrap(this).getAdDomainJoinUser()

      /**
       * Required only when establishing a cross-realm trust with a KDC in a different realm.
       *
       * The cross-realm principal password, which
       * must be identical across realms.
       *
       * Default: No crossRealmTrustPrincipalPassword
       */
      override fun crossRealmTrustPrincipalPassword(): String? =
          unwrap(this).getCrossRealmTrustPrincipalPassword()

      /**
       * The password used within the cluster for the kadmin service on the cluster-dedicated KDC,
       * which maintains Kerberos principals, password policies, and keytabs for the cluster.
       *
       * Default: No kdcAdminPassword
       */
      override fun kdcAdminPassword(): String? = unwrap(this).getKdcAdminPassword()

      /**
       * The name of the Kerberos realm to which all nodes in a cluster belong.
       *
       * For example, EC2.INTERNAL.
       */
      override fun realm(): String = unwrap(this).getRealm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KerberosAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty):
          KerberosAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KerberosAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KerberosAttributesProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.KerberosAttributesProperty
    }
  }

  /**
   * An automatic scaling configuration, which describes how the policy adds or removes instances,
   * the cooldown period, and the number of EC2 instances that will be added each time the CloudWatch
   * metric alarm condition is satisfied.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * SimpleScalingPolicyConfigurationProperty simpleScalingPolicyConfigurationProperty =
   * SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
   * .coolDown(123)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_SimpleScalingPolicyConfiguration.html)
   */
  public interface SimpleScalingPolicyConfigurationProperty {
    /**
     * The way in which EC2 instances are added (if ScalingAdjustment is a positive number) or
     * terminated (if ScalingAdjustment is a negative number) each time the scaling activity is
     * triggered.
     *
     * Default: - None
     */
    public fun adjustmentType(): ScalingAdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(ScalingAdjustmentType::wrap)

    /**
     * The amount of time, in seconds, after a scaling activity completes before any further
     * trigger-related scaling activities can start.
     *
     * Default: 0
     */
    public fun coolDown(): Number? = unwrap(this).getCoolDown()

    /**
     * The amount by which to scale in or scale out, based on the specified AdjustmentType.
     *
     * A positive value adds to the instance group's
     * EC2 instance count while a negative number removes instances. If AdjustmentType is set to
     * EXACT_CAPACITY, the number should only be
     * a positive integer.
     */
    public fun scalingAdjustment(): Number

    /**
     * A builder for [SimpleScalingPolicyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adjustmentType The way in which EC2 instances are added (if ScalingAdjustment is a
       * positive number) or terminated (if ScalingAdjustment is a negative number) each time the
       * scaling activity is triggered.
       */
      public fun adjustmentType(adjustmentType: ScalingAdjustmentType)

      /**
       * @param coolDown The amount of time, in seconds, after a scaling activity completes before
       * any further trigger-related scaling activities can start.
       */
      public fun coolDown(coolDown: Number)

      /**
       * @param scalingAdjustment The amount by which to scale in or scale out, based on the
       * specified AdjustmentType. 
       * A positive value adds to the instance group's
       * EC2 instance count while a negative number removes instances. If AdjustmentType is set to
       * EXACT_CAPACITY, the number should only be
       * a positive integer.
       */
      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.builder()

      /**
       * @param adjustmentType The way in which EC2 instances are added (if ScalingAdjustment is a
       * positive number) or terminated (if ScalingAdjustment is a negative number) each time the
       * scaling activity is triggered.
       */
      override fun adjustmentType(adjustmentType: ScalingAdjustmentType) {
        cdkBuilder.adjustmentType(adjustmentType.let(ScalingAdjustmentType::unwrap))
      }

      /**
       * @param coolDown The amount of time, in seconds, after a scaling activity completes before
       * any further trigger-related scaling activities can start.
       */
      override fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
      }

      /**
       * @param scalingAdjustment The amount by which to scale in or scale out, based on the
       * specified AdjustmentType. 
       * A positive value adds to the instance group's
       * EC2 instance count while a negative number removes instances. If AdjustmentType is set to
       * EXACT_CAPACITY, the number should only be
       * a positive integer.
       */
      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), SimpleScalingPolicyConfigurationProperty {
      /**
       * The way in which EC2 instances are added (if ScalingAdjustment is a positive number) or
       * terminated (if ScalingAdjustment is a negative number) each time the scaling activity is
       * triggered.
       *
       * Default: - None
       */
      override fun adjustmentType(): ScalingAdjustmentType? =
          unwrap(this).getAdjustmentType()?.let(ScalingAdjustmentType::wrap)

      /**
       * The amount of time, in seconds, after a scaling activity completes before any further
       * trigger-related scaling activities can start.
       *
       * Default: 0
       */
      override fun coolDown(): Number? = unwrap(this).getCoolDown()

      /**
       * The amount by which to scale in or scale out, based on the specified AdjustmentType.
       *
       * A positive value adds to the instance group's
       * EC2 instance count while a negative number removes instances. If AdjustmentType is set to
       * EXACT_CAPACITY, the number should only be
       * a positive integer.
       */
      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SimpleScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty):
          SimpleScalingPolicyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SimpleScalingPolicyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SimpleScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SimpleScalingPolicyConfigurationProperty
    }
  }

  /**
   * The Amazon EBS configuration of a cluster instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * Size size;
   * EbsConfigurationProperty ebsConfigurationProperty = EbsConfigurationProperty.builder()
   * .ebsBlockDeviceConfigs(List.of(EbsBlockDeviceConfigProperty.builder()
   * .volumeSpecification(VolumeSpecificationProperty.builder()
   * .volumeSize(size)
   * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP3)
   * // the properties below are optional
   * .iops(123)
   * .build())
   * // the properties below are optional
   * .volumesPerInstance(123)
   * .build()))
   * .ebsOptimized(false)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_EbsConfiguration.html)
   */
  public interface EbsConfigurationProperty {
    /**
     * An array of Amazon EBS volume specifications attached to a cluster instance.
     *
     * Default: - None
     */
    public fun ebsBlockDeviceConfigs(): List<EbsBlockDeviceConfigProperty> =
        unwrap(this).getEbsBlockDeviceConfigs()?.map(EbsBlockDeviceConfigProperty::wrap) ?:
        emptyList()

    /**
     * Indicates whether an Amazon EBS volume is EBS-optimized.
     *
     * Default: - EMR selected default
     */
    public fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()

    /**
     * A builder for [EbsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<EbsBlockDeviceConfigProperty>)

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: EbsBlockDeviceConfigProperty)

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      public fun ebsOptimized(ebsOptimized: Boolean)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty.builder()

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override
          fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<EbsBlockDeviceConfigProperty>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.map(EbsBlockDeviceConfigProperty::unwrap))
      }

      /**
       * @param ebsBlockDeviceConfigs An array of Amazon EBS volume specifications attached to a
       * cluster instance.
       */
      override fun ebsBlockDeviceConfigs(vararg
          ebsBlockDeviceConfigs: EbsBlockDeviceConfigProperty): Unit =
          ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.toList())

      /**
       * @param ebsOptimized Indicates whether an Amazon EBS volume is EBS-optimized.
       */
      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty,
    ) : CdkObject(cdkObject), EbsConfigurationProperty {
      /**
       * An array of Amazon EBS volume specifications attached to a cluster instance.
       *
       * Default: - None
       */
      override fun ebsBlockDeviceConfigs(): List<EbsBlockDeviceConfigProperty> =
          unwrap(this).getEbsBlockDeviceConfigs()?.map(EbsBlockDeviceConfigProperty::wrap) ?:
          emptyList()

      /**
       * Indicates whether an Amazon EBS volume is EBS-optimized.
       *
       * Default: - EMR selected default
       */
      override fun ebsOptimized(): Boolean? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty):
          EbsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? EbsConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EbsConfigurationProperty
    }
  }

  public enum class CloudWatchAlarmUnit(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit,
  ) {
    NONE(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.NONE),
    SECONDS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.SECONDS),
    MICRO_SECONDS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MICRO_SECONDS),
    MILLI_SECONDS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MILLI_SECONDS),
    BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES),
    KILO_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES),
    MEGA_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES),
    GIGA_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES),
    TERA_BYTES(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES),
    BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS),
    KILO_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS),
    MEGA_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS),
    GIGA_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS),
    TERA_BITS(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS),
    PERCENT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.PERCENT),
    COUNT(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT),
    BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES_PER_SECOND),
    KILO_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES_PER_SECOND),
    MEGA_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES_PER_SECOND),
    GIGA_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES_PER_SECOND),
    TERA_BYTES_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES_PER_SECOND),
    BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS_PER_SECOND),
    KILO_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS_PER_SECOND),
    MEGA_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS_PER_SECOND),
    GIGA_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS_PER_SECOND),
    TERA_BITS_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS_PER_SECOND),
    COUNT_PER_SECOND(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT_PER_SECOND),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit):
          CloudWatchAlarmUnit = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.NONE ->
            CloudWatchAlarmUnit.NONE
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.SECONDS ->
            CloudWatchAlarmUnit.SECONDS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MICRO_SECONDS ->
            CloudWatchAlarmUnit.MICRO_SECONDS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MILLI_SECONDS ->
            CloudWatchAlarmUnit.MILLI_SECONDS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES ->
            CloudWatchAlarmUnit.BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES ->
            CloudWatchAlarmUnit.KILO_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES ->
            CloudWatchAlarmUnit.MEGA_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES ->
            CloudWatchAlarmUnit.GIGA_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES ->
            CloudWatchAlarmUnit.TERA_BYTES
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS ->
            CloudWatchAlarmUnit.BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS ->
            CloudWatchAlarmUnit.KILO_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS ->
            CloudWatchAlarmUnit.MEGA_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS ->
            CloudWatchAlarmUnit.GIGA_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS ->
            CloudWatchAlarmUnit.TERA_BITS
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.PERCENT ->
            CloudWatchAlarmUnit.PERCENT
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT ->
            CloudWatchAlarmUnit.COUNT
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.KILO_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.MEGA_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.GIGA_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BYTES_PER_SECOND ->
            CloudWatchAlarmUnit.TERA_BYTES_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.BITS_PER_SECOND ->
            CloudWatchAlarmUnit.BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.KILO_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.KILO_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.MEGA_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.MEGA_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.GIGA_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.GIGA_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.TERA_BITS_PER_SECOND ->
            CloudWatchAlarmUnit.TERA_BITS_PER_SECOND
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit.COUNT_PER_SECOND ->
            CloudWatchAlarmUnit.COUNT_PER_SECOND
      }

      internal fun unwrap(wrapped: CloudWatchAlarmUnit):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit =
          wrapped.cdkObject
    }
  }

  /**
   * A scale-in or scale-out rule that defines scaling activity, including the CloudWatch metric
   * alarm that triggers activity, how EC2 instances are added or removed, and the periodicity of
   * adjustments.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ScalingRuleProperty scalingRuleProperty = ScalingRuleProperty.builder()
   * .action(ScalingActionProperty.builder()
   * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
   * .build())
   * .name("name")
   * .trigger(ScalingTriggerProperty.builder()
   * .cloudWatchAlarmDefinition(CloudWatchAlarmDefinitionProperty.builder()
   * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
   * .metricName("metricName")
   * .period(Duration.minutes(30))
   * // the properties below are optional
   * .dimensions(List.of(MetricDimensionProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .evaluationPeriods(123)
   * .namespace("namespace")
   * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
   * .threshold(123)
   * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
   * .build())
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingRule.html)
   */
  public interface ScalingRuleProperty {
    /**
     * The conditions that trigger an automatic scaling activity.
     */
    public fun action(): ScalingActionProperty

    /**
     * A friendly, more verbose description of the automatic scaling rule.
     *
     * Default: - None
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name used to identify an automatic scaling rule.
     *
     * Rule names must be unique within a scaling policy.
     */
    public fun name(): String

    /**
     * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     */
    public fun trigger(): ScalingTriggerProperty

    /**
     * A builder for [ScalingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      public fun action(action: ScalingActionProperty)

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("419a416e51f605bf57d25fa82dcf2bbcf704147957ee6f675c027e9ec5fe9ad2")
      public fun action(action: ScalingActionProperty.Builder.() -> Unit)

      /**
       * @param description A friendly, more verbose description of the automatic scaling rule.
       */
      public fun description(description: String)

      /**
       * @param name The name used to identify an automatic scaling rule. 
       * Rule names must be unique within a scaling policy.
       */
      public fun name(name: String)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      public fun trigger(trigger: ScalingTriggerProperty)

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5c45c94aca8ef11b0a1bb5a0ef0a77aa1be244839715fcb3ffff379edfdf4aa")
      public fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty.builder()

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      override fun action(action: ScalingActionProperty) {
        cdkBuilder.action(action.let(ScalingActionProperty::unwrap))
      }

      /**
       * @param action The conditions that trigger an automatic scaling activity. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("419a416e51f605bf57d25fa82dcf2bbcf704147957ee6f675c027e9ec5fe9ad2")
      override fun action(action: ScalingActionProperty.Builder.() -> Unit): Unit =
          action(ScalingActionProperty(action))

      /**
       * @param description A friendly, more verbose description of the automatic scaling rule.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The name used to identify an automatic scaling rule. 
       * Rule names must be unique within a scaling policy.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      override fun trigger(trigger: ScalingTriggerProperty) {
        cdkBuilder.trigger(trigger.let(ScalingTriggerProperty::unwrap))
      }

      /**
       * @param trigger The CloudWatch alarm definition that determines when automatic scaling
       * activity is triggered. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5c45c94aca8ef11b0a1bb5a0ef0a77aa1be244839715fcb3ffff379edfdf4aa")
      override fun trigger(trigger: ScalingTriggerProperty.Builder.() -> Unit): Unit =
          trigger(ScalingTriggerProperty(trigger))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty,
    ) : CdkObject(cdkObject), ScalingRuleProperty {
      /**
       * The conditions that trigger an automatic scaling activity.
       */
      override fun action(): ScalingActionProperty =
          unwrap(this).getAction().let(ScalingActionProperty::wrap)

      /**
       * A friendly, more verbose description of the automatic scaling rule.
       *
       * Default: - None
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name used to identify an automatic scaling rule.
       *
       * Rule names must be unique within a scaling policy.
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The CloudWatch alarm definition that determines when automatic scaling activity is
       * triggered.
       */
      override fun trigger(): ScalingTriggerProperty =
          unwrap(this).getTrigger().let(ScalingTriggerProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty):
          ScalingRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingRuleProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingRuleProperty
    }
  }

  public enum class EmrClusterScaleDownBehavior(
    private val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior,
  ) {
    TERMINATE_AT_INSTANCE_HOUR(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_INSTANCE_HOUR),
    TERMINATE_AT_TASK_COMPLETION(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_TASK_COMPLETION),
    ;

    public companion object {
      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior):
          EmrClusterScaleDownBehavior = when (cdkObject) {
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_INSTANCE_HOUR ->
            EmrClusterScaleDownBehavior.TERMINATE_AT_INSTANCE_HOUR
        software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior.TERMINATE_AT_TASK_COMPLETION ->
            EmrClusterScaleDownBehavior.TERMINATE_AT_TASK_COMPLETION
      }

      internal fun unwrap(wrapped: EmrClusterScaleDownBehavior):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.EmrClusterScaleDownBehavior
          = wrapped.cdkObject
    }
  }

  /**
   * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity
   * of the adjustment.
   *
   * And an automatic scaling configuration, which describes how the policy adds or removes
   * instances, the cooldown period,
   * and the number of EC2 instances that will be added each time the CloudWatch metric alarm
   * condition is satisfied.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
   * ScalingActionProperty scalingActionProperty = ScalingActionProperty.builder()
   * .simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .adjustmentType(EmrCreateCluster.getScalingAdjustmentType().CHANGE_IN_CAPACITY)
   * .coolDown(123)
   * .build())
   * // the properties below are optional
   * .market(EmrCreateCluster.getInstanceMarket().ON_DEMAND)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_ScalingAction.html)
   */
  public interface ScalingActionProperty {
    /**
     * Not available for instance groups.
     *
     * Instance groups use the market type specified for the group.
     *
     * Default: - EMR selected default
     */
    public fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

    /**
     * The type of adjustment the automatic scaling activity makes when triggered, and the
     * periodicity of the adjustment.
     */
    public fun simpleScalingPolicyConfiguration(): SimpleScalingPolicyConfigurationProperty

    /**
     * A builder for [ScalingActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param market Not available for instance groups.
       * Instance groups use the market type specified for the group.
       */
      public fun market(market: InstanceMarket)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty)

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52fa52aefda71e5cc5ed6656af95c8e2fdc117aa5e1fe1d0b00f1070bb4f5c82")
      public
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty.builder()

      /**
       * @param market Not available for instance groups.
       * Instance groups use the market type specified for the group.
       */
      override fun market(market: InstanceMarket) {
        cdkBuilder.market(market.let(InstanceMarket::unwrap))
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration.let(SimpleScalingPolicyConfigurationProperty::unwrap))
      }

      /**
       * @param simpleScalingPolicyConfiguration The type of adjustment the automatic scaling
       * activity makes when triggered, and the periodicity of the adjustment. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52fa52aefda71e5cc5ed6656af95c8e2fdc117aa5e1fe1d0b00f1070bb4f5c82")
      override
          fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          simpleScalingPolicyConfiguration(SimpleScalingPolicyConfigurationProperty(simpleScalingPolicyConfiguration))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty,
    ) : CdkObject(cdkObject), ScalingActionProperty {
      /**
       * Not available for instance groups.
       *
       * Instance groups use the market type specified for the group.
       *
       * Default: - EMR selected default
       */
      override fun market(): InstanceMarket? = unwrap(this).getMarket()?.let(InstanceMarket::wrap)

      /**
       * The type of adjustment the automatic scaling activity makes when triggered, and the
       * periodicity of the adjustment.
       */
      override fun simpleScalingPolicyConfiguration(): SimpleScalingPolicyConfigurationProperty =
          unwrap(this).getSimpleScalingPolicyConfiguration().let(SimpleScalingPolicyConfigurationProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty):
          ScalingActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingActionProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingActionProperty
    }
  }
}
