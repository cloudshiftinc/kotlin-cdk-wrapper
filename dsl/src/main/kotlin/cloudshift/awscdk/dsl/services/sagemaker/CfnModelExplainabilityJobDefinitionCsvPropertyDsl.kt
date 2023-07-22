@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionCsvPropertyDsl {
  private val cdkBuilder: CfnModelExplainabilityJobDefinition.CsvProperty.Builder =
      CfnModelExplainabilityJobDefinition.CsvProperty.builder()

  /**
   * @param header A boolean flag indicating if given CSV has header.
   */
  public fun `header`(`header`: Boolean) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param header A boolean flag indicating if given CSV has header.
   */
  public fun `header`(`header`: IResolvable) {
    cdkBuilder.`header`(`header`)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.CsvProperty = cdkBuilder.build()
}
