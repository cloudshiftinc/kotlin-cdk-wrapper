@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.amazon.awscdk.services.licensemanager.CfnLicenseProps

@CdkDslMarker
public class CfnLicensePropsDsl {
  private val cdkBuilder: CfnLicenseProps.Builder = CfnLicenseProps.builder()

  private val _entitlements: MutableList<Any> = mutableListOf()

  private val _licenseMetadata: MutableList<Any> = mutableListOf()

  /**
   * @param beneficiary License beneficiary.
   */
  public fun beneficiary(beneficiary: String) {
    cdkBuilder.beneficiary(beneficiary)
  }

  /**
   * @param consumptionConfiguration Configuration for consumption of the license. 
   */
  public fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
    cdkBuilder.consumptionConfiguration(consumptionConfiguration)
  }

  /**
   * @param consumptionConfiguration Configuration for consumption of the license. 
   */
  public
      fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty) {
    cdkBuilder.consumptionConfiguration(consumptionConfiguration)
  }

  /**
   * @param entitlements License entitlements. 
   */
  public fun entitlements(vararg entitlements: Any) {
    _entitlements.addAll(listOf(*entitlements))
  }

  /**
   * @param entitlements License entitlements. 
   */
  public fun entitlements(entitlements: Collection<Any>) {
    _entitlements.addAll(entitlements)
  }

  /**
   * @param entitlements License entitlements. 
   */
  public fun entitlements(entitlements: IResolvable) {
    cdkBuilder.entitlements(entitlements)
  }

  /**
   * @param homeRegion Home Region of the license. 
   */
  public fun homeRegion(homeRegion: String) {
    cdkBuilder.homeRegion(homeRegion)
  }

  /**
   * @param issuer License issuer. 
   */
  public fun issuer(issuer: IResolvable) {
    cdkBuilder.issuer(issuer)
  }

  /**
   * @param issuer License issuer. 
   */
  public fun issuer(issuer: CfnLicense.IssuerDataProperty) {
    cdkBuilder.issuer(issuer)
  }

  /**
   * @param licenseMetadata License metadata.
   */
  public fun licenseMetadata(vararg licenseMetadata: Any) {
    _licenseMetadata.addAll(listOf(*licenseMetadata))
  }

  /**
   * @param licenseMetadata License metadata.
   */
  public fun licenseMetadata(licenseMetadata: Collection<Any>) {
    _licenseMetadata.addAll(licenseMetadata)
  }

  /**
   * @param licenseMetadata License metadata.
   */
  public fun licenseMetadata(licenseMetadata: IResolvable) {
    cdkBuilder.licenseMetadata(licenseMetadata)
  }

  /**
   * @param licenseName License name. 
   */
  public fun licenseName(licenseName: String) {
    cdkBuilder.licenseName(licenseName)
  }

  /**
   * @param productName Product name. 
   */
  public fun productName(productName: String) {
    cdkBuilder.productName(productName)
  }

  /**
   * @param productSku Product SKU.
   */
  public fun productSku(productSku: String) {
    cdkBuilder.productSku(productSku)
  }

  /**
   * @param status License status.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param validity Date and time range during which the license is valid, in ISO8601-UTC format. 
   */
  public fun validity(validity: IResolvable) {
    cdkBuilder.validity(validity)
  }

  /**
   * @param validity Date and time range during which the license is valid, in ISO8601-UTC format. 
   */
  public fun validity(validity: CfnLicense.ValidityDateFormatProperty) {
    cdkBuilder.validity(validity)
  }

  public fun build(): CfnLicenseProps {
    if(_entitlements.isNotEmpty()) cdkBuilder.entitlements(_entitlements)
    if(_licenseMetadata.isNotEmpty()) cdkBuilder.licenseMetadata(_licenseMetadata)
    return cdkBuilder.build()
  }
}
