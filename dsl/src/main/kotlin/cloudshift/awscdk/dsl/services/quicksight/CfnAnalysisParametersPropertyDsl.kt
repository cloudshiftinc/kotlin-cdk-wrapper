@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisParametersPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ParametersProperty.Builder =
      CfnAnalysis.ParametersProperty.builder()

  private val _dateTimeParameters: MutableList<Any> = mutableListOf()

  private val _decimalParameters: MutableList<Any> = mutableListOf()

  private val _integerParameters: MutableList<Any> = mutableListOf()

  private val _stringParameters: MutableList<Any> = mutableListOf()

  public fun dateTimeParameters(vararg dateTimeParameters: Any) {
    _dateTimeParameters.addAll(listOf(*dateTimeParameters))
  }

  public fun dateTimeParameters(dateTimeParameters: Collection<Any>) {
    _dateTimeParameters.addAll(dateTimeParameters)
  }

  public fun dateTimeParameters(dateTimeParameters: IResolvable) {
    cdkBuilder.dateTimeParameters(dateTimeParameters)
  }

  public fun decimalParameters(vararg decimalParameters: Any) {
    _decimalParameters.addAll(listOf(*decimalParameters))
  }

  public fun decimalParameters(decimalParameters: Collection<Any>) {
    _decimalParameters.addAll(decimalParameters)
  }

  public fun decimalParameters(decimalParameters: IResolvable) {
    cdkBuilder.decimalParameters(decimalParameters)
  }

  public fun integerParameters(vararg integerParameters: Any) {
    _integerParameters.addAll(listOf(*integerParameters))
  }

  public fun integerParameters(integerParameters: Collection<Any>) {
    _integerParameters.addAll(integerParameters)
  }

  public fun integerParameters(integerParameters: IResolvable) {
    cdkBuilder.integerParameters(integerParameters)
  }

  public fun stringParameters(vararg stringParameters: Any) {
    _stringParameters.addAll(listOf(*stringParameters))
  }

  public fun stringParameters(stringParameters: Collection<Any>) {
    _stringParameters.addAll(stringParameters)
  }

  public fun stringParameters(stringParameters: IResolvable) {
    cdkBuilder.stringParameters(stringParameters)
  }

  public fun build(): CfnAnalysis.ParametersProperty {
    if(_dateTimeParameters.isNotEmpty()) cdkBuilder.dateTimeParameters(_dateTimeParameters)
    if(_decimalParameters.isNotEmpty()) cdkBuilder.decimalParameters(_decimalParameters)
    if(_integerParameters.isNotEmpty()) cdkBuilder.integerParameters(_integerParameters)
    if(_stringParameters.isNotEmpty()) cdkBuilder.stringParameters(_stringParameters)
    return cdkBuilder.build()
  }
}
