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

  public fun `header`(`header`: Boolean) {
    cdkBuilder.`header`(`header`)
  }

  public fun `header`(`header`: IResolvable) {
    cdkBuilder.`header`(`header`)
  }

  public fun build(): CfnModelExplainabilityJobDefinition.CsvProperty = cdkBuilder.build()
}
