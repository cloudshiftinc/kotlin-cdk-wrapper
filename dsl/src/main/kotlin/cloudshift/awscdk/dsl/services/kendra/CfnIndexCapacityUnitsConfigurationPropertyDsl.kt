@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Specifies additional capacity units configured for your Enterprise Edition index.
 *
 * You can add and remove capacity units to fit your usage requirements.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * CapacityUnitsConfigurationProperty capacityUnitsConfigurationProperty =
 * CapacityUnitsConfigurationProperty.builder()
 * .queryCapacityUnits(123)
 * .storageCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-capacityunitsconfiguration.html)
 */
@CdkDslMarker
public class CfnIndexCapacityUnitsConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.CapacityUnitsConfigurationProperty.Builder =
      CfnIndex.CapacityUnitsConfigurationProperty.builder()

  /**
   * @param queryCapacityUnits The amount of extra query capacity for an index and
   * [GetQuerySuggestions](https://docs.aws.amazon.com/kendra/latest/dg/API_GetQuerySuggestions.html)
   * capacity. 
   * A single extra capacity unit for an index provides 0.1 queries per second or approximately
   * 8,000 queries per day. You can add up to 100 extra capacity units.
   *
   * `GetQuerySuggestions` capacity is five times the provisioned query capacity for an index, or
   * the base capacity of 2.5 calls per second, whichever is higher. For example, the base capacity for
   * an index is 0.1 queries per second, and `GetQuerySuggestions` capacity has a base of 2.5 calls per
   * second. If you add another 0.1 queries per second to total 0.2 queries per second for an index,
   * the `GetQuerySuggestions` capacity is 2.5 calls per second (higher than five times 0.2 queries per
   * second).
   */
  public fun queryCapacityUnits(queryCapacityUnits: Number) {
    cdkBuilder.queryCapacityUnits(queryCapacityUnits)
  }

  /**
   * @param storageCapacityUnits The amount of extra storage capacity for an index. 
   * A single capacity unit provides 30 GB of storage space or 100,000 documents, whichever is
   * reached first. You can add up to 100 extra capacity units.
   */
  public fun storageCapacityUnits(storageCapacityUnits: Number) {
    cdkBuilder.storageCapacityUnits(storageCapacityUnits)
  }

  public fun build(): CfnIndex.CapacityUnitsConfigurationProperty = cdkBuilder.build()
}
