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

  /**
   * @param databaseName Name of Timestream database to which the query result will be written. 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param dimensionMappings This is to allow mapping column(s) from the query result to the
   * dimension in the destination table. 
   */
  public fun dimensionMappings(vararg dimensionMappings: Any) {
    _dimensionMappings.addAll(listOf(*dimensionMappings))
  }

  /**
   * @param dimensionMappings This is to allow mapping column(s) from the query result to the
   * dimension in the destination table. 
   */
  public fun dimensionMappings(dimensionMappings: Collection<Any>) {
    _dimensionMappings.addAll(dimensionMappings)
  }

  /**
   * @param dimensionMappings This is to allow mapping column(s) from the query result to the
   * dimension in the destination table. 
   */
  public fun dimensionMappings(dimensionMappings: IResolvable) {
    cdkBuilder.dimensionMappings(dimensionMappings)
  }

  /**
   * @param measureNameColumn Name of the measure column.
   * Also see `MultiMeasureMappings` and `MixedMeasureMappings` for how measure name properties on
   * those relate to `MeasureNameColumn` .
   */
  public fun measureNameColumn(measureNameColumn: String) {
    cdkBuilder.measureNameColumn(measureNameColumn)
  }

  /**
   * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
   */
  public fun mixedMeasureMappings(vararg mixedMeasureMappings: Any) {
    _mixedMeasureMappings.addAll(listOf(*mixedMeasureMappings))
  }

  /**
   * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
   */
  public fun mixedMeasureMappings(mixedMeasureMappings: Collection<Any>) {
    _mixedMeasureMappings.addAll(mixedMeasureMappings)
  }

  /**
   * @param mixedMeasureMappings Specifies how to map measures to multi-measure records.
   */
  public fun mixedMeasureMappings(mixedMeasureMappings: IResolvable) {
    cdkBuilder.mixedMeasureMappings(mixedMeasureMappings)
  }

  /**
   * @param multiMeasureMappings Multi-measure mappings.
   */
  public fun multiMeasureMappings(multiMeasureMappings: IResolvable) {
    cdkBuilder.multiMeasureMappings(multiMeasureMappings)
  }

  /**
   * @param multiMeasureMappings Multi-measure mappings.
   */
  public
      fun multiMeasureMappings(multiMeasureMappings: CfnScheduledQuery.MultiMeasureMappingsProperty) {
    cdkBuilder.multiMeasureMappings(multiMeasureMappings)
  }

  /**
   * @param tableName Name of Timestream table that the query result will be written to. 
   * The table should be within the same database that is provided in Timestream configuration.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  /**
   * @param timeColumn Column from query result that should be used as the time column in
   * destination table. 
   * Column type for this should be TIMESTAMP.
   */
  public fun timeColumn(timeColumn: String) {
    cdkBuilder.timeColumn(timeColumn)
  }

  public fun build(): CfnScheduledQuery.TimestreamConfigurationProperty {
    if(_dimensionMappings.isNotEmpty()) cdkBuilder.dimensionMappings(_dimensionMappings)
    if(_mixedMeasureMappings.isNotEmpty()) cdkBuilder.mixedMeasureMappings(_mixedMeasureMappings)
    return cdkBuilder.build()
  }
}
