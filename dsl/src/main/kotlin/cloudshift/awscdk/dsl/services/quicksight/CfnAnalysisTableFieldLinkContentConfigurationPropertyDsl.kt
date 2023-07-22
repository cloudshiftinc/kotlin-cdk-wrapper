@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableFieldLinkContentConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableFieldLinkContentConfigurationProperty.Builder =
      CfnAnalysis.TableFieldLinkContentConfigurationProperty.builder()

  /**
   * @param customIconContent The custom icon content for the table link content configuration.
   */
  public fun customIconContent(customIconContent: IResolvable) {
    cdkBuilder.customIconContent(customIconContent)
  }

  /**
   * @param customIconContent The custom icon content for the table link content configuration.
   */
  public fun customIconContent(customIconContent: CfnAnalysis.TableFieldCustomIconContentProperty) {
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
  public fun customTextContent(customTextContent: CfnAnalysis.TableFieldCustomTextContentProperty) {
    cdkBuilder.customTextContent(customTextContent)
  }

  public fun build(): CfnAnalysis.TableFieldLinkContentConfigurationProperty = cdkBuilder.build()
}
