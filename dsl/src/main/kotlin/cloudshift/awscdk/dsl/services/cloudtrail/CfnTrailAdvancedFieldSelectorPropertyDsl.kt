@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@CdkDslMarker
public class CfnTrailAdvancedFieldSelectorPropertyDsl {
  private val cdkBuilder: CfnTrail.AdvancedFieldSelectorProperty.Builder =
      CfnTrail.AdvancedFieldSelectorProperty.builder()

  private val _endsWith: MutableList<String> = mutableListOf()

  private val _equalTo: MutableList<String> = mutableListOf()

  private val _notEndsWith: MutableList<String> = mutableListOf()

  private val _notEquals: MutableList<String> = mutableListOf()

  private val _notStartsWith: MutableList<String> = mutableListOf()

  private val _startsWith: MutableList<String> = mutableListOf()

  public fun endsWith(vararg endsWith: String) {
    _endsWith.addAll(listOf(*endsWith))
  }

  public fun endsWith(endsWith: Collection<String>) {
    _endsWith.addAll(endsWith)
  }

  public fun equalTo(vararg equalTo: String) {
    _equalTo.addAll(listOf(*equalTo))
  }

  public fun equalTo(equalTo: Collection<String>) {
    _equalTo.addAll(equalTo)
  }

  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  public fun notEndsWith(vararg notEndsWith: String) {
    _notEndsWith.addAll(listOf(*notEndsWith))
  }

  public fun notEndsWith(notEndsWith: Collection<String>) {
    _notEndsWith.addAll(notEndsWith)
  }

  public fun notEquals(vararg notEquals: String) {
    _notEquals.addAll(listOf(*notEquals))
  }

  public fun notEquals(notEquals: Collection<String>) {
    _notEquals.addAll(notEquals)
  }

  public fun notStartsWith(vararg notStartsWith: String) {
    _notStartsWith.addAll(listOf(*notStartsWith))
  }

  public fun notStartsWith(notStartsWith: Collection<String>) {
    _notStartsWith.addAll(notStartsWith)
  }

  public fun startsWith(vararg startsWith: String) {
    _startsWith.addAll(listOf(*startsWith))
  }

  public fun startsWith(startsWith: Collection<String>) {
    _startsWith.addAll(startsWith)
  }

  public fun build(): CfnTrail.AdvancedFieldSelectorProperty {
    if(_endsWith.isNotEmpty()) cdkBuilder.endsWith(_endsWith)
    if(_equalTo.isNotEmpty()) cdkBuilder.equalTo(_equalTo)
    if(_notEndsWith.isNotEmpty()) cdkBuilder.notEndsWith(_notEndsWith)
    if(_notEquals.isNotEmpty()) cdkBuilder.notEquals(_notEquals)
    if(_notStartsWith.isNotEmpty()) cdkBuilder.notStartsWith(_notStartsWith)
    if(_startsWith.isNotEmpty()) cdkBuilder.startsWith(_startsWith)
    return cdkBuilder.build()
  }
}
