@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

@CdkDslMarker
public class CfnDataQualityJobDefinitionCsvPropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.CsvProperty.Builder =
      CfnDataQualityJobDefinition.CsvProperty.builder()

  public fun `header`(`header`: Boolean) {
    cdkBuilder.`header`(`header`)
  }

  public fun `header`(`header`: IResolvable) {
    cdkBuilder.`header`(`header`)
  }

  public fun build(): CfnDataQualityJobDefinition.CsvProperty = cdkBuilder.build()
}
