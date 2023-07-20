@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import kotlin.Unit
import software.amazon.awscdk.services.m2.CfnApplication
import software.amazon.awscdk.services.m2.CfnEnvironment

public inline fun CfnApplication.setDefinition(block: CfnApplicationDefinitionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnApplicationDefinitionPropertyDsl()
  builder.apply(block)
  return setDefinition(builder.build())
}

public inline
    fun CfnEnvironment.setHighAvailabilityConfig(block: CfnEnvironmentHighAvailabilityConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEnvironmentHighAvailabilityConfigPropertyDsl()
  builder.apply(block)
  return setHighAvailabilityConfig(builder.build())
}
