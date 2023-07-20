@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDateTimeFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DateTimeFormatConfigurationProperty.Builder =
      CfnTemplate.DateTimeFormatConfigurationProperty.builder()

  public fun dateTimeFormat(dateTimeFormat: String) {
    cdkBuilder.dateTimeFormat(dateTimeFormat)
  }

  public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public
      fun nullValueFormatConfiguration(nullValueFormatConfiguration: CfnTemplate.NullValueFormatConfigurationProperty) {
    cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
  }

  public fun numericFormatConfiguration(numericFormatConfiguration: IResolvable) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public
      fun numericFormatConfiguration(numericFormatConfiguration: CfnTemplate.NumericFormatConfigurationProperty) {
    cdkBuilder.numericFormatConfiguration(numericFormatConfiguration)
  }

  public fun build(): CfnTemplate.DateTimeFormatConfigurationProperty = cdkBuilder.build()
}
