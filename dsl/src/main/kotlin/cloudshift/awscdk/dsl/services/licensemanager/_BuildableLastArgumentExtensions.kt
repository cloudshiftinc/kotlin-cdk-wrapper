@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicense

/**
 * Configuration for consumption of the license.
 */
public inline
    fun CfnLicense.setConsumptionConfiguration(block: CfnLicenseConsumptionConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLicenseConsumptionConfigurationPropertyDsl()
  builder.apply(block)
  return setConsumptionConfiguration(builder.build())
}

/**
 * License issuer.
 */
public inline fun CfnLicense.setIssuer(block: CfnLicenseIssuerDataPropertyDsl.() -> Unit = {}) {
  val builder = CfnLicenseIssuerDataPropertyDsl()
  builder.apply(block)
  return setIssuer(builder.build())
}

/**
 * Date and time range during which the license is valid, in ISO8601-UTC format.
 */
public inline fun CfnLicense.setValidity(block: CfnLicenseValidityDateFormatPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnLicenseValidityDateFormatPropertyDsl()
  builder.apply(block)
  return setValidity(builder.build())
}
