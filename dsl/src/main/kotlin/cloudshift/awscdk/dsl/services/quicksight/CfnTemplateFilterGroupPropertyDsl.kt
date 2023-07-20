@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterGroupPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterGroupProperty.Builder =
      CfnTemplate.FilterGroupProperty.builder()

  private val _filters: MutableList<Any> = mutableListOf()

  public fun crossDataset(crossDataset: String) {
    cdkBuilder.crossDataset(crossDataset)
  }

  public fun filterGroupId(filterGroupId: String) {
    cdkBuilder.filterGroupId(filterGroupId)
  }

  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  public fun scopeConfiguration(scopeConfiguration: IResolvable) {
    cdkBuilder.scopeConfiguration(scopeConfiguration)
  }

  public fun scopeConfiguration(scopeConfiguration: CfnTemplate.FilterScopeConfigurationProperty) {
    cdkBuilder.scopeConfiguration(scopeConfiguration)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnTemplate.FilterGroupProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
