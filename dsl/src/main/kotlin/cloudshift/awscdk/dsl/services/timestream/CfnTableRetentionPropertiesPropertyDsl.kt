@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnTable

/**
 * Retention properties contain the duration for which your time-series data must be stored in the
 * magnetic store and the memory store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * RetentionPropertiesProperty retentionPropertiesProperty = RetentionPropertiesProperty.builder()
 * .magneticStoreRetentionPeriodInDays("magneticStoreRetentionPeriodInDays")
 * .memoryStoreRetentionPeriodInHours("memoryStoreRetentionPeriodInHours")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-retentionproperties.html)
 */
@CdkDslMarker
public class CfnTableRetentionPropertiesPropertyDsl {
  private val cdkBuilder: CfnTable.RetentionPropertiesProperty.Builder =
      CfnTable.RetentionPropertiesProperty.builder()

  /**
   * @param magneticStoreRetentionPeriodInDays The duration for which data must be stored in the
   * magnetic store.
   */
  public fun magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays: String) {
    cdkBuilder.magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays)
  }

  /**
   * @param memoryStoreRetentionPeriodInHours The duration for which data must be stored in the
   * memory store.
   */
  public fun memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours: String) {
    cdkBuilder.memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours)
  }

  public fun build(): CfnTable.RetentionPropertiesProperty = cdkBuilder.build()
}
