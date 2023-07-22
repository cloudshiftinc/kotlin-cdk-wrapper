@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.TagProps

/**
 * Properties for a tag.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * TagProps tagProps = TagProps.builder()
 * .applyToLaunchedInstances(false)
 * .excludeResourceTypes(List.of("excludeResourceTypes"))
 * .includeResourceTypes(List.of("includeResourceTypes"))
 * .priority(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class TagPropsDsl {
  private val cdkBuilder: TagProps.Builder = TagProps.builder()

  private val _excludeResourceTypes: MutableList<String> = mutableListOf()

  private val _includeResourceTypes: MutableList<String> = mutableListOf()

  /**
   * @param applyToLaunchedInstances Whether the tag should be applied to instances in an
   * AutoScalingGroup.
   */
  public fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean) {
    cdkBuilder.applyToLaunchedInstances(applyToLaunchedInstances)
  }

  /**
   * @param excludeResourceTypes An array of Resource Types that will not receive this tag.
   * An empty array will allow this tag to be applied to all resources. A
   * non-empty array will apply this tag only if the Resource type is not in
   * this array.
   */
  public fun excludeResourceTypes(vararg excludeResourceTypes: String) {
    _excludeResourceTypes.addAll(listOf(*excludeResourceTypes))
  }

  /**
   * @param excludeResourceTypes An array of Resource Types that will not receive this tag.
   * An empty array will allow this tag to be applied to all resources. A
   * non-empty array will apply this tag only if the Resource type is not in
   * this array.
   */
  public fun excludeResourceTypes(excludeResourceTypes: Collection<String>) {
    _excludeResourceTypes.addAll(excludeResourceTypes)
  }

  /**
   * @param includeResourceTypes An array of Resource Types that will receive this tag.
   * An empty array will match any Resource. A non-empty array will apply this
   * tag only to Resource types that are included in this array.
   */
  public fun includeResourceTypes(vararg includeResourceTypes: String) {
    _includeResourceTypes.addAll(listOf(*includeResourceTypes))
  }

  /**
   * @param includeResourceTypes An array of Resource Types that will receive this tag.
   * An empty array will match any Resource. A non-empty array will apply this
   * tag only to Resource types that are included in this array.
   */
  public fun includeResourceTypes(includeResourceTypes: Collection<String>) {
    _includeResourceTypes.addAll(includeResourceTypes)
  }

  /**
   * @param priority Priority of the tag operation.
   * Higher or equal priority tags will take precedence.
   *
   * Setting priority will enable the user to control tags when they need to not
   * follow the default precedence pattern of last applied and closest to the
   * construct in the tree.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): TagProps {
    if(_excludeResourceTypes.isNotEmpty()) cdkBuilder.excludeResourceTypes(_excludeResourceTypes)
    if(_includeResourceTypes.isNotEmpty()) cdkBuilder.includeResourceTypes(_includeResourceTypes)
    return cdkBuilder.build()
  }
}
