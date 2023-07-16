@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.amazon.awscdk.services.location.CfnRouteCalculator
import software.amazon.awscdk.services.location.CfnTracker
import software.amazon.awscdk.services.location.CfnTrackerConsumer

public inline fun CfnGeofenceCollection.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMap.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMap.setConfiguration(block: CfnMapMapConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnMapMapConfigurationPropertyDsl()
  builder.apply(block)
  return setConfiguration(builder.build())
}

public inline fun CfnPlaceIndex.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPlaceIndex.setDataSourceConfiguration(block: CfnPlaceIndexDataSourceConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnPlaceIndexDataSourceConfigurationPropertyDsl()
  builder.apply(block)
  return setDataSourceConfiguration(builder.build())
}

public inline fun CfnRouteCalculator.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTracker.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTrackerConsumer.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
