package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDeploymentGroupProps {
  /**
   * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
   */
  public fun alarmConfiguration(): Any? = unwrap(this).getAlarmConfiguration()

  /**
   * The name of an existing CodeDeploy application to associate this deployment group with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
   */
  public fun applicationName(): String

  /**
   * Information about the automatic rollback configuration that is associated with the deployment
   * group.
   *
   * If you specify this property, don't specify the `Deployment` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
   */
  public fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

  /**
   * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
   * when new instances are created.
   *
   * Duplicates are not allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
   */
  public fun autoScalingGroups(): List<String> = unwrap(this).getAutoScalingGroups() ?: emptyList()

  /**
   * Information about blue/green deployment options for a deployment group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
   */
  public fun blueGreenDeploymentConfiguration(): Any? =
      unwrap(this).getBlueGreenDeploymentConfiguration()

  /**
   * The application revision to deploy to this deployment group.
   *
   * If you specify this property, your target application revision is deployed as soon as the
   * provisioning process is complete. If you specify this property, don't specify the
   * `AutoRollbackConfiguration` property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
   */
  public fun deployment(): Any? = unwrap(this).getDeployment()

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
   */
  public fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

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
   */
  public fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

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
   */
  public fun deploymentStyle(): Any? = unwrap(this).getDeploymentStyle()

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
   */
  public fun ec2TagFilters(): Any? = unwrap(this).getEc2TagFilters()

  /**
   * Information about groups of tags applied to Amazon EC2 instances.
   *
   * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
   * Cannot be used in the same call as `ec2TagFilter` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
   */
  public fun ec2TagSet(): Any? = unwrap(this).getEc2TagSet()

  /**
   * The target Amazon ECS services in the deployment group.
   *
   * This applies only to deployment groups that use the Amazon ECS compute platform. A target
   * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
   * `&lt;clustername&gt;:&lt;servicename&gt;` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
   */
  public fun ecsServices(): Any? = unwrap(this).getEcsServices()

  /**
   * Information about the load balancer to use in a deployment.
   *
   * For more information, see [Integrating CodeDeploy with Elastic Load
   * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
   * in the *AWS CodeDeploy User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
   */
  public fun loadBalancerInfo(): Any? = unwrap(this).getLoadBalancerInfo()

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
   */
  public fun onPremisesInstanceTagFilters(): Any? = unwrap(this).getOnPremisesInstanceTagFilters()

  /**
   * Information about groups of tags applied to on-premises instances.
   *
   * The deployment group includes only on-premises instances identified by all the tag groups.
   *
   * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
   */
  public fun onPremisesTagSet(): Any? = unwrap(this).getOnPremisesTagSet()

  /**
   * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not
   * receive the deployed application revision.
   *
   * If this option is set to `UPDATE` or is unspecified, CodeDeploy initiates one or more
   * 'auto-update outdated instances' deployments to apply the deployed application revision to the new
   * Amazon EC2 instances.
   *
   * If this option is set to `IGNORE` , CodeDeploy does not initiate a deployment to update the new
   * Amazon EC2 instances. This may result in instances having different revisions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-outdatedinstancesstrategy)
   */
  public fun outdatedInstancesStrategy(): String? = unwrap(this).getOutdatedInstancesStrategy()

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
   */
  public fun serviceRoleArn(): String

  /**
   * The metadata that you apply to CodeDeploy deployment groups to help you organize and categorize
   * them.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Indicates whether the deployment group was configured to have CodeDeploy install a termination
   * hook into an Auto Scaling group.
   *
   * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
   * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
   * in the *AWS CodeDeploy User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-terminationhookenabled)
   */
  public fun terminationHookEnabled(): Any? = unwrap(this).getTerminationHookEnabled()

  /**
   * Information about triggers associated with the deployment group.
   *
   * Duplicates are not allowed
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
   */
  public fun triggerConfigurations(): Any? = unwrap(this).getTriggerConfigurations()

  /**
   * A builder for [CfnDeploymentGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group.
     */
    public fun alarmConfiguration(alarmConfiguration: IResolvable)

    /**
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group.
     */
    public fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty)

    /**
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752d17c273d96d68942144b914431bd2b74dd97401018429d6ed6da6c0c01ae4")
    public
        fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty.Builder.() -> Unit)

    /**
     * @param applicationName The name of an existing CodeDeploy application to associate this
     * deployment group with. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group.
     * If you specify this property, don't specify the `Deployment` property.
     */
    public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable)

    /**
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group.
     * If you specify this property, don't specify the `Deployment` property.
     */
    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty)

    /**
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group.
     * If you specify this property, don't specify the `Deployment` property.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd617bf78494360209f8489c9ebc34e864a5519f551d825d84e1eb9b6e4646fd")
    public
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder.() -> Unit)

    /**
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created.
     * Duplicates are not allowed.
     */
    public fun autoScalingGroups(autoScalingGroups: List<String>)

    /**
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created.
     * Duplicates are not allowed.
     */
    public fun autoScalingGroups(vararg autoScalingGroups: String)

    /**
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group.
     */
    public fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable)

    /**
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group.
     */
    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty)

    /**
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ff9a3dd1ca2e8fcbcbab64638e71692e578f15ddc73f49bb67094de6ecb43e")
    public
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param deployment The application revision to deploy to this deployment group.
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     */
    public fun deployment(deployment: IResolvable)

    /**
     * @param deployment The application revision to deploy to this deployment group.
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     */
    public fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty)

    /**
     * @param deployment The application revision to deploy to this deployment group.
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e8321a2c4159ce336711aaef4da1bc73c537604236c821b2dce109b860c8f08")
    public fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty.Builder.() -> Unit)

    /**
     * @param deploymentConfigName A deployment configuration name or a predefined configuration
     * name.
     * With predefined configurations, you can deploy application revisions to one instance at a
     * time ( `CodeDeployDefault.OneAtATime` ), half of the instances at a time (
     * `CodeDeployDefault.HalfAtATime` ), or all the instances at once ( `CodeDeployDefault.AllAtOnce`
     * ). For more information and valid values, see [Working with Deployment
     * Configurations](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    public fun deploymentConfigName(deploymentConfigName: String)

    /**
     * @param deploymentGroupName A name for the deployment group.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment group name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun deploymentGroupName(deploymentGroupName: String)

    /**
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer.
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     */
    public fun deploymentStyle(deploymentStyle: IResolvable)

    /**
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer.
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     */
    public fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty)

    /**
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer.
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e2d0cd76ae805545f6ebae24c2a9649c6f4bb198d17d50683364022e9c4f3d")
    public
        fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty.Builder.() -> Unit)

    /**
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group.
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     */
    public fun ec2TagFilters(ec2TagFilters: IResolvable)

    /**
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group.
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     */
    public fun ec2TagFilters(ec2TagFilters: List<Any>)

    /**
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group.
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     */
    public fun ec2TagFilters(vararg ec2TagFilters: Any)

    /**
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances.
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     */
    public fun ec2TagSet(ec2TagSet: IResolvable)

    /**
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances.
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     */
    public fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty)

    /**
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances.
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b277633da03ac6243e849e9b71a04b3e5a52c1f6fb3d27ebf790c7c05cbd62")
    public fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty.Builder.() -> Unit)

    /**
     * @param ecsServices The target Amazon ECS services in the deployment group.
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     */
    public fun ecsServices(ecsServices: IResolvable)

    /**
     * @param ecsServices The target Amazon ECS services in the deployment group.
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     */
    public fun ecsServices(ecsServices: List<Any>)

    /**
     * @param ecsServices The target Amazon ECS services in the deployment group.
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     */
    public fun ecsServices(vararg ecsServices: Any)

    /**
     * @param loadBalancerInfo Information about the load balancer to use in a deployment.
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    public fun loadBalancerInfo(loadBalancerInfo: IResolvable)

    /**
     * @param loadBalancerInfo Information about the load balancer to use in a deployment.
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    public fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty)

    /**
     * @param loadBalancerInfo Information about the load balancer to use in a deployment.
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5c8806b3ca93f50b993e4fed27e7905a070fa29c8a96f1491776d7de802a454")
    public
        fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty.Builder.() -> Unit)

    /**
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group.
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable)

    /**
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group.
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    public fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>)

    /**
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group.
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    public fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any)

    /**
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances.
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    public fun onPremisesTagSet(onPremisesTagSet: IResolvable)

    /**
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances.
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    public fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty)

    /**
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances.
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4c19b76ece4da92c21c94bb36e73c9999b231fe247f659c8399e706e58e1e3a")
    public
        fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder.() -> Unit)

    /**
     * @param outdatedInstancesStrategy Indicates what happens when new Amazon EC2 instances are
     * launched mid-deployment and do not receive the deployed application revision.
     * If this option is set to `UPDATE` or is unspecified, CodeDeploy initiates one or more
     * 'auto-update outdated instances' deployments to apply the deployed application revision to the
     * new Amazon EC2 instances.
     *
     * If this option is set to `IGNORE` , CodeDeploy does not initiate a deployment to update the
     * new Amazon EC2 instances. This may result in instances having different revisions.
     */
    public fun outdatedInstancesStrategy(outdatedInstancesStrategy: String)

    /**
     * @param serviceRoleArn A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. 
     * For more information, see [Create a Service Role for AWS
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     *
     * In some cases, you might need to add a dependency on the service role's policy. For more
     * information, see IAM role policy in [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    public fun serviceRoleArn(serviceRoleArn: String)

    /**
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group.
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     */
    public fun terminationHookEnabled(terminationHookEnabled: Boolean)

    /**
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group.
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     */
    public fun terminationHookEnabled(terminationHookEnabled: IResolvable)

    /**
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * Duplicates are not allowed
     */
    public fun triggerConfigurations(triggerConfigurations: IResolvable)

    /**
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * Duplicates are not allowed
     */
    public fun triggerConfigurations(triggerConfigurations: List<Any>)

    /**
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * Duplicates are not allowed
     */
    public fun triggerConfigurations(vararg triggerConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps.Builder =
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps.builder()

    /**
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group.
     */
    override fun alarmConfiguration(alarmConfiguration: IResolvable) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group.
     */
    override
        fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty) {
      cdkBuilder.alarmConfiguration(alarmConfiguration.let(CfnDeploymentGroup.AlarmConfigurationProperty::unwrap))
    }

    /**
     * @param alarmConfiguration Information about the Amazon CloudWatch alarms that are associated
     * with the deployment group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("752d17c273d96d68942144b914431bd2b74dd97401018429d6ed6da6c0c01ae4")
    override
        fun alarmConfiguration(alarmConfiguration: CfnDeploymentGroup.AlarmConfigurationProperty.Builder.() -> Unit):
        Unit = alarmConfiguration(CfnDeploymentGroup.AlarmConfigurationProperty(alarmConfiguration))

    /**
     * @param applicationName The name of an existing CodeDeploy application to associate this
     * deployment group with. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group.
     * If you specify this property, don't specify the `Deployment` property.
     */
    override fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group.
     * If you specify this property, don't specify the `Deployment` property.
     */
    override
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty) {
      cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration.let(CfnDeploymentGroup.AutoRollbackConfigurationProperty::unwrap))
    }

    /**
     * @param autoRollbackConfiguration Information about the automatic rollback configuration that
     * is associated with the deployment group.
     * If you specify this property, don't specify the `Deployment` property.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd617bf78494360209f8489c9ebc34e864a5519f551d825d84e1eb9b6e4646fd")
    override
        fun autoRollbackConfiguration(autoRollbackConfiguration: CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder.() -> Unit):
        Unit =
        autoRollbackConfiguration(CfnDeploymentGroup.AutoRollbackConfigurationProperty(autoRollbackConfiguration))

    /**
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created.
     * Duplicates are not allowed.
     */
    override fun autoScalingGroups(autoScalingGroups: List<String>) {
      cdkBuilder.autoScalingGroups(autoScalingGroups)
    }

    /**
     * @param autoScalingGroups A list of associated Auto Scaling groups that CodeDeploy
     * automatically deploys revisions to when new instances are created.
     * Duplicates are not allowed.
     */
    override fun autoScalingGroups(vararg autoScalingGroups: String): Unit =
        autoScalingGroups(autoScalingGroups.toList())

    /**
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group.
     */
    override fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: IResolvable) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group.
     */
    override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty) {
      cdkBuilder.blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration.let(CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty::unwrap))
    }

    /**
     * @param blueGreenDeploymentConfiguration Information about blue/green deployment options for a
     * deployment group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15ff9a3dd1ca2e8fcbcbab64638e71692e578f15ddc73f49bb67094de6ecb43e")
    override
        fun blueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        blueGreenDeploymentConfiguration(CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty(blueGreenDeploymentConfiguration))

    /**
     * @param deployment The application revision to deploy to this deployment group.
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     */
    override fun deployment(deployment: IResolvable) {
      cdkBuilder.deployment(deployment.let(IResolvable::unwrap))
    }

    /**
     * @param deployment The application revision to deploy to this deployment group.
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     */
    override fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty) {
      cdkBuilder.deployment(deployment.let(CfnDeploymentGroup.DeploymentProperty::unwrap))
    }

    /**
     * @param deployment The application revision to deploy to this deployment group.
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e8321a2c4159ce336711aaef4da1bc73c537604236c821b2dce109b860c8f08")
    override fun deployment(deployment: CfnDeploymentGroup.DeploymentProperty.Builder.() -> Unit):
        Unit = deployment(CfnDeploymentGroup.DeploymentProperty(deployment))

    /**
     * @param deploymentConfigName A deployment configuration name or a predefined configuration
     * name.
     * With predefined configurations, you can deploy application revisions to one instance at a
     * time ( `CodeDeployDefault.OneAtATime` ), half of the instances at a time (
     * `CodeDeployDefault.HalfAtATime` ), or all the instances at once ( `CodeDeployDefault.AllAtOnce`
     * ). For more information and valid values, see [Working with Deployment
     * Configurations](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    override fun deploymentConfigName(deploymentConfigName: String) {
      cdkBuilder.deploymentConfigName(deploymentConfigName)
    }

    /**
     * @param deploymentGroupName A name for the deployment group.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment group name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun deploymentGroupName(deploymentGroupName: String) {
      cdkBuilder.deploymentGroupName(deploymentGroupName)
    }

    /**
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer.
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     */
    override fun deploymentStyle(deploymentStyle: IResolvable) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(IResolvable::unwrap))
    }

    /**
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer.
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     */
    override fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty) {
      cdkBuilder.deploymentStyle(deploymentStyle.let(CfnDeploymentGroup.DeploymentStyleProperty::unwrap))
    }

    /**
     * @param deploymentStyle Attributes that determine the type of deployment to run and whether to
     * route deployment traffic behind a load balancer.
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45e2d0cd76ae805545f6ebae24c2a9649c6f4bb198d17d50683364022e9c4f3d")
    override
        fun deploymentStyle(deploymentStyle: CfnDeploymentGroup.DeploymentStyleProperty.Builder.() -> Unit):
        Unit = deploymentStyle(CfnDeploymentGroup.DeploymentStyleProperty(deploymentStyle))

    /**
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group.
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     */
    override fun ec2TagFilters(ec2TagFilters: IResolvable) {
      cdkBuilder.ec2TagFilters(ec2TagFilters.let(IResolvable::unwrap))
    }

    /**
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group.
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     */
    override fun ec2TagFilters(ec2TagFilters: List<Any>) {
      cdkBuilder.ec2TagFilters(ec2TagFilters)
    }

    /**
     * @param ec2TagFilters The Amazon EC2 tags that are already applied to Amazon EC2 instances
     * that you want to include in the deployment group.
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     */
    override fun ec2TagFilters(vararg ec2TagFilters: Any): Unit =
        ec2TagFilters(ec2TagFilters.toList())

    /**
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances.
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     */
    override fun ec2TagSet(ec2TagSet: IResolvable) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(IResolvable::unwrap))
    }

    /**
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances.
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     */
    override fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty) {
      cdkBuilder.ec2TagSet(ec2TagSet.let(CfnDeploymentGroup.EC2TagSetProperty::unwrap))
    }

    /**
     * @param ec2TagSet Information about groups of tags applied to Amazon EC2 instances.
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44b277633da03ac6243e849e9b71a04b3e5a52c1f6fb3d27ebf790c7c05cbd62")
    override fun ec2TagSet(ec2TagSet: CfnDeploymentGroup.EC2TagSetProperty.Builder.() -> Unit): Unit
        = ec2TagSet(CfnDeploymentGroup.EC2TagSetProperty(ec2TagSet))

    /**
     * @param ecsServices The target Amazon ECS services in the deployment group.
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     */
    override fun ecsServices(ecsServices: IResolvable) {
      cdkBuilder.ecsServices(ecsServices.let(IResolvable::unwrap))
    }

    /**
     * @param ecsServices The target Amazon ECS services in the deployment group.
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     */
    override fun ecsServices(ecsServices: List<Any>) {
      cdkBuilder.ecsServices(ecsServices)
    }

    /**
     * @param ecsServices The target Amazon ECS services in the deployment group.
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     */
    override fun ecsServices(vararg ecsServices: Any): Unit = ecsServices(ecsServices.toList())

    /**
     * @param loadBalancerInfo Information about the load balancer to use in a deployment.
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    override fun loadBalancerInfo(loadBalancerInfo: IResolvable) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(IResolvable::unwrap))
    }

    /**
     * @param loadBalancerInfo Information about the load balancer to use in a deployment.
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    override fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty) {
      cdkBuilder.loadBalancerInfo(loadBalancerInfo.let(CfnDeploymentGroup.LoadBalancerInfoProperty::unwrap))
    }

    /**
     * @param loadBalancerInfo Information about the load balancer to use in a deployment.
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5c8806b3ca93f50b993e4fed27e7905a070fa29c8a96f1491776d7de802a454")
    override
        fun loadBalancerInfo(loadBalancerInfo: CfnDeploymentGroup.LoadBalancerInfoProperty.Builder.() -> Unit):
        Unit = loadBalancerInfo(CfnDeploymentGroup.LoadBalancerInfoProperty(loadBalancerInfo))

    /**
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group.
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: IResolvable) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.let(IResolvable::unwrap))
    }

    /**
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group.
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    override fun onPremisesInstanceTagFilters(onPremisesInstanceTagFilters: List<Any>) {
      cdkBuilder.onPremisesInstanceTagFilters(onPremisesInstanceTagFilters)
    }

    /**
     * @param onPremisesInstanceTagFilters The on-premises instance tags already applied to
     * on-premises instances that you want to include in the deployment group.
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    override fun onPremisesInstanceTagFilters(vararg onPremisesInstanceTagFilters: Any): Unit =
        onPremisesInstanceTagFilters(onPremisesInstanceTagFilters.toList())

    /**
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances.
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    override fun onPremisesTagSet(onPremisesTagSet: IResolvable) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(IResolvable::unwrap))
    }

    /**
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances.
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    override fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty) {
      cdkBuilder.onPremisesTagSet(onPremisesTagSet.let(CfnDeploymentGroup.OnPremisesTagSetProperty::unwrap))
    }

    /**
     * @param onPremisesTagSet Information about groups of tags applied to on-premises instances.
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4c19b76ece4da92c21c94bb36e73c9999b231fe247f659c8399e706e58e1e3a")
    override
        fun onPremisesTagSet(onPremisesTagSet: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder.() -> Unit):
        Unit = onPremisesTagSet(CfnDeploymentGroup.OnPremisesTagSetProperty(onPremisesTagSet))

    /**
     * @param outdatedInstancesStrategy Indicates what happens when new Amazon EC2 instances are
     * launched mid-deployment and do not receive the deployed application revision.
     * If this option is set to `UPDATE` or is unspecified, CodeDeploy initiates one or more
     * 'auto-update outdated instances' deployments to apply the deployed application revision to the
     * new Amazon EC2 instances.
     *
     * If this option is set to `IGNORE` , CodeDeploy does not initiate a deployment to update the
     * new Amazon EC2 instances. This may result in instances having different revisions.
     */
    override fun outdatedInstancesStrategy(outdatedInstancesStrategy: String) {
      cdkBuilder.outdatedInstancesStrategy(outdatedInstancesStrategy)
    }

    /**
     * @param serviceRoleArn A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. 
     * For more information, see [Create a Service Role for AWS
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     *
     * In some cases, you might need to add a dependency on the service role's policy. For more
     * information, see IAM role policy in [DependsOn
     * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * .
     */
    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    /**
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The metadata that you apply to CodeDeploy deployment groups to help you organize
     * and categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group.
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     */
    override fun terminationHookEnabled(terminationHookEnabled: Boolean) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled)
    }

    /**
     * @param terminationHookEnabled Indicates whether the deployment group was configured to have
     * CodeDeploy install a termination hook into an Auto Scaling group.
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     */
    override fun terminationHookEnabled(terminationHookEnabled: IResolvable) {
      cdkBuilder.terminationHookEnabled(terminationHookEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * Duplicates are not allowed
     */
    override fun triggerConfigurations(triggerConfigurations: IResolvable) {
      cdkBuilder.triggerConfigurations(triggerConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * Duplicates are not allowed
     */
    override fun triggerConfigurations(triggerConfigurations: List<Any>) {
      cdkBuilder.triggerConfigurations(triggerConfigurations)
    }

    /**
     * @param triggerConfigurations Information about triggers associated with the deployment group.
     * Duplicates are not allowed
     */
    override fun triggerConfigurations(vararg triggerConfigurations: Any): Unit =
        triggerConfigurations(triggerConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps,
  ) : CdkObject(cdkObject), CfnDeploymentGroupProps {
    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-alarmconfiguration)
     */
    override fun alarmConfiguration(): Any? = unwrap(this).getAlarmConfiguration()

    /**
     * The name of an existing CodeDeploy application to associate this deployment group with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * Information about the automatic rollback configuration that is associated with the deployment
     * group.
     *
     * If you specify this property, don't specify the `Deployment` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autorollbackconfiguration)
     */
    override fun autoRollbackConfiguration(): Any? = unwrap(this).getAutoRollbackConfiguration()

    /**
     * A list of associated Auto Scaling groups that CodeDeploy automatically deploys revisions to
     * when new instances are created.
     *
     * Duplicates are not allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups)
     */
    override fun autoScalingGroups(): List<String> = unwrap(this).getAutoScalingGroups() ?:
        emptyList()

    /**
     * Information about blue/green deployment options for a deployment group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-bluegreendeploymentconfiguration)
     */
    override fun blueGreenDeploymentConfiguration(): Any? =
        unwrap(this).getBlueGreenDeploymentConfiguration()

    /**
     * The application revision to deploy to this deployment group.
     *
     * If you specify this property, your target application revision is deployed as soon as the
     * provisioning process is complete. If you specify this property, don't specify the
     * `AutoRollbackConfiguration` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deployment)
     */
    override fun deployment(): Any? = unwrap(this).getDeployment()

    /**
     * A deployment configuration name or a predefined configuration name.
     *
     * With predefined configurations, you can deploy application revisions to one instance at a
     * time ( `CodeDeployDefault.OneAtATime` ), half of the instances at a time (
     * `CodeDeployDefault.HalfAtATime` ), or all the instances at once ( `CodeDeployDefault.AllAtOnce`
     * ). For more information and valid values, see [Working with Deployment
     * Configurations](https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname)
     */
    override fun deploymentConfigName(): String? = unwrap(this).getDeploymentConfigName()

    /**
     * A name for the deployment group.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the deployment group name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname)
     */
    override fun deploymentGroupName(): String? = unwrap(this).getDeploymentGroupName()

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment
     * traffic behind a load balancer.
     *
     * If you specify this property with a blue/green deployment type, don't specify the
     * `AutoScalingGroups` , `LoadBalancerInfo` , or `Deployment` properties.
     *
     *
     * For blue/green deployments, AWS CloudFormation supports deployments on Lambda compute
     * platforms only. You can perform Amazon ECS blue/green deployments using
     * `AWS::CodeDeploy::BlueGreen` hook. See [Perform Amazon ECS blue/green deployments through
     * CodeDeploy using AWS
     * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html)
     * for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentstyle)
     */
    override fun deploymentStyle(): Any? = unwrap(this).getDeploymentStyle()

    /**
     * The Amazon EC2 tags that are already applied to Amazon EC2 instances that you want to include
     * in the deployment group.
     *
     * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in
     * this deployment group. Duplicates are not allowed.
     *
     * You can specify `EC2TagFilters` or `Ec2TagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters)
     */
    override fun ec2TagFilters(): Any? = unwrap(this).getEc2TagFilters()

    /**
     * Information about groups of tags applied to Amazon EC2 instances.
     *
     * The deployment group includes only Amazon EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as `ec2TagFilter` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagset)
     */
    override fun ec2TagSet(): Any? = unwrap(this).getEc2TagSet()

    /**
     * The target Amazon ECS services in the deployment group.
     *
     * This applies only to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format
     * `&lt;clustername&gt;:&lt;servicename&gt;` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ecsservices)
     */
    override fun ecsServices(): Any? = unwrap(this).getEcsServices()

    /**
     * Information about the load balancer to use in a deployment.
     *
     * For more information, see [Integrating CodeDeploy with Elastic Load
     * Balancing](https://docs.aws.amazon.com/codedeploy/latest/userguide/integrations-aws-elastic-load-balancing.html)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-loadbalancerinfo)
     */
    override fun loadBalancerInfo(): Any? = unwrap(this).getLoadBalancerInfo()

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to
     * include in the deployment group.
     *
     * CodeDeploy includes all on-premises instances identified by any of the tags you specify in
     * this deployment group. To register on-premises instances with CodeDeploy , see [Working with
     * On-Premises Instances for
     * CodeDeploy](https://docs.aws.amazon.com/codedeploy/latest/userguide/instances-on-premises.html)
     * in the *AWS CodeDeploy User Guide* . Duplicates are not allowed.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters)
     */
    override fun onPremisesInstanceTagFilters(): Any? =
        unwrap(this).getOnPremisesInstanceTagFilters()

    /**
     * Information about groups of tags applied to on-premises instances.
     *
     * The deployment group includes only on-premises instances identified by all the tag groups.
     *
     * You can specify `OnPremisesInstanceTagFilters` or `OnPremisesInstanceTagSet` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisestagset)
     */
    override fun onPremisesTagSet(): Any? = unwrap(this).getOnPremisesTagSet()

    /**
     * Indicates what happens when new Amazon EC2 instances are launched mid-deployment and do not
     * receive the deployed application revision.
     *
     * If this option is set to `UPDATE` or is unspecified, CodeDeploy initiates one or more
     * 'auto-update outdated instances' deployments to apply the deployed application revision to the
     * new Amazon EC2 instances.
     *
     * If this option is set to `IGNORE` , CodeDeploy does not initiate a deployment to update the
     * new Amazon EC2 instances. This may result in instances having different revisions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-outdatedinstancesstrategy)
     */
    override fun outdatedInstancesStrategy(): String? = unwrap(this).getOutdatedInstancesStrategy()

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
     */
    override fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

    /**
     * The metadata that you apply to CodeDeploy deployment groups to help you organize and
     * categorize them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Indicates whether the deployment group was configured to have CodeDeploy install a
     * termination hook into an Auto Scaling group.
     *
     * For more information about the termination hook, see [How Amazon EC2 Auto Scaling works with
     * CodeDeploy](https://docs.aws.amazon.com//codedeploy/latest/userguide/integrations-aws-auto-scaling.html#integrations-aws-auto-scaling-behaviors)
     * in the *AWS CodeDeploy User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-terminationhookenabled)
     */
    override fun terminationHookEnabled(): Any? = unwrap(this).getTerminationHookEnabled()

    /**
     * Information about triggers associated with the deployment group.
     *
     * Duplicates are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations)
     */
    override fun triggerConfigurations(): Any? = unwrap(this).getTriggerConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps):
        CfnDeploymentGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentGroupProps):
        software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
  }
}
