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
public class CfnAnalysisDataLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataLabelOptionsProperty.Builder =
      CfnAnalysis.DataLabelOptionsProperty.builder()

  private val _dataLabelTypes: MutableList<Any> = mutableListOf()

  public fun categoryLabelVisibility(categoryLabelVisibility: String) {
    cdkBuilder.categoryLabelVisibility(categoryLabelVisibility)
  }

  public fun dataLabelTypes(vararg dataLabelTypes: Any) {
    _dataLabelTypes.addAll(listOf(*dataLabelTypes))
  }

  public fun dataLabelTypes(dataLabelTypes: Collection<Any>) {
    _dataLabelTypes.addAll(dataLabelTypes)
  }

  public fun dataLabelTypes(dataLabelTypes: IResolvable) {
    cdkBuilder.dataLabelTypes(dataLabelTypes)
  }

  public fun labelColor(labelColor: String) {
    cdkBuilder.labelColor(labelColor)
  }

  public fun labelContent(labelContent: String) {
    cdkBuilder.labelContent(labelContent)
  }

  public fun labelFontConfiguration(labelFontConfiguration: IResolvable) {
    cdkBuilder.labelFontConfiguration(labelFontConfiguration)
  }

  public fun labelFontConfiguration(labelFontConfiguration: CfnAnalysis.FontConfigurationProperty) {
    cdkBuilder.labelFontConfiguration(labelFontConfiguration)
  }

  public fun measureLabelVisibility(measureLabelVisibility: String) {
    cdkBuilder.measureLabelVisibility(measureLabelVisibility)
  }

  public fun overlap(overlap: String) {
    cdkBuilder.overlap(overlap)
  }

  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  public fun totalsVisibility(totalsVisibility: String) {
    cdkBuilder.totalsVisibility(totalsVisibility)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.DataLabelOptionsProperty {
    if(_dataLabelTypes.isNotEmpty()) cdkBuilder.dataLabelTypes(_dataLabelTypes)
    return cdkBuilder.build()
  }
}
