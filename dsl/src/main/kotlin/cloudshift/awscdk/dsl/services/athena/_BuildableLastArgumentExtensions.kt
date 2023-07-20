@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.amazon.awscdk.services.athena.CfnWorkGroup

public inline
    fun CfnCapacityReservation.setCapacityAssignmentConfiguration(block: CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl()
  builder.apply(block)
  return setCapacityAssignmentConfiguration(builder.build())
}

public inline
    fun CfnWorkGroup.setWorkGroupConfiguration(block: CfnWorkGroupWorkGroupConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWorkGroupWorkGroupConfigurationPropertyDsl()
  builder.apply(block)
  return setWorkGroupConfiguration(builder.build())
}
