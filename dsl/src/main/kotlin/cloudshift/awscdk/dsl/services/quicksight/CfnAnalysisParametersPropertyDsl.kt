@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A list of Amazon QuickSight parameters and the list's override values.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParametersProperty parametersProperty = ParametersProperty.builder()
 * .dateTimeParameters(List.of(DateTimeParameterProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .decimalParameters(List.of(DecimalParameterProperty.builder()
 * .name("name")
 * .values(List.of(123))
 * .build()))
 * .integerParameters(List.of(IntegerParameterProperty.builder()
 * .name("name")
 * .values(List.of(123))
 * .build()))
 * .stringParameters(List.of(StringParameterProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-parameters.html)
 */
@CdkDslMarker
public class CfnAnalysisParametersPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ParametersProperty.Builder =
      CfnAnalysis.ParametersProperty.builder()

  private val _dateTimeParameters: MutableList<Any> = mutableListOf()

  private val _decimalParameters: MutableList<Any> = mutableListOf()

  private val _integerParameters: MutableList<Any> = mutableListOf()

  private val _stringParameters: MutableList<Any> = mutableListOf()

  /**
   * @param dateTimeParameters The parameters that have a data type of date-time.
   */
  public fun dateTimeParameters(vararg dateTimeParameters: Any) {
    _dateTimeParameters.addAll(listOf(*dateTimeParameters))
  }

  /**
   * @param dateTimeParameters The parameters that have a data type of date-time.
   */
  public fun dateTimeParameters(dateTimeParameters: Collection<Any>) {
    _dateTimeParameters.addAll(dateTimeParameters)
  }

  /**
   * @param dateTimeParameters The parameters that have a data type of date-time.
   */
  public fun dateTimeParameters(dateTimeParameters: IResolvable) {
    cdkBuilder.dateTimeParameters(dateTimeParameters)
  }

  /**
   * @param decimalParameters The parameters that have a data type of decimal.
   */
  public fun decimalParameters(vararg decimalParameters: Any) {
    _decimalParameters.addAll(listOf(*decimalParameters))
  }

  /**
   * @param decimalParameters The parameters that have a data type of decimal.
   */
  public fun decimalParameters(decimalParameters: Collection<Any>) {
    _decimalParameters.addAll(decimalParameters)
  }

  /**
   * @param decimalParameters The parameters that have a data type of decimal.
   */
  public fun decimalParameters(decimalParameters: IResolvable) {
    cdkBuilder.decimalParameters(decimalParameters)
  }

  /**
   * @param integerParameters The parameters that have a data type of integer.
   */
  public fun integerParameters(vararg integerParameters: Any) {
    _integerParameters.addAll(listOf(*integerParameters))
  }

  /**
   * @param integerParameters The parameters that have a data type of integer.
   */
  public fun integerParameters(integerParameters: Collection<Any>) {
    _integerParameters.addAll(integerParameters)
  }

  /**
   * @param integerParameters The parameters that have a data type of integer.
   */
  public fun integerParameters(integerParameters: IResolvable) {
    cdkBuilder.integerParameters(integerParameters)
  }

  /**
   * @param stringParameters The parameters that have a data type of string.
   */
  public fun stringParameters(vararg stringParameters: Any) {
    _stringParameters.addAll(listOf(*stringParameters))
  }

  /**
   * @param stringParameters The parameters that have a data type of string.
   */
  public fun stringParameters(stringParameters: Collection<Any>) {
    _stringParameters.addAll(stringParameters)
  }

  /**
   * @param stringParameters The parameters that have a data type of string.
   */
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
