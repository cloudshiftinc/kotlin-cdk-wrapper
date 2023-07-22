@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues

/**
 * Return the appropriate values for the environment placeholders.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * EnvironmentPlaceholderValues environmentPlaceholderValues =
 * EnvironmentPlaceholderValues.builder()
 * .accountId("accountId")
 * .partition("partition")
 * .region("region")
 * .build();
 * ```
 */
@CdkDslMarker
public class EnvironmentPlaceholderValuesDsl {
  private val cdkBuilder: EnvironmentPlaceholderValues.Builder =
      EnvironmentPlaceholderValues.builder()

  /**
   * @param accountId Return the account. 
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * @param partition Return the partition. 
   */
  public fun partition(partition: String) {
    cdkBuilder.partition(partition)
  }

  /**
   * @param region Return the region. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun build(): EnvironmentPlaceholderValues = cdkBuilder.build()
}
