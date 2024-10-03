@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLicense`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.licensemanager.*;
 * CfnLicenseProps cfnLicenseProps = CfnLicenseProps.builder()
 * .consumptionConfiguration(ConsumptionConfigurationProperty.builder()
 * .borrowConfiguration(BorrowConfigurationProperty.builder()
 * .allowEarlyCheckIn(false)
 * .maxTimeToLiveInMinutes(123)
 * .build())
 * .provisionalConfiguration(ProvisionalConfigurationProperty.builder()
 * .maxTimeToLiveInMinutes(123)
 * .build())
 * .renewType("renewType")
 * .build())
 * .entitlements(List.of(EntitlementProperty.builder()
 * .name("name")
 * .unit("unit")
 * // the properties below are optional
 * .allowCheckIn(false)
 * .maxCount(123)
 * .overage(false)
 * .value("value")
 * .build()))
 * .homeRegion("homeRegion")
 * .issuer(IssuerDataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .signKey("signKey")
 * .build())
 * .licenseName("licenseName")
 * .productName("productName")
 * .validity(ValidityDateFormatProperty.builder()
 * .begin("begin")
 * .end("end")
 * .build())
 * // the properties below are optional
 * .beneficiary("beneficiary")
 * .licenseMetadata(List.of(MetadataProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .productSku("productSku")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html)
 */
public interface CfnLicenseProps {
  /**
   * License beneficiary.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-beneficiary)
   */
  public fun beneficiary(): String? = unwrap(this).getBeneficiary()

  /**
   * Configuration for consumption of the license.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
   */
  public fun consumptionConfiguration(): Any

  /**
   * License entitlements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
   */
  public fun entitlements(): Any

  /**
   * Home Region of the license.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-homeregion)
   */
  public fun homeRegion(): String

  /**
   * License issuer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
   */
  public fun issuer(): Any

  /**
   * License metadata.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
   */
  public fun licenseMetadata(): Any? = unwrap(this).getLicenseMetadata()

  /**
   * License name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensename)
   */
  public fun licenseName(): String

  /**
   * Product name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productname)
   */
  public fun productName(): String

  /**
   * Product SKU.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productsku)
   */
  public fun productSku(): String? = unwrap(this).getProductSku()

  /**
   * License status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Date and time range during which the license is valid, in ISO8601-UTC format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
   */
  public fun validity(): Any

  /**
   * A builder for [CfnLicenseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param beneficiary License beneficiary.
     */
    public fun beneficiary(beneficiary: String)

    /**
     * @param consumptionConfiguration Configuration for consumption of the license. 
     */
    public fun consumptionConfiguration(consumptionConfiguration: IResolvable)

    /**
     * @param consumptionConfiguration Configuration for consumption of the license. 
     */
    public
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty)

    /**
     * @param consumptionConfiguration Configuration for consumption of the license. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9070764e5375fd9e499beb76224d5863bd321c9450148e06387cdaa871cb6b91")
    public
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param entitlements License entitlements. 
     */
    public fun entitlements(entitlements: IResolvable)

    /**
     * @param entitlements License entitlements. 
     */
    public fun entitlements(entitlements: List<Any>)

    /**
     * @param entitlements License entitlements. 
     */
    public fun entitlements(vararg entitlements: Any)

    /**
     * @param homeRegion Home Region of the license. 
     */
    public fun homeRegion(homeRegion: String)

    /**
     * @param issuer License issuer. 
     */
    public fun issuer(issuer: IResolvable)

    /**
     * @param issuer License issuer. 
     */
    public fun issuer(issuer: CfnLicense.IssuerDataProperty)

    /**
     * @param issuer License issuer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1439513425fe4fa1a3bf9545bf09c514d2fbb43b034b64989f3a16c94806f010")
    public fun issuer(issuer: CfnLicense.IssuerDataProperty.Builder.() -> Unit)

    /**
     * @param licenseMetadata License metadata.
     */
    public fun licenseMetadata(licenseMetadata: IResolvable)

    /**
     * @param licenseMetadata License metadata.
     */
    public fun licenseMetadata(licenseMetadata: List<Any>)

    /**
     * @param licenseMetadata License metadata.
     */
    public fun licenseMetadata(vararg licenseMetadata: Any)

    /**
     * @param licenseName License name. 
     */
    public fun licenseName(licenseName: String)

    /**
     * @param productName Product name. 
     */
    public fun productName(productName: String)

    /**
     * @param productSku Product SKU.
     */
    public fun productSku(productSku: String)

    /**
     * @param status License status.
     */
    public fun status(status: String)

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     * 
     */
    public fun validity(validity: IResolvable)

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     * 
     */
    public fun validity(validity: CfnLicense.ValidityDateFormatProperty)

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1b4f742f2c639fa00a8af12e39a8dbb1ff7768046f1c016c45d96ddc9f660e5")
    public fun validity(validity: CfnLicense.ValidityDateFormatProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnLicenseProps.Builder =
        software.amazon.awscdk.services.licensemanager.CfnLicenseProps.builder()

    /**
     * @param beneficiary License beneficiary.
     */
    override fun beneficiary(beneficiary: String) {
      cdkBuilder.beneficiary(beneficiary)
    }

    /**
     * @param consumptionConfiguration Configuration for consumption of the license. 
     */
    override fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
      cdkBuilder.consumptionConfiguration(consumptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param consumptionConfiguration Configuration for consumption of the license. 
     */
    override
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty) {
      cdkBuilder.consumptionConfiguration(consumptionConfiguration.let(CfnLicense.ConsumptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param consumptionConfiguration Configuration for consumption of the license. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9070764e5375fd9e499beb76224d5863bd321c9450148e06387cdaa871cb6b91")
    override
        fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        consumptionConfiguration(CfnLicense.ConsumptionConfigurationProperty(consumptionConfiguration))

    /**
     * @param entitlements License entitlements. 
     */
    override fun entitlements(entitlements: IResolvable) {
      cdkBuilder.entitlements(entitlements.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param entitlements License entitlements. 
     */
    override fun entitlements(entitlements: List<Any>) {
      cdkBuilder.entitlements(entitlements.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param entitlements License entitlements. 
     */
    override fun entitlements(vararg entitlements: Any): Unit = entitlements(entitlements.toList())

    /**
     * @param homeRegion Home Region of the license. 
     */
    override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    /**
     * @param issuer License issuer. 
     */
    override fun issuer(issuer: IResolvable) {
      cdkBuilder.issuer(issuer.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param issuer License issuer. 
     */
    override fun issuer(issuer: CfnLicense.IssuerDataProperty) {
      cdkBuilder.issuer(issuer.let(CfnLicense.IssuerDataProperty.Companion::unwrap))
    }

    /**
     * @param issuer License issuer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1439513425fe4fa1a3bf9545bf09c514d2fbb43b034b64989f3a16c94806f010")
    override fun issuer(issuer: CfnLicense.IssuerDataProperty.Builder.() -> Unit): Unit =
        issuer(CfnLicense.IssuerDataProperty(issuer))

    /**
     * @param licenseMetadata License metadata.
     */
    override fun licenseMetadata(licenseMetadata: IResolvable) {
      cdkBuilder.licenseMetadata(licenseMetadata.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param licenseMetadata License metadata.
     */
    override fun licenseMetadata(licenseMetadata: List<Any>) {
      cdkBuilder.licenseMetadata(licenseMetadata.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param licenseMetadata License metadata.
     */
    override fun licenseMetadata(vararg licenseMetadata: Any): Unit =
        licenseMetadata(licenseMetadata.toList())

    /**
     * @param licenseName License name. 
     */
    override fun licenseName(licenseName: String) {
      cdkBuilder.licenseName(licenseName)
    }

    /**
     * @param productName Product name. 
     */
    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    /**
     * @param productSku Product SKU.
     */
    override fun productSku(productSku: String) {
      cdkBuilder.productSku(productSku)
    }

    /**
     * @param status License status.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     * 
     */
    override fun validity(validity: IResolvable) {
      cdkBuilder.validity(validity.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     * 
     */
    override fun validity(validity: CfnLicense.ValidityDateFormatProperty) {
      cdkBuilder.validity(validity.let(CfnLicense.ValidityDateFormatProperty.Companion::unwrap))
    }

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1b4f742f2c639fa00a8af12e39a8dbb1ff7768046f1c016c45d96ddc9f660e5")
    override fun validity(validity: CfnLicense.ValidityDateFormatProperty.Builder.() -> Unit): Unit
        = validity(CfnLicense.ValidityDateFormatProperty(validity))

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnLicenseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicenseProps,
  ) : CdkObject(cdkObject),
      CfnLicenseProps {
    /**
     * License beneficiary.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-beneficiary)
     */
    override fun beneficiary(): String? = unwrap(this).getBeneficiary()

    /**
     * Configuration for consumption of the license.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
     */
    override fun consumptionConfiguration(): Any = unwrap(this).getConsumptionConfiguration()

    /**
     * License entitlements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
     */
    override fun entitlements(): Any = unwrap(this).getEntitlements()

    /**
     * Home Region of the license.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-homeregion)
     */
    override fun homeRegion(): String = unwrap(this).getHomeRegion()

    /**
     * License issuer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
     */
    override fun issuer(): Any = unwrap(this).getIssuer()

    /**
     * License metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
     */
    override fun licenseMetadata(): Any? = unwrap(this).getLicenseMetadata()

    /**
     * License name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensename)
     */
    override fun licenseName(): String = unwrap(this).getLicenseName()

    /**
     * Product name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productname)
     */
    override fun productName(): String = unwrap(this).getProductName()

    /**
     * Product SKU.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productsku)
     */
    override fun productSku(): String? = unwrap(this).getProductSku()

    /**
     * License status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * Date and time range during which the license is valid, in ISO8601-UTC format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
     */
    override fun validity(): Any = unwrap(this).getValidity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLicenseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicenseProps):
        CfnLicenseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLicenseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLicenseProps):
        software.amazon.awscdk.services.licensemanager.CfnLicenseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.licensemanager.CfnLicenseProps
  }
}
