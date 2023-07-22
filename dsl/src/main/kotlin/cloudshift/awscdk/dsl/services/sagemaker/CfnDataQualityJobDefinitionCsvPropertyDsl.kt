@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * The CSV format.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CsvProperty csvProperty = CsvProperty.builder()
 * .header(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-csv.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionCsvPropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.CsvProperty.Builder =
      CfnDataQualityJobDefinition.CsvProperty.builder()

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

  public fun build(): CfnDataQualityJobDefinition.CsvProperty = cdkBuilder.build()
}
