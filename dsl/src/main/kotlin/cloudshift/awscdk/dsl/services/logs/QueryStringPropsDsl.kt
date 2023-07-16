@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.QueryStringProps

@CdkDslMarker
public class QueryStringPropsDsl {
  private val cdkBuilder: QueryStringProps.Builder = QueryStringProps.builder()

  private val _fields: MutableList<String> = mutableListOf()

  private val _filterStatements: MutableList<String> = mutableListOf()

  private val _parseStatements: MutableList<String> = mutableListOf()

  public fun display(display: String) {
    cdkBuilder.display(display)
  }

  public fun fields(vararg fields: String) {
    _fields.addAll(listOf(*fields))
  }

  public fun fields(fields: Collection<String>) {
    _fields.addAll(fields)
  }

  public fun filter(filter: String) {
    cdkBuilder.filter(filter)
  }

  public fun filterStatements(vararg filterStatements: String) {
    _filterStatements.addAll(listOf(*filterStatements))
  }

  public fun filterStatements(filterStatements: Collection<String>) {
    _filterStatements.addAll(filterStatements)
  }

  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  public fun parse(parse: String) {
    cdkBuilder.parse(parse)
  }

  public fun parseStatements(vararg parseStatements: String) {
    _parseStatements.addAll(listOf(*parseStatements))
  }

  public fun parseStatements(parseStatements: Collection<String>) {
    _parseStatements.addAll(parseStatements)
  }

  public fun sort(sort: String) {
    cdkBuilder.sort(sort)
  }

  public fun stats(stats: String) {
    cdkBuilder.stats(stats)
  }

  public fun build(): QueryStringProps {
    if(_fields.isNotEmpty()) cdkBuilder.fields(_fields)
    if(_filterStatements.isNotEmpty()) cdkBuilder.filterStatements(_filterStatements)
    if(_parseStatements.isNotEmpty()) cdkBuilder.parseStatements(_parseStatements)
    return cdkBuilder.build()
  }
}
