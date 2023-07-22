@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateReferenceLineValueLabelConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ReferenceLineValueLabelConfigurationProperty.Builder =
      CfnTemplate.ReferenceLineValueLabelConfigurationProperty.builder()

  /**
   * @param formatConfiguration The format configuration of the value label.
   */
  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param formatConfiguration The format configuration of the value label.
   */
  public
      fun formatConfiguration(formatConfiguration: CfnTemplate.NumericFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param relativePosition The relative position of the value label. Choose one of the following
   * options:.
   * * `BEFORE_CUSTOM_LABEL`
   * * `AFTER_CUSTOM_LABEL`
   */
  public fun relativePosition(relativePosition: String) {
    cdkBuilder.relativePosition(relativePosition)
  }

  public fun build(): CfnTemplate.ReferenceLineValueLabelConfigurationProperty = cdkBuilder.build()
}
