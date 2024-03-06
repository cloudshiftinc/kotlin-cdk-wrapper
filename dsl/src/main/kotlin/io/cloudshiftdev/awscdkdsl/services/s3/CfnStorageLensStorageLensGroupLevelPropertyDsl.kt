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
 * This resource determines the scope of Storage Lens group data that is displayed in the Storage
 * Lens dashboard.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * StorageLensGroupLevelProperty storageLensGroupLevelProperty =
 * StorageLensGroupLevelProperty.builder()
 * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
 * .exclude(List.of("exclude"))
 * .include(List.of("include"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgrouplevel.html)
 */
@CdkDslMarker
public class CfnStorageLensStorageLensGroupLevelPropertyDsl {
    private val cdkBuilder: CfnStorageLens.StorageLensGroupLevelProperty.Builder =
        CfnStorageLens.StorageLensGroupLevelProperty.builder()

    /**
     * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens group
     *   ARNs to include or exclude in the Storage Lens group aggregation. If this value is left
     *   null, then all Storage Lens groups are selected.
     */
    public fun storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria: IResolvable) {
        cdkBuilder.storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria)
    }

    /**
     * @param storageLensGroupSelectionCriteria This property indicates which Storage Lens group
     *   ARNs to include or exclude in the Storage Lens group aggregation. If this value is left
     *   null, then all Storage Lens groups are selected.
     */
    public fun storageLensGroupSelectionCriteria(
        storageLensGroupSelectionCriteria: CfnStorageLens.StorageLensGroupSelectionCriteriaProperty
    ) {
        cdkBuilder.storageLensGroupSelectionCriteria(storageLensGroupSelectionCriteria)
    }

    public fun build(): CfnStorageLens.StorageLensGroupLevelProperty = cdkBuilder.build()
}
