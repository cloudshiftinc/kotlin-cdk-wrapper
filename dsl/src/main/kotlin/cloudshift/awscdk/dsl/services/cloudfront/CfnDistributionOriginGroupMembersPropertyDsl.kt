@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex data type for the origins included in an origin group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginGroupMembersProperty originGroupMembersProperty = OriginGroupMembersProperty.builder()
 * .items(List.of(OriginGroupMemberProperty.builder()
 * .originId("originId")
 * .build()))
 * .quantity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html)
 */
@CdkDslMarker
public class CfnDistributionOriginGroupMembersPropertyDsl {
  private val cdkBuilder: CfnDistribution.OriginGroupMembersProperty.Builder =
      CfnDistribution.OriginGroupMembersProperty.builder()

  private val _items: MutableList<Any> = mutableListOf()

  /**
   * @param items Items (origins) in an origin group. 
   */
  public fun items(vararg items: Any) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items Items (origins) in an origin group. 
   */
  public fun items(items: Collection<Any>) {
    _items.addAll(items)
  }

  /**
   * @param items Items (origins) in an origin group. 
   */
  public fun items(items: IResolvable) {
    cdkBuilder.items(items)
  }

  /**
   * @param quantity The number of origins in an origin group. 
   */
  public fun quantity(quantity: Number) {
    cdkBuilder.quantity(quantity)
  }

  public fun build(): CfnDistribution.OriginGroupMembersProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
