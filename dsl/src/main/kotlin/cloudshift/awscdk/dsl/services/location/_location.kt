@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.amazon.awscdk.services.location.CfnGeofenceCollectionProps
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnMapProps
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.amazon.awscdk.services.location.CfnPlaceIndexProps
import software.amazon.awscdk.services.location.CfnRouteCalculator
import software.amazon.awscdk.services.location.CfnRouteCalculatorProps
import software.amazon.awscdk.services.location.CfnTracker
import software.amazon.awscdk.services.location.CfnTrackerConsumer
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps
import software.amazon.awscdk.services.location.CfnTrackerProps
import software.constructs.Construct

public object location {
  public inline fun cfnGeofenceCollection(
    scope: Construct,
    id: String,
    block: CfnGeofenceCollectionDsl.() -> Unit = {},
  ): CfnGeofenceCollection {
    val builder = CfnGeofenceCollectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGeofenceCollectionProps(block: CfnGeofenceCollectionPropsDsl.() -> Unit =
      {}): CfnGeofenceCollectionProps {
    val builder = CfnGeofenceCollectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMap(
    scope: Construct,
    id: String,
    block: CfnMapDsl.() -> Unit = {},
  ): CfnMap {
    val builder = CfnMapDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMapMapConfigurationProperty(block: CfnMapMapConfigurationPropertyDsl.() -> Unit = {}):
      CfnMap.MapConfigurationProperty {
    val builder = CfnMapMapConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMapProps(block: CfnMapPropsDsl.() -> Unit = {}): CfnMapProps {
    val builder = CfnMapPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlaceIndex(
    scope: Construct,
    id: String,
    block: CfnPlaceIndexDsl.() -> Unit = {},
  ): CfnPlaceIndex {
    val builder = CfnPlaceIndexDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPlaceIndexDataSourceConfigurationProperty(block: CfnPlaceIndexDataSourceConfigurationPropertyDsl.() -> Unit
      = {}): CfnPlaceIndex.DataSourceConfigurationProperty {
    val builder = CfnPlaceIndexDataSourceConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPlaceIndexProps(block: CfnPlaceIndexPropsDsl.() -> Unit = {}):
      CfnPlaceIndexProps {
    val builder = CfnPlaceIndexPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteCalculator(
    scope: Construct,
    id: String,
    block: CfnRouteCalculatorDsl.() -> Unit = {},
  ): CfnRouteCalculator {
    val builder = CfnRouteCalculatorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRouteCalculatorProps(block: CfnRouteCalculatorPropsDsl.() -> Unit = {}):
      CfnRouteCalculatorProps {
    val builder = CfnRouteCalculatorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTracker(
    scope: Construct,
    id: String,
    block: CfnTrackerDsl.() -> Unit = {},
  ): CfnTracker {
    val builder = CfnTrackerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrackerConsumer(
    scope: Construct,
    id: String,
    block: CfnTrackerConsumerDsl.() -> Unit = {},
  ): CfnTrackerConsumer {
    val builder = CfnTrackerConsumerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrackerConsumerProps(block: CfnTrackerConsumerPropsDsl.() -> Unit = {}):
      CfnTrackerConsumerProps {
    val builder = CfnTrackerConsumerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrackerProps(block: CfnTrackerPropsDsl.() -> Unit = {}): CfnTrackerProps {
    val builder = CfnTrackerPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
