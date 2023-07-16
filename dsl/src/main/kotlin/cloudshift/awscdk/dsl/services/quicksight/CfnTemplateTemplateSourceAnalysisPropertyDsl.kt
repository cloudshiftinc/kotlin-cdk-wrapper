@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTemplateSourceAnalysisPropertyDsl {
  private val cdkBuilder: CfnTemplate.TemplateSourceAnalysisProperty.Builder =
      CfnTemplate.TemplateSourceAnalysisProperty.builder()

  private val _dataSetReferences: MutableList<Any> = mutableListOf()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun dataSetReferences(vararg dataSetReferences: Any) {
    _dataSetReferences.addAll(listOf(*dataSetReferences))
  }

  public fun dataSetReferences(dataSetReferences: Collection<Any>) {
    _dataSetReferences.addAll(dataSetReferences)
  }

  public fun dataSetReferences(dataSetReferences: IResolvable) {
    cdkBuilder.dataSetReferences(dataSetReferences)
  }

  public fun build(): CfnTemplate.TemplateSourceAnalysisProperty {
    if(_dataSetReferences.isNotEmpty()) cdkBuilder.dataSetReferences(_dataSetReferences)
    return cdkBuilder.build()
  }
}
