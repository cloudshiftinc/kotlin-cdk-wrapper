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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnFleet
import software.constructs.Construct

/**
 * The `AWS::GameLift::Fleet` resource creates an Amazon GameLift (GameLift) fleet to host custom
 * game server or Realtime Servers.
 *
 * A fleet is a set of EC2 instances, configured with instructions to run game servers on each
 * instance.
 *
 * Example:
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
@CdkDslMarker
public class CfnFleetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFleet.Builder = CfnFleet.Builder.create(scope, id)

    private val _ec2InboundPermissions: MutableList<Any> = mutableListOf()

    private val _locations: MutableList<Any> = mutableListOf()

    private val _logPaths: MutableList<String> = mutableListOf()

    private val _metricGroups: MutableList<String> = mutableListOf()

    /**
     * Configuration for Anywhere fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     *
     * @param anywhereConfiguration Configuration for Anywhere fleet.
     */
    public fun anywhereConfiguration(anywhereConfiguration: IResolvable) {
        cdkBuilder.anywhereConfiguration(anywhereConfiguration)
    }

    /**
     * Configuration for Anywhere fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     *
     * @param anywhereConfiguration Configuration for Anywhere fleet.
     */
    public fun anywhereConfiguration(
        anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty
    ) {
        cdkBuilder.anywhereConfiguration(anywhereConfiguration)
    }

    /**
     * A unique identifier for a build to be deployed on the new fleet.
     *
     * If you are deploying the fleet with a custom game build, you must specify this property. The
     * build must have been successfully uploaded to Amazon GameLift and be in a `READY` status.
     * This fleet setting cannot be changed once the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
     *
     * @param buildId A unique identifier for a build to be deployed on the new fleet.
     */
    public fun buildId(buildId: String) {
        cdkBuilder.buildId(buildId)
    }

    /**
     * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED`
     * . You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We
     * recommend you replace fleets before 13 months, consider using fleet aliases for a smooth
     * transition.
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see
     * [Supported Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the
     * *AWS Certificate Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-certificateconfiguration)
     *
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     *   the fleet.
     */
    public fun certificateConfiguration(certificateConfiguration: IResolvable) {
        cdkBuilder.certificateConfiguration(certificateConfiguration)
    }

    /**
     * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED`
     * . You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We
     * recommend you replace fleets before 13 months, consider using fleet aliases for a smooth
     * transition.
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see
     * [Supported Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the
     * *AWS Certificate Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-certificateconfiguration)
     *
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     *   the fleet.
     */
    public fun certificateConfiguration(
        certificateConfiguration: CfnFleet.CertificateConfigurationProperty
    ) {
        cdkBuilder.certificateConfiguration(certificateConfiguration)
    }

    /**
     * The type of compute resource used to host your game servers.
     *
     * You can use your own compute resources with Amazon GameLift Anywhere or use Amazon EC2
     * instances with managed Amazon GameLift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-computetype)
     *
     * @param computeType The type of compute resource used to host your game servers.
     */
    public fun computeType(computeType: String) {
        cdkBuilder.computeType(computeType)
    }

    /**
     * A description for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
     *
     * @param description A description for the fleet.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The number of EC2 instances that you want this fleet to host.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
     *
     * @param desiredEc2Instances The number of EC2 instances that you want this fleet to host.
     */
    public fun desiredEc2Instances(desiredEc2Instances: Number) {
        cdkBuilder.desiredEc2Instances(desiredEc2Instances)
    }

    /**
     * The allowed IP address ranges and port settings that allow inbound traffic to access game
     * sessions on this fleet.
     *
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     *
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     *   inbound traffic to access game sessions on this fleet.
     */
    public fun ec2InboundPermissions(vararg ec2InboundPermissions: Any) {
        _ec2InboundPermissions.addAll(listOf(*ec2InboundPermissions))
    }

    /**
     * The allowed IP address ranges and port settings that allow inbound traffic to access game
     * sessions on this fleet.
     *
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     *
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     *   inbound traffic to access game sessions on this fleet.
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: Collection<Any>) {
        _ec2InboundPermissions.addAll(ec2InboundPermissions)
    }

    /**
     * The allowed IP address ranges and port settings that allow inbound traffic to access game
     * sessions on this fleet.
     *
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     *
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     *   inbound traffic to access game sessions on this fleet.
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: IResolvable) {
        cdkBuilder.ec2InboundPermissions(ec2InboundPermissions)
    }

    /**
     * The Amazon GameLift-supported Amazon EC2 instance type to use for all fleet instances.
     *
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See
     * [Amazon Elastic Compute Cloud Instance Types](https://docs.aws.amazon.com/ec2/instance-types/)
     * for detailed descriptions of Amazon EC2 instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
     *
     * @param ec2InstanceType The Amazon GameLift-supported Amazon EC2 instance type to use for all
     *   fleet instances.
     */
    public fun ec2InstanceType(ec2InstanceType: String) {
        cdkBuilder.ec2InstanceType(ec2InstanceType)
    }

    /**
     * Indicates whether to use On-Demand or Spot instances for this fleet.
     *
     * By default, this property is set to `ON_DEMAND` . Learn more about when to use
     * [On-Demand versus Spot Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . This property cannot be changed after the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype)
     *
     * @param fleetType Indicates whether to use On-Demand or Spot instances for this fleet.
     */
    public fun fleetType(fleetType: String) {
        cdkBuilder.fleetType(fleetType)
    }

    /**
     * A unique identifier for an IAM role that manages access to your AWS services.
     *
     * With an instance role ARN set, any application that runs on an instance in this fleet can
     * assume the role, including install scripts, server processes, and daemons (background
     * processes). Create a role or look up a role's ARN by using the
     * [IAM dashboard](https://docs.aws.amazon.com/iam/) in the AWS Management Console . Learn more
     * about using on-box credentials for your game servers at
     * [Access external resources from a game server](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * . This property cannot be changed after the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn)
     *
     * @param instanceRoleArn A unique identifier for an IAM role that manages access to your AWS
     *   services.
     */
    public fun instanceRoleArn(instanceRoleArn: String) {
        cdkBuilder.instanceRoleArn(instanceRoleArn)
    }

    /**
     * A set of remote locations to deploy additional instances to and manage as part of the fleet.
     *
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     *
     * @param locations A set of remote locations to deploy additional instances to and manage as
     *   part of the fleet.
     */
    public fun locations(vararg locations: Any) {
        _locations.addAll(listOf(*locations))
    }

    /**
     * A set of remote locations to deploy additional instances to and manage as part of the fleet.
     *
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     *
     * @param locations A set of remote locations to deploy additional instances to and manage as
     *   part of the fleet.
     */
    public fun locations(locations: Collection<Any>) {
        _locations.addAll(locations)
    }

    /**
     * A set of remote locations to deploy additional instances to and manage as part of the fleet.
     *
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     *
     * @param locations A set of remote locations to deploy additional instances to and manage as
     *   part of the fleet.
     */
    public fun locations(locations: IResolvable) {
        cdkBuilder.locations(locations)
    }

    /**
     * (deprecated) This parameter is no longer used.
     *
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
     *
     * @param logPaths This parameter is no longer used.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(vararg logPaths: String) {
        _logPaths.addAll(listOf(*logPaths))
    }

    /**
     * (deprecated) This parameter is no longer used.
     *
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
     *
     * @param logPaths This parameter is no longer used.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(logPaths: Collection<String>) {
        _logPaths.addAll(logPaths)
    }

    /**
     * The maximum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
     *
     * @param maxSize The maximum number of instances that are allowed in the specified fleet
     *   location.
     */
    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups)
     *
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     */
    public fun metricGroups(vararg metricGroups: String) {
        _metricGroups.addAll(listOf(*metricGroups))
    }

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups)
     *
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     */
    public fun metricGroups(metricGroups: Collection<String>) {
        _metricGroups.addAll(metricGroups)
    }

    /**
     * The minimum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
     *
     * @param minSize The minimum number of instances that are allowed in the specified fleet
     *   location.
     */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * A descriptive label that is associated with a fleet.
     *
     * Fleet names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
     *
     * @param name A descriptive label that is associated with a fleet.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The status of termination protection for active game sessions on the fleet.
     *
     * By default, this property is set to `NoProtection` .
     * * *NoProtection* - Game sessions can be terminated during active gameplay as a result of a
     *   scale-down event.
     * * *FullProtection* - Game sessions in `ACTIVE` status cannot be terminated during a
     *   scale-down event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-newgamesessionprotectionpolicy)
     *
     * @param newGameSessionProtectionPolicy The status of termination protection for active game
     *   sessions on the fleet.
     */
    public fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String) {
        cdkBuilder.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy)
    }

    /**
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the AWS
     * account that owns the VPC.
     *
     * You can find your account ID in the AWS Management Console under account settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid)
     *
     * @param peerVpcAwsAccountId Used when peering your Amazon GameLift fleet with a VPC, the
     *   unique identifier for the AWS account that owns the VPC.
     */
    public fun peerVpcAwsAccountId(peerVpcAwsAccountId: String) {
        cdkBuilder.peerVpcAwsAccountId(peerVpcAwsAccountId)
    }

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet.
     *
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the
     * [VPC Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more
     * about VPC peering in
     * [VPC Peering with Amazon GameLift Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid)
     *
     * @param peerVpcId A unique identifier for a VPC with resources to be accessed by your Amazon
     *   GameLift fleet.
     */
    public fun peerVpcId(peerVpcId: String) {
        cdkBuilder.peerVpcId(peerVpcId)
    }

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     *
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     *   individual player can create on instances in this fleet within a specified span of time.
     */
    public fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable) {
        cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy)
    }

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     *
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     *   individual player can create on instances in this fleet within a specified span of time.
     */
    public fun resourceCreationLimitPolicy(
        resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty
    ) {
        cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy)
    }

    /**
     * Instructions for how to launch and maintain server processes on instances in the fleet.
     *
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still
     * supported for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-runtimeconfiguration)
     *
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     *   instances in the fleet.
     */
    public fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
        cdkBuilder.runtimeConfiguration(runtimeConfiguration)
    }

    /**
     * Instructions for how to launch and maintain server processes on instances in the fleet.
     *
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still
     * supported for backward compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-runtimeconfiguration)
     *
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     *   instances in the fleet.
     */
    public fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty) {
        cdkBuilder.runtimeConfiguration(runtimeConfiguration)
    }

    /**
     * The unique identifier for a Realtime configuration script to be deployed on fleet instances.
     *
     * You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property cannot be changed later.
     *
     * You can't use the `!Ref` command to reference a script created with a CloudFormation template
     * for the fleet property `ScriptId` . Instead, use `Fn::GetAtt Script.Arn` or `Fn::GetAtt
     * Script.Id` to retrieve either of these properties as input for `ScriptId` . Alternatively,
     * enter a `ScriptId` string manually.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid)
     *
     * @param scriptId The unique identifier for a Realtime configuration script to be deployed on
     *   fleet instances.
     */
    public fun scriptId(scriptId: String) {
        cdkBuilder.scriptId(scriptId)
    }

    /**
     * (deprecated) This parameter is no longer used but is retained for backward compatibility.
     *
     * Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request
     * must specify either a runtime configuration or values for both ServerLaunchParameters and
     * ServerLaunchPath.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters)
     *
     * @param serverLaunchParameters This parameter is no longer used but is retained for backward
     *   compatibility.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchParameters(serverLaunchParameters: String) {
        cdkBuilder.serverLaunchParameters(serverLaunchParameters)
    }

    /**
     * (deprecated) This parameter is no longer used.
     *
     * Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that
     * specify a server launch path and launch parameters instead of a runtime configuration will
     * continue to work.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath)
     *
     * @param serverLaunchPath This parameter is no longer used.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchPath(serverLaunchPath: String) {
        cdkBuilder.serverLaunchPath(serverLaunchPath)
    }

    public fun build(): CfnFleet {
        if (_ec2InboundPermissions.isNotEmpty())
            cdkBuilder.ec2InboundPermissions(_ec2InboundPermissions)
        if (_locations.isNotEmpty()) cdkBuilder.locations(_locations)
        if (_logPaths.isNotEmpty()) cdkBuilder.logPaths(_logPaths)
        if (_metricGroups.isNotEmpty()) cdkBuilder.metricGroups(_metricGroups)
        return cdkBuilder.build()
    }
}
