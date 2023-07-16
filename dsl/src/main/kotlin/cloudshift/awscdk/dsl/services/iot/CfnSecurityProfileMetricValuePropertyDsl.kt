@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@CdkDslMarker
public class CfnSecurityProfileMetricValuePropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.MetricValueProperty.Builder =
      CfnSecurityProfile.MetricValueProperty.builder()

  private val _cidrs: MutableList<String> = mutableListOf()

  private val _numbers: MutableList<Number> = mutableListOf()

  private val _ports: MutableList<Number> = mutableListOf()

  private val _strings: MutableList<String> = mutableListOf()

  public fun cidrs(vararg cidrs: String) {
    _cidrs.addAll(listOf(*cidrs))
  }

  public fun cidrs(cidrs: Collection<String>) {
    _cidrs.addAll(cidrs)
  }

  public fun count(count: String) {
    cdkBuilder.count(count)
  }

  public fun number(number: Number) {
    cdkBuilder.number(number)
  }

  public fun numbers(vararg numbers: Number) {
    _numbers.addAll(listOf(*numbers))
  }

  public fun numbers(numbers: Collection<Number>) {
    _numbers.addAll(numbers)
  }

  public fun numbers(numbers: IResolvable) {
    cdkBuilder.numbers(numbers)
  }

  public fun ports(vararg ports: Number) {
    _ports.addAll(listOf(*ports))
  }

  public fun ports(ports: Collection<Number>) {
    _ports.addAll(ports)
  }

  public fun ports(ports: IResolvable) {
    cdkBuilder.ports(ports)
  }

  public fun strings(vararg strings: String) {
    _strings.addAll(listOf(*strings))
  }

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
