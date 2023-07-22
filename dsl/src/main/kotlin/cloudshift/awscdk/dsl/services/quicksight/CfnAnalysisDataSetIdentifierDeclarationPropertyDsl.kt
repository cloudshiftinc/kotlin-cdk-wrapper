@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A data set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSetIdentifierDeclarationProperty dataSetIdentifierDeclarationProperty =
 * DataSetIdentifierDeclarationProperty.builder()
 * .dataSetArn("dataSetArn")
 * .identifier("identifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-datasetidentifierdeclaration.html)
 */
@CdkDslMarker
public class CfnAnalysisDataSetIdentifierDeclarationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataSetIdentifierDeclarationProperty.Builder =
      CfnAnalysis.DataSetIdentifierDeclarationProperty.builder()

  /**
   * @param dataSetArn The Amazon Resource Name (ARN) of the data set. 
   */
  public fun dataSetArn(dataSetArn: String) {
    cdkBuilder.dataSetArn(dataSetArn)
  }

  /**
   * @param identifier The identifier of the data set, typically the data set's name. 
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun build(): CfnAnalysis.DataSetIdentifierDeclarationProperty = cdkBuilder.build()
}
