@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.resourcegroups.CfnGroup

@CdkDslMarker
public class CfnGroupTagFilterPropertyDsl {
  private val cdkBuilder: CfnGroup.TagFilterProperty.Builder = CfnGroup.TagFilterProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param key A string that defines a tag key.
   * Only resources in the account that are tagged with a specified tag key are members of the
   * tag-based resource group.
   *
   * This field is required when the `ResourceQuery` structure's `Type` property is
   * `TAG_FILTERS_1_0` . You must specify at least one tag key.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param values A list of tag values that can be included in the tag-based resource group.
   * This is optional. If you don't specify a value or values for a key, then an AWS resource with
   * any value for that key is a member.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values A list of tag values that can be included in the tag-based resource group.
   * This is optional. If you don't specify a value or values for a key, then an AWS resource with
   * any value for that key is a member.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnGroup.TagFilterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
