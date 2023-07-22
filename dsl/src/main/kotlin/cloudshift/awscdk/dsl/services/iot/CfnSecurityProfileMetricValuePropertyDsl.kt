@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * The value to be compared with the `metric` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * MetricValueProperty metricValueProperty = MetricValueProperty.builder()
 * .cidrs(List.of("cidrs"))
 * .count("count")
 * .number(123)
 * .numbers(List.of(123))
 * .ports(List.of(123))
 * .strings(List.of("strings"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricvalue.html)
 */
@CdkDslMarker
public class CfnSecurityProfileMetricValuePropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.MetricValueProperty.Builder =
      CfnSecurityProfile.MetricValueProperty.builder()

  private val _cidrs: MutableList<String> = mutableListOf()

  private val _numbers: MutableList<Number> = mutableListOf()

  private val _ports: MutableList<Number> = mutableListOf()

  private val _strings: MutableList<String> = mutableListOf()

  /**
   * @param cidrs If the `comparisonOperator` calls for a set of CIDRs, use this to specify that set
   * to be compared with the `metric` .
   */
  public fun cidrs(vararg cidrs: String) {
    _cidrs.addAll(listOf(*cidrs))
  }

  /**
   * @param cidrs If the `comparisonOperator` calls for a set of CIDRs, use this to specify that set
   * to be compared with the `metric` .
   */
  public fun cidrs(cidrs: Collection<String>) {
    _cidrs.addAll(cidrs)
  }

  /**
   * @param count If the `comparisonOperator` calls for a numeric value, use this to specify that
   * numeric value to be compared with the `metric` .
   */
  public fun count(count: String) {
    cdkBuilder.count(count)
  }

  /**
   * @param number The numeric values of a metric.
   */
  public fun number(number: Number) {
    cdkBuilder.number(number)
  }

  /**
   * @param numbers The numeric value of a metric.
   */
  public fun numbers(vararg numbers: Number) {
    _numbers.addAll(listOf(*numbers))
  }

  /**
   * @param numbers The numeric value of a metric.
   */
  public fun numbers(numbers: Collection<Number>) {
    _numbers.addAll(numbers)
  }

  /**
   * @param numbers The numeric value of a metric.
   */
  public fun numbers(numbers: IResolvable) {
    cdkBuilder.numbers(numbers)
  }

  /**
   * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that set
   * to be compared with the `metric` .
   */
  public fun ports(vararg ports: Number) {
    _ports.addAll(listOf(*ports))
  }

  /**
   * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that set
   * to be compared with the `metric` .
   */
  public fun ports(ports: Collection<Number>) {
    _ports.addAll(ports)
  }

  /**
   * @param ports If the `comparisonOperator` calls for a set of ports, use this to specify that set
   * to be compared with the `metric` .
   */
  public fun ports(ports: IResolvable) {
    cdkBuilder.ports(ports)
  }

  /**
   * @param strings The string values of a metric.
   */
  public fun strings(vararg strings: String) {
    _strings.addAll(listOf(*strings))
  }

  /**
   * @param strings The string values of a metric.
   */
  public fun strings(strings: Collection<String>) {
    _strings.addAll(strings)
  }

  public fun build(): CfnSecurityProfile.MetricValueProperty {
    if(_cidrs.isNotEmpty()) cdkBuilder.cidrs(_cidrs)
    if(_numbers.isNotEmpty()) cdkBuilder.numbers(_numbers)
    if(_ports.isNotEmpty()) cdkBuilder.ports(_ports)
    if(_strings.isNotEmpty()) cdkBuilder.strings(_strings)
    return cdkBuilder.build()
  }
}
