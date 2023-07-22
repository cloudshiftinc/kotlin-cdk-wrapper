@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.amazon.awscdk.services.gamelift.CfnAliasProps
import software.amazon.awscdk.services.gamelift.CfnBuild
import software.amazon.awscdk.services.gamelift.CfnBuildProps
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.amazon.awscdk.services.gamelift.CfnFleetProps
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import software.amazon.awscdk.services.gamelift.CfnGameServerGroupProps
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps
import software.amazon.awscdk.services.gamelift.CfnLocation
import software.amazon.awscdk.services.gamelift.CfnLocationProps
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfigurationProps
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps
import software.amazon.awscdk.services.gamelift.CfnScript
import software.amazon.awscdk.services.gamelift.CfnScriptProps
import software.constructs.Construct

public object gamelift {
  /**
   * The `AWS::GameLift::Alias` resource creates an alias for an Amazon GameLift (GameLift) fleet
   * destination.
   *
   * There are two types of routing strategies for aliases: simple and terminal. A simple alias
   * points to an active fleet. A terminal alias displays a message instead of routing players to an
   * active fleet. For example, a terminal alias might display a URL link that directs players to an
   * upgrade site. You can use aliases to define destinations in a game session queue or when
   * requesting new game sessions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnAlias cfnAlias = CfnAlias.Builder.create(this, "MyCfnAlias")
   * .name("name")
   * .routingStrategy(RoutingStrategyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .fleetId("fleetId")
   * .message("message")
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html)
   */
  public inline fun cfnAlias(
    scope: Construct,
    id: String,
    block: CfnAliasDsl.() -> Unit = {},
  ): CfnAlias {
    val builder = CfnAliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAlias`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnAliasProps cfnAliasProps = CfnAliasProps.builder()
   * .name("name")
   * .routingStrategy(RoutingStrategyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .fleetId("fleetId")
   * .message("message")
   * .build())
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html)
   */
  public inline fun cfnAliasProps(block: CfnAliasPropsDsl.() -> Unit = {}): CfnAliasProps {
    val builder = CfnAliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The routing configuration for a fleet alias.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * RoutingStrategyProperty routingStrategyProperty = RoutingStrategyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .fleetId("fleetId")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html)
   */
  public inline
      fun cfnAliasRoutingStrategyProperty(block: CfnAliasRoutingStrategyPropertyDsl.() -> Unit =
      {}): CfnAlias.RoutingStrategyProperty {
    val builder = CfnAliasRoutingStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::GameLift::Build` resource creates a game server build that is installed and run on
   * instances in an Amazon GameLift fleet.
   *
   * This resource points to an Amazon S3 location that contains a zip file with all of the
   * components of the game server build.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnBuild cfnBuild = CfnBuild.Builder.create(this, "MyCfnBuild")
   * .name("name")
   * .operatingSystem("operatingSystem")
   * .serverSdkVersion("serverSdkVersion")
   * .storageLocation(StorageLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
   */
  public inline fun cfnBuild(
    scope: Construct,
    id: String,
    block: CfnBuildDsl.() -> Unit = {},
  ): CfnBuild {
    val builder = CfnBuildDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnBuild`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnBuildProps cfnBuildProps = CfnBuildProps.builder()
   * .name("name")
   * .operatingSystem("operatingSystem")
   * .serverSdkVersion("serverSdkVersion")
   * .storageLocation(StorageLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
   */
  public inline fun cfnBuildProps(block: CfnBuildPropsDsl.() -> Unit = {}): CfnBuildProps {
    val builder = CfnBuildPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The location in Amazon S3 where build or script files are stored for access by Amazon GameLift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * StorageLocationProperty storageLocationProperty = StorageLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html)
   */
  public inline
      fun cfnBuildStorageLocationProperty(block: CfnBuildStorageLocationPropertyDsl.() -> Unit =
      {}): CfnBuild.StorageLocationProperty {
    val builder = CfnBuildStorageLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::GameLift::Fleet` resource creates an Amazon GameLift (GameLift) fleet to host custom
   * game server or Realtime Servers.
   *
   * A fleet is a set of EC2 instances, configured with instructions to run game servers on each
   * instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
   * .name("name")
   * // the properties below are optional
   * .anywhereConfiguration(AnywhereConfigurationProperty.builder()
   * .cost("cost")
   * .build())
   * .buildId("buildId")
   * .certificateConfiguration(CertificateConfigurationProperty.builder()
   * .certificateType("certificateType")
   * .build())
   * .computeType("computeType")
   * .description("description")
   * .desiredEc2Instances(123)
   * .ec2InboundPermissions(List.of(IpPermissionProperty.builder()
   * .fromPort(123)
   * .ipRange("ipRange")
   * .protocol("protocol")
   * .toPort(123)
   * .build()))
   * .ec2InstanceType("ec2InstanceType")
   * .fleetType("fleetType")
   * .instanceRoleArn("instanceRoleArn")
   * .locations(List.of(LocationConfigurationProperty.builder()
   * .location("location")
   * // the properties below are optional
   * .locationCapacity(LocationCapacityProperty.builder()
   * .desiredEc2Instances(123)
   * .maxSize(123)
   * .minSize(123)
   * .build())
   * .build()))
   * .logPaths(List.of("logPaths"))
   * .maxSize(123)
   * .metricGroups(List.of("metricGroups"))
   * .minSize(123)
   * .newGameSessionProtectionPolicy("newGameSessionProtectionPolicy")
   * .peerVpcAwsAccountId("peerVpcAwsAccountId")
   * .peerVpcId("peerVpcId")
   * .resourceCreationLimitPolicy(ResourceCreationLimitPolicyProperty.builder()
   * .newGameSessionsPerCreator(123)
   * .policyPeriodInMinutes(123)
   * .build())
   * .runtimeConfiguration(RuntimeConfigurationProperty.builder()
   * .gameSessionActivationTimeoutSeconds(123)
   * .maxConcurrentGameSessionActivations(123)
   * .serverProcesses(List.of(ServerProcessProperty.builder()
   * .concurrentExecutions(123)
   * .launchPath("launchPath")
   * // the properties below are optional
   * .parameters("parameters")
   * .build()))
   * .build())
   * .scriptId("scriptId")
   * .serverLaunchParameters("serverLaunchParameters")
   * .serverLaunchPath("serverLaunchPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html)
   */
  public inline fun cfnFleet(
    scope: Construct,
    id: String,
    block: CfnFleetDsl.() -> Unit = {},
  ): CfnFleet {
    val builder = CfnFleetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Amazon GameLift Anywhere configuration options for your Anywhere fleets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * AnywhereConfigurationProperty anywhereConfigurationProperty =
   * AnywhereConfigurationProperty.builder()
   * .cost("cost")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-anywhereconfiguration.html)
   */
  public inline
      fun cfnFleetAnywhereConfigurationProperty(block: CfnFleetAnywhereConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.AnywhereConfigurationProperty {
    val builder = CfnFleetAnywhereConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Determines whether a TLS/SSL certificate is generated for a fleet.
   *
   * This feature must be enabled when creating the fleet. All instances in a fleet share the same
   * certificate. The certificate can be retrieved by calling the [GameLift Server
   * SDK](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html)
   * operation `GetInstanceCertificate` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CertificateConfigurationProperty certificateConfigurationProperty =
   * CertificateConfigurationProperty.builder()
   * .certificateType("certificateType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html)
   */
  public inline
      fun cfnFleetCertificateConfigurationProperty(block: CfnFleetCertificateConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.CertificateConfigurationProperty {
    val builder = CfnFleetCertificateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A range of IP addresses and port settings that allow inbound traffic to connect to server
   * processes on an instance in a fleet.
   *
   * New game sessions are assigned an IP address/port number combination, which must fall into the
   * fleet's allowed ranges. Fleets with custom game builds must have permissions explicitly set. For
   * Realtime Servers fleets, GameLift automatically opens two port ranges, one for TCP messaging and
   * one for UDP.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * IpPermissionProperty ipPermissionProperty = IpPermissionProperty.builder()
   * .fromPort(123)
   * .ipRange("ipRange")
   * .protocol("protocol")
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html)
   */
  public inline fun cfnFleetIpPermissionProperty(block: CfnFleetIpPermissionPropertyDsl.() -> Unit =
      {}): CfnFleet.IpPermissionProperty {
    val builder = CfnFleetIpPermissionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Current resource capacity settings in a specified fleet or location.
   *
   * The location value might refer to a fleet's remote location or its home Region.
   *
   * *Related actions*
   *
   * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
   * |
   * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
   * |
   * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * LocationCapacityProperty locationCapacityProperty = LocationCapacityProperty.builder()
   * .desiredEc2Instances(123)
   * .maxSize(123)
   * .minSize(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html)
   */
  public inline
      fun cfnFleetLocationCapacityProperty(block: CfnFleetLocationCapacityPropertyDsl.() -> Unit =
      {}): CfnFleet.LocationCapacityProperty {
    val builder = CfnFleetLocationCapacityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A remote location where a multi-location fleet can deploy game servers for game hosting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * LocationConfigurationProperty locationConfigurationProperty =
   * LocationConfigurationProperty.builder()
   * .location("location")
   * // the properties below are optional
   * .locationCapacity(LocationCapacityProperty.builder()
   * .desiredEc2Instances(123)
   * .maxSize(123)
   * .minSize(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html)
   */
  public inline
      fun cfnFleetLocationConfigurationProperty(block: CfnFleetLocationConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.LocationConfigurationProperty {
    val builder = CfnFleetLocationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnFleet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
   * .name("name")
   * // the properties below are optional
   * .anywhereConfiguration(AnywhereConfigurationProperty.builder()
   * .cost("cost")
   * .build())
   * .buildId("buildId")
   * .certificateConfiguration(CertificateConfigurationProperty.builder()
   * .certificateType("certificateType")
   * .build())
   * .computeType("computeType")
   * .description("description")
   * .desiredEc2Instances(123)
   * .ec2InboundPermissions(List.of(IpPermissionProperty.builder()
   * .fromPort(123)
   * .ipRange("ipRange")
   * .protocol("protocol")
   * .toPort(123)
   * .build()))
   * .ec2InstanceType("ec2InstanceType")
   * .fleetType("fleetType")
   * .instanceRoleArn("instanceRoleArn")
   * .locations(List.of(LocationConfigurationProperty.builder()
   * .location("location")
   * // the properties below are optional
   * .locationCapacity(LocationCapacityProperty.builder()
   * .desiredEc2Instances(123)
   * .maxSize(123)
   * .minSize(123)
   * .build())
   * .build()))
   * .logPaths(List.of("logPaths"))
   * .maxSize(123)
   * .metricGroups(List.of("metricGroups"))
   * .minSize(123)
   * .newGameSessionProtectionPolicy("newGameSessionProtectionPolicy")
   * .peerVpcAwsAccountId("peerVpcAwsAccountId")
   * .peerVpcId("peerVpcId")
   * .resourceCreationLimitPolicy(ResourceCreationLimitPolicyProperty.builder()
   * .newGameSessionsPerCreator(123)
   * .policyPeriodInMinutes(123)
   * .build())
   * .runtimeConfiguration(RuntimeConfigurationProperty.builder()
   * .gameSessionActivationTimeoutSeconds(123)
   * .maxConcurrentGameSessionActivations(123)
   * .serverProcesses(List.of(ServerProcessProperty.builder()
   * .concurrentExecutions(123)
   * .launchPath("launchPath")
   * // the properties below are optional
   * .parameters("parameters")
   * .build()))
   * .build())
   * .scriptId("scriptId")
   * .serverLaunchParameters("serverLaunchParameters")
   * .serverLaunchPath("serverLaunchPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html)
   */
  public inline fun cfnFleetProps(block: CfnFleetPropsDsl.() -> Unit = {}): CfnFleetProps {
    val builder = CfnFleetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A policy that limits the number of game sessions a player can create on the same fleet.
   *
   * This optional policy gives game owners control over how players can consume available game
   * server resources. A resource creation policy makes the following statement: "An individual player
   * can create a maximum number of new game sessions within a specified time period".
   *
   * The policy is evaluated when a player tries to create a new game session. For example, assume
   * you have a policy of 10 new game sessions and a time period of 60 minutes. On receiving a
   * `CreateGameSession` request, Amazon GameLift checks that the player (identified by `CreatorId` )
   * has created fewer than 10 game sessions in the past 60 minutes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * ResourceCreationLimitPolicyProperty resourceCreationLimitPolicyProperty =
   * ResourceCreationLimitPolicyProperty.builder()
   * .newGameSessionsPerCreator(123)
   * .policyPeriodInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html)
   */
  public inline
      fun cfnFleetResourceCreationLimitPolicyProperty(block: CfnFleetResourceCreationLimitPolicyPropertyDsl.() -> Unit
      = {}): CfnFleet.ResourceCreationLimitPolicyProperty {
    val builder = CfnFleetResourceCreationLimitPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A collection of server process configurations that describe the set of processes to run on each
   * instance in a fleet.
   *
   * Server processes run either an executable in a custom game build or a Realtime Servers script.
   * GameLift launches the configured processes, manages their life cycle, and replaces them as needed.
   * Each instance checks regularly for an updated runtime configuration.
   *
   * A GameLift instance is limited to 50 processes running concurrently. To calculate the total
   * number of processes in a runtime configuration, add the values of the `ConcurrentExecutions`
   * parameter for each ServerProcess. Learn more about [Running Multiple Processes on a
   * Fleet](https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * RuntimeConfigurationProperty runtimeConfigurationProperty =
   * RuntimeConfigurationProperty.builder()
   * .gameSessionActivationTimeoutSeconds(123)
   * .maxConcurrentGameSessionActivations(123)
   * .serverProcesses(List.of(ServerProcessProperty.builder()
   * .concurrentExecutions(123)
   * .launchPath("launchPath")
   * // the properties below are optional
   * .parameters("parameters")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html)
   */
  public inline
      fun cfnFleetRuntimeConfigurationProperty(block: CfnFleetRuntimeConfigurationPropertyDsl.() -> Unit
      = {}): CfnFleet.RuntimeConfigurationProperty {
    val builder = CfnFleetRuntimeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A set of instructions for launching server processes on each instance in a fleet.
   *
   * Server processes run either an executable in a custom game build or a Realtime Servers script.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * ServerProcessProperty serverProcessProperty = ServerProcessProperty.builder()
   * .concurrentExecutions(123)
   * .launchPath("launchPath")
   * // the properties below are optional
   * .parameters("parameters")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html)
   */
  public inline fun cfnFleetServerProcessProperty(block: CfnFleetServerProcessPropertyDsl.() -> Unit
      = {}): CfnFleet.ServerProcessProperty {
    val builder = CfnFleetServerProcessPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * *This operation is used with the Amazon GameLift FleetIQ solution and game server groups.*.
   *
   * Creates a GameLift FleetIQ game server group for managing game hosting on a collection of
   * Amazon EC2 instances for game hosting. This operation creates the game server group, creates an
   * Auto Scaling group in your AWS account , and establishes a link between the two groups. You can
   * view the status of your game server groups in the GameLift console. Game server group metrics and
   * events are emitted to Amazon CloudWatch.
   *
   * Before creating a new game server group, you must have the following:
   *
   * * An Amazon EC2 launch template that specifies how to launch Amazon EC2 instances with your
   * game server build. For more information, see [Launching an Instance from a Launch
   * Template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html) in the
   * *Amazon EC2 User Guide* .
   * * An IAM role that extends limited access to your AWS account to allow GameLift FleetIQ to
   * create and interact with the Auto Scaling group. For more information, see [Create IAM roles for
   * cross-service
   * interaction](https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-iam-permissions-roles.html)
   * in the *GameLift FleetIQ Developer Guide* .
   *
   * To create a new game server group, specify a unique group name, IAM role and Amazon EC2 launch
   * template, and provide a list of instance types that can be used in the group. You must also set
   * initial maximum and minimum limits on the group's instance count. You can optionally set an Auto
   * Scaling policy with target tracking based on a GameLift FleetIQ metric.
   *
   * Once the game server group and corresponding Auto Scaling group are created, you have full
   * access to change the Auto Scaling group's configuration as needed. Several properties that are set
   * when creating a game server group, including maximum/minimum size and auto-scaling policy
   * settings, must be updated directly in the Auto Scaling group. Keep in mind that some Auto Scaling
   * group properties are periodically updated by GameLift FleetIQ as part of its balancing activities
   * to optimize for availability and cost.
   *
   * *Learn more*
   *
   * [GameLift FleetIQ
   * Guide](https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
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
  public inline fun cfnGameServerGroup(
    scope: Construct,
    id: String,
    block: CfnGameServerGroupDsl.() -> Unit = {},
  ): CfnGameServerGroup {
    val builder = CfnGameServerGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.gamelift.*;
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
  public inline
      fun cfnGameServerGroupAutoScalingPolicyProperty(block: CfnGameServerGroupAutoScalingPolicyPropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.AutoScalingPolicyProperty {
    val builder = CfnGameServerGroupAutoScalingPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.gamelift.*;
   * InstanceDefinitionProperty instanceDefinitionProperty = InstanceDefinitionProperty.builder()
   * .instanceType("instanceType")
   * // the properties below are optional
   * .weightedCapacity("weightedCapacity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-instancedefinition.html)
   */
  public inline
      fun cfnGameServerGroupInstanceDefinitionProperty(block: CfnGameServerGroupInstanceDefinitionPropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.InstanceDefinitionProperty {
    val builder = CfnGameServerGroupInstanceDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.gamelift.*;
   * LaunchTemplateProperty launchTemplateProperty = LaunchTemplateProperty.builder()
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-launchtemplate.html)
   */
  public inline
      fun cfnGameServerGroupLaunchTemplateProperty(block: CfnGameServerGroupLaunchTemplatePropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.LaunchTemplateProperty {
    val builder = CfnGameServerGroupLaunchTemplatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnGameServerGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
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
  public inline fun cfnGameServerGroupProps(block: CfnGameServerGroupPropsDsl.() -> Unit = {}):
      CfnGameServerGroupProps {
    val builder = CfnGameServerGroupPropsDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.gamelift.*;
   * TargetTrackingConfigurationProperty targetTrackingConfigurationProperty =
   * TargetTrackingConfigurationProperty.builder()
   * .targetValue(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-targettrackingconfiguration.html)
   */
  public inline
      fun cfnGameServerGroupTargetTrackingConfigurationProperty(block: CfnGameServerGroupTargetTrackingConfigurationPropertyDsl.() -> Unit
      = {}): CfnGameServerGroup.TargetTrackingConfigurationProperty {
    val builder = CfnGameServerGroupTargetTrackingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::GameLift::GameSessionQueue` resource creates a placement queue that processes
   * requests for new game sessions.
   *
   * A queue uses FleetIQ algorithms to determine the best placement locations and find an available
   * game server, then prompts the game server to start a new game session. Queues can have
   * destinations (GameLift fleets or aliases), which determine where the queue can place new game
   * sessions. A queue can have destinations with varied fleet type (Spot and On-Demand), instance
   * type, and AWS Region .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnGameSessionQueue cfnGameSessionQueue = CfnGameSessionQueue.Builder.create(this,
   * "MyCfnGameSessionQueue")
   * .name("name")
   * // the properties below are optional
   * .customEventData("customEventData")
   * .destinations(List.of(DestinationProperty.builder()
   * .destinationArn("destinationArn")
   * .build()))
   * .filterConfiguration(FilterConfigurationProperty.builder()
   * .allowedLocations(List.of("allowedLocations"))
   * .build())
   * .notificationTarget("notificationTarget")
   * .playerLatencyPolicies(List.of(PlayerLatencyPolicyProperty.builder()
   * .maximumIndividualPlayerLatencyMilliseconds(123)
   * .policyDurationSeconds(123)
   * .build()))
   * .priorityConfiguration(PriorityConfigurationProperty.builder()
   * .locationOrder(List.of("locationOrder"))
   * .priorityOrder(List.of("priorityOrder"))
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeoutInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html)
   */
  public inline fun cfnGameSessionQueue(
    scope: Construct,
    id: String,
    block: CfnGameSessionQueueDsl.() -> Unit = {},
  ): CfnGameSessionQueue {
    val builder = CfnGameSessionQueueDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A fleet or alias designated in a game session queue.
   *
   * Queues fulfill requests for new game sessions by placing a new game session on any of the
   * queue's destinations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * DestinationProperty destinationProperty = DestinationProperty.builder()
   * .destinationArn("destinationArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html)
   */
  public inline
      fun cfnGameSessionQueueDestinationProperty(block: CfnGameSessionQueueDestinationPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.DestinationProperty {
    val builder = CfnGameSessionQueueDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A list of fleet locations where a game session queue can place new game sessions.
   *
   * You can use a filter to temporarily turn off placements for specific locations. For queues that
   * have multi-location fleets, you can use a filter configuration allow placement with some, but not
   * all of these locations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * FilterConfigurationProperty filterConfigurationProperty = FilterConfigurationProperty.builder()
   * .allowedLocations(List.of("allowedLocations"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-filterconfiguration.html)
   */
  public inline
      fun cfnGameSessionQueueFilterConfigurationProperty(block: CfnGameSessionQueueFilterConfigurationPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.FilterConfigurationProperty {
    val builder = CfnGameSessionQueueFilterConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The queue setting that determines the highest latency allowed for individual players when
   * placing a game session.
   *
   * When a latency policy is in force, a game session cannot be placed with any fleet in a Region
   * where a player reports latency higher than the cap. Latency policies are only enforced when the
   * placement request contains player latency information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * PlayerLatencyPolicyProperty playerLatencyPolicyProperty = PlayerLatencyPolicyProperty.builder()
   * .maximumIndividualPlayerLatencyMilliseconds(123)
   * .policyDurationSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html)
   */
  public inline
      fun cfnGameSessionQueuePlayerLatencyPolicyProperty(block: CfnGameSessionQueuePlayerLatencyPolicyPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.PlayerLatencyPolicyProperty {
    val builder = CfnGameSessionQueuePlayerLatencyPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Custom prioritization settings for use by a game session queue when placing new game sessions
   * with available game servers.
   *
   * When defined, this configuration replaces the default FleetIQ prioritization process, which is
   * as follows:
   *
   * * If player latency data is included in a game session request, destinations and locations are
   * prioritized first based on lowest average latency (1), then on lowest hosting cost (2), then on
   * destination list order (3), and finally on location (alphabetical) (4). This approach ensures that
   * the queue's top priority is to place game sessions where average player latency is lowest, and--if
   * latency is the same--where the hosting cost is less, etc.
   * * If player latency data is not included, destinations and locations are prioritized first on
   * destination list order (1), and then on location (alphabetical) (2). This approach ensures that
   * the queue's top priority is to place game sessions on the first destination fleet listed. If that
   * fleet has multiple locations, the game session is placed on the first location (when listed
   * alphabetically).
   *
   * Changing the priority order will affect how game sessions are placed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * PriorityConfigurationProperty priorityConfigurationProperty =
   * PriorityConfigurationProperty.builder()
   * .locationOrder(List.of("locationOrder"))
   * .priorityOrder(List.of("priorityOrder"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-priorityconfiguration.html)
   */
  public inline
      fun cfnGameSessionQueuePriorityConfigurationProperty(block: CfnGameSessionQueuePriorityConfigurationPropertyDsl.() -> Unit
      = {}): CfnGameSessionQueue.PriorityConfigurationProperty {
    val builder = CfnGameSessionQueuePriorityConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnGameSessionQueue`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnGameSessionQueueProps cfnGameSessionQueueProps = CfnGameSessionQueueProps.builder()
   * .name("name")
   * // the properties below are optional
   * .customEventData("customEventData")
   * .destinations(List.of(DestinationProperty.builder()
   * .destinationArn("destinationArn")
   * .build()))
   * .filterConfiguration(FilterConfigurationProperty.builder()
   * .allowedLocations(List.of("allowedLocations"))
   * .build())
   * .notificationTarget("notificationTarget")
   * .playerLatencyPolicies(List.of(PlayerLatencyPolicyProperty.builder()
   * .maximumIndividualPlayerLatencyMilliseconds(123)
   * .policyDurationSeconds(123)
   * .build()))
   * .priorityConfiguration(PriorityConfigurationProperty.builder()
   * .locationOrder(List.of("locationOrder"))
   * .priorityOrder(List.of("priorityOrder"))
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeoutInSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html)
   */
  public inline fun cfnGameSessionQueueProps(block: CfnGameSessionQueuePropsDsl.() -> Unit = {}):
      CfnGameSessionQueueProps {
    val builder = CfnGameSessionQueuePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a custom location for use in an Anywhere fleet.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnLocation cfnLocation = CfnLocation.Builder.create(this, "MyCfnLocation")
   * .locationName("locationName")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html)
   */
  public inline fun cfnLocation(
    scope: Construct,
    id: String,
    block: CfnLocationDsl.() -> Unit = {},
  ): CfnLocation {
    val builder = CfnLocationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnLocation`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnLocationProps cfnLocationProps = CfnLocationProps.builder()
   * .locationName("locationName")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html)
   */
  public inline fun cfnLocationProps(block: CfnLocationPropsDsl.() -> Unit = {}): CfnLocationProps {
    val builder = CfnLocationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::GameLift::MatchmakingConfiguration` resource defines a new matchmaking configuration
   * for use with FlexMatch.
   *
   * Whether you're using FlexMatch with GameLift hosting or as a standalone matchmaking service,
   * the matchmaking configuration sets out rules for matching players and forming teams. If you're
   * using GameLift hosting, it also defines how to start game sessions for each match. Your
   * matchmaking system can use multiple configurations to handle different game scenarios. All
   * matchmaking requests identify the matchmaking configuration to use and provide player attributes
   * that are consistent with that configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnMatchmakingConfiguration cfnMatchmakingConfiguration =
   * CfnMatchmakingConfiguration.Builder.create(this, "MyCfnMatchmakingConfiguration")
   * .acceptanceRequired(false)
   * .name("name")
   * .requestTimeoutSeconds(123)
   * .ruleSetName("ruleSetName")
   * // the properties below are optional
   * .acceptanceTimeoutSeconds(123)
   * .additionalPlayerCount(123)
   * .backfillMode("backfillMode")
   * .customEventData("customEventData")
   * .description("description")
   * .flexMatchMode("flexMatchMode")
   * .gameProperties(List.of(GamePropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .gameSessionData("gameSessionData")
   * .gameSessionQueueArns(List.of("gameSessionQueueArns"))
   * .notificationTarget("notificationTarget")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html)
   */
  public inline fun cfnMatchmakingConfiguration(
    scope: Construct,
    id: String,
    block: CfnMatchmakingConfigurationDsl.() -> Unit = {},
  ): CfnMatchmakingConfiguration {
    val builder = CfnMatchmakingConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Set of key-value pairs that contain information about a game session.
   *
   * When included in a game session request, these properties communicate details to be used when
   * setting up the new game session. For example, a game property might specify a game mode, level, or
   * map. Game properties are passed to the game server process when initiating a new game session. For
   * more information, see the [Amazon GameLift Developer
   * Guide](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-create)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * GamePropertyProperty gamePropertyProperty = GamePropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-matchmakingconfiguration-gameproperty.html)
   */
  public inline
      fun cfnMatchmakingConfigurationGamePropertyProperty(block: CfnMatchmakingConfigurationGamePropertyPropertyDsl.() -> Unit
      = {}): CfnMatchmakingConfiguration.GamePropertyProperty {
    val builder = CfnMatchmakingConfigurationGamePropertyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnMatchmakingConfiguration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnMatchmakingConfigurationProps cfnMatchmakingConfigurationProps =
   * CfnMatchmakingConfigurationProps.builder()
   * .acceptanceRequired(false)
   * .name("name")
   * .requestTimeoutSeconds(123)
   * .ruleSetName("ruleSetName")
   * // the properties below are optional
   * .acceptanceTimeoutSeconds(123)
   * .additionalPlayerCount(123)
   * .backfillMode("backfillMode")
   * .customEventData("customEventData")
   * .description("description")
   * .flexMatchMode("flexMatchMode")
   * .gameProperties(List.of(GamePropertyProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .gameSessionData("gameSessionData")
   * .gameSessionQueueArns(List.of("gameSessionQueueArns"))
   * .notificationTarget("notificationTarget")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html)
   */
  public inline
      fun cfnMatchmakingConfigurationProps(block: CfnMatchmakingConfigurationPropsDsl.() -> Unit =
      {}): CfnMatchmakingConfigurationProps {
    val builder = CfnMatchmakingConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a new rule set for FlexMatch matchmaking.
   *
   * A rule set describes the type of match to create, such as the number and size of teams. It also
   * sets the parameters for acceptable player matches, such as minimum skill level or character type.
   *
   * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON
   * format. Rule sets must be defined in the same Region as the matchmaking configuration they are
   * used with.
   *
   * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax.
   *
   * *Learn more*
   *
   * * [Build a rule
   * set](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html)
   * * [Design a
   * matchmaker](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html)
   * * [Matchmaking with
   * FlexMatch](https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-intro.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnMatchmakingRuleSet cfnMatchmakingRuleSet = CfnMatchmakingRuleSet.Builder.create(this,
   * "MyCfnMatchmakingRuleSet")
   * .name("name")
   * .ruleSetBody("ruleSetBody")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html)
   */
  public inline fun cfnMatchmakingRuleSet(
    scope: Construct,
    id: String,
    block: CfnMatchmakingRuleSetDsl.() -> Unit = {},
  ): CfnMatchmakingRuleSet {
    val builder = CfnMatchmakingRuleSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnMatchmakingRuleSet`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnMatchmakingRuleSetProps cfnMatchmakingRuleSetProps = CfnMatchmakingRuleSetProps.builder()
   * .name("name")
   * .ruleSetBody("ruleSetBody")
   * // the properties below are optional
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingruleset.html)
   */
  public inline fun cfnMatchmakingRuleSetProps(block: CfnMatchmakingRuleSetPropsDsl.() -> Unit =
      {}): CfnMatchmakingRuleSetProps {
    val builder = CfnMatchmakingRuleSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::GameLift::Script` resource creates a new script record for your Realtime Servers
   * script.
   *
   * Realtime scripts are JavaScript that provide configuration settings and optional custom game
   * logic for your game. The script is deployed when you create a Realtime Servers fleet to host your
   * game sessions. Script logic is executed during an active game session.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnScript cfnScript = CfnScript.Builder.create(this, "MyCfnScript")
   * .storageLocation(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * // the properties below are optional
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html)
   */
  public inline fun cfnScript(
    scope: Construct,
    id: String,
    block: CfnScriptDsl.() -> Unit = {},
  ): CfnScript {
    val builder = CfnScriptDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnScript`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * CfnScriptProps cfnScriptProps = CfnScriptProps.builder()
   * .storageLocation(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build())
   * // the properties below are optional
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-script.html)
   */
  public inline fun cfnScriptProps(block: CfnScriptPropsDsl.() -> Unit = {}): CfnScriptProps {
    val builder = CfnScriptPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The location in Amazon S3 where build or script files can be stored for access by Amazon
   * GameLift.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.gamelift.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .objectVersion("objectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-script-s3location.html)
   */
  public inline fun cfnScriptS3LocationProperty(block: CfnScriptS3LocationPropertyDsl.() -> Unit =
      {}): CfnScript.S3LocationProperty {
    val builder = CfnScriptS3LocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
