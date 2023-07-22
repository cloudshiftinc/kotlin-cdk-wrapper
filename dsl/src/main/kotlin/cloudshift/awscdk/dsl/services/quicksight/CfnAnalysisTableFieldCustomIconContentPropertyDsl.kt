@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableFieldCustomIconContentPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableFieldCustomIconContentProperty.Builder =
      CfnAnalysis.TableFieldCustomIconContentProperty.builder()

  /**
   * @param icon The icon set type (link) of the custom icon content for table URL link content.
   */
  public fun icon(icon: String) {
    cdkBuilder.icon(icon)
  }

  public fun build(): CfnAnalysis.TableFieldCustomIconContentProperty = cdkBuilder.build()
}
