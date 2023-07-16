@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTableFieldLinkContentConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableFieldLinkContentConfigurationProperty.Builder =
      CfnTemplate.TableFieldLinkContentConfigurationProperty.builder()

  public fun customIconContent(customIconContent: IResolvable) {
    cdkBuilder.customIconContent(customIconContent)
  }

  public fun customIconContent(customIconContent: CfnTemplate.TableFieldCustomIconContentProperty) {
    cdkBuilder.customIconContent(customIconContent)
  }

  public fun customTextContent(customTextContent: IResolvable) {
    cdkBuilder.customTextContent(customTextContent)
  }

  public fun customTextContent(customTextContent: CfnTemplate.TableFieldCustomTextContentProperty) {
    cdkBuilder.customTextContent(customTextContent)
  }

  public fun build(): CfnTemplate.TableFieldLinkContentConfigurationProperty = cdkBuilder.build()
}
