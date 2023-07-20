@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import kotlin.Unit
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnPlaceIndex

public inline
    fun CfnPlaceIndex.setDataSourceConfiguration(block: CfnPlaceIndexDataSourceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaceIndexDataSourceConfigurationPropertyDsl()
  builder.apply(block)
  return setDataSourceConfiguration(builder.build())
}

public inline fun CfnMap.setConfiguration(block: CfnMapMapConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnMapMapConfigurationPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}
