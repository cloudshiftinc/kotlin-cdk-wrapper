@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnView

/**
 * An object with a `FilterString` that specifies which resources to include in the results of
 * queries made using this view.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * FiltersProperty filtersProperty = FiltersProperty.builder()
 * .filterString("filterString")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-filters.html)
 */
@CdkDslMarker
public class CfnViewFiltersPropertyDsl {
  private val cdkBuilder: CfnView.FiltersProperty.Builder = CfnView.FiltersProperty.builder()

  /**
   * @param filterString the value to be set. 
   */
  public fun filterString(filterString: String) {
    cdkBuilder.filterString(filterString)
  }

  public fun build(): CfnView.FiltersProperty = cdkBuilder.build()
}
