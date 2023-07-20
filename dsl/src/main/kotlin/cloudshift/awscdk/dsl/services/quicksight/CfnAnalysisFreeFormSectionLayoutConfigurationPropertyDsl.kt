@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFreeFormSectionLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FreeFormSectionLayoutConfigurationProperty.Builder =
      CfnAnalysis.FreeFormSectionLayoutConfigurationProperty.builder()

  private val _elements: MutableList<Any> = mutableListOf()

  public fun elements(vararg elements: Any) {
    _elements.addAll(listOf(*elements))
  }

  public fun elements(elements: Collection<Any>) {
    _elements.addAll(elements)
  }

  public fun elements(elements: IResolvable) {
    cdkBuilder.elements(elements)
  }

  public fun build(): CfnAnalysis.FreeFormSectionLayoutConfigurationProperty {
    if(_elements.isNotEmpty()) cdkBuilder.elements(_elements)
    return cdkBuilder.build()
  }
}
