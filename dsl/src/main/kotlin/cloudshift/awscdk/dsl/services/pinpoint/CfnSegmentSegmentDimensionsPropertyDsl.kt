@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentSegmentDimensionsPropertyDsl {
  private val cdkBuilder: CfnSegment.SegmentDimensionsProperty.Builder =
      CfnSegment.SegmentDimensionsProperty.builder()

  public fun attributes(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.attributes(builder.map)
  }

  public fun attributes(attributes: Any) {
    cdkBuilder.attributes(attributes)
  }

  public fun behavior(behavior: IResolvable) {
    cdkBuilder.behavior(behavior)
  }

  public fun behavior(behavior: CfnSegment.BehaviorProperty) {
    cdkBuilder.behavior(behavior)
  }

  public fun demographic(demographic: IResolvable) {
    cdkBuilder.demographic(demographic)
  }

  public fun demographic(demographic: CfnSegment.DemographicProperty) {
    cdkBuilder.demographic(demographic)
  }

  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  public fun location(location: CfnSegment.LocationProperty) {
    cdkBuilder.location(location)
  }

  public fun metrics(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.metrics(builder.map)
  }

  public fun metrics(metrics: Any) {
    cdkBuilder.metrics(metrics)
  }

  public fun userAttributes(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.userAttributes(builder.map)
  }

  public fun userAttributes(userAttributes: Any) {
    cdkBuilder.userAttributes(userAttributes)
  }

  public fun build(): CfnSegment.SegmentDimensionsProperty = cdkBuilder.build()
}
