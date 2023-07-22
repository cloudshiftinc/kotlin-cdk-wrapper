@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemoveTag

@CdkDslMarker
public class RemoveTagDsl(
  key: String,
) {
  private val cdkBuilder: RemoveTag.Builder = RemoveTag.Builder.create(key)

  private val _excludeResourceTypes: MutableList<String> = mutableListOf()

  private val _includeResourceTypes: MutableList<String> = mutableListOf()

  /**
   * Whether the tag should be applied to instances in an AutoScalingGroup.
   *
   * Default: true
   *
   * @param applyToLaunchedInstances Whether the tag should be applied to instances in an
   * AutoScalingGroup. 
   */
  public fun applyToLaunchedInstances(applyToLaunchedInstances: Boolean) {
    cdkBuilder.applyToLaunchedInstances(applyToLaunchedInstances)
  }

  /**
   * An array of Resource Types that will not receive this tag.
   *
   * An empty array will allow this tag to be applied to all resources. A
   * non-empty array will apply this tag only if the Resource type is not in
   * this array.
   *
   * Default: []
   *
   * @param excludeResourceTypes An array of Resource Types that will not receive this tag. 
   */
  public fun excludeResourceTypes(vararg excludeResourceTypes: String) {
    _excludeResourceTypes.addAll(listOf(*excludeResourceTypes))
  }

  /**
   * An array of Resource Types that will not receive this tag.
   *
   * An empty array will allow this tag to be applied to all resources. A
   * non-empty array will apply this tag only if the Resource type is not in
   * this array.
   *
   * Default: []
   *
   * @param excludeResourceTypes An array of Resource Types that will not receive this tag. 
   */
  public fun excludeResourceTypes(excludeResourceTypes: Collection<String>) {
    _excludeResourceTypes.addAll(excludeResourceTypes)
  }

  /**
   * An array of Resource Types that will receive this tag.
   *
   * An empty array will match any Resource. A non-empty array will apply this
   * tag only to Resource types that are included in this array.
   *
   * Default: []
   *
   * @param includeResourceTypes An array of Resource Types that will receive this tag. 
   */
  public fun includeResourceTypes(vararg includeResourceTypes: String) {
    _includeResourceTypes.addAll(listOf(*includeResourceTypes))
  }

  /**
   * An array of Resource Types that will receive this tag.
   *
   * An empty array will match any Resource. A non-empty array will apply this
   * tag only to Resource types that are included in this array.
   *
   * Default: []
   *
   * @param includeResourceTypes An array of Resource Types that will receive this tag. 
   */
  public fun includeResourceTypes(includeResourceTypes: Collection<String>) {
    _includeResourceTypes.addAll(includeResourceTypes)
  }

  /**
   * Priority of the tag operation.
   *
   * Higher or equal priority tags will take precedence.
   *
   * Setting priority will enable the user to control tags when they need to not
   * follow the default precedence pattern of last applied and closest to the
   * construct in the tree.
   *
   * Default: Default priorities:
   * - 100 for `SetTag`
   * - 200 for `RemoveTag`
   * - 50 for tags added directly to CloudFormation resources
   *
   * @param priority Priority of the tag operation. 
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): RemoveTag {
    if(_excludeResourceTypes.isNotEmpty()) cdkBuilder.excludeResourceTypes(_excludeResourceTypes)
    if(_includeResourceTypes.isNotEmpty()) cdkBuilder.includeResourceTypes(_includeResourceTypes)
    return cdkBuilder.build()
  }
}
