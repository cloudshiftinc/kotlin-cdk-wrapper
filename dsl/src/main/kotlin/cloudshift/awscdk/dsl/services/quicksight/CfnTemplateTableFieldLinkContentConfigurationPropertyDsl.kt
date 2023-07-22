@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableFieldLinkContentConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldLinkContentConfigurationProperty.Builder =
      CfnTemplate.TableFieldLinkContentConfigurationProperty.builder()

  /**
   * @param customIconContent The custom icon content for the table link content configuration.
   */
  public fun customIconContent(customIconContent: IResolvable) {
    cdkBuilder.customIconContent(customIconContent)
  }

  /**
   * @param customIconContent The custom icon content for the table link content configuration.
   */
  public fun customIconContent(customIconContent: CfnTemplate.TableFieldCustomIconContentProperty) {
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
  public fun customTextContent(customTextContent: CfnTemplate.TableFieldCustomTextContentProperty) {
    cdkBuilder.customTextContent(customTextContent)
  }

  public fun build(): CfnTemplate.TableFieldLinkContentConfigurationProperty = cdkBuilder.build()
}
