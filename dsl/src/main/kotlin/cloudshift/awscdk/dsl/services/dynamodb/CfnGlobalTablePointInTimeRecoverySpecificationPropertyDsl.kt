@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTablePointInTimeRecoverySpecificationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.PointInTimeRecoverySpecificationProperty.Builder =
      CfnGlobalTable.PointInTimeRecoverySpecificationProperty.builder()

  /**
   * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled (true) or
   * disabled (false) on the table.
   */
  public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
    cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
  }

  /**
   * @param pointInTimeRecoveryEnabled Indicates whether point in time recovery is enabled (true) or
   * disabled (false) on the table.
   */
  public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
    cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
  }

  public fun build(): CfnGlobalTable.PointInTimeRecoverySpecificationProperty = cdkBuilder.build()
}
