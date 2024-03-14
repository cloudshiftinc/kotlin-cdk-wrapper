package io.cloudshiftdev.awscdk.services.licensemanager

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLicense internal constructor(
  private val cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrLicenseArn(): String = unwrap(this).getAttrLicenseArn()

  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  public open fun beneficiary(): String? = unwrap(this).getBeneficiary()

  public open fun beneficiary(`value`: String) {
    unwrap(this).setBeneficiary(`value`)
  }

  public open fun consumptionConfiguration(): Any = unwrap(this).getConsumptionConfiguration()

  public open fun consumptionConfiguration(`value`: IResolvable) {
    unwrap(this).setConsumptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun consumptionConfiguration(`value`: ConsumptionConfigurationProperty) {
    unwrap(this).setConsumptionConfiguration(`value`.let(ConsumptionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("32250de8c68b2c67ee65f366aef37a9612205e77e80421280aa1e1159f63cde7")
  public open
      fun consumptionConfiguration(`value`: ConsumptionConfigurationProperty.Builder.() -> Unit):
      Unit = consumptionConfiguration(ConsumptionConfigurationProperty(`value`))

  public open fun entitlements(): Any = unwrap(this).getEntitlements()

  public open fun entitlements(`value`: IResolvable) {
    unwrap(this).setEntitlements(`value`.let(IResolvable::unwrap))
  }

  public open fun entitlements(__idx_ac66f0: List<Any>) {
    unwrap(this).setEntitlements(__idx_ac66f0)
  }

  public open fun homeRegion(): String = unwrap(this).getHomeRegion()

  public open fun homeRegion(`value`: String) {
    unwrap(this).setHomeRegion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun issuer(): Any = unwrap(this).getIssuer()

  public open fun issuer(`value`: IResolvable) {
    unwrap(this).setIssuer(`value`.let(IResolvable::unwrap))
  }

  public open fun issuer(`value`: IssuerDataProperty) {
    unwrap(this).setIssuer(`value`.let(IssuerDataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c1df88c5ed6a0046ddf8f789e5d62d22af4c3324c7175be74f758453b80bb3")
  public open fun issuer(`value`: IssuerDataProperty.Builder.() -> Unit): Unit =
      issuer(IssuerDataProperty(`value`))

  public open fun licenseMetadata(): Any? = unwrap(this).getLicenseMetadata()

  public open fun licenseMetadata(`value`: IResolvable) {
    unwrap(this).setLicenseMetadata(`value`.let(IResolvable::unwrap))
  }

  public open fun licenseMetadata(__idx_ac66f0: List<Any>) {
    unwrap(this).setLicenseMetadata(__idx_ac66f0)
  }

  public open fun licenseName(): String = unwrap(this).getLicenseName()

  public open fun licenseName(`value`: String) {
    unwrap(this).setLicenseName(`value`)
  }

  public open fun productName(): String = unwrap(this).getProductName()

  public open fun productName(`value`: String) {
    unwrap(this).setProductName(`value`)
  }

  public open fun productSku(): String? = unwrap(this).getProductSku()

  public open fun productSku(`value`: String) {
    unwrap(this).setProductSku(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public open fun validity(): Any = unwrap(this).getValidity()

  public open fun validity(`value`: IResolvable) {
    unwrap(this).setValidity(`value`.let(IResolvable::unwrap))
  }

  public open fun validity(`value`: ValidityDateFormatProperty) {
    unwrap(this).setValidity(`value`.let(ValidityDateFormatProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2fb2d18d4b77e2f0c689348c35b1e2545b29bae9f9ffccf83cf1104dc27f7232")
  public open fun validity(`value`: ValidityDateFormatProperty.Builder.() -> Unit): Unit =
      validity(ValidityDateFormatProperty(`value`))

  public interface Builder {
    public fun beneficiary(beneficiary: String)

    public fun consumptionConfiguration(consumptionConfiguration: IResolvable)

    public fun consumptionConfiguration(consumptionConfiguration: ConsumptionConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c381d3007db790ac6ebe995147719eaff4f7a7474f744d357cf799ca507facf5")
    public
        fun consumptionConfiguration(consumptionConfiguration: ConsumptionConfigurationProperty.Builder.() -> Unit)

    public fun entitlements(entitlements: IResolvable)

    public fun entitlements(entitlements: List<Any>)

    public fun homeRegion(homeRegion: String)

    public fun issuer(issuer: IResolvable)

    public fun issuer(issuer: IssuerDataProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b2d010e90f715de699d60a129aeec6f7ac92a4faf1d4e51fa354509b02b5f94")
    public fun issuer(issuer: IssuerDataProperty.Builder.() -> Unit)

    public fun licenseMetadata(licenseMetadata: IResolvable)

    public fun licenseMetadata(licenseMetadata: List<Any>)

    public fun licenseName(licenseName: String)

    public fun productName(productName: String)

    public fun productSku(productSku: String)

    public fun status(status: String)

    public fun validity(validity: IResolvable)

    public fun validity(validity: ValidityDateFormatProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b49fdc58228a7e055f6a063c67168019576b3a8b23cbc543b8083466e26e70aa")
    public fun validity(validity: ValidityDateFormatProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnLicense.Builder =
        software.amazon.awscdk.services.licensemanager.CfnLicense.Builder.create(scope, id)

    override fun beneficiary(beneficiary: String) {
      cdkBuilder.beneficiary(beneficiary)
    }

    override fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
      cdkBuilder.consumptionConfiguration(consumptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun consumptionConfiguration(consumptionConfiguration: ConsumptionConfigurationProperty) {
      cdkBuilder.consumptionConfiguration(consumptionConfiguration.let(ConsumptionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c381d3007db790ac6ebe995147719eaff4f7a7474f744d357cf799ca507facf5")
    override
        fun consumptionConfiguration(consumptionConfiguration: ConsumptionConfigurationProperty.Builder.() -> Unit):
        Unit = consumptionConfiguration(ConsumptionConfigurationProperty(consumptionConfiguration))

    override fun entitlements(entitlements: IResolvable) {
      cdkBuilder.entitlements(entitlements.let(IResolvable::unwrap))
    }

    override fun entitlements(entitlements: List<Any>) {
      cdkBuilder.entitlements(entitlements)
    }

    override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    override fun issuer(issuer: IResolvable) {
      cdkBuilder.issuer(issuer.let(IResolvable::unwrap))
    }

    override fun issuer(issuer: IssuerDataProperty) {
      cdkBuilder.issuer(issuer.let(IssuerDataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b2d010e90f715de699d60a129aeec6f7ac92a4faf1d4e51fa354509b02b5f94")
    override fun issuer(issuer: IssuerDataProperty.Builder.() -> Unit): Unit =
        issuer(IssuerDataProperty(issuer))

    override fun licenseMetadata(licenseMetadata: IResolvable) {
      cdkBuilder.licenseMetadata(licenseMetadata.let(IResolvable::unwrap))
    }

    override fun licenseMetadata(licenseMetadata: List<Any>) {
      cdkBuilder.licenseMetadata(licenseMetadata)
    }

    override fun licenseName(licenseName: String) {
      cdkBuilder.licenseName(licenseName)
    }

    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    override fun productSku(productSku: String) {
      cdkBuilder.productSku(productSku)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun validity(validity: IResolvable) {
      cdkBuilder.validity(validity.let(IResolvable::unwrap))
    }

    override fun validity(validity: ValidityDateFormatProperty) {
      cdkBuilder.validity(validity.let(ValidityDateFormatProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b49fdc58228a7e055f6a063c67168019576b3a8b23cbc543b8083466e26e70aa")
    override fun validity(validity: ValidityDateFormatProperty.Builder.() -> Unit): Unit =
        validity(ValidityDateFormatProperty(validity))

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnLicense =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLicense {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLicense(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense):
        CfnLicense = CfnLicense(cdkObject)

    internal fun unwrap(wrapped: CfnLicense):
        software.amazon.awscdk.services.licensemanager.CfnLicense = wrapped.cdkObject
  }

  public interface ProvisionalConfigurationProperty {
    public fun maxTimeToLiveInMinutes(): Number

    public interface Builder {
      public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty.builder()

      override fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
        cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty,
    ) : ProvisionalConfigurationProperty {
      override fun maxTimeToLiveInMinutes(): Number = unwrap(this).getMaxTimeToLiveInMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionalConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty):
          ProvisionalConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionalConfigurationProperty):
          software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetadataProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty.Builder =
          software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty,
    ) : MetadataProperty {
      override fun name(): String = unwrap(this).getName()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty):
          MetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataProperty):
          software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EntitlementProperty {
    public fun allowCheckIn(): Any? = unwrap(this).getAllowCheckIn()

    public fun maxCount(): Number? = unwrap(this).getMaxCount()

    public fun name(): String

    public fun overage(): Any? = unwrap(this).getOverage()

    public fun unit(): String

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun allowCheckIn(allowCheckIn: Boolean)

      public fun allowCheckIn(allowCheckIn: IResolvable)

      public fun maxCount(maxCount: Number)

      public fun name(name: String)

      public fun overage(overage: Boolean)

      public fun overage(overage: IResolvable)

      public fun unit(unit: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty.Builder =
          software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty.builder()

      override fun allowCheckIn(allowCheckIn: Boolean) {
        cdkBuilder.allowCheckIn(allowCheckIn)
      }

      override fun allowCheckIn(allowCheckIn: IResolvable) {
        cdkBuilder.allowCheckIn(allowCheckIn.let(IResolvable::unwrap))
      }

      override fun maxCount(maxCount: Number) {
        cdkBuilder.maxCount(maxCount)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun overage(overage: Boolean) {
        cdkBuilder.overage(overage)
      }

      override fun overage(overage: IResolvable) {
        cdkBuilder.overage(overage.let(IResolvable::unwrap))
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty,
    ) : EntitlementProperty {
      override fun allowCheckIn(): Any? = unwrap(this).getAllowCheckIn()

      override fun maxCount(): Number? = unwrap(this).getMaxCount()

      override fun name(): String = unwrap(this).getName()

      override fun overage(): Any? = unwrap(this).getOverage()

      override fun unit(): String = unwrap(this).getUnit()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EntitlementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty):
          EntitlementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntitlementProperty):
          software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ValidityDateFormatProperty {
    public fun begin(): String

    public fun end(): String

    public interface Builder {
      public fun begin(begin: String)

      public fun end(end: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty.Builder
          =
          software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty.builder()

      override fun begin(begin: String) {
        cdkBuilder.begin(begin)
      }

      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      public fun build():
          software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty,
    ) : ValidityDateFormatProperty {
      override fun begin(): String = unwrap(this).getBegin()

      override fun end(): String = unwrap(this).getEnd()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValidityDateFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty):
          ValidityDateFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidityDateFormatProperty):
          software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IssuerDataProperty {
    public fun name(): String

    public fun signKey(): String? = unwrap(this).getSignKey()

    public interface Builder {
      public fun name(name: String)

      public fun signKey(signKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty.Builder =
          software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun signKey(signKey: String) {
        cdkBuilder.signKey(signKey)
      }

      public fun build():
          software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty,
    ) : IssuerDataProperty {
      override fun name(): String = unwrap(this).getName()

      override fun signKey(): String? = unwrap(this).getSignKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IssuerDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty):
          IssuerDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IssuerDataProperty):
          software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BorrowConfigurationProperty {
    public fun allowEarlyCheckIn(): Any

    public fun maxTimeToLiveInMinutes(): Number

    public interface Builder {
      public fun allowEarlyCheckIn(allowEarlyCheckIn: Boolean)

      public fun allowEarlyCheckIn(allowEarlyCheckIn: IResolvable)

      public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty.builder()

      override fun allowEarlyCheckIn(allowEarlyCheckIn: Boolean) {
        cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
      }

      override fun allowEarlyCheckIn(allowEarlyCheckIn: IResolvable) {
        cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn.let(IResolvable::unwrap))
      }

      override fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
        cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty,
    ) : BorrowConfigurationProperty {
      override fun allowEarlyCheckIn(): Any = unwrap(this).getAllowEarlyCheckIn()

      override fun maxTimeToLiveInMinutes(): Number = unwrap(this).getMaxTimeToLiveInMinutes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BorrowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty):
          BorrowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BorrowConfigurationProperty):
          software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConsumptionConfigurationProperty {
    public fun borrowConfiguration(): Any? = unwrap(this).getBorrowConfiguration()

    public fun provisionalConfiguration(): Any? = unwrap(this).getProvisionalConfiguration()

    public fun renewType(): String? = unwrap(this).getRenewType()

    public interface Builder {
      public fun borrowConfiguration(borrowConfiguration: IResolvable)

      public fun borrowConfiguration(borrowConfiguration: BorrowConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e17b42d180bed9064b92db2ed67943a13fd53dba08f9509bb51af24a6728592a")
      public
          fun borrowConfiguration(borrowConfiguration: BorrowConfigurationProperty.Builder.() -> Unit)

      public fun provisionalConfiguration(provisionalConfiguration: IResolvable)

      public
          fun provisionalConfiguration(provisionalConfiguration: ProvisionalConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deec56397e9f8598e97e6b157023f292b91f6df1781d03d5b810783919c042c3")
      public
          fun provisionalConfiguration(provisionalConfiguration: ProvisionalConfigurationProperty.Builder.() -> Unit)

      public fun renewType(renewType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty.builder()

      override fun borrowConfiguration(borrowConfiguration: IResolvable) {
        cdkBuilder.borrowConfiguration(borrowConfiguration.let(IResolvable::unwrap))
      }

      override fun borrowConfiguration(borrowConfiguration: BorrowConfigurationProperty) {
        cdkBuilder.borrowConfiguration(borrowConfiguration.let(BorrowConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e17b42d180bed9064b92db2ed67943a13fd53dba08f9509bb51af24a6728592a")
      override
          fun borrowConfiguration(borrowConfiguration: BorrowConfigurationProperty.Builder.() -> Unit):
          Unit = borrowConfiguration(BorrowConfigurationProperty(borrowConfiguration))

      override fun provisionalConfiguration(provisionalConfiguration: IResolvable) {
        cdkBuilder.provisionalConfiguration(provisionalConfiguration.let(IResolvable::unwrap))
      }

      override
          fun provisionalConfiguration(provisionalConfiguration: ProvisionalConfigurationProperty) {
        cdkBuilder.provisionalConfiguration(provisionalConfiguration.let(ProvisionalConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("deec56397e9f8598e97e6b157023f292b91f6df1781d03d5b810783919c042c3")
      override
          fun provisionalConfiguration(provisionalConfiguration: ProvisionalConfigurationProperty.Builder.() -> Unit):
          Unit =
          provisionalConfiguration(ProvisionalConfigurationProperty(provisionalConfiguration))

      override fun renewType(renewType: String) {
        cdkBuilder.renewType(renewType)
      }

      public fun build():
          software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty,
    ) : ConsumptionConfigurationProperty {
      override fun borrowConfiguration(): Any? = unwrap(this).getBorrowConfiguration()

      override fun provisionalConfiguration(): Any? = unwrap(this).getProvisionalConfiguration()

      override fun renewType(): String? = unwrap(this).getRenewType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConsumptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty):
          ConsumptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConsumptionConfigurationProperty):
          software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
