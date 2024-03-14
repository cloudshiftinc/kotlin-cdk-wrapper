package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSpotFleet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun spotFleetRequestConfigData(): Any = unwrap(this).getSpotFleetRequestConfigData()

  public open fun spotFleetRequestConfigData(`value`: IResolvable) {
    unwrap(this).setSpotFleetRequestConfigData(`value`.let(IResolvable::unwrap))
  }

  public open fun spotFleetRequestConfigData(`value`: SpotFleetRequestConfigDataProperty) {
    unwrap(this).setSpotFleetRequestConfigData(`value`.let(SpotFleetRequestConfigDataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("36d6398bf26b73cf18eb0b8c512d5387a8849d6c130a26ce24afdff186bb169a")
  public open
      fun spotFleetRequestConfigData(`value`: SpotFleetRequestConfigDataProperty.Builder.() -> Unit):
      Unit = spotFleetRequestConfigData(SpotFleetRequestConfigDataProperty(`value`))

  public interface Builder {
    public fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable) {
    }

    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02782af9bceaf15dc0153b18e3a8466d4c0f6e1b8aac50fc17032f781d56123")
    public
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSpotFleet.Builder =
        software.amazon.awscdk.services.ec2.CfnSpotFleet.Builder.create(scope, id)

    public override fun spotFleetRequestConfigData(spotFleetRequestConfigData: IResolvable) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(IResolvable::unwrap))
    }

    public override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty) {
      cdkBuilder.spotFleetRequestConfigData(spotFleetRequestConfigData.let(SpotFleetRequestConfigDataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e02782af9bceaf15dc0153b18e3a8466d4c0f6e1b8aac50fc17032f781d56123")
    public override
        fun spotFleetRequestConfigData(spotFleetRequestConfigData: SpotFleetRequestConfigDataProperty.Builder.() -> Unit):
        Unit =
        spotFleetRequestConfigData(SpotFleetRequestConfigDataProperty(spotFleetRequestConfigData))

    public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSpotFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSpotFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet): CfnSpotFleet =
        CfnSpotFleet(cdkObject)

    internal fun unwrap(wrapped: CfnSpotFleet): software.amazon.awscdk.services.ec2.CfnSpotFleet =
        wrapped.cdkObject
  }

  public interface AcceleratorCountRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty,
    ) : AcceleratorCountRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty):
          AcceleratorCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorCountRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemoryGiBPerVCpuRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty,
    ) : MemoryGiBPerVCpuRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty):
          MemoryGiBPerVCpuRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryGiBPerVCpuRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BlockDeviceMappingProperty {
    public fun deviceName(): String

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
      @JvmName("7b581e74fd883d2230af83bfae0f1a260db629bac1f4ce9b257768d201ce78ec")
      public fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit) {
      }

      public fun noDevice(noDevice: String) {
      }

      public fun virtualName(virtualName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty.builder()

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
      @JvmName("7b581e74fd883d2230af83bfae0f1a260db629bac1f4ce9b257768d201ce78ec")
      public override fun ebs(ebs: EbsBlockDeviceProperty.Builder.() -> Unit): Unit =
          ebs(EbsBlockDeviceProperty(ebs))

      public override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      public override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty,
    ) : BlockDeviceMappingProperty {
      public override fun deviceName(): String = unwrap(this).getDeviceName()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BlockDeviceMappingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SpotFleetMonitoringProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty,
    ) : SpotFleetMonitoringProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpotFleetMonitoringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty):
          SpotFleetMonitoringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetMonitoringProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetMonitoringProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VCpuCountRangeRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty,
    ) : VCpuCountRangeRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountRangeRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty):
          VCpuCountRangeRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountRangeRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.VCpuCountRangeRequestProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InstanceRequirementsRequestProperty {
    public fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

    public fun acceleratorManufacturers(): List<String> = unwrap(this).getAcceleratorManufacturers()
        ?: emptyList()

    public fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?: emptyList()

    public fun acceleratorTotalMemoryMiB(): Any? = unwrap(this).getAcceleratorTotalMemoryMiB()

    public fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?: emptyList()

    public fun allowedInstanceTypes(): List<String> = unwrap(this).getAllowedInstanceTypes() ?:
        emptyList()

    public fun bareMetal(): String? = unwrap(this).getBareMetal()

    public fun baselineEbsBandwidthMbps(): Any? = unwrap(this).getBaselineEbsBandwidthMbps()

    public fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

    public fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?: emptyList()

    public fun excludedInstanceTypes(): List<String> = unwrap(this).getExcludedInstanceTypes() ?:
        emptyList()

    public fun instanceGenerations(): List<String> = unwrap(this).getInstanceGenerations() ?:
        emptyList()

    public fun localStorage(): String? = unwrap(this).getLocalStorage()

    public fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
        emptyList()

    public fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
        unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

    public fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

    public fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

    public fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

    public fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

    public fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

    public fun requireHibernateSupport(): Any? = unwrap(this).getRequireHibernateSupport()

    public fun spotMaxPricePercentageOverLowestPrice(): Number? =
        unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

    public fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

    public fun vCpuCount(): Any? = unwrap(this).getVCpuCount()

    public interface Builder {
      public fun acceleratorCount(acceleratorCount: IResolvable) {
      }

      public fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dd7f5c7bf610209ecffc70d325c152bc449df13f10058070598a040f70d8d57")
      public
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit) {
      }

      public fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
      }

      public fun acceleratorNames(acceleratorNames: List<String>) {
      }

      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
      }

      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8cf9cb9703f14eb82a8f73fcc25a005cf1ccaa31e5242ea3fdb2620921c52f8")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit) {
      }

      public fun acceleratorTypes(acceleratorTypes: List<String>) {
      }

      public fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
      }

      public fun bareMetal(bareMetal: String) {
      }

      public fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
      }

      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce444a765458867778cd413296fa644507b6c553db7ebf192135fc3103638111")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit) {
      }

      public fun burstablePerformance(burstablePerformance: String) {
      }

      public fun cpuManufacturers(cpuManufacturers: List<String>) {
      }

      public fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
      }

      public fun instanceGenerations(instanceGenerations: List<String>) {
      }

      public fun localStorage(localStorage: String) {
      }

      public fun localStorageTypes(localStorageTypes: List<String>) {
      }

      public
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
      }

      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
      }

      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7b5fdd2320b4d86cfa68ce1a2b7060c6dd39faf19e367cc87893f53e12377fd")
      public
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit) {
      }

      public fun memoryMiB(memoryMiB: IResolvable) {
      }

      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1e55dc0730e248586fae509d59ef249f8e88094440dd0f55a4a6c83b56dacbf")
      public fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit) {
      }

      public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
      }

      public fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0174dd24edcead65c727a2273b532e9b1f0ac9946d3aa989df656d0dfbbdb913")
      public
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit) {
      }

      public fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
      }

      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35f0706514a2c7276a7e2f765daf6f31719a09e1a02759e481526025cdce636f")
      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit) {
      }

      public
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
      }

      public fun requireHibernateSupport(requireHibernateSupport: Boolean) {
      }

      public fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
      }

      public
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
      }

      public fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
      }

      public fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50564b0ff242a938558907924526f471940847924bbdbc5cebe5c89383f1a0e4")
      public
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit) {
      }

      public fun vCpuCount(vCpuCount: IResolvable) {
      }

      public fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6cba54a5ddca06f090236dc9a4804843ab47ff2b3010cee01398011e0ca44fe")
      public fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty.builder()

      public override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable::unwrap))
      }

      public override fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dd7f5c7bf610209ecffc70d325c152bc449df13f10058070598a040f70d8d57")
      public override
          fun acceleratorCount(acceleratorCount: AcceleratorCountRequestProperty.Builder.() -> Unit):
          Unit = acceleratorCount(AcceleratorCountRequestProperty(acceleratorCount))

      public override fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
        cdkBuilder.acceleratorManufacturers(acceleratorManufacturers)
      }

      public override fun acceleratorNames(acceleratorNames: List<String>) {
        cdkBuilder.acceleratorNames(acceleratorNames)
      }

      public override fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(IResolvable::unwrap))
      }

      public override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8cf9cb9703f14eb82a8f73fcc25a005cf1ccaa31e5242ea3fdb2620921c52f8")
      public override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBRequestProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty(acceleratorTotalMemoryMiB))

      public override fun acceleratorTypes(acceleratorTypes: List<String>) {
        cdkBuilder.acceleratorTypes(acceleratorTypes)
      }

      public override fun allowedInstanceTypes(allowedInstanceTypes: List<String>) {
        cdkBuilder.allowedInstanceTypes(allowedInstanceTypes)
      }

      public override fun bareMetal(bareMetal: String) {
        cdkBuilder.bareMetal(bareMetal)
      }

      public override fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: IResolvable) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(IResolvable::unwrap))
      }

      public override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce444a765458867778cd413296fa644507b6c553db7ebf192135fc3103638111")
      public override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsRequestProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty(baselineEbsBandwidthMbps))

      public override fun burstablePerformance(burstablePerformance: String) {
        cdkBuilder.burstablePerformance(burstablePerformance)
      }

      public override fun cpuManufacturers(cpuManufacturers: List<String>) {
        cdkBuilder.cpuManufacturers(cpuManufacturers)
      }

      public override fun excludedInstanceTypes(excludedInstanceTypes: List<String>) {
        cdkBuilder.excludedInstanceTypes(excludedInstanceTypes)
      }

      public override fun instanceGenerations(instanceGenerations: List<String>) {
        cdkBuilder.instanceGenerations(instanceGenerations)
      }

      public override fun localStorage(localStorage: String) {
        cdkBuilder.localStorage(localStorage)
      }

      public override fun localStorageTypes(localStorageTypes: List<String>) {
        cdkBuilder.localStorageTypes(localStorageTypes)
      }

      public override
          fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice: Number) {
        cdkBuilder.maxSpotPriceAsPercentageOfOptimalOnDemandPrice(maxSpotPriceAsPercentageOfOptimalOnDemandPrice)
      }

      public override fun memoryGiBPerVCpu(memoryGiBPerVCpu: IResolvable) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(IResolvable::unwrap))
      }

      public override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b7b5fdd2320b4d86cfa68ce1a2b7060c6dd39faf19e367cc87893f53e12377fd")
      public override
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuRequestProperty.Builder.() -> Unit):
          Unit = memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty(memoryGiBPerVCpu))

      public override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable::unwrap))
      }

      public override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1e55dc0730e248586fae509d59ef249f8e88094440dd0f55a4a6c83b56dacbf")
      public override fun memoryMiB(memoryMiB: MemoryMiBRequestProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBRequestProperty(memoryMiB))

      public override fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable::unwrap))
      }

      public override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0174dd24edcead65c727a2273b532e9b1f0ac9946d3aa989df656d0dfbbdb913")
      public override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsRequestProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty(networkBandwidthGbps))

      public override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable::unwrap))
      }

      public override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("35f0706514a2c7276a7e2f765daf6f31719a09e1a02759e481526025cdce636f")
      public override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountRequestProperty.Builder.() -> Unit):
          Unit = networkInterfaceCount(NetworkInterfaceCountRequestProperty(networkInterfaceCount))

      public override
          fun onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.onDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice)
      }

      public override fun requireHibernateSupport(requireHibernateSupport: Boolean) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport)
      }

      public override fun requireHibernateSupport(requireHibernateSupport: IResolvable) {
        cdkBuilder.requireHibernateSupport(requireHibernateSupport.let(IResolvable::unwrap))
      }

      public override
          fun spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice: Number) {
        cdkBuilder.spotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice)
      }

      public override fun totalLocalStorageGb(totalLocalStorageGb: IResolvable) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(IResolvable::unwrap))
      }

      public override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50564b0ff242a938558907924526f471940847924bbdbc5cebe5c89383f1a0e4")
      public override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBRequestProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBRequestProperty(totalLocalStorageGb))

      public override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable::unwrap))
      }

      public override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountRangeRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6cba54a5ddca06f090236dc9a4804843ab47ff2b3010cee01398011e0ca44fe")
      public override fun vCpuCount(vCpuCount: VCpuCountRangeRequestProperty.Builder.() -> Unit):
          Unit = vCpuCount(VCpuCountRangeRequestProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty,
    ) : InstanceRequirementsRequestProperty {
      public override fun acceleratorCount(): Any? = unwrap(this).getAcceleratorCount()

      public override fun acceleratorManufacturers(): List<String> =
          unwrap(this).getAcceleratorManufacturers() ?: emptyList()

      public override fun acceleratorNames(): List<String> = unwrap(this).getAcceleratorNames() ?:
          emptyList()

      public override fun acceleratorTotalMemoryMiB(): Any? =
          unwrap(this).getAcceleratorTotalMemoryMiB()

      public override fun acceleratorTypes(): List<String> = unwrap(this).getAcceleratorTypes() ?:
          emptyList()

      public override fun allowedInstanceTypes(): List<String> =
          unwrap(this).getAllowedInstanceTypes() ?: emptyList()

      public override fun bareMetal(): String? = unwrap(this).getBareMetal()

      public override fun baselineEbsBandwidthMbps(): Any? =
          unwrap(this).getBaselineEbsBandwidthMbps()

      public override fun burstablePerformance(): String? = unwrap(this).getBurstablePerformance()

      public override fun cpuManufacturers(): List<String> = unwrap(this).getCpuManufacturers() ?:
          emptyList()

      public override fun excludedInstanceTypes(): List<String> =
          unwrap(this).getExcludedInstanceTypes() ?: emptyList()

      public override fun instanceGenerations(): List<String> =
          unwrap(this).getInstanceGenerations() ?: emptyList()

      public override fun localStorage(): String? = unwrap(this).getLocalStorage()

      public override fun localStorageTypes(): List<String> = unwrap(this).getLocalStorageTypes() ?:
          emptyList()

      public override fun maxSpotPriceAsPercentageOfOptimalOnDemandPrice(): Number? =
          unwrap(this).getMaxSpotPriceAsPercentageOfOptimalOnDemandPrice()

      public override fun memoryGiBPerVCpu(): Any? = unwrap(this).getMemoryGiBPerVCpu()

      public override fun memoryMiB(): Any? = unwrap(this).getMemoryMiB()

      public override fun networkBandwidthGbps(): Any? = unwrap(this).getNetworkBandwidthGbps()

      public override fun networkInterfaceCount(): Any? = unwrap(this).getNetworkInterfaceCount()

      public override fun onDemandMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getOnDemandMaxPricePercentageOverLowestPrice()

      public override fun requireHibernateSupport(): Any? =
          unwrap(this).getRequireHibernateSupport()

      public override fun spotMaxPricePercentageOverLowestPrice(): Number? =
          unwrap(this).getSpotMaxPricePercentageOverLowestPrice()

      public override fun totalLocalStorageGb(): Any? = unwrap(this).getTotalLocalStorageGb()

      public override fun vCpuCount(): Any? = unwrap(this).getVCpuCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceRequirementsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty):
          InstanceRequirementsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpotFleetTagSpecificationProperty {
    public fun resourceType(): String? = unwrap(this).getResourceType()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun resourceType(resourceType: String) {
      }

      public fun tags(tags: List<CfnTag>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty.builder()

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty,
    ) : SpotFleetTagSpecificationProperty {
      public override fun resourceType(): String? = unwrap(this).getResourceType()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotFleetTagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty):
          SpotFleetTagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetTagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetTagSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateIpAddressSpecificationProperty {
    public fun primary(): Any? = unwrap(this).getPrimary()

    public fun privateIpAddress(): String

    public interface Builder {
      public fun primary(primary: Boolean) {
      }

      public fun primary(primary: IResolvable) {
      }

      public fun privateIpAddress(privateIpAddress: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty.builder()

      public override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      public override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      public override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty,
    ) : PrivateIpAddressSpecificationProperty {
      public override fun primary(): Any? = unwrap(this).getPrimary()

      public override fun privateIpAddress(): String = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateIpAddressSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty):
          PrivateIpAddressSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddressSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateConfigProperty {
    public fun launchTemplateSpecification(): Any? = unwrap(this).getLaunchTemplateSpecification()

    public fun overrides(): Any? = unwrap(this).getOverrides()

    public interface Builder {
      public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
      }

      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1b3aa417a1a4f76a0c9f6d398854c827997616d658347bdd91e44fc06e4cf26")
      public
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty.Builder.() -> Unit) {
      }

      public fun overrides(overrides: IResolvable) {
      }

      public fun overrides(overrides: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty.builder()

      public override fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(IResolvable::unwrap))
      }

      public override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplateSpecification(launchTemplateSpecification.let(FleetLaunchTemplateSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1b3aa417a1a4f76a0c9f6d398854c827997616d658347bdd91e44fc06e4cf26")
      public override
          fun launchTemplateSpecification(launchTemplateSpecification: FleetLaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit =
          launchTemplateSpecification(FleetLaunchTemplateSpecificationProperty(launchTemplateSpecification))

      public override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      public override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty,
    ) : LaunchTemplateConfigProperty {
      public override fun launchTemplateSpecification(): Any? =
          unwrap(this).getLaunchTemplateSpecification()

      public override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty):
          LaunchTemplateConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EbsBlockDeviceProperty {
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    public interface Builder {
      public fun deleteOnTermination(deleteOnTermination: Boolean) {
      }

      public fun deleteOnTermination(deleteOnTermination: IResolvable) {
      }

      public fun encrypted(encrypted: Boolean) {
      }

      public fun encrypted(encrypted: IResolvable) {
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
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty.builder()

      public override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      public override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      public override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      public override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
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

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty,
    ) : EbsBlockDeviceProperty {
      public override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      public override fun encrypted(): Any? = unwrap(this).getEncrypted()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty):
          EbsBlockDeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.EbsBlockDeviceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface GroupIdentifierProperty {
    public fun groupId(): String

    public interface Builder {
      public fun groupId(groupId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty.builder()

      public override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty,
    ) : GroupIdentifierProperty {
      public override fun groupId(): String = unwrap(this).getGroupId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GroupIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty):
          GroupIdentifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupIdentifierProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.GroupIdentifierProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ClassicLoadBalancerProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty,
    ) : ClassicLoadBalancerProperty {
      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClassicLoadBalancerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty):
          ClassicLoadBalancerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClassicLoadBalancerProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancerProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SpotCapacityRebalanceProperty {
    public fun replacementStrategy(): String? = unwrap(this).getReplacementStrategy()

    public fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()

    public interface Builder {
      public fun replacementStrategy(replacementStrategy: String) {
      }

      public fun terminationDelay(terminationDelay: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty.builder()

      public override fun replacementStrategy(replacementStrategy: String) {
        cdkBuilder.replacementStrategy(replacementStrategy)
      }

      public override fun terminationDelay(terminationDelay: Number) {
        cdkBuilder.terminationDelay(terminationDelay)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty,
    ) : SpotCapacityRebalanceProperty {
      public override fun replacementStrategy(): String? = unwrap(this).getReplacementStrategy()

      public override fun terminationDelay(): Number? = unwrap(this).getTerminationDelay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpotCapacityRebalanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty):
          SpotCapacityRebalanceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotCapacityRebalanceProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SpotFleetLaunchSpecificationProperty {
    public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    public fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

    public fun imageId(): String

    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun kernelId(): String? = unwrap(this).getKernelId()

    public fun keyName(): String? = unwrap(this).getKeyName()

    public fun monitoring(): Any? = unwrap(this).getMonitoring()

    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    public fun placement(): Any? = unwrap(this).getPlacement()

    public fun ramdiskId(): String? = unwrap(this).getRamdiskId()

    public fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

    public fun spotPrice(): String? = unwrap(this).getSpotPrice()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    public fun userData(): String? = unwrap(this).getUserData()

    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    public interface Builder {
      public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      }

      public fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      }

      public fun ebsOptimized(ebsOptimized: Boolean) {
      }

      public fun ebsOptimized(ebsOptimized: IResolvable) {
      }

      public fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
      }

      public fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27defe39cf25aa0ac99309255b618b67de87e7d99a5086d1362888a4ad41fa04")
      public
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty.Builder.() -> Unit) {
      }

      public fun imageId(imageId: String) {
      }

      public fun instanceRequirements(instanceRequirements: IResolvable) {
      }

      public fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02de0f240290c8b4000b34fb4f071f8d4f4c1a8c3edc2ec04c0d2307dbf00139")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun kernelId(kernelId: String) {
      }

      public fun keyName(keyName: String) {
      }

      public fun monitoring(monitoring: IResolvable) {
      }

      public fun monitoring(monitoring: SpotFleetMonitoringProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3bbdaba45c70bc746a8f3bc59611c1106c07f3c179d500e0d94f73243a1bb4")
      public fun monitoring(monitoring: SpotFleetMonitoringProperty.Builder.() -> Unit) {
      }

      public fun networkInterfaces(networkInterfaces: IResolvable) {
      }

      public fun networkInterfaces(networkInterfaces: List<Any>) {
      }

      public fun placement(placement: IResolvable) {
      }

      public fun placement(placement: SpotPlacementProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("153369991422b324183ed5a6fd319782210572c6f7e7c729150fb5bd073cd9b5")
      public fun placement(placement: SpotPlacementProperty.Builder.() -> Unit) {
      }

      public fun ramdiskId(ramdiskId: String) {
      }

      public fun securityGroups(securityGroups: IResolvable) {
      }

      public fun securityGroups(securityGroups: List<Any>) {
      }

      public fun spotPrice(spotPrice: String) {
      }

      public fun subnetId(subnetId: String) {
      }

      public fun tagSpecifications(tagSpecifications: IResolvable) {
      }

      public fun tagSpecifications(tagSpecifications: List<Any>) {
      }

      public fun userData(userData: String) {
      }

      public fun weightedCapacity(weightedCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty.builder()

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

      public override fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IResolvable::unwrap))
      }

      public override
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IamInstanceProfileSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27defe39cf25aa0ac99309255b618b67de87e7d99a5086d1362888a4ad41fa04")
      public override
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecificationProperty.Builder.() -> Unit):
          Unit = iamInstanceProfile(IamInstanceProfileSpecificationProperty(iamInstanceProfile))

      public override fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
      }

      public override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      public override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02de0f240290c8b4000b34fb4f071f8d4f4c1a8c3edc2ec04c0d2307dbf00139")
      public override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsRequestProperty(instanceRequirements))

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
      }

      public override fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
      }

      public override fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring.let(IResolvable::unwrap))
      }

      public override fun monitoring(monitoring: SpotFleetMonitoringProperty) {
        cdkBuilder.monitoring(monitoring.let(SpotFleetMonitoringProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf3bbdaba45c70bc746a8f3bc59611c1106c07f3c179d500e0d94f73243a1bb4")
      public override fun monitoring(monitoring: SpotFleetMonitoringProperty.Builder.() -> Unit):
          Unit = monitoring(SpotFleetMonitoringProperty(monitoring))

      public override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
      }

      public override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces)
      }

      public override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable::unwrap))
      }

      public override fun placement(placement: SpotPlacementProperty) {
        cdkBuilder.placement(placement.let(SpotPlacementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("153369991422b324183ed5a6fd319782210572c6f7e7c729150fb5bd073cd9b5")
      public override fun placement(placement: SpotPlacementProperty.Builder.() -> Unit): Unit =
          placement(SpotPlacementProperty(placement))

      public override fun ramdiskId(ramdiskId: String) {
        cdkBuilder.ramdiskId(ramdiskId)
      }

      public override fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups.let(IResolvable::unwrap))
      }

      public override fun securityGroups(securityGroups: List<Any>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      public override fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
      }

      public override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
      }

      public override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications)
      }

      public override fun userData(userData: String) {
        cdkBuilder.userData(userData)
      }

      public override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty,
    ) : SpotFleetLaunchSpecificationProperty {
      public override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

      public override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

      public override fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

      public override fun imageId(): String = unwrap(this).getImageId()

      public override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      public override fun instanceType(): String? = unwrap(this).getInstanceType()

      public override fun kernelId(): String? = unwrap(this).getKernelId()

      public override fun keyName(): String? = unwrap(this).getKeyName()

      public override fun monitoring(): Any? = unwrap(this).getMonitoring()

      public override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      public override fun placement(): Any? = unwrap(this).getPlacement()

      public override fun ramdiskId(): String? = unwrap(this).getRamdiskId()

      public override fun securityGroups(): Any? = unwrap(this).getSecurityGroups()

      public override fun spotPrice(): String? = unwrap(this).getSpotPrice()

      public override fun subnetId(): String? = unwrap(this).getSubnetId()

      public override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      public override fun userData(): String? = unwrap(this).getUserData()

      public override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotFleetLaunchSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty):
          SpotFleetLaunchSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetLaunchSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetLaunchSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AcceleratorTotalMemoryMiBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty,
    ) : AcceleratorTotalMemoryMiBRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AcceleratorTotalMemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty):
          AcceleratorTotalMemoryMiBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkInterfaceCountRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty,
    ) : NetworkInterfaceCountRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkInterfaceCountRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty):
          NetworkInterfaceCountRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceCountRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkInterfaceCountRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetGroupProperty {
    public fun arn(): String

    public interface Builder {
      public fun arn(arn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty,
    ) : TargetGroupProperty {
      public override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty):
          TargetGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MemoryMiBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty,
    ) : MemoryMiBRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty):
          MemoryMiBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.MemoryMiBRequestProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateOverridesProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun priority(): Number? = unwrap(this).getPriority()

    public fun spotPrice(): String? = unwrap(this).getSpotPrice()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String) {
      }

      public fun instanceRequirements(instanceRequirements: IResolvable) {
      }

      public fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ddf9b5404b04aee7a64694a12d00e743d3313875085babee8d958acad6c3dbe")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun priority(priority: Number) {
      }

      public fun spotPrice(spotPrice: String) {
      }

      public fun subnetId(subnetId: String) {
      }

      public fun weightedCapacity(weightedCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty.builder()

      public override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      public override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ddf9b5404b04aee7a64694a12d00e743d3313875085babee8d958acad6c3dbe")
      public override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsRequestProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsRequestProperty(instanceRequirements))

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public override fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
      }

      public override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty,
    ) : LaunchTemplateOverridesProperty {
      public override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      public override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      public override fun instanceType(): String? = unwrap(this).getInstanceType()

      public override fun priority(): Number? = unwrap(this).getPriority()

      public override fun spotPrice(): String? = unwrap(this).getSpotPrice()

      public override fun subnetId(): String? = unwrap(this).getSubnetId()

      public override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty):
          LaunchTemplateOverridesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateOverridesProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceNetworkInterfaceSpecificationProperty {
    public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun description(): String? = unwrap(this).getDescription()

    public fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    public fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public interface Builder {
      public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      }

      public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      }

      public fun deleteOnTermination(deleteOnTermination: Boolean) {
      }

      public fun deleteOnTermination(deleteOnTermination: IResolvable) {
      }

      public fun description(description: String) {
      }

      public fun deviceIndex(deviceIndex: Number) {
      }

      public fun groups(groups: List<String>) {
      }

      public fun ipv6AddressCount(ipv6AddressCount: Number) {
      }

      public fun ipv6Addresses(ipv6Addresses: IResolvable) {
      }

      public fun ipv6Addresses(ipv6Addresses: List<Any>) {
      }

      public fun networkInterfaceId(networkInterfaceId: String) {
      }

      public fun privateIpAddresses(privateIpAddresses: IResolvable) {
      }

      public fun privateIpAddresses(privateIpAddresses: List<Any>) {
      }

      public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
      }

      public fun subnetId(subnetId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.builder()

      public override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
      }

      public override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
      }

      public override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      public override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun deviceIndex(deviceIndex: Number) {
        cdkBuilder.deviceIndex(deviceIndex)
      }

      public override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      public override fun ipv6AddressCount(ipv6AddressCount: Number) {
        cdkBuilder.ipv6AddressCount(ipv6AddressCount)
      }

      public override fun ipv6Addresses(ipv6Addresses: IResolvable) {
        cdkBuilder.ipv6Addresses(ipv6Addresses.let(IResolvable::unwrap))
      }

      public override fun ipv6Addresses(ipv6Addresses: List<Any>) {
        cdkBuilder.ipv6Addresses(ipv6Addresses)
      }

      public override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      public override fun privateIpAddresses(privateIpAddresses: IResolvable) {
        cdkBuilder.privateIpAddresses(privateIpAddresses.let(IResolvable::unwrap))
      }

      public override fun privateIpAddresses(privateIpAddresses: List<Any>) {
        cdkBuilder.privateIpAddresses(privateIpAddresses)
      }

      public override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
      }

      public override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty,
    ) : InstanceNetworkInterfaceSpecificationProperty {
      public override fun associatePublicIpAddress(): Any? =
          unwrap(this).getAssociatePublicIpAddress()

      public override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

      public override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      public override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

      public override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

      public override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      public override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

      public override fun secondaryPrivateIpAddressCount(): Number? =
          unwrap(this).getSecondaryPrivateIpAddressCount()

      public override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceNetworkInterfaceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty):
          InstanceNetworkInterfaceSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceNetworkInterfaceSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpotFleetRequestConfigDataProperty {
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    public fun context(): String? = unwrap(this).getContext()

    public fun excessCapacityTerminationPolicy(): String? =
        unwrap(this).getExcessCapacityTerminationPolicy()

    public fun iamFleetRole(): String

    public fun instanceInterruptionBehavior(): String? =
        unwrap(this).getInstanceInterruptionBehavior()

    public fun instancePoolsToUseCount(): Number? = unwrap(this).getInstancePoolsToUseCount()

    public fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

    public fun launchTemplateConfigs(): Any? = unwrap(this).getLaunchTemplateConfigs()

    public fun loadBalancersConfig(): Any? = unwrap(this).getLoadBalancersConfig()

    public fun onDemandAllocationStrategy(): String? = unwrap(this).getOnDemandAllocationStrategy()

    public fun onDemandMaxTotalPrice(): String? = unwrap(this).getOnDemandMaxTotalPrice()

    public fun onDemandTargetCapacity(): Number? = unwrap(this).getOnDemandTargetCapacity()

    public fun replaceUnhealthyInstances(): Any? = unwrap(this).getReplaceUnhealthyInstances()

    public fun spotMaintenanceStrategies(): Any? = unwrap(this).getSpotMaintenanceStrategies()

    public fun spotMaxTotalPrice(): String? = unwrap(this).getSpotMaxTotalPrice()

    public fun spotPrice(): String? = unwrap(this).getSpotPrice()

    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    public fun targetCapacity(): Number

    public fun targetCapacityUnitType(): String? = unwrap(this).getTargetCapacityUnitType()

    public fun terminateInstancesWithExpiration(): Any? =
        unwrap(this).getTerminateInstancesWithExpiration()

    public fun type(): String? = unwrap(this).getType()

    public fun validFrom(): String? = unwrap(this).getValidFrom()

    public fun validUntil(): String? = unwrap(this).getValidUntil()

    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String) {
      }

      public fun context(context: String) {
      }

      public fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
      }

      public fun iamFleetRole(iamFleetRole: String) {
      }

      public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
      }

      public fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
      }

      public fun launchSpecifications(launchSpecifications: IResolvable) {
      }

      public fun launchSpecifications(launchSpecifications: List<Any>) {
      }

      public fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
      }

      public fun launchTemplateConfigs(launchTemplateConfigs: List<Any>) {
      }

      public fun loadBalancersConfig(loadBalancersConfig: IResolvable) {
      }

      public fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c60fe2dcead1983474af251b47bba970d17e23f115fda5d9d90a420e3001af9")
      public
          fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty.Builder.() -> Unit) {
      }

      public fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
      }

      public fun onDemandMaxTotalPrice(onDemandMaxTotalPrice: String) {
      }

      public fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
      }

      public fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
      }

      public fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
      }

      public fun spotMaintenanceStrategies(spotMaintenanceStrategies: IResolvable) {
      }

      public
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3d6bed7153d74918df0f41ea1dd754235f7102e4aad5f967e77002ce2cb00fe")
      public
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty.Builder.() -> Unit) {
      }

      public fun spotMaxTotalPrice(spotMaxTotalPrice: String) {
      }

      public fun spotPrice(spotPrice: String) {
      }

      public fun tagSpecifications(tagSpecifications: IResolvable) {
      }

      public fun tagSpecifications(tagSpecifications: List<Any>) {
      }

      public fun targetCapacity(targetCapacity: Number) {
      }

      public fun targetCapacityUnitType(targetCapacityUnitType: String) {
      }

      public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
      }

      public fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
      }

      public fun type(type: String) {
      }

      public fun validFrom(validFrom: String) {
      }

      public fun validUntil(validUntil: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty.builder()

      public override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      public override fun context(context: String) {
        cdkBuilder.context(context)
      }

      public override fun excessCapacityTerminationPolicy(excessCapacityTerminationPolicy: String) {
        cdkBuilder.excessCapacityTerminationPolicy(excessCapacityTerminationPolicy)
      }

      public override fun iamFleetRole(iamFleetRole: String) {
        cdkBuilder.iamFleetRole(iamFleetRole)
      }

      public override fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
      }

      public override fun instancePoolsToUseCount(instancePoolsToUseCount: Number) {
        cdkBuilder.instancePoolsToUseCount(instancePoolsToUseCount)
      }

      public override fun launchSpecifications(launchSpecifications: IResolvable) {
        cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable::unwrap))
      }

      public override fun launchSpecifications(launchSpecifications: List<Any>) {
        cdkBuilder.launchSpecifications(launchSpecifications)
      }

      public override fun launchTemplateConfigs(launchTemplateConfigs: IResolvable) {
        cdkBuilder.launchTemplateConfigs(launchTemplateConfigs.let(IResolvable::unwrap))
      }

      public override fun launchTemplateConfigs(launchTemplateConfigs: List<Any>) {
        cdkBuilder.launchTemplateConfigs(launchTemplateConfigs)
      }

      public override fun loadBalancersConfig(loadBalancersConfig: IResolvable) {
        cdkBuilder.loadBalancersConfig(loadBalancersConfig.let(IResolvable::unwrap))
      }

      public override fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty) {
        cdkBuilder.loadBalancersConfig(loadBalancersConfig.let(LoadBalancersConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c60fe2dcead1983474af251b47bba970d17e23f115fda5d9d90a420e3001af9")
      public override
          fun loadBalancersConfig(loadBalancersConfig: LoadBalancersConfigProperty.Builder.() -> Unit):
          Unit = loadBalancersConfig(LoadBalancersConfigProperty(loadBalancersConfig))

      public override fun onDemandAllocationStrategy(onDemandAllocationStrategy: String) {
        cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
      }

      public override fun onDemandMaxTotalPrice(onDemandMaxTotalPrice: String) {
        cdkBuilder.onDemandMaxTotalPrice(onDemandMaxTotalPrice)
      }

      public override fun onDemandTargetCapacity(onDemandTargetCapacity: Number) {
        cdkBuilder.onDemandTargetCapacity(onDemandTargetCapacity)
      }

      public override fun replaceUnhealthyInstances(replaceUnhealthyInstances: Boolean) {
        cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances)
      }

      public override fun replaceUnhealthyInstances(replaceUnhealthyInstances: IResolvable) {
        cdkBuilder.replaceUnhealthyInstances(replaceUnhealthyInstances.let(IResolvable::unwrap))
      }

      public override fun spotMaintenanceStrategies(spotMaintenanceStrategies: IResolvable) {
        cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies.let(IResolvable::unwrap))
      }

      public override
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty) {
        cdkBuilder.spotMaintenanceStrategies(spotMaintenanceStrategies.let(SpotMaintenanceStrategiesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3d6bed7153d74918df0f41ea1dd754235f7102e4aad5f967e77002ce2cb00fe")
      public override
          fun spotMaintenanceStrategies(spotMaintenanceStrategies: SpotMaintenanceStrategiesProperty.Builder.() -> Unit):
          Unit =
          spotMaintenanceStrategies(SpotMaintenanceStrategiesProperty(spotMaintenanceStrategies))

      public override fun spotMaxTotalPrice(spotMaxTotalPrice: String) {
        cdkBuilder.spotMaxTotalPrice(spotMaxTotalPrice)
      }

      public override fun spotPrice(spotPrice: String) {
        cdkBuilder.spotPrice(spotPrice)
      }

      public override fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
      }

      public override fun tagSpecifications(tagSpecifications: List<Any>) {
        cdkBuilder.tagSpecifications(tagSpecifications)
      }

      public override fun targetCapacity(targetCapacity: Number) {
        cdkBuilder.targetCapacity(targetCapacity)
      }

      public override fun targetCapacityUnitType(targetCapacityUnitType: String) {
        cdkBuilder.targetCapacityUnitType(targetCapacityUnitType)
      }

      public override
          fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: Boolean) {
        cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration)
      }

      public override
          fun terminateInstancesWithExpiration(terminateInstancesWithExpiration: IResolvable) {
        cdkBuilder.terminateInstancesWithExpiration(terminateInstancesWithExpiration.let(IResolvable::unwrap))
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public override fun validFrom(validFrom: String) {
        cdkBuilder.validFrom(validFrom)
      }

      public override fun validUntil(validUntil: String) {
        cdkBuilder.validUntil(validUntil)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty,
    ) : SpotFleetRequestConfigDataProperty {
      public override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      public override fun context(): String? = unwrap(this).getContext()

      public override fun excessCapacityTerminationPolicy(): String? =
          unwrap(this).getExcessCapacityTerminationPolicy()

      public override fun iamFleetRole(): String = unwrap(this).getIamFleetRole()

      public override fun instanceInterruptionBehavior(): String? =
          unwrap(this).getInstanceInterruptionBehavior()

      public override fun instancePoolsToUseCount(): Number? =
          unwrap(this).getInstancePoolsToUseCount()

      public override fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

      public override fun launchTemplateConfigs(): Any? = unwrap(this).getLaunchTemplateConfigs()

      public override fun loadBalancersConfig(): Any? = unwrap(this).getLoadBalancersConfig()

      public override fun onDemandAllocationStrategy(): String? =
          unwrap(this).getOnDemandAllocationStrategy()

      public override fun onDemandMaxTotalPrice(): String? = unwrap(this).getOnDemandMaxTotalPrice()

      public override fun onDemandTargetCapacity(): Number? =
          unwrap(this).getOnDemandTargetCapacity()

      public override fun replaceUnhealthyInstances(): Any? =
          unwrap(this).getReplaceUnhealthyInstances()

      public override fun spotMaintenanceStrategies(): Any? =
          unwrap(this).getSpotMaintenanceStrategies()

      public override fun spotMaxTotalPrice(): String? = unwrap(this).getSpotMaxTotalPrice()

      public override fun spotPrice(): String? = unwrap(this).getSpotPrice()

      public override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      public override fun targetCapacity(): Number = unwrap(this).getTargetCapacity()

      public override fun targetCapacityUnitType(): String? =
          unwrap(this).getTargetCapacityUnitType()

      public override fun terminateInstancesWithExpiration(): Any? =
          unwrap(this).getTerminateInstancesWithExpiration()

      public override fun type(): String? = unwrap(this).getType()

      public override fun validFrom(): String? = unwrap(this).getValidFrom()

      public override fun validUntil(): String? = unwrap(this).getValidUntil()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotFleetRequestConfigDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty):
          SpotFleetRequestConfigDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotFleetRequestConfigDataProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpotPlacementProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun groupName(): String? = unwrap(this).getGroupName()

    public fun tenancy(): String? = unwrap(this).getTenancy()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String) {
      }

      public fun groupName(groupName: String) {
      }

      public fun tenancy(tenancy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty.builder()

      public override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      public override fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty,
    ) : SpotPlacementProperty {
      public override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      public override fun groupName(): String? = unwrap(this).getGroupName()

      public override fun tenancy(): String? = unwrap(this).getTenancy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpotPlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty):
          SpotPlacementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotPlacementProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotPlacementProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FleetLaunchTemplateSpecificationProperty {
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    public fun version(): String

    public interface Builder {
      public fun launchTemplateId(launchTemplateId: String) {
      }

      public fun launchTemplateName(launchTemplateName: String) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.builder()

      public override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      public override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty,
    ) : FleetLaunchTemplateSpecificationProperty {
      public override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      public override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      public override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          FleetLaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty):
          FleetLaunchTemplateSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FleetLaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetGroupsConfigProperty {
    public fun targetGroups(): Any

    public interface Builder {
      public fun targetGroups(targetGroups: IResolvable) {
      }

      public fun targetGroups(targetGroups: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty.builder()

      public override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable::unwrap))
      }

      public override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty,
    ) : TargetGroupsConfigProperty {
      public override fun targetGroups(): Any = unwrap(this).getTargetGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty):
          TargetGroupsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupsConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TargetGroupsConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BaselineEbsBandwidthMbpsRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty,
    ) : BaselineEbsBandwidthMbpsRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          BaselineEbsBandwidthMbpsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty):
          BaselineEbsBandwidthMbpsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineEbsBandwidthMbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.BaselineEbsBandwidthMbpsRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceIpv6AddressProperty {
    public fun ipv6Address(): String

    public interface Builder {
      public fun ipv6Address(ipv6Address: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty.builder()

      public override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty,
    ) : InstanceIpv6AddressProperty {
      public override fun ipv6Address(): String = unwrap(this).getIpv6Address()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceIpv6AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty):
          InstanceIpv6AddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceIpv6AddressProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IamInstanceProfileSpecificationProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public interface Builder {
      public fun arn(arn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty,
    ) : IamInstanceProfileSpecificationProperty {
      public override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IamInstanceProfileSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty):
          IamInstanceProfileSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamInstanceProfileSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.IamInstanceProfileSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoadBalancersConfigProperty {
    public fun classicLoadBalancersConfig(): Any? = unwrap(this).getClassicLoadBalancersConfig()

    public fun targetGroupsConfig(): Any? = unwrap(this).getTargetGroupsConfig()

    public interface Builder {
      public fun classicLoadBalancersConfig(classicLoadBalancersConfig: IResolvable) {
      }

      public
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25b177d5ab308e359fc68672e76e4f903124271a3a7479bab51b0656361308b0")
      public
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty.Builder.() -> Unit) {
      }

      public fun targetGroupsConfig(targetGroupsConfig: IResolvable) {
      }

      public fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8017e6e27f4e464d54ac3f8fdb795873361e4735def7ddb9ba1e753fc1e521c9")
      public
          fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty.builder()

      public override fun classicLoadBalancersConfig(classicLoadBalancersConfig: IResolvable) {
        cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig.let(IResolvable::unwrap))
      }

      public override
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty) {
        cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig.let(ClassicLoadBalancersConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25b177d5ab308e359fc68672e76e4f903124271a3a7479bab51b0656361308b0")
      public override
          fun classicLoadBalancersConfig(classicLoadBalancersConfig: ClassicLoadBalancersConfigProperty.Builder.() -> Unit):
          Unit =
          classicLoadBalancersConfig(ClassicLoadBalancersConfigProperty(classicLoadBalancersConfig))

      public override fun targetGroupsConfig(targetGroupsConfig: IResolvable) {
        cdkBuilder.targetGroupsConfig(targetGroupsConfig.let(IResolvable::unwrap))
      }

      public override fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty) {
        cdkBuilder.targetGroupsConfig(targetGroupsConfig.let(TargetGroupsConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8017e6e27f4e464d54ac3f8fdb795873361e4735def7ddb9ba1e753fc1e521c9")
      public override
          fun targetGroupsConfig(targetGroupsConfig: TargetGroupsConfigProperty.Builder.() -> Unit):
          Unit = targetGroupsConfig(TargetGroupsConfigProperty(targetGroupsConfig))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty,
    ) : LoadBalancersConfigProperty {
      public override fun classicLoadBalancersConfig(): Any? =
          unwrap(this).getClassicLoadBalancersConfig()

      public override fun targetGroupsConfig(): Any? = unwrap(this).getTargetGroupsConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty):
          LoadBalancersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancersConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.LoadBalancersConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkBandwidthGbpsRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty,
    ) : NetworkBandwidthGbpsRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NetworkBandwidthGbpsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty):
          NetworkBandwidthGbpsRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkBandwidthGbpsRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.NetworkBandwidthGbpsRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClassicLoadBalancersConfigProperty {
    public fun classicLoadBalancers(): Any

    public interface Builder {
      public fun classicLoadBalancers(classicLoadBalancers: IResolvable) {
      }

      public fun classicLoadBalancers(classicLoadBalancers: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty.builder()

      public override fun classicLoadBalancers(classicLoadBalancers: IResolvable) {
        cdkBuilder.classicLoadBalancers(classicLoadBalancers.let(IResolvable::unwrap))
      }

      public override fun classicLoadBalancers(classicLoadBalancers: List<Any>) {
        cdkBuilder.classicLoadBalancers(classicLoadBalancers)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty,
    ) : ClassicLoadBalancersConfigProperty {
      public override fun classicLoadBalancers(): Any = unwrap(this).getClassicLoadBalancers()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ClassicLoadBalancersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty):
          ClassicLoadBalancersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClassicLoadBalancersConfigProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.ClassicLoadBalancersConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TotalLocalStorageGBRequestProperty {
    public fun max(): Number? = unwrap(this).getMax()

    public fun min(): Number? = unwrap(this).getMin()

    public interface Builder {
      public fun max(max: Number) {
      }

      public fun min(min: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty,
    ) : TotalLocalStorageGBRequestProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TotalLocalStorageGBRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty):
          TotalLocalStorageGBRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TotalLocalStorageGBRequestProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.TotalLocalStorageGBRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpotMaintenanceStrategiesProperty {
    public fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()

    public interface Builder {
      public fun capacityRebalance(capacityRebalance: IResolvable) {
      }

      public fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2573a18d019a336fa9f65454022b27033103109b979f9370b6b039c2e26ba7e3")
      public
          fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty.builder()

      public override fun capacityRebalance(capacityRebalance: IResolvable) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(IResolvable::unwrap))
      }

      public override fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty) {
        cdkBuilder.capacityRebalance(capacityRebalance.let(SpotCapacityRebalanceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2573a18d019a336fa9f65454022b27033103109b979f9370b6b039c2e26ba7e3")
      public override
          fun capacityRebalance(capacityRebalance: SpotCapacityRebalanceProperty.Builder.() -> Unit):
          Unit = capacityRebalance(SpotCapacityRebalanceProperty(capacityRebalance))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty,
    ) : SpotMaintenanceStrategiesProperty {
      public override fun capacityRebalance(): Any? = unwrap(this).getCapacityRebalance()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotMaintenanceStrategiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty):
          SpotMaintenanceStrategiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotMaintenanceStrategiesProperty):
          software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
