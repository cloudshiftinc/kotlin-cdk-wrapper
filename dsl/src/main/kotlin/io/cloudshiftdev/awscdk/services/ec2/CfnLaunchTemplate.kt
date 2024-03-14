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

public open class CfnLaunchTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDefaultVersionNumber(): String = unwrap(this).getAttrDefaultVersionNumber()

  public open fun attrLatestVersionNumber(): String = unwrap(this).getAttrLatestVersionNumber()

  public open fun attrLaunchTemplateId(): String = unwrap(this).getAttrLaunchTemplateId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun launchTemplateData(): Any = unwrap(this).getLaunchTemplateData()

  public open fun launchTemplateData(`value`: IResolvable) {
    unwrap(this).setLaunchTemplateData(`value`.let(IResolvable::unwrap))
  }

  public open fun launchTemplateData(`value`: LaunchTemplateDataProperty) {
    unwrap(this).setLaunchTemplateData(`value`.let(LaunchTemplateDataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("73d58d86b183faf9c22bf4c3340228b108285241b9defded643458e84c81949d")
  public open fun launchTemplateData(`value`: LaunchTemplateDataProperty.Builder.() -> Unit): Unit =
      launchTemplateData(LaunchTemplateDataProperty(`value`))

  public open fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

  public open fun launchTemplateName(`value`: String) {
    unwrap(this).setLaunchTemplateName(`value`)
  }

  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun tagSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(__idx_ac66f0)
  }

  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  public interface Builder {
    public fun launchTemplateData(launchTemplateData: IResolvable) {
    }

    public fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc18067754864f0fa773cab73d5bca9bb457987000eb5ce581f15be00c87a8d")
    public
        fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty.Builder.() -> Unit) {
    }

    public fun launchTemplateName(launchTemplateName: String) {
    }

    public fun tagSpecifications(tagSpecifications: IResolvable) {
    }

    public fun tagSpecifications(tagSpecifications: List<Any>) {
    }

    public fun versionDescription(versionDescription: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Builder =
        software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Builder.create(scope, id)

    public override fun launchTemplateData(launchTemplateData: IResolvable) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(IResolvable::unwrap))
    }

    public override fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty) {
      cdkBuilder.launchTemplateData(launchTemplateData.let(LaunchTemplateDataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5fc18067754864f0fa773cab73d5bca9bb457987000eb5ce581f15be00c87a8d")
    public override
        fun launchTemplateData(launchTemplateData: LaunchTemplateDataProperty.Builder.() -> Unit):
        Unit = launchTemplateData(LaunchTemplateDataProperty(launchTemplateData))

    public override fun launchTemplateName(launchTemplateName: String) {
      cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    public override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    public override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate):
        CfnLaunchTemplate = CfnLaunchTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchTemplate):
        software.amazon.awscdk.services.ec2.CfnLaunchTemplate = wrapped.cdkObject
  }

  public interface EnclaveOptionsProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty,
    ) : EnclaveOptionsProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnclaveOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty):
          EnclaveOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnclaveOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnclaveOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NetworkInterfaceCountProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty,
    ) : NetworkInterfaceCountProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceCountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty):
          NetworkInterfaceCountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceCountProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceCountProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpotOptionsProperty {
    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    public fun instanceInterruptionBehavior(): String? =
        unwrap(this).getInstanceInterruptionBehavior()

    public fun maxPrice(): String? = unwrap(this).getMaxPrice()

    public fun spotInstanceType(): String? = unwrap(this).getSpotInstanceType()

    public fun validUntil(): String? = unwrap(this).getValidUntil()

    public interface Builder {
      public fun blockDurationMinutes(blockDurationMinutes: Number) {
      }

      public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
      }

      public fun maxPrice(maxPrice: String) {
      }

      public fun spotInstanceType(spotInstanceType: String) {
      }

      public fun validUntil(validUntil: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty.builder()

      public override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      public override fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
        cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
      }

      public override fun maxPrice(maxPrice: String) {
        cdkBuilder.maxPrice(maxPrice)
      }

      public override fun spotInstanceType(spotInstanceType: String) {
        cdkBuilder.spotInstanceType(spotInstanceType)
      }

      public override fun validUntil(validUntil: String) {
        cdkBuilder.validUntil(validUntil)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty,
    ) : SpotOptionsProperty {
      public override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      public override fun instanceInterruptionBehavior(): String? =
          unwrap(this).getInstanceInterruptionBehavior()

      public override fun maxPrice(): String? = unwrap(this).getMaxPrice()

      public override fun spotInstanceType(): String? = unwrap(this).getSpotInstanceType()

      public override fun validUntil(): String? = unwrap(this).getValidUntil()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpotOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty):
          SpotOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateDataProperty {
    public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    public fun capacityReservationSpecification(): Any? =
        unwrap(this).getCapacityReservationSpecification()

    public fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

    public fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

    public fun disableApiStop(): Any? = unwrap(this).getDisableApiStop()

    public fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    public fun elasticGpuSpecifications(): Any? = unwrap(this).getElasticGpuSpecifications()

    public fun elasticInferenceAccelerators(): Any? = unwrap(this).getElasticInferenceAccelerators()

    public fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

    public fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

    public fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

    public fun imageId(): String? = unwrap(this).getImageId()

    public fun instanceInitiatedShutdownBehavior(): String? =
        unwrap(this).getInstanceInitiatedShutdownBehavior()

    public fun instanceMarketOptions(): Any? = unwrap(this).getInstanceMarketOptions()

    public fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun kernelId(): String? = unwrap(this).getKernelId()

    public fun keyName(): String? = unwrap(this).getKeyName()

    public fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

    public fun maintenanceOptions(): Any? = unwrap(this).getMaintenanceOptions()

    public fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

    public fun monitoring(): Any? = unwrap(this).getMonitoring()

    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    public fun placement(): Any? = unwrap(this).getPlacement()

    public fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

    public fun ramDiskId(): String? = unwrap(this).getRamDiskId()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    public fun userData(): String? = unwrap(this).getUserData()

    public interface Builder {
      public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      }

      public fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      }

      public fun capacityReservationSpecification(capacityReservationSpecification: IResolvable) {
      }

      public
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7538c816f6b8ad00a2d467e58e27594cdd64e0cd65cc1a1e0c894ee8e5b165a0")
      public
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty.Builder.() -> Unit) {
      }

      public fun cpuOptions(cpuOptions: IResolvable) {
      }

      public fun cpuOptions(cpuOptions: CpuOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259e3b5c06cb5bf8c8108e0c786375e6a9cea676a84ba635b0c1c801565c8c24")
      public fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit) {
      }

      public fun creditSpecification(creditSpecification: IResolvable) {
      }

      public fun creditSpecification(creditSpecification: CreditSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c519e21ccdfb01d70cdf605a898774b356db73d7a867105c93e7548d3dbbd7f5")
      public
          fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit) {
      }

      public fun disableApiStop(disableApiStop: Boolean) {
      }

      public fun disableApiStop(disableApiStop: IResolvable) {
      }

      public fun disableApiTermination(disableApiTermination: Boolean) {
      }

      public fun disableApiTermination(disableApiTermination: IResolvable) {
      }

      public fun ebsOptimized(ebsOptimized: Boolean) {
      }

      public fun ebsOptimized(ebsOptimized: IResolvable) {
      }

      public fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
      }

      public fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>) {
      }

      public fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
      }

      public fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>) {
      }

      public fun enclaveOptions(enclaveOptions: IResolvable) {
      }

      public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1a4d0253198ddd3f5824e73df1255a4da4abfb9fb30dfb987a7cc2b9a138")
      public fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit) {
      }

      public fun hibernationOptions(hibernationOptions: IResolvable) {
      }

      public fun hibernationOptions(hibernationOptions: HibernationOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28e8f416c301f684b2caa0ff660d3316808d2aaa191bdf45a914e96dabfbc4a0")
      public
          fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit) {
      }

      public fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
      }

      public fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1bbd8df00cc9b5b637bda4de3be852174f5893db1acc2b1a7713ee0c97e67ffb")
      public
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty.Builder.() -> Unit) {
      }

      public fun imageId(imageId: String) {
      }

      public fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
      }

      public fun instanceMarketOptions(instanceMarketOptions: IResolvable) {
      }

      public fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43a96f45291c6fafa8312eb816699be708763915c3331c65bd8212a0c3f434c4")
      public
          fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty.Builder.() -> Unit) {
      }

      public fun instanceRequirements(instanceRequirements: IResolvable) {
      }

      public fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d761b0fa81c0457ee3edbe90ca24a6f1e9229459537600d3502abd9d657fd03")
      public
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit) {
      }

      public fun instanceType(instanceType: String) {
      }

      public fun kernelId(kernelId: String) {
      }

      public fun keyName(keyName: String) {
      }

      public fun licenseSpecifications(licenseSpecifications: IResolvable) {
      }

      public fun licenseSpecifications(licenseSpecifications: List<Any>) {
      }

      public fun maintenanceOptions(maintenanceOptions: IResolvable) {
      }

      public fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc0929a282bb2fbc3977ef24433a08c1d37f4f2836f2a7220650d33b4c6539dc")
      public
          fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty.Builder.() -> Unit) {
      }

      public fun metadataOptions(metadataOptions: IResolvable) {
      }

      public fun metadataOptions(metadataOptions: MetadataOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac7fc838a77a9a6a23cb745f94ea114a1de9fd91a5d1d8d5c34039bb5f711bb2")
      public fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit) {
      }

      public fun monitoring(monitoring: IResolvable) {
      }

      public fun monitoring(monitoring: MonitoringProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b77ed06d1cbb2ea112e6d6c0f98c421f7023ac656e2cb4be028d127207d434c")
      public fun monitoring(monitoring: MonitoringProperty.Builder.() -> Unit) {
      }

      public fun networkInterfaces(networkInterfaces: IResolvable) {
      }

      public fun networkInterfaces(networkInterfaces: List<Any>) {
      }

      public fun placement(placement: IResolvable) {
      }

      public fun placement(placement: PlacementProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006e5a78cf2eeb9a54e00593775b245bdc307414cd0aa8805e7078b297666637")
      public fun placement(placement: PlacementProperty.Builder.() -> Unit) {
      }

      public fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
      }

      public fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8642d14e3161f7a43afabda8cbae0433ded3780822d98553845b48be10a2ef4")
      public
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit) {
      }

      public fun ramDiskId(ramDiskId: String) {
      }

      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun securityGroups(securityGroups: List<String>) {
      }

      public fun tagSpecifications(tagSpecifications: IResolvable) {
      }

      public fun tagSpecifications(tagSpecifications: List<Any>) {
      }

      public fun userData(userData: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty.builder()

      public override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
      }

      public override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
      }

      public override
          fun capacityReservationSpecification(capacityReservationSpecification: IResolvable) {
        cdkBuilder.capacityReservationSpecification(capacityReservationSpecification.let(IResolvable::unwrap))
      }

      public override
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty) {
        cdkBuilder.capacityReservationSpecification(capacityReservationSpecification.let(CapacityReservationSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7538c816f6b8ad00a2d467e58e27594cdd64e0cd65cc1a1e0c894ee8e5b165a0")
      public override
          fun capacityReservationSpecification(capacityReservationSpecification: CapacityReservationSpecificationProperty.Builder.() -> Unit):
          Unit =
          capacityReservationSpecification(CapacityReservationSpecificationProperty(capacityReservationSpecification))

      public override fun cpuOptions(cpuOptions: IResolvable) {
        cdkBuilder.cpuOptions(cpuOptions.let(IResolvable::unwrap))
      }

      public override fun cpuOptions(cpuOptions: CpuOptionsProperty) {
        cdkBuilder.cpuOptions(cpuOptions.let(CpuOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259e3b5c06cb5bf8c8108e0c786375e6a9cea676a84ba635b0c1c801565c8c24")
      public override fun cpuOptions(cpuOptions: CpuOptionsProperty.Builder.() -> Unit): Unit =
          cpuOptions(CpuOptionsProperty(cpuOptions))

      public override fun creditSpecification(creditSpecification: IResolvable) {
        cdkBuilder.creditSpecification(creditSpecification.let(IResolvable::unwrap))
      }

      public override fun creditSpecification(creditSpecification: CreditSpecificationProperty) {
        cdkBuilder.creditSpecification(creditSpecification.let(CreditSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c519e21ccdfb01d70cdf605a898774b356db73d7a867105c93e7548d3dbbd7f5")
      public override
          fun creditSpecification(creditSpecification: CreditSpecificationProperty.Builder.() -> Unit):
          Unit = creditSpecification(CreditSpecificationProperty(creditSpecification))

      public override fun disableApiStop(disableApiStop: Boolean) {
        cdkBuilder.disableApiStop(disableApiStop)
      }

      public override fun disableApiStop(disableApiStop: IResolvable) {
        cdkBuilder.disableApiStop(disableApiStop.let(IResolvable::unwrap))
      }

      public override fun disableApiTermination(disableApiTermination: Boolean) {
        cdkBuilder.disableApiTermination(disableApiTermination)
      }

      public override fun disableApiTermination(disableApiTermination: IResolvable) {
        cdkBuilder.disableApiTermination(disableApiTermination.let(IResolvable::unwrap))
      }

      public override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      public override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      public override fun elasticGpuSpecifications(elasticGpuSpecifications: IResolvable) {
        cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications.let(IResolvable::unwrap))
      }

      public override fun elasticGpuSpecifications(elasticGpuSpecifications: List<Any>) {
        cdkBuilder.elasticGpuSpecifications(elasticGpuSpecifications)
      }

      public override fun elasticInferenceAccelerators(elasticInferenceAccelerators: IResolvable) {
        cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators.let(IResolvable::unwrap))
      }

      public override fun elasticInferenceAccelerators(elasticInferenceAccelerators: List<Any>) {
        cdkBuilder.elasticInferenceAccelerators(elasticInferenceAccelerators)
      }

      public override fun enclaveOptions(enclaveOptions: IResolvable) {
        cdkBuilder.enclaveOptions(enclaveOptions.let(IResolvable::unwrap))
      }

      public override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty) {
        cdkBuilder.enclaveOptions(enclaveOptions.let(EnclaveOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1a4d0253198ddd3f5824e73df1255a4da4abfb9fb30dfb987a7cc2b9a138")
      public override fun enclaveOptions(enclaveOptions: EnclaveOptionsProperty.Builder.() -> Unit):
          Unit = enclaveOptions(EnclaveOptionsProperty(enclaveOptions))

      public override fun hibernationOptions(hibernationOptions: IResolvable) {
        cdkBuilder.hibernationOptions(hibernationOptions.let(IResolvable::unwrap))
      }

      public override fun hibernationOptions(hibernationOptions: HibernationOptionsProperty) {
        cdkBuilder.hibernationOptions(hibernationOptions.let(HibernationOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28e8f416c301f684b2caa0ff660d3316808d2aaa191bdf45a914e96dabfbc4a0")
      public override
          fun hibernationOptions(hibernationOptions: HibernationOptionsProperty.Builder.() -> Unit):
          Unit = hibernationOptions(HibernationOptionsProperty(hibernationOptions))

      public override fun iamInstanceProfile(iamInstanceProfile: IResolvable) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IResolvable::unwrap))
      }

      public override fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty) {
        cdkBuilder.iamInstanceProfile(iamInstanceProfile.let(IamInstanceProfileProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1bbd8df00cc9b5b637bda4de3be852174f5893db1acc2b1a7713ee0c97e67ffb")
      public override
          fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileProperty.Builder.() -> Unit):
          Unit = iamInstanceProfile(IamInstanceProfileProperty(iamInstanceProfile))

      public override fun imageId(imageId: String) {
        cdkBuilder.imageId(imageId)
      }

      public override
          fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: String) {
        cdkBuilder.instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior)
      }

      public override fun instanceMarketOptions(instanceMarketOptions: IResolvable) {
        cdkBuilder.instanceMarketOptions(instanceMarketOptions.let(IResolvable::unwrap))
      }

      public override
          fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty) {
        cdkBuilder.instanceMarketOptions(instanceMarketOptions.let(InstanceMarketOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43a96f45291c6fafa8312eb816699be708763915c3331c65bd8212a0c3f434c4")
      public override
          fun instanceMarketOptions(instanceMarketOptions: InstanceMarketOptionsProperty.Builder.() -> Unit):
          Unit = instanceMarketOptions(InstanceMarketOptionsProperty(instanceMarketOptions))

      public override fun instanceRequirements(instanceRequirements: IResolvable) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(IResolvable::unwrap))
      }

      public override fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty) {
        cdkBuilder.instanceRequirements(instanceRequirements.let(InstanceRequirementsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d761b0fa81c0457ee3edbe90ca24a6f1e9229459537600d3502abd9d657fd03")
      public override
          fun instanceRequirements(instanceRequirements: InstanceRequirementsProperty.Builder.() -> Unit):
          Unit = instanceRequirements(InstanceRequirementsProperty(instanceRequirements))

      public override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public override fun kernelId(kernelId: String) {
        cdkBuilder.kernelId(kernelId)
      }

      public override fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
      }

      public override fun licenseSpecifications(licenseSpecifications: IResolvable) {
        cdkBuilder.licenseSpecifications(licenseSpecifications.let(IResolvable::unwrap))
      }

      public override fun licenseSpecifications(licenseSpecifications: List<Any>) {
        cdkBuilder.licenseSpecifications(licenseSpecifications)
      }

      public override fun maintenanceOptions(maintenanceOptions: IResolvable) {
        cdkBuilder.maintenanceOptions(maintenanceOptions.let(IResolvable::unwrap))
      }

      public override fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty) {
        cdkBuilder.maintenanceOptions(maintenanceOptions.let(MaintenanceOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc0929a282bb2fbc3977ef24433a08c1d37f4f2836f2a7220650d33b4c6539dc")
      public override
          fun maintenanceOptions(maintenanceOptions: MaintenanceOptionsProperty.Builder.() -> Unit):
          Unit = maintenanceOptions(MaintenanceOptionsProperty(maintenanceOptions))

      public override fun metadataOptions(metadataOptions: IResolvable) {
        cdkBuilder.metadataOptions(metadataOptions.let(IResolvable::unwrap))
      }

      public override fun metadataOptions(metadataOptions: MetadataOptionsProperty) {
        cdkBuilder.metadataOptions(metadataOptions.let(MetadataOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac7fc838a77a9a6a23cb745f94ea114a1de9fd91a5d1d8d5c34039bb5f711bb2")
      public override
          fun metadataOptions(metadataOptions: MetadataOptionsProperty.Builder.() -> Unit): Unit =
          metadataOptions(MetadataOptionsProperty(metadataOptions))

      public override fun monitoring(monitoring: IResolvable) {
        cdkBuilder.monitoring(monitoring.let(IResolvable::unwrap))
      }

      public override fun monitoring(monitoring: MonitoringProperty) {
        cdkBuilder.monitoring(monitoring.let(MonitoringProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b77ed06d1cbb2ea112e6d6c0f98c421f7023ac656e2cb4be028d127207d434c")
      public override fun monitoring(monitoring: MonitoringProperty.Builder.() -> Unit): Unit =
          monitoring(MonitoringProperty(monitoring))

      public override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
      }

      public override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces)
      }

      public override fun placement(placement: IResolvable) {
        cdkBuilder.placement(placement.let(IResolvable::unwrap))
      }

      public override fun placement(placement: PlacementProperty) {
        cdkBuilder.placement(placement.let(PlacementProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006e5a78cf2eeb9a54e00593775b245bdc307414cd0aa8805e7078b297666637")
      public override fun placement(placement: PlacementProperty.Builder.() -> Unit): Unit =
          placement(PlacementProperty(placement))

      public override fun privateDnsNameOptions(privateDnsNameOptions: IResolvable) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(IResolvable::unwrap))
      }

      public override
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty) {
        cdkBuilder.privateDnsNameOptions(privateDnsNameOptions.let(PrivateDnsNameOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f8642d14e3161f7a43afabda8cbae0433ded3780822d98553845b48be10a2ef4")
      public override
          fun privateDnsNameOptions(privateDnsNameOptions: PrivateDnsNameOptionsProperty.Builder.() -> Unit):
          Unit = privateDnsNameOptions(PrivateDnsNameOptionsProperty(privateDnsNameOptions))

      public override fun ramDiskId(ramDiskId: String) {
        cdkBuilder.ramDiskId(ramDiskId)
      }

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
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

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty,
    ) : LaunchTemplateDataProperty {
      public override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

      public override fun capacityReservationSpecification(): Any? =
          unwrap(this).getCapacityReservationSpecification()

      public override fun cpuOptions(): Any? = unwrap(this).getCpuOptions()

      public override fun creditSpecification(): Any? = unwrap(this).getCreditSpecification()

      public override fun disableApiStop(): Any? = unwrap(this).getDisableApiStop()

      public override fun disableApiTermination(): Any? = unwrap(this).getDisableApiTermination()

      public override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

      public override fun elasticGpuSpecifications(): Any? =
          unwrap(this).getElasticGpuSpecifications()

      public override fun elasticInferenceAccelerators(): Any? =
          unwrap(this).getElasticInferenceAccelerators()

      public override fun enclaveOptions(): Any? = unwrap(this).getEnclaveOptions()

      public override fun hibernationOptions(): Any? = unwrap(this).getHibernationOptions()

      public override fun iamInstanceProfile(): Any? = unwrap(this).getIamInstanceProfile()

      public override fun imageId(): String? = unwrap(this).getImageId()

      public override fun instanceInitiatedShutdownBehavior(): String? =
          unwrap(this).getInstanceInitiatedShutdownBehavior()

      public override fun instanceMarketOptions(): Any? = unwrap(this).getInstanceMarketOptions()

      public override fun instanceRequirements(): Any? = unwrap(this).getInstanceRequirements()

      public override fun instanceType(): String? = unwrap(this).getInstanceType()

      public override fun kernelId(): String? = unwrap(this).getKernelId()

      public override fun keyName(): String? = unwrap(this).getKeyName()

      public override fun licenseSpecifications(): Any? = unwrap(this).getLicenseSpecifications()

      public override fun maintenanceOptions(): Any? = unwrap(this).getMaintenanceOptions()

      public override fun metadataOptions(): Any? = unwrap(this).getMetadataOptions()

      public override fun monitoring(): Any? = unwrap(this).getMonitoring()

      public override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      public override fun placement(): Any? = unwrap(this).getPlacement()

      public override fun privateDnsNameOptions(): Any? = unwrap(this).getPrivateDnsNameOptions()

      public override fun ramDiskId(): String? = unwrap(this).getRamDiskId()

      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?:
          emptyList()

      public override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

      public override fun userData(): String? = unwrap(this).getUserData()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty):
          LaunchTemplateDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateDataProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateDataProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CapacityReservationTargetProperty {
    public fun capacityReservationId(): String? = unwrap(this).getCapacityReservationId()

    public fun capacityReservationResourceGroupArn(): String? =
        unwrap(this).getCapacityReservationResourceGroupArn()

    public interface Builder {
      public fun capacityReservationId(capacityReservationId: String) {
      }

      public fun capacityReservationResourceGroupArn(capacityReservationResourceGroupArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty.builder()

      public override fun capacityReservationId(capacityReservationId: String) {
        cdkBuilder.capacityReservationId(capacityReservationId)
      }

      public override
          fun capacityReservationResourceGroupArn(capacityReservationResourceGroupArn: String) {
        cdkBuilder.capacityReservationResourceGroupArn(capacityReservationResourceGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty,
    ) : CapacityReservationTargetProperty {
      public override fun capacityReservationId(): String? = unwrap(this).getCapacityReservationId()

      public override fun capacityReservationResourceGroupArn(): String? =
          unwrap(this).getCapacityReservationResourceGroupArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityReservationTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty):
          CapacityReservationTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityReservationTargetProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Ipv4PrefixSpecificationProperty {
    public fun ipv4Prefix(): String? = unwrap(this).getIpv4Prefix()

    public interface Builder {
      public fun ipv4Prefix(ipv4Prefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty.builder()

      public override fun ipv4Prefix(ipv4Prefix: String) {
        cdkBuilder.ipv4Prefix(ipv4Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty,
    ) : Ipv4PrefixSpecificationProperty {
      public override fun ipv4Prefix(): String? = unwrap(this).getIpv4Prefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv4PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty):
          Ipv4PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv4PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv4PrefixSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AcceleratorTotalMemoryMiBProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty,
    ) : AcceleratorTotalMemoryMiBProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AcceleratorTotalMemoryMiBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty):
          AcceleratorTotalMemoryMiBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorTotalMemoryMiBProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorTotalMemoryMiBProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkInterfaceProperty {
    public fun associateCarrierIpAddress(): Any? = unwrap(this).getAssociateCarrierIpAddress()

    public fun associatePublicIpAddress(): Any? = unwrap(this).getAssociatePublicIpAddress()

    public fun connectionTrackingSpecification(): Any? =
        unwrap(this).getConnectionTrackingSpecification()

    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun description(): String? = unwrap(this).getDescription()

    public fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

    public fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

    public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    public fun interfaceType(): String? = unwrap(this).getInterfaceType()

    public fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

    public fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

    public fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

    public fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

    public fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

    public fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

    public fun networkCardIndex(): Number? = unwrap(this).getNetworkCardIndex()

    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun primaryIpv6(): Any? = unwrap(this).getPrimaryIpv6()

    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    public fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

    public fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    public interface Builder {
      public fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
      }

      public fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
      }

      public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      }

      public fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
      }

      public fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable) {
      }

      public
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6f4a87772b9bd415feeb96a63199cd3ff7731701e8a84031a75b567fdae520a")
      public
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit) {
      }

      public fun deleteOnTermination(deleteOnTermination: Boolean) {
      }

      public fun deleteOnTermination(deleteOnTermination: IResolvable) {
      }

      public fun description(description: String) {
      }

      public fun deviceIndex(deviceIndex: Number) {
      }

      public fun enaSrdSpecification(enaSrdSpecification: IResolvable) {
      }

      public fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde402339dbd4f7d544b0811410463367a3fbedfd09e5cfd914ab9ec1d85c378")
      public
          fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit) {
      }

      public fun groups(groups: List<String>) {
      }

      public fun interfaceType(interfaceType: String) {
      }

      public fun ipv4PrefixCount(ipv4PrefixCount: Number) {
      }

      public fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
      }

      public fun ipv4Prefixes(ipv4Prefixes: List<Any>) {
      }

      public fun ipv6AddressCount(ipv6AddressCount: Number) {
      }

      public fun ipv6Addresses(ipv6Addresses: IResolvable) {
      }

      public fun ipv6Addresses(ipv6Addresses: List<Any>) {
      }

      public fun ipv6PrefixCount(ipv6PrefixCount: Number) {
      }

      public fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
      }

      public fun ipv6Prefixes(ipv6Prefixes: List<Any>) {
      }

      public fun networkCardIndex(networkCardIndex: Number) {
      }

      public fun networkInterfaceId(networkInterfaceId: String) {
      }

      public fun primaryIpv6(primaryIpv6: Boolean) {
      }

      public fun primaryIpv6(primaryIpv6: IResolvable) {
      }

      public fun privateIpAddress(privateIpAddress: String) {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty.builder()

      public override fun associateCarrierIpAddress(associateCarrierIpAddress: Boolean) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress)
      }

      public override fun associateCarrierIpAddress(associateCarrierIpAddress: IResolvable) {
        cdkBuilder.associateCarrierIpAddress(associateCarrierIpAddress.let(IResolvable::unwrap))
      }

      public override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
      }

      public override fun associatePublicIpAddress(associatePublicIpAddress: IResolvable) {
        cdkBuilder.associatePublicIpAddress(associatePublicIpAddress.let(IResolvable::unwrap))
      }

      public override
          fun connectionTrackingSpecification(connectionTrackingSpecification: IResolvable) {
        cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(IResolvable::unwrap))
      }

      public override
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty) {
        cdkBuilder.connectionTrackingSpecification(connectionTrackingSpecification.let(ConnectionTrackingSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6f4a87772b9bd415feeb96a63199cd3ff7731701e8a84031a75b567fdae520a")
      public override
          fun connectionTrackingSpecification(connectionTrackingSpecification: ConnectionTrackingSpecificationProperty.Builder.() -> Unit):
          Unit =
          connectionTrackingSpecification(ConnectionTrackingSpecificationProperty(connectionTrackingSpecification))

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

      public override fun enaSrdSpecification(enaSrdSpecification: IResolvable) {
        cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(IResolvable::unwrap))
      }

      public override fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty) {
        cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(EnaSrdSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde402339dbd4f7d544b0811410463367a3fbedfd09e5cfd914ab9ec1d85c378")
      public override
          fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit):
          Unit = enaSrdSpecification(EnaSrdSpecificationProperty(enaSrdSpecification))

      public override fun groups(groups: List<String>) {
        cdkBuilder.groups(groups)
      }

      public override fun interfaceType(interfaceType: String) {
        cdkBuilder.interfaceType(interfaceType)
      }

      public override fun ipv4PrefixCount(ipv4PrefixCount: Number) {
        cdkBuilder.ipv4PrefixCount(ipv4PrefixCount)
      }

      public override fun ipv4Prefixes(ipv4Prefixes: IResolvable) {
        cdkBuilder.ipv4Prefixes(ipv4Prefixes.let(IResolvable::unwrap))
      }

      public override fun ipv4Prefixes(ipv4Prefixes: List<Any>) {
        cdkBuilder.ipv4Prefixes(ipv4Prefixes)
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

      public override fun ipv6PrefixCount(ipv6PrefixCount: Number) {
        cdkBuilder.ipv6PrefixCount(ipv6PrefixCount)
      }

      public override fun ipv6Prefixes(ipv6Prefixes: IResolvable) {
        cdkBuilder.ipv6Prefixes(ipv6Prefixes.let(IResolvable::unwrap))
      }

      public override fun ipv6Prefixes(ipv6Prefixes: List<Any>) {
        cdkBuilder.ipv6Prefixes(ipv6Prefixes)
      }

      public override fun networkCardIndex(networkCardIndex: Number) {
        cdkBuilder.networkCardIndex(networkCardIndex)
      }

      public override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      public override fun primaryIpv6(primaryIpv6: Boolean) {
        cdkBuilder.primaryIpv6(primaryIpv6)
      }

      public override fun primaryIpv6(primaryIpv6: IResolvable) {
        cdkBuilder.primaryIpv6(primaryIpv6.let(IResolvable::unwrap))
      }

      public override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty,
    ) : NetworkInterfaceProperty {
      public override fun associateCarrierIpAddress(): Any? =
          unwrap(this).getAssociateCarrierIpAddress()

      public override fun associatePublicIpAddress(): Any? =
          unwrap(this).getAssociatePublicIpAddress()

      public override fun connectionTrackingSpecification(): Any? =
          unwrap(this).getConnectionTrackingSpecification()

      public override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun deviceIndex(): Number? = unwrap(this).getDeviceIndex()

      public override fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

      public override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

      public override fun interfaceType(): String? = unwrap(this).getInterfaceType()

      public override fun ipv4PrefixCount(): Number? = unwrap(this).getIpv4PrefixCount()

      public override fun ipv4Prefixes(): Any? = unwrap(this).getIpv4Prefixes()

      public override fun ipv6AddressCount(): Number? = unwrap(this).getIpv6AddressCount()

      public override fun ipv6Addresses(): Any? = unwrap(this).getIpv6Addresses()

      public override fun ipv6PrefixCount(): Number? = unwrap(this).getIpv6PrefixCount()

      public override fun ipv6Prefixes(): Any? = unwrap(this).getIpv6Prefixes()

      public override fun networkCardIndex(): Number? = unwrap(this).getNetworkCardIndex()

      public override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      public override fun primaryIpv6(): Any? = unwrap(this).getPrimaryIpv6()

      public override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      public override fun privateIpAddresses(): Any? = unwrap(this).getPrivateIpAddresses()

      public override fun secondaryPrivateIpAddressCount(): Number? =
          unwrap(this).getSecondaryPrivateIpAddressCount()

      public override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty):
          NetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TotalLocalStorageGBProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty,
    ) : TotalLocalStorageGBProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TotalLocalStorageGBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty):
          TotalLocalStorageGBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TotalLocalStorageGBProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ElasticGpuSpecificationProperty {
    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty.builder()

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty,
    ) : ElasticGpuSpecificationProperty {
      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticGpuSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty):
          ElasticGpuSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticGpuSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ElasticGpuSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateElasticInferenceAcceleratorProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun count(count: Number) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.builder()

      public override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty,
    ) : LaunchTemplateElasticInferenceAcceleratorProperty {
      public override fun count(): Number? = unwrap(this).getCount()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateElasticInferenceAcceleratorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty):
          LaunchTemplateElasticInferenceAcceleratorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateElasticInferenceAcceleratorProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbsProperty {
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun throughput(): Number? = unwrap(this).getThroughput()

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

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun snapshotId(snapshotId: String) {
      }

      public fun throughput(throughput: Number) {
      }

      public fun volumeSize(volumeSize: Number) {
      }

      public fun volumeType(volumeType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty.builder()

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

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      public override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      public override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty,
    ) : EbsProperty {
      public override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      public override fun encrypted(): Any? = unwrap(this).getEncrypted()

      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      public override fun throughput(): Number? = unwrap(this).getThroughput()

      public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      public override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EbsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty):
          EbsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EbsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InstanceMarketOptionsProperty {
    public fun marketType(): String? = unwrap(this).getMarketType()

    public fun spotOptions(): Any? = unwrap(this).getSpotOptions()

    public interface Builder {
      public fun marketType(marketType: String) {
      }

      public fun spotOptions(spotOptions: IResolvable) {
      }

      public fun spotOptions(spotOptions: SpotOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f744c35a1804b7b20099c6d3a34b26802557f5b5ffb6c6f41595d1880bb85894")
      public fun spotOptions(spotOptions: SpotOptionsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty.builder()

      public override fun marketType(marketType: String) {
        cdkBuilder.marketType(marketType)
      }

      public override fun spotOptions(spotOptions: IResolvable) {
        cdkBuilder.spotOptions(spotOptions.let(IResolvable::unwrap))
      }

      public override fun spotOptions(spotOptions: SpotOptionsProperty) {
        cdkBuilder.spotOptions(spotOptions.let(SpotOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f744c35a1804b7b20099c6d3a34b26802557f5b5ffb6c6f41595d1880bb85894")
      public override fun spotOptions(spotOptions: SpotOptionsProperty.Builder.() -> Unit): Unit =
          spotOptions(SpotOptionsProperty(spotOptions))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty,
    ) : InstanceMarketOptionsProperty {
      public override fun marketType(): String? = unwrap(this).getMarketType()

      public override fun spotOptions(): Any? = unwrap(this).getSpotOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceMarketOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty):
          InstanceMarketOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceMarketOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectionTrackingSpecificationProperty {
    public fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

    public fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

    public fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()

    public interface Builder {
      public fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number) {
      }

      public fun udpStreamTimeout(udpStreamTimeout: Number) {
      }

      public fun udpTimeout(udpTimeout: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty.builder()

      public override fun tcpEstablishedTimeout(tcpEstablishedTimeout: Number) {
        cdkBuilder.tcpEstablishedTimeout(tcpEstablishedTimeout)
      }

      public override fun udpStreamTimeout(udpStreamTimeout: Number) {
        cdkBuilder.udpStreamTimeout(udpStreamTimeout)
      }

      public override fun udpTimeout(udpTimeout: Number) {
        cdkBuilder.udpTimeout(udpTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty,
    ) : ConnectionTrackingSpecificationProperty {
      public override fun tcpEstablishedTimeout(): Number? = unwrap(this).getTcpEstablishedTimeout()

      public override fun udpStreamTimeout(): Number? = unwrap(this).getUdpStreamTimeout()

      public override fun udpTimeout(): Number? = unwrap(this).getUdpTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionTrackingSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty):
          ConnectionTrackingSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionTrackingSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.ConnectionTrackingSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface HibernationOptionsProperty {
    public fun configured(): Any? = unwrap(this).getConfigured()

    public interface Builder {
      public fun configured(configured: Boolean) {
      }

      public fun configured(configured: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty.builder()

      public override fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
      }

      public override fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty,
    ) : HibernationOptionsProperty {
      public override fun configured(): Any? = unwrap(this).getConfigured()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HibernationOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty):
          HibernationOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HibernationOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.HibernationOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IamInstanceProfileProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty,
    ) : IamInstanceProfileProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IamInstanceProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty):
          IamInstanceProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamInstanceProfileProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.IamInstanceProfileProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface Ipv6PrefixSpecificationProperty {
    public fun ipv6Prefix(): String? = unwrap(this).getIpv6Prefix()

    public interface Builder {
      public fun ipv6Prefix(ipv6Prefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty.builder()

      public override fun ipv6Prefix(ipv6Prefix: String) {
        cdkBuilder.ipv6Prefix(ipv6Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty,
    ) : Ipv6PrefixSpecificationProperty {
      public override fun ipv6Prefix(): String? = unwrap(this).getIpv6Prefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv6PrefixSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty):
          Ipv6PrefixSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv6PrefixSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6PrefixSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrivateDnsNameOptionsProperty {
    public fun enableResourceNameDnsARecord(): Any? = unwrap(this).getEnableResourceNameDnsARecord()

    public fun enableResourceNameDnsAaaaRecord(): Any? =
        unwrap(this).getEnableResourceNameDnsAaaaRecord()

    public fun hostnameType(): String? = unwrap(this).getHostnameType()

    public interface Builder {
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
      }

      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
      }

      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
      }

      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
      }

      public fun hostnameType(hostnameType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty.builder()

      public override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
      }

      public override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord.let(IResolvable::unwrap))
      }

      public override
          fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
      }

      public override
          fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord.let(IResolvable::unwrap))
      }

      public override fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty,
    ) : PrivateDnsNameOptionsProperty {
      public override fun enableResourceNameDnsARecord(): Any? =
          unwrap(this).getEnableResourceNameDnsARecord()

      public override fun enableResourceNameDnsAaaaRecord(): Any? =
          unwrap(this).getEnableResourceNameDnsAaaaRecord()

      public override fun hostnameType(): String? = unwrap(this).getHostnameType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateDnsNameOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty):
          PrivateDnsNameOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsNameOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateDnsNameOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetadataOptionsProperty {
    public fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

    public fun httpProtocolIpv6(): String? = unwrap(this).getHttpProtocolIpv6()

    public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    public fun httpTokens(): String? = unwrap(this).getHttpTokens()

    public fun instanceMetadataTags(): String? = unwrap(this).getInstanceMetadataTags()

    public interface Builder {
      public fun httpEndpoint(httpEndpoint: String) {
      }

      public fun httpProtocolIpv6(httpProtocolIpv6: String) {
      }

      public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
      }

      public fun httpTokens(httpTokens: String) {
      }

      public fun instanceMetadataTags(instanceMetadataTags: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty.builder()

      public override fun httpEndpoint(httpEndpoint: String) {
        cdkBuilder.httpEndpoint(httpEndpoint)
      }

      public override fun httpProtocolIpv6(httpProtocolIpv6: String) {
        cdkBuilder.httpProtocolIpv6(httpProtocolIpv6)
      }

      public override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
      }

      public override fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
      }

      public override fun instanceMetadataTags(instanceMetadataTags: String) {
        cdkBuilder.instanceMetadataTags(instanceMetadataTags)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty,
    ) : MetadataOptionsProperty {
      public override fun httpEndpoint(): String? = unwrap(this).getHttpEndpoint()

      public override fun httpProtocolIpv6(): String? = unwrap(this).getHttpProtocolIpv6()

      public override fun httpPutResponseHopLimit(): Number? =
          unwrap(this).getHttpPutResponseHopLimit()

      public override fun httpTokens(): String? = unwrap(this).getHttpTokens()

      public override fun instanceMetadataTags(): String? = unwrap(this).getInstanceMetadataTags()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty):
          MetadataOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MetadataOptionsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CreditSpecificationProperty {
    public fun cpuCredits(): String? = unwrap(this).getCpuCredits()

    public interface Builder {
      public fun cpuCredits(cpuCredits: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty.builder()

      public override fun cpuCredits(cpuCredits: String) {
        cdkBuilder.cpuCredits(cpuCredits)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty,
    ) : CreditSpecificationProperty {
      public override fun cpuCredits(): String? = unwrap(this).getCpuCredits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CreditSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty):
          CreditSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreditSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CreditSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemoryGiBPerVCpuProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty,
    ) : MemoryGiBPerVCpuProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryGiBPerVCpuProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty):
          MemoryGiBPerVCpuProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryGiBPerVCpuProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryGiBPerVCpuProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NetworkBandwidthGbpsProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty,
    ) : NetworkBandwidthGbpsProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkBandwidthGbpsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty):
          NetworkBandwidthGbpsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkBandwidthGbpsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkBandwidthGbpsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TagSpecificationProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty.builder()

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty,
    ) : TagSpecificationProperty {
      public override fun resourceType(): String? = unwrap(this).getResourceType()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TagSpecificationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InstanceRequirementsProperty {
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

      public fun acceleratorCount(acceleratorCount: AcceleratorCountProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6d22fd76cabe48f089b8c237bc1c7ec9426e15e6717e466b208f0fbcf8978aa")
      public fun acceleratorCount(acceleratorCount: AcceleratorCountProperty.Builder.() -> Unit) {
      }

      public fun acceleratorManufacturers(acceleratorManufacturers: List<String>) {
      }

      public fun acceleratorNames(acceleratorNames: List<String>) {
      }

      public fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: IResolvable) {
      }

      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687315408c1bb56ead021b0c0a5a9e16088665e100a889fb74ce71abbd43fa22")
      public
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty.Builder.() -> Unit) {
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
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99ce2f9d06f918c623b5226bc75b8d59bcc2dbe40fb6a6ce2e63c42d1f8391a1")
      public
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty.Builder.() -> Unit) {
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

      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39bcea6b054460d3a4f72bf8e85c617b9de2d27b154012b8b2ffbae654835453")
      public fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty.Builder.() -> Unit) {
      }

      public fun memoryMiB(memoryMiB: IResolvable) {
      }

      public fun memoryMiB(memoryMiB: MemoryMiBProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be30fd8478496bd807b2a12ef67cfe0b5fc5f22ee2e40f86594c093e02e6352")
      public fun memoryMiB(memoryMiB: MemoryMiBProperty.Builder.() -> Unit) {
      }

      public fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
      }

      public fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1827db3ce1bb2f184bd37966238ca76dc315b92780edbf8056c5fc90eda9c716")
      public
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty.Builder.() -> Unit) {
      }

      public fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
      }

      public fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fde96b2e0debdfcc33f8a0d0943f348612d4a2d2bfba0d2761c2738bdb344082")
      public
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty.Builder.() -> Unit) {
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

      public fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ced7d39abec56d68911dca344eb452396b66dd2240deef63392ea726ad8b8a4")
      public
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty.Builder.() -> Unit) {
      }

      public fun vCpuCount(vCpuCount: IResolvable) {
      }

      public fun vCpuCount(vCpuCount: VCpuCountProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510e27b3bf93ab1beb810d076c1533945e97fbf0fa819abd7c204fae624cfaa0")
      public fun vCpuCount(vCpuCount: VCpuCountProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty.builder()

      public override fun acceleratorCount(acceleratorCount: IResolvable) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(IResolvable::unwrap))
      }

      public override fun acceleratorCount(acceleratorCount: AcceleratorCountProperty) {
        cdkBuilder.acceleratorCount(acceleratorCount.let(AcceleratorCountProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6d22fd76cabe48f089b8c237bc1c7ec9426e15e6717e466b208f0fbcf8978aa")
      public override
          fun acceleratorCount(acceleratorCount: AcceleratorCountProperty.Builder.() -> Unit): Unit
          = acceleratorCount(AcceleratorCountProperty(acceleratorCount))

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
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty) {
        cdkBuilder.acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB.let(AcceleratorTotalMemoryMiBProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687315408c1bb56ead021b0c0a5a9e16088665e100a889fb74ce71abbd43fa22")
      public override
          fun acceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB: AcceleratorTotalMemoryMiBProperty.Builder.() -> Unit):
          Unit =
          acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBProperty(acceleratorTotalMemoryMiB))

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
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty) {
        cdkBuilder.baselineEbsBandwidthMbps(baselineEbsBandwidthMbps.let(BaselineEbsBandwidthMbpsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99ce2f9d06f918c623b5226bc75b8d59bcc2dbe40fb6a6ce2e63c42d1f8391a1")
      public override
          fun baselineEbsBandwidthMbps(baselineEbsBandwidthMbps: BaselineEbsBandwidthMbpsProperty.Builder.() -> Unit):
          Unit =
          baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsProperty(baselineEbsBandwidthMbps))

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

      public override fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty) {
        cdkBuilder.memoryGiBPerVCpu(memoryGiBPerVCpu.let(MemoryGiBPerVCpuProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39bcea6b054460d3a4f72bf8e85c617b9de2d27b154012b8b2ffbae654835453")
      public override
          fun memoryGiBPerVCpu(memoryGiBPerVCpu: MemoryGiBPerVCpuProperty.Builder.() -> Unit): Unit
          = memoryGiBPerVCpu(MemoryGiBPerVCpuProperty(memoryGiBPerVCpu))

      public override fun memoryMiB(memoryMiB: IResolvable) {
        cdkBuilder.memoryMiB(memoryMiB.let(IResolvable::unwrap))
      }

      public override fun memoryMiB(memoryMiB: MemoryMiBProperty) {
        cdkBuilder.memoryMiB(memoryMiB.let(MemoryMiBProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2be30fd8478496bd807b2a12ef67cfe0b5fc5f22ee2e40f86594c093e02e6352")
      public override fun memoryMiB(memoryMiB: MemoryMiBProperty.Builder.() -> Unit): Unit =
          memoryMiB(MemoryMiBProperty(memoryMiB))

      public override fun networkBandwidthGbps(networkBandwidthGbps: IResolvable) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(IResolvable::unwrap))
      }

      public override fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty) {
        cdkBuilder.networkBandwidthGbps(networkBandwidthGbps.let(NetworkBandwidthGbpsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1827db3ce1bb2f184bd37966238ca76dc315b92780edbf8056c5fc90eda9c716")
      public override
          fun networkBandwidthGbps(networkBandwidthGbps: NetworkBandwidthGbpsProperty.Builder.() -> Unit):
          Unit = networkBandwidthGbps(NetworkBandwidthGbpsProperty(networkBandwidthGbps))

      public override fun networkInterfaceCount(networkInterfaceCount: IResolvable) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(IResolvable::unwrap))
      }

      public override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty) {
        cdkBuilder.networkInterfaceCount(networkInterfaceCount.let(NetworkInterfaceCountProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fde96b2e0debdfcc33f8a0d0943f348612d4a2d2bfba0d2761c2738bdb344082")
      public override
          fun networkInterfaceCount(networkInterfaceCount: NetworkInterfaceCountProperty.Builder.() -> Unit):
          Unit = networkInterfaceCount(NetworkInterfaceCountProperty(networkInterfaceCount))

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

      public override fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty) {
        cdkBuilder.totalLocalStorageGb(totalLocalStorageGb.let(TotalLocalStorageGBProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ced7d39abec56d68911dca344eb452396b66dd2240deef63392ea726ad8b8a4")
      public override
          fun totalLocalStorageGb(totalLocalStorageGb: TotalLocalStorageGBProperty.Builder.() -> Unit):
          Unit = totalLocalStorageGb(TotalLocalStorageGBProperty(totalLocalStorageGb))

      public override fun vCpuCount(vCpuCount: IResolvable) {
        cdkBuilder.vCpuCount(vCpuCount.let(IResolvable::unwrap))
      }

      public override fun vCpuCount(vCpuCount: VCpuCountProperty) {
        cdkBuilder.vCpuCount(vCpuCount.let(VCpuCountProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("510e27b3bf93ab1beb810d076c1533945e97fbf0fa819abd7c204fae624cfaa0")
      public override fun vCpuCount(vCpuCount: VCpuCountProperty.Builder.() -> Unit): Unit =
          vCpuCount(VCpuCountProperty(vCpuCount))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty,
    ) : InstanceRequirementsProperty {
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

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty):
          InstanceRequirementsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceRequirementsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceRequirementsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EnaSrdUdpSpecificationProperty {
    public fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()

    public interface Builder {
      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean) {
      }

      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty.builder()

      public override fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled)
      }

      public override fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty,
    ) : EnaSrdUdpSpecificationProperty {
      public override fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdUdpSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty):
          EnaSrdUdpSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdUdpSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdUdpSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CapacityReservationSpecificationProperty {
    public fun capacityReservationPreference(): String? =
        unwrap(this).getCapacityReservationPreference()

    public fun capacityReservationTarget(): Any? = unwrap(this).getCapacityReservationTarget()

    public interface Builder {
      public fun capacityReservationPreference(capacityReservationPreference: String) {
      }

      public fun capacityReservationTarget(capacityReservationTarget: IResolvable) {
      }

      public
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13509a6123938dcb67ae290a6c4220f1dfb5f0a1121bea480151b94202eb2fdc")
      public
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty.builder()

      public override fun capacityReservationPreference(capacityReservationPreference: String) {
        cdkBuilder.capacityReservationPreference(capacityReservationPreference)
      }

      public override fun capacityReservationTarget(capacityReservationTarget: IResolvable) {
        cdkBuilder.capacityReservationTarget(capacityReservationTarget.let(IResolvable::unwrap))
      }

      public override
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty) {
        cdkBuilder.capacityReservationTarget(capacityReservationTarget.let(CapacityReservationTargetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13509a6123938dcb67ae290a6c4220f1dfb5f0a1121bea480151b94202eb2fdc")
      public override
          fun capacityReservationTarget(capacityReservationTarget: CapacityReservationTargetProperty.Builder.() -> Unit):
          Unit =
          capacityReservationTarget(CapacityReservationTargetProperty(capacityReservationTarget))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty,
    ) : CapacityReservationSpecificationProperty {
      public override fun capacityReservationPreference(): String? =
          unwrap(this).getCapacityReservationPreference()

      public override fun capacityReservationTarget(): Any? =
          unwrap(this).getCapacityReservationTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityReservationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty):
          CapacityReservationSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityReservationSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BaselineEbsBandwidthMbpsProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty,
    ) : BaselineEbsBandwidthMbpsProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BaselineEbsBandwidthMbpsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty):
          BaselineEbsBandwidthMbpsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BaselineEbsBandwidthMbpsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VCpuCountProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty,
    ) : VCpuCountProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VCpuCountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty):
          VCpuCountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VCpuCountProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MaintenanceOptionsProperty {
    public fun autoRecovery(): String? = unwrap(this).getAutoRecovery()

    public fun rebootMigration(): String? = unwrap(this).getRebootMigration()

    public interface Builder {
      public fun autoRecovery(autoRecovery: String) {
      }

      public fun rebootMigration(rebootMigration: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty.builder()

      public override fun autoRecovery(autoRecovery: String) {
        cdkBuilder.autoRecovery(autoRecovery)
      }

      public override fun rebootMigration(rebootMigration: String) {
        cdkBuilder.rebootMigration(rebootMigration)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty,
    ) : MaintenanceOptionsProperty {
      public override fun autoRecovery(): String? = unwrap(this).getAutoRecovery()

      public override fun rebootMigration(): String? = unwrap(this).getRebootMigration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty):
          MaintenanceOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MaintenanceOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EnaSrdSpecificationProperty {
    public fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

    public fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()

    public interface Builder {
      public fun enaSrdEnabled(enaSrdEnabled: Boolean) {
      }

      public fun enaSrdEnabled(enaSrdEnabled: IResolvable) {
      }

      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable) {
      }

      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd7cd088ca722e28b6bce1ce2139206df9bf6fb92063da1c5b497af55aa9ffb4")
      public
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty.builder()

      public override fun enaSrdEnabled(enaSrdEnabled: Boolean) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled)
      }

      public override fun enaSrdEnabled(enaSrdEnabled: IResolvable) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled.let(IResolvable::unwrap))
      }

      public override fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(IResolvable::unwrap))
      }

      public override
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(EnaSrdUdpSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd7cd088ca722e28b6bce1ce2139206df9bf6fb92063da1c5b497af55aa9ffb4")
      public override
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit):
          Unit = enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty(enaSrdUdpSpecification))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty,
    ) : EnaSrdSpecificationProperty {
      public override fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

      public override fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty):
          EnaSrdSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.EnaSrdSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MonitoringProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty.builder()

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty,
    ) : MonitoringProperty {
      public override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MonitoringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty):
          MonitoringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MonitoringProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MonitoringProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MemoryMiBProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty,
    ) : MemoryMiBProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemoryMiBProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty):
          MemoryMiBProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemoryMiBProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PrivateIpAddProperty {
    public fun primary(): Any? = unwrap(this).getPrimary()

    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty.builder()

      public override fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
      }

      public override fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary.let(IResolvable::unwrap))
      }

      public override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty,
    ) : PrivateIpAddProperty {
      public override fun primary(): Any? = unwrap(this).getPrimary()

      public override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrivateIpAddProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty):
          PrivateIpAddProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateIpAddProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CpuOptionsProperty {
    public fun amdSevSnp(): String? = unwrap(this).getAmdSevSnp()

    public fun coreCount(): Number? = unwrap(this).getCoreCount()

    public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

    public interface Builder {
      public fun amdSevSnp(amdSevSnp: String) {
      }

      public fun coreCount(coreCount: Number) {
      }

      public fun threadsPerCore(threadsPerCore: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty.builder()

      public override fun amdSevSnp(amdSevSnp: String) {
        cdkBuilder.amdSevSnp(amdSevSnp)
      }

      public override fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
      }

      public override fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty,
    ) : CpuOptionsProperty {
      public override fun amdSevSnp(): String? = unwrap(this).getAmdSevSnp()

      public override fun coreCount(): Number? = unwrap(this).getCoreCount()

      public override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CpuOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty):
          CpuOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CpuOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CpuOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LaunchTemplateTagSpecificationProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty.builder()

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty,
    ) : LaunchTemplateTagSpecificationProperty {
      public override fun resourceType(): String? = unwrap(this).getResourceType()

      public override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateTagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty):
          LaunchTemplateTagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateTagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateTagSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AcceleratorCountProperty {
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
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty.builder()

      public override fun max(max: Number) {
        cdkBuilder.max(max)
      }

      public override fun min(min: Number) {
        cdkBuilder.min(min)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty,
    ) : AcceleratorCountProperty {
      public override fun max(): Number? = unwrap(this).getMax()

      public override fun min(): Number? = unwrap(this).getMin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorCountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty):
          AcceleratorCountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AcceleratorCountProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface Ipv6AddProperty {
    public fun ipv6Address(): String? = unwrap(this).getIpv6Address()

    public interface Builder {
      public fun ipv6Address(ipv6Address: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty.builder()

      public override fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty,
    ) : Ipv6AddProperty {
      public override fun ipv6Address(): String? = unwrap(this).getIpv6Address()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): Ipv6AddProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty):
          Ipv6AddProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: Ipv6AddProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.Ipv6AddProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LicenseSpecificationProperty {
    public fun licenseConfigurationArn(): String? = unwrap(this).getLicenseConfigurationArn()

    public interface Builder {
      public fun licenseConfigurationArn(licenseConfigurationArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty.builder()

      public override fun licenseConfigurationArn(licenseConfigurationArn: String) {
        cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty,
    ) : LicenseSpecificationProperty {
      public override fun licenseConfigurationArn(): String? =
          unwrap(this).getLicenseConfigurationArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LicenseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty):
          LicenseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LicenseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LicenseSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PlacementProperty {
    public fun affinity(): String? = unwrap(this).getAffinity()

    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun groupId(): String? = unwrap(this).getGroupId()

    public fun groupName(): String? = unwrap(this).getGroupName()

    public fun hostId(): String? = unwrap(this).getHostId()

    public fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

    public fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

    public fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

    public fun tenancy(): String? = unwrap(this).getTenancy()

    public interface Builder {
      public fun affinity(affinity: String) {
      }

      public fun availabilityZone(availabilityZone: String) {
      }

      public fun groupId(groupId: String) {
      }

      public fun groupName(groupName: String) {
      }

      public fun hostId(hostId: String) {
      }

      public fun hostResourceGroupArn(hostResourceGroupArn: String) {
      }

      public fun partitionNumber(partitionNumber: Number) {
      }

      public fun spreadDomain(spreadDomain: String) {
      }

      public fun tenancy(tenancy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty.builder()

      public override fun affinity(affinity: String) {
        cdkBuilder.affinity(affinity)
      }

      public override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public override fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
      }

      public override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      public override fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
      }

      public override fun hostResourceGroupArn(hostResourceGroupArn: String) {
        cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
      }

      public override fun partitionNumber(partitionNumber: Number) {
        cdkBuilder.partitionNumber(partitionNumber)
      }

      public override fun spreadDomain(spreadDomain: String) {
        cdkBuilder.spreadDomain(spreadDomain)
      }

      public override fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty,
    ) : PlacementProperty {
      public override fun affinity(): String? = unwrap(this).getAffinity()

      public override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      public override fun groupId(): String? = unwrap(this).getGroupId()

      public override fun groupName(): String? = unwrap(this).getGroupName()

      public override fun hostId(): String? = unwrap(this).getHostId()

      public override fun hostResourceGroupArn(): String? = unwrap(this).getHostResourceGroupArn()

      public override fun partitionNumber(): Number? = unwrap(this).getPartitionNumber()

      public override fun spreadDomain(): String? = unwrap(this).getSpreadDomain()

      public override fun tenancy(): String? = unwrap(this).getTenancy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty):
          PlacementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PlacementProperty = (wrapped as
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

      public fun ebs(ebs: EbsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d6ae31b3c9294cb1f107c22c338c808581bedefec428957e26694bbbfd5a89")
      public fun ebs(ebs: EbsProperty.Builder.() -> Unit) {
      }

      public fun noDevice(noDevice: String) {
      }

      public fun virtualName(virtualName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty.builder()

      public override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      public override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      public override fun ebs(ebs: EbsProperty) {
        cdkBuilder.ebs(ebs.let(EbsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("13d6ae31b3c9294cb1f107c22c338c808581bedefec428957e26694bbbfd5a89")
      public override fun ebs(ebs: EbsProperty.Builder.() -> Unit): Unit = ebs(EbsProperty(ebs))

      public override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      public override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty):
          BlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlockDeviceMappingProperty):
          software.amazon.awscdk.services.ec2.CfnLaunchTemplate.BlockDeviceMappingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
