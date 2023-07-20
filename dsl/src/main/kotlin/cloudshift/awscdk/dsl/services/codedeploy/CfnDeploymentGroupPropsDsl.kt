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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeploymentGroupPropsDsl {
    private val cdkBuilder: CfnDeploymentGroupProps.Builder = CfnDeploymentGroupProps.builder()

    private val _autoScalingGroups: MutableList<String> = mutableListOf()

    private val _ec2TagFilters: MutableList<Any> = mutableListOf()

    private val _ecsServices: MutableList<Any> = mutableListOf()

    private val _onPremisesInstanceTagFilters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _triggerConfigurations: MutableList<Any> = mutableListOf()

    public fun alarmConfiguration(alarmConfiguration: IResolvable) {
        cdkBuilder.alarmConfiguration(alarmConfiguration)
    }

    public fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty) {
        cdkBuilder.alarmConfiguration(alarmConfiguration)
    }

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
    }

    public fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty) {
        cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
    }

    public fun autoScalingGroups(vararg autoScalingGroups: String) {
        _autoScalingGroups.addAll(listOf(*autoScalingGroups))
    }

    public fun autoScalingGroups(autoScalingGroups: Collection<String>) {
        _autoScalingGroups.addAll(autoScalingGroups)
    }

    public fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable) {
        cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration)
    }

    public fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty) {
        cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration)
    }

    public fun deployment(deployment: IResolvable) {
        cdkBuilder.deployment(deployment)
    }

    public fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty) {
        cdkBuilder.deployment(deployment)
    }

    public fun deploymentConfigName(deploymentConfigName: String) {
        cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    public fun deploymentGroupName(deploymentGroupName: String) {
        cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    public fun deploymentStyle(deploymentStyle: IResolvable) {
        cdkBuilder.deploymentStyle(deploymentStyle)
    }

    public fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty) {
        cdkBuilder.deploymentStyle(deploymentStyle)
    }

    public fun ec2TagFilters(vararg ec2TagFilters: Any) {
        _ec2TagFilters.addAll(listOf(*ec2TagFilters))
    }

    public fun ec2TagFilters(ec2TagFilters: Collection<Any>) {
        _ec2TagFilters.addAll(ec2TagFilters)
    }

    public fun ec2TagFilters(ec2TagFilters: IResolvable) {
        cdkBuilder.ec2TagFilters(ec2TagFilters)
    }

    public fun ec2TagSet(ec2TagSet: IResolvable) {
        cdkBuilder.ec2TagSet(ec2TagSet)
    }

    public fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty) {
        cdkBuilder.ec2TagSet(ec2TagSet)
    }

    public fun ecsServices(vararg ecsServices: Any) {
        _ecsServices.addAll(listOf(*ecsServices))
    }

    public fun ecsServices(ecsServices: Collection<Any>) {
        _ecsServices.addAll(ecsServices)
    }

    public fun ecsServices(ecsServices: IResolvable) {
        cdkBuilder.ecsServices(ecsServices)
    }

    public fun loadBalancerInfo(loadBalancerInfo: IResolvable) {
        cdkBuilder.loadBalancerInfo(loadBalancerInfo)
    }

    public fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty) {
        cdkBuilder.loadBalancerInfo(loadBalancerInfo)
    }

    public fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any) {
        _onPremisesInstanceTagFilters.addAll(listOf(*onPremisesInstanceTagFilters))
    }

    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: Collection<Any>) {
        _onPremisesInstanceTagFilters.addAll(onPremisesInstanceTagFilters)
    }

    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable) {
        cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters)
    }

    public fun onPremisesTagSet(onPremisesTagSet: IResolvable) {
        cdkBuilder.onPremisesTagSet(onPremisesTagSet)
    }

    public fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty) {
        cdkBuilder.onPremisesTagSet(onPremisesTagSet)
    }

    public fun outdatedInstancesStrategy(outdatedInstancesStrategy: String) {
        cdkBuilder.outdatedInstancesStrategy(outdatedInstancesStrategy)
    }

    public fun serviceRoleArn(serviceRoleArn: String) {
        cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun triggerConfigurations(vararg triggerConfigurations: Any) {
        _triggerConfigurations.addAll(listOf(*triggerConfigurations))
    }

    public fun triggerConfigurations(triggerConfigurations: Collection<Any>) {
        _triggerConfigurations.addAll(triggerConfigurations)
    }

    public fun triggerConfigurations(triggerConfigurations: IResolvable) {
        cdkBuilder.triggerConfigurations(triggerConfigurations)
    }

    public fun build(): CfnDeploymentGroupProps {
        if (_autoScalingGroups.isNotEmpty()) cdkBuilder.autoScalingGroups(_autoScalingGroups)
        if (_ec2TagFilters.isNotEmpty()) cdkBuilder.ec2TagFilters(_ec2TagFilters)
        if (_ecsServices.isNotEmpty()) cdkBuilder.ecsServices(_ecsServices)
        if (_onPremisesInstanceTagFilters.isNotEmpty()) {
            cdkBuilder.onPremisesInstanceTagFilters(_onPremisesInstanceTagFilters)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_triggerConfigurations.isNotEmpty()) cdkBuilder.triggerConfigurations(_triggerConfigurations)
        return cdkBuilder.build()
    }
}
