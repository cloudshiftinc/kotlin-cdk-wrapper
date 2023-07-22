@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the details of the Amazon S3 Storage Lens selection criteria.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * SelectionCriteriaProperty selectionCriteriaProperty = SelectionCriteriaProperty.builder()
 * .delimiter("delimiter")
 * .maxDepth(123)
 * .minStorageBytesPercentage(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-selectioncriteria.html)
 */
@CdkDslMarker
public class CfnStorageLensSelectionCriteriaPropertyDsl {
  private val cdkBuilder: CfnStorageLens.SelectionCriteriaProperty.Builder =
      CfnStorageLens.SelectionCriteriaProperty.builder()

  /**
   * @param delimiter This property contains the details of the S3 Storage Lens delimiter being
   * used.
   */
  public fun delimiter(delimiter: String) {
    cdkBuilder.delimiter(delimiter)
  }

  /**
   * @param maxDepth This property contains the details of the max depth that S3 Storage Lens will
   * collect metrics up to.
   */
  public fun maxDepth(maxDepth: Number) {
    cdkBuilder.maxDepth(maxDepth)
  }

  /**
   * @param minStorageBytesPercentage This property contains the details of the minimum storage
   * bytes percentage threshold that S3 Storage Lens will collect metrics up to.
   */
  public fun minStorageBytesPercentage(minStorageBytesPercentage: Number) {
    cdkBuilder.minStorageBytesPercentage(minStorageBytesPercentage)
  }

  public fun build(): CfnStorageLens.SelectionCriteriaProperty = cdkBuilder.build()
}
