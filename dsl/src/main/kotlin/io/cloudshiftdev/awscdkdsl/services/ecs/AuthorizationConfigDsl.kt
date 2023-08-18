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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.AuthorizationConfig

/**
 * The authorization configuration details for the Amazon EFS file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * AuthorizationConfig authorizationConfig = AuthorizationConfig.builder()
 * .accessPointId("accessPointId")
 * .iam("iam")
 * .build();
 * ```
 */
@CdkDslMarker
public class AuthorizationConfigDsl {
    private val cdkBuilder: AuthorizationConfig.Builder = AuthorizationConfig.builder()

    /**
     * @param accessPointId The access point ID to use. If an access point is specified, the root
     *   directory value will be relative to the directory set for the access point. If specified,
     *   transit encryption must be enabled in the EFSVolumeConfiguration.
     */
    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    /**
     * @param iam Whether or not to use the Amazon ECS task IAM role defined in a task definition
     *   when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in
     *   the EFSVolumeConfiguration.
     *
     * Valid values: ENABLED | DISABLED
     */
    public fun iam(iam: String) {
        cdkBuilder.iam(iam)
    }

    public fun build(): AuthorizationConfig = cdkBuilder.build()
}
