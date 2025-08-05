@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CodeDeploy Deployment Group that deploys to EC2/on-premise instances.
 *
 * Example:
 *
 * ```
 * ApplicationLoadBalancer alb;
 * ApplicationListener listener = alb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * ApplicationTargetGroup targetGroup = listener.addTargets("Fleet",
 * AddApplicationTargetsProps.builder().port(80).build());
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "DeploymentGroup")
 * .loadBalancer(LoadBalancer.application(targetGroup))
 * .build();
 * ```
 */
public open class ServerDeploymentGroup(
  cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup,
) : Resource(cdkObject),
    IServerDeploymentGroup {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerDeploymentGroupProps,
  ) :
      this(software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ServerDeploymentGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerDeploymentGroupProps.Builder.() -> Unit,
  ) : this(scope, id, ServerDeploymentGroupProps(props)
  )

  /**
   * Associates an additional alarm with this Deployment Group.
   *
   * @param alarm the alarm to associate with this Deployment Group. 
   */
  public open fun addAlarm(alarm: IAlarm) {
    unwrap(this).addAlarm(alarm.let(IAlarm.Companion::unwrap))
  }

  /**
   * Adds an additional auto-scaling group to this Deployment Group.
   *
   * @param asg the auto-scaling group to add to this Deployment Group. 
   */
  public open fun addAutoScalingGroup(asg: AutoScalingGroup) {
    unwrap(this).addAutoScalingGroup(asg.let(AutoScalingGroup.Companion::unwrap))
  }

  /**
   *
   */
  public override fun application(): IServerApplication =
      unwrap(this).getApplication().let(IServerApplication::wrap)

  /**
   *
   */
  public override fun autoScalingGroups(): List<IAutoScalingGroup> =
      unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

  /**
   *
   */
  public override fun deploymentConfig(): IServerDeploymentConfig =
      unwrap(this).getDeploymentConfig().let(IServerDeploymentConfig::wrap)

  /**
   * The ARN of the Deployment Group.
   */
  public override fun deploymentGroupArn(): String = unwrap(this).getDeploymentGroupArn()

  /**
   * The name of the Deployment Group.
   */
  public override fun deploymentGroupName(): String = unwrap(this).getDeploymentGroupName()

  /**
   * The service Role of this Deployment Group.
   */
  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codedeploy.ServerDeploymentGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CloudWatch alarms associated with this Deployment Group.
     *
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     *
     * Default: []
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
     * @param alarms The CloudWatch alarms associated with this Deployment Group. 
     */
    public fun alarms(alarms: List<IAlarm>)

    /**
     * The CloudWatch alarms associated with this Deployment Group.
     *
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     *
     * Default: []
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
     * @param alarms The CloudWatch alarms associated with this Deployment Group. 
     */
    public fun alarms(vararg alarms: IAlarm)

    /**
     * The CodeDeploy EC2/on-premise Application this Deployment Group belongs to.
     *
     * Default: - A new Application will be created.
     *
     * @param application The CodeDeploy EC2/on-premise Application this Deployment Group belongs
     * to. 
     */
    public fun application(application: IServerApplication)

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    public fun autoRollback(autoRollback: AutoRollbackConfig)

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0c54e4cfaaa14cf8c23135a5ce5e71f8784d080143325d499e3147100edc21e")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    /**
     * The auto-scaling groups belonging to this Deployment Group.
     *
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     *
     * Default: []
     *
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group. 
     */
    public fun autoScalingGroups(autoScalingGroups: List<IAutoScalingGroup>)

    /**
     * The auto-scaling groups belonging to this Deployment Group.
     *
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     *
     * Default: []
     *
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group. 
     */
    public fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup)

    /**
     * The EC2/on-premise Deployment Configuration to use for this Deployment Group.
     *
     * Default: ServerDeploymentConfig#OneAtATime
     *
     * @param deploymentConfig The EC2/on-premise Deployment Configuration to use for this
     * Deployment Group. 
     */
    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig)

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: - An auto-generated name will be used.
     *
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group. 
     */
    public fun deploymentGroupName(deploymentGroupName: String)

    /**
     * All EC2 instances matching the given set of tags when a deployment occurs will be added to
     * this Deployment Group.
     *
     * Default: - No additional EC2 instances will be added to the Deployment Group.
     *
     * @param ec2InstanceTags All EC2 instances matching the given set of tags when a deployment
     * occurs will be added to this Deployment Group. 
     */
    public fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet)

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     *
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process. 
     */
    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     *
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed. 
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    /**
     * If you've provided any auto-scaling groups with the `#autoScalingGroups` property, you can
     * set this property to add User Data that installs the CodeDeploy agent on the instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/codedeploy-agent-operations-install.html)
     * @param installAgent If you've provided any auto-scaling groups with the `#autoScalingGroups`
     * property, you can set this property to add User Data that installs the CodeDeploy agent on the
     * instances. 
     */
    public fun installAgent(installAgent: Boolean)

    /**
     * (deprecated) The load balancer to place in front of this Deployment Group.
     *
     * Can be created from either a classic Elastic Load Balancer,
     * or an Application Load Balancer / Network Load Balancer Target Group.
     *
     * Default: - Deployment Group will not have a load balancer defined.
     *
     * * Use `loadBalancers` instead.
     * @param loadBalancer The load balancer to place in front of this Deployment Group. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun loadBalancer(loadBalancer: LoadBalancer)

    /**
     * CodeDeploy supports the deployment to multiple load balancers.
     *
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     *
     * Default: - Deployment Group will not have load balancers defined.
     *
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers. 
     */
    public fun loadBalancers(loadBalancers: List<LoadBalancer>)

    /**
     * CodeDeploy supports the deployment to multiple load balancers.
     *
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     *
     * Default: - Deployment Group will not have load balancers defined.
     *
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers. 
     */
    public fun loadBalancers(vararg loadBalancers: LoadBalancer)

    /**
     * All on-premise instances matching the given set of tags when a deployment occurs will be
     * added to this Deployment Group.
     *
     * Default: - No additional on-premise instances will be added to the Deployment Group.
     *
     * @param onPremiseInstanceTags All on-premise instances matching the given set of tags when a
     * deployment occurs will be added to this Deployment Group. 
     */
    public fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet)

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     *
     * @param role The service Role of this Deployment Group. 
     */
    public fun role(role: IRole)

    /**
     * Indicates whether the deployment group was configured to have CodeDeploy install a
     * termination hook into an Auto Scaling group.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * @param terminationHook Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group. 
     */
    public fun terminationHook(terminationHook: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.Builder
        = software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.Builder.create(scope, id)

    /**
     * The CloudWatch alarms associated with this Deployment Group.
     *
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     *
     * Default: []
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
     * @param alarms The CloudWatch alarms associated with this Deployment Group. 
     */
    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm.Companion::unwrap))
    }

    /**
     * The CloudWatch alarms associated with this Deployment Group.
     *
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     *
     * Default: []
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
     * @param alarms The CloudWatch alarms associated with this Deployment Group. 
     */
    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    /**
     * The CodeDeploy EC2/on-premise Application this Deployment Group belongs to.
     *
     * Default: - A new Application will be created.
     *
     * @param application The CodeDeploy EC2/on-premise Application this Deployment Group belongs
     * to. 
     */
    override fun application(application: IServerApplication) {
      cdkBuilder.application(application.let(IServerApplication.Companion::unwrap))
    }

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig.Companion::unwrap))
    }

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e0c54e4cfaaa14cf8c23135a5ce5e71f8784d080143325d499e3147100edc21e")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    /**
     * The auto-scaling groups belonging to this Deployment Group.
     *
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     *
     * Default: []
     *
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group. 
     */
    override fun autoScalingGroups(autoScalingGroups: List<IAutoScalingGroup>) {
      cdkBuilder.autoScalingGroups(autoScalingGroups.map(IAutoScalingGroup.Companion::unwrap))
    }

    /**
     * The auto-scaling groups belonging to this Deployment Group.
     *
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     *
     * Default: []
     *
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group. 
     */
    override fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup): Unit =
        autoScalingGroups(autoScalingGroups.toList())

    /**
     * The EC2/on-premise Deployment Configuration to use for this Deployment Group.
     *
     * Default: ServerDeploymentConfig#OneAtATime
     *
     * @param deploymentConfig The EC2/on-premise Deployment Configuration to use for this
     * Deployment Group. 
     */
    override fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IServerDeploymentConfig.Companion::unwrap))
    }

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: - An auto-generated name will be used.
     *
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group. 
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * All EC2 instances matching the given set of tags when a deployment occurs will be added to
     * this Deployment Group.
     *
     * Default: - No additional EC2 instances will be added to the Deployment Group.
     *
     * @param ec2InstanceTags All EC2 instances matching the given set of tags when a deployment
     * occurs will be added to this Deployment Group. 
     */
    override fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet) {
      cdkBuilder.ec2InstanceTags(ec2InstanceTags.let(InstanceTagSet.Companion::unwrap))
    }

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     *
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process. 
     */
    override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
      cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     *
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed. 
     */
    override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
      cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /**
     * If you've provided any auto-scaling groups with the `#autoScalingGroups` property, you can
     * set this property to add User Data that installs the CodeDeploy agent on the instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/codedeploy-agent-operations-install.html)
     * @param installAgent If you've provided any auto-scaling groups with the `#autoScalingGroups`
     * property, you can set this property to add User Data that installs the CodeDeploy agent on the
     * instances. 
     */
    override fun installAgent(installAgent: Boolean) {
      cdkBuilder.installAgent(installAgent)
    }

    /**
     * (deprecated) The load balancer to place in front of this Deployment Group.
     *
     * Can be created from either a classic Elastic Load Balancer,
     * or an Application Load Balancer / Network Load Balancer Target Group.
     *
     * Default: - Deployment Group will not have a load balancer defined.
     *
     * * Use `loadBalancers` instead.
     * @param loadBalancer The load balancer to place in front of this Deployment Group. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun loadBalancer(loadBalancer: LoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(LoadBalancer.Companion::unwrap))
    }

    /**
     * CodeDeploy supports the deployment to multiple load balancers.
     *
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     *
     * Default: - Deployment Group will not have load balancers defined.
     *
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers. 
     */
    override fun loadBalancers(loadBalancers: List<LoadBalancer>) {
      cdkBuilder.loadBalancers(loadBalancers.map(LoadBalancer.Companion::unwrap))
    }

    /**
     * CodeDeploy supports the deployment to multiple load balancers.
     *
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     *
     * Default: - Deployment Group will not have load balancers defined.
     *
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers. 
     */
    override fun loadBalancers(vararg loadBalancers: LoadBalancer): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * All on-premise instances matching the given set of tags when a deployment occurs will be
     * added to this Deployment Group.
     *
     * Default: - No additional on-premise instances will be added to the Deployment Group.
     *
     * @param onPremiseInstanceTags All on-premise instances matching the given set of tags when a
     * deployment occurs will be added to this Deployment Group. 
     */
    override fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet) {
      cdkBuilder.onPremiseInstanceTags(onPremiseInstanceTags.let(InstanceTagSet.Companion::unwrap))
    }

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     *
     * @param role The service Role of this Deployment Group. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * Indicates whether the deployment group was configured to have CodeDeploy install a
     * termination hook into an Auto Scaling group.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * @param terminationHook Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group. 
     */
    override fun terminationHook(terminationHook: Boolean) {
      cdkBuilder.terminationHook(terminationHook)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.PROPERTY_INJECTION_ID

    public fun fromServerDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerDeploymentGroupAttributes,
    ): IServerDeploymentGroup =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup.fromServerDeploymentGroupAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        attrs.let(ServerDeploymentGroupAttributes.Companion::unwrap)).let(IServerDeploymentGroup::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d26e7a25cd6411326fe7cb7007a72ecb87fdcb6166fa4246aa79b27de671bfb")
    public fun fromServerDeploymentGroupAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerDeploymentGroupAttributes.Builder.() -> Unit,
    ): IServerDeploymentGroup = fromServerDeploymentGroupAttributes(scope, id,
        ServerDeploymentGroupAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServerDeploymentGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServerDeploymentGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup):
        ServerDeploymentGroup = ServerDeploymentGroup(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentGroup):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
  }
}
