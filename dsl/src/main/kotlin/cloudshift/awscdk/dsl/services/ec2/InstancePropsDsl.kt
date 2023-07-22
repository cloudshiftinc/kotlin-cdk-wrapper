@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions
import software.amazon.awscdk.services.ec2.BlockDevice
import software.amazon.awscdk.services.ec2.CloudFormationInit
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceProps
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class InstancePropsDsl {
  private val cdkBuilder: InstanceProps.Builder = InstanceProps.builder()

  private val _blockDevices: MutableList<BlockDevice> = mutableListOf()

  /**
   * @param allowAllOutbound Whether the instance could initiate connections to anywhere by default.
   * This property is only used when you do not provide a security group.
   */
  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  /**
   * @param associatePublicIpAddress Whether to associate a public IP address to the primary network
   * interface attached to this instance.
   */
  public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
  }

  /**
   * @param availabilityZone In which AZ to place the instance within the VPC.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
   * virtual devices and EBS volumes.
   * Each instance that is launched has an associated root device volume,
   * either an Amazon EBS volume or an instance store volume.
   * You can use block device mappings to specify additional EBS volumes or
   * instance store volumes to attach to an instance when it is launched.
   */
  public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
    _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
  }

  /**
   * @param blockDevices Specifies how block devices are exposed to the instance. You can specify
   * virtual devices and EBS volumes.
   * Each instance that is launched has an associated root device volume,
   * either an Amazon EBS volume or an instance store volume.
   * You can use block device mappings to specify additional EBS volumes or
   * instance store volumes to attach to an instance when it is launched.
   */
  public fun blockDevices(blockDevices: Collection<BlockDevice>) {
    _blockDevices.addAll(blockDevices)
  }

  /**
   * @param detailedMonitoring Whether "Detailed Monitoring" is enabled for this instance Keep in
   * mind that Detailed Monitoring results in extra charges.
   */
  public fun detailedMonitoring(detailedMonitoring: Boolean) {
    cdkBuilder.detailedMonitoring(detailedMonitoring)
  }

  /**
   * @param init Apply the given CloudFormation Init configuration to the instance at startup.
   */
  public fun `init`(`init`: CloudFormationInit) {
    cdkBuilder.`init`(`init`)
  }

  /**
   * @param initOptions Use the given options for applying CloudFormation Init.
   * Describes the configsets to use and the timeout to wait
   */
  public fun initOptions(initOptions: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}) {
    val builder = ApplyCloudFormationInitOptionsDsl()
    builder.apply(initOptions)
    cdkBuilder.initOptions(builder.build())
  }

  /**
   * @param initOptions Use the given options for applying CloudFormation Init.
   * Describes the configsets to use and the timeout to wait
   */
  public fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
    cdkBuilder.initOptions(initOptions)
  }

  /**
   * @param instanceName The name of the instance.
   */
  public fun instanceName(instanceName: String) {
    cdkBuilder.instanceName(instanceName)
  }

  /**
   * @param instanceType Type of instance to launch. 
   */
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param keyName Name of SSH keypair to grant access to instance.
   */
  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  /**
   * @param machineImage AMI to launch. 
   */
  public fun machineImage(machineImage: IMachineImage) {
    cdkBuilder.machineImage(machineImage)
  }

  /**
   * @param privateIpAddress Defines a private IP address to associate with an instance.
   * Private IP should be available within the VPC that the instance is build within.
   */
  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  /**
   * @param propagateTagsToVolumeOnCreation Propagate the EC2 instance tags to the EBS volumes.
   */
  public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
    cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
  }

  /**
   * @param requireImdsv2 Whether IMDSv2 should be required on this instance.
   */
  public fun requireImdsv2(requireImdsv2: Boolean) {
    cdkBuilder.requireImdsv2(requireImdsv2)
  }

  /**
   * @param resourceSignalTimeout The length of time to wait for the resourceSignalCount.
   * The maximum value is 43200 (12 hours).
   */
  public fun resourceSignalTimeout(resourceSignalTimeout: Duration) {
    cdkBuilder.resourceSignalTimeout(resourceSignalTimeout)
  }

  /**
   * @param role An IAM role to associate with the instance profile assigned to this Auto Scaling
   * Group.
   * The role must be assumable by the service principal `ec2.amazonaws.com`:
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param securityGroup Security Group to assign to this instance.
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
   * NAT.
   * This controls whether source/destination checking is enabled on the instance.
   * A value of true means that checking is enabled, and false means that checking is disabled.
   * The value must be false for the instance to perform NAT.
   */
  public fun sourceDestCheck(sourceDestCheck: Boolean) {
    cdkBuilder.sourceDestCheck(sourceDestCheck)
  }

  /**
   * @param ssmSessionPermissions Add SSM session permissions to the instance role.
   * Setting this to `true` adds the necessary permissions to connect
   * to the instance using SSM Session Manager. You can do this
   * from the AWS Console.
   *
   * NOTE: Setting this flag to `true` may not be enough by itself.
   * You must also use an AMI that comes with the SSM Agent, or install
   * the SSM Agent yourself. See
   * [Working with SSM
   * Agent](https://docs.aws.amazon.com/systems-manager/latest/userguide/ssm-agent.html)
   * in the SSM Developer Guide.
   */
  public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
    cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
  }

  /**
   * @param userData Specific UserData to use.
   * The UserData may still be mutated after creation.
   */
  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  /**
   * @param userDataCausesReplacement Changes to the UserData force replacement.
   * Depending the EC2 instance type, changing UserData either
   * restarts the instance or replaces the instance.
   *
   * * Instance store-backed instances are replaced.
   * * EBS-backed instances are restarted.
   *
   * By default, restarting does not execute the new UserData so you
   * will need a different mechanism to ensure the instance is restarted.
   *
   * Setting this to `true` will make the instance's Logical ID depend on the
   * UserData, which will cause CloudFormation to replace it if the UserData
   * changes.
   */
  public fun userDataCausesReplacement(userDataCausesReplacement: Boolean) {
    cdkBuilder.userDataCausesReplacement(userDataCausesReplacement)
  }

  /**
   * @param vpc VPC to launch the instance in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpcSubnets Where to place the instance within the VPC.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * @param vpcSubnets Where to place the instance within the VPC.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): InstanceProps {
    if(_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
    return cdkBuilder.build()
  }
}
