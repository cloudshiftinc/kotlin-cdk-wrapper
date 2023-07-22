@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableFieldLinkContentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableFieldLinkContentConfigurationProperty.Builder =
      CfnDashboard.TableFieldLinkContentConfigurationProperty.builder()

  /**
   * @param customIconContent The custom icon content for the table link content configuration.
   */
  public fun customIconContent(customIconContent: IResolvable) {
    cdkBuilder.customIconContent(customIconContent)
  }

  /**
   * @param customIconContent The custom icon content for the table link content configuration.
   */
  public
      fun customIconContent(customIconContent: CfnDashboard.TableFieldCustomIconContentProperty) {
    cdkBuilder.customIconContent(customIconContent)
  }

  /**
   * @param customTextContent The custom text content (value, font configuration) for the table link
   * content configuration.
   */
  public fun customTextContent(customTextContent: IResolvable) {
    cdkBuilder.customTextContent(customTextContent)
  }

  /**
   * @param customTextContent The custom text content (value, font configuration) for the table link
   * content configuration.
   */
  public
      fun customTextContent(customTextContent: CfnDashboard.TableFieldCustomTextContentProperty) {
    cdkBuilder.customTextContent(customTextContent)
  }

  public fun build(): CfnDashboard.TableFieldLinkContentConfigurationProperty = cdkBuilder.build()
}
