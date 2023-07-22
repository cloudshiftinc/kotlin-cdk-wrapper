@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnDeploymentGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDeploymentGroup.Builder = CfnDeploymentGroup.Builder.create(scope, id)

  private val _autoScalingGroups: MutableList<String> = mutableListOf()

  private val _ec2TagFilters: MutableList<Any> = mutableListOf()

  private val _ecsServices: MutableList<Any> = mutableListOf()

  private val _onPremisesInstanceTagFilters: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _triggerConfigurations: MutableList<Any> = mutableListOf()

  /**
   * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
   * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
   * with the deployment group. 
   */
  public fun alarmConfiguration(alarmConfiguration: IResolvable) {
    cdkBuilder.alarmConfiguration(alarmConfiguration)
  }

  /**
   * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
   * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
   * with the deployment group. 
   */
  public fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty) {
    cdkBuilder.alarmConfiguration(alarmConfiguration)
  }

  /**
   * The name of an existing CodeDeploy application to associate this deployment group with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
   * @param applicationName The name of an existing CodeDeploy application to associate this
   * deployment group with. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * Information about the automatic rollback configuration that is associated with the deployment
   * group.
   *
   * If you specify this property, don't specify the `Deployment` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
   * @param autoRollbackConfiguration Information about the automatic rollback configuration that is
   * associated with the deployment group. 
   */
  public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
    cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
  }

  /**
   * Information about the automatic rollback configuration that is associated with the deployment
   * group.
   *
   * If you specify this property, don't specify the `Deployment` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
   * @param autoRollbackConfiguration Information about the automatic rollback configuration that is
   * associated with the deployment group. 
   */
  public
      fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty) {
    cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
  }

  /**
   * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
   * when new instances are created.
   *
   * Duplicates are not allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
   * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy automatically
   * deploys revisions to when new instances are created. 
   */
  public fun autoScalingGroups(vararg autoScalingGroups: String) {
    _autoScalingGroups.addAll(listOf(*autoScalingGroups))
  }

  /**
   * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
   * when new instances are created.
   *
   * Duplicates are not allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
   * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy automatically
   * deploys revisions to when new instances are created. 
   */
  public fun autoScalingGroups(autoScalingGroups: Collection<String>) {
    _autoScalingGroups.addAll(autoScalingGroups)
  }

  /**
   * Information about blue/green deployment options for a deployment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
   * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
   * deployment group. 
   */
  public fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable) {
    cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration)
  }

  /**
   * Information about blue/green deployment options for a deployment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
   * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
   * deployment group. 
   */
  public
      fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty) {
    cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration)
  }

  /**
   * The application revision to deploy to this deployment group.
   *
   * If you specify this property, your target application revision is deployed as soon as the
   * provisioning process is complete. If you specify this property, don't specify the
   * `AutoRollbackConfiguration` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
   * @param deployment The application revision to deploy to this deployment group. 
   */
  public fun deployment(deployment: IResolvable) {
    cdkBuilder.deployment(deployment)
  }

  /**
   * The application revision to deploy to this deployment group.
   *
   * If you specify this property, your target application revision is deployed as soon as the
   * provisioning process is complete. If you specify this property, don't specify the
   * `AutoRollbackConfiguration` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
   * @param deployment The application revision to deploy to this deployment group. 
   */
  public fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty) {
    cdkBuilder.deployment(deployment)
  }

  /**
   * A deployment configuration name or a predefined configuration name.
   *
   * With predefined configurations, you can deploy application revisions to one instance at a time
   * ( `CodeDeployDefault.OneAtATime` ), half of the instances at a time (
   * `CodeDeployDefault.HalfAtATime` ), or all the instances at once ( `CodeDeployDefault.AllAtOnce` ).
   * For more information and valid values, see [Working with Deployment
   * Configurations](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html)
   * in the *AWS CodeDeploy User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname)
   * @param deploymentConfigName A deployment configuration name or a predefined configuration name.
   * 
   */
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  /**
   * A name for the deployment group.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the deployment group name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname)
   * @param deploymentGroupName A name for the deployment group. 
   */
  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  /**
   * Attributes that determine the type of deployment to run and whether to route deployment traffic
   * behind a load balancer.
   *
   * If you specify this property with a blue/green deployment type, don't specify the
   * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
   *
   *
   * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute platforms
   * only. You can perform Amazon ECS blue/green deployments using `AWS::CodeDeploy::BlueGreen` hook.
   * See [Perform Amazon ECS blue/green deployments through CodeDeploy using AWS
   * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
   * for more information.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
   * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
   * route deployment traffic behind a load balancer. 
   */
  public fun deploymentStyle(deploymentStyle: IResolvable) {
    cdkBuilder.deploymentStyle(deploymentStyle)
  }

  /**
   * Attributes that determine the type of deployment to run and whether to route deployment traffic
   * behind a load balancer.
   *
   * If you specify this property with a blue/green deployment type, don't specify the
   * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
   *
   *
   * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute platforms
   * only. You can perform Amazon ECS blue/green deployments using `AWS::CodeDeploy::BlueGreen` hook.
   * See [Perform Amazon ECS blue/green deployments through CodeDeploy using AWS
   * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
   * for more information.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
   * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
   * route deployment traffic behind a load balancer. 
   */
  public fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty) {
    cdkBuilder.deploymentStyle(deploymentStyle)
  }

  /**
   * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
   * in the deployment group.
   *
   * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in this
   * deployment group. Duplicates are not allowed.
   *
   * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
   * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances that
   * you want to include in the deployment group. 
   */
  public fun ec2TagFilters(vararg ec2TagFilters: Any) {
    _ec2TagFilters.addAll(listOf(*ec2TagFilters))
  }

  /**
   * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
   * in the deployment group.
   *
   * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in this
   * deployment group. Duplicates are not allowed.
   *
   * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
   * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances that
   * you want to include in the deployment group. 
   */
  public fun ec2TagFilters(ec2TagFilters: Collection<Any>) {
    _ec2TagFilters.addAll(ec2TagFilters)
  }

  /**
   * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
   * in the deployment group.
   *
   * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in this
   * deployment group. Duplicates are not allowed.
   *
   * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
   * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances that
   * you want to include in the deployment group. 
   */
  public fun ec2TagFilters(ec2TagFilters: IResolvable) {
    cdkBuilder.ec2TagFilters(ec2TagFilters)
  }

  /**
   * Information about groups of tags applied to Amazon EC2 instances.
   *
   * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
   * Cannot be used in the same call as `ec2TagFilter` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
   * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
   */
  public fun ec2TagSet(ec2TagSet: IResolvable) {
    cdkBuilder.ec2TagSet(ec2TagSet)
  }

  /**
   * Information about groups of tags applied to Amazon EC2 instances.
   *
   * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
   * Cannot be used in the same call as `ec2TagFilter` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
   * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances. 
   */
  public fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty) {
    cdkBuilder.ec2TagSet(ec2TagSet)
  }

  /**
   * The target Amazon ECS services in the deployment group.
   *
   * This applies only to deployment groups that use the Amazon ECS compute platform. A target
   * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
   * `&lt;clustername&gt;:&lt;servicename&gt;` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
   * @param ecsServices The target Amazon ECS services in the deployment group. 
   */
  public fun ecsServices(vararg ecsServices: Any) {
    _ecsServices.addAll(listOf(*ecsServices))
  }

  /**
   * The target Amazon ECS services in the deployment group.
   *
   * This applies only to deployment groups that use the Amazon ECS compute platform. A target
   * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
   * `&lt;clustername&gt;:&lt;servicename&gt;` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
   * @param ecsServices The target Amazon ECS services in the deployment group. 
   */
  public fun ecsServices(ecsServices: Collection<Any>) {
    _ecsServices.addAll(ecsServices)
  }

  /**
   * The target Amazon ECS services in the deployment group.
   *
   * This applies only to deployment groups that use the Amazon ECS compute platform. A target
   * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
   * `&lt;clustername&gt;:&lt;servicename&gt;` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
   * @param ecsServices The target Amazon ECS services in the deployment group. 
   */
  public fun ecsServices(ecsServices: IResolvable) {
    cdkBuilder.ecsServices(ecsServices)
  }

  /**
   * Information about the load balancer to use in a deployment.
   *
   * For more information, see [Integrating CodeDeploy with Elastic Load
   * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
   * in the *AWS CodeDeploy User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
   * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
   */
  public fun loadBalancerInfo(loadBalancerInfo: IResolvable) {
    cdkBuilder.loadBalancerInfo(loadBalancerInfo)
  }

  /**
   * Information about the load balancer to use in a deployment.
   *
   * For more information, see [Integrating CodeDeploy with Elastic Load
   * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
   * in the *AWS CodeDeploy User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
   * @param loadBalancerInfo Information about the load balancer to use in a deployment. 
   */
  public fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty) {
    cdkBuilder.loadBalancerInfo(loadBalancerInfo)
  }

  /**
   * The on-premises instance tags already applied to on-premises instances that you want to include
   * in the deployment group.
   *
   * CodeDeploy includes all on-premises instances identified by any of the tags you specify in this
   * deployment group. To register on-premises instances with CodeDeploy , see [Working with
   * On-Premises Instances for
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html) in
   * the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
   *
   * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
   * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
   * on-premises instances that you want to include in the deployment group. 
   */
  public fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any) {
    _onPremisesInstanceTagFilters.addAll(listOf(*onPremisesInstanceTagFilters))
  }

  /**
   * The on-premises instance tags already applied to on-premises instances that you want to include
   * in the deployment group.
   *
   * CodeDeploy includes all on-premises instances identified by any of the tags you specify in this
   * deployment group. To register on-premises instances with CodeDeploy , see [Working with
   * On-Premises Instances for
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html) in
   * the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
   *
   * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
   * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
   * on-premises instances that you want to include in the deployment group. 
   */
  public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: Collection<Any>) {
    _onPremisesInstanceTagFilters.addAll(onPremisesInstanceTagFilters)
  }

  /**
   * The on-premises instance tags already applied to on-premises instances that you want to include
   * in the deployment group.
   *
   * CodeDeploy includes all on-premises instances identified by any of the tags you specify in this
   * deployment group. To register on-premises instances with CodeDeploy , see [Working with
   * On-Premises Instances for
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html) in
   * the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
   *
   * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
   * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
   * on-premises instances that you want to include in the deployment group. 
   */
  public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable) {
    cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters)
  }

  /**
   * Information about groups of tags applied to on-premises instances.
   *
   * The deployment group includes only on-premises instances identified by all the tag groups.
   *
   * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
   * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
   */
  public fun onPremisesTagSet(onPremisesTagSet: IResolvable) {
    cdkBuilder.onPremisesTagSet(onPremisesTagSet)
  }

  /**
   * Information about groups of tags applied to on-premises instances.
   *
   * The deployment group includes only on-premises instances identified by all the tag groups.
   *
   * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
   * @param onPremisesTagSet Information about groups of tags applied to on-premises instances. 
   */
  public fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty) {
    cdkBuilder.onPremisesTagSet(onPremisesTagSet)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-outdatedinstancesstrategy)
   * @param outdatedInstancesStrategy 
   */
  public fun outdatedInstancesStrategy(outdatedInstancesStrategy: String) {
    cdkBuilder.outdatedInstancesStrategy(outdatedInstancesStrategy)
  }

  /**
   * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to
   * AWS services on your behalf.
   *
   * For more information, see [Create a Service Role for AWS
   * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html)
   * in the *AWS CodeDeploy User Guide* .
   *
   *
   * In some cases, you might need to add a dependency on the service role's policy. For more
   * information, see IAM role policy in [DependsOn
   * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn)
   * @param serviceRoleArn A service role Amazon Resource Name (ARN) that grants CodeDeploy
   * permission to make calls to AWS services on your behalf. 
   */
  public fun serviceRoleArn(serviceRoleArn: String) {
    cdkBuilder.serviceRoleArn(serviceRoleArn)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
   * @param tags 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
   * @param tags 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Information about triggers associated with the deployment group.
   *
   * Duplicates are not allowed
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
   * @param triggerConfigurations Information about triggers associated with the deployment group. 
   */
  public fun triggerConfigurations(vararg triggerConfigurations: Any) {
    _triggerConfigurations.addAll(listOf(*triggerConfigurations))
  }

  /**
   * Information about triggers associated with the deployment group.
   *
   * Duplicates are not allowed
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
   * @param triggerConfigurations Information about triggers associated with the deployment group. 
   */
  public fun triggerConfigurations(triggerConfigurations: Collection<Any>) {
    _triggerConfigurations.addAll(triggerConfigurations)
  }

  /**
   * Information about triggers associated with the deployment group.
   *
   * Duplicates are not allowed
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
   * @param triggerConfigurations Information about triggers associated with the deployment group. 
   */
  public fun triggerConfigurations(triggerConfigurations: IResolvable) {
    cdkBuilder.triggerConfigurations(triggerConfigurations)
  }

  public fun build(): CfnDeploymentGroup {
    if(_autoScalingGroups.isNotEmpty()) cdkBuilder.autoScalingGroups(_autoScalingGroups)
    if(_ec2TagFilters.isNotEmpty()) cdkBuilder.ec2TagFilters(_ec2TagFilters)
    if(_ecsServices.isNotEmpty()) cdkBuilder.ecsServices(_ecsServices)
    if(_onPremisesInstanceTagFilters.isNotEmpty())
        cdkBuilder.onPremisesInstanceTagFilters(_onPremisesInstanceTagFilters)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_triggerConfigurations.isNotEmpty()) cdkBuilder.triggerConfigurations(_triggerConfigurations)
    return cdkBuilder.build()
  }
}
