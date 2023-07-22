@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTable

@CdkDslMarker
public class CfnTableStorageDescriptorPropertyDsl {
  private val cdkBuilder: CfnTable.StorageDescriptorProperty.Builder =
      CfnTable.StorageDescriptorProperty.builder()

  private val _bucketColumns: MutableList<String> = mutableListOf()

  private val _columns: MutableList<Any> = mutableListOf()

  private val _sortColumns: MutableList<Any> = mutableListOf()

  /**
   * @param bucketColumns A list of reducer grouping columns, clustering columns, and bucketing
   * columns in the table.
   */
  public fun bucketColumns(vararg bucketColumns: String) {
    _bucketColumns.addAll(listOf(*bucketColumns))
  }

  /**
   * @param bucketColumns A list of reducer grouping columns, clustering columns, and bucketing
   * columns in the table.
   */
  public fun bucketColumns(bucketColumns: Collection<String>) {
    _bucketColumns.addAll(bucketColumns)
  }

  /**
   * @param columns A list of the `Columns` in the table.
   */
  public fun columns(vararg columns: Any) {
    _columns.addAll(listOf(*columns))
  }

  /**
   * @param columns A list of the `Columns` in the table.
   */
  public fun columns(columns: Collection<Any>) {
    _columns.addAll(columns)
  }

  /**
   * @param columns A list of the `Columns` in the table.
   */
  public fun columns(columns: IResolvable) {
    cdkBuilder.columns(columns)
  }

  /**
   * @param compressed `True` if the data in the table is compressed, or `False` if not.
   */
  public fun compressed(compressed: Boolean) {
    cdkBuilder.compressed(compressed)
  }

  /**
   * @param compressed `True` if the data in the table is compressed, or `False` if not.
   */
  public fun compressed(compressed: IResolvable) {
    cdkBuilder.compressed(compressed)
  }

  /**
   * @param inputFormat The input format: `SequenceFileInputFormat` (binary), or `TextInputFormat` ,
   * or a custom format.
   */
  public fun inputFormat(inputFormat: String) {
    cdkBuilder.inputFormat(inputFormat)
  }

  /**
   * @param location The physical location of the table.
   * By default, this takes the form of the warehouse location, followed by the database location in
   * the warehouse, followed by the table name.
   */
  public fun location(location: String) {
    cdkBuilder.location(location)
  }

  /**
   * @param numberOfBuckets Must be specified if the table contains any dimension columns.
   */
  public fun numberOfBuckets(numberOfBuckets: Number) {
    cdkBuilder.numberOfBuckets(numberOfBuckets)
  }

  /**
   * @param outputFormat The output format: `SequenceFileOutputFormat` (binary), or
   * `IgnoreKeyTextOutputFormat` , or a custom format.
   */
  public fun outputFormat(outputFormat: String) {
    cdkBuilder.outputFormat(outputFormat)
  }

  /**
   * @param parameters The user-supplied properties in key-value form.
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters The user-supplied properties in key-value form.
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param schemaReference An object that references a schema stored in the AWS Glue Schema
   * Registry.
   */
  public fun schemaReference(schemaReference: IResolvable) {
    cdkBuilder.schemaReference(schemaReference)
  }

  /**
   * @param schemaReference An object that references a schema stored in the AWS Glue Schema
   * Registry.
   */
  public fun schemaReference(schemaReference: CfnTable.SchemaReferenceProperty) {
    cdkBuilder.schemaReference(schemaReference)
  }

  /**
   * @param serdeInfo The serialization/deserialization (SerDe) information.
   */
  public fun serdeInfo(serdeInfo: IResolvable) {
    cdkBuilder.serdeInfo(serdeInfo)
  }

  /**
   * @param serdeInfo The serialization/deserialization (SerDe) information.
   */
  public fun serdeInfo(serdeInfo: CfnTable.SerdeInfoProperty) {
    cdkBuilder.serdeInfo(serdeInfo)
  }

  /**
   * @param skewedInfo The information about values that appear frequently in a column (skewed
   * values).
   */
  public fun skewedInfo(skewedInfo: IResolvable) {
    cdkBuilder.skewedInfo(skewedInfo)
  }

  /**
   * @param skewedInfo The information about values that appear frequently in a column (skewed
   * values).
   */
  public fun skewedInfo(skewedInfo: CfnTable.SkewedInfoProperty) {
    cdkBuilder.skewedInfo(skewedInfo)
  }

  /**
   * @param sortColumns A list specifying the sort order of each bucket in the table.
   */
  public fun sortColumns(vararg sortColumns: Any) {
    _sortColumns.addAll(listOf(*sortColumns))
  }

  /**
   * @param sortColumns A list specifying the sort order of each bucket in the table.
   */
  public fun sortColumns(sortColumns: Collection<Any>) {
    _sortColumns.addAll(sortColumns)
  }

  /**
   * @param sortColumns A list specifying the sort order of each bucket in the table.
   */
  public fun sortColumns(sortColumns: IResolvable) {
    cdkBuilder.sortColumns(sortColumns)
  }

  /**
   * @param storedAsSubDirectories `True` if the table data is stored in subdirectories, or `False`
   * if not.
   */
  public fun storedAsSubDirectories(storedAsSubDirectories: Boolean) {
    cdkBuilder.storedAsSubDirectories(storedAsSubDirectories)
  }

  /**
   * @param storedAsSubDirectories `True` if the table data is stored in subdirectories, or `False`
   * if not.
   */
  public fun storedAsSubDirectories(storedAsSubDirectories: IResolvable) {
    cdkBuilder.storedAsSubDirectories(storedAsSubDirectories)
  }

  public fun build(): CfnTable.StorageDescriptorProperty {
    if(_bucketColumns.isNotEmpty()) cdkBuilder.bucketColumns(_bucketColumns)
    if(_columns.isNotEmpty()) cdkBuilder.columns(_columns)
    if(_sortColumns.isNotEmpty()) cdkBuilder.sortColumns(_sortColumns)
    return cdkBuilder.build()
  }
}
