@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

@CdkDslMarker
public class CfnScheduledQueryTimestreamConfigurationPropertyDsl {
  private val cdkBuilder: CfnScheduledQuery.TimestreamConfigurationProperty.Builder =
      CfnScheduledQuery.TimestreamConfigurationProperty.builder()

  private val _dimensionMappings: MutableList<Any> = mutableListOf()

  private val _mixedMeasureMappings: MutableList<Any> = mutableListOf()

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun dimensionMappings(vararg dimensionMappings: Any) {
    _dimensionMappings.addAll(listOf(*dimensionMappings))
  }

  public fun dimensionMappings(dimensionMappings: Collection<Any>) {
    _dimensionMappings.addAll(dimensionMappings)
  }

  public fun dimensionMappings(dimensionMappings: IResolvable) {
    cdkBuilder.dimensionMappings(dimensionMappings)
  }

  public fun measureNameColumn(measureNameColumn: String) {
    cdkBuilder.measureNameColumn(measureNameColumn)
  }

  public fun mixedMeasureMappings(vararg mixedMeasureMappings: Any) {
    _mixedMeasureMappings.addAll(listOf(*mixedMeasureMappings))
  }

  public fun mixedMeasureMappings(mixedMeasureMappings: Collection<Any>) {
    _mixedMeasureMappings.addAll(mixedMeasureMappings)
  }

  public fun mixedMeasureMappings(mixedMeasureMappings: IResolvable) {
    cdkBuilder.mixedMeasureMappings(mixedMeasureMappings)
  }

  public fun multiMeasureMappings(multiMeasureMappings: IResolvable) {
    cdkBuilder.multiMeasureMappings(multiMeasureMappings)
  }

  public
      fun multiMeasureMappings(multiMeasureMappings: CfnScheduledQuery.MultiMeasureMappingsProperty) {
    cdkBuilder.multiMeasureMappings(multiMeasureMappings)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun timeColumn(timeColumn: String) {
    cdkBuilder.timeColumn(timeColumn)
  }

  public fun build(): CfnScheduledQuery.TimestreamConfigurationProperty {
    if(_dimensionMappings.isNotEmpty()) cdkBuilder.dimensionMappings(_dimensionMappings)
    if(_mixedMeasureMappings.isNotEmpty()) cdkBuilder.mixedMeasureMappings(_mixedMeasureMappings)
    return cdkBuilder.build()
  }
}
