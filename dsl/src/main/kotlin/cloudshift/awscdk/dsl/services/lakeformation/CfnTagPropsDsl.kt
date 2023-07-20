@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lakeformation.CfnTagProps

@CdkDslMarker
public class CfnTagPropsDsl {
  private val cdkBuilder: CfnTagProps.Builder = CfnTagProps.builder()

  private val _tagValues: MutableList<String> = mutableListOf()

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun tagKey(tagKey: String) {
    cdkBuilder.tagKey(tagKey)
  }

  public fun tagValues(vararg tagValues: String) {
    _tagValues.addAll(listOf(*tagValues))
  }

  public fun tagValues(tagValues: Collection<String>) {
    _tagValues.addAll(tagValues)
  }

  public fun build(): CfnTagProps {
    if(_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
    return cdkBuilder.build()
  }
}
