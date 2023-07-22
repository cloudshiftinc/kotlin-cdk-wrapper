@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableTimeToLiveSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.TimeToLiveSpecificationProperty.Builder =
      CfnTable.TimeToLiveSpecificationProperty.builder()

  /**
   * @param attributeName The name of the TTL attribute used to store the expiration time for items
   * in the table.
   *
   * * The `AttributeName` property is required when enabling the TTL, or when TTL is already
   * enabled.
   * * To update this property, you must first disable TTL and then enable TTL with the new
   * attribute name.
   */
  public fun attributeName(attributeName: String) {
    cdkBuilder.attributeName(attributeName)
  }

  /**
   * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the table. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether TTL is to be enabled (true) or disabled (false) on the table. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnTable.TimeToLiveSpecificationProperty = cdkBuilder.build()
}
