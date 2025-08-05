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
 * Properties for defining a `CfnContainerFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnContainerFleetProps cfnContainerFleetProps = CfnContainerFleetProps.builder()
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
public interface CfnContainerFleetProps {
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
   */
  public fun billingType(): String? = unwrap(this).getBillingType()

  /**
   * Set of rules for processing a deployment for a container fleet update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
   */
  public fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

  /**
   * A meaningful description of the container fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique identifier for an AWS Identity and Access Management (IAM) role with permissions to
   * run your containers on resources that are managed by Amazon GameLift Servers.
   *
   * See [Set up an IAM service
   * role](https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html) . This
   * fleet property can't be changed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-fleetrolearn)
   */
  public fun fleetRoleArn(): String

  /**
   * The name of the fleet's game server container group definition, which describes how to deploy
   * containers with your game server build and support software onto each fleet instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupdefinitionname)
   */
  public fun gameServerContainerGroupDefinitionName(): String? =
      unwrap(this).getGameServerContainerGroupDefinitionName()

  /**
   * The number of times to replicate the game server container group on each fleet instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupsperinstance)
   */
  public fun gameServerContainerGroupsPerInstance(): Number? =
      unwrap(this).getGameServerContainerGroupsPerInstance()

  /**
   * A policy that limits the number of game sessions that each individual player can create on
   * instances in this fleet.
   *
   * The limit applies for a specified span of time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
   */
  public fun gameSessionCreationLimitPolicy(): Any? =
      unwrap(this).getGameSessionCreationLimitPolicy()

  /**
   * The set of port numbers to open on each instance in a container fleet.
   *
   * Connection ports are used by inbound traffic to connect with processes that are running in
   * containers on the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
   */
  public fun instanceConnectionPortRange(): Any? = unwrap(this).getInstanceConnectionPortRange()

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
   */
  public fun instanceInboundPermissions(): Any? = unwrap(this).getInstanceInboundPermissions()

  /**
   * The Amazon EC2 instance type to use for all instances in the fleet.
   *
   * Instance type determines the computing resources and processing power that's available to host
   * your game servers. This includes including CPU, memory, storage, and networking capacity. You
   * can't update this fleet property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instancetype)
   */
  public fun instanceType(): String? = unwrap(this).getInstanceType()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
   */
  public fun locations(): Any? = unwrap(this).getLocations()

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
   */
  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The name of an AWS CloudWatch metric group to add this fleet to.
   *
   * Metric groups aggregate metrics for multiple fleets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-metricgroups)
   */
  public fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

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
   */
  public fun newGameSessionProtectionPolicy(): String? =
      unwrap(this).getNewGameSessionProtectionPolicy()

  /**
   * The name of the fleet's per-instance container group definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-perinstancecontainergroupdefinitionname)
   */
  public fun perInstanceContainerGroupDefinitionName(): String? =
      unwrap(this).getPerInstanceContainerGroupDefinitionName()

  /**
   * A list of rules that control how a fleet is scaled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
   */
  public fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnContainerFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param billingType Indicates whether the fleet uses On-Demand or Spot instances for this
     * fleet.
     * Learn more about when to use [On-Demand versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . You can't update this fleet property.
     *
     * By default, this property is set to `ON_DEMAND` .
     */
    public fun billingType(billingType: String)

    /**
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update.
     */
    public fun deploymentConfiguration(deploymentConfiguration: IResolvable)

    /**
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update.
     */
    public
        fun deploymentConfiguration(deploymentConfiguration: CfnContainerFleet.DeploymentConfigurationProperty)

    /**
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a0e08747b2337b5854ebf9446f15fb4f34d20a3a1e573024839ccd53bebbbee")
    public
        fun deploymentConfiguration(deploymentConfiguration: CfnContainerFleet.DeploymentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A meaningful description of the container fleet.
     */
    public fun description(description: String)

    /**
     * @param fleetRoleArn The unique identifier for an AWS Identity and Access Management (IAM)
     * role with permissions to run your containers on resources that are managed by Amazon GameLift
     * Servers. 
     * See [Set up an IAM service
     * role](https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html) . This
     * fleet property can't be changed.
     */
    public fun fleetRoleArn(fleetRoleArn: String)

    /**
     * @param gameServerContainerGroupDefinitionName The name of the fleet's game server container
     * group definition, which describes how to deploy containers with your game server build and
     * support software onto each fleet instance.
     */
    public
        fun gameServerContainerGroupDefinitionName(gameServerContainerGroupDefinitionName: String)

    /**
     * @param gameServerContainerGroupsPerInstance The number of times to replicate the game server
     * container group on each fleet instance.
     */
    public fun gameServerContainerGroupsPerInstance(gameServerContainerGroupsPerInstance: Number)

    /**
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet.
     * The limit applies for a specified span of time.
     */
    public fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: IResolvable)

    /**
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet.
     * The limit applies for a specified span of time.
     */
    public
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: CfnContainerFleet.GameSessionCreationLimitPolicyProperty)

    /**
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet.
     * The limit applies for a specified span of time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfed06669148cc31e7a8f92a66a9dbd0b620646021e28a2390fe6cba5376950a")
    public
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: CfnContainerFleet.GameSessionCreationLimitPolicyProperty.Builder.() -> Unit)

    /**
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet.
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     */
    public fun instanceConnectionPortRange(instanceConnectionPortRange: IResolvable)

    /**
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet.
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     */
    public
        fun instanceConnectionPortRange(instanceConnectionPortRange: CfnContainerFleet.ConnectionPortRangeProperty)

    /**
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet.
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40ec752a3dfbf5743e4a9f407bc63c116abb21782e26241c1664e9ee747ea2e7")
    public
        fun instanceConnectionPortRange(instanceConnectionPortRange: CfnContainerFleet.ConnectionPortRangeProperty.Builder.() -> Unit)

    /**
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet.
     */
    public fun instanceInboundPermissions(instanceInboundPermissions: IResolvable)

    /**
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet.
     */
    public fun instanceInboundPermissions(instanceInboundPermissions: List<Any>)

    /**
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet.
     */
    public fun instanceInboundPermissions(vararg instanceInboundPermissions: Any)

    /**
     * @param instanceType The Amazon EC2 instance type to use for all instances in the fleet.
     * Instance type determines the computing resources and processing power that's available to
     * host your game servers. This includes including CPU, memory, storage, and networking capacity.
     * You can't update this fleet property.
     */
    public fun instanceType(instanceType: String)

    /**
     * @param locations the value to be set.
     */
    public fun locations(locations: IResolvable)

    /**
     * @param locations the value to be set.
     */
    public fun locations(locations: List<Any>)

    /**
     * @param locations the value to be set.
     */
    public fun locations(vararg locations: Any)

    /**
     * @param logConfiguration The method that is used to collect container logs for the fleet.
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * @param logConfiguration The method that is used to collect container logs for the fleet.
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     */
    public fun logConfiguration(logConfiguration: CfnContainerFleet.LogConfigurationProperty)

    /**
     * @param logConfiguration The method that is used to collect container logs for the fleet.
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecbba654d040db6f6994f74c7f34a4b832065f486e641c4da188297ef4ec2227")
    public
        fun logConfiguration(logConfiguration: CfnContainerFleet.LogConfigurationProperty.Builder.() -> Unit)

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * Metric groups aggregate metrics for multiple fleets.
     */
    public fun metricGroups(metricGroups: List<String>)

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * Metric groups aggregate metrics for multiple fleets.
     */
    public fun metricGroups(vararg metricGroups: String)

    /**
     * @param newGameSessionProtectionPolicy Determines whether Amazon GameLift Servers can shut
     * down game sessions on the fleet that are actively running and hosting players.
     * Amazon GameLift Servers might prompt an instance shutdown when scaling down fleet capacity or
     * when retiring unhealthy instances. You can also set game session protection for individual game
     * sessions using
     * [UpdateGameSession](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSession.html)
     * .
     *
     * * *NoProtection* -- Game sessions can be shut down during active gameplay.
     * * *FullProtection* -- Game sessions in `ACTIVE` status can't be shut down.
     */
    public fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String)

    /**
     * @param perInstanceContainerGroupDefinitionName The name of the fleet's per-instance container
     * group definition.
     */
    public
        fun perInstanceContainerGroupDefinitionName(perInstanceContainerGroupDefinitionName: String)

    /**
     * @param scalingPolicies A list of rules that control how a fleet is scaled.
     */
    public fun scalingPolicies(scalingPolicies: IResolvable)

    /**
     * @param scalingPolicies A list of rules that control how a fleet is scaled.
     */
    public fun scalingPolicies(scalingPolicies: List<Any>)

    /**
     * @param scalingPolicies A list of rules that control how a fleet is scaled.
     */
    public fun scalingPolicies(vararg scalingPolicies: Any)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnContainerFleetProps.Builder
        = software.amazon.awscdk.services.gamelift.CfnContainerFleetProps.builder()

    /**
     * @param billingType Indicates whether the fleet uses On-Demand or Spot instances for this
     * fleet.
     * Learn more about when to use [On-Demand versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . You can't update this fleet property.
     *
     * By default, this property is set to `ON_DEMAND` .
     */
    override fun billingType(billingType: String) {
      cdkBuilder.billingType(billingType)
    }

    /**
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update.
     */
    override fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update.
     */
    override
        fun deploymentConfiguration(deploymentConfiguration: CfnContainerFleet.DeploymentConfigurationProperty) {
      cdkBuilder.deploymentConfiguration(deploymentConfiguration.let(CfnContainerFleet.DeploymentConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param deploymentConfiguration Set of rules for processing a deployment for a container fleet
     * update.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a0e08747b2337b5854ebf9446f15fb4f34d20a3a1e573024839ccd53bebbbee")
    override
        fun deploymentConfiguration(deploymentConfiguration: CfnContainerFleet.DeploymentConfigurationProperty.Builder.() -> Unit):
        Unit =
        deploymentConfiguration(CfnContainerFleet.DeploymentConfigurationProperty(deploymentConfiguration))

    /**
     * @param description A meaningful description of the container fleet.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fleetRoleArn The unique identifier for an AWS Identity and Access Management (IAM)
     * role with permissions to run your containers on resources that are managed by Amazon GameLift
     * Servers. 
     * See [Set up an IAM service
     * role](https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html) . This
     * fleet property can't be changed.
     */
    override fun fleetRoleArn(fleetRoleArn: String) {
      cdkBuilder.fleetRoleArn(fleetRoleArn)
    }

    /**
     * @param gameServerContainerGroupDefinitionName The name of the fleet's game server container
     * group definition, which describes how to deploy containers with your game server build and
     * support software onto each fleet instance.
     */
    override
        fun gameServerContainerGroupDefinitionName(gameServerContainerGroupDefinitionName: String) {
      cdkBuilder.gameServerContainerGroupDefinitionName(gameServerContainerGroupDefinitionName)
    }

    /**
     * @param gameServerContainerGroupsPerInstance The number of times to replicate the game server
     * container group on each fleet instance.
     */
    override
        fun gameServerContainerGroupsPerInstance(gameServerContainerGroupsPerInstance: Number) {
      cdkBuilder.gameServerContainerGroupsPerInstance(gameServerContainerGroupsPerInstance)
    }

    /**
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet.
     * The limit applies for a specified span of time.
     */
    override fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: IResolvable) {
      cdkBuilder.gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet.
     * The limit applies for a specified span of time.
     */
    override
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: CfnContainerFleet.GameSessionCreationLimitPolicyProperty) {
      cdkBuilder.gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy.let(CfnContainerFleet.GameSessionCreationLimitPolicyProperty.Companion::unwrap))
    }

    /**
     * @param gameSessionCreationLimitPolicy A policy that limits the number of game sessions that
     * each individual player can create on instances in this fleet.
     * The limit applies for a specified span of time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfed06669148cc31e7a8f92a66a9dbd0b620646021e28a2390fe6cba5376950a")
    override
        fun gameSessionCreationLimitPolicy(gameSessionCreationLimitPolicy: CfnContainerFleet.GameSessionCreationLimitPolicyProperty.Builder.() -> Unit):
        Unit =
        gameSessionCreationLimitPolicy(CfnContainerFleet.GameSessionCreationLimitPolicyProperty(gameSessionCreationLimitPolicy))

    /**
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet.
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     */
    override fun instanceConnectionPortRange(instanceConnectionPortRange: IResolvable) {
      cdkBuilder.instanceConnectionPortRange(instanceConnectionPortRange.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet.
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     */
    override
        fun instanceConnectionPortRange(instanceConnectionPortRange: CfnContainerFleet.ConnectionPortRangeProperty) {
      cdkBuilder.instanceConnectionPortRange(instanceConnectionPortRange.let(CfnContainerFleet.ConnectionPortRangeProperty.Companion::unwrap))
    }

    /**
     * @param instanceConnectionPortRange The set of port numbers to open on each instance in a
     * container fleet.
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40ec752a3dfbf5743e4a9f407bc63c116abb21782e26241c1664e9ee747ea2e7")
    override
        fun instanceConnectionPortRange(instanceConnectionPortRange: CfnContainerFleet.ConnectionPortRangeProperty.Builder.() -> Unit):
        Unit =
        instanceConnectionPortRange(CfnContainerFleet.ConnectionPortRangeProperty(instanceConnectionPortRange))

    /**
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet.
     */
    override fun instanceInboundPermissions(instanceInboundPermissions: IResolvable) {
      cdkBuilder.instanceInboundPermissions(instanceInboundPermissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet.
     */
    override fun instanceInboundPermissions(instanceInboundPermissions: List<Any>) {
      cdkBuilder.instanceInboundPermissions(instanceInboundPermissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param instanceInboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet.
     */
    override fun instanceInboundPermissions(vararg instanceInboundPermissions: Any): Unit =
        instanceInboundPermissions(instanceInboundPermissions.toList())

    /**
     * @param instanceType The Amazon EC2 instance type to use for all instances in the fleet.
     * Instance type determines the computing resources and processing power that's available to
     * host your game servers. This includes including CPU, memory, storage, and networking capacity.
     * You can't update this fleet property.
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param locations the value to be set.
     */
    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param locations the value to be set.
     */
    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param locations the value to be set.
     */
    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    /**
     * @param logConfiguration The method that is used to collect container logs for the fleet.
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logConfiguration The method that is used to collect container logs for the fleet.
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     */
    override fun logConfiguration(logConfiguration: CfnContainerFleet.LogConfigurationProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnContainerFleet.LogConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param logConfiguration The method that is used to collect container logs for the fleet.
     * Amazon GameLift Servers saves all standard output for each container in logs, including game
     * session logs.
     *
     * * `CLOUDWATCH` -- Send logs to an Amazon CloudWatch log group that you define. Each container
     * emits a log stream, which is organized in the log group.
     * * `S3` -- Store logs in an Amazon S3 bucket that you define.
     * * `NONE` -- Don't collect container logs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecbba654d040db6f6994f74c7f34a4b832065f486e641c4da188297ef4ec2227")
    override
        fun logConfiguration(logConfiguration: CfnContainerFleet.LogConfigurationProperty.Builder.() -> Unit):
        Unit = logConfiguration(CfnContainerFleet.LogConfigurationProperty(logConfiguration))

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * Metric groups aggregate metrics for multiple fleets.
     */
    override fun metricGroups(metricGroups: List<String>) {
      cdkBuilder.metricGroups(metricGroups)
    }

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * Metric groups aggregate metrics for multiple fleets.
     */
    override fun metricGroups(vararg metricGroups: String): Unit =
        metricGroups(metricGroups.toList())

    /**
     * @param newGameSessionProtectionPolicy Determines whether Amazon GameLift Servers can shut
     * down game sessions on the fleet that are actively running and hosting players.
     * Amazon GameLift Servers might prompt an instance shutdown when scaling down fleet capacity or
     * when retiring unhealthy instances. You can also set game session protection for individual game
     * sessions using
     * [UpdateGameSession](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSession.html)
     * .
     *
     * * *NoProtection* -- Game sessions can be shut down during active gameplay.
     * * *FullProtection* -- Game sessions in `ACTIVE` status can't be shut down.
     */
    override fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String) {
      cdkBuilder.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy)
    }

    /**
     * @param perInstanceContainerGroupDefinitionName The name of the fleet's per-instance container
     * group definition.
     */
    override
        fun perInstanceContainerGroupDefinitionName(perInstanceContainerGroupDefinitionName: String) {
      cdkBuilder.perInstanceContainerGroupDefinitionName(perInstanceContainerGroupDefinitionName)
    }

    /**
     * @param scalingPolicies A list of rules that control how a fleet is scaled.
     */
    override fun scalingPolicies(scalingPolicies: IResolvable) {
      cdkBuilder.scalingPolicies(scalingPolicies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scalingPolicies A list of rules that control how a fleet is scaled.
     */
    override fun scalingPolicies(scalingPolicies: List<Any>) {
      cdkBuilder.scalingPolicies(scalingPolicies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param scalingPolicies A list of rules that control how a fleet is scaled.
     */
    override fun scalingPolicies(vararg scalingPolicies: Any): Unit =
        scalingPolicies(scalingPolicies.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnContainerFleetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleetProps,
  ) : CdkObject(cdkObject),
      CfnContainerFleetProps {
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
     */
    override fun billingType(): String? = unwrap(this).getBillingType()

    /**
     * Set of rules for processing a deployment for a container fleet update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-deploymentconfiguration)
     */
    override fun deploymentConfiguration(): Any? = unwrap(this).getDeploymentConfiguration()

    /**
     * A meaningful description of the container fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique identifier for an AWS Identity and Access Management (IAM) role with permissions
     * to run your containers on resources that are managed by Amazon GameLift Servers.
     *
     * See [Set up an IAM service
     * role](https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html) . This
     * fleet property can't be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-fleetrolearn)
     */
    override fun fleetRoleArn(): String = unwrap(this).getFleetRoleArn()

    /**
     * The name of the fleet's game server container group definition, which describes how to deploy
     * containers with your game server build and support software onto each fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupdefinitionname)
     */
    override fun gameServerContainerGroupDefinitionName(): String? =
        unwrap(this).getGameServerContainerGroupDefinitionName()

    /**
     * The number of times to replicate the game server container group on each fleet instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gameservercontainergroupsperinstance)
     */
    override fun gameServerContainerGroupsPerInstance(): Number? =
        unwrap(this).getGameServerContainerGroupsPerInstance()

    /**
     * A policy that limits the number of game sessions that each individual player can create on
     * instances in this fleet.
     *
     * The limit applies for a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-gamesessioncreationlimitpolicy)
     */
    override fun gameSessionCreationLimitPolicy(): Any? =
        unwrap(this).getGameSessionCreationLimitPolicy()

    /**
     * The set of port numbers to open on each instance in a container fleet.
     *
     * Connection ports are used by inbound traffic to connect with processes that are running in
     * containers on the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceconnectionportrange)
     */
    override fun instanceConnectionPortRange(): Any? = unwrap(this).getInstanceConnectionPortRange()

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instanceinboundpermissions)
     */
    override fun instanceInboundPermissions(): Any? = unwrap(this).getInstanceInboundPermissions()

    /**
     * The Amazon EC2 instance type to use for all instances in the fleet.
     *
     * Instance type determines the computing resources and processing power that's available to
     * host your game servers. This includes including CPU, memory, storage, and networking capacity.
     * You can't update this fleet property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-instancetype)
     */
    override fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-locations)
     */
    override fun locations(): Any? = unwrap(this).getLocations()

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
     */
    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * Metric groups aggregate metrics for multiple fleets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-metricgroups)
     */
    override fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

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
     */
    override fun newGameSessionProtectionPolicy(): String? =
        unwrap(this).getNewGameSessionProtectionPolicy()

    /**
     * The name of the fleet's per-instance container group definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-perinstancecontainergroupdefinitionname)
     */
    override fun perInstanceContainerGroupDefinitionName(): String? =
        unwrap(this).getPerInstanceContainerGroupDefinitionName()

    /**
     * A list of rules that control how a fleet is scaled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-scalingpolicies)
     */
    override fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-containerfleet.html#cfn-gamelift-containerfleet-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContainerFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnContainerFleetProps):
        CfnContainerFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnContainerFleetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContainerFleetProps):
        software.amazon.awscdk.services.gamelift.CfnContainerFleetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.gamelift.CfnContainerFleetProps
  }
}
