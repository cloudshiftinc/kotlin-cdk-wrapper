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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.CpuCredits
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.LaunchTemplate
import software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens
import software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IInstanceProfile
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * This represents an EC2 LaunchTemplate.
 *
 * Example:
 * ```
 * Vpc vpc;
 * SecurityGroup sg1 = SecurityGroup.Builder.create(this, "sg1")
 * .vpc(vpc)
 * .build();
 * SecurityGroup sg2 = SecurityGroup.Builder.create(this, "sg2")
 * .vpc(vpc)
 * .build();
 * LaunchTemplate launchTemplate = LaunchTemplate.Builder.create(this, "LaunchTemplate")
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * .securityGroup(sg1)
 * .build();
 * launchTemplate.addSecurityGroup(sg2);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html)
 */
@CdkDslMarker
public class LaunchTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LaunchTemplate.Builder = LaunchTemplate.Builder.create(scope, id)

    private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

    /**
     * Whether instances should have a public IP addresses associated with them.
     *
     * Default: - Use subnet settings
     *
     * @param associatePublicIpAddress Whether instances should have a public IP addresses
     *   associated with them.
     */
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and
     * EBS volumes.
     *
     * Each instance that is launched has an associated root device volume, either an Amazon EBS
     * volume or an instance store volume. You can use block device mappings to specify additional
     * EBS volumes or instance store volumes to attach to an instance when it is launched.
     *
     * Default: - Uses the block device mapping of the AMI
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     *
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     *   virtual devices and EBS volumes.
     */
    public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
        _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
    }

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and
     * EBS volumes.
     *
     * Each instance that is launched has an associated root device volume, either an Amazon EBS
     * volume or an instance store volume. You can use block device mappings to specify additional
     * EBS volumes or instance store volumes to attach to an instance when it is launched.
     *
     * Default: - Uses the block device mapping of the AMI
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
     *
     * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
     *   virtual devices and EBS volumes.
     */
    public fun blockDevices(blockDevices: Collection<BlockDevice>) {
        _blockDevices.addAll(blockDevices)
    }

    /**
     * CPU credit type for burstable EC2 instance types.
     *
     * Default: - No credit type is specified in the Launch Template.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html)
     *
     * @param cpuCredits CPU credit type for burstable EC2 instance types.
     */
    public fun cpuCredits(cpuCredits: CpuCredits) {
        cdkBuilder.cpuCredits(cpuCredits)
    }

    /**
     * If set to true, then detailed monitoring will be enabled on instances created with this
     * launch template.
     *
     * Default: False - Detailed monitoring is disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch-new.html)
     *
     * @param detailedMonitoring If set to true, then detailed monitoring will be enabled on
     *   instances created with this launch template.
     */
    public fun detailedMonitoring(detailedMonitoring: Boolean) {
        cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    /**
     * If you set this parameter to true, you cannot terminate the instances launched with this
     * launch template using the Amazon EC2 console, CLI, or API;
     *
     * otherwise, you can.
     *
     * Default: - The API termination setting is not specified in the Launch Template.
     *
     * @param disableApiTermination If you set this parameter to true, you cannot terminate the
     *   instances launched with this launch template using the Amazon EC2 console, CLI, or API;.
     */
    public fun disableApiTermination(disableApiTermination: Boolean) {
        cdkBuilder.disableApiTermination(disableApiTermination)
    }

    /**
     * Indicates whether the instances are optimized for Amazon EBS I/O.
     *
     * This optimization provides dedicated throughput to Amazon EBS and an optimized configuration
     * stack to provide optimal Amazon EBS I/O performance. This optimization isn't available with
     * all instance types. Additional usage charges apply when using an EBS-optimized instance.
     *
     * Default: - EBS optimization is not specified in the launch template.
     *
     * @param ebsOptimized Indicates whether the instances are optimized for Amazon EBS I/O.
     */
    public fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
    }

    /**
     * If you set this parameter to true, the instance is enabled for hibernation.
     *
     * Default: - Hibernation configuration is not specified in the launch template; defaulting to
     * false.
     *
     * @param hibernationConfigured If you set this parameter to true, the instance is enabled for
     *   hibernation.
     */
    public fun hibernationConfigured(hibernationConfigured: Boolean) {
        cdkBuilder.hibernationConfigured(hibernationConfigured)
    }

    /**
     * Enables or disables the HTTP metadata endpoint on your instances.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpendpoint)
     *
     * @param httpEndpoint Enables or disables the HTTP metadata endpoint on your instances.
     */
    public fun httpEndpoint(httpEndpoint: Boolean) {
        cdkBuilder.httpEndpoint(httpEndpoint)
    }

    /**
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     *
     * Default: true
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpprotocolipv6)
     *
     * @param httpProtocolIpv6 Enables or disables the IPv6 endpoint for the instance metadata
     *   service.
     */
    public fun httpProtocolIpv6(httpProtocolIpv6: Boolean) {
        cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
    }

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     *
     * The larger the number, the further instance metadata requests can travel.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httpputresponsehoplimit)
     *
     * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata
     *   requests.
     */
    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    /**
     * The state of token usage for your instance metadata requests.
     *
     * The default state is `optional` if not specified. However, if requireImdsv2 is true, the
     * state must be `required`.
     *
     * Default: LaunchTemplateHttpTokens.OPTIONAL
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-httptokens)
     *
     * @param httpTokens The state of token usage for your instance metadata requests.
     */
    public fun httpTokens(httpTokens: LaunchTemplateHttpTokens) {
        cdkBuilder.httpTokens(httpTokens)
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     *
     * Default: - Shutdown behavior is not specified in the launch template; defaults to STOP.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior)
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates
     *   when you initiate shutdown from the instance (using the operating system command for system
     *   shutdown).
     */
    public fun instanceInitiatedShutdownBehavior(
        instanceInitiatedShutdownBehavior: InstanceInitiatedShutdownBehavior
    ) {
        cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
    }

    /**
     * Set to enabled to allow access to instance tags from the instance metadata.
     *
     * Set to disabled to turn off access to instance tags from the instance metadata.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-metadataoptions.html#cfn-ec2-launchtemplate-launchtemplatedata-metadataoptions-instancemetadatatags)
     *
     * @param instanceMetadataTags Set to enabled to allow access to instance tags from the instance
     *   metadata.
     */
    public fun instanceMetadataTags(instanceMetadataTags: Boolean) {
        cdkBuilder.instanceMetadataTags(instanceMetadataTags)
    }

    /**
     * The instance profile used to pass role information to EC2 instances.
     *
     * Note: You can provide an instanceProfile or a role, but not both.
     *
     * Default: - No instance profile
     *
     * @param instanceProfile The instance profile used to pass role information to EC2 instances.
     */
    public fun instanceProfile(instanceProfile: IInstanceProfile) {
        cdkBuilder.instanceProfile(instanceProfile)
    }

    /**
     * Type of instance to launch.
     *
     * Default: - This Launch Template does not specify a default Instance Type.
     *
     * @param instanceType Type of instance to launch.
     */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * Name of SSH keypair to grant access to instance.
     *
     * Default: - No SSH access will be possible.
     *
     * @param keyName Name of SSH keypair to grant access to instance.
     */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /**
     * Name for this launch template.
     *
     * Default: Automatically generated name
     *
     * @param launchTemplateName Name for this launch template.
     */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template does not specify a default AMI.
     *
     * @param machineImage The AMI that will be used by instances.
     */
    public fun machineImage(machineImage: IMachineImage) {
        cdkBuilder.machineImage(machineImage)
    }

    /**
     * If this parameter is set to true, the instance is enabled for AWS Nitro Enclaves;
     *
     * otherwise, it is not enabled for AWS Nitro Enclaves.
     *
     * Default: - Enablement of Nitro enclaves is not specified in the launch template; defaulting
     * to false.
     *
     * @param nitroEnclaveEnabled If this parameter is set to true, the instance is enabled for AWS
     *   Nitro Enclaves;.
     */
    public fun nitroEnclaveEnabled(nitroEnclaveEnabled: Boolean) {
        cdkBuilder.nitroEnclaveEnabled(nitroEnclaveEnabled)
    }

    /**
     * Whether IMDSv2 should be required on launched instances.
     *
     * Default: - false
     *
     * @param requireImdsv2 Whether IMDSv2 should be required on launched instances.
     */
    public fun requireImdsv2(requireImdsv2: Boolean) {
        cdkBuilder.requireImdsv2(requireImdsv2)
    }

    /**
     * An IAM role to associate with the instance profile that is used by instances.
     *
     * The role must be assumable by the service principal `ec2.amazonaws.com`. Note: You can
     * provide an instanceProfile or a role, but not both.
     *
     * Default: - No new role is created.
     *
     * Example:
     * ```
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("ec2.amazonaws.com"))
     * .build();
     * ```
     *
     * @param role An IAM role to associate with the instance profile that is used by instances.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * Security group to assign to instances created with the launch template.
     *
     * Default: No security group is assigned.
     *
     * @param securityGroup Security group to assign to instances created with the launch template.
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
     * use Spot instances, and the options for the Spot instances will be as defined.
     *
     * Default: - Instance launched with this template will not be spot instances.
     *
     * @param spotOptions If this property is defined, then the Launch Template's
     *   InstanceMarketOptions will be set to use Spot instances, and the options for the Spot
     *   instances will be as defined.
     */
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptionsDsl.() -> Unit = {}) {
        val builder = LaunchTemplateSpotOptionsDsl()
        builder.apply(spotOptions)
        cdkBuilder.spotOptions(builder.build())
    }

    /**
     * If this property is defined, then the Launch Template's InstanceMarketOptions will be set to
     * use Spot instances, and the options for the Spot instances will be as defined.
     *
     * Default: - Instance launched with this template will not be spot instances.
     *
     * @param spotOptions If this property is defined, then the Launch Template's
     *   InstanceMarketOptions will be set to use Spot instances, and the options for the Spot
     *   instances will be as defined.
     */
    public fun spotOptions(spotOptions: LaunchTemplateSpotOptions) {
        cdkBuilder.spotOptions(spotOptions)
    }

    /**
     * The AMI that will be used by instances.
     *
     * Default: - This Launch Template creates a UserData based on the type of provided
     * machineImage; no UserData is created if a machineImage is not provided
     *
     * @param userData The AMI that will be used by instances.
     */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): LaunchTemplate {
        if (_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
        return cdkBuilder.build()
    }
}
