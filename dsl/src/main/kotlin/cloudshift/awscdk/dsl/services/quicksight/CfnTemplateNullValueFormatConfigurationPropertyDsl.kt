@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNullValueFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.NullValueFormatConfigurationProperty.Builder =
      CfnTemplate.NullValueFormatConfigurationProperty.builder()

  /**
   * @param nullString Determines the null string of null values. 
   */
  public fun nullString(nullString: String) {
    cdkBuilder.nullString(nullString)
  }

  public fun build(): CfnTemplate.NullValueFormatConfigurationProperty = cdkBuilder.build()
}
