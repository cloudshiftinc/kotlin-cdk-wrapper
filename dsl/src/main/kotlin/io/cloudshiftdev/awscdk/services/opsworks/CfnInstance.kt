package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opsworks.CfnInstance,
) : CfnResource(cdkObject), IInspectable {
  public open fun agentVersion(): String? = unwrap(this).getAgentVersion()

  public open fun agentVersion(`value`: String) {
    unwrap(this).setAgentVersion(`value`)
  }

  public open fun amiId(): String? = unwrap(this).getAmiId()

  public open fun amiId(`value`: String) {
    unwrap(this).setAmiId(`value`)
  }

  public open fun architecture(): String? = unwrap(this).getArchitecture()

  public open fun architecture(`value`: String) {
    unwrap(this).setArchitecture(`value`)
  }

  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrPrivateDnsName(): String = unwrap(this).getAttrPrivateDnsName()

  public open fun attrPrivateIp(): String = unwrap(this).getAttrPrivateIp()

  public open fun attrPublicDnsName(): String = unwrap(this).getAttrPublicDnsName()

  public open fun attrPublicIp(): String = unwrap(this).getAttrPublicIp()

  public open fun autoScalingType(): String? = unwrap(this).getAutoScalingType()

  public open fun autoScalingType(`value`: String) {
    unwrap(this).setAutoScalingType(`value`)
  }

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public open fun blockDeviceMappings(`value`: IResolvable) {
    unwrap(this).setBlockDeviceMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun blockDeviceMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setBlockDeviceMappings(__idx_ac66f0)
  }

  public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public open fun ebsOptimized(`value`: Boolean) {
    unwrap(this).setEbsOptimized(`value`)
  }

  public open fun ebsOptimized(`value`: IResolvable) {
    unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticIps(): List<String> = unwrap(this).getElasticIps() ?: emptyList()

  public open fun elasticIps(`value`: List<String>) {
    unwrap(this).setElasticIps(`value`)
  }

  public open fun hostname(): String? = unwrap(this).getHostname()

  public open fun hostname(`value`: String) {
    unwrap(this).setHostname(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

  public open fun installUpdatesOnBoot(`value`: Boolean) {
    unwrap(this).setInstallUpdatesOnBoot(`value`)
  }

  public open fun installUpdatesOnBoot(`value`: IResolvable) {
    unwrap(this).setInstallUpdatesOnBoot(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun layerIds(): List<String> = unwrap(this).getLayerIds() ?: emptyList()

  public open fun layerIds(`value`: List<String>) {
    unwrap(this).setLayerIds(`value`)
  }

  public open fun os(): String? = unwrap(this).getOs()

  public open fun os(`value`: String) {
    unwrap(this).setOs(`value`)
  }

  public open fun rootDeviceType(): String? = unwrap(this).getRootDeviceType()

  public open fun rootDeviceType(`value`: String) {
    unwrap(this).setRootDeviceType(`value`)
  }

  public open fun sshKeyName(): String? = unwrap(this).getSshKeyName()

  public open fun sshKeyName(`value`: String) {
    unwrap(this).setSshKeyName(`value`)
  }

  public open fun stackId(): String = unwrap(this).getStackId()

  public open fun stackId(`value`: String) {
    unwrap(this).setStackId(`value`)
  }

  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public open fun tenancy(): String? = unwrap(this).getTenancy()

  public open fun tenancy(`value`: String) {
    unwrap(this).setTenancy(`value`)
  }

  public open fun timeBasedAutoScaling(): Any? = unwrap(this).getTimeBasedAutoScaling()

  public open fun timeBasedAutoScaling(`value`: IResolvable) {
    unwrap(this).setTimeBasedAutoScaling(`value`.let(IResolvable::unwrap))
  }

  public open fun timeBasedAutoScaling(`value`: TimeBasedAutoScalingProperty) {
    unwrap(this).setTimeBasedAutoScaling(`value`.let(TimeBasedAutoScalingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f521e5bdafa2648c29e002efc36f16affce3d77183cfea885aa91c3070deecb6")
  public open fun timeBasedAutoScaling(`value`: TimeBasedAutoScalingProperty.Builder.() -> Unit):
      Unit = timeBasedAutoScaling(TimeBasedAutoScalingProperty(`value`))

  public open fun virtualizationType(): String? = unwrap(this).getVirtualizationType()

  public open fun virtualizationType(`value`: String) {
    unwrap(this).setVirtualizationType(`value`)
  }

  public open fun volumes(): List<String> = unwrap(this).getVolumes() ?: emptyList()

  public open fun volumes(`value`: List<String>) {
    unwrap(this).setVolumes(`value`)
  }

  public interface Builder {
    public fun agentVersion(agentVersion: String) {
    }

    public fun amiId(amiId: String) {
    }

    public fun architecture(architecture: String) {
    }

    public fun autoScalingType(autoScalingType: String) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
    }

    public fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
    }

    public fun ebsOptimized(ebsOptimized: Boolean) {
    }

    public fun ebsOptimized(ebsOptimized: IResolvable) {
    }

    public fun elasticIps(elasticIps: List<String>) {
    }

    public fun hostname(hostname: String) {
    }

    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
    }

    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
    }

    public fun instanceType(instanceType: String) {
    }

    public fun layerIds(layerIds: List<String>) {
    }

    public fun os(os: String) {
    }

    public fun rootDeviceType(rootDeviceType: String) {
    }

    public fun sshKeyName(sshKeyName: String) {
    }

    public fun stackId(stackId: String) {
    }

    public fun subnetId(subnetId: String) {
    }

    public fun tenancy(tenancy: String) {
    }

    public fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable) {
    }

    public fun timeBasedAutoScaling(timeBasedAutoScaling: TimeBasedAutoScalingProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d0f4085d8c13f8af5e1920e12319b76161cac1bdcdc6e741f66421e1ad2eb89")
    public
        fun timeBasedAutoScaling(timeBasedAutoScaling: TimeBasedAutoScalingProperty.Builder.() -> Unit) {
    }

    public fun virtualizationType(virtualizationType: String) {
    }

    public fun volumes(volumes: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnInstance.Builder =
        software.amazon.awscdk.services.opsworks.CfnInstance.Builder.create(scope, id)

    public override fun agentVersion(agentVersion: String) {
      cdkBuilder.agentVersion(agentVersion)
    }

    public override fun amiId(amiId: String) {
      cdkBuilder.amiId(amiId)
    }

    public override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    public override fun autoScalingType(autoScalingType: String) {
      cdkBuilder.autoScalingType(autoScalingType)
    }

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    public override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    public override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    public override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    public override fun elasticIps(elasticIps: List<String>) {
      cdkBuilder.elasticIps(elasticIps)
    }

    public override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    public override fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    public override fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot.let(IResolvable::unwrap))
    }

    public override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    public override fun layerIds(layerIds: List<String>) {
      cdkBuilder.layerIds(layerIds)
    }

    public override fun os(os: String) {
      cdkBuilder.os(os)
    }

    public override fun rootDeviceType(rootDeviceType: String) {
      cdkBuilder.rootDeviceType(rootDeviceType)
    }

    public override fun sshKeyName(sshKeyName: String) {
      cdkBuilder.sshKeyName(sshKeyName)
    }

    public override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    public override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    public override fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable) {
      cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling.let(IResolvable::unwrap))
    }

    public override fun timeBasedAutoScaling(timeBasedAutoScaling: TimeBasedAutoScalingProperty) {
      cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling.let(TimeBasedAutoScalingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d0f4085d8c13f8af5e1920e12319b76161cac1bdcdc6e741f66421e1ad2eb89")
    public override
        fun timeBasedAutoScaling(timeBasedAutoScaling: TimeBasedAutoScalingProperty.Builder.() -> Unit):
        Unit = timeBasedAutoScaling(TimeBasedAutoScalingProperty(timeBasedAutoScaling))

    public override fun virtualizationType(virtualizationType: String) {
      cdkBuilder.virtualizationType(virtualizationType)
    }

    public override fun volumes(volumes: List<String>) {
      cdkBuilder.volumes(volumes)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnInstance = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnInstance): CfnInstance
        = CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance): software.amazon.awscdk.services.opsworks.CfnInstance
        = wrapped.cdkObject
  }

  public interface TimeBasedAutoScalingProperty {
    public fun friday(): Any? = unwrap(this).getFriday()

    public fun monday(): Any? = unwrap(this).getMonday()

    public fun saturday(): Any? = unwrap(this).getSaturday()

    public fun sunday(): Any? = unwrap(this).getSunday()

    public fun thursday(): Any? = unwrap(this).getThursday()

    public fun tuesday(): Any? = unwrap(this).getTuesday()

    public fun wednesday(): Any? = unwrap(this).getWednesday()

    public interface Builder {
      public fun friday(friday: IResolvable) {
      }

      public fun friday(friday: Map<String, String>) {
      }

      public fun monday(monday: IResolvable) {
      }

      public fun monday(monday: Map<String, String>) {
      }

      public fun saturday(saturday: IResolvable) {
      }

      public fun saturday(saturday: Map<String, String>) {
      }

      public fun sunday(sunday: IResolvable) {
      }

      public fun sunday(sunday: Map<String, String>) {
      }

      public fun thursday(thursday: IResolvable) {
      }

      public fun thursday(thursday: Map<String, String>) {
      }

      public fun tuesday(tuesday: IResolvable) {
      }

      public fun tuesday(tuesday: Map<String, String>) {
      }

      public fun wednesday(wednesday: IResolvable) {
      }

      public fun wednesday(wednesday: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.Builder
          =
          software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty.builder()

      public override fun friday(friday: IResolvable) {
        cdkBuilder.friday(friday.let(IResolvable::unwrap))
      }

      public override fun friday(friday: Map<String, String>) {
        cdkBuilder.friday(friday)
      }

      public override fun monday(monday: IResolvable) {
        cdkBuilder.monday(monday.let(IResolvable::unwrap))
      }

      public override fun monday(monday: Map<String, String>) {
        cdkBuilder.monday(monday)
      }

      public override fun saturday(saturday: IResolvable) {
        cdkBuilder.saturday(saturday.let(IResolvable::unwrap))
      }

      public override fun saturday(saturday: Map<String, String>) {
        cdkBuilder.saturday(saturday)
      }

      public override fun sunday(sunday: IResolvable) {
        cdkBuilder.sunday(sunday.let(IResolvable::unwrap))
      }

      public override fun sunday(sunday: Map<String, String>) {
        cdkBuilder.sunday(sunday)
      }

      public override fun thursday(thursday: IResolvable) {
        cdkBuilder.thursday(thursday.let(IResolvable::unwrap))
      }

      public override fun thursday(thursday: Map<String, String>) {
        cdkBuilder.thursday(thursday)
      }

      public override fun tuesday(tuesday: IResolvable) {
        cdkBuilder.tuesday(tuesday.let(IResolvable::unwrap))
      }

      public override fun tuesday(tuesday: Map<String, String>) {
        cdkBuilder.tuesday(tuesday)
      }

      public override fun wednesday(wednesday: IResolvable) {
        cdkBuilder.wednesday(wednesday.let(IResolvable::unwrap))
      }

      public override fun wednesday(wednesday: Map<String, String>) {
        cdkBuilder.wednesday(wednesday)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty,
    ) : TimeBasedAutoScalingProperty {
      public override fun friday(): Any? = unwrap(this).getFriday()

      public override fun monday(): Any? = unwrap(this).getMonday()

      public override fun saturday(): Any? = unwrap(this).getSaturday()

      public override fun sunday(): Any? = unwrap(this).getSunday()

      public override fun thursday(): Any? = unwrap(this).getThursday()

      public override fun tuesday(): Any? = unwrap(this).getTuesday()

      public override fun wednesday(): Any? = unwrap(this).getWednesday()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeBasedAutoScalingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty):
          TimeBasedAutoScalingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeBasedAutoScalingProperty):
          software.amazon.awscdk.services.opsworks.CfnInstance.TimeBasedAutoScalingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbsBlockDeviceProperty {
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    public interface Builder {
      public fun deleteOnTermination(deleteOnTermination: Boolean) {
      }

      public fun deleteOnTermination(deleteOnTermination: IResolvable) {
      }

      public fun iops(iops: Number) {
      }

      public fun snapshotId(snapshotId: String) {
      }

      public fun volumeSize(volumeSize: Number) {
      }

      public fun volumeType(volumeType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty.builder()

      public override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      public override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      public override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      public override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      public override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      public override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty,
    ) : EbsBlockDeviceProperty {
      public override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      public override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty):
          EbsBlockDeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceProperty):
          software.amazon.awscdk.services.opsworks.CfnInstance.EbsBlockDeviceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BlockDeviceMappingProperty {
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    public fun ebs(): Any? = unwrap(this).getEbs()

    public fun noDevice(): String? = unwrap(this).getNoDevice()

    public fun virtualName(): String? = unwrap(this).getVirtualName()

    public interface Builder {
      public fun deviceName(deviceName: String) {
      }

      public fun ebs(ebs: IResolvable) {
      }

      public fun ebs(ebs: EbsBlockDeviceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2db9fbc79bd708ea3ad6349cce8c96ac5bda7031f43285f108268ea1eec10429")
      public fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit) {
      }

      public fun noDevice(noDevice: String) {
      }

      public fun virtualName(virtualName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty.builder()

      public override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      public override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      public override fun ebs(ebs: EbsBlockDeviceProperty) {
        cdkBuilder.ebs(ebs.let(EbsBlockDeviceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2db9fbc79bd708ea3ad6349cce8c96ac5bda7031f43285f108268ea1eec10429")
      public override fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit): Unit =
          ebs(EbsBlockDeviceProperty(ebs))

      public override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      public override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty,
    ) : BlockDeviceMappingProperty {
      public override fun deviceName(): String? = unwrap(this).getDeviceName()

      public override fun ebs(): Any? = unwrap(this).getEbs()

      public override fun noDevice(): String? = unwrap(this).getNoDevice()

      public override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.opsworks.CfnInstance.BlockDeviceMappingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
