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
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * Determines how the auto-merging process should resolve conflicts between different profiles.
 *
 * For example, if Profile A and Profile B have the same `FirstName` and `LastName` ,
 * `ConflictResolution` specifies which `EmailAddress` should be used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ConflictResolutionProperty conflictResolutionProperty = ConflictResolutionProperty.builder()
 * .conflictResolvingModel("conflictResolvingModel")
 * // the properties below are optional
 * .sourceName("sourceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-conflictresolution.html)
 */
@CdkDslMarker
public class CfnDomainConflictResolutionPropertyDsl {
    private val cdkBuilder: CfnDomain.ConflictResolutionProperty.Builder =
        CfnDomain.ConflictResolutionProperty.builder()

    /**
     * @param conflictResolvingModel How the auto-merging process should resolve conflicts between
     *   different profiles.
     */
    public fun conflictResolvingModel(conflictResolvingModel: String) {
        cdkBuilder.conflictResolvingModel(conflictResolvingModel)
    }

    /**
     * @param sourceName The `ObjectType` name that is used to resolve profile merging conflicts
     *   when choosing `SOURCE` as the `ConflictResolvingModel` .
     */
    public fun sourceName(sourceName: String) {
        cdkBuilder.sourceName(sourceName)
    }

    public fun build(): CfnDomain.ConflictResolutionProperty = cdkBuilder.build()
}
