@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

public inline fun CfnFHIRDatastore.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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
