@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnGrant
import software.amazon.awscdk.services.licensemanager.CfnGrantProps
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.amazon.awscdk.services.licensemanager.CfnLicenseProps
import software.constructs.Construct

public object licensemanager {
  public inline fun cfnGrant(
    scope: Construct,
    id: String,
    block: CfnGrantDsl.() -> Unit = {},
  ): CfnGrant {
    val builder = CfnGrantDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGrantProps(block: CfnGrantPropsDsl.() -> Unit = {}): CfnGrantProps {
    val builder = CfnGrantPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLicense(
    scope: Construct,
    id: String,
    block: CfnLicenseDsl.() -> Unit = {},
  ): CfnLicense {
    val builder = CfnLicenseDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLicenseBorrowConfigurationProperty(block: CfnLicenseBorrowConfigurationPropertyDsl.() -> Unit
      = {}): CfnLicense.BorrowConfigurationProperty {
    val builder = CfnLicenseBorrowConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLicenseConsumptionConfigurationProperty(block: CfnLicenseConsumptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnLicense.ConsumptionConfigurationProperty {
    val builder = CfnLicenseConsumptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLicenseEntitlementProperty(block: CfnLicenseEntitlementPropertyDsl.() -> Unit
      = {}): CfnLicense.EntitlementProperty {
    val builder = CfnLicenseEntitlementPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLicenseIssuerDataProperty(block: CfnLicenseIssuerDataPropertyDsl.() -> Unit =
      {}): CfnLicense.IssuerDataProperty {
    val builder = CfnLicenseIssuerDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLicenseMetadataProperty(block: CfnLicenseMetadataPropertyDsl.() -> Unit =
      {}): CfnLicense.MetadataProperty {
    val builder = CfnLicenseMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLicenseProps(block: CfnLicensePropsDsl.() -> Unit = {}): CfnLicenseProps {
    val builder = CfnLicensePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLicenseProvisionalConfigurationProperty(block: CfnLicenseProvisionalConfigurationPropertyDsl.() -> Unit
      = {}): CfnLicense.ProvisionalConfigurationProperty {
    val builder = CfnLicenseProvisionalConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLicenseValidityDateFormatProperty(block: CfnLicenseValidityDateFormatPropertyDsl.() -> Unit
      = {}): CfnLicense.ValidityDateFormatProperty {
    val builder = CfnLicenseValidityDateFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
