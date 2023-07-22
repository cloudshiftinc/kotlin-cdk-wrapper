@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisParameterSelectableValuesPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ParameterSelectableValuesProperty.Builder =
      CfnAnalysis.ParameterSelectableValuesProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param linkToDataSetColumn The column identifier that fetches values from the data set.
   */
  public fun linkToDataSetColumn(linkToDataSetColumn: IResolvable) {
    cdkBuilder.linkToDataSetColumn(linkToDataSetColumn)
  }

  /**
   * @param linkToDataSetColumn The column identifier that fetches values from the data set.
   */
  public fun linkToDataSetColumn(linkToDataSetColumn: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.linkToDataSetColumn(linkToDataSetColumn)
  }

  /**
   * @param values The values that are used in `ParameterSelectableValues` .
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The values that are used in `ParameterSelectableValues` .
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnAnalysis.ParameterSelectableValuesProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
