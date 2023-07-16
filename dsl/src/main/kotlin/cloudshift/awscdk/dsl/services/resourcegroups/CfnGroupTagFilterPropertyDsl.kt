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

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnGroup.TagFilterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
