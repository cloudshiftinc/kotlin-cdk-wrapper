@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.amazon.awscdk.services.inspectorv2.CfnFilterProps

@CdkDslMarker
public class CfnFilterPropsDsl {
  private val cdkBuilder: CfnFilterProps.Builder = CfnFilterProps.builder()

  /**
   * @param description A description of the filter.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param filterAction The action that is to be applied to the findings that match the filter. 
   */
  public fun filterAction(filterAction: String) {
    cdkBuilder.filterAction(filterAction)
  }

  /**
   * @param filterCriteria Details on the filter criteria associated with this filter. 
   */
  public fun filterCriteria(filterCriteria: IResolvable) {
    cdkBuilder.filterCriteria(filterCriteria)
  }

  /**
   * @param filterCriteria Details on the filter criteria associated with this filter. 
   */
  public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty) {
    cdkBuilder.filterCriteria(filterCriteria)
  }

  /**
   * @param name The name of the filter. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnFilterProps = cdkBuilder.build()
}
