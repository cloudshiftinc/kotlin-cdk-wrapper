@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisReferenceLineDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ReferenceLineDataConfigurationProperty.Builder =
      CfnAnalysis.ReferenceLineDataConfigurationProperty.builder()

  /**
   * @param axisBinding The axis binding type of the reference line. Choose one of the following
   * options:.
   * * PrimaryY
   * * SecondaryY
   */
  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  /**
   * @param dynamicConfiguration The dynamic configuration of the reference line data configuration.
   */
  public fun dynamicConfiguration(dynamicConfiguration: IResolvable) {
    cdkBuilder.dynamicConfiguration(dynamicConfiguration)
  }

  /**
   * @param dynamicConfiguration The dynamic configuration of the reference line data configuration.
   */
  public
      fun dynamicConfiguration(dynamicConfiguration: CfnAnalysis.ReferenceLineDynamicDataConfigurationProperty) {
    cdkBuilder.dynamicConfiguration(dynamicConfiguration)
  }

  /**
   * @param staticConfiguration The static data configuration of the reference line data
   * configuration.
   */
  public fun staticConfiguration(staticConfiguration: IResolvable) {
    cdkBuilder.staticConfiguration(staticConfiguration)
  }

  /**
   * @param staticConfiguration The static data configuration of the reference line data
   * configuration.
   */
  public
      fun staticConfiguration(staticConfiguration: CfnAnalysis.ReferenceLineStaticDataConfigurationProperty) {
    cdkBuilder.staticConfiguration(staticConfiguration)
  }

  public fun build(): CfnAnalysis.ReferenceLineDataConfigurationProperty = cdkBuilder.build()
}
