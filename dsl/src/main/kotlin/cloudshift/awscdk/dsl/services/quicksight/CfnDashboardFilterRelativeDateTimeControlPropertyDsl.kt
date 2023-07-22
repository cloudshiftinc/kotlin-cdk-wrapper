@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilterRelativeDateTimeControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilterRelativeDateTimeControlProperty.Builder =
      CfnDashboard.FilterRelativeDateTimeControlProperty.builder()

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param displayOptions The display options of a control.
   */
  public
      fun displayOptions(displayOptions: CfnDashboard.RelativeDateTimeControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param filterControlId The ID of the `FilterTextAreaControl` . 
   */
  public fun filterControlId(filterControlId: String) {
    cdkBuilder.filterControlId(filterControlId)
  }

  /**
   * @param sourceFilterId The source filter ID of the `FilterTextAreaControl` . 
   */
  public fun sourceFilterId(sourceFilterId: String) {
    cdkBuilder.sourceFilterId(sourceFilterId)
  }

  /**
   * @param title The title of the `FilterTextAreaControl` . 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnDashboard.FilterRelativeDateTimeControlProperty = cdkBuilder.build()
}
