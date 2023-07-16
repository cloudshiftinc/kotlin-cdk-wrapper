@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps

@CdkDslMarker
public class CfnLaunchConfigurationPropsDsl {
  private val cdkBuilder: CfnLaunchConfigurationProps.Builder =
      CfnLaunchConfigurationProps.builder()

  private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

  private val _classicLinkVpcSecurityGroups: MutableList<String> = mutableListOf()

  private val _securityGroups: MutableList<String> = mutableListOf()

  public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
  }

  public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
    cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
  }

  public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
    _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
  }

  public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
    _blockDeviceMappings.addAll(blockDeviceMappings)
  }

  public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
    cdkBuilder.blockDeviceMappings(blockDeviceMappings)
  }

  public fun classicLinkVpcId(classicLinkVpcId: String) {
    cdkBuilder.classicLinkVpcId(classicLinkVpcId)
  }

  public fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String) {
    _classicLinkVpcSecurityGroups.addAll(listOf(*classicLinkVpcSecurityGroups))
  }

  public fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: Collection<String>) {
    _classicLinkVpcSecurityGroups.addAll(classicLinkVpcSecurityGroups)
  }

  public fun ebsOptimized(ebsOptimized: Boolean) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun ebsOptimized(ebsOptimized: IResolvable) {
    cdkBuilder.ebsOptimized(ebsOptimized)
  }

  public fun iamInstanceProfile(iamInstanceProfile: String) {
    cdkBuilder.iamInstanceProfile(iamInstanceProfile)
  }

  public fun imageId(imageId: String) {
    cdkBuilder.imageId(imageId)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun instanceMonitoring(instanceMonitoring: Boolean) {
    cdkBuilder.instanceMonitoring(instanceMonitoring)
  }

  public fun instanceMonitoring(instanceMonitoring: IResolvable) {
    cdkBuilder.instanceMonitoring(instanceMonitoring)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun kernelId(kernelId: String) {
    cdkBuilder.kernelId(kernelId)
  }

  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  public fun launchConfigurationName(launchConfigurationName: String) {
    cdkBuilder.launchConfigurationName(launchConfigurationName)
  }

  public fun metadataOptions(metadataOptions: IResolvable) {
    cdkBuilder.metadataOptions(metadataOptions)
  }

  public fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty) {
    cdkBuilder.metadataOptions(metadataOptions)
  }

  public fun placementTenancy(placementTenancy: String) {
    cdkBuilder.placementTenancy(placementTenancy)
  }

  public fun ramDiskId(ramDiskId: String) {
    cdkBuilder.ramDiskId(ramDiskId)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun spotPrice(spotPrice: String) {
    cdkBuilder.spotPrice(spotPrice)
  }

  public fun userData(userData: String) {
    cdkBuilder.userData(userData)
  }

  public fun build(): CfnLaunchConfigurationProps {
    if(_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
    if(_classicLinkVpcSecurityGroups.isNotEmpty())
        cdkBuilder.classicLinkVpcSecurityGroups(_classicLinkVpcSecurityGroups)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
