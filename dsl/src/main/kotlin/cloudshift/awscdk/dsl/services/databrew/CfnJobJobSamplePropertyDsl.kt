@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobJobSamplePropertyDsl {
  private val cdkBuilder: CfnJob.JobSampleProperty.Builder = CfnJob.JobSampleProperty.builder()

  /**
   * @param mode A value that determines whether the profile job is run on the entire dataset or a
   * specified number of rows.
   * This value must be one of the following:
   *
   * * FULL_DATASET - The profile job is run on the entire dataset.
   * * CUSTOM_ROWS - The profile job is run on the number of rows specified in the `Size` parameter.
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param size The `Size` parameter is only required when the mode is CUSTOM_ROWS.
   * The profile job is run on the specified number of rows. The maximum value for size is
   * Long.MAX_VALUE.
   *
   * Long.MAX_VALUE = 9223372036854775807
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): CfnJob.JobSampleProperty = cdkBuilder.build()
}
