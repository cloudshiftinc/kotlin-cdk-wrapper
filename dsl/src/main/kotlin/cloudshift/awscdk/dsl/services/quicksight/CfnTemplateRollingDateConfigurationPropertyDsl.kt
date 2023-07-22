@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRollingDateConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.RollingDateConfigurationProperty.Builder =
      CfnTemplate.RollingDateConfigurationProperty.builder()

  /**
   * @param dataSetIdentifier The data set that is used in the rolling date configuration.
   */
  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  /**
   * @param expression The expression of the rolling date configuration. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnTemplate.RollingDateConfigurationProperty = cdkBuilder.build()
}
