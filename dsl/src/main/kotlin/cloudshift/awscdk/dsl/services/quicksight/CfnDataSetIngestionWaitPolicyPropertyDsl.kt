@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * The wait policy to use when creating or updating a Dataset.
 *
 * The default is to wait for SPICE ingestion to finish with timeout of 36 hours.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * IngestionWaitPolicyProperty ingestionWaitPolicyProperty = IngestionWaitPolicyProperty.builder()
 * .ingestionWaitTimeInHours(123)
 * .waitForSpiceIngestion(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-ingestionwaitpolicy.html)
 */
@CdkDslMarker
public class CfnDataSetIngestionWaitPolicyPropertyDsl {
  private val cdkBuilder: CfnDataSet.IngestionWaitPolicyProperty.Builder =
      CfnDataSet.IngestionWaitPolicyProperty.builder()

  /**
   * @param ingestionWaitTimeInHours The maximum time (in hours) to wait for Ingestion to complete.
   * Default timeout is 36 hours. Applicable only when `DataSetImportMode` mode is set to SPICE and
   * `WaitForSpiceIngestion` is set to true.
   */
  public fun ingestionWaitTimeInHours(ingestionWaitTimeInHours: Number) {
    cdkBuilder.ingestionWaitTimeInHours(ingestionWaitTimeInHours)
  }

  /**
   * @param waitForSpiceIngestion Wait for SPICE ingestion to finish to mark dataset creation or
   * update as successful.
   * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
   */
  public fun waitForSpiceIngestion(waitForSpiceIngestion: Boolean) {
    cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion)
  }

  /**
   * @param waitForSpiceIngestion Wait for SPICE ingestion to finish to mark dataset creation or
   * update as successful.
   * Default (true). Applicable only when `DataSetImportMode` mode is set to SPICE.
   */
  public fun waitForSpiceIngestion(waitForSpiceIngestion: IResolvable) {
    cdkBuilder.waitForSpiceIngestion(waitForSpiceIngestion)
  }

  public fun build(): CfnDataSet.IngestionWaitPolicyProperty = cdkBuilder.build()
}
