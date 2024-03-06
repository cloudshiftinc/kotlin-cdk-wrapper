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

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
import software.amazon.awscdk.services.codedeploy.IServerApplication
import software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.InstanceTagSet
import software.amazon.awscdk.services.codedeploy.LoadBalancer
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroup
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * A CodeDeploy Deployment Group that deploys to EC2/on-premise instances.
 *
 * Example:
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
@CdkDslMarker
public class ServerDeploymentGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ServerDeploymentGroup.Builder =
        ServerDeploymentGroup.Builder.create(scope, id)

    private val _alarms: MutableList<IAlarm> = mutableListOf()

    private val _autoScalingGroups: MutableList<IAutoScalingGroup> = mutableListOf()

    private val _loadBalancers: MutableList<LoadBalancer> = mutableListOf()

    /**
     * The CloudWatch alarms associated with this Deployment Group.
     *
     * CodeDeploy will stop (and optionally roll back) a deployment if during it any of the alarms
     * trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     *
     * Default: []
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
     *
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     */
    public fun alarms(vararg alarms: IAlarm) {
        _alarms.addAll(listOf(*alarms))
    }

    /**
     * The CloudWatch alarms associated with this Deployment Group.
     *
     * CodeDeploy will stop (and optionally roll back) a deployment if during it any of the alarms
     * trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     *
     * Default: []
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-create-alarms.html)
     *
     * @param alarms The CloudWatch alarms associated with this Deployment Group.
     */
    public fun alarms(alarms: Collection<IAlarm>) {
        _alarms.addAll(alarms)
    }

    /**
     * The CodeDeploy EC2/on-premise Application this Deployment Group belongs to.
     *
     * Default: - A new Application will be created.
     *
     * @param application The CodeDeploy EC2/on-premise Application this Deployment Group belongs
     *   to.
     */
    public fun application(application: IServerApplication) {
        cdkBuilder.application(application)
    }

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    public fun autoRollback(autoRollback: AutoRollbackConfigDsl.() -> Unit = {}) {
        val builder = AutoRollbackConfigDsl()
        builder.apply(autoRollback)
        cdkBuilder.autoRollback(builder.build())
    }

    /**
     * The auto-rollback configuration for this Deployment Group.
     *
     * Default: - default AutoRollbackConfig.
     *
     * @param autoRollback The auto-rollback configuration for this Deployment Group.
     */
    public fun autoRollback(autoRollback: AutoRollbackConfig) {
        cdkBuilder.autoRollback(autoRollback)
    }

    /**
     * The auto-scaling groups belonging to this Deployment Group.
     *
     * Auto-scaling groups can also be added after the Deployment Group is created using the
     * `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata for ASGs to install
     * the codedeploy agent.
     *
     * Default: []
     *
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     */
    public fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup) {
        _autoScalingGroups.addAll(listOf(*autoScalingGroups))
    }

    /**
     * The auto-scaling groups belonging to this Deployment Group.
     *
     * Auto-scaling groups can also be added after the Deployment Group is created using the
     * `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata for ASGs to install
     * the codedeploy agent.
     *
     * Default: []
     *
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     */
    public fun autoScalingGroups(autoScalingGroups: Collection<IAutoScalingGroup>) {
        _autoScalingGroups.addAll(autoScalingGroups)
    }

    /**
     * The EC2/on-premise Deployment Configuration to use for this Deployment Group.
     *
     * Default: ServerDeploymentConfig#OneAtATime
     *
     * @param deploymentConfig The EC2/on-premise Deployment Configuration to use for this
     *   Deployment Group.
     */
    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * The physical, human-readable name of the CodeDeploy Deployment Group.
     *
     * Default: - An auto-generated name will be used.
     *
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     *   Group.
     */
    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * All EC2 instances matching the given set of tags when a deployment occurs will be added to
     * this Deployment Group.
     *
     * Default: - No additional EC2 instances will be added to the Deployment Group.
     *
     * @param ec2InstanceTags All EC2 instances matching the given set of tags when a deployment
     *   occurs will be added to this Deployment Group.
     */
    public fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet) {
        cdkBuilder.ec2InstanceTags(ec2InstanceTags)
    }

    /**
     * Whether to skip the step of checking CloudWatch alarms during the deployment process.
     *
     * Default: - false
     *
     * @param ignoreAlarmConfiguration Whether to skip the step of checking CloudWatch alarms during
     *   the deployment process.
     */
    public fun ignoreAlarmConfiguration(ignoreAlarmConfiguration: Boolean) {
        cdkBuilder.ignoreAlarmConfiguration(ignoreAlarmConfiguration)
    }

    /**
     * Whether to continue a deployment even if fetching the alarm status from CloudWatch failed.
     *
     * Default: false
     *
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     *   status from CloudWatch failed.
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
        cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /**
     * If you've provided any auto-scaling groups with the `#autoScalingGroups` property, you can
     * set this property to add User Data that installs the CodeDeploy agent on the instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/codedeploy/latest/userguide/codedeploy-agent-operations-install.html)
     *
     * @param installAgent If you've provided any auto-scaling groups with the `#autoScalingGroups`
     *   property, you can set this property to add User Data that installs the CodeDeploy agent on
     *   the instances.
     */
    public fun installAgent(installAgent: Boolean) {
        cdkBuilder.installAgent(installAgent)
    }

    /**
     * (deprecated) The load balancer to place in front of this Deployment Group.
     *
     * Can be created from either a classic Elastic Load Balancer, or an Application Load Balancer /
     * Network Load Balancer Target Group.
     *
     * Default: - Deployment Group will not have a load balancer defined.
     * * Use `loadBalancers` instead.
     *
     * @param loadBalancer The load balancer to place in front of this Deployment Group.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun loadBalancer(loadBalancer: LoadBalancer) {
        cdkBuilder.loadBalancer(loadBalancer)
    }

    /**
     * CodeDeploy supports the deployment to multiple load balancers.
     *
     * Specify either multiple Classic Load Balancers, or Application Load Balancers / Network Load
     * Balancers Target Groups.
     *
     * Default: - Deployment Group will not have load balancers defined.
     *
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers.
     */
    public fun loadBalancers(vararg loadBalancers: LoadBalancer) {
        _loadBalancers.addAll(listOf(*loadBalancers))
    }

    /**
     * CodeDeploy supports the deployment to multiple load balancers.
     *
     * Specify either multiple Classic Load Balancers, or Application Load Balancers / Network Load
     * Balancers Target Groups.
     *
     * Default: - Deployment Group will not have load balancers defined.
     *
     * @param loadBalancers CodeDeploy supports the deployment to multiple load balancers.
     */
    public fun loadBalancers(loadBalancers: Collection<LoadBalancer>) {
        _loadBalancers.addAll(loadBalancers)
    }

    /**
     * All on-premise instances matching the given set of tags when a deployment occurs will be
     * added to this Deployment Group.
     *
     * Default: - No additional on-premise instances will be added to the Deployment Group.
     *
     * @param onPremiseInstanceTags All on-premise instances matching the given set of tags when a
     *   deployment occurs will be added to this Deployment Group.
     */
    public fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet) {
        cdkBuilder.onPremiseInstanceTags(onPremiseInstanceTags)
    }

    /**
     * The service Role of this Deployment Group.
     *
     * Default: - A new Role will be created.
     *
     * @param role The service Role of this Deployment Group.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): ServerDeploymentGroup {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        if (_autoScalingGroups.isNotEmpty()) cdkBuilder.autoScalingGroups(_autoScalingGroups)
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        return cdkBuilder.build()
    }
}
