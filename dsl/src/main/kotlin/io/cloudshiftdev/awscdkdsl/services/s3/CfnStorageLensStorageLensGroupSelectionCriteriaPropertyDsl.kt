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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource indicates which Storage Lens group ARNs to include or exclude in the Storage Lens
 * group aggregation.
 *
 * You can only attach Storage Lens groups to your dashboard if they're included in your Storage
 * Lens group aggregation. If this value is left null, then all Storage Lens groups are selected.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * StorageLensGroupSelectionCriteriaProperty storageLensGroupSelectionCriteriaProperty =
 * StorageLensGroupSelectionCriteriaProperty.builder()
 * .exclude(List.of("exclude"))
 * .include(List.of("include"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensgroupselectioncriteria.html)
 */
@CdkDslMarker
public class CfnStorageLensStorageLensGroupSelectionCriteriaPropertyDsl {
    private val cdkBuilder: CfnStorageLens.StorageLensGroupSelectionCriteriaProperty.Builder =
        CfnStorageLens.StorageLensGroupSelectionCriteriaProperty.builder()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _include: MutableList<String> = mutableListOf()

    /**
     * @param exclude This property indicates which Storage Lens group ARNs to exclude from the
     *   Storage Lens group aggregation.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    /**
     * @param exclude This property indicates which Storage Lens group ARNs to exclude from the
     *   Storage Lens group aggregation.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /**
     * @param include This property indicates which Storage Lens group ARNs to include in the
     *   Storage Lens group aggregation.
     */
    public fun include(vararg include: String) {
        _include.addAll(listOf(*include))
    }

    /**
     * @param include This property indicates which Storage Lens group ARNs to include in the
     *   Storage Lens group aggregation.
     */
    public fun include(include: Collection<String>) {
        _include.addAll(include)
    }

    public fun build(): CfnStorageLens.StorageLensGroupSelectionCriteriaProperty {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_include.isNotEmpty()) cdkBuilder.include(_include)
        return cdkBuilder.build()
    }
}
