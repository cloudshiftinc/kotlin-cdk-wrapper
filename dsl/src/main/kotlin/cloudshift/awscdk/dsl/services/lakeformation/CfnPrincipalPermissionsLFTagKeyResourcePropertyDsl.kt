@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsLFTagKeyResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.LFTagKeyResourceProperty.Builder =
      CfnPrincipalPermissions.LFTagKeyResourceProperty.builder()

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

  public fun build(): CfnPrincipalPermissions.LFTagKeyResourceProperty {
    if(_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
    return cdkBuilder.build()
  }
}
