@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldCustomTextContentPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldCustomTextContentProperty.Builder =
      CfnDashboard.TableFieldCustomTextContentProperty.builder()

  /**
   * @param fontConfiguration The font configuration of the custom text content for the table URL
   * link content. 
   */
  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param fontConfiguration The font configuration of the custom text content for the table URL
   * link content. 
   */
  public fun fontConfiguration(fontConfiguration: CfnDashboard.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param value The string value of the custom text content for the table URL link content.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.TableFieldCustomTextContentProperty = cdkBuilder.build()
}
