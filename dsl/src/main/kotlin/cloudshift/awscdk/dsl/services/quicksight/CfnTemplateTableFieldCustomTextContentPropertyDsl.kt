@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableFieldCustomTextContentPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldCustomTextContentProperty.Builder =
      CfnTemplate.TableFieldCustomTextContentProperty.builder()

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
  public fun fontConfiguration(fontConfiguration: CfnTemplate.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param value The string value of the custom text content for the table URL link content.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.TableFieldCustomTextContentProperty = cdkBuilder.build()
}
