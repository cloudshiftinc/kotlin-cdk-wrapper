@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLaunchConfigurationProps {
  public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public fun classicLinkVpcId(): String? = unwrap(this).getClassicLinkVpcId()

  public fun classicLinkVpcSecurityGroups(): List<String> =
      unwrap(this).getClassicLinkVpcSecurityGroups() ?: emptyList()

  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  public fun imageId(): String

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public fun instanceMonitoring(): Any? = unwrap(this).getInstanceMonitoring()

  public fun instanceType(): String

  public fun kernelId(): String? = unwrap(this).getKernelId()

  public fun keyName(): String? = unwrap(this).getKeyName()

  public fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  public fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

  public fun placementTenancy(): String? = unwrap(this).getPlacementTenancy()

  public fun ramDiskId(): String? = unwrap(this).getRamDiskId()

  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun spotPrice(): String? = unwrap(this).getSpotPrice()

  public fun userData(): String? = unwrap(this).getUserData()

  @CdkDslMarker
  public interface Builder {
    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable)

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    public fun classicLinkVpcId(classicLinkVpcId: String)

    public fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: List<String>)

    public fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String)

    public fun ebsOptimized(ebsOptimized: Boolean)

    public fun ebsOptimized(ebsOptimized: IResolvable)

    public fun iamInstanceProfile(iamInstanceProfile: String)

    public fun imageId(imageId: String)

    public fun instanceId(instanceId: String)

    public fun instanceMonitoring(instanceMonitoring: Boolean)

    public fun instanceMonitoring(instanceMonitoring: IResolvable)

    public fun instanceType(instanceType: String)

    public fun kernelId(kernelId: String)

    public fun keyName(keyName: String)

    public fun launchConfigurationName(launchConfigurationName: String)

    public fun metadataOptions(metadataOptions: IResolvable)

    public fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b9df370b044535b0e084cf6b6fddaf0b677a1320ec03d6e35877db81fe5d67")
    public
        fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty.Builder.() -> Unit)

    public fun placementTenancy(placementTenancy: String)

    public fun ramDiskId(ramDiskId: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun spotPrice(spotPrice: String)

    public fun userData(userData: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps.builder()

    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
    }

    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    override fun classicLinkVpcId(classicLinkVpcId: String) {
      cdkBuilder.classicLinkVpcId(classicLinkVpcId)
    }

    override fun classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups: List<String>) {
      cdkBuilder.classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups)
    }

    override fun classicLinkVpcSecurityGroups(vararg classicLinkVpcSecurityGroups: String): Unit =
        classicLinkVpcSecurityGroups(classicLinkVpcSecurityGroups.toList())

    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    override fun iamInstanceProfile(iamInstanceProfile: String) {
      cdkBuilder.iamInstanceProfile(iamInstanceProfile)
    }

    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun instanceMonitoring(instanceMonitoring: Boolean) {
      cdkBuilder.instanceMonitoring(instanceMonitoring)
    }

    override fun instanceMonitoring(instanceMonitoring: IResolvable) {
      cdkBuilder.instanceMonitoring(instanceMonitoring.let(IResolvable::unwrap))
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun kernelId(kernelId: String) {
      cdkBuilder.kernelId(kernelId)
    }

    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun launchConfigurationName(launchConfigurationName: String) {
      cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    override fun metadataOptions(metadataOptions: IResolvable) {
      cdkBuilder.metadataOptions(metadataOptions.let(IResolvable::unwrap))
    }

    override fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty) {
      cdkBuilder.metadataOptions(metadataOptions.let(CfnLaunchConfiguration.MetadataOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34b9df370b044535b0e084cf6b6fddaf0b677a1320ec03d6e35877db81fe5d67")
    override
        fun metadataOptions(metadataOptions: CfnLaunchConfiguration.MetadataOptionsProperty.Builder.() -> Unit):
        Unit = metadataOptions(CfnLaunchConfiguration.MetadataOptionsProperty(metadataOptions))

    override fun placementTenancy(placementTenancy: String) {
      cdkBuilder.placementTenancy(placementTenancy)
    }

    override fun ramDiskId(ramDiskId: String) {
      cdkBuilder.ramDiskId(ramDiskId)
    }

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun spotPrice(spotPrice: String) {
      cdkBuilder.spotPrice(spotPrice)
    }

    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps,
  ) : CdkObject(cdkObject), CfnLaunchConfigurationProps {
    override fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    override fun classicLinkVpcId(): String? = unwrap(this).getClassicLinkVpcId()

    override fun classicLinkVpcSecurityGroups(): List<String> =
        unwrap(this).getClassicLinkVpcSecurityGroups() ?: emptyList()

    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    override fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

    override fun imageId(): String = unwrap(this).getImageId()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun instanceMonitoring(): Any? = unwrap(this).getInstanceMonitoring()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun kernelId(): String? = unwrap(this).getKernelId()

    override fun keyName(): String? = unwrap(this).getKeyName()

    override fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

    override fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

    override fun placementTenancy(): String? = unwrap(this).getPlacementTenancy()

    override fun ramDiskId(): String? = unwrap(this).getRamDiskId()

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    override fun spotPrice(): String? = unwrap(this).getSpotPrice()

    override fun userData(): String? = unwrap(this).getUserData()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps):
        CfnLaunchConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchConfigurationProps):
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfigurationProps
  }
}
