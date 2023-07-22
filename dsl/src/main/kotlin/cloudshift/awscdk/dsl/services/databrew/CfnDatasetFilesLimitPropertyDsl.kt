@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents a limit imposed on number of Amazon S3 files that should be selected for a dataset
 * from a connected Amazon S3 path.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * FilesLimitProperty filesLimitProperty = FilesLimitProperty.builder()
 * .maxFiles(123)
 * // the properties below are optional
 * .order("order")
 * .orderedBy("orderedBy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html)
 */
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
