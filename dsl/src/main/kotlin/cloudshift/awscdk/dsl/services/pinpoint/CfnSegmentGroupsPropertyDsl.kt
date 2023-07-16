@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentGroupsPropertyDsl {
  private val cdkBuilder: CfnSegment.GroupsProperty.Builder = CfnSegment.GroupsProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  private val _sourceSegments: MutableList<Any> = mutableListOf()

  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  public fun sourceSegments(vararg sourceSegments: Any) {
    _sourceSegments.addAll(listOf(*sourceSegments))
  }

  public fun sourceSegments(sourceSegments: Collection<Any>) {
    _sourceSegments.addAll(sourceSegments)
  }

  public fun sourceSegments(sourceSegments: IResolvable) {
    cdkBuilder.sourceSegments(sourceSegments)
  }

  public fun sourceType(sourceType: String) {
    cdkBuilder.sourceType(sourceType)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSegment.GroupsProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    if(_sourceSegments.isNotEmpty()) cdkBuilder.sourceSegments(_sourceSegments)
    return cdkBuilder.build()
  }
}
