@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.neptune

import kotlin.Unit
import software.amazon.awscdk.services.neptune.CfnDBCluster

public inline
    fun CfnDBCluster.setServerlessScalingConfiguration(block: CfnDBClusterServerlessScalingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDBClusterServerlessScalingConfigurationPropertyDsl()
  builder.apply(block)
  return setServerlessScalingConfiguration(builder.build())
}
