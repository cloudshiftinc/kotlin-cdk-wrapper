@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisNullValueFormatConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.NullValueFormatConfigurationProperty.Builder =
      CfnAnalysis.NullValueFormatConfigurationProperty.builder()

  public fun nullString(nullString: String) {
    cdkBuilder.nullString(nullString)
  }

  public fun build(): CfnAnalysis.NullValueFormatConfigurationProperty = cdkBuilder.build()
}
