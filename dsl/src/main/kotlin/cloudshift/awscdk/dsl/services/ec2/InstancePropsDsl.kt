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

  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun blockDevices(blockDevices: BlockDeviceDsl.() -> Unit) {
    _blockDevices.add(BlockDeviceDsl().apply(blockDevices).build())
  }

  public fun blockDevices(blockDevices: Collection<BlockDevice>) {
    _blockDevices.addAll(blockDevices)
  }

  public fun detailedMonitoring(detailedMonitoring: Boolean) {
    cdkBuilder.detailedMonitoring(detailedMonitoring)
  }

  public fun `init`(`init`: CloudFormationInit) {
    cdkBuilder.`init`(`init`)
  }

  public fun initOptions(block: ApplyCloudFormationInitOptionsDsl.() -> Unit = {}) {
    val builder = ApplyCloudFormationInitOptionsDsl()
    builder.apply(block)
    cdkBuilder.initOptions(builder.build())
  }

  public fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
    cdkBuilder.initOptions(initOptions)
  }

  public fun instanceName(instanceName: String) {
    cdkBuilder.instanceName(instanceName)
  }

  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  public fun machineImage(machineImage: IMachineImage) {
    cdkBuilder.machineImage(machineImage)
  }

  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
    cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
  }

  public fun requireImdsv2(requireImdsv2: Boolean) {
    cdkBuilder.requireImdsv2(requireImdsv2)
  }

  public fun resourceSignalTimeout(resourceSignalTimeout: Duration) {
    cdkBuilder.resourceSignalTimeout(resourceSignalTimeout)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun sourceDestCheck(sourceDestCheck: Boolean) {
    cdkBuilder.sourceDestCheck(sourceDestCheck)
  }

  public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
    cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
  }

  public fun userData(userData: UserData) {
    cdkBuilder.userData(userData)
  }

  public fun userDataCausesReplacement(userDataCausesReplacement: Boolean) {
    cdkBuilder.userDataCausesReplacement(userDataCausesReplacement)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.vpcSubnets(builder.build())
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): InstanceProps {
    if(_blockDevices.isNotEmpty()) cdkBuilder.blockDevices(_blockDevices)
    return cdkBuilder.build()
  }
}
