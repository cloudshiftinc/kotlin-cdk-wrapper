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
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnFleet cfnFleet = CfnFleet.Builder.create(this, "MyCfnFleet")
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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html)
 */
public open class CfnFleet(
  cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps,
  ) :
      this(software.amazon.awscdk.services.gamelift.CfnFleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFleetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFleetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFleetProps(props)
  )

  /**
   * Amazon GameLift Servers Anywhere configuration options.
   */
  public open fun anywhereConfiguration(): Any? = unwrap(this).getAnywhereConfiguration()

  /**
   * Amazon GameLift Servers Anywhere configuration options.
   */
  public open fun anywhereConfiguration(`value`: IResolvable) {
    unwrap(this).setAnywhereConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Amazon GameLift Servers Anywhere configuration options.
   */
  public open fun anywhereConfiguration(`value`: AnywhereConfigurationProperty) {
    unwrap(this).setAnywhereConfiguration(`value`.let(AnywhereConfigurationProperty.Companion::unwrap))
  }

  /**
   * Amazon GameLift Servers Anywhere configuration options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3aaecba63b51f1ca2dbb498f0ba4045d16345fe44a17a948e144d8540985afa8")
  public open fun anywhereConfiguration(`value`: AnywhereConfigurationProperty.Builder.() -> Unit):
      Unit = anywhereConfiguration(AnywhereConfigurationProperty(`value`))

  /**
   * Current resource capacity settings for managed EC2 fleets and managed container fleets.
   */
  public open fun applyCapacity(): String? = unwrap(this).getApplyCapacity()

  /**
   * Current resource capacity settings for managed EC2 fleets and managed container fleets.
   */
  public open fun applyCapacity(`value`: String) {
    unwrap(this).setApplyCapacity(`value`)
  }

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
   * A unique identifier for the fleet.
   */
  public open fun attrFleetId(): String = unwrap(this).getAttrFleetId()

  /**
   * A unique identifier for a build to be deployed on the new fleet.
   */
  public open fun buildId(): String? = unwrap(this).getBuildId()

  /**
   * A unique identifier for a build to be deployed on the new fleet.
   */
  public open fun buildId(`value`: String) {
    unwrap(this).setBuildId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
   */
  public open fun certificateConfiguration(): Any? = unwrap(this).getCertificateConfiguration()

  /**
   * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
   */
  public open fun certificateConfiguration(`value`: IResolvable) {
    unwrap(this).setCertificateConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
   */
  public open fun certificateConfiguration(`value`: CertificateConfigurationProperty) {
    unwrap(this).setCertificateConfiguration(`value`.let(CertificateConfigurationProperty.Companion::unwrap))
  }

  /**
   * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("319b28c07acf889cfcadea422d5c26529c6dd665089cedfad34223ba8c99ceda")
  public open
      fun certificateConfiguration(`value`: CertificateConfigurationProperty.Builder.() -> Unit):
      Unit = certificateConfiguration(CertificateConfigurationProperty(`value`))

  /**
   * The type of compute resource used to host your game servers.
   */
  public open fun computeType(): String? = unwrap(this).getComputeType()

  /**
   * The type of compute resource used to host your game servers.
   */
  public open fun computeType(`value`: String) {
    unwrap(this).setComputeType(`value`)
  }

  /**
   * A description for the fleet.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the fleet.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * (deprecated) [DEPRECATED] The number of EC2 instances that you want this fleet to host.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun desiredEc2Instances(): Number? = unwrap(this).getDesiredEc2Instances()

  /**
   * (deprecated) [DEPRECATED] The number of EC2 instances that you want this fleet to host.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun desiredEc2Instances(`value`: Number) {
    unwrap(this).setDesiredEc2Instances(`value`)
  }

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun ec2InboundPermissions(): Any? = unwrap(this).getEc2InboundPermissions()

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun ec2InboundPermissions(`value`: IResolvable) {
    unwrap(this).setEc2InboundPermissions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun ec2InboundPermissions(`value`: List<Any>) {
    unwrap(this).setEc2InboundPermissions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The IP address ranges and port settings that allow inbound traffic to access game server
   * processes and other processes on this fleet.
   */
  public open fun ec2InboundPermissions(vararg `value`: Any): Unit =
      ec2InboundPermissions(`value`.toList())

  /**
   * The Amazon GameLift Servers-supported Amazon EC2 instance type to use with managed EC2 fleets.
   */
  public open fun ec2InstanceType(): String? = unwrap(this).getEc2InstanceType()

  /**
   * The Amazon GameLift Servers-supported Amazon EC2 instance type to use with managed EC2 fleets.
   */
  public open fun ec2InstanceType(`value`: String) {
    unwrap(this).setEc2InstanceType(`value`)
  }

  /**
   * Indicates whether to use On-Demand or Spot instances for this fleet.
   */
  public open fun fleetType(): String? = unwrap(this).getFleetType()

  /**
   * Indicates whether to use On-Demand or Spot instances for this fleet.
   */
  public open fun fleetType(`value`: String) {
    unwrap(this).setFleetType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A unique identifier for an IAM role that manages access to your AWS services.
   */
  public open fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

  /**
   * A unique identifier for an IAM role that manages access to your AWS services.
   */
  public open fun instanceRoleArn(`value`: String) {
    unwrap(this).setInstanceRoleArn(`value`)
  }

  /**
   * Indicates that fleet instances maintain a shared credentials file for the IAM role defined in
   * `InstanceRoleArn` .
   */
  public open fun instanceRoleCredentialsProvider(): String? =
      unwrap(this).getInstanceRoleCredentialsProvider()

  /**
   * Indicates that fleet instances maintain a shared credentials file for the IAM role defined in
   * `InstanceRoleArn` .
   */
  public open fun instanceRoleCredentialsProvider(`value`: String) {
    unwrap(this).setInstanceRoleCredentialsProvider(`value`)
  }

  /**
   * A set of remote locations to deploy additional instances to and manage as a multi-location
   * fleet.
   */
  public open fun locations(): Any? = unwrap(this).getLocations()

  /**
   * A set of remote locations to deploy additional instances to and manage as a multi-location
   * fleet.
   */
  public open fun locations(`value`: IResolvable) {
    unwrap(this).setLocations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of remote locations to deploy additional instances to and manage as a multi-location
   * fleet.
   */
  public open fun locations(`value`: List<Any>) {
    unwrap(this).setLocations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A set of remote locations to deploy additional instances to and manage as a multi-location
   * fleet.
   */
  public open fun locations(vararg `value`: Any): Unit = locations(`value`.toList())

  /**
   * (deprecated) This parameter is no longer used.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun logPaths(): List<String> = unwrap(this).getLogPaths() ?: emptyList()

  /**
   * (deprecated) This parameter is no longer used.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun logPaths(`value`: List<String>) {
    unwrap(this).setLogPaths(`value`)
  }

  /**
   * (deprecated) This parameter is no longer used.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun logPaths(vararg `value`: String): Unit = logPaths(`value`.toList())

  /**
   * (deprecated) [DEPRECATED] The maximum value that is allowed for the fleet's instance count.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * (deprecated) [DEPRECATED] The maximum value that is allowed for the fleet's instance count.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

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
   * (deprecated) [DEPRECATED] The minimum value allowed for the fleet's instance count.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * (deprecated) [DEPRECATED] The minimum value allowed for the fleet's instance count.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  /**
   * A descriptive label that is associated with a fleet.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A descriptive label that is associated with a fleet.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The status of termination protection for active game sessions on the fleet.
   */
  public open fun newGameSessionProtectionPolicy(): String? =
      unwrap(this).getNewGameSessionProtectionPolicy()

  /**
   * The status of termination protection for active game sessions on the fleet.
   */
  public open fun newGameSessionProtectionPolicy(`value`: String) {
    unwrap(this).setNewGameSessionProtectionPolicy(`value`)
  }

  /**
   * Used when peering your Amazon GameLift Servers fleet with a VPC, the unique identifier for the
   * AWS account that owns the VPC.
   */
  public open fun peerVpcAwsAccountId(): String? = unwrap(this).getPeerVpcAwsAccountId()

  /**
   * Used when peering your Amazon GameLift Servers fleet with a VPC, the unique identifier for the
   * AWS account that owns the VPC.
   */
  public open fun peerVpcAwsAccountId(`value`: String) {
    unwrap(this).setPeerVpcAwsAccountId(`value`)
  }

  /**
   * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift Servers
   * fleet.
   */
  public open fun peerVpcId(): String? = unwrap(this).getPeerVpcId()

  /**
   * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift Servers
   * fleet.
   */
  public open fun peerVpcId(`value`: String) {
    unwrap(this).setPeerVpcId(`value`)
  }

  /**
   * A policy that limits the number of game sessions that an individual player can create on
   * instances in this fleet within a specified span of time.
   */
  public open fun resourceCreationLimitPolicy(): Any? =
      unwrap(this).getResourceCreationLimitPolicy()

  /**
   * A policy that limits the number of game sessions that an individual player can create on
   * instances in this fleet within a specified span of time.
   */
  public open fun resourceCreationLimitPolicy(`value`: IResolvable) {
    unwrap(this).setResourceCreationLimitPolicy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A policy that limits the number of game sessions that an individual player can create on
   * instances in this fleet within a specified span of time.
   */
  public open fun resourceCreationLimitPolicy(`value`: ResourceCreationLimitPolicyProperty) {
    unwrap(this).setResourceCreationLimitPolicy(`value`.let(ResourceCreationLimitPolicyProperty.Companion::unwrap))
  }

  /**
   * A policy that limits the number of game sessions that an individual player can create on
   * instances in this fleet within a specified span of time.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7041eef8c71d79be352f6ecfb03735949670f7522fb3ebcec844b60b20889fb4")
  public open
      fun resourceCreationLimitPolicy(`value`: ResourceCreationLimitPolicyProperty.Builder.() -> Unit):
      Unit = resourceCreationLimitPolicy(ResourceCreationLimitPolicyProperty(`value`))

  /**
   * Instructions for how to launch and maintain server processes on instances in the fleet.
   */
  public open fun runtimeConfiguration(): Any? = unwrap(this).getRuntimeConfiguration()

  /**
   * Instructions for how to launch and maintain server processes on instances in the fleet.
   */
  public open fun runtimeConfiguration(`value`: IResolvable) {
    unwrap(this).setRuntimeConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Instructions for how to launch and maintain server processes on instances in the fleet.
   */
  public open fun runtimeConfiguration(`value`: RuntimeConfigurationProperty) {
    unwrap(this).setRuntimeConfiguration(`value`.let(RuntimeConfigurationProperty.Companion::unwrap))
  }

  /**
   * Instructions for how to launch and maintain server processes on instances in the fleet.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8ba44b8b597ac96e666a90a90473f18c03dbb2f22badf442740b8a4606b46df5")
  public open fun runtimeConfiguration(`value`: RuntimeConfigurationProperty.Builder.() -> Unit):
      Unit = runtimeConfiguration(RuntimeConfigurationProperty(`value`))

  /**
   * Rule that controls how a fleet is scaled.
   */
  public open fun scalingPolicies(): Any? = unwrap(this).getScalingPolicies()

  /**
   * Rule that controls how a fleet is scaled.
   */
  public open fun scalingPolicies(`value`: IResolvable) {
    unwrap(this).setScalingPolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Rule that controls how a fleet is scaled.
   */
  public open fun scalingPolicies(`value`: List<Any>) {
    unwrap(this).setScalingPolicies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Rule that controls how a fleet is scaled.
   */
  public open fun scalingPolicies(vararg `value`: Any): Unit = scalingPolicies(`value`.toList())

  /**
   * The unique identifier for a Realtime configuration script to be deployed on fleet instances.
   */
  public open fun scriptId(): String? = unwrap(this).getScriptId()

  /**
   * The unique identifier for a Realtime configuration script to be deployed on fleet instances.
   */
  public open fun scriptId(`value`: String) {
    unwrap(this).setScriptId(`value`)
  }

  /**
   * (deprecated) This parameter is no longer used but is retained for backward compatibility.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchParameters(): String? = unwrap(this).getServerLaunchParameters()

  /**
   * (deprecated) This parameter is no longer used but is retained for backward compatibility.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchParameters(`value`: String) {
    unwrap(this).setServerLaunchParameters(`value`)
  }

  /**
   * (deprecated) This parameter is no longer used.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchPath(): String? = unwrap(this).getServerLaunchPath()

  /**
   * (deprecated) This parameter is no longer used.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun serverLaunchPath(`value`: String) {
    unwrap(this).setServerLaunchPath(`value`)
  }

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Amazon GameLift Servers Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Servers Anywhere configuration options. 
     */
    public fun anywhereConfiguration(anywhereConfiguration: IResolvable)

    /**
     * Amazon GameLift Servers Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Servers Anywhere configuration options. 
     */
    public fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty)

    /**
     * Amazon GameLift Servers Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Servers Anywhere configuration options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2661928c18c4a178bc7a01449bf72729fb5248293bfdd9f3f77a154dd4333b9")
    public
        fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty.Builder.() -> Unit)

    /**
     * Current resource capacity settings for managed EC2 fleets and managed container fleets.
     *
     * For multi-location fleets, location values might refer to a fleet's remote location or its
     * home Region.
     *
     * *Returned by:*
     * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
     * ,
     * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
     * ,
     * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-applycapacity)
     * @param applyCapacity Current resource capacity settings for managed EC2 fleets and managed
     * container fleets. 
     */
    public fun applyCapacity(applyCapacity: String)

    /**
     * A unique identifier for a build to be deployed on the new fleet.
     *
     * If you are deploying the fleet with a custom game build, you must specify this property. The
     * build must have been successfully uploaded to Amazon GameLift and be in a `READY` status. This
     * fleet setting cannot be changed once the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
     * @param buildId A unique identifier for a build to be deployed on the new fleet. 
     */
    public fun buildId(buildId: String)

    /**
     * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift Servers uses the certificates to encrypt traffic between game clients and the
     * game servers running on Amazon GameLift Servers. By default, the `CertificateConfiguration` is
     * `DISABLED` . You can't change this property after you create the fleet.
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
     * @param certificateConfiguration Prompts Amazon GameLift Servers to generate a TLS/SSL
     * certificate for the fleet. 
     */
    public fun certificateConfiguration(certificateConfiguration: IResolvable)

    /**
     * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift Servers uses the certificates to encrypt traffic between game clients and the
     * game servers running on Amazon GameLift Servers. By default, the `CertificateConfiguration` is
     * `DISABLED` . You can't change this property after you create the fleet.
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
     * @param certificateConfiguration Prompts Amazon GameLift Servers to generate a TLS/SSL
     * certificate for the fleet. 
     */
    public fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty)

    /**
     * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift Servers uses the certificates to encrypt traffic between game clients and the
     * game servers running on Amazon GameLift Servers. By default, the `CertificateConfiguration` is
     * `DISABLED` . You can't change this property after you create the fleet.
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
     * @param certificateConfiguration Prompts Amazon GameLift Servers to generate a TLS/SSL
     * certificate for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7ad6c4917736d0c5335363f8da4f8d65e0ee9c6a1b8e8f30c887c572ccf8fa0")
    public
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty.Builder.() -> Unit)

    /**
     * The type of compute resource used to host your game servers.
     *
     * * `EC2` – The game server build is deployed to Amazon EC2 instances for cloud hosting. This
     * is the default setting.
     * * `ANYWHERE` – Game servers and supporting software are deployed to compute resources that
     * you provide and manage. With this compute type, you can also set the `AnywhereConfiguration`
     * parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-computetype)
     * @param computeType The type of compute resource used to host your game servers. 
     */
    public fun computeType(computeType: String)

    /**
     * A description for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
     * @param description A description for the fleet. 
     */
    public fun description(description: String)

    /**
     * (deprecated) [DEPRECATED] The number of EC2 instances that you want this fleet to host.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
     * @deprecated this property has been deprecated
     * @param desiredEc2Instances [DEPRECATED] The number of EC2 instances that you want this fleet
     * to host. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun desiredEc2Instances(desiredEc2Instances: Number)

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * Set this parameter for managed EC2 fleets. You can leave this parameter empty when creating
     * the fleet, but you must call
     * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetPortSettings) to set
     * it before players can connect to game sessions. As a best practice, we recommend opening ports
     * for remote access only when you need them and closing them when you're finished. For Amazon
     * GameLift Servers Realtime fleets, Amazon GameLift Servers automatically sets TCP and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: IResolvable)

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * Set this parameter for managed EC2 fleets. You can leave this parameter empty when creating
     * the fleet, but you must call
     * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetPortSettings) to set
     * it before players can connect to game sessions. As a best practice, we recommend opening ports
     * for remote access only when you need them and closing them when you're finished. For Amazon
     * GameLift Servers Realtime fleets, Amazon GameLift Servers automatically sets TCP and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: List<Any>)

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * Set this parameter for managed EC2 fleets. You can leave this parameter empty when creating
     * the fleet, but you must call
     * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetPortSettings) to set
     * it before players can connect to game sessions. As a best practice, we recommend opening ports
     * for remote access only when you need them and closing them when you're finished. For Amazon
     * GameLift Servers Realtime fleets, Amazon GameLift Servers automatically sets TCP and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    public fun ec2InboundPermissions(vararg ec2InboundPermissions: Any)

    /**
     * The Amazon GameLift Servers-supported Amazon EC2 instance type to use with managed EC2
     * fleets.
     *
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
     * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
     * Amazon EC2 instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
     * @param ec2InstanceType The Amazon GameLift Servers-supported Amazon EC2 instance type to use
     * with managed EC2 fleets. 
     */
    public fun ec2InstanceType(ec2InstanceType: String)

    /**
     * Indicates whether to use On-Demand or Spot instances for this fleet.
     *
     * By default, this property is set to `ON_DEMAND` . Learn more about when to use [On-Demand
     * versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . This fleet property can't be changed after the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype)
     * @param fleetType Indicates whether to use On-Demand or Spot instances for this fleet. 
     */
    public fun fleetType(fleetType: String)

    /**
     * A unique identifier for an IAM role that manages access to your AWS services.
     *
     * With an instance role ARN set, any application that runs on an instance in this fleet can
     * assume the role, including install scripts, server processes, and daemons (background
     * processes). Create a role or look up a role's ARN by using the [IAM
     * dashboard](https://docs.aws.amazon.com/iam/) in the AWS Management Console . Learn more about
     * using on-box credentials for your game servers at [Access external resources from a game
     * server](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * . This attribute is used with fleets where `ComputeType` is `EC2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn)
     * @param instanceRoleArn A unique identifier for an IAM role that manages access to your AWS
     * services. 
     */
    public fun instanceRoleArn(instanceRoleArn: String)

    /**
     * Indicates that fleet instances maintain a shared credentials file for the IAM role defined in
     * `InstanceRoleArn` .
     *
     * Shared credentials allow applications that are deployed with the game server executable to
     * communicate with other AWS resources. This property is used only when the game server is
     * integrated with the server SDK version 5.x. For more information about using shared credentials,
     * see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * . This attribute is used with fleets where `ComputeType` is `EC2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolecredentialsprovider)
     * @param instanceRoleCredentialsProvider Indicates that fleet instances maintain a shared
     * credentials file for the IAM role defined in `InstanceRoleArn` . 
     */
    public fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String)

    /**
     * A set of remote locations to deploy additional instances to and manage as a multi-location
     * fleet.
     *
     * Use this parameter when creating a fleet in AWS Regions that support multiple locations. You
     * can add any AWS Region or Local Zone that's supported by Amazon GameLift Servers. Provide a list
     * of one or more AWS Region codes, such as `us-west-2` , or Local Zone names. When using this
     * parameter, Amazon GameLift Servers requires you to include your home location in the request.
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     * @param locations A set of remote locations to deploy additional instances to and manage as a
     * multi-location fleet. 
     */
    public fun locations(locations: IResolvable)

    /**
     * A set of remote locations to deploy additional instances to and manage as a multi-location
     * fleet.
     *
     * Use this parameter when creating a fleet in AWS Regions that support multiple locations. You
     * can add any AWS Region or Local Zone that's supported by Amazon GameLift Servers. Provide a list
     * of one or more AWS Region codes, such as `us-west-2` , or Local Zone names. When using this
     * parameter, Amazon GameLift Servers requires you to include your home location in the request.
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     * @param locations A set of remote locations to deploy additional instances to and manage as a
     * multi-location fleet. 
     */
    public fun locations(locations: List<Any>)

    /**
     * A set of remote locations to deploy additional instances to and manage as a multi-location
     * fleet.
     *
     * Use this parameter when creating a fleet in AWS Regions that support multiple locations. You
     * can add any AWS Region or Local Zone that's supported by Amazon GameLift Servers. Provide a list
     * of one or more AWS Region codes, such as `us-west-2` , or Local Zone names. When using this
     * parameter, Amazon GameLift Servers requires you to include your home location in the request.
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     * @param locations A set of remote locations to deploy additional instances to and manage as a
     * multi-location fleet. 
     */
    public fun locations(vararg locations: Any)

    /**
     * (deprecated) This parameter is no longer used.
     *
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
     * @deprecated this property has been deprecated
     * @param logPaths This parameter is no longer used. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(logPaths: List<String>)

    /**
     * (deprecated) This parameter is no longer used.
     *
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
     * @deprecated this property has been deprecated
     * @param logPaths This parameter is no longer used. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logPaths(vararg logPaths: String)

    /**
     * (deprecated) [DEPRECATED] The maximum value that is allowed for the fleet's instance count.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1". Once the fleet is
     * active, you can change this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
     * @deprecated this property has been deprecated
     * @param maxSize [DEPRECATED] The maximum value that is allowed for the fleet's instance count.
     * 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun maxSize(maxSize: Number)

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups)
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    public fun metricGroups(metricGroups: List<String>)

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups)
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    public fun metricGroups(vararg metricGroups: String)

    /**
     * (deprecated) [DEPRECATED] The minimum value allowed for the fleet's instance count.
     *
     * When creating a new fleet, GameLift automatically sets this value to "0". After the fleet is
     * active, you can change this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
     * @deprecated this property has been deprecated
     * @param minSize [DEPRECATED] The minimum value allowed for the fleet's instance count. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun minSize(minSize: Number)

    /**
     * A descriptive label that is associated with a fleet.
     *
     * Fleet names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
     * @param name A descriptive label that is associated with a fleet. 
     */
    public fun name(name: String)

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
     * @param newGameSessionProtectionPolicy The status of termination protection for active game
     * sessions on the fleet. 
     */
    public fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String)

    /**
     * Used when peering your Amazon GameLift Servers fleet with a VPC, the unique identifier for
     * the AWS account that owns the VPC.
     *
     * You can find your account ID in the AWS Management Console under account settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid)
     * @param peerVpcAwsAccountId Used when peering your Amazon GameLift Servers fleet with a VPC,
     * the unique identifier for the AWS account that owns the VPC. 
     */
    public fun peerVpcAwsAccountId(peerVpcAwsAccountId: String)

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift Servers
     * fleet.
     *
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
     * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about
     * VPC peering in [VPC Peering with Amazon GameLift Servers
     * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid)
     * @param peerVpcId A unique identifier for a VPC with resources to be accessed by your Amazon
     * GameLift Servers fleet. 
     */
    public fun peerVpcId(peerVpcId: String)

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time. 
     */
    public fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable)

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time. 
     */
    public
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty)

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a16622527c205d3f8f7e8bf9ba63ad02b40fec4c20212321e8fda075d93f553f")
    public
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty.Builder.() -> Unit)

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
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet. 
     */
    public fun runtimeConfiguration(runtimeConfiguration: IResolvable)

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
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet. 
     */
    public fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty)

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
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0627cf5d1239128484c5e236ab999e30df9307e33f611a0bc163bf3a7b6d62d")
    public
        fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty.Builder.() -> Unit)

    /**
     * Rule that controls how a fleet is scaled.
     *
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
     * @param scalingPolicies Rule that controls how a fleet is scaled. 
     */
    public fun scalingPolicies(scalingPolicies: IResolvable)

    /**
     * Rule that controls how a fleet is scaled.
     *
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
     * @param scalingPolicies Rule that controls how a fleet is scaled. 
     */
    public fun scalingPolicies(scalingPolicies: List<Any>)

    /**
     * Rule that controls how a fleet is scaled.
     *
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
     * @param scalingPolicies Rule that controls how a fleet is scaled. 
     */
    public fun scalingPolicies(vararg scalingPolicies: Any)

    /**
     * The unique identifier for a Realtime configuration script to be deployed on fleet instances.
     *
     * You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift Servers
     * prior to creating the fleet. This fleet property cannot be changed later.
     *
     *
     * You can't use the `!Ref` command to reference a script created with a CloudFormation template
     * for the fleet property `ScriptId` . Instead, use `Fn::GetAtt Script.Arn` or `Fn::GetAtt
     * Script.Id` to retrieve either of these properties as input for `ScriptId` . Alternatively, enter
     * a `ScriptId` string manually.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid)
     * @param scriptId The unique identifier for a Realtime configuration script to be deployed on
     * fleet instances. 
     */
    public fun scriptId(scriptId: String)

    /**
     * (deprecated) This parameter is no longer used but is retained for backward compatibility.
     *
     * Instead, specify server launch parameters in the RuntimeConfiguration parameter. A request
     * must specify either a runtime configuration or values for both ServerLaunchParameters and
     * ServerLaunchPath.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchparameters)
     * @deprecated this property has been deprecated
     * @param serverLaunchParameters This parameter is no longer used but is retained for backward
     * compatibility. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchParameters(serverLaunchParameters: String)

    /**
     * (deprecated) This parameter is no longer used.
     *
     * Instead, specify a server launch path using the RuntimeConfiguration parameter. Requests that
     * specify a server launch path and launch parameters instead of a runtime configuration will
     * continue to work.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-serverlaunchpath)
     * @deprecated this property has been deprecated
     * @param serverLaunchPath This parameter is no longer used. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun serverLaunchPath(serverLaunchPath: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnFleet.Builder =
        software.amazon.awscdk.services.gamelift.CfnFleet.Builder.create(scope, id)

    /**
     * Amazon GameLift Servers Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Servers Anywhere configuration options. 
     */
    override fun anywhereConfiguration(anywhereConfiguration: IResolvable) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Amazon GameLift Servers Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Servers Anywhere configuration options. 
     */
    override fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(AnywhereConfigurationProperty.Companion::unwrap))
    }

    /**
     * Amazon GameLift Servers Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Servers Anywhere configuration options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2661928c18c4a178bc7a01449bf72729fb5248293bfdd9f3f77a154dd4333b9")
    override
        fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty.Builder.() -> Unit):
        Unit = anywhereConfiguration(AnywhereConfigurationProperty(anywhereConfiguration))

    /**
     * Current resource capacity settings for managed EC2 fleets and managed container fleets.
     *
     * For multi-location fleets, location values might refer to a fleet's remote location or its
     * home Region.
     *
     * *Returned by:*
     * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
     * ,
     * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
     * ,
     * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-applycapacity)
     * @param applyCapacity Current resource capacity settings for managed EC2 fleets and managed
     * container fleets. 
     */
    override fun applyCapacity(applyCapacity: String) {
      cdkBuilder.applyCapacity(applyCapacity)
    }

    /**
     * A unique identifier for a build to be deployed on the new fleet.
     *
     * If you are deploying the fleet with a custom game build, you must specify this property. The
     * build must have been successfully uploaded to Amazon GameLift and be in a `READY` status. This
     * fleet setting cannot be changed once the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-buildid)
     * @param buildId A unique identifier for a build to be deployed on the new fleet. 
     */
    override fun buildId(buildId: String) {
      cdkBuilder.buildId(buildId)
    }

    /**
     * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift Servers uses the certificates to encrypt traffic between game clients and the
     * game servers running on Amazon GameLift Servers. By default, the `CertificateConfiguration` is
     * `DISABLED` . You can't change this property after you create the fleet.
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
     * @param certificateConfiguration Prompts Amazon GameLift Servers to generate a TLS/SSL
     * certificate for the fleet. 
     */
    override fun certificateConfiguration(certificateConfiguration: IResolvable) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift Servers uses the certificates to encrypt traffic between game clients and the
     * game servers running on Amazon GameLift Servers. By default, the `CertificateConfiguration` is
     * `DISABLED` . You can't change this property after you create the fleet.
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
     * @param certificateConfiguration Prompts Amazon GameLift Servers to generate a TLS/SSL
     * certificate for the fleet. 
     */
    override
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(CertificateConfigurationProperty.Companion::unwrap))
    }

    /**
     * Prompts Amazon GameLift Servers to generate a TLS/SSL certificate for the fleet.
     *
     * Amazon GameLift Servers uses the certificates to encrypt traffic between game clients and the
     * game servers running on Amazon GameLift Servers. By default, the `CertificateConfiguration` is
     * `DISABLED` . You can't change this property after you create the fleet.
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
     * @param certificateConfiguration Prompts Amazon GameLift Servers to generate a TLS/SSL
     * certificate for the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7ad6c4917736d0c5335363f8da4f8d65e0ee9c6a1b8e8f30c887c572ccf8fa0")
    override
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty.Builder.() -> Unit):
        Unit = certificateConfiguration(CertificateConfigurationProperty(certificateConfiguration))

    /**
     * The type of compute resource used to host your game servers.
     *
     * * `EC2` – The game server build is deployed to Amazon EC2 instances for cloud hosting. This
     * is the default setting.
     * * `ANYWHERE` – Game servers and supporting software are deployed to compute resources that
     * you provide and manage. With this compute type, you can also set the `AnywhereConfiguration`
     * parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-computetype)
     * @param computeType The type of compute resource used to host your game servers. 
     */
    override fun computeType(computeType: String) {
      cdkBuilder.computeType(computeType)
    }

    /**
     * A description for the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-description)
     * @param description A description for the fleet. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * (deprecated) [DEPRECATED] The number of EC2 instances that you want this fleet to host.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
     * @deprecated this property has been deprecated
     * @param desiredEc2Instances [DEPRECATED] The number of EC2 instances that you want this fleet
     * to host. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun desiredEc2Instances(desiredEc2Instances: Number) {
      cdkBuilder.desiredEc2Instances(desiredEc2Instances)
    }

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * Set this parameter for managed EC2 fleets. You can leave this parameter empty when creating
     * the fleet, but you must call
     * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetPortSettings) to set
     * it before players can connect to game sessions. As a best practice, we recommend opening ports
     * for remote access only when you need them and closing them when you're finished. For Amazon
     * GameLift Servers Realtime fleets, Amazon GameLift Servers automatically sets TCP and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    override fun ec2InboundPermissions(ec2InboundPermissions: IResolvable) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * Set this parameter for managed EC2 fleets. You can leave this parameter empty when creating
     * the fleet, but you must call
     * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetPortSettings) to set
     * it before players can connect to game sessions. As a best practice, we recommend opening ports
     * for remote access only when you need them and closing them when you're finished. For Amazon
     * GameLift Servers Realtime fleets, Amazon GameLift Servers automatically sets TCP and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    override fun ec2InboundPermissions(ec2InboundPermissions: List<Any>) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The IP address ranges and port settings that allow inbound traffic to access game server
     * processes and other processes on this fleet.
     *
     * Set this parameter for managed EC2 fleets. You can leave this parameter empty when creating
     * the fleet, but you must call
     * [](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetPortSettings) to set
     * it before players can connect to game sessions. As a best practice, we recommend opening ports
     * for remote access only when you need them and closing them when you're finished. For Amazon
     * GameLift Servers Realtime fleets, Amazon GameLift Servers automatically sets TCP and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The IP address ranges and port settings that allow inbound
     * traffic to access game server processes and other processes on this fleet. 
     */
    override fun ec2InboundPermissions(vararg ec2InboundPermissions: Any): Unit =
        ec2InboundPermissions(ec2InboundPermissions.toList())

    /**
     * The Amazon GameLift Servers-supported Amazon EC2 instance type to use with managed EC2
     * fleets.
     *
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
     * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
     * Amazon EC2 instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
     * @param ec2InstanceType The Amazon GameLift Servers-supported Amazon EC2 instance type to use
     * with managed EC2 fleets. 
     */
    override fun ec2InstanceType(ec2InstanceType: String) {
      cdkBuilder.ec2InstanceType(ec2InstanceType)
    }

    /**
     * Indicates whether to use On-Demand or Spot instances for this fleet.
     *
     * By default, this property is set to `ON_DEMAND` . Learn more about when to use [On-Demand
     * versus Spot
     * Instances](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot)
     * . This fleet property can't be changed after the fleet is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-fleettype)
     * @param fleetType Indicates whether to use On-Demand or Spot instances for this fleet. 
     */
    override fun fleetType(fleetType: String) {
      cdkBuilder.fleetType(fleetType)
    }

    /**
     * A unique identifier for an IAM role that manages access to your AWS services.
     *
     * With an instance role ARN set, any application that runs on an instance in this fleet can
     * assume the role, including install scripts, server processes, and daemons (background
     * processes). Create a role or look up a role's ARN by using the [IAM
     * dashboard](https://docs.aws.amazon.com/iam/) in the AWS Management Console . Learn more about
     * using on-box credentials for your game servers at [Access external resources from a game
     * server](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * . This attribute is used with fleets where `ComputeType` is `EC2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolearn)
     * @param instanceRoleArn A unique identifier for an IAM role that manages access to your AWS
     * services. 
     */
    override fun instanceRoleArn(instanceRoleArn: String) {
      cdkBuilder.instanceRoleArn(instanceRoleArn)
    }

    /**
     * Indicates that fleet instances maintain a shared credentials file for the IAM role defined in
     * `InstanceRoleArn` .
     *
     * Shared credentials allow applications that are deployed with the game server executable to
     * communicate with other AWS resources. This property is used only when the game server is
     * integrated with the server SDK version 5.x. For more information about using shared credentials,
     * see [Communicate with other AWS resources from your
     * fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html)
     * . This attribute is used with fleets where `ComputeType` is `EC2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolecredentialsprovider)
     * @param instanceRoleCredentialsProvider Indicates that fleet instances maintain a shared
     * credentials file for the IAM role defined in `InstanceRoleArn` . 
     */
    override fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String) {
      cdkBuilder.instanceRoleCredentialsProvider(instanceRoleCredentialsProvider)
    }

    /**
     * A set of remote locations to deploy additional instances to and manage as a multi-location
     * fleet.
     *
     * Use this parameter when creating a fleet in AWS Regions that support multiple locations. You
     * can add any AWS Region or Local Zone that's supported by Amazon GameLift Servers. Provide a list
     * of one or more AWS Region codes, such as `us-west-2` , or Local Zone names. When using this
     * parameter, Amazon GameLift Servers requires you to include your home location in the request.
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     * @param locations A set of remote locations to deploy additional instances to and manage as a
     * multi-location fleet. 
     */
    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of remote locations to deploy additional instances to and manage as a multi-location
     * fleet.
     *
     * Use this parameter when creating a fleet in AWS Regions that support multiple locations. You
     * can add any AWS Region or Local Zone that's supported by Amazon GameLift Servers. Provide a list
     * of one or more AWS Region codes, such as `us-west-2` , or Local Zone names. When using this
     * parameter, Amazon GameLift Servers requires you to include your home location in the request.
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     * @param locations A set of remote locations to deploy additional instances to and manage as a
     * multi-location fleet. 
     */
    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A set of remote locations to deploy additional instances to and manage as a multi-location
     * fleet.
     *
     * Use this parameter when creating a fleet in AWS Regions that support multiple locations. You
     * can add any AWS Region or Local Zone that's supported by Amazon GameLift Servers. Provide a list
     * of one or more AWS Region codes, such as `us-west-2` , or Local Zone names. When using this
     * parameter, Amazon GameLift Servers requires you to include your home location in the request.
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-locations)
     * @param locations A set of remote locations to deploy additional instances to and manage as a
     * multi-location fleet. 
     */
    override fun locations(vararg locations: Any): Unit = locations(locations.toList())

    /**
     * (deprecated) This parameter is no longer used.
     *
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
     * @deprecated this property has been deprecated
     * @param logPaths This parameter is no longer used. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(logPaths: List<String>) {
      cdkBuilder.logPaths(logPaths)
    }

    /**
     * (deprecated) This parameter is no longer used.
     *
     * When hosting a custom game build, specify where Amazon GameLift should store log files using
     * the Amazon GameLift server API call ProcessReady()
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-logpaths)
     * @deprecated this property has been deprecated
     * @param logPaths This parameter is no longer used. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logPaths(vararg logPaths: String): Unit = logPaths(logPaths.toList())

    /**
     * (deprecated) [DEPRECATED] The maximum value that is allowed for the fleet's instance count.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1". Once the fleet is
     * active, you can change this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
     * @deprecated this property has been deprecated
     * @param maxSize [DEPRECATED] The maximum value that is allowed for the fleet's instance count.
     * 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun maxSize(maxSize: Number) {
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
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    override fun metricGroups(metricGroups: List<String>) {
      cdkBuilder.metricGroups(metricGroups)
    }

    /**
     * The name of an AWS CloudWatch metric group to add this fleet to.
     *
     * A metric group is used to aggregate the metrics for multiple fleets. You can specify an
     * existing metric group name or set a new name to create a new metric group. A fleet can be
     * included in only one metric group at a time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-metricgroups)
     * @param metricGroups The name of an AWS CloudWatch metric group to add this fleet to. 
     */
    override fun metricGroups(vararg metricGroups: String): Unit =
        metricGroups(metricGroups.toList())

    /**
     * (deprecated) [DEPRECATED] The minimum value allowed for the fleet's instance count.
     *
     * When creating a new fleet, GameLift automatically sets this value to "0". After the fleet is
     * active, you can change this value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
     * @deprecated this property has been deprecated
     * @param minSize [DEPRECATED] The minimum value allowed for the fleet's instance count. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    /**
     * A descriptive label that is associated with a fleet.
     *
     * Fleet names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-name)
     * @param name A descriptive label that is associated with a fleet. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param newGameSessionProtectionPolicy The status of termination protection for active game
     * sessions on the fleet. 
     */
    override fun newGameSessionProtectionPolicy(newGameSessionProtectionPolicy: String) {
      cdkBuilder.newGameSessionProtectionPolicy(newGameSessionProtectionPolicy)
    }

    /**
     * Used when peering your Amazon GameLift Servers fleet with a VPC, the unique identifier for
     * the AWS account that owns the VPC.
     *
     * You can find your account ID in the AWS Management Console under account settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid)
     * @param peerVpcAwsAccountId Used when peering your Amazon GameLift Servers fleet with a VPC,
     * the unique identifier for the AWS account that owns the VPC. 
     */
    override fun peerVpcAwsAccountId(peerVpcAwsAccountId: String) {
      cdkBuilder.peerVpcAwsAccountId(peerVpcAwsAccountId)
    }

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift Servers
     * fleet.
     *
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
     * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about
     * VPC peering in [VPC Peering with Amazon GameLift Servers
     * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid)
     * @param peerVpcId A unique identifier for a VPC with resources to be accessed by your Amazon
     * GameLift Servers fleet. 
     */
    override fun peerVpcId(peerVpcId: String) {
      cdkBuilder.peerVpcId(peerVpcId)
    }

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time. 
     */
    override fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: IResolvable) {
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time. 
     */
    override
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty) {
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(ResourceCreationLimitPolicyProperty.Companion::unwrap))
    }

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a16622527c205d3f8f7e8bf9ba63ad02b40fec4c20212321e8fda075d93f553f")
    override
        fun resourceCreationLimitPolicy(resourceCreationLimitPolicy: ResourceCreationLimitPolicyProperty.Builder.() -> Unit):
        Unit =
        resourceCreationLimitPolicy(ResourceCreationLimitPolicyProperty(resourceCreationLimitPolicy))

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
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet. 
     */
    override fun runtimeConfiguration(runtimeConfiguration: IResolvable) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(IResolvable.Companion::unwrap))
    }

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
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet. 
     */
    override fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty) {
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(RuntimeConfigurationProperty.Companion::unwrap))
    }

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
     * @param runtimeConfiguration Instructions for how to launch and maintain server processes on
     * instances in the fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c0627cf5d1239128484c5e236ab999e30df9307e33f611a0bc163bf3a7b6d62d")
    override
        fun runtimeConfiguration(runtimeConfiguration: RuntimeConfigurationProperty.Builder.() -> Unit):
        Unit = runtimeConfiguration(RuntimeConfigurationProperty(runtimeConfiguration))

    /**
     * Rule that controls how a fleet is scaled.
     *
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
     * @param scalingPolicies Rule that controls how a fleet is scaled. 
     */
    override fun scalingPolicies(scalingPolicies: IResolvable) {
      cdkBuilder.scalingPolicies(scalingPolicies.let(IResolvable.Companion::unwrap))
    }

    /**
     * Rule that controls how a fleet is scaled.
     *
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
     * @param scalingPolicies Rule that controls how a fleet is scaled. 
     */
    override fun scalingPolicies(scalingPolicies: List<Any>) {
      cdkBuilder.scalingPolicies(scalingPolicies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Rule that controls how a fleet is scaled.
     *
     * Scaling policies are uniquely identified by the combination of name and fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scalingpolicies)
     * @param scalingPolicies Rule that controls how a fleet is scaled. 
     */
    override fun scalingPolicies(vararg scalingPolicies: Any): Unit =
        scalingPolicies(scalingPolicies.toList())

    /**
     * The unique identifier for a Realtime configuration script to be deployed on fleet instances.
     *
     * You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift Servers
     * prior to creating the fleet. This fleet property cannot be changed later.
     *
     *
     * You can't use the `!Ref` command to reference a script created with a CloudFormation template
     * for the fleet property `ScriptId` . Instead, use `Fn::GetAtt Script.Arn` or `Fn::GetAtt
     * Script.Id` to retrieve either of these properties as input for `ScriptId` . Alternatively, enter
     * a `ScriptId` string manually.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-scriptid)
     * @param scriptId The unique identifier for a Realtime configuration script to be deployed on
     * fleet instances. 
     */
    override fun scriptId(scriptId: String) {
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
     * @deprecated this property has been deprecated
     * @param serverLaunchParameters This parameter is no longer used but is retained for backward
     * compatibility. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchParameters(serverLaunchParameters: String) {
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
     * @deprecated this property has been deprecated
     * @param serverLaunchPath This parameter is no longer used. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun serverLaunchPath(serverLaunchPath: String) {
      cdkBuilder.serverLaunchPath(serverLaunchPath)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.gamelift.CfnFleet =
        wrapped.cdkObject as software.amazon.awscdk.services.gamelift.CfnFleet
  }

  /**
   * Amazon GameLift Servers configuration options for your Anywhere fleets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * AnywhereConfigurationProperty anywhereConfigurationProperty =
   * AnywhereConfigurationProperty.builder()
   * .cost("cost")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-anywhereconfiguration.html)
   */
  public interface AnywhereConfigurationProperty {
    /**
     * The cost to run your fleet per hour.
     *
     * Amazon GameLift Servers uses the provided cost of your fleet to balance usage in queues. For
     * more information about queues, see [Setting up
     * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
     * *Amazon GameLift Servers Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-anywhereconfiguration.html#cfn-gamelift-fleet-anywhereconfiguration-cost)
     */
    public fun cost(): String

    /**
     * A builder for [AnywhereConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cost The cost to run your fleet per hour. 
       * Amazon GameLift Servers uses the provided cost of your fleet to balance usage in queues.
       * For more information about queues, see [Setting up
       * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
       * *Amazon GameLift Servers Developer Guide* .
       */
      public fun cost(cost: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty.builder()

      /**
       * @param cost The cost to run your fleet per hour. 
       * Amazon GameLift Servers uses the provided cost of your fleet to balance usage in queues.
       * For more information about queues, see [Setting up
       * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
       * *Amazon GameLift Servers Developer Guide* .
       */
      override fun cost(cost: String) {
        cdkBuilder.cost(cost)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty,
    ) : CdkObject(cdkObject),
        AnywhereConfigurationProperty {
      /**
       * The cost to run your fleet per hour.
       *
       * Amazon GameLift Servers uses the provided cost of your fleet to balance usage in queues.
       * For more information about queues, see [Setting up
       * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
       * *Amazon GameLift Servers Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-anywhereconfiguration.html#cfn-gamelift-fleet-anywhereconfiguration-cost)
       */
      override fun cost(): String = unwrap(this).getCost()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnywhereConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty):
          AnywhereConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnywhereConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnywhereConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * CertificateConfigurationProperty certificateConfigurationProperty =
   * CertificateConfigurationProperty.builder()
   * .certificateType("certificateType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html)
   */
  public interface CertificateConfigurationProperty {
    /**
     * Indicates whether a TLS/SSL certificate is generated for a fleet.
     *
     * Valid values include:
     *
     * * *GENERATED* - Generate a TLS/SSL certificate for this fleet.
     * * *DISABLED* - (default) Do not generate a TLS/SSL certificate for this fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html#cfn-gamelift-fleet-certificateconfiguration-certificatetype)
     */
    public fun certificateType(): String

    /**
     * A builder for [CertificateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateType Indicates whether a TLS/SSL certificate is generated for a fleet. 
       * Valid values include:
       *
       * * *GENERATED* - Generate a TLS/SSL certificate for this fleet.
       * * *DISABLED* - (default) Do not generate a TLS/SSL certificate for this fleet.
       */
      public fun certificateType(certificateType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty.builder()

      /**
       * @param certificateType Indicates whether a TLS/SSL certificate is generated for a fleet. 
       * Valid values include:
       *
       * * *GENERATED* - Generate a TLS/SSL certificate for this fleet.
       * * *DISABLED* - (default) Do not generate a TLS/SSL certificate for this fleet.
       */
      override fun certificateType(certificateType: String) {
        cdkBuilder.certificateType(certificateType)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty,
    ) : CdkObject(cdkObject),
        CertificateConfigurationProperty {
      /**
       * Indicates whether a TLS/SSL certificate is generated for a fleet.
       *
       * Valid values include:
       *
       * * *GENERATED* - Generate a TLS/SSL certificate for this fleet.
       * * *DISABLED* - (default) Do not generate a TLS/SSL certificate for this fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-certificateconfiguration.html#cfn-gamelift-fleet-certificateconfiguration-certificatetype)
       */
      override fun certificateType(): String = unwrap(this).getCertificateType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty):
          CertificateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CertificateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
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
  public interface IpPermissionProperty {
    /**
     * A starting value for a range of allowed port numbers.
     *
     * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
     *
     * For fleets using Windows builds, only ports `1026-60000` are valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-fromport)
     */
    public fun fromPort(): Number

    /**
     * A range of allowed IP addresses.
     *
     * This value must be expressed in CIDR notation. Example: " `000.000.000.000/[subnet mask]` "
     * or optionally the shortened version " `0.0.0.0/[subnet mask]` ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-iprange)
     */
    public fun ipRange(): String

    /**
     * The network communication protocol used by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-protocol)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-toport)
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
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty,
    ) : CdkObject(cdkObject),
        IpPermissionProperty {
      /**
       * A starting value for a range of allowed port numbers.
       *
       * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
       *
       * For fleets using Windows builds, only ports `1026-60000` are valid.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * A range of allowed IP addresses.
       *
       * This value must be expressed in CIDR notation. Example: " `000.000.000.000/[subnet mask]` "
       * or optionally the shortened version " `0.0.0.0/[subnet mask]` ".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-iprange)
       */
      override fun ipRange(): String = unwrap(this).getIpRange()

      /**
       * The network communication protocol used by the fleet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-protocol)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-ippermission.html#cfn-gamelift-fleet-ippermission-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpPermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty):
          IpPermissionProperty = CdkObjectWrappers.wrap(cdkObject) as? IpPermissionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpPermissionProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty
    }
  }

  /**
   * Current resource capacity settings for managed EC2 fleets and managed container fleets.
   *
   * For multi-location fleets, location values might refer to a fleet's remote location or its home
   * Region.
   *
   * *Returned by:*
   * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
   * ,
   * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
   * ,
   * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html)
   */
  public interface LocationCapacityProperty {
    /**
     * The number of Amazon EC2 instances you want to maintain in the specified fleet location.
     *
     * This value must fall between the minimum and maximum size limits. Changes in desired instance
     * value can take up to 1 minute to be reflected when viewing the fleet's capacity settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html#cfn-gamelift-fleet-locationcapacity-desiredec2instances)
     */
    public fun desiredEc2Instances(): Number

    /**
     * The maximum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html#cfn-gamelift-fleet-locationcapacity-maxsize)
     */
    public fun maxSize(): Number

    /**
     * The minimum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html#cfn-gamelift-fleet-locationcapacity-minsize)
     */
    public fun minSize(): Number

    /**
     * A builder for [LocationCapacityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param desiredEc2Instances The number of Amazon EC2 instances you want to maintain in the
       * specified fleet location. 
       * This value must fall between the minimum and maximum size limits. Changes in desired
       * instance value can take up to 1 minute to be reflected when viewing the fleet's capacity
       * settings.
       */
      public fun desiredEc2Instances(desiredEc2Instances: Number)

      /**
       * @param maxSize The maximum number of instances that are allowed in the specified fleet
       * location. 
       * If this parameter is not set, the default is 1.
       */
      public fun maxSize(maxSize: Number)

      /**
       * @param minSize The minimum number of instances that are allowed in the specified fleet
       * location. 
       * If this parameter is not set, the default is 0.
       */
      public fun minSize(minSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty.builder()

      /**
       * @param desiredEc2Instances The number of Amazon EC2 instances you want to maintain in the
       * specified fleet location. 
       * This value must fall between the minimum and maximum size limits. Changes in desired
       * instance value can take up to 1 minute to be reflected when viewing the fleet's capacity
       * settings.
       */
      override fun desiredEc2Instances(desiredEc2Instances: Number) {
        cdkBuilder.desiredEc2Instances(desiredEc2Instances)
      }

      /**
       * @param maxSize The maximum number of instances that are allowed in the specified fleet
       * location. 
       * If this parameter is not set, the default is 1.
       */
      override fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
      }

      /**
       * @param minSize The minimum number of instances that are allowed in the specified fleet
       * location. 
       * If this parameter is not set, the default is 0.
       */
      override fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty,
    ) : CdkObject(cdkObject),
        LocationCapacityProperty {
      /**
       * The number of Amazon EC2 instances you want to maintain in the specified fleet location.
       *
       * This value must fall between the minimum and maximum size limits. Changes in desired
       * instance value can take up to 1 minute to be reflected when viewing the fleet's capacity
       * settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html#cfn-gamelift-fleet-locationcapacity-desiredec2instances)
       */
      override fun desiredEc2Instances(): Number = unwrap(this).getDesiredEc2Instances()

      /**
       * The maximum number of instances that are allowed in the specified fleet location.
       *
       * If this parameter is not set, the default is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html#cfn-gamelift-fleet-locationcapacity-maxsize)
       */
      override fun maxSize(): Number = unwrap(this).getMaxSize()

      /**
       * The minimum number of instances that are allowed in the specified fleet location.
       *
       * If this parameter is not set, the default is 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html#cfn-gamelift-fleet-locationcapacity-minsize)
       */
      override fun minSize(): Number = unwrap(this).getMinSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationCapacityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty):
          LocationCapacityProperty = CdkObjectWrappers.wrap(cdkObject) as? LocationCapacityProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationCapacityProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html)
   */
  public interface LocationConfigurationProperty {
    /**
     * An AWS Region code, such as `us-west-2` .
     *
     * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
     * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html) for
     * managed hosting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html#cfn-gamelift-fleet-locationconfiguration-location)
     */
    public fun location(): String

    /**
     * Current resource capacity settings for managed EC2 fleets and managed container fleets.
     *
     * For multi-location fleets, location values might refer to a fleet's remote location or its
     * home Region.
     *
     * *Returned by:*
     * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
     * ,
     * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
     * ,
     * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html#cfn-gamelift-fleet-locationconfiguration-locationcapacity)
     */
    public fun locationCapacity(): Any? = unwrap(this).getLocationCapacity()

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
       * @param locationCapacity Current resource capacity settings for managed EC2 fleets and
       * managed container fleets.
       * For multi-location fleets, location values might refer to a fleet's remote location or its
       * home Region.
       *
       * *Returned by:*
       * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
       * ,
       * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
       * ,
       * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
       */
      public fun locationCapacity(locationCapacity: IResolvable)

      /**
       * @param locationCapacity Current resource capacity settings for managed EC2 fleets and
       * managed container fleets.
       * For multi-location fleets, location values might refer to a fleet's remote location or its
       * home Region.
       *
       * *Returned by:*
       * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
       * ,
       * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
       * ,
       * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
       */
      public fun locationCapacity(locationCapacity: LocationCapacityProperty)

      /**
       * @param locationCapacity Current resource capacity settings for managed EC2 fleets and
       * managed container fleets.
       * For multi-location fleets, location values might refer to a fleet's remote location or its
       * home Region.
       *
       * *Returned by:*
       * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
       * ,
       * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
       * ,
       * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5ea934de2798ac88723461897145f3614d1ebc41bacbc214d99e3e82366b78d")
      public fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.builder()

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
       * @param locationCapacity Current resource capacity settings for managed EC2 fleets and
       * managed container fleets.
       * For multi-location fleets, location values might refer to a fleet's remote location or its
       * home Region.
       *
       * *Returned by:*
       * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
       * ,
       * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
       * ,
       * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
       */
      override fun locationCapacity(locationCapacity: IResolvable) {
        cdkBuilder.locationCapacity(locationCapacity.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param locationCapacity Current resource capacity settings for managed EC2 fleets and
       * managed container fleets.
       * For multi-location fleets, location values might refer to a fleet's remote location or its
       * home Region.
       *
       * *Returned by:*
       * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
       * ,
       * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
       * ,
       * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
       */
      override fun locationCapacity(locationCapacity: LocationCapacityProperty) {
        cdkBuilder.locationCapacity(locationCapacity.let(LocationCapacityProperty.Companion::unwrap))
      }

      /**
       * @param locationCapacity Current resource capacity settings for managed EC2 fleets and
       * managed container fleets.
       * For multi-location fleets, location values might refer to a fleet's remote location or its
       * home Region.
       *
       * *Returned by:*
       * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
       * ,
       * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
       * ,
       * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5ea934de2798ac88723461897145f3614d1ebc41bacbc214d99e3e82366b78d")
      override fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit):
          Unit = locationCapacity(LocationCapacityProperty(locationCapacity))

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty,
    ) : CdkObject(cdkObject),
        LocationConfigurationProperty {
      /**
       * An AWS Region code, such as `us-west-2` .
       *
       * For a list of supported Regions and Local Zones, see [Amazon GameLift Servers service
       * locations](https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-regions.html)
       * for managed hosting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html#cfn-gamelift-fleet-locationconfiguration-location)
       */
      override fun location(): String = unwrap(this).getLocation()

      /**
       * Current resource capacity settings for managed EC2 fleets and managed container fleets.
       *
       * For multi-location fleets, location values might refer to a fleet's remote location or its
       * home Region.
       *
       * *Returned by:*
       * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
       * ,
       * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
       * ,
       * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html#cfn-gamelift-fleet-locationconfiguration-locationcapacity)
       */
      override fun locationCapacity(): Any? = unwrap(this).getLocationCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty):
          LocationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * ResourceCreationLimitPolicyProperty resourceCreationLimitPolicyProperty =
   * ResourceCreationLimitPolicyProperty.builder()
   * .newGameSessionsPerCreator(123)
   * .policyPeriodInMinutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html)
   */
  public interface ResourceCreationLimitPolicyProperty {
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-newgamesessionspercreator)
     */
    public fun newGameSessionsPerCreator(): Number? = unwrap(this).getNewGameSessionsPerCreator()

    /**
     * The time span used in evaluating the resource creation limit policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-policyperiodinminutes)
     */
    public fun policyPeriodInMinutes(): Number? = unwrap(this).getPolicyPeriodInMinutes()

    /**
     * A builder for [ResourceCreationLimitPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param newGameSessionsPerCreator A policy that puts limits on the number of game sessions
       * that a player can create within a specified span of time.
       * With this policy, you can control players' ability to consume available resources.
       *
       * The policy is evaluated when a player tries to create a new game session. On receiving a
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
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty.Builder
          =
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty.builder()

      /**
       * @param newGameSessionsPerCreator A policy that puts limits on the number of game sessions
       * that a player can create within a specified span of time.
       * With this policy, you can control players' ability to consume available resources.
       *
       * The policy is evaluated when a player tries to create a new game session. On receiving a
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
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty,
    ) : CdkObject(cdkObject),
        ResourceCreationLimitPolicyProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-newgamesessionspercreator)
       */
      override fun newGameSessionsPerCreator(): Number? =
          unwrap(this).getNewGameSessionsPerCreator()

      /**
       * The time span used in evaluating the resource creation limit policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-resourcecreationlimitpolicy.html#cfn-gamelift-fleet-resourcecreationlimitpolicy-policyperiodinminutes)
       */
      override fun policyPeriodInMinutes(): Number? = unwrap(this).getPolicyPeriodInMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceCreationLimitPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty):
          ResourceCreationLimitPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceCreationLimitPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceCreationLimitPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
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
  public interface RuntimeConfigurationProperty {
    /**
     * The maximum amount of time (in seconds) allowed to launch a new game session and have it
     * report ready to host players.
     *
     * During this time, the game session is in status `ACTIVATING` . If the game session does not
     * become active before the timeout, it is ended and the game session status is changed to
     * `TERMINATED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-gamesessionactivationtimeoutseconds)
     */
    public fun gameSessionActivationTimeoutSeconds(): Number? =
        unwrap(this).getGameSessionActivationTimeoutSeconds()

    /**
     * The number of game sessions in status `ACTIVATING` to allow on an instance or compute.
     *
     * This setting limits the instance resources that can be used for new game activations at any
     * one time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-maxconcurrentgamesessionactivations)
     */
    public fun maxConcurrentGameSessionActivations(): Number? =
        unwrap(this).getMaxConcurrentGameSessionActivations()

    /**
     * A collection of server process configurations that identify what server processes to run on
     * fleet computes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-serverprocesses)
     */
    public fun serverProcesses(): Any? = unwrap(this).getServerProcesses()

    /**
     * A builder for [RuntimeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param gameSessionActivationTimeoutSeconds The maximum amount of time (in seconds) allowed
       * to launch a new game session and have it report ready to host players.
       * During this time, the game session is in status `ACTIVATING` . If the game session does not
       * become active before the timeout, it is ended and the game session status is changed to
       * `TERMINATED` .
       */
      public fun gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds: Number)

      /**
       * @param maxConcurrentGameSessionActivations The number of game sessions in status
       * `ACTIVATING` to allow on an instance or compute.
       * This setting limits the instance resources that can be used for new game activations at any
       * one time.
       */
      public fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number)

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on fleet computes.
       */
      public fun serverProcesses(serverProcesses: IResolvable)

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on fleet computes.
       */
      public fun serverProcesses(serverProcesses: List<Any>)

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on fleet computes.
       */
      public fun serverProcesses(vararg serverProcesses: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty.builder()

      /**
       * @param gameSessionActivationTimeoutSeconds The maximum amount of time (in seconds) allowed
       * to launch a new game session and have it report ready to host players.
       * During this time, the game session is in status `ACTIVATING` . If the game session does not
       * become active before the timeout, it is ended and the game session status is changed to
       * `TERMINATED` .
       */
      override
          fun gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds: Number) {
        cdkBuilder.gameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds)
      }

      /**
       * @param maxConcurrentGameSessionActivations The number of game sessions in status
       * `ACTIVATING` to allow on an instance or compute.
       * This setting limits the instance resources that can be used for new game activations at any
       * one time.
       */
      override
          fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number) {
        cdkBuilder.maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations)
      }

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on fleet computes.
       */
      override fun serverProcesses(serverProcesses: IResolvable) {
        cdkBuilder.serverProcesses(serverProcesses.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on fleet computes.
       */
      override fun serverProcesses(serverProcesses: List<Any>) {
        cdkBuilder.serverProcesses(serverProcesses.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on fleet computes.
       */
      override fun serverProcesses(vararg serverProcesses: Any): Unit =
          serverProcesses(serverProcesses.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty,
    ) : CdkObject(cdkObject),
        RuntimeConfigurationProperty {
      /**
       * The maximum amount of time (in seconds) allowed to launch a new game session and have it
       * report ready to host players.
       *
       * During this time, the game session is in status `ACTIVATING` . If the game session does not
       * become active before the timeout, it is ended and the game session status is changed to
       * `TERMINATED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-gamesessionactivationtimeoutseconds)
       */
      override fun gameSessionActivationTimeoutSeconds(): Number? =
          unwrap(this).getGameSessionActivationTimeoutSeconds()

      /**
       * The number of game sessions in status `ACTIVATING` to allow on an instance or compute.
       *
       * This setting limits the instance resources that can be used for new game activations at any
       * one time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-maxconcurrentgamesessionactivations)
       */
      override fun maxConcurrentGameSessionActivations(): Number? =
          unwrap(this).getMaxConcurrentGameSessionActivations()

      /**
       * A collection of server process configurations that identify what server processes to run on
       * fleet computes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-serverprocesses)
       */
      override fun serverProcesses(): Any? = unwrap(this).getServerProcesses()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty):
          RuntimeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuntimeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimeConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html)
   */
  public interface ScalingPolicyProperty {
    /**
     * Comparison operator to use when measuring a metric against the threshold value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-comparisonoperator)
     */
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    /**
     * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling
     * event is triggered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-evaluationperiods)
     */
    public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    /**
     * The fleet location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-metricname)
     */
    public fun metricName(): String

    /**
     * A descriptive label that is associated with a fleet's scaling policy.
     *
     * Policy names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-name)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-policytype)
     */
    public fun policyType(): String? = unwrap(this).getPolicyType()

    /**
     * Amount of adjustment to make, based on the scaling adjustment type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-scalingadjustment)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-scalingadjustmenttype)
     */
    public fun scalingAdjustmentType(): String? = unwrap(this).getScalingAdjustmentType()

    /**
     * Current status of the scaling policy.
     *
     * The scaling policy can be in force only when in an `ACTIVE` status. Scaling policies can be
     * suspended for individual fleets. If the policy is suspended for a fleet, the policy status does
     * not change.
     *
     * * *ACTIVE* -- The scaling policy can be used for auto-scaling a fleet.
     * * *UPDATE_REQUESTED* -- A request to update the scaling policy has been received.
     * * *UPDATING* -- A change is being made to the scaling policy.
     * * *DELETE_REQUESTED* -- A request to delete the scaling policy has been received.
     * * *DELETING* -- The scaling policy is being deleted.
     * * *DELETED* -- The scaling policy has been deleted.
     * * *ERROR* -- An error occurred in creating the policy. It should be removed and recreated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * An object that contains settings for a target-based scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-targetconfiguration)
     */
    public fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

    /**
     * Metric value used to trigger a scaling event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-threshold)
     */
    public fun threshold(): Number? = unwrap(this).getThreshold()

    /**
     * The current status of the fleet's scaling policies in a requested fleet location.
     *
     * The status `PENDING_UPDATE` indicates that an update was requested for the fleet but has not
     * yet been completed for the location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-updatestatus)
     */
    public fun updateStatus(): String? = unwrap(this).getUpdateStatus()

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
       * @param location The fleet location.
       */
      public fun location(location: String)

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
       * @param status Current status of the scaling policy.
       * The scaling policy can be in force only when in an `ACTIVE` status. Scaling policies can be
       * suspended for individual fleets. If the policy is suspended for a fleet, the policy status
       * does not change.
       *
       * * *ACTIVE* -- The scaling policy can be used for auto-scaling a fleet.
       * * *UPDATE_REQUESTED* -- A request to update the scaling policy has been received.
       * * *UPDATING* -- A change is being made to the scaling policy.
       * * *DELETE_REQUESTED* -- A request to delete the scaling policy has been received.
       * * *DELETING* -- The scaling policy is being deleted.
       * * *DELETED* -- The scaling policy has been deleted.
       * * *ERROR* -- An error occurred in creating the policy. It should be removed and recreated.
       */
      public fun status(status: String)

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
      @JvmName("d0b0b337b57e3a5a24e7cb4418ee3663db31c914108fb66054b6598bc2c749e8")
      public
          fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit)

      /**
       * @param threshold Metric value used to trigger a scaling event.
       */
      public fun threshold(threshold: Number)

      /**
       * @param updateStatus The current status of the fleet's scaling policies in a requested fleet
       * location.
       * The status `PENDING_UPDATE` indicates that an update was requested for the fleet but has
       * not yet been completed for the location.
       */
      public fun updateStatus(updateStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty.builder()

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
       * @param location The fleet location.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
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
       * @param status Current status of the scaling policy.
       * The scaling policy can be in force only when in an `ACTIVE` status. Scaling policies can be
       * suspended for individual fleets. If the policy is suspended for a fleet, the policy status
       * does not change.
       *
       * * *ACTIVE* -- The scaling policy can be used for auto-scaling a fleet.
       * * *UPDATE_REQUESTED* -- A request to update the scaling policy has been received.
       * * *UPDATING* -- A change is being made to the scaling policy.
       * * *DELETE_REQUESTED* -- A request to delete the scaling policy has been received.
       * * *DELETING* -- The scaling policy is being deleted.
       * * *DELETED* -- The scaling policy has been deleted.
       * * *ERROR* -- An error occurred in creating the policy. It should be removed and recreated.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
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
      @JvmName("d0b0b337b57e3a5a24e7cb4418ee3663db31c914108fb66054b6598bc2c749e8")
      override
          fun targetConfiguration(targetConfiguration: TargetConfigurationProperty.Builder.() -> Unit):
          Unit = targetConfiguration(TargetConfigurationProperty(targetConfiguration))

      /**
       * @param threshold Metric value used to trigger a scaling event.
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param updateStatus The current status of the fleet's scaling policies in a requested fleet
       * location.
       * The status `PENDING_UPDATE` indicates that an update was requested for the fleet but has
       * not yet been completed for the location.
       */
      override fun updateStatus(updateStatus: String) {
        cdkBuilder.updateStatus(updateStatus)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty,
    ) : CdkObject(cdkObject),
        ScalingPolicyProperty {
      /**
       * Comparison operator to use when measuring a metric against the threshold value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-comparisonoperator)
       */
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      /**
       * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling
       * event is triggered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-evaluationperiods)
       */
      override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

      /**
       * The fleet location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * A descriptive label that is associated with a fleet's scaling policy.
       *
       * Policy names do not need to be unique.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-name)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-policytype)
       */
      override fun policyType(): String? = unwrap(this).getPolicyType()

      /**
       * Amount of adjustment to make, based on the scaling adjustment type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-scalingadjustment)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-scalingadjustmenttype)
       */
      override fun scalingAdjustmentType(): String? = unwrap(this).getScalingAdjustmentType()

      /**
       * Current status of the scaling policy.
       *
       * The scaling policy can be in force only when in an `ACTIVE` status. Scaling policies can be
       * suspended for individual fleets. If the policy is suspended for a fleet, the policy status
       * does not change.
       *
       * * *ACTIVE* -- The scaling policy can be used for auto-scaling a fleet.
       * * *UPDATE_REQUESTED* -- A request to update the scaling policy has been received.
       * * *UPDATING* -- A change is being made to the scaling policy.
       * * *DELETE_REQUESTED* -- A request to delete the scaling policy has been received.
       * * *DELETING* -- The scaling policy is being deleted.
       * * *DELETED* -- The scaling policy has been deleted.
       * * *ERROR* -- An error occurred in creating the policy. It should be removed and recreated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * An object that contains settings for a target-based scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-targetconfiguration)
       */
      override fun targetConfiguration(): Any? = unwrap(this).getTargetConfiguration()

      /**
       * Metric value used to trigger a scaling event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-threshold)
       */
      override fun threshold(): Number? = unwrap(this).getThreshold()

      /**
       * The current status of the fleet's scaling policies in a requested fleet location.
       *
       * The status `PENDING_UPDATE` indicates that an update was requested for the fleet but has
       * not yet been completed for the location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-scalingpolicy.html#cfn-gamelift-fleet-scalingpolicy-updatestatus)
       */
      override fun updateStatus(): String? = unwrap(this).getUpdateStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty):
          ScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
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
  public interface ServerProcessProperty {
    /**
     * The number of server processes using this configuration that run concurrently on each
     * instance or compute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-concurrentexecutions)
     */
    public fun concurrentExecutions(): Number

    /**
     * The location of a game build executable or Realtime script.
     *
     * Game builds and Realtime scripts are installed on instances at the root:
     *
     * * Windows (custom game builds only): `C:\game` . Example: " `C:\game\MyGame\server.exe` "
     * * Linux: `/local/game` . Examples: " `/local/game/MyGame/server.exe` " or "
     * `/local/game/MyRealtimeScript.js` "
     *
     *
     * Amazon GameLift Servers doesn't support the use of setup scripts that launch the game
     * executable. For custom game builds, this parameter must indicate the executable that calls the
     * server SDK operations `initSDK()` and `ProcessReady()` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-launchpath)
     */
    public fun launchPath(): String

    /**
     * An optional list of parameters to pass to the server executable or Realtime script on launch.
     *
     * Length Constraints: Minimum length of 1. Maximum length of 1024.
     *
     * Pattern: [A-Za-z0-9_:.+/- =&#64;{},?'[]"]+
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-parameters)
     */
    public fun parameters(): String? = unwrap(this).getParameters()

    /**
     * A builder for [ServerProcessProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param concurrentExecutions The number of server processes using this configuration that
       * run concurrently on each instance or compute. 
       */
      public fun concurrentExecutions(concurrentExecutions: Number)

      /**
       * @param launchPath The location of a game build executable or Realtime script. 
       * Game builds and Realtime scripts are installed on instances at the root:
       *
       * * Windows (custom game builds only): `C:\game` . Example: " `C:\game\MyGame\server.exe` "
       * * Linux: `/local/game` . Examples: " `/local/game/MyGame/server.exe` " or "
       * `/local/game/MyRealtimeScript.js` "
       *
       *
       * Amazon GameLift Servers doesn't support the use of setup scripts that launch the game
       * executable. For custom game builds, this parameter must indicate the executable that calls the
       * server SDK operations `initSDK()` and `ProcessReady()` .
       */
      public fun launchPath(launchPath: String)

      /**
       * @param parameters An optional list of parameters to pass to the server executable or
       * Realtime script on launch.
       * Length Constraints: Minimum length of 1. Maximum length of 1024.
       *
       * Pattern: [A-Za-z0-9_:.+/- =&#64;{},?'[]"]+
       */
      public fun parameters(parameters: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty.builder()

      /**
       * @param concurrentExecutions The number of server processes using this configuration that
       * run concurrently on each instance or compute. 
       */
      override fun concurrentExecutions(concurrentExecutions: Number) {
        cdkBuilder.concurrentExecutions(concurrentExecutions)
      }

      /**
       * @param launchPath The location of a game build executable or Realtime script. 
       * Game builds and Realtime scripts are installed on instances at the root:
       *
       * * Windows (custom game builds only): `C:\game` . Example: " `C:\game\MyGame\server.exe` "
       * * Linux: `/local/game` . Examples: " `/local/game/MyGame/server.exe` " or "
       * `/local/game/MyRealtimeScript.js` "
       *
       *
       * Amazon GameLift Servers doesn't support the use of setup scripts that launch the game
       * executable. For custom game builds, this parameter must indicate the executable that calls the
       * server SDK operations `initSDK()` and `ProcessReady()` .
       */
      override fun launchPath(launchPath: String) {
        cdkBuilder.launchPath(launchPath)
      }

      /**
       * @param parameters An optional list of parameters to pass to the server executable or
       * Realtime script on launch.
       * Length Constraints: Minimum length of 1. Maximum length of 1024.
       *
       * Pattern: [A-Za-z0-9_:.+/- =&#64;{},?'[]"]+
       */
      override fun parameters(parameters: String) {
        cdkBuilder.parameters(parameters)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty,
    ) : CdkObject(cdkObject),
        ServerProcessProperty {
      /**
       * The number of server processes using this configuration that run concurrently on each
       * instance or compute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-concurrentexecutions)
       */
      override fun concurrentExecutions(): Number = unwrap(this).getConcurrentExecutions()

      /**
       * The location of a game build executable or Realtime script.
       *
       * Game builds and Realtime scripts are installed on instances at the root:
       *
       * * Windows (custom game builds only): `C:\game` . Example: " `C:\game\MyGame\server.exe` "
       * * Linux: `/local/game` . Examples: " `/local/game/MyGame/server.exe` " or "
       * `/local/game/MyRealtimeScript.js` "
       *
       *
       * Amazon GameLift Servers doesn't support the use of setup scripts that launch the game
       * executable. For custom game builds, this parameter must indicate the executable that calls the
       * server SDK operations `initSDK()` and `ProcessReady()` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-launchpath)
       */
      override fun launchPath(): String = unwrap(this).getLaunchPath()

      /**
       * An optional list of parameters to pass to the server executable or Realtime script on
       * launch.
       *
       * Length Constraints: Minimum length of 1. Maximum length of 1024.
       *
       * Pattern: [A-Za-z0-9_:.+/- =&#64;{},?'[]"]+
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-serverprocess.html#cfn-gamelift-fleet-serverprocess-parameters)
       */
      override fun parameters(): String? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerProcessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty):
          ServerProcessProperty = CdkObjectWrappers.wrap(cdkObject) as? ServerProcessProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerProcessProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-targetconfiguration.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-targetconfiguration.html#cfn-gamelift-fleet-targetconfiguration-targetvalue)
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
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty.builder()

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
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty,
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-targetconfiguration.html#cfn-gamelift-fleet-targetconfiguration-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty):
          TargetConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty
    }
  }
}
