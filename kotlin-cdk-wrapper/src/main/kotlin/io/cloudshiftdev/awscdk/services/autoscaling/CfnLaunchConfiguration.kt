@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLaunchConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

  public open fun associatePublicIpAddress(`value`: Boolean) {
    unwrap(this).setAssociatePublicIpAddress(`value`)
  }

  public open fun associatePublicIpAddress(`value`: IResolvable) {
    unwrap(this).setAssociatePublicIpAddress(`value`.let(IResolvable::unwrap))
  }

  public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public open fun blockDeviceMappings(`value`: IResolvable) {
    unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun blockDeviceMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setBlockDeviceMappings(__idx_ac66f0)
  }

  public open fun blockDeviceMappings(vararg __idx_ac66f0: Any): Unit =
      blockDeviceMappings(__idx_ac66f0.toList())

  public open fun classicLinkVpcId(): String? = unwrap(this).getClassicLinkVpcId()

  public open fun classicLinkVpcId(`value`: String) {
    unwrap(this).setClassicLinkVpcId(`value`)
  }

  public open fun classicLinkVpcSecurityGroups(): List<String> =
      unwrap(this).getClassicLinkVpcSecurityGroups() ?: emptyList()

  public open fun classicLinkVpcSecurityGroups(`value`: List<String>) {
    unwrap(this).setClassicLinkVpcSecurityGroups(`value`)
  }

  public open fun classicLinkVpcSecurityGroups(vararg `value`: String): Unit =
      classicLinkVpcSecurityGroups(`value`.toList())

  public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public open fun ebsOptimized(`value`: Boolean) {
    unwrap(this).setEbsOptimized(`value`)
  }

  public open fun ebsOptimized(`value`: IResolvable) {
    unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
  }

  public open fun iamInstanceProfile(): String? = unwrap(this).getIamInstanceProfile()

  public open fun iamInstanceProfile(`value`: String) {
    unwrap(this).setIamInstanceProfile(`value`)
  }

  public open fun imageId(): String = unwrap(this).getImageId()

  public open fun imageId(`value`: String) {
    unwrap(this).setImageId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun instanceMonitoring(): Any? = unwrap(this).getInstanceMonitoring()

  public open fun instanceMonitoring(`value`: Boolean) {
    unwrap(this).setInstanceMonitoring(`value`)
  }

  public open fun instanceMonitoring(`value`: IResolvable) {
    unwrap(this).setInstanceMonitoring(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun kernelId(): String? = unwrap(this).getKernelId()

  public open fun kernelId(`value`: String) {
    unwrap(this).setKernelId(`value`)
  }

  public open fun keyName(): String? = unwrap(this).getKeyName()

  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  public open fun launchConfigurationName(): String? = unwrap(this).getLaunchConfigurationName()

  public open fun launchConfigurationName(`value`: String) {
    unwrap(this).setLaunchConfigurationName(`value`)
  }

  public open fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

  public open fun metadataOptions(`value`: IResolvable) {
    unwrap(this).setMetadataOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun metadataOptions(`value`: MetadataOptionsProperty) {
    unwrap(this).setMetadataOptions(`value`.let(MetadataOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4003fe177379216a0b77445c3913079d56618147dad35f5793af427b200cd069")
  public open fun metadataOptions(`value`: MetadataOptionsProperty.Builder.() -> Unit): Unit =
      metadataOptions(MetadataOptionsProperty(`value`))

  public open fun placementTenancy(): String? = unwrap(this).getPlacementTenancy()

  public open fun placementTenancy(`value`: String) {
    unwrap(this).setPlacementTenancy(`value`)
  }

  public open fun ramDiskId(): String? = unwrap(this).getRamDiskId()

  public open fun ramDiskId(`value`: String) {
    unwrap(this).setRamDiskId(`value`)
  }

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  public open fun spotPrice(): String? = unwrap(this).getSpotPrice()

  public open fun spotPrice(`value`: String) {
    unwrap(this).setSpotPrice(`value`)
  }

  public open fun userData(): String? = unwrap(this).getUserData()

  public open fun userData(`value`: String) {
    unwrap(this).setUserData(`value`)
  }

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

    public fun metadataOptions(metadataOptions: MetadataOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("513551109ed8d0f72b2ca5220ce06aa5107153969a922074ef35f22729c3ff38")
    public fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit)

    public fun placementTenancy(placementTenancy: String)

    public fun ramDiskId(ramDiskId: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun spotPrice(spotPrice: String)

    public fun userData(userData: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.Builder =
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.Builder.create(scope, id)

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

    override fun metadataOptions(metadataOptions: MetadataOptionsProperty) {
      cdkBuilder.metadataOptions(metadataOptions.let(MetadataOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("513551109ed8d0f72b2ca5220ce06aa5107153969a922074ef35f22729c3ff38")
    override fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit): Unit
        = metadataOptions(MetadataOptionsProperty(metadataOptions))

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

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration):
        CfnLaunchConfiguration = CfnLaunchConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchConfiguration):
        software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration = wrapped.cdkObject
  }

  public interface BlockDeviceProperty {
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    @CdkDslMarker
    public interface Builder {
      public fun deleteOnTermination(deleteOnTermination: Boolean)

      public fun deleteOnTermination(deleteOnTermination: IResolvable)

      public fun encrypted(encrypted: Boolean)

      public fun encrypted(encrypted: IResolvable)

      public fun iops(iops: Number)

      public fun snapshotId(snapshotId: String)

      public fun throughput(throughput: Number)

      public fun volumeSize(volumeSize: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty.builder()

      override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty,
    ) : CdkObject(cdkObject), BlockDeviceProperty {
      override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      override fun encrypted(): Any? = unwrap(this).getEncrypted()

      override fun iops(): Number? = unwrap(this).getIops()

      override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      override fun throughput(): Number? = unwrap(this).getThroughput()

      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty):
          BlockDeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceProperty):
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceProperty
    }
  }

  public interface BlockDeviceMappingProperty {
    public fun deviceName(): String

    public fun ebs(): Any? = unwrap(this).getEbs()

    public fun noDevice(): Any? = unwrap(this).getNoDevice()

    public fun virtualName(): String? = unwrap(this).getVirtualName()

    @CdkDslMarker
    public interface Builder {
      public fun deviceName(deviceName: String)

      public fun ebs(ebs: IResolvable)

      public fun ebs(ebs: BlockDeviceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("498defb44b04ba985a3da13c5cac0272c5dcbe8289a5c5d25a4116cc88bcada7")
      public fun ebs(ebs: BlockDeviceProperty.Builder.() -> Unit)

      public fun noDevice(noDevice: Boolean)

      public fun noDevice(noDevice: IResolvable)

      public fun virtualName(virtualName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty.builder()

      override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      override fun ebs(ebs: BlockDeviceProperty) {
        cdkBuilder.ebs(ebs.let(BlockDeviceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("498defb44b04ba985a3da13c5cac0272c5dcbe8289a5c5d25a4116cc88bcada7")
      override fun ebs(ebs: BlockDeviceProperty.Builder.() -> Unit): Unit =
          ebs(BlockDeviceProperty(ebs))

      override fun noDevice(noDevice: Boolean) {
        cdkBuilder.noDevice(noDevice)
      }

      override fun noDevice(noDevice: IResolvable) {
        cdkBuilder.noDevice(noDevice.let(IResolvable::unwrap))
      }

      override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty,
    ) : CdkObject(cdkObject), BlockDeviceMappingProperty {
      override fun deviceName(): String = unwrap(this).getDeviceName()

      override fun ebs(): Any? = unwrap(this).getEbs()

      override fun noDevice(): Any? = unwrap(this).getNoDevice()

      override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.BlockDeviceMappingProperty
    }
  }

  public interface MetadataOptionsProperty {
    public fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

    public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    public fun httpTokens(): String? = unwrap(this).getHttpTokens()

    @CdkDslMarker
    public interface Builder {
      public fun httpEndpoint(httpEndpoint: String)

      public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

      public fun httpTokens(httpTokens: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty.builder()

      override fun httpEndpoint(httpEndpoint: String) {
        cdkBuilder.httpEndpoint(httpEndpoint)
      }

      override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
      }

      override fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty,
    ) : CdkObject(cdkObject), MetadataOptionsProperty {
      override fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

      override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

      override fun httpTokens(): String? = unwrap(this).getHttpTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty):
          MetadataOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataOptionsProperty):
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration.MetadataOptionsProperty
    }
  }
}
