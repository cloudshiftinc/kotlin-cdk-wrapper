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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the details of the prefix-level of the Amazon S3 Storage Lens.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * PrefixLevelProperty prefixLevelProperty = PrefixLevelProperty.builder()
 * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
 * .isEnabled(false)
 * .selectionCriteria(SelectionCriteriaProperty.builder()
 * .delimiter("delimiter")
 * .maxDepth(123)
 * .minStorageBytesPercentage(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-prefixlevel.html)
 */
@CdkDslMarker
public class CfnStorageLensPrefixLevelPropertyDsl {
    private val cdkBuilder: CfnStorageLens.PrefixLevelProperty.Builder =
        CfnStorageLens.PrefixLevelProperty.builder()

    /**
     * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3 Storage
     *   Lens.
     */
    public fun storageMetrics(storageMetrics: IResolvable) {
        cdkBuilder.storageMetrics(storageMetrics)
    }

    /**
     * @param storageMetrics A property for the prefix-level storage metrics for Amazon S3 Storage
     *   Lens.
     */
    public fun storageMetrics(storageMetrics: CfnStorageLens.PrefixLevelStorageMetricsProperty) {
        cdkBuilder.storageMetrics(storageMetrics)
    }

    public fun build(): CfnStorageLens.PrefixLevelProperty = cdkBuilder.build()
}
