@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * Describes an Amazon GameLift Servers managed container fleet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnContainerFleet cfnContainerFleet = CfnContainerFleet.Builder.create(this,
 * "MyCfnContainerFleet")
 * .fleetRoleArn("fleetRoleArn")
 * // the properties below are optional
 * .billingType("billingType")
 * .deploymentConfiguration(DeploymentConfigurationProperty.builder()
 * .impairmentStrategy("impairmentStrategy")
 * .minimumHealthyPercentage(123)
 * .protectionStrategy("protectionStrategy")
 * .build())
 * .description("description")
 * .gameServerContainerGroupDefinitionName("gameServerContainerGroupDefinitionName")
 * .gameServerContainerGroupsPerInstance(123)
 * .gameSessionCreationLimitPolicy(GameSessionCreationLimitPolicyProperty.builder()
 * .newGameSessionsPerCreator(123)
 * .policyPeriodInMinutes(123)
 * .build())
 * .instanceConnectionPortRange(ConnectionPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .instanceInboundPermissions(List.of(IpPermissionProperty.builder()
 * .fromPort(123)
 * .ipRange("ipRange")
 * .protocol("protocol")
 * .toPort(123)
 * .build()))
 * .instanceType("instanceType")
 * .locations(List.of(LocationConfigurationProperty.builder()
 * .location("location")
 * // the properties below are optional
 * .locationCapacity(LocationCapacityProperty.builder()
 * .desiredEc2Instances(123)
 * .maxSize(123)
 * .minSize(123)
 * .build())
 * .stoppedActions(List.of("stoppedActions"))
 * .build()))
 * .logConfiguration(LogConfigurationProperty.builder()
 * .logDestination("logDestination")
 * .logGroupArn("logGroupArn")
 * .s3BucketName("s3BucketName")
 * .build())
 * .metricGroups(List.of("metricGroups"))
 * .newGameSessionProtectionPolicy("newGameSessionProtectionPolicy")
 * .perInstanceContainerGroupDefinitionName("perInstanceContainerGroupDefinitionName")
 * .scalingPolicies(List.of(ScalingPolicyProperty.builder()
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .comparisonOperator("comparisonOperator")
 * .evaluationPeriods(123)
 * .policyType("policyType")
 * .scalingAdjustment(123)
 * .scalingAdjustmentType("scalingAdjustmentType")
 * .targetConfiguration(TargetConfigurationProperty.builder()
 * .targetValue(123)
 * .build())
 * .threshold(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html)
 */
public open class CfnContainerFleet(
  cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerFleetProps,
  ) :
      this(software.amazon.awscdk.services.gamelift.CfnContainerFleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnContainerFleetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContainerFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContainerFleetProps(props)
  )

  /**
   * A time stamp indicating when this data object was created.
   *
   * Format is a number expressed in Unix time as milliseconds (for example `"1469498468.057"` ).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Provides information about the last deployment ID and its status.
   */
  public open fun attrDeploymentDetails(): IResolvable =
      unwrap(this).getAttrDeploymentDetails().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to a
   * Amazon GameLift Servers fleet resource and uniquely identifies it. ARNs are unique across all
   * Regions. Format is
   * `arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912` . In a
   * GameLift fleet ARN, the resource ID matches the `FleetId` value.
   */
  public open fun attrFleetArn(): String = unwrap(this).getAttrFleetArn()

  /**
   * A unique identifier for the container fleet to retrieve.
   */
  public open fun attrFleetId(): String = unwrap(this).getAttrFleetId()

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
   * the fleet's game server container group. The ARN value also identifies the specific container
   * group definition version in use.
   */
  public open fun attrGameServerContainerGroupDefinitionArn(): String =
      unwrap(this).getAttrGameServerContainerGroupDefinitionArn()

  /**
   * The calculated maximum number of game server container group that can be deployed on each fleet
   * instance.
   *
   * The calculation depends on the resource needs of the container group and the CPU and memory
   * resources of the fleet's instance type.
   */
  public open fun attrMaximumGameServerContainerGroupsPerInstance(): Number =
      unwrap(this).getAttrMaximumGameServerContainerGroupsPerInstance()

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to
   * the fleet's per-instance container group. The ARN value also identifies the specific container
   * group definition version in use.
   */
  public open fun attrPerInstanceContainerGroupDefinitionArn(): String =
      unwrap(this).getAttrPerInstanceContainerGroupDefinitionArn()

  /**
   * The current status of the container fleet.
   *
   * * `PENDING` -- A new container fleet has been requested.
   * * `CREATING` -- A new container fleet resource is being created.
   * * `CREATED` -- A new container fleet resource has been created. No fleet instances have been
   * deployed.
   * * `ACTIVATING` -- New container fleet instances are being deployed.
   * * `ACTIVE` -- The container fleet has been deployed and is ready to host game sessions.
   * * `UPDATING` -- Updates to the container fleet is being updated. A deployment is in progress.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Indicates whether the fleet uses On-Demand or Spot instances for this fleet.
   */
  public open fun billingType(): String? = unwrap(this).getBillingType()

  /**
   * Indicates whether the fleet uses On-Demand or Spot instances for this fleet.
   */
  public open fun billingType(`value`: String) {
    unwrap(this).setBillingType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Set of rules for processing a deployment for a container fleet update.
   */
  public open fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

  /**
   * Set of rules for processing a deployment for a container fleet update.
   */
  public open fun deploymentConfiguration(`value`: IResolvable) {
    unwrap(this).setDeploymentConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Set of rules for processing a deployment for a container fleet update.
   */
  public open fun deploymentConfiguration(`value`: DeploymentConfigurationProperty) {
    unwrap(this).setDeploymentConfiguration(`value`.let(DeploymentConfigurationProperty.Companion::unwrap))
  }

  /**
   * Set of rules for processing a deployment for a container fleet update.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b62ba7b4dbdefa336b44f4e1547e39027b6c74d3d0420cc5f867837c645cc1a")
  public open
      fun deploymentConfiguration(`value`: DeploymentConfigurationProperty.Builder.() -> Unit): Unit
      = deploymentConfiguration(DeploymentConfigurationProperty(`value`))

  /**
   * A meaningful description of the container fleet.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A meaningful description of the container fleet.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The unique identifier for an AWS Identity and Access Management (IAM) role with permissions to
   * run your containers on resources that are managed by Amazon GameLift Servers.
   */
  public open fun fleetRoleArn(): String = unwrap(this).getFleetRoleArn()

  /**
   * The unique identifier for an AWS Identity and Access Management (IAM) role with permissions to
   * run your containers on resources that are managed by Amazon GameLift Servers.
   */
  public open fun fleetRoleArn(`value`: String) {
    unwrap(this).setFleetRoleArn(`value`)
  }

  /**
   * The name of the fleet's game server container group definition, which describes how to deploy
   * containers with your game server build and support software onto each fleet instance.
   */
  public open fun gameServerContainerGroupDefinitionName(): String? =
      unwrap(this).getGameServerContainerGroupDefinitionName()

  /**
   * The name of the fleet's game server container group definition, which describes how to deploy
   * containers with your game server build and support software onto each fleet instance.
   */
  public open fun gameServerContainerGroupDefinitionName(`value`: String) {
    unwrap(this).setGameServerContainerGroupDefinitionName(`value`)
  }

  /**
   * The number of times to replicate the game server container group on each fleet instance.
   */
  public open fun gameServerContainerGroupsPerInstance(): Number? =
      unwrap(this).getGameServerContainerGroupsPerInstance()

  /**
   * The number of times to replicate the game server container group on each fleet instance.
   */
  public open fun gameServerContainerGroupsPerInstance(`value`: Number) {
    unwrap(this).setGameServerContainerGroupsPerInstance(`value`)
  }

  /**
   * A policy that limits the number of game sessions that each individual player can create on
   * instances in this fleet.
   */
  public open fun gameSessionCreationLimitPolicy(): Any? =
      unwrap(this).getGameSessionCreationLimitPolicy()

  /**
   * A policy that limits the number of game sessions that each individual player can create on
   * instances in this fleet.
   */
  public open fun gameSessionCreationLimitPolicy(`value`: IResolvable) {
    unwrap(this).setGameSessionCreationLimitPolicy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A policy that limits the number of game sessions that each individual player can create on
   * instances in this fleet.
   */
  public open fun gameSessionCreationLimitPolicy(`value`: GameSessionCreationLimitPolicyProperty) {
    unwrap(this).setGameSessionCreationLimitPolicy(`value`.let(GameSessionCreationLimitPolicyProperty.Companion::unwrap))
  }

  /**
   * A policy that limits the number of game sessions that each individual player can create on
   * instances in this fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ecda9a5575d29a02c52ed96a48afc99dfcd96c02a2c6e19a5b766fb01aacc03")
  public open
      fun gameSessionCreationLimitPolicy(`value`: GameSessionCreationLimitPolicyProperty.Builder.() -> Unit):
      Unit = gameSessionCreationLimitPolicy(GameSessionCreationLimitPolicyProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The set of port numbers to open on each instance in a container fleet.
   */
  public open fun instanceConnectionPortRange(): Any? =
      unwrap(this).getInstanceConnectionPortRange()

  /**
   * The set of port numbers to open on each instance in a container fleet.
   */
  public open fun instanceConnectionPortRange(`value`: IResolvable) {
    unwrap(this).setInstanceConnectionPortRange(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The set of port numbers to open on each instance in a container fleet.
   */
  public open fun instanceConnectionPortRange(`value`: ConnectionPortRangeProperty) {
    unwrap(this).setInstanceConnectionPortRange(`value`.let(ConnectionPortRangeProperty.Companion::unwrap))
  }

  /**
   * The set of port numbers to open on each instance in a container fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b0caaaafcd373fc528aeb036c97bf54d43a11812a0cb56564c01d4a538dd9b61")
  public open
      fun instanceConnectionPortRange(`value`: ConnectionPortRangeProperty.Builder.() -> Unit): Unit
      = instanceConnectionPortRange(ConnectionPortRangeProperty(`value`))

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun instanceInboundPermissions(): Any? = unwrap(this).getInstanceInboundPermissions()

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun instanceInboundPermissions(`value`: IResolvable) {
    unwrap(this).setInstanceInboundPermissions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun instanceInboundPermissions(`value`: List<Any>) {
    unwrap(this).setInstanceInboundPermissions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun instanceInboundPermissions(vararg `value`: Any): Unit =
      instanceInboundPermissions(`value`.toList())

  /**
   * The Amazon EC2 instance type to use for all instances in the fleet.
   */
  public open fun instanceType(): String? = unwrap(this).getInstanceType()

  /**
   * The Amazon EC2 instance type to use for all instances in the fleet.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   *
   */
  public open fun locations(): Any? = unwrap(this).getLocations()

  /**
   *
   */
  public open fun locations(`value`: IResolvable) {
    unwrap(this).setLocations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun locations(`value`: List<Any>) {
    unwrap(this).setLocations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
   */
  public open fun locations(vararg `value`: Any): Unit = locations(`value`.toList())

  /**
   * The method that is used to collect container logs for the fleet.
   */
  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The method that is used to collect container logs for the fleet.
   */
  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The method that is used to collect container logs for the fleet.
   */
  public open fun logConfiguration(`value`: LogConfigurationProperty) {
    unwrap(this).setLogConfiguration(`value`.let(LogConfigurationProperty.Companion::unwrap))
  }

  /**
   * The method that is used to collect container logs for the fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("624d600a97183644212c877cba7d544f6b0e71520d94105fd7da2762ada06988")
  public open fun logConfiguration(`value`: LogConfigurationProperty.Builder.() -> Unit): Unit =
      logConfiguration(LogConfigurationProperty(`value`))

  /**
   * The name of an AWS CloudWatch metric group to add this fleet to.
   */
  public open fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

  /**
   * The name of an AWS CloudWatch metric group to add this fleet to.
   */
  public open fun metricGroups(`value`: List<String>) {
    unwrap(this).setMetricGroups(`value`)
  }

  /**
   * The name of an AWS CloudWatch metric group to add this fleet to.
   */
  public open fun metricGroups(vararg `value`: String): Unit = metricGroups(`value`.toList())

  /**
   * Determines whether Amazon GameLift Servers can shut down game sessions on the fleet that are
   * actively running and hosting players.
   */
  public open fun newGameSessionProtectionPolicy(): String? =
      unwrap(this).getNewGameSessionProtectionPolicy()

  /**
   * Determines whether Amazon GameLift Servers can shut down game sessions on the fleet that are
   * actively running and hosting players.
   */
  public open fun newGameSessionProtectionPolicy(`value`: String) {
    unwrap(this).setNewGameSessionProtectionPolicy(`value`)
  }

  /**
   * The name of the fleet's per-instance container group definition.
   */
  public open fun perInstanceContainerGroupDefinitionName(): String? =
      unwrap(this).getPerInstanceContainerGroupDefinitionName()

  /**
   * The name of the fleet's per-instance container group definition.
   */
  public open fun perInstanceContainerGroupDefinitionName(`value`: String) {
    unwrap(this).setPerInstanceContainerGroupDefinitionName(`value`)
  }

  /**
   * A list of rules that control how a fleet is scaled.
   */
  public open fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

  /**
   * A list of rules that control how a fleet is scaled.
   */
  public open fun scalingPolicies(`value`: IResolvable) {
    unwrap(this).setScalingPolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of rules that control how a fleet is scaled.
   */
  public open fun scalingPolicies(`value`: List<Any>) {
    unwrap(this).setScalingPolicies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of rules that control how a fleet is scaled.
   */
  public open fun scalingPolicies(vararg `value`: Any): Unit = scalingPolicies(`value`.toList())

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnContainerFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether the fleet uses On-Demand or Spot instances for this fleet.
     *
     * Learn more about when to use [On-Demand versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . You can't update this fleet property.
     *
     * By default, this property is set to `ON_DEMAND` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-billingtype)
     * @param billingType Indicates whether the fleet uses On-Demand or Spot instances for this
     * fleet. 
     */
    public fun billingType(billingType: String)

    /**
     * Set of rules for processing a deployment for a container fleet update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update. 
     */
    public fun deploymentConfiguration(deploymentConfiguration: IResolvable)

    /**
     * Set of rules for processing a deployment for a container fleet update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update. 
     */
    public fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty)

    /**
     * Set of rules for processing a deployment for a container fleet update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6853c849eda4dcf488f945731a7593bbd48ecd9cece0f530634257639be5ba12")
    public
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit)

    /**
     * A meaningful description of the container fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-description)
     * @param description A meaningful description of the container fleet. 
     */
    public fun description(description: String)

    /**
     * The unique identifier for an AWS Identity and Access Management (IAM) role with permissions
     * to run your containers on resources that are managed by Amazon GameLift Servers.
     *
     * See [Set up an IAM service
     * role](https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html) . This
     * fleet property can't be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-fleetrolearn)
     * @param fleetRoleArn The unique identifier for an AWS Identity and Access Management (IAM)
     * role with permissions to run your containers on resources that are managed by Amazon GameLift
     * Servers. 
     */
    public fun fleetRoleArn(fleetRoleArn: String)

    /**
     * The name of the fleet's game server container group definition, which describes how to deploy
     * containers with your game server build and support software onto each fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupdefinitionname)
     * @param gameServerContainerGroupDefinitionName The name of the fleet's game server container
     * group definition, which describes how to deploy containers with your game server build and
     * support software onto each fleet instance. 
     */
    public
        fun gameServerContainerGroupDefinitionName(gameServerContainerGroupDefinitionName: String)

    /**
     * The number of times to replicate the game server container group on each fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupsperinstance)
     * @param gameServerContainerGroupsPerInstance The number of times to replicate the game server
     * container group on each fleet instance. 
     */
    public fun gameServerContainerGroupsPerInstance(gameServerContainerGroupsPerInstance: Number)

    /**
     * A policy that limits the number of game sessions that each individual player can create on
     * instances in this fleet.
     *
     * The limit applies for a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet. 
     */
    public fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: IResolvable)

    /**
     * A policy that limits the number of game sessions that each individual player can create on
     * instances in this fleet.
     *
     * The limit applies for a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet. 
     */
    public
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: GameSessionCreationLimitPolicyProperty)

    /**
     * A policy that limits the number of game sessions that each individual player can create on
     * instances in this fleet.
     *
     * The limit applies for a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("441ae96682cddb58b31c339e18e7e5f4f93406ab3e2342ac48ee30f2992dfe50")
    public
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: GameSessionCreationLimitPolicyProperty.Builder.() -> Unit)

    /**
     * The set of port numbers to open on each instance in a container fleet.
     *
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet. 
     */
    public fun instanceConnectionPortRange(instanceConnectionPortRange: IResolvable)

    /**
     * The set of port numbers to open on each instance in a container fleet.
     *
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet. 
     */
    public fun instanceConnectionPortRange(instanceConnectionPortRange: ConnectionPortRangeProperty)

    /**
     * The set of port numbers to open on each instance in a container fleet.
     *
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd0a056833e79d7d8dc7717eed61517f3eb8a0f905f93b944cf13e1ca0f78512")
    public
        fun instanceConnectionPortRange(instanceConnectionPortRange: ConnectionPortRangeProperty.Builder.() -> Unit)

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    public fun instanceInboundPermissions(instanceInboundPermissions: IResolvable)

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    public fun instanceInboundPermissions(instanceInboundPermissions: List<Any>)

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    public fun instanceInboundPermissions(vararg instanceInboundPermissions: Any)

    /**
     * The Amazon EC2 instance type to use for all instances in the fleet.
     *
     * Instance type determines the computing resources and processing power that's available to
     * host your game servers. This includes including CPU, memory, storage, and networking capacity.
     * You can't update this fleet property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instancetype)
     * @param instanceType The Amazon EC2 instance type to use for all instances in the fleet. 
     */
    public fun instanceType(instanceType: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
     * @param locations 
     */
    public fun locations(locations: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
     * @param locations 
     */
    public fun locations(locations: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
     * @param locations 
     */
    public fun locations(vararg locations: Any)

    /**
     * The method that is used to collect container logs for the fleet.
     *
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-logconfiguration)
     * @param logConfiguration The method that is used to collect container logs for the fleet. 
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * The method that is used to collect container logs for the fleet.
     *
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-logconfiguration)
     * @param logConfiguration The method that is used to collect container logs for the fleet. 
     */
    public fun logConfiguration(logConfiguration: LogConfigurationProperty)

    /**
     * The method that is used to collect container logs for the fleet.
     *
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-logconfiguration)
     * @param logConfiguration The method that is used to collect container logs for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05fd843a1f15f435384901b3a256337a7bf943e809a6590d5e08834ee7175f5e")
    public fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * Metric groups aggregate metrics for multiple fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-metricgroups)
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    public fun metricGroups(metricGroups: List<String>)

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * Metric groups aggregate metrics for multiple fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-metricgroups)
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    public fun metricGroups(vararg metricGroups: String)

    /**
     * Determines whether Amazon GameLift Servers can shut down game sessions on the fleet that are
     * actively running and hosting players.
     *
     * Amazon GameLift Servers might prompt an instance shutdown when scaling down fleet capacity or
     * when retiring unhealthy instances. You can also set game session protection for individual game
     * sessions using
     * [UpdateGameSession](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSession.html)
     * .
     *
     * * *NoProtection* -- Game sessions can be shut down during active gameplay.
     * * *FullProtection* -- Game sessions in `ACTIVE` status can't be shut down.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-newgamesessionprotectionpolicy)
     * @param newGameSessionProtectionPolicy Determines whether Amazon GameLift Servers can shut
     * down game sessions on the fleet that are actively running and hosting players. 
     */
    public fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String)

    /**
     * The name of the fleet's per-instance container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-perinstancecontainergroupdefinitionname)
     * @param perInstanceContainerGroupDefinitionName The name of the fleet's per-instance container
     * group definition. 
     */
    public
        fun perInstanceContainerGroupDefinitionName(perInstanceContainerGroupDefinitionName: String)

    /**
     * A list of rules that control how a fleet is scaled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
     * @param scalingPolicies A list of rules that control how a fleet is scaled. 
     */
    public fun scalingPolicies(scalingPolicies: IResolvable)

    /**
     * A list of rules that control how a fleet is scaled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
     * @param scalingPolicies A list of rules that control how a fleet is scaled. 
     */
    public fun scalingPolicies(scalingPolicies: List<Any>)

    /**
     * A list of rules that control how a fleet is scaled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
     * @param scalingPolicies A list of rules that control how a fleet is scaled. 
     */
    public fun scalingPolicies(vararg scalingPolicies: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnContainerFleet.Builder =
        software.amazon.awscdk.services.gamelift.CfnContainerFleet.Builder.create(scope, id)

    /**
     * Indicates whether the fleet uses On-Demand or Spot instances for this fleet.
     *
     * Learn more about when to use [On-Demand versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . You can't update this fleet property.
     *
     * By default, this property is set to `ON_DEMAND` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-billingtype)
     * @param billingType Indicates whether the fleet uses On-Demand or Spot instances for this
     * fleet. 
     */
    override fun billingType(billingType: String) {
      cdkBuilder.billingType(billingType)
    }

    /**
     * Set of rules for processing a deployment for a container fleet update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update. 
     */
    override fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Set of rules for processing a deployment for a container fleet update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update. 
     */
    override fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(DeploymentConfigurationProperty.Companion::unwrap))
    }

    /**
     * Set of rules for processing a deployment for a container fleet update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6853c849eda4dcf488f945731a7593bbd48ecd9cece0f530634257639be5ba12")
    override
        fun deploymentConfiguration(deploymentConfiguration: DeploymentConfigurationProperty.Builder.() -> Unit):
        Unit = deploymentConfiguration(DeploymentConfigurationProperty(deploymentConfiguration))

    /**
     * A meaningful description of the container fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-description)
     * @param description A meaningful description of the container fleet. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique identifier for an AWS Identity and Access Management (IAM) role with permissions
     * to run your containers on resources that are managed by Amazon GameLift Servers.
     *
     * See [Set up an IAM service
     * role](https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html) . This
     * fleet property can't be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-fleetrolearn)
     * @param fleetRoleArn The unique identifier for an AWS Identity and Access Management (IAM)
     * role with permissions to run your containers on resources that are managed by Amazon GameLift
     * Servers. 
     */
    override fun fleetRoleArn(fleetRoleArn: String) {
      cdkBuilder.fleetRoleArn(fleetRoleArn)
    }

    /**
     * The name of the fleet's game server container group definition, which describes how to deploy
     * containers with your game server build and support software onto each fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupdefinitionname)
     * @param gameServerContainerGroupDefinitionName The name of the fleet's game server container
     * group definition, which describes how to deploy containers with your game server build and
     * support software onto each fleet instance. 
     */
    override
        fun gameServerContainerGroupDefinitionName(gameServerContainerGroupDefinitionName: String) {
      cdkBuilder.gameServerContainerGroupDefinitionName(gameServerContainerGroupDefinitionName)
    }

    /**
     * The number of times to replicate the game server container group on each fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupsperinstance)
     * @param gameServerContainerGroupsPerInstance The number of times to replicate the game server
     * container group on each fleet instance. 
     */
    override
        fun gameServerContainerGroupsPerInstance(gameServerContainerGroupsPerInstance: Number) {
      cdkBuilder.gameServerContainerGroupsPerInstance(gameServerContainerGroupsPerInstance)
    }

    /**
     * A policy that limits the number of game sessions that each individual player can create on
     * instances in this fleet.
     *
     * The limit applies for a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet. 
     */
    override fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: IResolvable) {
      cdkBuilder.gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * A policy that limits the number of game sessions that each individual player can create on
     * instances in this fleet.
     *
     * The limit applies for a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet. 
     */
    override
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: GameSessionCreationLimitPolicyProperty) {
      cdkBuilder.gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy.let(GameSessionCreationLimitPolicyProperty.Companion::unwrap))
    }

    /**
     * A policy that limits the number of game sessions that each individual player can create on
     * instances in this fleet.
     *
     * The limit applies for a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("441ae96682cddb58b31c339e18e7e5f4f93406ab3e2342ac48ee30f2992dfe50")
    override
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: GameSessionCreationLimitPolicyProperty.Builder.() -> Unit):
        Unit =
        gameSessionCreationLimitPolicy(GameSessionCreationLimitPolicyProperty(gameSessionCreationLimitPolicy))

    /**
     * The set of port numbers to open on each instance in a container fleet.
     *
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet. 
     */
    override fun instanceConnectionPortRange(instanceConnectionPortRange: IResolvable) {
      cdkBuilder.instanceConnectionPortRange(instanceConnectionPortRange.let(IResolvable.Companion::unwrap))
    }

    /**
     * The set of port numbers to open on each instance in a container fleet.
     *
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet. 
     */
    override
        fun instanceConnectionPortRange(instanceConnectionPortRange: ConnectionPortRangeProperty) {
      cdkBuilder.instanceConnectionPortRange(instanceConnectionPortRange.let(ConnectionPortRangeProperty.Companion::unwrap))
    }

    /**
     * The set of port numbers to open on each instance in a container fleet.
     *
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd0a056833e79d7d8dc7717eed61517f3eb8a0f905f93b944cf13e1ca0f78512")
    override
        fun instanceConnectionPortRange(instanceConnectionPortRange: ConnectionPortRangeProperty.Builder.() -> Unit):
        Unit = instanceConnectionPortRange(ConnectionPortRangeProperty(instanceConnectionPortRange))

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    override fun instanceInboundPermissions(instanceInboundPermissions: IResolvable) {
      cdkBuilder.instanceInboundPermissions(instanceInboundPermissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    override fun instanceInboundPermissions(instanceInboundPermissions: List<Any>) {
      cdkBuilder.instanceInboundPermissions(instanceInboundPermissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    override fun instanceInboundPermissions(vararg instanceInboundPermissions: Any): Unit =
        instanceInboundPermissions(instanceInboundPermissions.toList())

    /**
     * The Amazon EC2 instance type to use for all instances in the fleet.
     *
     * Instance type determines the computing resources and processing power that's available to
     * host your game servers. This includes including CPU, memory, storage, and networking capacity.
     * You can't update this fleet property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instancetype)
     * @param instanceType The Amazon EC2 instance type to use for all instances in the fleet. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
     * @param locations 
     */
    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
     * @param locations 
     */
    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
     * @param locations 
     */
    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    /**
     * The method that is used to collect container logs for the fleet.
     *
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-logconfiguration)
     * @param logConfiguration The method that is used to collect container logs for the fleet. 
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The method that is used to collect container logs for the fleet.
     *
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-logconfiguration)
     * @param logConfiguration The method that is used to collect container logs for the fleet. 
     */
    override fun logConfiguration(logConfiguration: LogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationProperty.Companion::unwrap))
    }

    /**
     * The method that is used to collect container logs for the fleet.
     *
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-logconfiguration)
     * @param logConfiguration The method that is used to collect container logs for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("05fd843a1f15f435384901b3a256337a7bf943e809a6590d5e08834ee7175f5e")
    override fun logConfiguration(logConfiguration: LogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(LogConfigurationProperty(logConfiguration))

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * Metric groups aggregate metrics for multiple fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-metricgroups)
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    override fun metricGroups(metricGroups: List<String>) {
      cdkBuilder.metricGroups(metricGroups)
    }

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * Metric groups aggregate metrics for multiple fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-metricgroups)
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    override fun metricGroups(vararg metricGroups: String): Unit =
        metricGroups(metricGroups.toList())

    /**
     * Determines whether Amazon GameLift Servers can shut down game sessions on the fleet that are
     * actively running and hosting players.
     *
     * Amazon GameLift Servers might prompt an instance shutdown when scaling down fleet capacity or
     * when retiring unhealthy instances. You can also set game session protection for individual game
     * sessions using
     * [UpdateGameSession](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSession.html)
     * .
     *
     * * *NoProtection* -- Game sessions can be shut down during active gameplay.
     * * *FullProtection* -- Game sessions in `ACTIVE` status can't be shut down.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-newgamesessionprotectionpolicy)
     * @param newGameSessionProtectionPolicy Determines whether Amazon GameLift Servers can shut
     * down game sessions on the fleet that are actively running and hosting players. 
     */
    override fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String) {
      cdkBuilder.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy)
    }

    /**
     * The name of the fleet's per-instance container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-perinstancecontainergroupdefinitionname)
     * @param perInstanceContainerGroupDefinitionName The name of the fleet's per-instance container
     * group definition. 
     */
    override
        fun perInstanceContainerGroupDefinitionName(perInstanceContainerGroupDefinitionName: String) {
      cdkBuilder.perInstanceContainerGroupDefinitionName(perInstanceContainerGroupDefinitionName)
    }

    /**
     * A list of rules that control how a fleet is scaled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
     * @param scalingPolicies A list of rules that control how a fleet is scaled. 
     */
    override fun scalingPolicies(scalingPolicies: IResolvable) {
      cdkBuilder.scalingPolicies(scalingPolicies.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of rules that control how a fleet is scaled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
     * @param scalingPolicies A list of rules that control how a fleet is scaled. 
     */
    override fun scalingPolicies(scalingPolicies: List<Any>) {
      cdkBuilder.scalingPolicies(scalingPolicies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of rules that control how a fleet is scaled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
     * @param scalingPolicies A list of rules that control how a fleet is scaled. 
     */
    override fun scalingPolicies(vararg scalingPolicies: Any): Unit =
        scalingPolicies(scalingPolicies.toList())

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnContainerFleet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnContainerFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContainerFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContainerFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet):
        CfnContainerFleet = CfnContainerFleet(cdkObject)

    internal fun unwrap(wrapped: CfnContainerFleet):
        software.amazon.awscdk.services.gamelift.CfnContainerFleet = wrapped.cdkObject as
        software.amazon.awscdk.services.gamelift.CfnContainerFleet
  }

  /**
   * The set of port numbers to open on each instance in a container fleet.
   *
   * Connection ports are used by inbound traffic to connect with processes that are running in
   * containers on the fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ConnectionPortRangeProperty connectionPortRangeProperty = ConnectionPortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-connectionportrange.html)
   */
  public interface ConnectionPortRangeProperty {
    /**
     * Starting value for the port range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-connectionportrange.html#cfn-gamelift-containerfleet-connectionportrange-fromport)
     */
    public fun fromPort(): Number

    /**
     * Ending value for the port.
     *
     * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-connectionportrange.html#cfn-gamelift-containerfleet-connectionportrange-toport)
     */
    public fun toPort(): Number

    /**
     * A builder for [ConnectionPortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort Starting value for the port range. 
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param toPort Ending value for the port. 
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ConnectionPortRangeProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ConnectionPortRangeProperty.builder()

      /**
       * @param fromPort Starting value for the port range. 
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param toPort Ending value for the port. 
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ConnectionPortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.ConnectionPortRangeProperty,
    ) : CdkObject(cdkObject),
        ConnectionPortRangeProperty {
      /**
       * Starting value for the port range.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-connectionportrange.html#cfn-gamelift-containerfleet-connectionportrange-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * Ending value for the port.
       *
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-connectionportrange.html#cfn-gamelift-containerfleet-connectionportrange-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionPortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.ConnectionPortRangeProperty):
          ConnectionPortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionPortRangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionPortRangeProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ConnectionPortRangeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ConnectionPortRangeProperty
    }
  }

  /**
   * Set of rules for processing a deployment for a container fleet update.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * DeploymentConfigurationProperty deploymentConfigurationProperty =
   * DeploymentConfigurationProperty.builder()
   * .impairmentStrategy("impairmentStrategy")
   * .minimumHealthyPercentage(123)
   * .protectionStrategy("protectionStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentconfiguration.html)
   */
  public interface DeploymentConfigurationProperty {
    /**
     * Determines what actions to take if a deployment fails.
     *
     * If the fleet is multi-location, this strategy applies across all fleet locations. With a
     * rollback strategy, updated fleet instances are rolled back to the last successful deployment.
     * Alternatively, you can maintain a few impaired containers for the purpose of debugging, while
     * all other tasks return to the last successful deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentconfiguration.html#cfn-gamelift-containerfleet-deploymentconfiguration-impairmentstrategy)
     */
    public fun impairmentStrategy(): String? = unwrap(this).getImpairmentStrategy()

    /**
     * Sets a minimum level of healthy tasks to maintain during deployment activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentconfiguration.html#cfn-gamelift-containerfleet-deploymentconfiguration-minimumhealthypercentage)
     */
    public fun minimumHealthyPercentage(): Number? = unwrap(this).getMinimumHealthyPercentage()

    /**
     * Determines how fleet deployment activity affects active game sessions on the fleet.
     *
     * With protection, a deployment honors game session protection, and delays actions that would
     * interrupt a protected active game session until the game session ends. Without protection,
     * deployment activity can shut down all running tasks, including active game sessions, regardless
     * of game session protection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentconfiguration.html#cfn-gamelift-containerfleet-deploymentconfiguration-protectionstrategy)
     */
    public fun protectionStrategy(): String? = unwrap(this).getProtectionStrategy()

    /**
     * A builder for [DeploymentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param impairmentStrategy Determines what actions to take if a deployment fails.
       * If the fleet is multi-location, this strategy applies across all fleet locations. With a
       * rollback strategy, updated fleet instances are rolled back to the last successful deployment.
       * Alternatively, you can maintain a few impaired containers for the purpose of debugging, while
       * all other tasks return to the last successful deployment.
       */
      public fun impairmentStrategy(impairmentStrategy: String)

      /**
       * @param minimumHealthyPercentage Sets a minimum level of healthy tasks to maintain during
       * deployment activity.
       */
      public fun minimumHealthyPercentage(minimumHealthyPercentage: Number)

      /**
       * @param protectionStrategy Determines how fleet deployment activity affects active game
       * sessions on the fleet.
       * With protection, a deployment honors game session protection, and delays actions that would
       * interrupt a protected active game session until the game session ends. Without protection,
       * deployment activity can shut down all running tasks, including active game sessions,
       * regardless of game session protection.
       */
      public fun protectionStrategy(protectionStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentConfigurationProperty.builder()

      /**
       * @param impairmentStrategy Determines what actions to take if a deployment fails.
       * If the fleet is multi-location, this strategy applies across all fleet locations. With a
       * rollback strategy, updated fleet instances are rolled back to the last successful deployment.
       * Alternatively, you can maintain a few impaired containers for the purpose of debugging, while
       * all other tasks return to the last successful deployment.
       */
      override fun impairmentStrategy(impairmentStrategy: String) {
        cdkBuilder.impairmentStrategy(impairmentStrategy)
      }

      /**
       * @param minimumHealthyPercentage Sets a minimum level of healthy tasks to maintain during
       * deployment activity.
       */
      override fun minimumHealthyPercentage(minimumHealthyPercentage: Number) {
        cdkBuilder.minimumHealthyPercentage(minimumHealthyPercentage)
      }

      /**
       * @param protectionStrategy Determines how fleet deployment activity affects active game
       * sessions on the fleet.
       * With protection, a deployment honors game session protection, and delays actions that would
       * interrupt a protected active game session until the game session ends. Without protection,
       * deployment activity can shut down all running tasks, including active game sessions,
       * regardless of game session protection.
       */
      override fun protectionStrategy(protectionStrategy: String) {
        cdkBuilder.protectionStrategy(protectionStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentConfigurationProperty,
    ) : CdkObject(cdkObject),
        DeploymentConfigurationProperty {
      /**
       * Determines what actions to take if a deployment fails.
       *
       * If the fleet is multi-location, this strategy applies across all fleet locations. With a
       * rollback strategy, updated fleet instances are rolled back to the last successful deployment.
       * Alternatively, you can maintain a few impaired containers for the purpose of debugging, while
       * all other tasks return to the last successful deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentconfiguration.html#cfn-gamelift-containerfleet-deploymentconfiguration-impairmentstrategy)
       */
      override fun impairmentStrategy(): String? = unwrap(this).getImpairmentStrategy()

      /**
       * Sets a minimum level of healthy tasks to maintain during deployment activity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentconfiguration.html#cfn-gamelift-containerfleet-deploymentconfiguration-minimumhealthypercentage)
       */
      override fun minimumHealthyPercentage(): Number? = unwrap(this).getMinimumHealthyPercentage()

      /**
       * Determines how fleet deployment activity affects active game sessions on the fleet.
       *
       * With protection, a deployment honors game session protection, and delays actions that would
       * interrupt a protected active game session until the game session ends. Without protection,
       * deployment activity can shut down all running tasks, including active game sessions,
       * regardless of game session protection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentconfiguration.html#cfn-gamelift-containerfleet-deploymentconfiguration-protectionstrategy)
       */
      override fun protectionStrategy(): String? = unwrap(this).getProtectionStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentConfigurationProperty):
          DeploymentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentConfigurationProperty
    }
  }

  /**
   * Information about the most recent deployment for the container fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * DeploymentDetailsProperty deploymentDetailsProperty = DeploymentDetailsProperty.builder()
   * .latestDeploymentId("latestDeploymentId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentdetails.html)
   */
  public interface DeploymentDetailsProperty {
    /**
     * A unique identifier for a fleet deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentdetails.html#cfn-gamelift-containerfleet-deploymentdetails-latestdeploymentid)
     */
    public fun latestDeploymentId(): String? = unwrap(this).getLatestDeploymentId()

    /**
     * A builder for [DeploymentDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param latestDeploymentId A unique identifier for a fleet deployment.
       */
      public fun latestDeploymentId(latestDeploymentId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentDetailsProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentDetailsProperty.builder()

      /**
       * @param latestDeploymentId A unique identifier for a fleet deployment.
       */
      override fun latestDeploymentId(latestDeploymentId: String) {
        cdkBuilder.latestDeploymentId(latestDeploymentId)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentDetailsProperty,
    ) : CdkObject(cdkObject),
        DeploymentDetailsProperty {
      /**
       * A unique identifier for a fleet deployment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-deploymentdetails.html#cfn-gamelift-containerfleet-deploymentdetails-latestdeploymentid)
       */
      override fun latestDeploymentId(): String? = unwrap(this).getLatestDeploymentId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentDetailsProperty):
          DeploymentDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeploymentDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentDetailsProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.DeploymentDetailsProperty
    }
  }

  /**
   * A policy that puts limits on the number of game sessions that a player can create within a
   * specified span of time.
   *
   * With this policy, you can control players' ability to consume available resources.
   *
   * The policy is evaluated when a player tries to create a new game session. On receiving a
   * `CreateGameSession` request, Amazon GameLift Servers checks that the player (identified by
   * `CreatorId` ) has created fewer than game session limit in the specified time period.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * GameSessionCreationLimitPolicyProperty gameSessionCreationLimitPolicyProperty =
   * GameSessionCreationLimitPolicyProperty.builder()
   * .newGameSessionsPerCreator(123)
   * .policyPeriodInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-gamesessioncreationlimitpolicy.html)
   */
  public interface GameSessionCreationLimitPolicyProperty {
    /**
     * A policy that puts limits on the number of game sessions that a player can create within a
     * specified span of time.
     *
     * With this policy, you can control players' ability to consume available resources.
     *
     * The policy evaluates when a player tries to create a new game session. On receiving a
     * `CreateGameSession` request, Amazon GameLift Servers checks that the player (identified by
     * `CreatorId` ) has created fewer than game session limit in the specified time period.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-gamesessioncreationlimitpolicy.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy-newgamesessionspercreator)
     */
    public fun newGameSessionsPerCreator(): Number? = unwrap(this).getNewGameSessionsPerCreator()

    /**
     * The time span used in evaluating the resource creation limit policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-gamesessioncreationlimitpolicy.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy-policyperiodinminutes)
     */
    public fun policyPeriodInMinutes(): Number? = unwrap(this).getPolicyPeriodInMinutes()

    /**
     * A builder for [GameSessionCreationLimitPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param newGameSessionsPerCreator A policy that puts limits on the number of game sessions
       * that a player can create within a specified span of time.
       * With this policy, you can control players' ability to consume available resources.
       *
       * The policy evaluates when a player tries to create a new game session. On receiving a
       * `CreateGameSession` request, Amazon GameLift Servers checks that the player (identified by
       * `CreatorId` ) has created fewer than game session limit in the specified time period.
       */
      public fun newGameSessionsPerCreator(newGameSessionsPerCreator: Number)

      /**
       * @param policyPeriodInMinutes The time span used in evaluating the resource creation limit
       * policy.
       */
      public fun policyPeriodInMinutes(policyPeriodInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.GameSessionCreationLimitPolicyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.GameSessionCreationLimitPolicyProperty.builder()

      /**
       * @param newGameSessionsPerCreator A policy that puts limits on the number of game sessions
       * that a player can create within a specified span of time.
       * With this policy, you can control players' ability to consume available resources.
       *
       * The policy evaluates when a player tries to create a new game session. On receiving a
       * `CreateGameSession` request, Amazon GameLift Servers checks that the player (identified by
       * `CreatorId` ) has created fewer than game session limit in the specified time period.
       */
      override fun newGameSessionsPerCreator(newGameSessionsPerCreator: Number) {
        cdkBuilder.newGameSessionsPerCreator(newGameSessionsPerCreator)
      }

      /**
       * @param policyPeriodInMinutes The time span used in evaluating the resource creation limit
       * policy.
       */
      override fun policyPeriodInMinutes(policyPeriodInMinutes: Number) {
        cdkBuilder.policyPeriodInMinutes(policyPeriodInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.GameSessionCreationLimitPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.GameSessionCreationLimitPolicyProperty,
    ) : CdkObject(cdkObject),
        GameSessionCreationLimitPolicyProperty {
      /**
       * A policy that puts limits on the number of game sessions that a player can create within a
       * specified span of time.
       *
       * With this policy, you can control players' ability to consume available resources.
       *
       * The policy evaluates when a player tries to create a new game session. On receiving a
       * `CreateGameSession` request, Amazon GameLift Servers checks that the player (identified by
       * `CreatorId` ) has created fewer than game session limit in the specified time period.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-gamesessioncreationlimitpolicy.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy-newgamesessionspercreator)
       */
      override fun newGameSessionsPerCreator(): Number? =
          unwrap(this).getNewGameSessionsPerCreator()

      /**
       * The time span used in evaluating the resource creation limit policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-gamesessioncreationlimitpolicy.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy-policyperiodinminutes)
       */
      override fun policyPeriodInMinutes(): Number? = unwrap(this).getPolicyPeriodInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GameSessionCreationLimitPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.GameSessionCreationLimitPolicyProperty):
          GameSessionCreationLimitPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GameSessionCreationLimitPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GameSessionCreationLimitPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.GameSessionCreationLimitPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.GameSessionCreationLimitPolicyProperty
    }
  }

  /**
   * A range of IP addresses and port settings that allow inbound traffic to connect to processes on
   * an instance in a fleet.
   *
   * Processes are assigned an IP address/port number combination, which must fall into the fleet's
   * allowed ranges.
   *
   * For Amazon GameLift Servers Realtime fleets, Amazon GameLift Servers automatically opens two
   * port ranges, one for TCP messaging and one for UDP.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * IpPermissionProperty ipPermissionProperty = IpPermissionProperty.builder()
   * .fromPort(123)
   * .ipRange("ipRange")
   * .protocol("protocol")
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html)
   */
  public interface IpPermissionProperty {
    /**
     * A starting value for a range of allowed port numbers.
     *
     * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
     *
     * For fleets using Windows builds, only ports `1026-60000` are valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-fromport)
     */
    public fun fromPort(): Number

    /**
     * A range of allowed IP addresses.
     *
     * This value must be expressed in CIDR notation. Example: " `000.000.000.000/[subnet mask]` "
     * or optionally the shortened version " `0.0.0.0/[subnet mask]` ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-iprange)
     */
    public fun ipRange(): String

    /**
     * The network communication protocol used by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-protocol)
     */
    public fun protocol(): String

    /**
     * An ending value for a range of allowed port numbers.
     *
     * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
     *
     * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
     *
     * For fleets using Windows builds, only ports `1026-60000` are valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-toport)
     */
    public fun toPort(): Number

    /**
     * A builder for [IpPermissionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort A starting value for a range of allowed port numbers. 
       * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
       *
       * For fleets using Windows builds, only ports `1026-60000` are valid.
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param ipRange A range of allowed IP addresses. 
       * This value must be expressed in CIDR notation. Example: " `000.000.000.000/[subnet mask]` "
       * or optionally the shortened version " `0.0.0.0/[subnet mask]` ".
       */
      public fun ipRange(ipRange: String)

      /**
       * @param protocol The network communication protocol used by the fleet. 
       */
      public fun protocol(protocol: String)

      /**
       * @param toPort An ending value for a range of allowed port numbers. 
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       *
       * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
       *
       * For fleets using Windows builds, only ports `1026-60000` are valid.
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.IpPermissionProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.IpPermissionProperty.builder()

      /**
       * @param fromPort A starting value for a range of allowed port numbers. 
       * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
       *
       * For fleets using Windows builds, only ports `1026-60000` are valid.
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param ipRange A range of allowed IP addresses. 
       * This value must be expressed in CIDR notation. Example: " `000.000.000.000/[subnet mask]` "
       * or optionally the shortened version " `0.0.0.0/[subnet mask]` ".
       */
      override fun ipRange(ipRange: String) {
        cdkBuilder.ipRange(ipRange)
      }

      /**
       * @param protocol The network communication protocol used by the fleet. 
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param toPort An ending value for a range of allowed port numbers. 
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       *
       * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
       *
       * For fleets using Windows builds, only ports `1026-60000` are valid.
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.IpPermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.IpPermissionProperty,
    ) : CdkObject(cdkObject),
        IpPermissionProperty {
      /**
       * A starting value for a range of allowed port numbers.
       *
       * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
       *
       * For fleets using Windows builds, only ports `1026-60000` are valid.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * A range of allowed IP addresses.
       *
       * This value must be expressed in CIDR notation. Example: " `000.000.000.000/[subnet mask]` "
       * or optionally the shortened version " `0.0.0.0/[subnet mask]` ".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-iprange)
       */
      override fun ipRange(): String = unwrap(this).getIpRange()

      /**
       * The network communication protocol used by the fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * An ending value for a range of allowed port numbers.
       *
       * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
       *
       * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
       *
       * For fleets using Windows builds, only ports `1026-60000` are valid.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-ippermission.html#cfn-gamelift-containerfleet-ippermission-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpPermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.IpPermissionProperty):
          IpPermissionProperty = CdkObjectWrappers.wrap(cdkObject) as? IpPermissionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpPermissionProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.IpPermissionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.IpPermissionProperty
    }
  }

  /**
   * Current resource capacity settings in a specified fleet or location.
   *
   * The location value might refer to a fleet's remote location or its home Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * LocationCapacityProperty locationCapacityProperty = LocationCapacityProperty.builder()
   * .desiredEc2Instances(123)
   * .maxSize(123)
   * .minSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationcapacity.html)
   */
  public interface LocationCapacityProperty {
    /**
     * The number of EC2 instances you want to maintain in the specified fleet location.
     *
     * This value must fall between the minimum and maximum size limits. If any auto-scaling policy
     * is defined for the container fleet, the desired instance will only be applied once during fleet
     * creation and will be ignored in updates to avoid conflicts with auto-scaling. During updates
     * with any auto-scaling policy defined, if current desired instance is lower than the new MinSize,
     * it will be increased to the new MinSize; if current desired instance is larger than the new
     * MaxSize, it will be decreased to the new MaxSize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationcapacity.html#cfn-gamelift-containerfleet-locationcapacity-desiredec2instances)
     */
    public fun desiredEc2Instances(): Number

    /**
     * The maximum value that is allowed for the fleet's instance count for a location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationcapacity.html#cfn-gamelift-containerfleet-locationcapacity-maxsize)
     */
    public fun maxSize(): Number

    /**
     * The minimum value allowed for the fleet's instance count for a location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationcapacity.html#cfn-gamelift-containerfleet-locationcapacity-minsize)
     */
    public fun minSize(): Number

    /**
     * A builder for [LocationCapacityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredEc2Instances The number of EC2 instances you want to maintain in the
       * specified fleet location. 
       * This value must fall between the minimum and maximum size limits. If any auto-scaling
       * policy is defined for the container fleet, the desired instance will only be applied once
       * during fleet creation and will be ignored in updates to avoid conflicts with auto-scaling.
       * During updates with any auto-scaling policy defined, if current desired instance is lower than
       * the new MinSize, it will be increased to the new MinSize; if current desired instance is
       * larger than the new MaxSize, it will be decreased to the new MaxSize.
       */
      public fun desiredEc2Instances(desiredEc2Instances: Number)

      /**
       * @param maxSize The maximum value that is allowed for the fleet's instance count for a
       * location. 
       */
      public fun maxSize(maxSize: Number)

      /**
       * @param minSize The minimum value allowed for the fleet's instance count for a location. 
       */
      public fun minSize(minSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationCapacityProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationCapacityProperty.builder()

      /**
       * @param desiredEc2Instances The number of EC2 instances you want to maintain in the
       * specified fleet location. 
       * This value must fall between the minimum and maximum size limits. If any auto-scaling
       * policy is defined for the container fleet, the desired instance will only be applied once
       * during fleet creation and will be ignored in updates to avoid conflicts with auto-scaling.
       * During updates with any auto-scaling policy defined, if current desired instance is lower than
       * the new MinSize, it will be increased to the new MinSize; if current desired instance is
       * larger than the new MaxSize, it will be decreased to the new MaxSize.
       */
      override fun desiredEc2Instances(desiredEc2Instances: Number) {
        cdkBuilder.desiredEc2Instances(desiredEc2Instances)
      }

      /**
       * @param maxSize The maximum value that is allowed for the fleet's instance count for a
       * location. 
       */
      override fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
      }

      /**
       * @param minSize The minimum value allowed for the fleet's instance count for a location. 
       */
      override fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationCapacityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationCapacityProperty,
    ) : CdkObject(cdkObject),
        LocationCapacityProperty {
      /**
       * The number of EC2 instances you want to maintain in the specified fleet location.
       *
       * This value must fall between the minimum and maximum size limits. If any auto-scaling
       * policy is defined for the container fleet, the desired instance will only be applied once
       * during fleet creation and will be ignored in updates to avoid conflicts with auto-scaling.
       * During updates with any auto-scaling policy defined, if current desired instance is lower than
       * the new MinSize, it will be increased to the new MinSize; if current desired instance is
       * larger than the new MaxSize, it will be decreased to the new MaxSize.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationcapacity.html#cfn-gamelift-containerfleet-locationcapacity-desiredec2instances)
       */
      override fun desiredEc2Instances(): Number = unwrap(this).getDesiredEc2Instances()

      /**
       * The maximum value that is allowed for the fleet's instance count for a location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationcapacity.html#cfn-gamelift-containerfleet-locationcapacity-maxsize)
       */
      override fun maxSize(): Number = unwrap(this).getMaxSize()

      /**
       * The minimum value allowed for the fleet's instance count for a location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationcapacity.html#cfn-gamelift-containerfleet-locationcapacity-minsize)
       */
      override fun minSize(): Number = unwrap(this).getMinSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationCapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationCapacityProperty):
          LocationCapacityProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationCapacityProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationCapacityProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationCapacityProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationCapacityProperty
    }
  }

  /**
   * A remote location where a multi-location fleet can deploy game servers for game hosting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * LocationConfigurationProperty locationConfigurationProperty =
   * LocationConfigurationProperty.builder()
   * .location("location")
   * // the properties below are optional
   * .locationCapacity(LocationCapacityProperty.builder()
   * .desiredEc2Instances(123)
   * .maxSize(123)
   * .minSize(123)
   * .build())
   * .stoppedActions(List.of("stoppedActions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationconfiguration.html)
   */
  public interface LocationConfigurationProperty {
    /**
     * An AWS Region code, such as `us-west-2` .
     *
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationconfiguration.html#cfn-gamelift-containerfleet-locationconfiguration-location)
     */
    public fun location(): String

    /**
     * Current resource capacity settings in a specified fleet or location.
     *
     * The location value might refer to a fleet's remote location or its home Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationconfiguration.html#cfn-gamelift-containerfleet-locationconfiguration-locationcapacity)
     */
    public fun locationCapacity(): Any? = unwrap(this).getLocationCapacity()

    /**
     * A list of fleet actions that have been suspended in the fleet location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationconfiguration.html#cfn-gamelift-containerfleet-locationconfiguration-stoppedactions)
     */
    public fun stoppedActions(): List<String> = unwrap(this).getStoppedActions() ?: emptyList()

    /**
     * A builder for [LocationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param location An AWS Region code, such as `us-west-2` . 
       * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
       * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html)
       * for managed hosting.
       */
      public fun location(location: String)

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
       * The location value might refer to a fleet's remote location or its home Region.
       */
      public fun locationCapacity(locationCapacity: IResolvable)

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
       * The location value might refer to a fleet's remote location or its home Region.
       */
      public fun locationCapacity(locationCapacity: LocationCapacityProperty)

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
       * The location value might refer to a fleet's remote location or its home Region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8698db2e490682e37e5b78781d28be28fd177b4f84a62d312d34a163d6cca991")
      public fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit)

      /**
       * @param stoppedActions A list of fleet actions that have been suspended in the fleet
       * location.
       */
      public fun stoppedActions(stoppedActions: List<String>)

      /**
       * @param stoppedActions A list of fleet actions that have been suspended in the fleet
       * location.
       */
      public fun stoppedActions(vararg stoppedActions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationConfigurationProperty.builder()

      /**
       * @param location An AWS Region code, such as `us-west-2` . 
       * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
       * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html)
       * for managed hosting.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
       * The location value might refer to a fleet's remote location or its home Region.
       */
      override fun locationCapacity(locationCapacity: IResolvable) {
        cdkBuilder.locationCapacity(locationCapacity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
       * The location value might refer to a fleet's remote location or its home Region.
       */
      override fun locationCapacity(locationCapacity: LocationCapacityProperty) {
        cdkBuilder.locationCapacity(locationCapacity.let(LocationCapacityProperty.Companion::unwrap))
      }

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
       * The location value might refer to a fleet's remote location or its home Region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8698db2e490682e37e5b78781d28be28fd177b4f84a62d312d34a163d6cca991")
      override fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit):
          Unit = locationCapacity(LocationCapacityProperty(locationCapacity))

      /**
       * @param stoppedActions A list of fleet actions that have been suspended in the fleet
       * location.
       */
      override fun stoppedActions(stoppedActions: List<String>) {
        cdkBuilder.stoppedActions(stoppedActions)
      }

      /**
       * @param stoppedActions A list of fleet actions that have been suspended in the fleet
       * location.
       */
      override fun stoppedActions(vararg stoppedActions: String): Unit =
          stoppedActions(stoppedActions.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationConfigurationProperty,
    ) : CdkObject(cdkObject),
        LocationConfigurationProperty {
      /**
       * An AWS Region code, such as `us-west-2` .
       *
       * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
       * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html)
       * for managed hosting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationconfiguration.html#cfn-gamelift-containerfleet-locationconfiguration-location)
       */
      override fun location(): String = unwrap(this).getLocation()

      /**
       * Current resource capacity settings in a specified fleet or location.
       *
       * The location value might refer to a fleet's remote location or its home Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationconfiguration.html#cfn-gamelift-containerfleet-locationconfiguration-locationcapacity)
       */
      override fun locationCapacity(): Any? = unwrap(this).getLocationCapacity()

      /**
       * A list of fleet actions that have been suspended in the fleet location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-locationconfiguration.html#cfn-gamelift-containerfleet-locationconfiguration-stoppedactions)
       */
      override fun stoppedActions(): List<String> = unwrap(this).getStoppedActions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationConfigurationProperty):
          LocationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LocationConfigurationProperty
    }
  }

  /**
   * A method for collecting container logs for the fleet.
   *
   * Amazon GameLift Servers saves all standard output for each container in logs, including game
   * session logs. You can select from the following methods:
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
   * .logDestination("logDestination")
   * .logGroupArn("logGroupArn")
   * .s3BucketName("s3BucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-logconfiguration.html)
   */
  public interface LogConfigurationProperty {
    /**
     * The type of log collection to use for a fleet.
     *
     * * `CLOUDWATCH` -- (default value) Send logs to an Amazon CloudWatch log group that you
     * define. Each container emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define. This bucket must reside in the
     * fleet's home AWS Region.
     * * `NONE` -- Don't collect container logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-logconfiguration.html#cfn-gamelift-containerfleet-logconfiguration-logdestination)
     */
    public fun logDestination(): String? = unwrap(this).getLogDestination()

    /**
     * If log destination is `CLOUDWATCH` , logs are sent to the specified log group in Amazon
     * CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-logconfiguration.html#cfn-gamelift-containerfleet-logconfiguration-loggrouparn)
     */
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    /**
     * If log destination is `S3` , logs are sent to the specified Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-logconfiguration.html#cfn-gamelift-containerfleet-logconfiguration-s3bucketname)
     */
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    /**
     * A builder for [LogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logDestination The type of log collection to use for a fleet.
       * * `CLOUDWATCH` -- (default value) Send logs to an Amazon CloudWatch log group that you
       * define. Each container emits a log stream, which is organized in the log group.
       * * `S3` -- Store logs in an Amazon S3 bucket that you define. This bucket must reside in the
       * fleet's home AWS Region.
       * * `NONE` -- Don't collect container logs.
       */
      public fun logDestination(logDestination: String)

      /**
       * @param logGroupArn If log destination is `CLOUDWATCH` , logs are sent to the specified log
       * group in Amazon CloudWatch.
       */
      public fun logGroupArn(logGroupArn: String)

      /**
       * @param s3BucketName If log destination is `S3` , logs are sent to the specified Amazon S3
       * bucket name.
       */
      public fun s3BucketName(s3BucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LogConfigurationProperty.builder()

      /**
       * @param logDestination The type of log collection to use for a fleet.
       * * `CLOUDWATCH` -- (default value) Send logs to an Amazon CloudWatch log group that you
       * define. Each container emits a log stream, which is organized in the log group.
       * * `S3` -- Store logs in an Amazon S3 bucket that you define. This bucket must reside in the
       * fleet's home AWS Region.
       * * `NONE` -- Don't collect container logs.
       */
      override fun logDestination(logDestination: String) {
        cdkBuilder.logDestination(logDestination)
      }

      /**
       * @param logGroupArn If log destination is `CLOUDWATCH` , logs are sent to the specified log
       * group in Amazon CloudWatch.
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      /**
       * @param s3BucketName If log destination is `S3` , logs are sent to the specified Amazon S3
       * bucket name.
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.LogConfigurationProperty,
    ) : CdkObject(cdkObject),
        LogConfigurationProperty {
      /**
       * The type of log collection to use for a fleet.
       *
       * * `CLOUDWATCH` -- (default value) Send logs to an Amazon CloudWatch log group that you
       * define. Each container emits a log stream, which is organized in the log group.
       * * `S3` -- Store logs in an Amazon S3 bucket that you define. This bucket must reside in the
       * fleet's home AWS Region.
       * * `NONE` -- Don't collect container logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-logconfiguration.html#cfn-gamelift-containerfleet-logconfiguration-logdestination)
       */
      override fun logDestination(): String? = unwrap(this).getLogDestination()

      /**
       * If log destination is `CLOUDWATCH` , logs are sent to the specified log group in Amazon
       * CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-logconfiguration.html#cfn-gamelift-containerfleet-logconfiguration-loggrouparn)
       */
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

      /**
       * If log destination is `S3` , logs are sent to the specified Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-logconfiguration.html#cfn-gamelift-containerfleet-logconfiguration-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.LogConfigurationProperty):
          LogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? LogConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LogConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.LogConfigurationProperty
    }
  }

  /**
   * Rule that controls how a fleet is scaled.
   *
   * Scaling policies are uniquely identified by the combination of name and fleet ID.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ScalingPolicyProperty scalingPolicyProperty = ScalingPolicyProperty.builder()
   * .metricName("metricName")
   * .name("name")
   * // the properties below are optional
   * .comparisonOperator("comparisonOperator")
   * .evaluationPeriods(123)
   * .policyType("policyType")
   * .scalingAdjustment(123)
   * .scalingAdjustmentType("scalingAdjustmentType")
   * .targetConfiguration(TargetConfigurationProperty.builder()
   * .targetValue(123)
   * .build())
   * .threshold(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html)
   */
  public interface ScalingPolicyProperty {
    /**
     * Comparison operator to use when measuring a metric against the threshold value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-comparisonoperator)
     */
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    /**
     * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling
     * event is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-evaluationperiods)
     */
    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    /**
     * Name of the Amazon GameLift Servers-defined metric that is used to trigger a scaling
     * adjustment.
     *
     * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift Servers with Amazon
     * CloudWatch](https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html)
     * .
     *
     * * *ActivatingGameSessions* -- Game sessions in the process of being created.
     * * *ActiveGameSessions* -- Game sessions that are currently running.
     * * *ActiveInstances* -- Fleet instances that are currently running at least one game session.
     * * *AvailableGameSessions* -- Additional game sessions that fleet could host simultaneously,
     * given current capacity.
     * * *AvailablePlayerSessions* -- Empty player slots in currently active game sessions. This
     * includes game sessions that are not currently accepting players. Reserved player slots are not
     * included.
     * * *CurrentPlayerSessions* -- Player slots in active game sessions that are being used by a
     * player or are reserved for a player.
     * * *IdleInstances* -- Active instances that are currently hosting zero game sessions.
     * * *PercentAvailableGameSessions* -- Unused percentage of the total number of game sessions
     * that a fleet could host simultaneously, given current capacity. Use this metric for a
     * target-based scaling policy.
     * * *PercentIdleInstances* -- Percentage of the total number of active instances that are
     * hosting zero game sessions.
     * * *QueueDepth* -- Pending game session placement requests, in any queue, where the current
     * fleet is the top-priority destination.
     * * *WaitTime* -- Current wait time for pending game session placement requests, in any queue,
     * where the current fleet is the top-priority destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-metricname)
     */
    public fun metricName(): String

    /**
     * A descriptive label that is associated with a fleet's scaling policy.
     *
     * Policy names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-name)
     */
    public fun name(): String

    /**
     * The type of scaling policy to create.
     *
     * For a target-based policy, set the parameter *MetricName* to 'PercentAvailableGameSessions'
     * and specify a *TargetConfiguration* . For a rule-based policy set the following parameters:
     * *MetricName* , *ComparisonOperator* , *Threshold* , *EvaluationPeriods* ,
     * *ScalingAdjustmentType* , and *ScalingAdjustment* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-policytype)
     */
    public fun policyType(): String? = unwrap(this).getPolicyType()

    /**
     * Amount of adjustment to make, based on the scaling adjustment type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-scalingadjustment)
     */
    public fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

    /**
     * The type of adjustment to make to a fleet's instance count.
     *
     * * *ChangeInCapacity* -- add (or subtract) the scaling adjustment value from the current
     * instance count. Positive values scale up while negative values scale down.
     * * *ExactCapacity* -- set the instance count to the scaling adjustment value.
     * * *PercentChangeInCapacity* -- increase or reduce the current instance count by the scaling
     * adjustment, read as a percentage. Positive values scale up while negative values scale down.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-scalingadjustmenttype)
     */
    public fun scalingAdjustmentType(): String? = unwrap(this).getScalingAdjustmentType()

    /**
     * An object that contains settings for a target-based scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-targetconfiguration)
     */
    public fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

    /**
     * Metric value used to trigger a scaling event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-threshold)
     */
    public fun threshold(): Number? = unwrap(this).getThreshold()

    /**
     * A builder for [ScalingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator Comparison operator to use when measuring a metric against the
       * threshold value.
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param evaluationPeriods Length of time (in minutes) the metric must be at or beyond the
       * threshold before a scaling event is triggered.
       */
      public fun evaluationPeriods(evaluationPeriods: Number)

      /**
       * @param metricName Name of the Amazon GameLift Servers-defined metric that is used to
       * trigger a scaling adjustment. 
       * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift Servers with
       * Amazon
       * CloudWatch](https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html)
       * .
       *
       * * *ActivatingGameSessions* -- Game sessions in the process of being created.
       * * *ActiveGameSessions* -- Game sessions that are currently running.
       * * *ActiveInstances* -- Fleet instances that are currently running at least one game
       * session.
       * * *AvailableGameSessions* -- Additional game sessions that fleet could host simultaneously,
       * given current capacity.
       * * *AvailablePlayerSessions* -- Empty player slots in currently active game sessions. This
       * includes game sessions that are not currently accepting players. Reserved player slots are not
       * included.
       * * *CurrentPlayerSessions* -- Player slots in active game sessions that are being used by a
       * player or are reserved for a player.
       * * *IdleInstances* -- Active instances that are currently hosting zero game sessions.
       * * *PercentAvailableGameSessions* -- Unused percentage of the total number of game sessions
       * that a fleet could host simultaneously, given current capacity. Use this metric for a
       * target-based scaling policy.
       * * *PercentIdleInstances* -- Percentage of the total number of active instances that are
       * hosting zero game sessions.
       * * *QueueDepth* -- Pending game session placement requests, in any queue, where the current
       * fleet is the top-priority destination.
       * * *WaitTime* -- Current wait time for pending game session placement requests, in any
       * queue, where the current fleet is the top-priority destination.
       */
      public fun metricName(metricName: String)

      /**
       * @param name A descriptive label that is associated with a fleet's scaling policy. 
       * Policy names do not need to be unique.
       */
      public fun name(name: String)

      /**
       * @param policyType The type of scaling policy to create.
       * For a target-based policy, set the parameter *MetricName* to 'PercentAvailableGameSessions'
       * and specify a *TargetConfiguration* . For a rule-based policy set the following parameters:
       * *MetricName* , *ComparisonOperator* , *Threshold* , *EvaluationPeriods* ,
       * *ScalingAdjustmentType* , and *ScalingAdjustment* .
       */
      public fun policyType(policyType: String)

      /**
       * @param scalingAdjustment Amount of adjustment to make, based on the scaling adjustment
       * type.
       */
      public fun scalingAdjustment(scalingAdjustment: Number)

      /**
       * @param scalingAdjustmentType The type of adjustment to make to a fleet's instance count.
       * * *ChangeInCapacity* -- add (or subtract) the scaling adjustment value from the current
       * instance count. Positive values scale up while negative values scale down.
       * * *ExactCapacity* -- set the instance count to the scaling adjustment value.
       * * *PercentChangeInCapacity* -- increase or reduce the current instance count by the scaling
       * adjustment, read as a percentage. Positive values scale up while negative values scale down.
       */
      public fun scalingAdjustmentType(scalingAdjustmentType: String)

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      public fun targetConfiguration(targetConfiguration: IResolvable)

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      public fun targetConfiguration(targetConfiguration: TargetConfigurationProperty)

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0aaa99eeea6fd3a204ebcd35a819d48205c81f596e9f249379e0ddf5b50235f")
      public
          fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit)

      /**
       * @param threshold Metric value used to trigger a scaling event.
       */
      public fun threshold(threshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ScalingPolicyProperty.builder()

      /**
       * @param comparisonOperator Comparison operator to use when measuring a metric against the
       * threshold value.
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param evaluationPeriods Length of time (in minutes) the metric must be at or beyond the
       * threshold before a scaling event is triggered.
       */
      override fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
      }

      /**
       * @param metricName Name of the Amazon GameLift Servers-defined metric that is used to
       * trigger a scaling adjustment. 
       * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift Servers with
       * Amazon
       * CloudWatch](https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html)
       * .
       *
       * * *ActivatingGameSessions* -- Game sessions in the process of being created.
       * * *ActiveGameSessions* -- Game sessions that are currently running.
       * * *ActiveInstances* -- Fleet instances that are currently running at least one game
       * session.
       * * *AvailableGameSessions* -- Additional game sessions that fleet could host simultaneously,
       * given current capacity.
       * * *AvailablePlayerSessions* -- Empty player slots in currently active game sessions. This
       * includes game sessions that are not currently accepting players. Reserved player slots are not
       * included.
       * * *CurrentPlayerSessions* -- Player slots in active game sessions that are being used by a
       * player or are reserved for a player.
       * * *IdleInstances* -- Active instances that are currently hosting zero game sessions.
       * * *PercentAvailableGameSessions* -- Unused percentage of the total number of game sessions
       * that a fleet could host simultaneously, given current capacity. Use this metric for a
       * target-based scaling policy.
       * * *PercentIdleInstances* -- Percentage of the total number of active instances that are
       * hosting zero game sessions.
       * * *QueueDepth* -- Pending game session placement requests, in any queue, where the current
       * fleet is the top-priority destination.
       * * *WaitTime* -- Current wait time for pending game session placement requests, in any
       * queue, where the current fleet is the top-priority destination.
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param name A descriptive label that is associated with a fleet's scaling policy. 
       * Policy names do not need to be unique.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param policyType The type of scaling policy to create.
       * For a target-based policy, set the parameter *MetricName* to 'PercentAvailableGameSessions'
       * and specify a *TargetConfiguration* . For a rule-based policy set the following parameters:
       * *MetricName* , *ComparisonOperator* , *Threshold* , *EvaluationPeriods* ,
       * *ScalingAdjustmentType* , and *ScalingAdjustment* .
       */
      override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      /**
       * @param scalingAdjustment Amount of adjustment to make, based on the scaling adjustment
       * type.
       */
      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      /**
       * @param scalingAdjustmentType The type of adjustment to make to a fleet's instance count.
       * * *ChangeInCapacity* -- add (or subtract) the scaling adjustment value from the current
       * instance count. Positive values scale up while negative values scale down.
       * * *ExactCapacity* -- set the instance count to the scaling adjustment value.
       * * *PercentChangeInCapacity* -- increase or reduce the current instance count by the scaling
       * adjustment, read as a percentage. Positive values scale up while negative values scale down.
       */
      override fun scalingAdjustmentType(scalingAdjustmentType: String) {
        cdkBuilder.scalingAdjustmentType(scalingAdjustmentType)
      }

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      override fun targetConfiguration(targetConfiguration: IResolvable) {
        cdkBuilder.targetConfiguration(targetConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      override fun targetConfiguration(targetConfiguration: TargetConfigurationProperty) {
        cdkBuilder.targetConfiguration(targetConfiguration.let(TargetConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0aaa99eeea6fd3a204ebcd35a819d48205c81f596e9f249379e0ddf5b50235f")
      override
          fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit):
          Unit = targetConfiguration(TargetConfigurationProperty(targetConfiguration))

      /**
       * @param threshold Metric value used to trigger a scaling event.
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.ScalingPolicyProperty,
    ) : CdkObject(cdkObject),
        ScalingPolicyProperty {
      /**
       * Comparison operator to use when measuring a metric against the threshold value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-comparisonoperator)
       */
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      /**
       * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling
       * event is triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-evaluationperiods)
       */
      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      /**
       * Name of the Amazon GameLift Servers-defined metric that is used to trigger a scaling
       * adjustment.
       *
       * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift Servers with
       * Amazon
       * CloudWatch](https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html)
       * .
       *
       * * *ActivatingGameSessions* -- Game sessions in the process of being created.
       * * *ActiveGameSessions* -- Game sessions that are currently running.
       * * *ActiveInstances* -- Fleet instances that are currently running at least one game
       * session.
       * * *AvailableGameSessions* -- Additional game sessions that fleet could host simultaneously,
       * given current capacity.
       * * *AvailablePlayerSessions* -- Empty player slots in currently active game sessions. This
       * includes game sessions that are not currently accepting players. Reserved player slots are not
       * included.
       * * *CurrentPlayerSessions* -- Player slots in active game sessions that are being used by a
       * player or are reserved for a player.
       * * *IdleInstances* -- Active instances that are currently hosting zero game sessions.
       * * *PercentAvailableGameSessions* -- Unused percentage of the total number of game sessions
       * that a fleet could host simultaneously, given current capacity. Use this metric for a
       * target-based scaling policy.
       * * *PercentIdleInstances* -- Percentage of the total number of active instances that are
       * hosting zero game sessions.
       * * *QueueDepth* -- Pending game session placement requests, in any queue, where the current
       * fleet is the top-priority destination.
       * * *WaitTime* -- Current wait time for pending game session placement requests, in any
       * queue, where the current fleet is the top-priority destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * A descriptive label that is associated with a fleet's scaling policy.
       *
       * Policy names do not need to be unique.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of scaling policy to create.
       *
       * For a target-based policy, set the parameter *MetricName* to 'PercentAvailableGameSessions'
       * and specify a *TargetConfiguration* . For a rule-based policy set the following parameters:
       * *MetricName* , *ComparisonOperator* , *Threshold* , *EvaluationPeriods* ,
       * *ScalingAdjustmentType* , and *ScalingAdjustment* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-policytype)
       */
      override fun policyType(): String? = unwrap(this).getPolicyType()

      /**
       * Amount of adjustment to make, based on the scaling adjustment type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-scalingadjustment)
       */
      override fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

      /**
       * The type of adjustment to make to a fleet's instance count.
       *
       * * *ChangeInCapacity* -- add (or subtract) the scaling adjustment value from the current
       * instance count. Positive values scale up while negative values scale down.
       * * *ExactCapacity* -- set the instance count to the scaling adjustment value.
       * * *PercentChangeInCapacity* -- increase or reduce the current instance count by the scaling
       * adjustment, read as a percentage. Positive values scale up while negative values scale down.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-scalingadjustmenttype)
       */
      override fun scalingAdjustmentType(): String? = unwrap(this).getScalingAdjustmentType()

      /**
       * An object that contains settings for a target-based scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-targetconfiguration)
       */
      override fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

      /**
       * Metric value used to trigger a scaling event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-scalingpolicy.html#cfn-gamelift-containerfleet-scalingpolicy-threshold)
       */
      override fun threshold(): Number? = unwrap(this).getThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.ScalingPolicyProperty):
          ScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ScalingPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.ScalingPolicyProperty
    }
  }

  /**
   * Settings for a target-based scaling policy.
   *
   * A target-based policy tracks a particular fleet metric specifies a target value for the metric.
   * As player usage changes, the policy triggers Amazon GameLift Servers to adjust capacity so that
   * the metric returns to the target value. The target configuration specifies settings as needed for
   * the target based policy, including the target value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * TargetConfigurationProperty targetConfigurationProperty = TargetConfigurationProperty.builder()
   * .targetValue(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-targetconfiguration.html)
   */
  public interface TargetConfigurationProperty {
    /**
     * Desired value to use with a target-based scaling policy.
     *
     * The value must be relevant for whatever metric the scaling policy is using. For example, in a
     * policy using the metric PercentAvailableGameSessions, the target value should be the preferred
     * size of the fleet's buffer (the percent of capacity that should be idle and ready for new game
     * sessions).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-targetconfiguration.html#cfn-gamelift-containerfleet-targetconfiguration-targetvalue)
     */
    public fun targetValue(): Number

    /**
     * A builder for [TargetConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetValue Desired value to use with a target-based scaling policy. 
       * The value must be relevant for whatever metric the scaling policy is using. For example, in
       * a policy using the metric PercentAvailableGameSessions, the target value should be the
       * preferred size of the fleet's buffer (the percent of capacity that should be idle and ready
       * for new game sessions).
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.TargetConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.TargetConfigurationProperty.builder()

      /**
       * @param targetValue Desired value to use with a target-based scaling policy. 
       * The value must be relevant for whatever metric the scaling policy is using. For example, in
       * a policy using the metric PercentAvailableGameSessions, the target value should be the
       * preferred size of the fleet's buffer (the percent of capacity that should be idle and ready
       * for new game sessions).
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.TargetConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.TargetConfigurationProperty,
    ) : CdkObject(cdkObject),
        TargetConfigurationProperty {
      /**
       * Desired value to use with a target-based scaling policy.
       *
       * The value must be relevant for whatever metric the scaling policy is using. For example, in
       * a policy using the metric PercentAvailableGameSessions, the target value should be the
       * preferred size of the fleet's buffer (the percent of capacity that should be idle and ready
       * for new game sessions).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-containerfleet-targetconfiguration.html#cfn-gamelift-containerfleet-targetconfiguration-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleet.TargetConfigurationProperty):
          TargetConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.TargetConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnContainerFleet.TargetConfigurationProperty
    }
  }
}
