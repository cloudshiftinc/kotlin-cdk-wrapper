@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisReferenceLinePropertyDsl {
  private val cdkBuilder: CfnAnalysis.ReferenceLineProperty.Builder =
      CfnAnalysis.ReferenceLineProperty.builder()

  /**
   * @param dataConfiguration The data configuration of the reference line. 
   */
  public fun dataConfiguration(dataConfiguration: IResolvable) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  /**
   * @param dataConfiguration The data configuration of the reference line. 
   */
  public
      fun dataConfiguration(dataConfiguration: CfnAnalysis.ReferenceLineDataConfigurationProperty) {
    cdkBuilder.dataConfiguration(dataConfiguration)
  }

  /**
   * @param labelConfiguration The label configuration of the reference line.
   */
  public fun labelConfiguration(labelConfiguration: IResolvable) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  /**
   * @param labelConfiguration The label configuration of the reference line.
   */
  public
      fun labelConfiguration(labelConfiguration: CfnAnalysis.ReferenceLineLabelConfigurationProperty) {
    cdkBuilder.labelConfiguration(labelConfiguration)
  }

  /**
   * @param status The status of the reference line. Choose one of the following options:.
   * * `ENABLE`
   * * `DISABLE`
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param styleConfiguration The style configuration of the reference line.
   */
  public fun styleConfiguration(styleConfiguration: IResolvable) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  /**
   * @param styleConfiguration The style configuration of the reference line.
   */
  public
      fun styleConfiguration(styleConfiguration: CfnAnalysis.ReferenceLineStyleConfigurationProperty) {
    cdkBuilder.styleConfiguration(styleConfiguration)
  }

  public fun build(): CfnAnalysis.ReferenceLineProperty = cdkBuilder.build()
}
