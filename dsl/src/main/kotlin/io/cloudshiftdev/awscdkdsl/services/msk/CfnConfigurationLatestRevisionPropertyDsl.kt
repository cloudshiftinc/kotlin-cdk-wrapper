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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.msk.CfnConfiguration

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * LatestRevisionProperty latestRevisionProperty = LatestRevisionProperty.builder()
 * .creationTime("creationTime")
 * .description("description")
 * .revision(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-configuration-latestrevision.html)
 */
@CdkDslMarker
public class CfnConfigurationLatestRevisionPropertyDsl {
    private val cdkBuilder: CfnConfiguration.LatestRevisionProperty.Builder =
        CfnConfiguration.LatestRevisionProperty.builder()

    /** @param creationTime the value to be set. */
    public fun creationTime(creationTime: String) {
        cdkBuilder.creationTime(creationTime)
    }

    /** @param description the value to be set. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param revision the value to be set. */
    public fun revision(revision: Number) {
        cdkBuilder.revision(revision)
    }

    public fun build(): CfnConfiguration.LatestRevisionProperty = cdkBuilder.build()
}
