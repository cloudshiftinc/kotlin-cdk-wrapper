@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@CdkDslMarker
public class CfnTrailAdvancedEventSelectorPropertyDsl {
  private val cdkBuilder: CfnTrail.AdvancedEventSelectorProperty.Builder =
      CfnTrail.AdvancedEventSelectorProperty.builder()

  private val _fieldSelectors: MutableList<Any> = mutableListOf()

  public fun fieldSelectors(vararg fieldSelectors: Any) {
    _fieldSelectors.addAll(listOf(*fieldSelectors))
  }

  public fun fieldSelectors(fieldSelectors: Collection<Any>) {
    _fieldSelectors.addAll(fieldSelectors)
  }

  public fun fieldSelectors(fieldSelectors: IResolvable) {
    cdkBuilder.fieldSelectors(fieldSelectors)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnTrail.AdvancedEventSelectorProperty {
    if(_fieldSelectors.isNotEmpty()) cdkBuilder.fieldSelectors(_fieldSelectors)
    return cdkBuilder.build()
  }
}
