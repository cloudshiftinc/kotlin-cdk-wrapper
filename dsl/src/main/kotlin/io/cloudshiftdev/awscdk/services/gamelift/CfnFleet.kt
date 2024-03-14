package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFleet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.gamelift.CfnFleet,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Amazon GameLift Anywhere configuration options.
   */
  public open fun anywhereConfiguration(): Any? = unwrap(this).getAnywhereConfiguration()

  /**
   * Amazon GameLift Anywhere configuration options.
   */
  public open fun anywhereConfiguration(`value`: IResolvable) {
    unwrap(this).setAnywhereConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Amazon GameLift Anywhere configuration options.
   */
  public open fun anywhereConfiguration(`value`: AnywhereConfigurationProperty) {
    unwrap(this).setAnywhereConfiguration(`value`.let(AnywhereConfigurationProperty::unwrap))
  }

  /**
   * Amazon GameLift Anywhere configuration options.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3aaecba63b51f1ca2dbb498f0ba4045d16345fe44a17a948e144d8540985afa8")
  public open fun anywhereConfiguration(`value`: AnywhereConfigurationProperty.Builder.() -> Unit):
      Unit = anywhereConfiguration(AnywhereConfigurationProperty(`value`))

  /**
   * Current resource capacity settings in a specified fleet or location.
   */
  public open fun applyCapacity(): String? = unwrap(this).getApplyCapacity()

  /**
   * Current resource capacity settings in a specified fleet or location.
   */
  public open fun applyCapacity(`value`: String) {
    unwrap(this).setApplyCapacity(`value`)
  }

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
   * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
   */
  public open fun certificateConfiguration(): Any? = unwrap(this).getCertificateConfiguration()

  /**
   * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
   */
  public open fun certificateConfiguration(`value`: IResolvable) {
    unwrap(this).setCertificateConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
   */
  public open fun certificateConfiguration(`value`: CertificateConfigurationProperty) {
    unwrap(this).setCertificateConfiguration(`value`.let(CertificateConfigurationProperty::unwrap))
  }

  /**
   * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
   * The number of EC2 instances that you want this fleet to host.
   */
  public open fun desiredEc2Instances(): Number? = unwrap(this).getDesiredEc2Instances()

  /**
   * The number of EC2 instances that you want this fleet to host.
   */
  public open fun desiredEc2Instances(`value`: Number) {
    unwrap(this).setDesiredEc2Instances(`value`)
  }

  /**
   * The allowed IP address ranges and port settings that allow inbound traffic to access game
   * sessions on this fleet.
   */
  public open fun ec2InboundPermissions(): Any? = unwrap(this).getEc2InboundPermissions()

  /**
   * The allowed IP address ranges and port settings that allow inbound traffic to access game
   * sessions on this fleet.
   */
  public open fun ec2InboundPermissions(`value`: IResolvable) {
    unwrap(this).setEc2InboundPermissions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The allowed IP address ranges and port settings that allow inbound traffic to access game
   * sessions on this fleet.
   */
  public open fun ec2InboundPermissions(__idx_ac66f0: List<Any>) {
    unwrap(this).setEc2InboundPermissions(__idx_ac66f0)
  }

  /**
   * The allowed IP address ranges and port settings that allow inbound traffic to access game
   * sessions on this fleet.
   */
  public open fun ec2InboundPermissions(vararg __idx_ac66f0: Any): Unit =
      ec2InboundPermissions(__idx_ac66f0.toList())

  /**
   * The Amazon GameLift-supported Amazon EC2 instance type to use for all fleet instances.
   */
  public open fun ec2InstanceType(): String? = unwrap(this).getEc2InstanceType()

  /**
   * The Amazon GameLift-supported Amazon EC2 instance type to use for all fleet instances.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A unique identifier for an IAM role with access permissions to other AWS services.
   */
  public open fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

  /**
   * A unique identifier for an IAM role with access permissions to other AWS services.
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
   * A set of remote locations to deploy additional instances to and manage as part of the fleet.
   */
  public open fun locations(): Any? = unwrap(this).getLocations()

  /**
   * A set of remote locations to deploy additional instances to and manage as part of the fleet.
   */
  public open fun locations(`value`: IResolvable) {
    unwrap(this).setLocations(`value`.let(IResolvable::unwrap))
  }

  /**
   * A set of remote locations to deploy additional instances to and manage as part of the fleet.
   */
  public open fun locations(__idx_ac66f0: List<Any>) {
    unwrap(this).setLocations(__idx_ac66f0)
  }

  /**
   * A set of remote locations to deploy additional instances to and manage as part of the fleet.
   */
  public open fun locations(vararg __idx_ac66f0: Any): Unit = locations(__idx_ac66f0.toList())

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
   * The maximum number of instances that are allowed in the specified fleet location.
   */
  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  /**
   * The maximum number of instances that are allowed in the specified fleet location.
   */
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
   * The minimum number of instances that are allowed in the specified fleet location.
   */
  public open fun minSize(): Number? = unwrap(this).getMinSize()

  /**
   * The minimum number of instances that are allowed in the specified fleet location.
   */
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
   * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the AWS
   * account that owns the VPC.
   */
  public open fun peerVpcAwsAccountId(): String? = unwrap(this).getPeerVpcAwsAccountId()

  /**
   * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the AWS
   * account that owns the VPC.
   */
  public open fun peerVpcAwsAccountId(`value`: String) {
    unwrap(this).setPeerVpcAwsAccountId(`value`)
  }

  /**
   * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet.
   */
  public open fun peerVpcId(): String? = unwrap(this).getPeerVpcId()

  /**
   * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet.
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
    unwrap(this).setResourceCreationLimitPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * A policy that limits the number of game sessions that an individual player can create on
   * instances in this fleet within a specified span of time.
   */
  public open fun resourceCreationLimitPolicy(`value`: ResourceCreationLimitPolicyProperty) {
    unwrap(this).setResourceCreationLimitPolicy(`value`.let(ResourceCreationLimitPolicyProperty::unwrap))
  }

  /**
   * A policy that limits the number of game sessions that an individual player can create on
   * instances in this fleet within a specified span of time.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setRuntimeConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Instructions for how to launch and maintain server processes on instances in the fleet.
   */
  public open fun runtimeConfiguration(`value`: RuntimeConfigurationProperty) {
    unwrap(this).setRuntimeConfiguration(`value`.let(RuntimeConfigurationProperty::unwrap))
  }

  /**
   * Instructions for how to launch and maintain server processes on instances in the fleet.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setScalingPolicies(`value`.let(IResolvable::unwrap))
  }

  /**
   * Rule that controls how a fleet is scaled.
   */
  public open fun scalingPolicies(__idx_ac66f0: List<Any>) {
    unwrap(this).setScalingPolicies(__idx_ac66f0)
  }

  /**
   * Rule that controls how a fleet is scaled.
   */
  public open fun scalingPolicies(vararg __idx_ac66f0: Any): Unit =
      scalingPolicies(__idx_ac66f0.toList())

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Amazon GameLift Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options. 
     */
    public fun anywhereConfiguration(anywhereConfiguration: IResolvable)

    /**
     * Amazon GameLift Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options. 
     */
    public fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty)

    /**
     * Amazon GameLift Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2661928c18c4a178bc7a01449bf72729fb5248293bfdd9f3f77a154dd4333b9")
    public
        fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty.Builder.() -> Unit)

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
     * @param applyCapacity Current resource capacity settings in a specified fleet or location. 
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
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet. 
     */
    public fun certificateConfiguration(certificateConfiguration: IResolvable)

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
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet. 
     */
    public fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty)

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
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7ad6c4917736d0c5335363f8da4f8d65e0ee9c6a1b8e8f30c887c572ccf8fa0")
    public
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty.Builder.() -> Unit)

    /**
     * The type of compute resource used to host your game servers.
     *
     * You can use your own compute resources with Amazon GameLift Anywhere or use Amazon EC2
     * instances with managed Amazon GameLift. By default, this property is set to `EC2` .
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
     * The number of EC2 instances that you want this fleet to host.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
     * @param desiredEc2Instances The number of EC2 instances that you want this fleet to host. 
     */
    public fun desiredEc2Instances(desiredEc2Instances: Number)

    /**
     * The allowed IP address ranges and port settings that allow inbound traffic to access game
     * sessions on this fleet.
     *
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet. 
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: IResolvable)

    /**
     * The allowed IP address ranges and port settings that allow inbound traffic to access game
     * sessions on this fleet.
     *
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet. 
     */
    public fun ec2InboundPermissions(ec2InboundPermissions: List<Any>)

    /**
     * The allowed IP address ranges and port settings that allow inbound traffic to access game
     * sessions on this fleet.
     *
     * If the fleet is hosting a custom game build, this property must be set before players can
     * connect to game sessions. For Realtime Servers fleets, Amazon GameLift automatically sets TCP
     * and UDP ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2inboundpermissions)
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet. 
     */
    public fun ec2InboundPermissions(vararg ec2InboundPermissions: Any)

    /**
     * The Amazon GameLift-supported Amazon EC2 instance type to use for all fleet instances.
     *
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
     * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
     * Amazon EC2 instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
     * @param ec2InstanceType The Amazon GameLift-supported Amazon EC2 instance type to use for all
     * fleet instances. 
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
     * @param instanceRoleArn A unique identifier for an IAM role with access permissions to other
     * AWS services. 
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
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolecredentialsprovider)
     * @param instanceRoleCredentialsProvider Indicates that fleet instances maintain a shared
     * credentials file for the IAM role defined in `InstanceRoleArn` . 
     */
    public fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String)

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
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet. 
     */
    public fun locations(locations: IResolvable)

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
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet. 
     */
    public fun locations(locations: List<Any>)

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
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet. 
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
     * The maximum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
     * @param maxSize The maximum number of instances that are allowed in the specified fleet
     * location. 
     */
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
     * The minimum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
     * @param minSize The minimum number of instances that are allowed in the specified fleet
     * location. 
     */
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
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the AWS
     * account that owns the VPC.
     *
     * You can find your account ID in the AWS Management Console under account settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid)
     * @param peerVpcAwsAccountId Used when peering your Amazon GameLift fleet with a VPC, the
     * unique identifier for the AWS account that owns the VPC. 
     */
    public fun peerVpcAwsAccountId(peerVpcAwsAccountId: String)

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet.
     *
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
     * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about
     * VPC peering in [VPC Peering with Amazon GameLift
     * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid)
     * @param peerVpcId A unique identifier for a VPC with resources to be accessed by your Amazon
     * GameLift fleet. 
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnFleet.Builder =
        software.amazon.awscdk.services.gamelift.CfnFleet.Builder.create(scope, id)

    /**
     * Amazon GameLift Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options. 
     */
    override fun anywhereConfiguration(anywhereConfiguration: IResolvable) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Amazon GameLift Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options. 
     */
    override fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty) {
      cdkBuilder.anywhereConfiguration(anywhereConfiguration.let(AnywhereConfigurationProperty::unwrap))
    }

    /**
     * Amazon GameLift Anywhere configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-anywhereconfiguration)
     * @param anywhereConfiguration Amazon GameLift Anywhere configuration options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2661928c18c4a178bc7a01449bf72729fb5248293bfdd9f3f77a154dd4333b9")
    override
        fun anywhereConfiguration(anywhereConfiguration: AnywhereConfigurationProperty.Builder.() -> Unit):
        Unit = anywhereConfiguration(AnywhereConfigurationProperty(anywhereConfiguration))

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
     * @param applyCapacity Current resource capacity settings in a specified fleet or location. 
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
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet. 
     */
    override fun certificateConfiguration(certificateConfiguration: IResolvable) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(IResolvable::unwrap))
    }

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
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet. 
     */
    override
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty) {
      cdkBuilder.certificateConfiguration(certificateConfiguration.let(CertificateConfigurationProperty::unwrap))
    }

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
     * @param certificateConfiguration Prompts Amazon GameLift to generate a TLS/SSL certificate for
     * the fleet. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7ad6c4917736d0c5335363f8da4f8d65e0ee9c6a1b8e8f30c887c572ccf8fa0")
    override
        fun certificateConfiguration(certificateConfiguration: CertificateConfigurationProperty.Builder.() -> Unit):
        Unit = certificateConfiguration(CertificateConfigurationProperty(certificateConfiguration))

    /**
     * The type of compute resource used to host your game servers.
     *
     * You can use your own compute resources with Amazon GameLift Anywhere or use Amazon EC2
     * instances with managed Amazon GameLift. By default, this property is set to `EC2` .
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
     * The number of EC2 instances that you want this fleet to host.
     *
     * When creating a new fleet, GameLift automatically sets this value to "1" and initiates a
     * single instance. Once the fleet is active, update this value to trigger GameLift to add or
     * remove instances from the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-desiredec2instances)
     * @param desiredEc2Instances The number of EC2 instances that you want this fleet to host. 
     */
    override fun desiredEc2Instances(desiredEc2Instances: Number) {
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
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet. 
     */
    override fun ec2InboundPermissions(ec2InboundPermissions: IResolvable) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions.let(IResolvable::unwrap))
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
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet. 
     */
    override fun ec2InboundPermissions(ec2InboundPermissions: List<Any>) {
      cdkBuilder.ec2InboundPermissions(ec2InboundPermissions)
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
     * @param ec2InboundPermissions The allowed IP address ranges and port settings that allow
     * inbound traffic to access game sessions on this fleet. 
     */
    override fun ec2InboundPermissions(vararg ec2InboundPermissions: Any): Unit =
        ec2InboundPermissions(ec2InboundPermissions.toList())

    /**
     * The Amazon GameLift-supported Amazon EC2 instance type to use for all fleet instances.
     *
     * Instance type determines the computing resources that will be used to host your game servers,
     * including CPU, memory, storage, and networking capacity. See [Amazon Elastic Compute Cloud
     * Instance Types](https://docs.aws.amazon.com/ec2/instance-types/) for detailed descriptions of
     * Amazon EC2 instance types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-ec2instancetype)
     * @param ec2InstanceType The Amazon GameLift-supported Amazon EC2 instance type to use for all
     * fleet instances. 
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
     * @param instanceRoleArn A unique identifier for an IAM role with access permissions to other
     * AWS services. 
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
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-instancerolecredentialsprovider)
     * @param instanceRoleCredentialsProvider Indicates that fleet instances maintain a shared
     * credentials file for the IAM role defined in `InstanceRoleArn` . 
     */
    override fun instanceRoleCredentialsProvider(instanceRoleCredentialsProvider: String) {
      cdkBuilder.instanceRoleCredentialsProvider(instanceRoleCredentialsProvider)
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
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet. 
     */
    override fun locations(locations: IResolvable) {
      cdkBuilder.locations(locations.let(IResolvable::unwrap))
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
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet. 
     */
    override fun locations(locations: List<Any>) {
      cdkBuilder.locations(locations)
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
     * @param locations A set of remote locations to deploy additional instances to and manage as
     * part of the fleet. 
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
     * The maximum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-maxsize)
     * @param maxSize The maximum number of instances that are allowed in the specified fleet
     * location. 
     */
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
     * The minimum number of instances that are allowed in the specified fleet location.
     *
     * If this parameter is not set, the default is 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-minsize)
     * @param minSize The minimum number of instances that are allowed in the specified fleet
     * location. 
     */
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
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the AWS
     * account that owns the VPC.
     *
     * You can find your account ID in the AWS Management Console under account settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcawsaccountid)
     * @param peerVpcAwsAccountId Used when peering your Amazon GameLift fleet with a VPC, the
     * unique identifier for the AWS account that owns the VPC. 
     */
    override fun peerVpcAwsAccountId(peerVpcAwsAccountId: String) {
      cdkBuilder.peerVpcAwsAccountId(peerVpcAwsAccountId)
    }

    /**
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet.
     *
     * The VPC must be in the same Region as your fleet. To look up a VPC ID, use the [VPC
     * Dashboard](https://docs.aws.amazon.com/vpc/) in the AWS Management Console . Learn more about
     * VPC peering in [VPC Peering with Amazon GameLift
     * Fleets](https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-peervpcid)
     * @param peerVpcId A unique identifier for a VPC with resources to be accessed by your Amazon
     * GameLift fleet. 
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
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(IResolvable::unwrap))
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
      cdkBuilder.resourceCreationLimitPolicy(resourceCreationLimitPolicy.let(ResourceCreationLimitPolicyProperty::unwrap))
    }

    /**
     * A policy that limits the number of game sessions that an individual player can create on
     * instances in this fleet within a specified span of time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-fleet.html#cfn-gamelift-fleet-resourcecreationlimitpolicy)
     * @param resourceCreationLimitPolicy A policy that limits the number of game sessions that an
     * individual player can create on instances in this fleet within a specified span of time. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(IResolvable::unwrap))
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
      cdkBuilder.runtimeConfiguration(runtimeConfiguration.let(RuntimeConfigurationProperty::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.scalingPolicies(scalingPolicies.let(IResolvable::unwrap))
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
      cdkBuilder.scalingPolicies(scalingPolicies)
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
        wrapped.cdkObject
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty,
    ) : CdkObject(cdkObject), TargetConfigurationProperty {
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
          TargetConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.TargetConfigurationProperty
    }
  }

  public interface AnywhereConfigurationProperty {
    /**
     * The cost to run your fleet per hour.
     *
     * Amazon GameLift uses the provided cost of your fleet to balance usage in queues. For more
     * information about queues, see [Setting up
     * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
     * *Amazon GameLift Developer Guide* .
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
       * Amazon GameLift uses the provided cost of your fleet to balance usage in queues. For more
       * information about queues, see [Setting up
       * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
       * *Amazon GameLift Developer Guide* .
       */
      public fun cost(cost: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty.builder()

      /**
       * @param cost The cost to run your fleet per hour. 
       * Amazon GameLift uses the provided cost of your fleet to balance usage in queues. For more
       * information about queues, see [Setting up
       * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
       * *Amazon GameLift Developer Guide* .
       */
      override fun cost(cost: String) {
        cdkBuilder.cost(cost)
      }

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty,
    ) : CdkObject(cdkObject), AnywhereConfigurationProperty {
      /**
       * The cost to run your fleet per hour.
       *
       * Amazon GameLift uses the provided cost of your fleet to balance usage in queues. For more
       * information about queues, see [Setting up
       * queues](https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html) in the
       * *Amazon GameLift Developer Guide* .
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
          AnywhereConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnywhereConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.AnywhereConfigurationProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty,
    ) : CdkObject(cdkObject), IpPermissionProperty {
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
          IpPermissionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpPermissionProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.IpPermissionProperty
    }
  }

  public interface ResourceCreationLimitPolicyProperty {
    /**
     * A policy that puts limits on the number of game sessions that a player can create within a
     * specified span of time.
     *
     * With this policy, you can control players' ability to consume available resources.
     *
     * The policy is evaluated when a player tries to create a new game session. On receiving a
     * `CreateGameSession` request, Amazon GameLift checks that the player (identified by `CreatorId` )
     * has created fewer than game session limit in the specified time period.
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
       * `CreateGameSession` request, Amazon GameLift checks that the player (identified by `CreatorId`
       * ) has created fewer than game session limit in the specified time period.
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
       * `CreateGameSession` request, Amazon GameLift checks that the player (identified by `CreatorId`
       * ) has created fewer than game session limit in the specified time period.
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
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty,
    ) : CdkObject(cdkObject), ResourceCreationLimitPolicyProperty {
      /**
       * A policy that puts limits on the number of game sessions that a player can create within a
       * specified span of time.
       *
       * With this policy, you can control players' ability to consume available resources.
       *
       * The policy is evaluated when a player tries to create a new game session. On receiving a
       * `CreateGameSession` request, Amazon GameLift checks that the player (identified by `CreatorId`
       * ) has created fewer than game session limit in the specified time period.
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
          ResourceCreationLimitPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceCreationLimitPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty
    }
  }

  public interface LocationConfigurationProperty {
    /**
     * An AWS Region code, such as `us-west-2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html#cfn-gamelift-fleet-locationconfiguration-location)
     */
    public fun location(): String

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
       */
      public fun location(location: String)

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
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
      public fun locationCapacity(locationCapacity: IResolvable)

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
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
      public fun locationCapacity(locationCapacity: LocationCapacityProperty)

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5ea934de2798ac88723461897145f3614d1ebc41bacbc214d99e3e82366b78d")
      public fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty.builder()

      /**
       * @param location An AWS Region code, such as `us-west-2` . 
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
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
      override fun locationCapacity(locationCapacity: IResolvable) {
        cdkBuilder.locationCapacity(locationCapacity.let(IResolvable::unwrap))
      }

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
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
      override fun locationCapacity(locationCapacity: LocationCapacityProperty) {
        cdkBuilder.locationCapacity(locationCapacity.let(LocationCapacityProperty::unwrap))
      }

      /**
       * @param locationCapacity Current resource capacity settings in a specified fleet or
       * location.
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5ea934de2798ac88723461897145f3614d1ebc41bacbc214d99e3e82366b78d")
      override fun locationCapacity(locationCapacity: LocationCapacityProperty.Builder.() -> Unit):
          Unit = locationCapacity(LocationCapacityProperty(locationCapacity))

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty,
    ) : CdkObject(cdkObject), LocationConfigurationProperty {
      /**
       * An AWS Region code, such as `us-west-2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html#cfn-gamelift-fleet-locationconfiguration-location)
       */
      override fun location(): String = unwrap(this).getLocation()

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
          LocationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationConfigurationProperty
    }
  }

  public interface ServerProcessProperty {
    /**
     * The number of server processes using this configuration that run concurrently on each
     * instance.
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
     * Amazon GameLift doesn't support the use of setup scripts that launch the game executable. For
     * custom game builds, this parameter must indicate the executable that calls the server SDK
     * operations `initSDK()` and `ProcessReady()` .
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
       * run concurrently on each instance. 
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
       * Amazon GameLift doesn't support the use of setup scripts that launch the game executable.
       * For custom game builds, this parameter must indicate the executable that calls the server SDK
       * operations `initSDK()` and `ProcessReady()` .
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
       * run concurrently on each instance. 
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
       * Amazon GameLift doesn't support the use of setup scripts that launch the game executable.
       * For custom game builds, this parameter must indicate the executable that calls the server SDK
       * operations `initSDK()` and `ProcessReady()` .
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
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty,
    ) : CdkObject(cdkObject), ServerProcessProperty {
      /**
       * The number of server processes using this configuration that run concurrently on each
       * instance.
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
       * Amazon GameLift doesn't support the use of setup scripts that launch the game executable.
       * For custom game builds, this parameter must indicate the executable that calls the server SDK
       * operations `initSDK()` and `ProcessReady()` .
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
          ServerProcessProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerProcessProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ServerProcessProperty
    }
  }

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
     * The number of game sessions in status `ACTIVATING` to allow on an instance.
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
     * each instance in a fleet.
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
       * `ACTIVATING` to allow on an instance.
       * This setting limits the instance resources that can be used for new game activations at any
       * one time.
       */
      public fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number)

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on each instance in a fleet.
       */
      public fun serverProcesses(serverProcesses: IResolvable)

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on each instance in a fleet.
       */
      public fun serverProcesses(serverProcesses: List<Any>)

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on each instance in a fleet.
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
       * `ACTIVATING` to allow on an instance.
       * This setting limits the instance resources that can be used for new game activations at any
       * one time.
       */
      override
          fun maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations: Number) {
        cdkBuilder.maxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations)
      }

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on each instance in a fleet.
       */
      override fun serverProcesses(serverProcesses: IResolvable) {
        cdkBuilder.serverProcesses(serverProcesses.let(IResolvable::unwrap))
      }

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on each instance in a fleet.
       */
      override fun serverProcesses(serverProcesses: List<Any>) {
        cdkBuilder.serverProcesses(serverProcesses)
      }

      /**
       * @param serverProcesses A collection of server process configurations that identify what
       * server processes to run on each instance in a fleet.
       */
      override fun serverProcesses(vararg serverProcesses: Any): Unit =
          serverProcesses(serverProcesses.toList())

      public fun build():
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty,
    ) : CdkObject(cdkObject), RuntimeConfigurationProperty {
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
       * The number of game sessions in status `ACTIVATING` to allow on an instance.
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
       * each instance in a fleet.
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
          RuntimeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuntimeConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.RuntimeConfigurationProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty,
    ) : CdkObject(cdkObject), LocationCapacityProperty {
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
          LocationCapacityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationCapacityProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.LocationCapacityProperty
    }
  }

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
     * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment.
     *
     * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift with Amazon
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
       * @param metricName Name of the Amazon GameLift-defined metric that is used to trigger a
       * scaling adjustment. 
       * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift with Amazon
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
       * @param metricName Name of the Amazon GameLift-defined metric that is used to trigger a
       * scaling adjustment. 
       * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift with Amazon
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
        cdkBuilder.targetConfiguration(targetConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      override fun targetConfiguration(targetConfiguration: TargetConfigurationProperty) {
        cdkBuilder.targetConfiguration(targetConfiguration.let(TargetConfigurationProperty::unwrap))
      }

      /**
       * @param targetConfiguration An object that contains settings for a target-based scaling
       * policy.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty,
    ) : CdkObject(cdkObject), ScalingPolicyProperty {
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
       * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment.
       *
       * For detailed descriptions of fleet metrics, see [Monitor Amazon GameLift with Amazon
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
          ScalingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingPolicyProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.ScalingPolicyProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty,
    ) : CdkObject(cdkObject), CertificateConfigurationProperty {
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
          CertificateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateConfigurationProperty):
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnFleet.CertificateConfigurationProperty
    }
  }
}
