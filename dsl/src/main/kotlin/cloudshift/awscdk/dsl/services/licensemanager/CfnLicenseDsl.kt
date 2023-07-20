@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.constructs.Construct

@CdkDslMarker
public class CfnLicenseDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLicense.Builder = CfnLicense.Builder.create(scope, id)

  private val _entitlements: MutableList<Any> = mutableListOf()

  private val _licenseMetadata: MutableList<Any> = mutableListOf()

  public fun beneficiary(beneficiary: String) {
    cdkBuilder.beneficiary(beneficiary)
  }

  public fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
    cdkBuilder.consumptionConfiguration(consumptionConfiguration)
  }

  public
      fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty) {
    cdkBuilder.consumptionConfiguration(consumptionConfiguration)
  }

  public fun entitlements(vararg entitlements: Any) {
    _entitlements.addAll(listOf(*entitlements))
  }

  public fun entitlements(entitlements: Collection<Any>) {
    _entitlements.addAll(entitlements)
  }

  public fun entitlements(entitlements: IResolvable) {
    cdkBuilder.entitlements(entitlements)
  }

  public fun homeRegion(homeRegion: String) {
    cdkBuilder.homeRegion(homeRegion)
  }

  public fun issuer(issuer: IResolvable) {
    cdkBuilder.issuer(issuer)
  }

  public fun issuer(issuer: CfnLicense.IssuerDataProperty) {
    cdkBuilder.issuer(issuer)
  }

  public fun licenseMetadata(vararg licenseMetadata: Any) {
    _licenseMetadata.addAll(listOf(*licenseMetadata))
  }

  public fun licenseMetadata(licenseMetadata: Collection<Any>) {
    _licenseMetadata.addAll(licenseMetadata)
  }

  public fun licenseMetadata(licenseMetadata: IResolvable) {
    cdkBuilder.licenseMetadata(licenseMetadata)
  }

  public fun licenseName(licenseName: String) {
    cdkBuilder.licenseName(licenseName)
  }

  public fun productName(productName: String) {
    cdkBuilder.productName(productName)
  }

  public fun productSku(productSku: String) {
    cdkBuilder.productSku(productSku)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun validity(validity: IResolvable) {
    cdkBuilder.validity(validity)
  }

  public fun validity(validity: CfnLicense.ValidityDateFormatProperty) {
    cdkBuilder.validity(validity)
  }

  public fun build(): CfnLicense {
    if(_entitlements.isNotEmpty()) cdkBuilder.entitlements(_entitlements)
    if(_licenseMetadata.isNotEmpty()) cdkBuilder.licenseMetadata(_licenseMetadata)
    return cdkBuilder.build()
  }
}
