@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * *This operation is used with the Amazon GameLift FleetIQ solution and game server groups.*.
 *
 * Creates a GameLift FleetIQ game server group for managing game hosting on a collection of Amazon
 * EC2 instances for game hosting. This operation creates the game server group, creates an Auto
 * Scaling group in your AWS account , and establishes a link between the two groups. You can view the
 * status of your game server groups in the GameLift console. Game server group metrics and events are
 * emitted to Amazon CloudWatch.
 *
 * Before creating a new game server group, you must have the following:
 *
 * * An Amazon EC2 launch template that specifies how to launch Amazon EC2 instances with your game
 * server build. For more information, see [Launching an Instance from a Launch
 * Template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html) in the
 * *Amazon EC2 User Guide* .
 * * An IAM role that extends limited access to your AWS account to allow GameLift FleetIQ to create
 * and interact with the Auto Scaling group. For more information, see [Create IAM roles for
 * cross-service
 * interaction](https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-iam-permissions-roles.html)
 * in the *GameLift FleetIQ Developer Guide* .
 *
 * To create a new game server group, specify a unique group name, IAM role and Amazon EC2 launch
 * template, and provide a list of instance types that can be used in the group. You must also set
 * initial maximum and minimum limits on the group's instance count. You can optionally set an Auto
 * Scaling policy with target tracking based on a GameLift FleetIQ metric.
 *
 * Once the game server group and corresponding Auto Scaling group are created, you have full access
 * to change the Auto Scaling group's configuration as needed. Several properties that are set when
 * creating a game server group, including maximum/minimum size and auto-scaling policy settings, must
 * be updated directly in the Auto Scaling group. Keep in mind that some Auto Scaling group properties
 * are periodically updated by GameLift FleetIQ as part of its balancing activities to optimize for
 * availability and cost.
 *
 * *Learn more*
 *
 * [GameLift FleetIQ Guide](https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnGameServerGroup cfnGameServerGroup = CfnGameServerGroup.Builder.create(this,
 * "MyCfnGameServerGroup")
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
public open class CfnGameServerGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGameServerGroupProps,
  ) :
      this(software.amazon.awscdk.services.gamelift.CfnGameServerGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnGameServerGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGameServerGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGameServerGroupProps(props)
  )

  /**
   * A unique identifier for the auto scaling group.
   */
  public open fun attrAutoScalingGroupArn(): String = unwrap(this).getAttrAutoScalingGroupArn()

  /**
   * A unique identifier for the game server group.
   */
  public open fun attrGameServerGroupArn(): String = unwrap(this).getAttrGameServerGroupArn()

  /**
   * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized
   * for game hosting.
   */
  public open fun autoScalingPolicy(): Any? = unwrap(this).getAutoScalingPolicy()

  /**
   * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized
   * for game hosting.
   */
  public open fun autoScalingPolicy(`value`: IResolvable) {
    unwrap(this).setAutoScalingPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized
   * for game hosting.
   */
  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty) {
    unwrap(this).setAutoScalingPolicy(`value`.let(AutoScalingPolicyProperty::unwrap))
  }

  /**
   * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized
   * for game hosting.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51d7dbb45cbb27245de2f8aaa06ea366f3d60ba0fe38b9d6b4578f0b17d18cd4")
  public open fun autoScalingPolicy(`value`: AutoScalingPolicyProperty.Builder.() -> Unit): Unit =
      autoScalingPolicy(AutoScalingPolicyProperty(`value`))

  /**
   * Indicates how Amazon GameLift FleetIQ balances the use of Spot Instances and On-Demand
   * Instances in the game server group.
   */
  public open fun balancingStrategy(): String? = unwrap(this).getBalancingStrategy()

  /**
   * Indicates how Amazon GameLift FleetIQ balances the use of Spot Instances and On-Demand
   * Instances in the game server group.
   */
  public open fun balancingStrategy(`value`: String) {
    unwrap(this).setBalancingStrategy(`value`)
  }

  /**
   * The type of delete to perform.
   */
  public open fun deleteOption(): String? = unwrap(this).getDeleteOption()

  /**
   * The type of delete to perform.
   */
  public open fun deleteOption(`value`: String) {
    unwrap(this).setDeleteOption(`value`)
  }

  /**
   * A developer-defined identifier for the game server group.
   */
  public open fun gameServerGroupName(): String = unwrap(this).getGameServerGroupName()

  /**
   * A developer-defined identifier for the game server group.
   */
  public open fun gameServerGroupName(`value`: String) {
    unwrap(this).setGameServerGroupName(`value`)
  }

  /**
   * A flag that indicates whether instances in the game server group are protected from early
   * termination.
   */
  public open fun gameServerProtectionPolicy(): String? =
      unwrap(this).getGameServerProtectionPolicy()

  /**
   * A flag that indicates whether instances in the game server group are protected from early
   * termination.
   */
  public open fun gameServerProtectionPolicy(`value`: String) {
    unwrap(this).setGameServerProtectionPolicy(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
   * automatically scaling instances in the corresponding Auto Scaling group.
   */
  public open fun instanceDefinitions(): Any = unwrap(this).getInstanceDefinitions()

  /**
   * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
   * automatically scaling instances in the corresponding Auto Scaling group.
   */
  public open fun instanceDefinitions(`value`: IResolvable) {
    unwrap(this).setInstanceDefinitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
   * automatically scaling instances in the corresponding Auto Scaling group.
   */
  public open fun instanceDefinitions(`value`: List<Any>) {
    unwrap(this).setInstanceDefinitions(`value`)
  }

  /**
   * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
   * automatically scaling instances in the corresponding Auto Scaling group.
   */
  public open fun instanceDefinitions(vararg `value`: Any): Unit =
      instanceDefinitions(`value`.toList())

  /**
   * The Amazon EC2 launch template that contains configuration settings and game server code to be
   * deployed to all instances in the game server group.
   */
  public open fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

  /**
   * The Amazon EC2 launch template that contains configuration settings and game server code to be
   * deployed to all instances in the game server group.
   */
  public open fun launchTemplate(`value`: IResolvable) {
    unwrap(this).setLaunchTemplate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon EC2 launch template that contains configuration settings and game server code to be
   * deployed to all instances in the game server group.
   */
  public open fun launchTemplate(`value`: LaunchTemplateProperty) {
    unwrap(this).setLaunchTemplate(`value`.let(LaunchTemplateProperty::unwrap))
  }

  /**
   * The Amazon EC2 launch template that contains configuration settings and game server code to be
   * deployed to all instances in the game server group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7ba1a3f567b211d341d6037dd420a6e93ffb5f377633b4a65c3daede1f9525b")
  public open fun launchTemplate(`value`: LaunchTemplateProperty.Builder.() -> Unit): Unit =
      launchTemplate(LaunchTemplateProperty(`value`))

  /**
   * The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
   */
  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
   */
  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

  /**
   * The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
   */
  public open fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
   */
  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
   * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
   * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of labels to assign to the new game server group resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of labels to assign to the new game server group resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of labels to assign to the new game server group resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
   */
  public open fun vpcSubnets(): List<String> = unwrap(this).getVpcSubnets() ?: emptyList()

  /**
   * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
   */
  public open fun vpcSubnets(`value`: List<String>) {
    unwrap(this).setVpcSubnets(`value`)
  }

  /**
   * A list of virtual private cloud (VPC) subnets to use with instances in the game server group.
   */
  public open fun vpcSubnets(vararg `value`: String): Unit = vpcSubnets(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnGameServerGroup].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting. 
     */
    public fun autoScalingPolicy(autoScalingPolicy: IResolvable)

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
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting. 
     */
    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty)

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
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("260b1af760b6009f2926f0ab103dda31affdd9a53f535ca8a3e9e09e0d373604")
    public fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit)

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
     * @param balancingStrategy Indicates how Amazon GameLift FleetIQ balances the use of Spot
     * Instances and On-Demand Instances in the game server group. 
     */
    public fun balancingStrategy(balancingStrategy: String)

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
     * @param deleteOption The type of delete to perform. 
     */
    public fun deleteOption(deleteOption: String)

    /**
     * A developer-defined identifier for the game server group.
     *
     * The name is unique for each Region in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-gameservergroupname)
     * @param gameServerGroupName A developer-defined identifier for the game server group. 
     */
    public fun gameServerGroupName(gameServerGroupName: String)

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
     * @param gameServerProtectionPolicy A flag that indicates whether instances in the game server
     * group are protected from early termination. 
     */
    public fun gameServerProtectionPolicy(gameServerProtectionPolicy: String)

    /**
     * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
     * automatically scaling instances in the corresponding Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    public fun instanceDefinitions(instanceDefinitions: IResolvable)

    /**
     * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
     * automatically scaling instances in the corresponding Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    public fun instanceDefinitions(instanceDefinitions: List<Any>)

    /**
     * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
     * automatically scaling instances in the corresponding Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    public fun instanceDefinitions(vararg instanceDefinitions: Any)

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
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group. 
     */
    public fun launchTemplate(launchTemplate: IResolvable)

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
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group. 
     */
    public fun launchTemplate(launchTemplate: LaunchTemplateProperty)

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
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0c6f4186d7a0bb0682a46568f56d9ab96c36e270752b16591b78b3cbf5f45ad")
    public fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit)

    /**
     * The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *
     * During automatic scaling events, Amazon GameLift FleetIQ and EC2 do not scale up the group
     * above this maximum. After the Auto Scaling group is created, update this value directly in the
     * Auto Scaling group using the AWS console or APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-maxsize)
     * @param maxSize The maximum number of instances allowed in the Amazon EC2 Auto Scaling group. 
     */
    public fun maxSize(maxSize: Number)

    /**
     * The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *
     * During automatic scaling events, Amazon GameLift FleetIQ and Amazon EC2 do not scale down the
     * group below this minimum. In production, this value should be set to at least 1. After the Auto
     * Scaling group is created, update this value directly in the Auto Scaling group using the AWS
     * console or APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-minsize)
     * @param minSize The minimum number of instances allowed in the Amazon EC2 Auto Scaling group. 
     */
    public fun minSize(minSize: Number)

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-rolearn)
     * @param roleArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups. 
     */
    public fun roleArn(roleArn: String)

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
     * @param tags A list of labels to assign to the new game server group resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags A list of labels to assign to the new game server group resource. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group. 
     */
    public fun vpcSubnets(vpcSubnets: List<String>)

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
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group. 
     */
    public fun vpcSubnets(vararg vpcSubnets: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.Builder =
        software.amazon.awscdk.services.gamelift.CfnGameServerGroup.Builder.create(scope, id)

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
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting. 
     */
    override fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(IResolvable::unwrap))
    }

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
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting. 
     */
    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty) {
      cdkBuilder.autoScalingPolicy(autoScalingPolicy.let(AutoScalingPolicyProperty::unwrap))
    }

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
     * @param autoScalingPolicy Configuration settings to define a scaling policy for the Auto
     * Scaling group that is optimized for game hosting. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("260b1af760b6009f2926f0ab103dda31affdd9a53f535ca8a3e9e09e0d373604")
    override fun autoScalingPolicy(autoScalingPolicy: AutoScalingPolicyProperty.Builder.() -> Unit):
        Unit = autoScalingPolicy(AutoScalingPolicyProperty(autoScalingPolicy))

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
     * @param balancingStrategy Indicates how Amazon GameLift FleetIQ balances the use of Spot
     * Instances and On-Demand Instances in the game server group. 
     */
    override fun balancingStrategy(balancingStrategy: String) {
      cdkBuilder.balancingStrategy(balancingStrategy)
    }

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
     * @param deleteOption The type of delete to perform. 
     */
    override fun deleteOption(deleteOption: String) {
      cdkBuilder.deleteOption(deleteOption)
    }

    /**
     * A developer-defined identifier for the game server group.
     *
     * The name is unique for each Region in each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-gameservergroupname)
     * @param gameServerGroupName A developer-defined identifier for the game server group. 
     */
    override fun gameServerGroupName(gameServerGroupName: String) {
      cdkBuilder.gameServerGroupName(gameServerGroupName)
    }

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
     * @param gameServerProtectionPolicy A flag that indicates whether instances in the game server
     * group are protected from early termination. 
     */
    override fun gameServerProtectionPolicy(gameServerProtectionPolicy: String) {
      cdkBuilder.gameServerProtectionPolicy(gameServerProtectionPolicy)
    }

    /**
     * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
     * automatically scaling instances in the corresponding Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    override fun instanceDefinitions(instanceDefinitions: IResolvable) {
      cdkBuilder.instanceDefinitions(instanceDefinitions.let(IResolvable::unwrap))
    }

    /**
     * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
     * automatically scaling instances in the corresponding Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    override fun instanceDefinitions(instanceDefinitions: List<Any>) {
      cdkBuilder.instanceDefinitions(instanceDefinitions)
    }

    /**
     * The set of Amazon EC2 instance types that Amazon GameLift FleetIQ can use when balancing and
     * automatically scaling instances in the corresponding Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-instancedefinitions)
     * @param instanceDefinitions The set of Amazon EC2 instance types that Amazon GameLift FleetIQ
     * can use when balancing and automatically scaling instances in the corresponding Auto Scaling
     * group. 
     */
    override fun instanceDefinitions(vararg instanceDefinitions: Any): Unit =
        instanceDefinitions(instanceDefinitions.toList())

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
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group. 
     */
    override fun launchTemplate(launchTemplate: IResolvable) {
      cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
    }

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
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group. 
     */
    override fun launchTemplate(launchTemplate: LaunchTemplateProperty) {
      cdkBuilder.launchTemplate(launchTemplate.let(LaunchTemplateProperty::unwrap))
    }

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
     * @param launchTemplate The Amazon EC2 launch template that contains configuration settings and
     * game server code to be deployed to all instances in the game server group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0c6f4186d7a0bb0682a46568f56d9ab96c36e270752b16591b78b3cbf5f45ad")
    override fun launchTemplate(launchTemplate: LaunchTemplateProperty.Builder.() -> Unit): Unit =
        launchTemplate(LaunchTemplateProperty(launchTemplate))

    /**
     * The maximum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *
     * During automatic scaling events, Amazon GameLift FleetIQ and EC2 do not scale up the group
     * above this maximum. After the Auto Scaling group is created, update this value directly in the
     * Auto Scaling group using the AWS console or APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-maxsize)
     * @param maxSize The maximum number of instances allowed in the Amazon EC2 Auto Scaling group. 
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * The minimum number of instances allowed in the Amazon EC2 Auto Scaling group.
     *
     * During automatic scaling events, Amazon GameLift FleetIQ and Amazon EC2 do not scale down the
     * group below this minimum. In production, this value should be set to at least 1. After the Auto
     * Scaling group is created, update this value directly in the Auto Scaling group using the AWS
     * console or APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-minsize)
     * @param minSize The minimum number of instances allowed in the Amazon EC2 Auto Scaling group. 
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gameservergroup.html#cfn-gamelift-gameservergroup-rolearn)
     * @param roleArn The Amazon Resource Name (
     * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) for an IAM role that
     * allows Amazon GameLift to access your Amazon EC2 Auto Scaling groups. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

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
     * @param tags A list of labels to assign to the new game server group resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags A list of labels to assign to the new game server group resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group. 
     */
    override fun vpcSubnets(vpcSubnets: List<String>) {
      cdkBuilder.vpcSubnets(vpcSubnets)
    }

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
     * @param vpcSubnets A list of virtual private cloud (VPC) subnets to use with instances in the
     * game server group. 
     */
    override fun vpcSubnets(vararg vpcSubnets: String): Unit = vpcSubnets(vpcSubnets.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnGameServerGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnGameServerGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGameServerGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGameServerGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup):
        CfnGameServerGroup = CfnGameServerGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGameServerGroup):
        software.amazon.awscdk.services.gamelift.CfnGameServerGroup = wrapped.cdkObject
  }

  /**
   * *This data type is used with the GameLift FleetIQ and game server groups.*.
   *
   * Configuration settings for intelligent automatic scaling that uses target tracking. After the
   * Auto Scaling group is created, all updates to Auto Scaling policies, including changing this
   * policy and adding or removing other policies, is done directly on the Auto Scaling group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * AutoScalingPolicyProperty autoScalingPolicyProperty = AutoScalingPolicyProperty.builder()
   * .targetTrackingConfiguration(TargetTrackingConfigurationProperty.builder()
   * .targetValue(123)
   * .build())
   * // the properties below are optional
   * .estimatedInstanceWarmup(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-autoscalingpolicy.html)
   */
  public interface AutoScalingPolicyProperty {
    /**
     * Length of time, in seconds, it takes for a new instance to start new game server processes
     * and register with Amazon GameLift FleetIQ.
     *
     * Specifying a warm-up time can be useful, particularly with game servers that take a long time
     * to start up, because it avoids prematurely starting new instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-autoscalingpolicy.html#cfn-gamelift-gameservergroup-autoscalingpolicy-estimatedinstancewarmup)
     */
    public fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

    /**
     * Settings for a target-based scaling policy applied to Auto Scaling group.
     *
     * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
     * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player usage
     * changes, the policy triggers to adjust the game server group capacity so that the metric returns
     * to the target value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-autoscalingpolicy.html#cfn-gamelift-gameservergroup-autoscalingpolicy-targettrackingconfiguration)
     */
    public fun targetTrackingConfiguration(): Any

    /**
     * A builder for [AutoScalingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param estimatedInstanceWarmup Length of time, in seconds, it takes for a new instance to
       * start new game server processes and register with Amazon GameLift FleetIQ.
       * Specifying a warm-up time can be useful, particularly with game servers that take a long
       * time to start up, because it avoids prematurely starting new instances.
       */
      public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number)

      /**
       * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to
       * Auto Scaling group. 
       * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
       * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player
       * usage changes, the policy triggers to adjust the game server group capacity so that the metric
       * returns to the target value.
       */
      public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable)

      /**
       * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to
       * Auto Scaling group. 
       * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
       * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player
       * usage changes, the policy triggers to adjust the game server group capacity so that the metric
       * returns to the target value.
       */
      public
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty)

      /**
       * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to
       * Auto Scaling group. 
       * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
       * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player
       * usage changes, the policy triggers to adjust the game server group capacity so that the metric
       * returns to the target value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea4e8fc6fbae60f62cc711e3cf2d8fd6d3e515c00aeeb96e8d56967a991c260")
      public
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty.builder()

      /**
       * @param estimatedInstanceWarmup Length of time, in seconds, it takes for a new instance to
       * start new game server processes and register with Amazon GameLift FleetIQ.
       * Specifying a warm-up time can be useful, particularly with game servers that take a long
       * time to start up, because it avoids prematurely starting new instances.
       */
      override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
      }

      /**
       * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to
       * Auto Scaling group. 
       * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
       * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player
       * usage changes, the policy triggers to adjust the game server group capacity so that the metric
       * returns to the target value.
       */
      override fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to
       * Auto Scaling group. 
       * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
       * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player
       * usage changes, the policy triggers to adjust the game server group capacity so that the metric
       * returns to the target value.
       */
      override
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(TargetTrackingConfigurationProperty::unwrap))
      }

      /**
       * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to
       * Auto Scaling group. 
       * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
       * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player
       * usage changes, the policy triggers to adjust the game server group capacity so that the metric
       * returns to the target value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ea4e8fc6fbae60f62cc711e3cf2d8fd6d3e515c00aeeb96e8d56967a991c260")
      override
          fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit):
          Unit =
          targetTrackingConfiguration(TargetTrackingConfigurationProperty(targetTrackingConfiguration))

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty,
    ) : CdkObject(cdkObject), AutoScalingPolicyProperty {
      /**
       * Length of time, in seconds, it takes for a new instance to start new game server processes
       * and register with Amazon GameLift FleetIQ.
       *
       * Specifying a warm-up time can be useful, particularly with game servers that take a long
       * time to start up, because it avoids prematurely starting new instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-autoscalingpolicy.html#cfn-gamelift-gameservergroup-autoscalingpolicy-estimatedinstancewarmup)
       */
      override fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

      /**
       * Settings for a target-based scaling policy applied to Auto Scaling group.
       *
       * These settings are used to create a target-based policy that tracks the GameLift FleetIQ
       * metric `PercentUtilizedGameServers` and specifies a target value for the metric. As player
       * usage changes, the policy triggers to adjust the game server group capacity so that the metric
       * returns to the target value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-autoscalingpolicy.html#cfn-gamelift-gameservergroup-autoscalingpolicy-targettrackingconfiguration)
       */
      override fun targetTrackingConfiguration(): Any =
          unwrap(this).getTargetTrackingConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty):
          AutoScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoScalingPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.AutoScalingPolicyProperty
    }
  }

  /**
   * *This data type is used with the Amazon GameLift FleetIQ and game server groups.*.
   *
   * An allowed instance type for a `GameServerGroup` . All game server groups must have at least
   * two instance types defined for it. GameLift FleetIQ periodically evaluates each defined instance
   * type for viability. It then updates the Auto Scaling group with the list of viable instance types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * InstanceDefinitionProperty instanceDefinitionProperty = InstanceDefinitionProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .weightedCapacity("weightedCapacity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-instancedefinition.html)
   */
  public interface InstanceDefinitionProperty {
    /**
     * An Amazon EC2 instance type designation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-instancedefinition.html#cfn-gamelift-gameservergroup-instancedefinition-instancetype)
     */
    public fun instanceType(): String

    /**
     * Instance weighting that indicates how much this instance type contributes to the total
     * capacity of a game server group.
     *
     * Instance weights are used by Amazon GameLift FleetIQ to calculate the instance type's cost
     * per unit hour and better identify the most cost-effective options. For detailed information on
     * weighting instance capacity, see [Instance
     * Weighting](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html) in
     * the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . Default value is "1".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-instancedefinition.html#cfn-gamelift-gameservergroup-instancedefinition-weightedcapacity)
     */
    public fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()

    /**
     * A builder for [InstanceDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceType An Amazon EC2 instance type designation. 
       */
      public fun instanceType(instanceType: String)

      /**
       * @param weightedCapacity Instance weighting that indicates how much this instance type
       * contributes to the total capacity of a game server group.
       * Instance weights are used by Amazon GameLift FleetIQ to calculate the instance type's cost
       * per unit hour and better identify the most cost-effective options. For detailed information on
       * weighting instance capacity, see [Instance
       * Weighting](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html)
       * in the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . Default value is "1".
       */
      public fun weightedCapacity(weightedCapacity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty.builder()

      /**
       * @param instanceType An Amazon EC2 instance type designation. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param weightedCapacity Instance weighting that indicates how much this instance type
       * contributes to the total capacity of a game server group.
       * Instance weights are used by Amazon GameLift FleetIQ to calculate the instance type's cost
       * per unit hour and better identify the most cost-effective options. For detailed information on
       * weighting instance capacity, see [Instance
       * Weighting](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html)
       * in the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . Default value is "1".
       */
      override fun weightedCapacity(weightedCapacity: String) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty,
    ) : CdkObject(cdkObject), InstanceDefinitionProperty {
      /**
       * An Amazon EC2 instance type designation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-instancedefinition.html#cfn-gamelift-gameservergroup-instancedefinition-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()

      /**
       * Instance weighting that indicates how much this instance type contributes to the total
       * capacity of a game server group.
       *
       * Instance weights are used by Amazon GameLift FleetIQ to calculate the instance type's cost
       * per unit hour and better identify the most cost-effective options. For detailed information on
       * weighting instance capacity, see [Instance
       * Weighting](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html)
       * in the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . Default value is "1".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-instancedefinition.html#cfn-gamelift-gameservergroup-instancedefinition-weightedcapacity)
       */
      override fun weightedCapacity(): String? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty):
          InstanceDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InstanceDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceDefinitionProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.InstanceDefinitionProperty
    }
  }

  /**
   * *This data type is used with the GameLift FleetIQ and game server groups.*.
   *
   * An Amazon EC2 launch template that contains configuration settings and game server code to be
   * deployed to all instances in a game server group. The launch template is specified when creating a
   * new game server group with `GameServerGroup` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * LaunchTemplateProperty launchTemplateProperty = LaunchTemplateProperty.builder()
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html)
   */
  public interface LaunchTemplateProperty {
    /**
     * A unique identifier for an existing Amazon EC2 launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html#cfn-gamelift-gameservergroup-launchtemplate-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * A readable identifier for an existing Amazon EC2 launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html#cfn-gamelift-gameservergroup-launchtemplate-launchtemplatename)
     */
    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The version of the Amazon EC2 launch template to use.
     *
     * If no version is specified, the default version will be used. With Amazon EC2, you can
     * specify a default version for a launch template. If none is set, the default is the first
     * version created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html#cfn-gamelift-gameservergroup-launchtemplate-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [LaunchTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateId A unique identifier for an existing Amazon EC2 launch template.
       */
      public fun launchTemplateId(launchTemplateId: String)

      /**
       * @param launchTemplateName A readable identifier for an existing Amazon EC2 launch template.
       */
      public fun launchTemplateName(launchTemplateName: String)

      /**
       * @param version The version of the Amazon EC2 launch template to use.
       * If no version is specified, the default version will be used. With Amazon EC2, you can
       * specify a default version for a launch template. If none is set, the default is the first
       * version created.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty.builder()

      /**
       * @param launchTemplateId A unique identifier for an existing Amazon EC2 launch template.
       */
      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      /**
       * @param launchTemplateName A readable identifier for an existing Amazon EC2 launch template.
       */
      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      /**
       * @param version The version of the Amazon EC2 launch template to use.
       * If no version is specified, the default version will be used. With Amazon EC2, you can
       * specify a default version for a launch template. If none is set, the default is the first
       * version created.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty,
    ) : CdkObject(cdkObject), LaunchTemplateProperty {
      /**
       * A unique identifier for an existing Amazon EC2 launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html#cfn-gamelift-gameservergroup-launchtemplate-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * A readable identifier for an existing Amazon EC2 launch template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html#cfn-gamelift-gameservergroup-launchtemplate-launchtemplatename)
       */
      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      /**
       * The version of the Amazon EC2 launch template to use.
       *
       * If no version is specified, the default version will be used. With Amazon EC2, you can
       * specify a default version for a launch template. If none is set, the default is the first
       * version created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html#cfn-gamelift-gameservergroup-launchtemplate-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty):
          LaunchTemplateProperty = CdkObjectWrappers.wrap(cdkObject) as? LaunchTemplateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.LaunchTemplateProperty
    }
  }

  /**
   * *This data type is used with the Amazon GameLift FleetIQ and game server groups.*.
   *
   * Settings for a target-based scaling policy as part of a `GameServerGroupAutoScalingPolicy` .
   * These settings are used to create a target-based policy that tracks the GameLift FleetIQ metric
   * `"PercentUtilizedGameServers"` and specifies a target value for the metric. As player usage
   * changes, the policy triggers to adjust the game server group capacity so that the metric returns
   * to the target value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * TargetTrackingConfigurationProperty targetTrackingConfigurationProperty =
   * TargetTrackingConfigurationProperty.builder()
   * .targetValue(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-targettrackingconfiguration.html)
   */
  public interface TargetTrackingConfigurationProperty {
    /**
     * Desired value to use with a game server group target-based scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-targettrackingconfiguration.html#cfn-gamelift-gameservergroup-targettrackingconfiguration-targetvalue)
     */
    public fun targetValue(): Number

    /**
     * A builder for [TargetTrackingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetValue Desired value to use with a game server group target-based scaling
       * policy. 
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty.builder()

      /**
       * @param targetValue Desired value to use with a game server group target-based scaling
       * policy. 
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty,
    ) : CdkObject(cdkObject), TargetTrackingConfigurationProperty {
      /**
       * Desired value to use with a game server group target-based scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-targettrackingconfiguration.html#cfn-gamelift-gameservergroup-targettrackingconfiguration-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty):
          TargetTrackingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnGameServerGroup.TargetTrackingConfigurationProperty
    }
  }
}
