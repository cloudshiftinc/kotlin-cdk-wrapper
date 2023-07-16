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
public class CfnAnalysisIntegerParameterDeclarationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.IntegerParameterDeclarationProperty.Builder =
      CfnAnalysis.IntegerParameterDeclarationProperty.builder()

  private val _mappedDataSetParameters: MutableList<Any> = mutableListOf()

  public fun defaultValues(defaultValues: IResolvable) {
    cdkBuilder.defaultValues(defaultValues)
  }

  public fun defaultValues(defaultValues: CfnAnalysis.IntegerDefaultValuesProperty) {
    cdkBuilder.defaultValues(defaultValues)
  }

  public fun mappedDataSetParameters(vararg mappedDataSetParameters: Any) {
    _mappedDataSetParameters.addAll(listOf(*mappedDataSetParameters))
  }

  public fun mappedDataSetParameters(mappedDataSetParameters: Collection<Any>) {
    _mappedDataSetParameters.addAll(mappedDataSetParameters)
  }

  public fun mappedDataSetParameters(mappedDataSetParameters: IResolvable) {
    cdkBuilder.mappedDataSetParameters(mappedDataSetParameters)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parameterValueType(parameterValueType: String) {
    cdkBuilder.parameterValueType(parameterValueType)
  }

  public fun valueWhenUnset(valueWhenUnset: IResolvable) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  public
      fun valueWhenUnset(valueWhenUnset: CfnAnalysis.IntegerValueWhenUnsetConfigurationProperty) {
    cdkBuilder.valueWhenUnset(valueWhenUnset)
  }

  public fun build(): CfnAnalysis.IntegerParameterDeclarationProperty {
    if(_mappedDataSetParameters.isNotEmpty())
        cdkBuilder.mappedDataSetParameters(_mappedDataSetParameters)
    return cdkBuilder.build()
  }
}
