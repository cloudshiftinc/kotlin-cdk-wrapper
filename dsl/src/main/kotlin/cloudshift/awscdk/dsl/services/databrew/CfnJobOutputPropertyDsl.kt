@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobOutputPropertyDsl {
  private val cdkBuilder: CfnJob.OutputProperty.Builder = CfnJob.OutputProperty.builder()

  private val _partitionColumns: MutableList<String> = mutableListOf()

  public fun compressionFormat(compressionFormat: String) {
    cdkBuilder.compressionFormat(compressionFormat)
  }

  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun formatOptions(formatOptions: IResolvable) {
    cdkBuilder.formatOptions(formatOptions)
  }

  public fun formatOptions(formatOptions: CfnJob.OutputFormatOptionsProperty) {
    cdkBuilder.formatOptions(formatOptions)
  }

  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  public fun location(location: CfnJob.S3LocationProperty) {
    cdkBuilder.location(location)
  }

  public fun maxOutputFiles(maxOutputFiles: Number) {
    cdkBuilder.maxOutputFiles(maxOutputFiles)
  }

  public fun overwrite(overwrite: Boolean) {
    cdkBuilder.overwrite(overwrite)
  }

  public fun overwrite(overwrite: IResolvable) {
    cdkBuilder.overwrite(overwrite)
  }

  public fun partitionColumns(vararg partitionColumns: String) {
    _partitionColumns.addAll(listOf(*partitionColumns))
  }

  public fun partitionColumns(partitionColumns: Collection<String>) {
    _partitionColumns.addAll(partitionColumns)
  }

  public fun build(): CfnJob.OutputProperty {
    if(_partitionColumns.isNotEmpty()) cdkBuilder.partitionColumns(_partitionColumns)
    return cdkBuilder.build()
  }
}
