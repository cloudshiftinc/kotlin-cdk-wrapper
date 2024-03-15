@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLicenseProps {
  public fun beneficiary(): String? = unwrap(this).getBeneficiary()

  public fun consumptionConfiguration(): Any

  public fun entitlements(): Any

  public fun homeRegion(): String

  public fun issuer(): Any

  public fun licenseMetadata(): Any? = unwrap(this).getLicenseMetadata()

  public fun licenseName(): String

  public fun productName(): String

  public fun productSku(): String? = unwrap(this).getProductSku()

  public fun status(): String? = unwrap(this).getStatus()

  public fun validity(): Any

  @CdkDslMarker
  public interface Builder {
    public fun beneficiary(beneficiary: String)

    public fun consumptionConfiguration(consumptionConfiguration: IResolvable)

    public
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9070764e5375fd9e499beb76224d5863bd321c9450148e06387cdaa871cb6b91")
    public
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty.Builder.() -> Unit)

    public fun entitlements(entitlements: IResolvable)

    public fun entitlements(entitlements: List<Any>)

    public fun entitlements(vararg entitlements: Any)

    public fun homeRegion(homeRegion: String)

    public fun issuer(issuer: IResolvable)

    public fun issuer(issuer: CfnLicense.IssuerDataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1439513425fe4fa1a3bf9545bf09c514d2fbb43b034b64989f3a16c94806f010")
    public fun issuer(issuer: CfnLicense.IssuerDataProperty.Builder.() -> Unit)

    public fun licenseMetadata(licenseMetadata: IResolvable)

    public fun licenseMetadata(licenseMetadata: List<Any>)

    public fun licenseMetadata(vararg licenseMetadata: Any)

    public fun licenseName(licenseName: String)

    public fun productName(productName: String)

    public fun productSku(productSku: String)

    public fun status(status: String)

    public fun validity(validity: IResolvable)

    public fun validity(validity: CfnLicense.ValidityDateFormatProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1b4f742f2c639fa00a8af12e39a8dbb1ff7768046f1c016c45d96ddc9f660e5")
    public fun validity(validity: CfnLicense.ValidityDateFormatProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnLicenseProps.Builder =
        software.amazon.awscdk.services.licensemanager.CfnLicenseProps.builder()

    override fun beneficiary(beneficiary: String) {
      cdkBuilder.beneficiary(beneficiary)
    }

    override fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
      cdkBuilder.consumptionConfiguration(consumptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty) {
      cdkBuilder.consumptionConfiguration(consumptionConfiguration.let(CfnLicense.ConsumptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9070764e5375fd9e499beb76224d5863bd321c9450148e06387cdaa871cb6b91")
    override
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        consumptionConfiguration(CfnLicense.ConsumptionConfigurationProperty(consumptionConfiguration))

    override fun entitlements(entitlements: IResolvable) {
      cdkBuilder.entitlements(entitlements.let(IResolvable::unwrap))
    }

    override fun entitlements(entitlements: List<Any>) {
      cdkBuilder.entitlements(entitlements)
    }

    override fun entitlements(vararg entitlements: Any): Unit = entitlements(entitlements.toList())

    override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    override fun issuer(issuer: IResolvable) {
      cdkBuilder.issuer(issuer.let(IResolvable::unwrap))
    }

    override fun issuer(issuer: CfnLicense.IssuerDataProperty) {
      cdkBuilder.issuer(issuer.let(CfnLicense.IssuerDataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1439513425fe4fa1a3bf9545bf09c514d2fbb43b034b64989f3a16c94806f010")
    override fun issuer(issuer: CfnLicense.IssuerDataProperty.Builder.() -> Unit): Unit =
        issuer(CfnLicense.IssuerDataProperty(issuer))

    override fun licenseMetadata(licenseMetadata: IResolvable) {
      cdkBuilder.licenseMetadata(licenseMetadata.let(IResolvable::unwrap))
    }

    override fun licenseMetadata(licenseMetadata: List<Any>) {
      cdkBuilder.licenseMetadata(licenseMetadata)
    }

    override fun licenseMetadata(vararg licenseMetadata: Any): Unit =
        licenseMetadata(licenseMetadata.toList())

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

    override fun validity(validity: CfnLicense.ValidityDateFormatProperty) {
      cdkBuilder.validity(validity.let(CfnLicense.ValidityDateFormatProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1b4f742f2c639fa00a8af12e39a8dbb1ff7768046f1c016c45d96ddc9f660e5")
    override fun validity(validity: CfnLicense.ValidityDateFormatProperty.Builder.() -> Unit): Unit
        = validity(CfnLicense.ValidityDateFormatProperty(validity))

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnLicenseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicenseProps,
  ) : CdkObject(cdkObject), CfnLicenseProps {
    override fun beneficiary(): String? = unwrap(this).getBeneficiary()

    override fun consumptionConfiguration(): Any = unwrap(this).getConsumptionConfiguration()

    override fun entitlements(): Any = unwrap(this).getEntitlements()

    override fun homeRegion(): String = unwrap(this).getHomeRegion()

    override fun issuer(): Any = unwrap(this).getIssuer()

    override fun licenseMetadata(): Any? = unwrap(this).getLicenseMetadata()

    override fun licenseName(): String = unwrap(this).getLicenseName()

    override fun productName(): String = unwrap(this).getProductName()

    override fun productSku(): String? = unwrap(this).getProductSku()

    override fun status(): String? = unwrap(this).getStatus()

    override fun validity(): Any = unwrap(this).getValidity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLicenseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicenseProps):
        CfnLicenseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLicenseProps):
        software.amazon.awscdk.services.licensemanager.CfnLicenseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.licensemanager.CfnLicenseProps
  }
}
