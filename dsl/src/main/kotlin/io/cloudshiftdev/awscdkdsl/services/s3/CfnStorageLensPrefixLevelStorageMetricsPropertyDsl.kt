@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the details of the prefix-level storage metrics for Amazon S3 Storage
 * Lens.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * PrefixLevelStorageMetricsProperty prefixLevelStorageMetricsProperty =
 * PrefixLevelStorageMetricsProperty.builder()
 * .isEnabled(false)
 * .selectionCriteria(SelectionCriteriaProperty.builder()
 * .delimiter("delimiter")
 * .maxDepth(123)
 * .minStorageBytesPercentage(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevelstoragemetrics.html)
 */
@CdkDslMarker
public class CfnStorageLensPrefixLevelStorageMetricsPropertyDsl {
    private val cdkBuilder: CfnStorageLens.PrefixLevelStorageMetricsProperty.Builder =
        CfnStorageLens.PrefixLevelStorageMetricsProperty.builder()

    /**
     * @param isEnabled This property identifies whether the details of the prefix-level storage
     *   metrics for S3 Storage Lens are enabled.
     */
    public fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * @param isEnabled This property identifies whether the details of the prefix-level storage
     *   metrics for S3 Storage Lens are enabled.
     */
    public fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * @param selectionCriteria This property identifies whether the details of the prefix-level
     *   storage metrics for S3 Storage Lens are enabled.
     */
    public fun selectionCriteria(selectionCriteria: IResolvable) {
        cdkBuilder.selectionCriteria(selectionCriteria)
    }

    /**
     * @param selectionCriteria This property identifies whether the details of the prefix-level
     *   storage metrics for S3 Storage Lens are enabled.
     */
    public fun selectionCriteria(selectionCriteria: CfnStorageLens.SelectionCriteriaProperty) {
        cdkBuilder.selectionCriteria(selectionCriteria)
    }

    public fun build(): CfnStorageLens.PrefixLevelStorageMetricsProperty = cdkBuilder.build()
}
