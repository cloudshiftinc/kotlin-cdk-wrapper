@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mwaa

import kotlin.Unit
import software.amazon.awscdk.services.mwaa.CfnEnvironment

public inline
    fun CfnEnvironment.setLoggingConfiguration(block: CfnEnvironmentLoggingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEnvironmentLoggingConfigurationPropertyDsl()
  builder.apply(block)
  return setLoggingConfiguration(builder.build())
}

public inline
    fun CfnEnvironment.setNetworkConfiguration(block: CfnEnvironmentNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnEnvironmentNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}
