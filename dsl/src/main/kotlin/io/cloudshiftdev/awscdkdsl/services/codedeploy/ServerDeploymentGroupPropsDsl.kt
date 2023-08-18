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
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Construction properties for `ServerDeploymentGroup`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * LoadBalancer lb;
 * lb.addListener(LoadBalancerListener.builder()
 * .externalPort(80)
 * .build());
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "DeploymentGroup")
 * .loadBalancer(LoadBalancer.classic(lb))
 * .build();
 * ```
 */
@CdkDslMarker
public class ServerDeploymentGroupPropsDsl {
    private val cdkBuilder: ServerDeploymentGroupProps.Builder =
        ServerDeploymentGroupProps.builder()

    private val _alarms: MutableList<IAlarm> = mutableListOf()

    private val _autoScalingGroups: MutableList<IAutoScalingGroup> = mutableListOf()

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group. CodeDeploy will
     *   stop (and optionally roll back) a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(vararg alarms: IAlarm) {
        _alarms.addAll(listOf(*alarms))
    }

    /**
     * @param alarms The CloudWatch alarms associated with this Deployment Group. CodeDeploy will
     *   stop (and optionally roll back) a deployment if during it any of the alarms trigger.
     *
     * Alarms can also be added after the Deployment Group is created using the `#addAlarm` method.
     */
    public fun alarms(alarms: Collection<IAlarm>) {
        _alarms.addAll(alarms)
    }

    /**
     * @param application The CodeDeploy EC2/on-premise Application this Deployment Group belongs
     *   to.
     */
    public fun application(application: IServerApplication) {
        cdkBuilder.application(application)
    }

    /** @param autoRollback The auto-rollback configuration for this Deployment Group. */
    public fun autoRollback(autoRollback: AutoRollbackConfigDsl.() -> Unit = {}) {
        val builder = AutoRollbackConfigDsl()
        builder.apply(autoRollback)
        cdkBuilder.autoRollback(builder.build())
    }

    /** @param autoRollback The auto-rollback configuration for this Deployment Group. */
    public fun autoRollback(autoRollback: AutoRollbackConfig) {
        cdkBuilder.autoRollback(autoRollback)
    }

    /**
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     *   Auto-scaling groups can also be added after the Deployment Group is created using the
     *   `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata for ASGs to install
     * the codedeploy agent.
     */
    public fun autoScalingGroups(vararg autoScalingGroups: IAutoScalingGroup) {
        _autoScalingGroups.addAll(listOf(*autoScalingGroups))
    }

    /**
     * @param autoScalingGroups The auto-scaling groups belonging to this Deployment Group.
     *   Auto-scaling groups can also be added after the Deployment Group is created using the
     *   `#addAutoScalingGroup` method.
     *
     * [disable-awslint:ref-via-interface] is needed because we update userdata for ASGs to install
     * the codedeploy agent.
     */
    public fun autoScalingGroups(autoScalingGroups: Collection<IAutoScalingGroup>) {
        _autoScalingGroups.addAll(autoScalingGroups)
    }

    /**
     * @param deploymentConfig The EC2/on-premise Deployment Configuration to use for this
     *   Deployment Group.
     */
    public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
        cdkBuilder.deploymentConfig(deploymentConfig)
    }

    /**
     * @param deploymentGroupName The physical, human-readable name of the CodeDeploy Deployment
     *   Group.
     */
    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * @param ec2InstanceTags All EC2 instances matching the given set of tags when a deployment
     *   occurs will be added to this Deployment Group.
     */
    public fun ec2InstanceTags(ec2InstanceTags: InstanceTagSet) {
        cdkBuilder.ec2InstanceTags(ec2InstanceTags)
    }

    /**
     * @param ignorePollAlarmsFailure Whether to continue a deployment even if fetching the alarm
     *   status from CloudWatch failed.
     */
    public fun ignorePollAlarmsFailure(ignorePollAlarmsFailure: Boolean) {
        cdkBuilder.ignorePollAlarmsFailure(ignorePollAlarmsFailure)
    }

    /**
     * @param installAgent If you've provided any auto-scaling groups with the `#autoScalingGroups`
     *   property, you can set this property to add User Data that installs the CodeDeploy agent on
     *   the instances.
     */
    public fun installAgent(installAgent: Boolean) {
        cdkBuilder.installAgent(installAgent)
    }

    /**
     * @param loadBalancer The load balancer to place in front of this Deployment Group. Can be
     *   created from either a classic Elastic Load Balancer, or an Application Load Balancer /
     *   Network Load Balancer Target Group.
     */
    public fun loadBalancer(loadBalancer: LoadBalancer) {
        cdkBuilder.loadBalancer(loadBalancer)
    }

    /**
     * @param onPremiseInstanceTags All on-premise instances matching the given set of tags when a
     *   deployment occurs will be added to this Deployment Group.
     */
    public fun onPremiseInstanceTags(onPremiseInstanceTags: InstanceTagSet) {
        cdkBuilder.onPremiseInstanceTags(onPremiseInstanceTags)
    }

    /** @param role The service Role of this Deployment Group. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): ServerDeploymentGroupProps {
        if (_alarms.isNotEmpty()) cdkBuilder.alarms(_alarms)
        if (_autoScalingGroups.isNotEmpty()) cdkBuilder.autoScalingGroups(_autoScalingGroups)
        return cdkBuilder.build()
    }
}
