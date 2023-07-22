@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAnalysisSourceTemplatePropertyDsl {
  private val cdkBuilder: CfnAnalysis.AnalysisSourceTemplateProperty.Builder =
      CfnAnalysis.AnalysisSourceTemplateProperty.builder()

  private val _dataSetReferences: MutableList<Any> = mutableListOf()

  /**
   * @param arn The Amazon Resource Name (ARN) of the source template of an analysis. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param dataSetReferences The dataset references of the source template of an analysis. 
   */
  public fun dataSetReferences(vararg dataSetReferences: Any) {
    _dataSetReferences.addAll(listOf(*dataSetReferences))
  }

  /**
   * @param dataSetReferences The dataset references of the source template of an analysis. 
   */
  public fun dataSetReferences(dataSetReferences: Collection<Any>) {
    _dataSetReferences.addAll(dataSetReferences)
  }

  /**
   * @param dataSetReferences The dataset references of the source template of an analysis. 
   */
  public fun dataSetReferences(dataSetReferences: IResolvable) {
    cdkBuilder.dataSetReferences(dataSetReferences)
  }

  public fun build(): CfnAnalysis.AnalysisSourceTemplateProperty {
    if(_dataSetReferences.isNotEmpty()) cdkBuilder.dataSetReferences(_dataSetReferences)
    return cdkBuilder.build()
  }
}
