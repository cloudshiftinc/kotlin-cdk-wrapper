@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensPrefixLevelStorageMetricsPropertyDsl {
  private val cdkBuilder: CfnStorageLens.PrefixLevelStorageMetricsProperty.Builder =
      CfnStorageLens.PrefixLevelStorageMetricsProperty.builder()

  /**
   * @param isEnabled This property identifies whether the details of the prefix-level storage
   * metrics for S3 Storage Lens are enabled.
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param isEnabled This property identifies whether the details of the prefix-level storage
   * metrics for S3 Storage Lens are enabled.
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param selectionCriteria This property identifies whether the details of the prefix-level
   * storage metrics for S3 Storage Lens are enabled.
   */
  public fun selectionCriteria(selectionCriteria: IResolvable) {
    cdkBuilder.selectionCriteria(selectionCriteria)
  }

  /**
   * @param selectionCriteria This property identifies whether the details of the prefix-level
   * storage metrics for S3 Storage Lens are enabled.
   */
  public fun selectionCriteria(selectionCriteria: CfnStorageLens.SelectionCriteriaProperty) {
    cdkBuilder.selectionCriteria(selectionCriteria)
  }

  public fun build(): CfnStorageLens.PrefixLevelStorageMetricsProperty = cdkBuilder.build()
}
