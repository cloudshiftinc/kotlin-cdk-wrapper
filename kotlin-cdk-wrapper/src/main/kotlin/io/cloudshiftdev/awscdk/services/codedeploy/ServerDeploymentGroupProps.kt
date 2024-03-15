@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties for `ServerDeploymentGroup`.
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
public interface ServerDeploymentGroupProps {
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
   */
  public fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

  /**
   * The CodeDeploy EC2/on-premise Application this Deployment Group belongs to.
   *
   * Default: - A new Application will be created.
   */
  public fun application(): IServerApplication? =
      unwrap(this).getApplication()?.let(IServerApplication::wrap)

  /**
   * The auto-rollback configuration for this Deployment Group.
   *
   * Default: - default AutoRollbackConfig.
   */
  public fun autoRollback(): AutoRollbackConfig? =
      unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

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
   */
  public fun autoScalingGroups(): List<IAutoScalingGroup> =
      unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

  /**
   * The EC2/on-premise Deployment Configuration to use for this Deployment Group.
   *
   * Default: ServerDeploymentConfig#OneAtATime
   */
  public fun deploymentConfig(): IServerDeploymentConfig? =
      unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

  /**
   * The physical, human-readable name of the CodeDeploy Deployment Group.
   *
   * Default: - An auto-generated name will be used.
   */
  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

  /**
   * All EC2 instances matching the given set of tags when a deployment occurs will be added to this
   * Deployment Group.
   *
   * Default: - No additional EC2 instances will be added to the Deployment Group.
   */
  public fun ec2InstanceTags(): InstanceTagSet? =
      unwrap(this).getEc2InstanceTags()?.let(InstanceTagSet::wrap)

  /**
   * Whether to skip the step of checking CloudWatch alarms during the deployment process.
   *
   * Default: - false
   */
  public fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

  /**
   * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
   *
   * Default: false
   */
  public fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

  /**
   * If you've provided any auto-scaling groups with the `#autoScalingGroups` property, you can set
   * this property to add User Data that installs the CodeDeploy agent on the instances.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/codedeploy-agent-operations-install.html)
   */
  public fun installAgent(): Boolean? = unwrap(this).getInstallAgent()

  /**
   * (deprecated) The load balancer to place in front of this Deployment Group.
   *
   * Can be created from either a classic Elastic Load Balancer,
   * or an Application Load Balancer / Network Load Balancer Target Group.
   *
   * Default: - Deployment Group will not have a load balancer defined.
   *
   * * Use `loadBalancers` instead.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun loadBalancer(): LoadBalancer? = unwrap(this).getLoadBalancer()?.let(LoadBalancer::wrap)

  /**
   * CodeDeploy supports the deployment to multiple load balancers.
   *
   * Specify either multiple Classic Load Balancers, or
   * Application Load Balancers / Network Load Balancers Target Groups.
   *
   * Default: - Deployment Group will not have load balancers defined.
   */
  public fun loadBalancers(): List<LoadBalancer> =
      unwrap(this).getLoadBalancers()?.map(LoadBalancer::wrap) ?: emptyList()

  /**
   * All on-premise instances matching the given set of tags when a deployment occurs will be added
   * to this Deployment Group.
   *
   * Default: - No additional on-premise instances will be added to the Deployment Group.
   */
  public fun onPremiseInstanceTags(): InstanceTagSet? =
      unwrap(this).getOnPremiseInstanceTags()?.let(InstanceTagSet::wrap)

