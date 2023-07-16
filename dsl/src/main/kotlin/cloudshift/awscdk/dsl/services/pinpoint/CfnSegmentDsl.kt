@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment
import software.constructs.Construct

@CdkDslMarker
public class CfnSegmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSegment.Builder = CfnSegment.Builder.create(scope, id)

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun dimensions(dimensions: CfnSegment.SegmentDimensionsProperty) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun segmentGroups(segmentGroups: IResolvable) {
    cdkBuilder.segmentGroups(segmentGroups)
  }

  public fun segmentGroups(segmentGroups: CfnSegment.SegmentGroupsProperty) {
    cdkBuilder.segmentGroups(segmentGroups)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSegment = cdkBuilder.build()
}
