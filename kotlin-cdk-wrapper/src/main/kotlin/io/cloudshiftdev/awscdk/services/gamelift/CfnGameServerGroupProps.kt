@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGameServerGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnGameServerGroupProps cfnGameServerGroupProps = CfnGameServerGroupProps.builder()
 * .gameServerGroupName("gameServerGroupName")
 * .instanceDefinitions(List.of(InstanceDefinitionProperty.builder()
 * .instanceType("instanceType")
 * // the properties below are optional
 * .weightedCapacity("weightedCapacity")
 * .build()))
 * .roleArn("roleArn")
 * // the properties below are optional
 * .autoScalingPolicy(AutoScalingPolicyProperty.builder()
 * .targetTrackingConfiguration(TargetTrackingConfigurationProperty.builder()
 * .targetValue(123)
 * .build())
 * // the properties below are optional
 * .estimatedInstanceWarmup(123)
 * .build())
 * .balancingStrategy("balancingStrategy")
 * .deleteOption("deleteOption")
 * .gameServerProtectionPolicy("gameServerProtectionPolicy")
 * .launchTemplate(LaunchTemplateProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .version("version")
 * .build())
 * .maxSize(123)
 * .minSize(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcSubnets(List.of("vpcSubnets"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html)
 */
public interface CfnGameServerGroupProps {
  /**
   * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized
   * for game hosting.
   *
   * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of idle
   * game servers that can immediately accommodate new games and players. After the Auto Scaling group
   * is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-autoscalingpolicy)
   */
  public fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  /**
   * Indicates how Amazon GameLift FleetIQ balances the use of Spot Instances and On-Demand
   * Instances in the game server group.
   *
   * Method options include the following:
   *
   * * `SPOT_ONLY` - Only Spot Instances are used in the game server group. If Spot Instances are
   * unavailable or not viable for game hosting, the game server group provides no hosting capacity
   * until Spot Instances can again be used. Until then, no new instances are started, and the existing
   * nonviable Spot Instances are terminated (after current gameplay ends) and are not replaced.
   * * `SPOT_PREFERRED` - (default value) Spot Instances are used whenever available in the game
   * server group. If Spot Instances are unavailable, the game server group continues to provide
   * hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are
   * terminated (after current gameplay ends) and are replaced with new On-Demand Instances.
   * * `ON_DEMAND_ONLY` - Only On-Demand Instances are used in the game server group. No Spot
   * Instances are used, even when available, while this balancing strategy is in force.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-balancingstrategy)
   */
  public fun balancingStrategy(): String? = unwrap(this).getBalancingStrategy()

  /**
   * The type of delete to perform.
   *
   * To delete a game server group, specify the `DeleteOption` . Options include the following:
   *
   * * `SAFE_DELETE` – (default) Terminates the game server group and Amazon EC2 Auto Scaling group
   * only when it has no game servers that are in `UTILIZED` status.
   * * `FORCE_DELETE` – Terminates the game server group, including all active game servers
   * regardless of their utilization status, and the Amazon EC2 Auto Scaling group.
   * * `RETAIN` – Does a safe delete of the game server group but retains the Amazon EC2 Auto
   * Scaling group as is.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-deleteoption)
   */
  public fun deleteOption(): String? = unwrap(this).getDeleteOption()

  /**
   * A developer-defined identifier for the game server group.
   *
   * The name is unique for each Region in each AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-gameservergroupname)
   */
  public fun gameServerGroupName(): String

  /**
   * A flag that indicates whether instances in the game server group are protected from early
   * termination.
   *
   * Unprotected instances that have active game servers running might be terminated during a
   * scale-down event, causing players to be dropped from the game. Protected instances cannot be
   * terminated while there are active game servers running except in the event of a forced game server
   * group deletion (see ). An exception to this is with Spot Instances, which can be terminated by AWS
   * regardless of protection status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-gameserverprotectionpolicy)
   */
  public fun gameServerProtectionPolicy(): String? = unwrap(this).getGameServerProtectionPolicy()

  /**
   * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
   * automatically scaling instances in the corresponding Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
   */
  public fun instanceDefinitions(): Any

  /**
   * The Amazon EC2 launch template that contains configuration settings and game server code to be
   * deployed to all instances in the game server group.
   *
   * You can specify the template using either the template name or ID. For help with creating a
   * launch template, see [Creating a Launch Template for an Auto Scaling
   * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
   * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is created,
   * update this value directly in the Auto Scaling group using the AWS console or APIs.
   *
   *
   * If you specify network interfaces in your launch template, you must explicitly set the property
   * `AssociatePublicIpAddress` to "true". If no network interface is specified in the launch template,
   * Amazon GameLift FleetIQ uses your account's default VPC.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-launchtemplate)
   */
  public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
   *
   * During automatic scaling events, Amazon GameLift FleetIQ and EC2 do not scale up the group
   * above this maximum. After the Auto Scaling group is created, update this value directly in the
   * Auto Scaling group using the AWS console or APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-maxsize)
   */
  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
   *
   * During automatic scaling events, Amazon GameLift FleetIQ and Amazon EC2 do not scale down the
   * group below this minimum. In production, this value should be set to at least 1. After the Auto
   * Scaling group is created, update this value directly in the Auto Scaling group using the AWS
   * console or APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-minsize)
   */
  public fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
   * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-rolearn)
   */
  public fun roleArn(): String

  /**
   * A list of labels to assign to the new game server group resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
   * management, access management, and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
   * ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be
   * lower than stated. See the AWS General Reference for actual tagging limits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
   *
   * By default, all Amazon GameLift FleetIQ-supported Availability Zones are used. You can use this
   * parameter to specify VPCs that you've set up. This property cannot be updated after the game
   * server group is created, and the corresponding Auto Scaling group will always use the property
   * value that is set with this request, even if the Auto Scaling group is updated directly.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-vpcsubnets)
   */
  public fun vpcSubnets(): List<String> = unwrap(this).getVpcSubnets() ?: emptyList()

  /**
   * A builder for [CfnGameServerGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of
     * idle game servers that can immediately accommodate new games and players. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or
     * APIs.
     */
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of
     * idle game servers that can immediately accommodate new games and players. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or
     * APIs.
     */
    public fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty)

    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of
     * idle game servers that can immediately accommodate new games and players. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or
     * APIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af7dc1465a3a84ffd047c419a400c11a0152ebdffbd3e92ca13af97ae423a7e5")
    public
        fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty.Builder.() -> Unit)

    /**
     * @param balancingStrategy Indicates how Amazon GameLift FleetIQ balances the use of Spot
     * Instances and On-Demand Instances in the game server group.
     * Method options include the following:
     *
     * * `SPOT_ONLY` - Only Spot Instances are used in the game server group. If Spot Instances are
     * unavailable or not viable for game hosting, the game server group provides no hosting capacity
     * until Spot Instances can again be used. Until then, no new instances are started, and the
     * existing nonviable Spot Instances are terminated (after current gameplay ends) and are not
     * replaced.
     * * `SPOT_PREFERRED` - (default value) Spot Instances are used whenever available in the game
     * server group. If Spot Instances are unavailable, the game server group continues to provide
     * hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are
     * terminated (after current gameplay ends) and are replaced with new On-Demand Instances.
     * * `ON_DEMAND_ONLY` - Only On-Demand Instances are used in the game server group. No Spot
     * Instances are used, even when available, while this balancing strategy is in force.
     */
    public fun balancingStrategy(balancingStrategy: String)

    /**
     * @param deleteOption The type of delete to perform.
     * To delete a game server group, specify the `DeleteOption` . Options include the following:
     *
     * * `SAFE_DELETE` – (default) Terminates the game server group and Amazon EC2 Auto Scaling
     * group only when it has no game servers that are in `UTILIZED` status.
     * * `FORCE_DELETE` – Terminates the game server group, including all active game servers
     * regardless of their utilization status, and the Amazon EC2 Auto Scaling group.
     * * `RETAIN` – Does a safe delete of the game server group but retains the Amazon EC2 Auto
     * Scaling group as is.
     */
    public fun deleteOption(deleteOption: String)

    /**
     * @param gameServerGroupName A developer-defined identifier for the game server group. 
     * The name is unique for each Region in each AWS account.
     */
    public fun gameServerGroupName(gameServerGroupName: String)

    /**
     * @param gameServerProtectionPolicy A flag that indicates whether instances in the game server
     * group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a
     * scale-down event, causing players to be dropped from the game. Protected instances cannot be
     * terminated while there are active game servers running except in the event of a forced game
     * server group deletion (see ). An exception to this is with Spot Instances, which can be
     * terminated by AWS regardless of protection status.
     */
    public fun gameServerProtectionPolicy(gameServerProtectionPolicy: String)

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    public fun instanceDefinitions(instanceDefinitions: IResolvable)

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    public fun instanceDefinitions(instanceDefinitions: List<Any>)

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    public fun instanceDefinitions(vararg instanceDefinitions: Any)

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group.
     * You can specify the template using either the template name or ID. For help with creating a
     * launch template, see [Creating a Launch Template for an Auto Scaling
     * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is
     * created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     *
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    public fun launchTemplate(launchTemplate: IResolvable)

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group.
     * You can specify the template using either the template name or ID. For help with creating a
     * launch template, see [Creating a Launch Template for an Auto Scaling
     * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is
     * created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     *
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    public fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty)

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group.
     * You can specify the template using either the template name or ID. For help with creating a
     * launch template, see [Creating a Launch Template for an Auto Scaling
     * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is
     * created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     *
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9332f53c604d5d12f649c443bc6b4c8b45c59afc7bdc01cf5022db2d85ac0941")
    public
        fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty.Builder.() -> Unit)

    /**
     * @param maxSize The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
     * During automatic scaling events, Amazon GameLift FleetIQ and EC2 do not scale up the group
     * above this maximum. After the Auto Scaling group is created, update this value directly in the
     * Auto Scaling group using the AWS console or APIs.
     */
    public fun maxSize(maxSize: Number)

    /**
     * @param minSize The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
     * During automatic scaling events, Amazon GameLift FleetIQ and Amazon EC2 do not scale down the
     * group below this minimum. In production, this value should be set to at least 1. After the Auto
     * Scaling group is created, update this value directly in the Auto Scaling group using the AWS
     * console or APIs.
     */
    public fun minSize(minSize: Number)

    /**
     * @param roleArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags A list of labels to assign to the new game server group resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of labels to assign to the new game server group resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group.
     * By default, all Amazon GameLift FleetIQ-supported Availability Zones are used. You can use
     * this parameter to specify VPCs that you've set up. This property cannot be updated after the
     * game server group is created, and the corresponding Auto Scaling group will always use the
     * property value that is set with this request, even if the Auto Scaling group is updated
     * directly.
     */
    public fun vpcSubnets(vpcSubnets: List<String>)

    /**
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group.
     * By default, all Amazon GameLift FleetIQ-supported Availability Zones are used. You can use
     * this parameter to specify VPCs that you've set up. This property cannot be updated after the
     * game server group is created, and the corresponding Auto Scaling group will always use the
     * property value that is set with this request, even if the Auto Scaling group is updated
     * directly.
     */
    public fun vpcSubnets(vararg vpcSubnets: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps.Builder
        = software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps.builder()

    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of
     * idle game servers that can immediately accommodate new games and players. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or
     * APIs.
     */
    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of
     * idle game servers that can immediately accommodate new games and players. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or
     * APIs.
     */
    override
        fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(CfnGameServerGroup.AutoScalingPolicyProperty::unwrap))
    }

    /**
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting.
     * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of
     * idle game servers that can immediately accommodate new games and players. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or
     * APIs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af7dc1465a3a84ffd047c419a400c11a0152ebdffbd3e92ca13af97ae423a7e5")
    override
        fun autoScalingPolicy(autoScalingPolicy: CfnGameServerGroup.AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit = autoScalingPolicy(CfnGameServerGroup.AutoScalingPolicyProperty(autoScalingPolicy))

    /**
     * @param balancingStrategy Indicates how Amazon GameLift FleetIQ balances the use of Spot
     * Instances and On-Demand Instances in the game server group.
     * Method options include the following:
     *
     * * `SPOT_ONLY` - Only Spot Instances are used in the game server group. If Spot Instances are
     * unavailable or not viable for game hosting, the game server group provides no hosting capacity
     * until Spot Instances can again be used. Until then, no new instances are started, and the
     * existing nonviable Spot Instances are terminated (after current gameplay ends) and are not
     * replaced.
     * * `SPOT_PREFERRED` - (default value) Spot Instances are used whenever available in the game
     * server group. If Spot Instances are unavailable, the game server group continues to provide
     * hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are
     * terminated (after current gameplay ends) and are replaced with new On-Demand Instances.
     * * `ON_DEMAND_ONLY` - Only On-Demand Instances are used in the game server group. No Spot
     * Instances are used, even when available, while this balancing strategy is in force.
     */
    override fun balancingStrategy(balancingStrategy: String) {
      cdkBuilder.balancingStrategy(balancingStrategy)
    }

    /**
     * @param deleteOption The type of delete to perform.
     * To delete a game server group, specify the `DeleteOption` . Options include the following:
     *
     * * `SAFE_DELETE` – (default) Terminates the game server group and Amazon EC2 Auto Scaling
     * group only when it has no game servers that are in `UTILIZED` status.
     * * `FORCE_DELETE` – Terminates the game server group, including all active game servers
     * regardless of their utilization status, and the Amazon EC2 Auto Scaling group.
     * * `RETAIN` – Does a safe delete of the game server group but retains the Amazon EC2 Auto
     * Scaling group as is.
     */
    override fun deleteOption(deleteOption: String) {
      cdkBuilder.deleteOption(deleteOption)
    }

    /**
     * @param gameServerGroupName A developer-defined identifier for the game server group. 
     * The name is unique for each Region in each AWS account.
     */
    override fun gameServerGroupName(gameServerGroupName: String) {
      cdkBuilder.gameServerGroupName(gameServerGroupName)
    }

    /**
     * @param gameServerProtectionPolicy A flag that indicates whether instances in the game server
     * group are protected from early termination.
     * Unprotected instances that have active game servers running might be terminated during a
     * scale-down event, causing players to be dropped from the game. Protected instances cannot be
     * terminated while there are active game servers running except in the event of a forced game
     * server group deletion (see ). An exception to this is with Spot Instances, which can be
     * terminated by AWS regardless of protection status.
     */
    override fun gameServerProtectionPolicy(gameServerProtectionPolicy: String) {
      cdkBuilder.gameServerProtectionPolicy(gameServerProtectionPolicy)
    }

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    override fun instanceDefinitions(instanceDefinitions: IResolvable) {
      cdkBuilder.instanceDefinitions(instanceDefinitions.let(IResolvable::unwrap))
    }

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    override fun instanceDefinitions(instanceDefinitions: List<Any>) {
      cdkBuilder.instanceDefinitions(instanceDefinitions)
    }

    /**
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    override fun instanceDefinitions(vararg instanceDefinitions: Any): Unit =
        instanceDefinitions(instanceDefinitions.toList())

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group.
     * You can specify the template using either the template name or ID. For help with creating a
     * launch template, see [Creating a Launch Template for an Auto Scaling
     * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is
     * created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     *
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group.
     * You can specify the template using either the template name or ID. For help with creating a
     * launch template, see [Creating a Launch Template for an Auto Scaling
     * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is
     * created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     *
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    override fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(CfnGameServerGroup.LaunchTemplateProperty::unwrap))
    }

    /**
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group.
     * You can specify the template using either the template name or ID. For help with creating a
     * launch template, see [Creating a Launch Template for an Auto Scaling
     * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is
     * created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     *
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9332f53c604d5d12f649c443bc6b4c8b45c59afc7bdc01cf5022db2d85ac0941")
    override
        fun launchTemplate(launchTemplate: CfnGameServerGroup.LaunchTemplateProperty.Builder.() -> Unit):
        Unit = launchTemplate(CfnGameServerGroup.LaunchTemplateProperty(launchTemplate))

    /**
     * @param maxSize The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
     * During automatic scaling events, Amazon GameLift FleetIQ and EC2 do not scale up the group
     * above this maximum. After the Auto Scaling group is created, update this value directly in the
     * Auto Scaling group using the AWS console or APIs.
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param minSize The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
     * During automatic scaling events, Amazon GameLift FleetIQ and Amazon EC2 do not scale down the
     * group below this minimum. In production, this value should be set to at least 1. After the Auto
     * Scaling group is created, update this value directly in the Auto Scaling group using the AWS
     * console or APIs.
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * @param roleArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags A list of labels to assign to the new game server group resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of labels to assign to the new game server group resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group.
     * By default, all Amazon GameLift FleetIQ-supported Availability Zones are used. You can use
     * this parameter to specify VPCs that you've set up. This property cannot be updated after the
     * game server group is created, and the corresponding Auto Scaling group will always use the
     * property value that is set with this request, even if the Auto Scaling group is updated
     * directly.
     */
    override fun vpcSubnets(vpcSubnets: List<String>) {
      cdkBuilder.vpcSubnets(vpcSubnets)
    }

    /**
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group.
     * By default, all Amazon GameLift FleetIQ-supported Availability Zones are used. You can use
     * this parameter to specify VPCs that you've set up. This property cannot be updated after the
     * game server group is created, and the corresponding Auto Scaling group will always use the
     * property value that is set with this request, even if the Auto Scaling group is updated
     * directly.
     */
    override fun vpcSubnets(vararg vpcSubnets: String): Unit = vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps,
  ) : CdkObject(cdkObject), CfnGameServerGroupProps {
    /**
     * Configuration settings to define a scaling policy for the Auto Scaling group that is
     * optimized for game hosting.
     *
     * The scaling policy uses the metric `"PercentUtilizedGameServers"` to maintain a buffer of
     * idle game servers that can immediately accommodate new games and players. After the Auto Scaling
     * group is created, update this value directly in the Auto Scaling group using the AWS console or
     * APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-autoscalingpolicy)
     */
    override fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

    /**
     * Indicates how Amazon GameLift FleetIQ balances the use of Spot Instances and On-Demand
     * Instances in the game server group.
     *
     * Method options include the following:
     *
     * * `SPOT_ONLY` - Only Spot Instances are used in the game server group. If Spot Instances are
     * unavailable or not viable for game hosting, the game server group provides no hosting capacity
     * until Spot Instances can again be used. Until then, no new instances are started, and the
     * existing nonviable Spot Instances are terminated (after current gameplay ends) and are not
     * replaced.
     * * `SPOT_PREFERRED` - (default value) Spot Instances are used whenever available in the game
     * server group. If Spot Instances are unavailable, the game server group continues to provide
     * hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are
     * terminated (after current gameplay ends) and are replaced with new On-Demand Instances.
     * * `ON_DEMAND_ONLY` - Only On-Demand Instances are used in the game server group. No Spot
     * Instances are used, even when available, while this balancing strategy is in force.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-balancingstrategy)
     */
    override fun balancingStrategy(): String? = unwrap(this).getBalancingStrategy()

    /**
     * The type of delete to perform.
     *
     * To delete a game server group, specify the `DeleteOption` . Options include the following:
     *
     * * `SAFE_DELETE` – (default) Terminates the game server group and Amazon EC2 Auto Scaling
     * group only when it has no game servers that are in `UTILIZED` status.
     * * `FORCE_DELETE` – Terminates the game server group, including all active game servers
     * regardless of their utilization status, and the Amazon EC2 Auto Scaling group.
     * * `RETAIN` – Does a safe delete of the game server group but retains the Amazon EC2 Auto
     * Scaling group as is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-deleteoption)
     */
    override fun deleteOption(): String? = unwrap(this).getDeleteOption()

    /**
     * A developer-defined identifier for the game server group.
     *
     * The name is unique for each Region in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-gameservergroupname)
     */
    override fun gameServerGroupName(): String = unwrap(this).getGameServerGroupName()

    /**
     * A flag that indicates whether instances in the game server group are protected from early
     * termination.
     *
     * Unprotected instances that have active game servers running might be terminated during a
     * scale-down event, causing players to be dropped from the game. Protected instances cannot be
     * terminated while there are active game servers running except in the event of a forced game
     * server group deletion (see ). An exception to this is with Spot Instances, which can be
     * terminated by AWS regardless of protection status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-gameserverprotectionpolicy)
     */
    override fun gameServerProtectionPolicy(): String? =
        unwrap(this).getGameServerProtectionPolicy()

    /**
     * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
     * automatically scaling instances in the corresponding Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
     */
    override fun instanceDefinitions(): Any = unwrap(this).getInstanceDefinitions()

    /**
     * The Amazon EC2 launch template that contains configuration settings and game server code to
     * be deployed to all instances in the game server group.
     *
     * You can specify the template using either the template name or ID. For help with creating a
     * launch template, see [Creating a Launch Template for an Auto Scaling
     * Group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) in the
     * *Amazon Elastic Compute Cloud Auto Scaling User Guide* . After the Auto Scaling group is
     * created, update this value directly in the Auto Scaling group using the AWS console or APIs.
     *
     *
     * If you specify network interfaces in your launch template, you must explicitly set the
     * property `AssociatePublicIpAddress` to "true". If no network interface is specified in the
     * launch template, Amazon GameLift FleetIQ uses your account's default VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-launchtemplate)
     */
    override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    /**
     * The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *
     * During automatic scaling events, Amazon GameLift FleetIQ and EC2 do not scale up the group
     * above this maximum. After the Auto Scaling group is created, update this value directly in the
     * Auto Scaling group using the AWS console or APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-maxsize)
     */
    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    /**
     * The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *
     * During automatic scaling events, Amazon GameLift FleetIQ and Amazon EC2 do not scale down the
     * group below this minimum. In production, this value should be set to at least 1. After the Auto
     * Scaling group is created, update this value directly in the Auto Scaling group using the AWS
     * console or APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-minsize)
     */
    override fun minSize(): Number? = unwrap(this).getMinSize()

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A list of labels to assign to the new game server group resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Reference* . Once the resource is created, you can use TagResource, UntagResource, and
     * ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
     *
     * By default, all Amazon GameLift FleetIQ-supported Availability Zones are used. You can use
     * this parameter to specify VPCs that you've set up. This property cannot be updated after the
     * game server group is created, and the corresponding Auto Scaling group will always use the
     * property value that is set with this request, even if the Auto Scaling group is updated
     * directly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-vpcsubnets)
     */
    override fun vpcSubnets(): List<String> = unwrap(this).getVpcSubnets() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGameServerGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps):
        CfnGameServerGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGameServerGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGameServerGroupProps):
        software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps
  }
}
