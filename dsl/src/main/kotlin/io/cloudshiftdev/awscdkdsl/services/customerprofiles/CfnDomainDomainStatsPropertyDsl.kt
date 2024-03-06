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
import kotlin.Number
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * Usage-specific statistics about the domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * DomainStatsProperty domainStatsProperty = DomainStatsProperty.builder()
 * .meteringProfileCount(123)
 * .objectCount(123)
 * .profileCount(123)
 * .totalSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-domainstats.html)
 */
@CdkDslMarker
public class CfnDomainDomainStatsPropertyDsl {
    private val cdkBuilder: CfnDomain.DomainStatsProperty.Builder =
        CfnDomain.DomainStatsProperty.builder()

    /**
     * @param meteringProfileCount The number of profiles that you are currently paying for in the
     *   domain. If you have more than 100 objects associated with a single profile, that profile
     *   counts as two profiles. If you have more than 200 objects, that profile counts as three,
     *   and so on.
     */
    public fun meteringProfileCount(meteringProfileCount: Number) {
        cdkBuilder.meteringProfileCount(meteringProfileCount)
    }

    /** @param objectCount The total number of objects in domain. */
    public fun objectCount(objectCount: Number) {
        cdkBuilder.objectCount(objectCount)
    }

    /** @param profileCount The total number of profiles currently in the domain. */
    public fun profileCount(profileCount: Number) {
        cdkBuilder.profileCount(profileCount)
    }

    /** @param totalSize The total size, in bytes, of all objects in the domain. */
    public fun totalSize(totalSize: Number) {
        cdkBuilder.totalSize(totalSize)
    }

    public fun build(): CfnDomain.DomainStatsProperty = cdkBuilder.build()
}
