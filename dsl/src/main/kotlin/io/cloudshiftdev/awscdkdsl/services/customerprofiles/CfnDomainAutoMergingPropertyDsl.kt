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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * Configuration information about the auto-merging process.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * AutoMergingProperty autoMergingProperty = AutoMergingProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .conflictResolution(ConflictResolutionProperty.builder()
 * .conflictResolvingModel("conflictResolvingModel")
 * // the properties below are optional
 * .sourceName("sourceName")
 * .build())
 * .consolidation(ConsolidationProperty.builder()
 * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
 * .build())
 * .minAllowedConfidenceScoreForMerging(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-automerging.html)
 */
@CdkDslMarker
public class CfnDomainAutoMergingPropertyDsl {
    private val cdkBuilder: CfnDomain.AutoMergingProperty.Builder =
        CfnDomain.AutoMergingProperty.builder()

    /**
     * @param conflictResolution Determines how the auto-merging process should resolve conflicts
     *   between different profiles. For example, if Profile A and Profile B have the same
     *   `FirstName` and `LastName` , `ConflictResolution` specifies which `EmailAddress` should be
     *   used.
     */
    public fun conflictResolution(conflictResolution: IResolvable) {
        cdkBuilder.conflictResolution(conflictResolution)
    }

    /**
     * @param conflictResolution Determines how the auto-merging process should resolve conflicts
     *   between different profiles. For example, if Profile A and Profile B have the same
     *   `FirstName` and `LastName` , `ConflictResolution` specifies which `EmailAddress` should be
     *   used.
     */
    public fun conflictResolution(conflictResolution: CfnDomain.ConflictResolutionProperty) {
        cdkBuilder.conflictResolution(conflictResolution)
    }

    /**
     * @param consolidation A list of matching attributes that represent matching criteria. If two
     *   profiles meet at least one of the requirements in the matching attributes list, they will
     *   be merged.
     */
    public fun consolidation(consolidation: IResolvable) {
        cdkBuilder.consolidation(consolidation)
    }

    /**
     * @param consolidation A list of matching attributes that represent matching criteria. If two
     *   profiles meet at least one of the requirements in the matching attributes list, they will
     *   be merged.
     */
    public fun consolidation(consolidation: CfnDomain.ConsolidationProperty) {
        cdkBuilder.consolidation(consolidation)
    }

    /** @param enabled The flag that enables the auto-merging of duplicate profiles. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled The flag that enables the auto-merging of duplicate profiles. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param minAllowedConfidenceScoreForMerging A number between 0 and 1 that represents the
     *   minimum confidence score required for profiles within a matching group to be merged during
     *   the auto-merge process. A higher score means that a higher similarity is required to merge
     *   profiles.
     */
    public fun minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging: Number) {
        cdkBuilder.minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging)
    }

    public fun build(): CfnDomain.AutoMergingProperty = cdkBuilder.build()
}
