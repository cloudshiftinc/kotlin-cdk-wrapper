package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addOns(): Any? = unwrap(this).getAddOns()

  public open fun addOns(`value`: IResolvable) {
    unwrap(this).setAddOns(`value`.let(IResolvable::unwrap))
  }

  public open fun addOns(__idx_ac66f0: List<Any>) {
    unwrap(this).setAddOns(__idx_ac66f0)
  }

  public open fun addOns(vararg __idx_ac66f0: Any): Unit = addOns(__idx_ac66f0.toList())

  public open fun attrHardwareCpuCount(): Number = unwrap(this).getAttrHardwareCpuCount()

  public open fun attrHardwareRamSizeInGb(): Number = unwrap(this).getAttrHardwareRamSizeInGb()

  public open fun attrInstanceArn(): String = unwrap(this).getAttrInstanceArn()

  public open fun attrIsStaticIp(): IResolvable =
      unwrap(this).getAttrIsStaticIp().let(IResolvable::wrap)

  public open fun attrLocationAvailabilityZone(): String =
      unwrap(this).getAttrLocationAvailabilityZone()

  public open fun attrLocationRegionName(): String = unwrap(this).getAttrLocationRegionName()

  public open fun attrNetworkingMonthlyTransferGbPerMonthAllocated(): String =
      unwrap(this).getAttrNetworkingMonthlyTransferGbPerMonthAllocated()

  public open fun attrPrivateIpAddress(): String = unwrap(this).getAttrPrivateIpAddress()

  public open fun attrPublicIpAddress(): String = unwrap(this).getAttrPublicIpAddress()

  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  public open fun attrSshKeyName(): String = unwrap(this).getAttrSshKeyName()

  public open fun attrStateCode(): Number = unwrap(this).getAttrStateCode()

  public open fun attrStateName(): String = unwrap(this).getAttrStateName()

  public open fun attrSupportCode(): String = unwrap(this).getAttrSupportCode()

  public open fun attrUserName(): String = unwrap(this).getAttrUserName()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun blueprintId(): String = unwrap(this).getBlueprintId()

  public open fun blueprintId(`value`: String) {
    unwrap(this).setBlueprintId(`value`)
  }

  public open fun bundleId(): String = unwrap(this).getBundleId()

  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  public open fun hardware(): Any? = unwrap(this).getHardware()

  public open fun hardware(`value`: IResolvable) {
    unwrap(this).setHardware(`value`.let(IResolvable::unwrap))
  }

  public open fun hardware(`value`: HardwareProperty) {
    unwrap(this).setHardware(`value`.let(HardwareProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("210deb4c2b0aede0342e63d6e4a5e864eef3a0af314d56aa5f51aa9cfa65c4d3")
  public open fun hardware(`value`: HardwareProperty.Builder.() -> Unit): Unit =
      hardware(HardwareProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceName(): String = unwrap(this).getInstanceName()

  public open fun instanceName(`value`: String) {
    unwrap(this).setInstanceName(`value`)
  }

  public open fun keyPairName(): String? = unwrap(this).getKeyPairName()

  public open fun keyPairName(`value`: String) {
    unwrap(this).setKeyPairName(`value`)
  }

  public open fun location(): Any? = unwrap(this).getLocation()

  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01846ad4723fa2f70217c8c7376dc4f1b9d734cabf99d05f0117540ade67ea69")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  public open fun networking(): Any? = unwrap(this).getNetworking()

  public open fun networking(`value`: IResolvable) {
    unwrap(this).setNetworking(`value`.let(IResolvable::unwrap))
  }

  public open fun networking(`value`: NetworkingProperty) {
    unwrap(this).setNetworking(`value`.let(NetworkingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbeba1b1ea6a924ec00a10c3e795f79ee2ee162b77c3a604397419da0488f328")
  public open fun networking(`value`: NetworkingProperty.Builder.() -> Unit): Unit =
      networking(NetworkingProperty(`value`))

  public open fun state(): Any? = unwrap(this).getState()

  public open fun state(`value`: IResolvable) {
    unwrap(this).setState(`value`.let(IResolvable::unwrap))
  }

  public open fun state(`value`: StateProperty) {
    unwrap(this).setState(`value`.let(StateProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("71f52778a298c7ced0660d955eacf298ba159598f4357da8372661d1273f96e2")
  public open fun state(`value`: StateProperty.Builder.() -> Unit): Unit =
      state(StateProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userData(): String? = unwrap(this).getUserData()

  public open fun userData(`value`: String) {
    unwrap(this).setUserData(`value`)
  }

  public interface Builder {
    public fun addOns(addOns: IResolvable)

    public fun addOns(addOns: List<Any>)

    public fun addOns(vararg addOns: Any)

    public fun availabilityZone(availabilityZone: String)

    public fun blueprintId(blueprintId: String)

    public fun bundleId(bundleId: String)

    public fun hardware(hardware: IResolvable)

    public fun hardware(hardware: HardwareProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("318e4e2265b5093756cd521587cb41ea42228588cc249c960bf5b1098ffb432b")
    public fun hardware(hardware: HardwareProperty.Builder.() -> Unit)

    public fun instanceName(instanceName: String)

    public fun keyPairName(keyPairName: String)

    public fun location(location: IResolvable)

    public fun location(location: LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36af3fb44c3c13294964cfc4ce38b5c7e11856725f33f26fa2ad1413babf5556")
    public fun location(location: LocationProperty.Builder.() -> Unit)

    public fun networking(networking: IResolvable)

    public fun networking(networking: NetworkingProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80288eca0fcbbedd7b250e3f3f9a35cc5f5a324b591884dc14afe6c9ab68fca8")
    public fun networking(networking: NetworkingProperty.Builder.() -> Unit)

    public fun state(state: IResolvable)

    public fun state(state: StateProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4a829a3ed327c56b1a17ef977c991c5be342ad5f069a80fc12be3e2cb4a07a9")
    public fun state(state: StateProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userData(userData: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnInstance.Builder =
        software.amazon.awscdk.services.lightsail.CfnInstance.Builder.create(scope, id)

    override fun addOns(addOns: IResolvable) {
      cdkBuilder.addOns(addOns.let(IResolvable::unwrap))
    }

    override fun addOns(addOns: List<Any>) {
      cdkBuilder.addOns(addOns)
    }

    override fun addOns(vararg addOns: Any): Unit = addOns(addOns.toList())

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun blueprintId(blueprintId: String) {
      cdkBuilder.blueprintId(blueprintId)
    }

    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    override fun hardware(hardware: IResolvable) {
      cdkBuilder.hardware(hardware.let(IResolvable::unwrap))
    }

    override fun hardware(hardware: HardwareProperty) {
      cdkBuilder.hardware(hardware.let(HardwareProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("318e4e2265b5093756cd521587cb41ea42228588cc249c960bf5b1098ffb432b")
    override fun hardware(hardware: HardwareProperty.Builder.() -> Unit): Unit =
        hardware(HardwareProperty(hardware))

    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36af3fb44c3c13294964cfc4ce38b5c7e11856725f33f26fa2ad1413babf5556")
    override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    override fun networking(networking: IResolvable) {
      cdkBuilder.networking(networking.let(IResolvable::unwrap))
    }

    override fun networking(networking: NetworkingProperty) {
      cdkBuilder.networking(networking.let(NetworkingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80288eca0fcbbedd7b250e3f3f9a35cc5f5a324b591884dc14afe6c9ab68fca8")
    override fun networking(networking: NetworkingProperty.Builder.() -> Unit): Unit =
        networking(NetworkingProperty(networking))

    override fun state(state: IResolvable) {
      cdkBuilder.state(state.let(IResolvable::unwrap))
    }

    override fun state(state: StateProperty) {
      cdkBuilder.state(state.let(StateProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4a829a3ed327c56b1a17ef977c991c5be342ad5f069a80fc12be3e2cb4a07a9")
    override fun state(state: StateProperty.Builder.() -> Unit): Unit = state(StateProperty(state))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userData(userData: String) {
      cdkBuilder.userData(userData)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance = cdkBuilder.build()
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance): CfnInstance
        = CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance): software.amazon.awscdk.services.lightsail.CfnInstance
        = wrapped.cdkObject
  }

  public interface AutoSnapshotAddOnProperty {
    public fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()

    public interface Builder {
      public fun snapshotTimeOfDay(snapshotTimeOfDay: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty.builder()

      override fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
        cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty,
    ) : AutoSnapshotAddOnProperty {
      override fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoSnapshotAddOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty):
          AutoSnapshotAddOnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoSnapshotAddOnProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AddOnProperty {
    public fun addOnType(): String

    public fun autoSnapshotAddOnRequest(): Any? = unwrap(this).getAutoSnapshotAddOnRequest()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun addOnType(addOnType: String)

      public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable)

      public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("201312319c3956aadfaafdbc0e0e4e69b6f794a4ae1756e93487eb9d190035f0")
      public
          fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty.builder()

      override fun addOnType(addOnType: String) {
        cdkBuilder.addOnType(addOnType)
      }

      override fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.let(IResolvable::unwrap))
      }

      override fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.let(AutoSnapshotAddOnProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("201312319c3956aadfaafdbc0e0e4e69b6f794a4ae1756e93487eb9d190035f0")
      override
          fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit):
          Unit = autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty(autoSnapshotAddOnRequest))

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty,
    ) : AddOnProperty {
      override fun addOnType(): String = unwrap(this).getAddOnType()

      override fun autoSnapshotAddOnRequest(): Any? = unwrap(this).getAutoSnapshotAddOnRequest()

      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AddOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty):
          AddOnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddOnProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LocationProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun regionName(): String? = unwrap(this).getRegionName()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty,
    ) : LocationProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MonthlyTransferProperty {
    public fun gbPerMonthAllocated(): String? = unwrap(this).getGbPerMonthAllocated()

    public interface Builder {
      public fun gbPerMonthAllocated(gbPerMonthAllocated: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty.builder()

      override fun gbPerMonthAllocated(gbPerMonthAllocated: String) {
        cdkBuilder.gbPerMonthAllocated(gbPerMonthAllocated)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty,
    ) : MonthlyTransferProperty {
      override fun gbPerMonthAllocated(): String? = unwrap(this).getGbPerMonthAllocated()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonthlyTransferProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty):
          MonthlyTransferProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonthlyTransferProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PortProperty {
    public fun accessDirection(): String? = unwrap(this).getAccessDirection()

    public fun accessFrom(): String? = unwrap(this).getAccessFrom()

    public fun accessType(): String? = unwrap(this).getAccessType()

    public fun cidrListAliases(): List<String> = unwrap(this).getCidrListAliases() ?: emptyList()

    public fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

    public fun commonName(): String? = unwrap(this).getCommonName()

    public fun fromPort(): Number? = unwrap(this).getFromPort()

    public fun ipv6Cidrs(): List<String> = unwrap(this).getIpv6Cidrs() ?: emptyList()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun toPort(): Number? = unwrap(this).getToPort()

    public interface Builder {
      public fun accessDirection(accessDirection: String)

      public fun accessFrom(accessFrom: String)

      public fun accessType(accessType: String)

      public fun cidrListAliases(cidrListAliases: List<String>)

      public fun cidrListAliases(vararg cidrListAliases: String)

      public fun cidrs(cidrs: List<String>)

      public fun cidrs(vararg cidrs: String)

      public fun commonName(commonName: String)

      public fun fromPort(fromPort: Number)

      public fun ipv6Cidrs(ipv6Cidrs: List<String>)

      public fun ipv6Cidrs(vararg ipv6Cidrs: String)

      public fun protocol(protocol: String)

      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty.builder()

      override fun accessDirection(accessDirection: String) {
        cdkBuilder.accessDirection(accessDirection)
      }

      override fun accessFrom(accessFrom: String) {
        cdkBuilder.accessFrom(accessFrom)
      }

      override fun accessType(accessType: String) {
        cdkBuilder.accessType(accessType)
      }

      override fun cidrListAliases(cidrListAliases: List<String>) {
        cdkBuilder.cidrListAliases(cidrListAliases)
      }

      override fun cidrListAliases(vararg cidrListAliases: String): Unit =
          cidrListAliases(cidrListAliases.toList())

      override fun cidrs(cidrs: List<String>) {
        cdkBuilder.cidrs(cidrs)
      }

      override fun cidrs(vararg cidrs: String): Unit = cidrs(cidrs.toList())

      override fun commonName(commonName: String) {
        cdkBuilder.commonName(commonName)
      }

      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      override fun ipv6Cidrs(ipv6Cidrs: List<String>) {
        cdkBuilder.ipv6Cidrs(ipv6Cidrs)
      }

      override fun ipv6Cidrs(vararg ipv6Cidrs: String): Unit = ipv6Cidrs(ipv6Cidrs.toList())

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty,
    ) : PortProperty {
      override fun accessDirection(): String? = unwrap(this).getAccessDirection()

      override fun accessFrom(): String? = unwrap(this).getAccessFrom()

      override fun accessType(): String? = unwrap(this).getAccessType()

      override fun cidrListAliases(): List<String> = unwrap(this).getCidrListAliases() ?:
          emptyList()

      override fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

      override fun commonName(): String? = unwrap(this).getCommonName()

      override fun fromPort(): Number? = unwrap(this).getFromPort()

      override fun ipv6Cidrs(): List<String> = unwrap(this).getIpv6Cidrs() ?: emptyList()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun toPort(): Number? = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty):
          PortProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HardwareProperty {
    public fun cpuCount(): Number? = unwrap(this).getCpuCount()

    public fun disks(): Any? = unwrap(this).getDisks()

    public fun ramSizeInGb(): Number? = unwrap(this).getRamSizeInGb()

    public interface Builder {
      public fun cpuCount(cpuCount: Number)

      public fun disks(disks: IResolvable)

      public fun disks(disks: List<Any>)

      public fun disks(vararg disks: Any)

      public fun ramSizeInGb(ramSizeInGb: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty.builder()

      override fun cpuCount(cpuCount: Number) {
        cdkBuilder.cpuCount(cpuCount)
      }

      override fun disks(disks: IResolvable) {
        cdkBuilder.disks(disks.let(IResolvable::unwrap))
      }

      override fun disks(disks: List<Any>) {
        cdkBuilder.disks(disks)
      }

      override fun disks(vararg disks: Any): Unit = disks(disks.toList())

      override fun ramSizeInGb(ramSizeInGb: Number) {
        cdkBuilder.ramSizeInGb(ramSizeInGb)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty,
    ) : HardwareProperty {
      override fun cpuCount(): Number? = unwrap(this).getCpuCount()

      override fun disks(): Any? = unwrap(this).getDisks()

      override fun ramSizeInGb(): Number? = unwrap(this).getRamSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HardwareProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty):
          HardwareProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HardwareProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkingProperty {
    public fun monthlyTransfer(): Any? = unwrap(this).getMonthlyTransfer()

    public fun ports(): Any

    public interface Builder {
      public fun monthlyTransfer(monthlyTransfer: IResolvable)

      public fun monthlyTransfer(monthlyTransfer: MonthlyTransferProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff4d0c710cbbf74a4e44ae395636ac31094b5f37aa90b66fd7e1eff401f62a7a")
      public fun monthlyTransfer(monthlyTransfer: MonthlyTransferProperty.Builder.() -> Unit)

      public fun ports(ports: IResolvable)

      public fun ports(ports: List<Any>)

      public fun ports(vararg ports: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty.builder()

      override fun monthlyTransfer(monthlyTransfer: IResolvable) {
        cdkBuilder.monthlyTransfer(monthlyTransfer.let(IResolvable::unwrap))
      }

      override fun monthlyTransfer(monthlyTransfer: MonthlyTransferProperty) {
        cdkBuilder.monthlyTransfer(monthlyTransfer.let(MonthlyTransferProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ff4d0c710cbbf74a4e44ae395636ac31094b5f37aa90b66fd7e1eff401f62a7a")
      override fun monthlyTransfer(monthlyTransfer: MonthlyTransferProperty.Builder.() -> Unit):
          Unit = monthlyTransfer(MonthlyTransferProperty(monthlyTransfer))

      override fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports.let(IResolvable::unwrap))
      }

      override fun ports(ports: List<Any>) {
        cdkBuilder.ports(ports)
      }

      override fun ports(vararg ports: Any): Unit = ports(ports.toList())

      public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty,
    ) : NetworkingProperty {
      override fun monthlyTransfer(): Any? = unwrap(this).getMonthlyTransfer()

      override fun ports(): Any = unwrap(this).getPorts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty):
          NetworkingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkingProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StateProperty {
    public fun code(): Number? = unwrap(this).getCode()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun code(code: Number)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty.builder()

      override fun code(code: Number) {
        cdkBuilder.code(code)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty,
    ) : StateProperty {
      override fun code(): Number? = unwrap(this).getCode()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty):
          StateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DiskProperty {
    public fun attachedTo(): String? = unwrap(this).getAttachedTo()

    public fun attachmentState(): String? = unwrap(this).getAttachmentState()

    public fun diskName(): String

    public fun iops(): Number? = unwrap(this).getIops()

    public fun isSystemDisk(): Any? = unwrap(this).getIsSystemDisk()

    public fun path(): String

    public fun sizeInGb(): String? = unwrap(this).getSizeInGb()

    public interface Builder {
      public fun attachedTo(attachedTo: String)

      public fun attachmentState(attachmentState: String)

      public fun diskName(diskName: String)

      public fun iops(iops: Number)

      public fun isSystemDisk(isSystemDisk: Boolean)

      public fun isSystemDisk(isSystemDisk: IResolvable)

      public fun path(path: String)

      public fun sizeInGb(sizeInGb: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty.builder()

      override fun attachedTo(attachedTo: String) {
        cdkBuilder.attachedTo(attachedTo)
      }

      override fun attachmentState(attachmentState: String) {
        cdkBuilder.attachmentState(attachmentState)
      }

      override fun diskName(diskName: String) {
        cdkBuilder.diskName(diskName)
      }

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun isSystemDisk(isSystemDisk: Boolean) {
        cdkBuilder.isSystemDisk(isSystemDisk)
      }

      override fun isSystemDisk(isSystemDisk: IResolvable) {
        cdkBuilder.isSystemDisk(isSystemDisk.let(IResolvable::unwrap))
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun sizeInGb(sizeInGb: String) {
        cdkBuilder.sizeInGb(sizeInGb)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty,
    ) : DiskProperty {
      override fun attachedTo(): String? = unwrap(this).getAttachedTo()

      override fun attachmentState(): String? = unwrap(this).getAttachmentState()

      override fun diskName(): String = unwrap(this).getDiskName()

      override fun iops(): Number? = unwrap(this).getIops()

      override fun isSystemDisk(): Any? = unwrap(this).getIsSystemDisk()

      override fun path(): String = unwrap(this).getPath()

      override fun sizeInGb(): String? = unwrap(this).getSizeInGb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DiskProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty):
          DiskProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DiskProperty):
          software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