  /**
   * The service Role of this Deployment Group.
   *
   * Default: - A new Role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [ServerDeploymentGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(alarms: List<IAlarm>)

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(vararg alarms: IAlarm)

    /**
     * @param application The CodeDeploy EC2/on-premise Application this Deployment Group belongs
     * to.
     */
    public fun application(application: IServerApplication)

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    public fun autoRollback(autoRollback: AutoRollbackConfig)

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3046950c6146b52965983daef23167566d290236d1d1ed3b9133ef276ad78864")
    public fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit)

    /**
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     */
    public fun autoScalingGroups(autoScalingGroups: List<IAutoScalingGroup>)

    /**
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     */
    public fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup)

    /**
     * @param deploymentConfig The EC2/on-premise Deployment Configuration to use for this
     * Deployment Group.
     */
    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig)

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group.
     */
    public fun deploymentGroupName(deploymentGroupName: String)

    /**
     * @param ec2InstanceTags All EC2 instances matching the given set of tags when a deployment
     * occurs will be added to this Deployment Group.
     */
    public fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet)

    /**
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process.
     */
    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean)

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed.
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean)

    /**
     * @param installAgent If you've provided any auto-scaling groups with the `#autoScalingGroups`
     * property, you can set this property to add User Data that installs the CodeDeploy agent on the
     * instances.
     */
    public fun installAgent(installAgent: Boolean)

    /**
     * @param loadBalancer The load balancer to place in front of this Deployment Group.
     * Can be created from either a classic Elastic Load Balancer,
     * or an Application Load Balancer / Network Load Balancer Target Group.
     * @deprecated - Use `loadBalancers` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun loadBalancer(loadBalancer: LoadBalancer)

    /**
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers.
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     */
    public fun loadBalancers(loadBalancers: List<LoadBalancer>)

    /**
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers.
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     */
    public fun loadBalancers(vararg loadBalancers: LoadBalancer)

    /**
     * @param onPremiseInstanceTags All on-premise instances matching the given set of tags when a
     * deployment occurs will be added to this Deployment Group.
     */
    public fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet)

    /**
     * @param role The service Role of this Deployment Group.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps.builder()

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    override fun alarms(alarms: List<IAlarm>) {
      cdkBuilder.alarms(alarms.map(IAlarm::unwrap))
    }

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     * CodeDeploy will stop (and optionally roll back)
     * a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    override fun alarms(vararg alarms: IAlarm): Unit = alarms(alarms.toList())

    /**
     * @param application The CodeDeploy EC2/on-premise Application this Deployment Group belongs
     * to.
     */
    override fun application(application: IServerApplication) {
      cdkBuilder.application(application.let(IServerApplication::unwrap))
    }

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    override fun autoRollback(autoRollback: AutoRollbackConfig) {
      cdkBuilder.autoRollback(autoRollback.let(AutoRollbackConfig::unwrap))
    }

    /**
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3046950c6146b52965983daef23167566d290236d1d1ed3b9133ef276ad78864")
    override fun autoRollback(autoRollback: AutoRollbackConfig.Builder.() -> Unit): Unit =
        autoRollback(AutoRollbackConfig(autoRollback))

    /**
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     */
    override fun autoScalingGroups(autoScalingGroups: List<IAutoScalingGroup>) {
      cdkBuilder.autoScalingGroups(autoScalingGroups.map(IAutoScalingGroup::unwrap))
    }

    /**
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     * Auto-scaling groups can also be added after the Deployment Group is created
     * using the `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata
     * for ASGs to install the codedeploy agent.
     */
    override fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup): Unit =
        autoScalingGroups(autoScalingGroups.toList())

    /**
     * @param deploymentConfig The EC2/on-premise Deployment Configuration to use for this
     * Deployment Group.
     */
    override fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
      cdkBuilder.deploymentConfig(deploymentConfig.let(IServerDeploymentConfig::unwrap))
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     * Group.
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * @param ec2InstanceTags All EC2 instances matching the given set of tags when a deployment
     * occurs will be added to this Deployment Group.
     */
    override fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet) {
      cdkBuilder.ec2InstanceTags(ec2InstanceTags.let(InstanceTagSet::unwrap))
    }

    /**
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     * the deployment process.
     */
    override fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
      cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     * status from CloudWatch failed.
     */
    override fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
      cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /**
     * @param installAgent If you've provided any auto-scaling groups with the `#autoScalingGroups`
     * property, you can set this property to add User Data that installs the CodeDeploy agent on the
     * instances.
     */
    override fun installAgent(installAgent: Boolean) {
      cdkBuilder.installAgent(installAgent)
    }

    /**
     * @param loadBalancer The load balancer to place in front of this Deployment Group.
     * Can be created from either a classic Elastic Load Balancer,
     * or an Application Load Balancer / Network Load Balancer Target Group.
     * @deprecated - Use `loadBalancers` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun loadBalancer(loadBalancer: LoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(LoadBalancer::unwrap))
    }

    /**
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers.
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     */
    override fun loadBalancers(loadBalancers: List<LoadBalancer>) {
      cdkBuilder.loadBalancers(loadBalancers.map(LoadBalancer::unwrap))
    }

    /**
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers.
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     */
    override fun loadBalancers(vararg loadBalancers: LoadBalancer): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * @param onPremiseInstanceTags All on-premise instances matching the given set of tags when a
     * deployment occurs will be added to this Deployment Group.
     */
    override fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet) {
      cdkBuilder.onPremiseInstanceTags(onPremiseInstanceTags.let(InstanceTagSet::unwrap))
    }

    /**
     * @param role The service Role of this Deployment Group.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps,
  ) : CdkObject(cdkObject), ServerDeploymentGroupProps {
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
     */
    override fun alarms(): List<IAlarm> = unwrap(this).getAlarms()?.map(IAlarm::wrap) ?: emptyList()

    /**
     * The CodeDeploy EC2/on-premise Application this Deployment Group belongs to.
     *
     * Default: - A new Application will be created.
     */
    override fun application(): IServerApplication? =
        unwrap(this).getApplication()?.let(IServerApplication::wrap)

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     */
    override fun autoRollback(): AutoRollbackConfig? =
        unwrap(this).getAutoRollback()?.let(AutoRollbackConfig::wrap)

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
     */
    override fun autoScalingGroups(): List<IAutoScalingGroup> =
        unwrap(this).getAutoScalingGroups()?.map(IAutoScalingGroup::wrap) ?: emptyList()

    /**
     * The EC2/on-premise Deployment Configuration to use for this Deployment Group.
     *
     * Default: ServerDeploymentConfig#OneAtATime
     */
    override fun deploymentConfig(): IServerDeploymentConfig? =
        unwrap(this).getDeploymentConfig()?.let(IServerDeploymentConfig::wrap)

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: - An auto-generated name will be used.
     */
    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    /**
     * All EC2 instances matching the given set of tags when a deployment occurs will be added to
     * this Deployment Group.
     *
     * Default: - No additional EC2 instances will be added to the Deployment Group.
     */
    override fun ec2InstanceTags(): InstanceTagSet? =
        unwrap(this).getEc2InstanceTags()?.let(InstanceTagSet::wrap)

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     */
    override fun ignoreAlarmConfiguration(): Boolean? = unwrap(this).getIgnoreAlarmConfiguration()

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     */
    override fun ignorePollAlarmsFailure(): Boolean? = unwrap(this).getIgnorePollAlarmsFailure()

    /**
     * If you've provided any auto-scaling groups with the `#autoScalingGroups` property, you can
     * set this property to add User Data that installs the CodeDeploy agent on the instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/codedeploy-agent-operations-install.html)
     */
    override fun installAgent(): Boolean? = unwrap(this).getInstallAgent()

    /**
     * (deprecated) The load balancer to place in front of this Deployment Group.
     *
     * Can be created from either a classic Elastic Load Balancer,
     * or an Application Load Balancer / Network Load Balancer Target Group.
     *
     * Default: - Deployment Group will not have a load balancer defined.
     *
     * * Use `loadBalancers` instead.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun loadBalancer(): LoadBalancer? =
        unwrap(this).getLoadBalancer()?.let(LoadBalancer::wrap)

    /**
     * CodeDeploy supports the deployment to multiple load balancers.
     *
     * Specify either multiple Classic Load Balancers, or
     * Application Load Balancers / Network Load Balancers Target Groups.
     *
     * Default: - Deployment Group will not have load balancers defined.
     */
    override fun loadBalancers(): List<LoadBalancer> =
        unwrap(this).getLoadBalancers()?.map(LoadBalancer::wrap) ?: emptyList()

    /**
     * All on-premise instances matching the given set of tags when a deployment occurs will be
     * added to this Deployment Group.
     *
     * Default: - No additional on-premise instances will be added to the Deployment Group.
     */
    override fun onPremiseInstanceTags(): InstanceTagSet? =
        unwrap(this).getOnPremiseInstanceTags()?.let(InstanceTagSet::wrap)

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps):
        ServerDeploymentGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
  }
}
