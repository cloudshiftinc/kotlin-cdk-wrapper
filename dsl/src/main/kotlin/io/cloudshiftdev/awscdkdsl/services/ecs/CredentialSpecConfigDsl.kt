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
import software.amazon.awscdk.services.ecs.CredentialSpecConfig

/**
 * Configuration for a credential specification (CredSpec) used for a ECS container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CredentialSpecConfig credentialSpecConfig = CredentialSpecConfig.builder()
 * .location("location")
 * .typePrefix("typePrefix")
 * .build();
 * ```
 */
@CdkDslMarker
public class CredentialSpecConfigDsl {
    private val cdkBuilder: CredentialSpecConfig.Builder = CredentialSpecConfig.builder()

    /** @param location Location of the CredSpec file. */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /** @param typePrefix Prefix used for the CredSpec string. */
    public fun typePrefix(typePrefix: String) {
        cdkBuilder.typePrefix(typePrefix)
    }

    public fun build(): CredentialSpecConfig = cdkBuilder.build()
}
