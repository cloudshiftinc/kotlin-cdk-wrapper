@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisStringParameterPropertyDsl {
  private val cdkBuilder: CfnAnalysis.StringParameterProperty.Builder =
      CfnAnalysis.StringParameterProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnAnalysis.StringParameterProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
