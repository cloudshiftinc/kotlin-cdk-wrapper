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
public class CfnSegmentSegmentGroupsPropertyDsl {
  private val cdkBuilder: CfnSegment.SegmentGroupsProperty.Builder =
      CfnSegment.SegmentGroupsProperty.builder()

  private val _groups: MutableList<Any> = mutableListOf()

  /**
   * @param groups Specifies the set of segment criteria to evaluate when handling segment groups
   * for the segment.
   */
  public fun groups(vararg groups: Any) {
    _groups.addAll(listOf(*groups))
  }

  /**
   * @param groups Specifies the set of segment criteria to evaluate when handling segment groups
   * for the segment.
   */
  public fun groups(groups: Collection<Any>) {
    _groups.addAll(groups)
  }

  /**
   * @param groups Specifies the set of segment criteria to evaluate when handling segment groups
   * for the segment.
   */
  public fun groups(groups: IResolvable) {
    cdkBuilder.groups(groups)
  }

  /**
   * @param include Specifies how to handle multiple segment groups for the segment.
   * For example, if the segment includes three segment groups, whether the resulting segment
   * includes endpoints that match all, any, or none of the segment groups.
   */
  public fun include(include: String) {
    cdkBuilder.include(include)
  }

  public fun build(): CfnSegment.SegmentGroupsProperty {
    if(_groups.isNotEmpty()) cdkBuilder.groups(_groups)
    return cdkBuilder.build()
  }
}
