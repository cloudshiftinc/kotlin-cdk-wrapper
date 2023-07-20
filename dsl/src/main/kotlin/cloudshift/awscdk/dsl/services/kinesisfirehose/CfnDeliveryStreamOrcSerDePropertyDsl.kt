@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamOrcSerDePropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.OrcSerDeProperty.Builder =
      CfnDeliveryStream.OrcSerDeProperty.builder()

  private val _bloomFilterColumns: MutableList<String> = mutableListOf()

  public fun blockSizeBytes(blockSizeBytes: Number) {
    cdkBuilder.blockSizeBytes(blockSizeBytes)
  }

  public fun bloomFilterColumns(vararg bloomFilterColumns: String) {
    _bloomFilterColumns.addAll(listOf(*bloomFilterColumns))
  }

  public fun bloomFilterColumns(bloomFilterColumns: Collection<String>) {
    _bloomFilterColumns.addAll(bloomFilterColumns)
  }

  public fun bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability: Number) {
    cdkBuilder.bloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability)
  }

  public fun compression(compression: String) {
    cdkBuilder.compression(compression)
  }

  public fun dictionaryKeyThreshold(dictionaryKeyThreshold: Number) {
    cdkBuilder.dictionaryKeyThreshold(dictionaryKeyThreshold)
  }

  public fun enablePadding(enablePadding: Boolean) {
    cdkBuilder.enablePadding(enablePadding)
  }

  public fun enablePadding(enablePadding: IResolvable) {
    cdkBuilder.enablePadding(enablePadding)
  }

  public fun formatVersion(formatVersion: String) {
    cdkBuilder.formatVersion(formatVersion)
  }

  public fun paddingTolerance(paddingTolerance: Number) {
    cdkBuilder.paddingTolerance(paddingTolerance)
  }

  public fun rowIndexStride(rowIndexStride: Number) {
    cdkBuilder.rowIndexStride(rowIndexStride)
  }

  public fun stripeSizeBytes(stripeSizeBytes: Number) {
    cdkBuilder.stripeSizeBytes(stripeSizeBytes)
  }

  public fun build(): CfnDeliveryStream.OrcSerDeProperty {
    if(_bloomFilterColumns.isNotEmpty()) cdkBuilder.bloomFilterColumns(_bloomFilterColumns)
    return cdkBuilder.build()
  }
}
