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

  /**
   * @param crossDataset The filter new feature which can apply filter group to all data sets.
   * Choose one of the following options:. 
   * * `ALL_DATASETS`
   * * `SINGLE_DATASET`
   */
  public fun crossDataset(crossDataset: String) {
    cdkBuilder.crossDataset(crossDataset)
  }

  /**
   * @param filterGroupId The value that uniquely identifies a `FilterGroup` within a dashboard,
   * template, or analysis. 
   */
  public fun filterGroupId(filterGroupId: String) {
    cdkBuilder.filterGroupId(filterGroupId)
  }

  /**
   * @param filters The list of filters that are present in a `FilterGroup` . 
   */
  public fun filters(vararg filters: Any) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * @param filters The list of filters that are present in a `FilterGroup` . 
   */
  public fun filters(filters: Collection<Any>) {
    _filters.addAll(filters)
  }

  /**
   * @param filters The list of filters that are present in a `FilterGroup` . 
   */
  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param scopeConfiguration The configuration that specifies what scope to apply to a
   * `FilterGroup` . 
   * This is a union type structure. For this structure to be valid, only one of the attributes can
   * be defined.
   */
  public fun scopeConfiguration(scopeConfiguration: IResolvable) {
    cdkBuilder.scopeConfiguration(scopeConfiguration)
  }

  /**
   * @param scopeConfiguration The configuration that specifies what scope to apply to a
   * `FilterGroup` . 
   * This is a union type structure. For this structure to be valid, only one of the attributes can
   * be defined.
   */
  public fun scopeConfiguration(scopeConfiguration: CfnTemplate.FilterScopeConfigurationProperty) {
    cdkBuilder.scopeConfiguration(scopeConfiguration)
  }

  /**
   * @param status The status of the `FilterGroup` .
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnTemplate.FilterGroupProperty {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
