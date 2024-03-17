@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .anywhereConfiguration(AnywhereConfigurationProperty.builder()
 * .cost("cost")
 * .build())
 * .applyCapacity("applyCapacity")
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
 * .instanceRoleCredentialsProvider("instanceRoleCredentialsProvider")
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
 * .scalingPolicies(List.of(ScalingPolicyProperty.builder()
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .comparisonOperator("comparisonOperator")
 * .evaluationPeriods(123)
 * .location("location")
 * .policyType("policyType")
 * .scalingAdjustment(123)
 * .scalingAdjustmentType("scalingAdjustmentType")
 * .status("status")
 * .targetConfiguration(TargetConfigurationProperty.builder()
 * .targetValue(123)
 * .build())
 * .threshold(123)
 * .updateStatus("updateStatus")
 * .build()))
 * .scriptId("scriptId")
 * .serverLaunchParameters("serverLaunchParameters")
 * .serverLaunchPath("serverLaunchPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html)
 */
public interface CfnFleetProps {
  /**
   * Amazon GameLift Anywhere configuration options.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
   */
  public fun anywhereConfiguration(): Any? = unwrap(this).getAnywhereConfiguration()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-applycapacity)
   */
  public fun applyCapacity(): String? = unwrap(this).getApplyCapacity()

  /**
   * A unique identifier for a build to be deployed on the new fleet.
   *
   * If you are deploying the fleet with a custom game build, you must specify this property. The
   * build must have been successfully uploaded to Amazon GameLift and be in a `READY` status. This
   * fleet setting cannot be changed once the fleet is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
   */
  public fun buildId(): String? = unwrap(this).getBuildId()

  /**
   * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
   *
   * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
   * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` . You
   * can't change this property after you create the fleet.
   *
   * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
   * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
   * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
   *
   *
   * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
   * enabled in an unsupported Region, fails with a 4xx error. For more information about the supported
   * Regions, see [Supported
   * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
   * Certificate Manager User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-certificateconfiguration)
   */
  public fun certificateConfiguration(): Any? = unwrap(this).getCertificateConfiguration()

  /**
   * The type of compute resource used to host your game servers.
   *
   * You can use your own compute resources with Amazon GameLift Anywhere or use Amazon EC2
   * instances with managed Amazon GameLift. By default, this property is set to `EC2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-computetype)
   */
  public fun computeType(): String? = unwrap(this).getComputeType()

  /**
   * A description for the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The number of EC2 instances that you want this fleet to host.
   *
   * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a single
   * instance. Once the fleet is active, update this value to trigger GameLift to add or remove
   * instances from the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
   */
  public fun desiredEc2Instances(): Number? = unwrap(this).getDesiredEc2Instances()

  /**
   * The allowed IP address ranges and port settings that allow inbound traffic to access game
   * sessions on this fleet.
   *
   * If the fleet is hosting a custom game build, this property must be set before players can
   * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and
   * UDP ranges.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
   */
  public fun ec2InboundPermissions(): Any? = unwrap(this).getEc2InboundPermissions()

  /**
   * The Amazon GameLift-supported Amazon EC2 instance type to use for all fleet instances.
   *
   * Instance type determines the computing resources that will be used to host your game servers,
   * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
   * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
   * Amazon EC2 instance types.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
   */
  public fun ec2InstanceType(): String? = unwrap(this).getEc2InstanceType()

  /**
   * Indicates whether to use On-Demand or Spot instances for this fleet.
   *
   * By default, this property is set to `ON_DEMAND` . Learn more about when to use [On-Demand
   * versus Spot
   * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
   * . This fleet property can't be changed after the fleet is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype)
   */
  public fun fleetType(): String? = unwrap(this).getFleetType()

  /**
   * A unique identifier for an IAM role with access permissions to other AWS services.
   *
   * Any application that runs on an instance in the fleet--including install scripts, server
   * processes, and other processes--can use these permissions to interact with AWS resources that you
   * own or have access to. For more information about using the role with your game server builds, see
   * [Communicate with other AWS resources from your
   * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn)
   */
  public fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

  /**
   * Indicates that fleet instances maintain a shared credentials file for the IAM role defined in
   * `InstanceRoleArn` .
   *
   * Shared credentials allow applications that are deployed with the game server executable to
   * communicate with other AWS resources. This property is used only when the game server is
   * integrated with the server SDK version 5.x. For more information about using shared credentials,
   * see [Communicate with other AWS resources from your
   * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolecredentialsprovider)
   */
  public fun instanceRoleCredentialsProvider(): String? =
      unwrap(this).getInstanceRoleCredentialsProvider()

  /**
   * A set of remote locations to deploy additional instances to and manage as part of the fleet.
   *
   * This parameter can only be used when creating fleets in AWS Regions that support multiple
   * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the form
   * of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home Region
   * only, don't use this parameter.
   *
   * To use this parameter, Amazon GameLift requires you to use your home location in the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
   */
  public fun locations(): Any? = unwrap(this).getLocations()

  /**
   * (deprecated) This parameter is no longer used.
   *
   * When hosting a custom game build, specify where Amazon GameLift should store log files using
   * the Amazon GameLift server API call ProcessReady()
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun logPaths(): List<String> = unwrap(this).getLogPaths() ?: emptyList()

  /**
   * The maximum number of instances that are allowed in the specified fleet location.
   *
   * If this parameter is not set, the default is 1.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
   */
  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The name of an AWS CloudWatch metric group to add this fleet to.
   *
   * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
   * existing metric group name or set a new name to create a new metric group. A fleet can be included
   * in only one metric group at a time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups)
   */
  public fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

  /**
   * The minimum number of instances that are allowed in the specified fleet location.
   *
   * If this parameter is not set, the default is 0.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
   */
  public fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * A descriptive label that is associated with a fleet.
   *
   * Fleet names do not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
   */
  public fun name(): String

  /**
   * The status of termination protection for active game sessions on the fleet.
   *
   * By default, this property is set to `NoProtection` .
   *
   * * *NoProtection* - Game sessions can be terminated during active gameplay as a result of a
   * scale-down event.
   * * *FullProtection* - Game sessions in `ACTIVE` status cannot be terminated during a scale-down
   * event.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-newgamesessionprotectionpolicy)
   */
  public fun newGameSessionProtectionPolicy(): String? =
      unwrap(this).getNewGameSessionProtectionPolicy()

  /**
   * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the AWS
   * account that owns the VPC.
   *
   * You can find your account ID in the AWS Management Console under account settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid)
   */
  public fun peerVpcAwsAccountId(): String? = unwrap(this).getPeerVpcAwsAccountId()

  /**
   * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet.
   *
   * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
   * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about VPC
   * peering in [VPC Peering with Amazon GameLift
   * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid)
   */
  public fun peerVpcId(): String? = unwrap(this).getPeerVpcId()

  /**
   * A policy that limits the number of game sessions that an individual player can create on
   * instances in this fleet within a specified span of time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
   */
  public fun resourceCreationLimitPolicy(): Any? = unwrap(this).getResourceCreationLimitPolicy()

  /**
   * Instructions for how to launch and maintain server processes on instances in the fleet.
   *
   * The runtime configuration defines one or more server process configurations, each identifying a
   * build executable or Realtime script file and the number of processes of that type to run
   * concurrently.
   *
   *
   * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using the
   * older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported for
   * backward compatibility.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-runtimeconfiguration)
   */
  public fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  /**
   * Rule that controls how a fleet is scaled.
   *
   * Scaling policies are uniquely identified by the combination of name and fleet ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
   */
  public fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

  /**
   * The unique identifier for a Realtime configuration script to be deployed on fleet instances.
   *
   * You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
   * creating the fleet. This fleet property cannot be changed later.
   *
   *
   * You can't use the `!Ref` command to reference a script created with a CloudFormation template
   * for the fleet property `ScriptId` . Instead, use `Fn::GetAtt Script.Arn` or `Fn::GetAtt Script.Id`
   * to retrieve either of these properties as input for `ScriptId` . Alternatively, enter a `ScriptId`
   * string manually.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid)
   */
  public fun scriptId(): String? = unwrap(this).getScriptId()

  /**
   * (deprecated) This parameter is no longer used but is retained for backward compatibility.
   *
   * Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request must
   * specify either a runtime configuration or values for both ServerLaunchParameters and
   * ServerLaunchPath.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun serverLaunchParameters(): String? = unwrap(this).getServerLaunchParameters()

  /**
   * (deprecated) This parameter is no longer used.
   *
   * Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that
   * specify a server launch path and launch parameters instead of a runtime configuration will
   * continue to work.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun serverLaunchPath(): String? = unwrap(this).getServerLaunchPath()

  /**
   * A builder for [CfnFleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options.
     */
    public fun anywhereConfiguration(anywhereConfiguration: IResolvable)

    /**
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options.
     */
    public fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty)

    /**
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a57775121bfaabdc7dbc0bf4d1a90036fc861b8f222bff3268b7aa4e48687e1b")
    public
        fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty.Builder.() -> Unit)

    /**
     * @param applyCapacity Current resource capacity settings in a specified fleet or location.
     * The location value might refer to a fleet's remote location or its home Region.
     *
     * *Related actions*
     *
     * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
     * |
     * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
     * |
     * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
     */
    public fun applyCapacity(applyCapacity: String)

    /**
     * @param buildId A unique identifier for a build to be deployed on the new fleet.
     * If you are deploying the fleet with a custom game build, you must specify this property. The
     * build must have been successfully uploaded to Amazon GameLift and be in a `READY` status. This
     * fleet setting cannot be changed once the fleet is created.
     */
    public fun buildId(buildId: String)

    /**
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet.
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` .
     * You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
     * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
     *
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see [Supported
     * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
     * Certificate Manager User Guide* .
     */
    public fun certificateConfiguration(certificateConfiguration: IResolvable)

    /**
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet.
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` .
     * You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
     * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
     *
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see [Supported
     * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
     * Certificate Manager User Guide* .
     */
    public
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty)

    /**
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet.
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` .
     * You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
     * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
     *
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see [Supported
     * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
     * Certificate Manager User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68f956d2a0b252401d8b1858f9cecdd3f547c4ce8139f787bf3892ffd176baab")
    public
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty.Builder.() -> Unit)

    /**
     * @param computeType The type of compute resource used to host your game servers.
     * You can use your own compute resources with Amazon GameLift Anywhere or use Amazon EC2
     * instances with managed Amazon GameLift. By default, this property is set to `EC2` .
     */
    public fun computeType(computeType: String)

    /**
     * @param description A description for the fleet.
     */
    public fun description(description: String)

    /**
     * @param desiredEc2Instances The number of EC2 instances that you want this fleet to host.
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     */
    public fun desiredEc2Instances(desiredEc2Instances: Number)

    /**
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet.
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: IResolvable)

    /**
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet.
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: List<Any>)

    /**
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet.
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     */
    public fun ec2InboundPermissions(vararg ec2InboundPermissions: Any)

    /**
     * @param ec2InstanceType The Amazon GameLift-supported Amazon EC2 instance type to use for all
     * fleet instances.
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
     * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
     * Amazon EC2 instance types.
     */
    public fun ec2InstanceType(ec2InstanceType: String)

    /**
     * @param fleetType Indicates whether to use On-Demand or Spot instances for this fleet.
     * By default, this property is set to `ON_DEMAND` . Learn more about when to use [On-Demand
     * versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . This fleet property can't be changed after the fleet is created.
     */
    public fun fleetType(fleetType: String)

    /**
     * @param instanceRoleArn A unique identifier for an IAM role with access permissions to other
     * AWS services.
     * Any application that runs on an instance in the fleet--including install scripts, server
     * processes, and other processes--can use these permissions to interact with AWS resources that
     * you own or have access to. For more information about using the role with your game server
     * builds, see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * .
     */
    public fun instanceRoleArn(instanceRoleArn: String)

    /**
     * @param instanceRoleCredentialsProvider Indicates that fleet instances maintain a shared
     * credentials file for the IAM role defined in `InstanceRoleArn` .
     * Shared credentials allow applications that are deployed with the game server executable to
     * communicate with other AWS resources. This property is used only when the game server is
     * integrated with the server SDK version 5.x. For more information about using shared credentials,
     * see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * .
     */
    public fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String)

    /**
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet.
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     */
    public fun locations(locations: IResolvable)

    /**
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet.
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     */
    public fun locations(locations: List<Any>)

    /**
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet.
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     */
    public fun locations(vararg locations: Any)

    /**
     * @param logPaths This parameter is no longer used.
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(logPaths: List<String>)

    /**
     * @param logPaths This parameter is no longer used.
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(vararg logPaths: String)

    /**
     * @param maxSize The maximum number of instances that are allowed in the specified fleet
     * location.
     * If this parameter is not set, the default is 1.
     */
    public fun maxSize(maxSize: Number)

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     */
    public fun metricGroups(metricGroups: List<String>)

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     */
    public fun metricGroups(vararg metricGroups: String)

    /**
     * @param minSize The minimum number of instances that are allowed in the specified fleet
     * location.
     * If this parameter is not set, the default is 0.
     */
    public fun minSize(minSize: Number)

    /**
     * @param name A descriptive label that is associated with a fleet. 
     * Fleet names do not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param newGameSessionProtectionPolicy The status of termination protection for active game
     * sessions on the fleet.
     * By default, this property is set to `NoProtection` .
     *
     * * *NoProtection* - Game sessions can be terminated during active gameplay as a result of a
     * scale-down event.
     * * *FullProtection* - Game sessions in `ACTIVE` status cannot be terminated during a
     * scale-down event.
     */
    public fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String)

    /**
     * @param peerVpcAwsAccountId Used when peering your Amazon GameLift fleet with a VPC, the
     * unique identifier for the AWS account that owns the VPC.
     * You can find your account ID in the AWS Management Console under account settings.
     */
    public fun peerVpcAwsAccountId(peerVpcAwsAccountId: String)

    /**
     * @param peerVpcId A unique identifier for a VPC with resources to be accessed by your Amazon
     * GameLift fleet.
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
     * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about
     * VPC peering in [VPC Peering with Amazon GameLift
     * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
     */
    public fun peerVpcId(peerVpcId: String)

    /**
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time.
     */
    public fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable)

    /**
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time.
     */
    public
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty)

    /**
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a4eb3da77f618986dbe788068f6534b94253a7ff3b4fe723a9343721f93f947")
    public
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty.Builder.() -> Unit)

    /**
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet.
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported
     * for backward compatibility.
     */
    public fun runtimeConfiguration(runtimeConfiguration: IResolvable)

    /**
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet.
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported
     * for backward compatibility.
     */
    public fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty)

    /**
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet.
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported
     * for backward compatibility.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c38cb393fece61cac243bc64d503ea4bcff0c7c0bfce608a61b496e334374d6")
    public
        fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty.Builder.() -> Unit)

    /**
     * @param scalingPolicies Rule that controls how a fleet is scaled.
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     */
    public fun scalingPolicies(scalingPolicies: IResolvable)

    /**
     * @param scalingPolicies Rule that controls how a fleet is scaled.
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     */
    public fun scalingPolicies(scalingPolicies: List<Any>)

    /**
     * @param scalingPolicies Rule that controls how a fleet is scaled.
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     */
    public fun scalingPolicies(vararg scalingPolicies: Any)

    /**
     * @param scriptId The unique identifier for a Realtime configuration script to be deployed on
     * fleet instances.
     * You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property cannot be changed later.
     *
     *
     * You can't use the `!Ref` command to reference a script created with a CloudFormation template
     * for the fleet property `ScriptId` . Instead, use `Fn::GetAtt Script.Arn` or `Fn::GetAtt
     * Script.Id` to retrieve either of these properties as input for `ScriptId` . Alternatively, enter
     * a `ScriptId` string manually.
     */
    public fun scriptId(scriptId: String)

    /**
     * @param serverLaunchParameters This parameter is no longer used but is retained for backward
     * compatibility.
     * Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request
     * must specify either a runtime configuration or values for both ServerLaunchParameters and
     * ServerLaunchPath.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchParameters(serverLaunchParameters: String)

    /**
     * @param serverLaunchPath This parameter is no longer used.
     * Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that
     * specify a server launch path and launch parameters instead of a runtime configuration will
     * continue to work.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchPath(serverLaunchPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnFleetProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnFleetProps.builder()

    /**
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options.
     */
    override fun anywhereConfiguration(anywhereConfiguration: IResolvable) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options.
     */
    override
        fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(CfnFleet.AnywhereConfigurationProperty::unwrap))
    }

    /**
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a57775121bfaabdc7dbc0bf4d1a90036fc861b8f222bff3268b7aa4e48687e1b")
    override
        fun anywhereConfiguration(anywhereConfiguration: CfnFleet.AnywhereConfigurationProperty.Builder.() -> Unit):
        Unit = anywhereConfiguration(CfnFleet.AnywhereConfigurationProperty(anywhereConfiguration))

    /**
     * @param applyCapacity Current resource capacity settings in a specified fleet or location.
     * The location value might refer to a fleet's remote location or its home Region.
     *
     * *Related actions*
     *
     * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
     * |
     * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
     * |
     * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
     */
    override fun applyCapacity(applyCapacity: String) {
      cdkBuilder.applyCapacity(applyCapacity)
    }

    /**
     * @param buildId A unique identifier for a build to be deployed on the new fleet.
     * If you are deploying the fleet with a custom game build, you must specify this property. The
     * build must have been successfully uploaded to Amazon GameLift and be in a `READY` status. This
     * fleet setting cannot be changed once the fleet is created.
     */
    override fun buildId(buildId: String) {
      cdkBuilder.buildId(buildId)
    }

    /**
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet.
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` .
     * You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
     * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
     *
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see [Supported
     * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
     * Certificate Manager User Guide* .
     */
    override fun certificateConfiguration(certificateConfiguration: IResolvable) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet.
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` .
     * You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
     * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
     *
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see [Supported
     * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
     * Certificate Manager User Guide* .
     */
    override
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(CfnFleet.CertificateConfigurationProperty::unwrap))
    }

    /**
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet.
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` .
     * You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
     * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
     *
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see [Supported
     * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
     * Certificate Manager User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68f956d2a0b252401d8b1858f9cecdd3f547c4ce8139f787bf3892ffd176baab")
    override
        fun certificateConfiguration(certificateConfiguration: CfnFleet.CertificateConfigurationProperty.Builder.() -> Unit):
        Unit =
        certificateConfiguration(CfnFleet.CertificateConfigurationProperty(certificateConfiguration))

    /**
     * @param computeType The type of compute resource used to host your game servers.
     * You can use your own compute resources with Amazon GameLift Anywhere or use Amazon EC2
     * instances with managed Amazon GameLift. By default, this property is set to `EC2` .
     */
    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    /**
     * @param description A description for the fleet.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param desiredEc2Instances The number of EC2 instances that you want this fleet to host.
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     */
    override fun desiredEc2Instances(desiredEc2Instances: Number) {
      cdkBuilder.desiredEc2Instances(desiredEc2Instances)
    }

    /**
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet.
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     */
    override fun ec2InboundPermissions(ec2InboundPermissions: IResolvable) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions.let(IResolvable::unwrap))
    }

    /**
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet.
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     */
    override fun ec2InboundPermissions(ec2InboundPermissions: List<Any>) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions)
    }

    /**
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet.
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     */
    override fun ec2InboundPermissions(vararg ec2InboundPermissions: Any): Unit =
        ec2InboundPermissions(ec2InboundPermissions.toList())

    /**
     * @param ec2InstanceType The Amazon GameLift-supported Amazon EC2 instance type to use for all
     * fleet instances.
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
     * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
     * Amazon EC2 instance types.
     */
    override fun ec2InstanceType(ec2InstanceType: String) {
      cdkBuilder.ec2InstanceType(ec2InstanceType)
    }

    /**
     * @param fleetType Indicates whether to use On-Demand or Spot instances for this fleet.
     * By default, this property is set to `ON_DEMAND` . Learn more about when to use [On-Demand
     * versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . This fleet property can't be changed after the fleet is created.
     */
    override fun fleetType(fleetType: String) {
      cdkBuilder.fleetType(fleetType)
    }

    /**
     * @param instanceRoleArn A unique identifier for an IAM role with access permissions to other
     * AWS services.
     * Any application that runs on an instance in the fleet--including install scripts, server
     * processes, and other processes--can use these permissions to interact with AWS resources that
     * you own or have access to. For more information about using the role with your game server
     * builds, see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * .
     */
    override fun instanceRoleArn(instanceRoleArn: String) {
      cdkBuilder.instanceRoleArn(instanceRoleArn)
    }

    /**
     * @param instanceRoleCredentialsProvider Indicates that fleet instances maintain a shared
     * credentials file for the IAM role defined in `InstanceRoleArn` .
     * Shared credentials allow applications that are deployed with the game server executable to
     * communicate with other AWS resources. This property is used only when the game server is
     * integrated with the server SDK version 5.x. For more information about using shared credentials,
     * see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * .
     */
    override fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String) {
      cdkBuilder.instanceRoleCredentialsProvider(instanceRoleCredentialsProvider)
    }

    /**
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet.
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     */
    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable::unwrap))
    }

    /**
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet.
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     */
    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations)
    }

    /**
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet.
     * This parameter can only be used when creating fleets in AWS Regions that support multiple
     * locations. You can add any Amazon GameLift-supported AWS Region as a remote location, in the
     * form of an AWS Region code such as `us-west-2` . To create a fleet with instances in the home
     * Region only, don't use this parameter.
     *
     * To use this parameter, Amazon GameLift requires you to use your home location in the request.
     */
    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    /**
     * @param logPaths This parameter is no longer used.
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(logPaths: List<String>) {
      cdkBuilder.logPaths(logPaths)
    }

    /**
     * @param logPaths This parameter is no longer used.
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(vararg logPaths: String): Unit = logPaths(logPaths.toList())

    /**
     * @param maxSize The maximum number of instances that are allowed in the specified fleet
     * location.
     * If this parameter is not set, the default is 1.
     */
    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     */
    override fun metricGroups(metricGroups: List<String>) {
      cdkBuilder.metricGroups(metricGroups)
    }

    /**
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to.
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     */
    override fun metricGroups(vararg metricGroups: String): Unit =
        metricGroups(metricGroups.toList())

    /**
     * @param minSize The minimum number of instances that are allowed in the specified fleet
     * location.
     * If this parameter is not set, the default is 0.
     */
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * @param name A descriptive label that is associated with a fleet. 
     * Fleet names do not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param newGameSessionProtectionPolicy The status of termination protection for active game
     * sessions on the fleet.
     * By default, this property is set to `NoProtection` .
     *
     * * *NoProtection* - Game sessions can be terminated during active gameplay as a result of a
     * scale-down event.
     * * *FullProtection* - Game sessions in `ACTIVE` status cannot be terminated during a
     * scale-down event.
     */
    override fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String) {
      cdkBuilder.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy)
    }

    /**
     * @param peerVpcAwsAccountId Used when peering your Amazon GameLift fleet with a VPC, the
     * unique identifier for the AWS account that owns the VPC.
     * You can find your account ID in the AWS Management Console under account settings.
     */
    override fun peerVpcAwsAccountId(peerVpcAwsAccountId: String) {
      cdkBuilder.peerVpcAwsAccountId(peerVpcAwsAccountId)
    }

    /**
     * @param peerVpcId A unique identifier for a VPC with resources to be accessed by your Amazon
     * GameLift fleet.
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
     * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about
     * VPC peering in [VPC Peering with Amazon GameLift
     * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
     */
    override fun peerVpcId(peerVpcId: String) {
      cdkBuilder.peerVpcId(peerVpcId)
    }

    /**
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time.
     */
    override fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable) {
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time.
     */
    override
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty) {
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(CfnFleet.ResourceCreationLimitPolicyProperty::unwrap))
    }

    /**
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a4eb3da77f618986dbe788068f6534b94253a7ff3b4fe723a9343721f93f947")
    override
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: CfnFleet.ResourceCreationLimitPolicyProperty.Builder.() -> Unit):
        Unit =
        resourceCreationLimitPolicy(CfnFleet.ResourceCreationLimitPolicyProperty(resourceCreationLimitPolicy))

    /**
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet.
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported
     * for backward compatibility.
     */
    override fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet.
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported
     * for backward compatibility.
     */
    override fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(CfnFleet.RuntimeConfigurationProperty::unwrap))
    }

    /**
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet.
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported
     * for backward compatibility.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c38cb393fece61cac243bc64d503ea4bcff0c7c0bfce608a61b496e334374d6")
    override
        fun runtimeConfiguration(runtimeConfiguration: CfnFleet.RuntimeConfigurationProperty.Builder.() -> Unit):
        Unit = runtimeConfiguration(CfnFleet.RuntimeConfigurationProperty(runtimeConfiguration))

    /**
     * @param scalingPolicies Rule that controls how a fleet is scaled.
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     */
    override fun scalingPolicies(scalingPolicies: IResolvable) {
      cdkBuilder.scalingPolicies(scalingPolicies.let(IResolvable::unwrap))
    }

    /**
     * @param scalingPolicies Rule that controls how a fleet is scaled.
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     */
    override fun scalingPolicies(scalingPolicies: List<Any>) {
      cdkBuilder.scalingPolicies(scalingPolicies)
    }

    /**
     * @param scalingPolicies Rule that controls how a fleet is scaled.
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     */
    override fun scalingPolicies(vararg scalingPolicies: Any): Unit =
        scalingPolicies(scalingPolicies.toList())

    /**
     * @param scriptId The unique identifier for a Realtime configuration script to be deployed on
     * fleet instances.
     * You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property cannot be changed later.
     *
     *
     * You can't use the `!Ref` command to reference a script created with a CloudFormation template
     * for the fleet property `ScriptId` . Instead, use `Fn::GetAtt Script.Arn` or `Fn::GetAtt
     * Script.Id` to retrieve either of these properties as input for `ScriptId` . Alternatively, enter
     * a `ScriptId` string manually.
     */
    override fun scriptId(scriptId: String) {
      cdkBuilder.scriptId(scriptId)
    }

    /**
     * @param serverLaunchParameters This parameter is no longer used but is retained for backward
     * compatibility.
     * Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request
     * must specify either a runtime configuration or values for both ServerLaunchParameters and
     * ServerLaunchPath.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchParameters(serverLaunchParameters: String) {
      cdkBuilder.serverLaunchParameters(serverLaunchParameters)
    }

    /**
     * @param serverLaunchPath This parameter is no longer used.
     * Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that
     * specify a server launch path and launch parameters instead of a runtime configuration will
     * continue to work.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchPath(serverLaunchPath: String) {
      cdkBuilder.serverLaunchPath(serverLaunchPath)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnFleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnFleetProps,
  ) : CdkObject(cdkObject), CfnFleetProps {
    /**
     * Amazon GameLift Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     */
    override fun anywhereConfiguration(): Any? = unwrap(this).getAnywhereConfiguration()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-applycapacity)
     */
    override fun applyCapacity(): String? = unwrap(this).getApplyCapacity()

    /**
     * A unique identifier for a build to be deployed on the new fleet.
     *
     * If you are deploying the fleet with a custom game build, you must specify this property. The
     * build must have been successfully uploaded to Amazon GameLift and be in a `READY` status. This
     * fleet setting cannot be changed once the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
     */
    override fun buildId(): String? = unwrap(this).getBuildId()

    /**
     * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift uses the certificates to encrypt traffic between game clients and the game
     * servers running on Amazon GameLift. By default, the `CertificateConfiguration` is `DISABLED` .
     * You can't change this property after you create the fleet.
     *
     * AWS Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can
     * cause fleets to fail, preventing players from connecting to instances in the fleet. We recommend
     * you replace fleets before 13 months, consider using fleet aliases for a smooth transition.
     *
     *
     * ACM isn't available in all AWS regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the
     * supported Regions, see [Supported
     * Regions](https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html) in the *AWS
     * Certificate Manager User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-certificateconfiguration)
     */
    override fun certificateConfiguration(): Any? = unwrap(this).getCertificateConfiguration()

    /**
     * The type of compute resource used to host your game servers.
     *
     * You can use your own compute resources with Amazon GameLift Anywhere or use Amazon EC2
     * instances with managed Amazon GameLift. By default, this property is set to `EC2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-computetype)
     */
    override fun computeType(): String? = unwrap(this).getComputeType()

    /**
     * A description for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The number of EC2 instances that you want this fleet to host.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
     */
    override fun desiredEc2Instances(): Number? = unwrap(this).getDesiredEc2Instances()

    /**
     * The allowed IP address ranges and port settings that allow inbound traffic to access game
     * sessions on this fleet.
     *
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     */
    override fun ec2InboundPermissions(): Any? = unwrap(this).getEc2InboundPermissions()

    /**
     * The Amazon GameLift-supported Amazon EC2 instance type to use for all fleet instances.
     *
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
     * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
     * Amazon EC2 instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
     */
    override fun ec2InstanceType(): String? = unwrap(this).getEc2InstanceType()

    /**
     * Indicates whether to use On-Demand or Spot instances for this fleet.
     *
     * By default, this property is set to `ON_DEMAND` . Learn more about when to use [On-Demand
     * versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . This fleet property can't be changed after the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype)
     */
    override fun fleetType(): String? = unwrap(this).getFleetType()

    /**
     * A unique identifier for an IAM role with access permissions to other AWS services.
     *
     * Any application that runs on an instance in the fleet--including install scripts, server
     * processes, and other processes--can use these permissions to interact with AWS resources that
     * you own or have access to. For more information about using the role with your game server
     * builds, see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn)
     */
    override fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

    /**
     * Indicates that fleet instances maintain a shared credentials file for the IAM role defined in
     * `InstanceRoleArn` .
     *
     * Shared credentials allow applications that are deployed with the game server executable to
     * communicate with other AWS resources. This property is used only when the game server is
     * integrated with the server SDK version 5.x. For more information about using shared credentials,
     * see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolecredentialsprovider)
     */
    override fun instanceRoleCredentialsProvider(): String? =
        unwrap(this).getInstanceRoleCredentialsProvider()

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
     */
    override fun locations(): Any? = unwrap(this).getLocations()

    /**
     * (deprecated) This parameter is no longer used.
     *
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(): List<String> = unwrap(this).getLogPaths() ?: emptyList()

    /**
     * The maximum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
     */
    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups)
     */
    override fun metricGroups(): List<String> = unwrap(this).getMetricGroups() ?: emptyList()

    /**
     * The minimum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
     */
    override fun minSize(): Number? = unwrap(this).getMinSize()

    /**
     * A descriptive label that is associated with a fleet.
     *
     * Fleet names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The status of termination protection for active game sessions on the fleet.
     *
     * By default, this property is set to `NoProtection` .
     *
     * * *NoProtection* - Game sessions can be terminated during active gameplay as a result of a
     * scale-down event.
     * * *FullProtection* - Game sessions in `ACTIVE` status cannot be terminated during a
     * scale-down event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-newgamesessionprotectionpolicy)
     */
    override fun newGameSessionProtectionPolicy(): String? =
        unwrap(this).getNewGameSessionProtectionPolicy()

    /**
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the AWS
     * account that owns the VPC.
     *
     * You can find your account ID in the AWS Management Console under account settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid)
     */
    override fun peerVpcAwsAccountId(): String? = unwrap(this).getPeerVpcAwsAccountId()

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet.
     *
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
     * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about
     * VPC peering in [VPC Peering with Amazon GameLift
     * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid)
     */
    override fun peerVpcId(): String? = unwrap(this).getPeerVpcId()

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     */
    override fun resourceCreationLimitPolicy(): Any? = unwrap(this).getResourceCreationLimitPolicy()

    /**
     * Instructions for how to launch and maintain server processes on instances in the fleet.
     *
     * The runtime configuration defines one or more server process configurations, each identifying
     * a build executable or Realtime script file and the number of processes of that type to run
     * concurrently.
     *
     *
     * The `RuntimeConfiguration` parameter is required unless the fleet is being configured using
     * the older parameters `ServerLaunchPath` and `ServerLaunchParameters` , which are still supported
     * for backward compatibility.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-runtimeconfiguration)
     */
    override fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

    /**
     * Rule that controls how a fleet is scaled.
     *
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
     */
    override fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

    /**
     * The unique identifier for a Realtime configuration script to be deployed on fleet instances.
     *
     * You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property cannot be changed later.
     *
     *
     * You can't use the `!Ref` command to reference a script created with a CloudFormation template
     * for the fleet property `ScriptId` . Instead, use `Fn::GetAtt Script.Arn` or `Fn::GetAtt
     * Script.Id` to retrieve either of these properties as input for `ScriptId` . Alternatively, enter
     * a `ScriptId` string manually.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid)
     */
    override fun scriptId(): String? = unwrap(this).getScriptId()

    /**
     * (deprecated) This parameter is no longer used but is retained for backward compatibility.
     *
     * Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request
     * must specify either a runtime configuration or values for both ServerLaunchParameters and
     * ServerLaunchPath.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchParameters(): String? = unwrap(this).getServerLaunchParameters()

    /**
     * (deprecated) This parameter is no longer used.
     *
     * Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that
     * specify a server launch path and launch parameters instead of a runtime configuration will
     * continue to work.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchPath(): String? = unwrap(this).getServerLaunchPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleetProps):
        CfnFleetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFleetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetProps):
        software.amazon.awscdk.services.gamelift.CfnFleetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnFleetProps
  }
}
