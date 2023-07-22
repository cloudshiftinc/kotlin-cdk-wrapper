@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues

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
