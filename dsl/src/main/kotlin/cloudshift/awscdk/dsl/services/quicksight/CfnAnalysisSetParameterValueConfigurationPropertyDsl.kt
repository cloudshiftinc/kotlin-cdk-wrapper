@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSetParameterValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SetParameterValueConfigurationProperty.Builder =
      CfnAnalysis.SetParameterValueConfigurationProperty.builder()

  /**
   * @param destinationParameterName The destination parameter name of the
   * `SetParameterValueConfiguration` . 
   */
  public fun destinationParameterName(destinationParameterName: String) {
    cdkBuilder.destinationParameterName(destinationParameterName)
  }

  /**
   * @param value the value to be set. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value the value to be set. 
   */
  public fun `value`(`value`: CfnAnalysis.DestinationParameterValueConfigurationProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.SetParameterValueConfigurationProperty = cdkBuilder.build()
}
