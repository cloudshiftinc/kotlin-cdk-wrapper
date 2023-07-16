@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.athena.CfnCapacityReservation
import software.amazon.awscdk.services.athena.CfnDataCatalog
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.amazon.awscdk.services.athena.CfnPreparedStatement
import software.amazon.awscdk.services.athena.CfnWorkGroup

public inline fun CfnCapacityReservation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCapacityReservation.setCapacityAssignmentConfiguration(block: CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCapacityReservationCapacityAssignmentConfigurationPropertyDsl()
  builder.apply(block)
  return setCapacityAssignmentConfiguration(builder.build())
}

public inline fun CfnDataCatalog.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNamedQuery.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPreparedStatement.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnWorkGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnWorkGroup.setWorkGroupConfiguration(block: CfnWorkGroupWorkGroupConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWorkGroupWorkGroupConfigurationPropertyDsl()
  builder.apply(block)
  return setWorkGroupConfiguration(builder.build())
}
