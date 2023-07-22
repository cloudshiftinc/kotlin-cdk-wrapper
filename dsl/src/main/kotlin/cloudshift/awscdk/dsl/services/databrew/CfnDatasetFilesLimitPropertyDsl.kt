@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetFilesLimitPropertyDsl {
  private val cdkBuilder: CfnDataset.FilesLimitProperty.Builder =
      CfnDataset.FilesLimitProperty.builder()

  /**
   * @param maxFiles The number of Amazon S3 files to select. 
   */
  public fun maxFiles(maxFiles: Number) {
    cdkBuilder.maxFiles(maxFiles)
  }

  /**
   * @param order A criteria to use for Amazon S3 files sorting before their selection.
   * By default uses DESCENDING order, i.e. most recent files are selected first. Anotherpossible
   * value is ASCENDING.
   */
  public fun order(order: String) {
    cdkBuilder.order(order)
  }

  /**
   * @param orderedBy A criteria to use for Amazon S3 files sorting before their selection.
   * By default uses LAST_MODIFIED_DATE as a sorting criteria. Currently it's the only allowed
   * value.
   */
  public fun orderedBy(orderedBy: String) {
    cdkBuilder.orderedBy(orderedBy)
  }

  public fun build(): CfnDataset.FilesLimitProperty = cdkBuilder.build()
}
