@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@CdkDslMarker
public class CfnTrailDataResourcePropertyDsl {
  private val cdkBuilder: CfnTrail.DataResourceProperty.Builder =
      CfnTrail.DataResourceProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnTrail.DataResourceProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
