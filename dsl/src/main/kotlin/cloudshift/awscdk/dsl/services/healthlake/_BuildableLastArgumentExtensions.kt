@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

public inline
    fun CfnFHIRDatastore.setIdentityProviderConfiguration(block: CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl()
  builder.apply(block)
  return setIdentityProviderConfiguration(builder.build())
}

public inline
    fun CfnFHIRDatastore.setPreloadDataConfig(block: CfnFHIRDatastorePreloadDataConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFHIRDatastorePreloadDataConfigPropertyDsl()
  builder.apply(block)
  return setPreloadDataConfig(builder.build())
}

public inline
    fun CfnFHIRDatastore.setSseConfiguration(block: CfnFHIRDatastoreSseConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFHIRDatastoreSseConfigurationPropertyDsl()
  builder.apply(block)
  return setSseConfiguration(builder.build())
}
