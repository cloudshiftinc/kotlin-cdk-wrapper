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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.SecretVersionInfo

/**
 * Specify the secret's version id or version stage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * SecretVersionInfo secretVersionInfo = SecretVersionInfo.builder()
 * .versionId("versionId")
 * .versionStage("versionStage")
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretVersionInfoDsl {
    private val cdkBuilder: SecretVersionInfo.Builder = SecretVersionInfo.builder()

    /** @param versionId version id of the secret. */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    /** @param versionStage version stage of the secret. */
    public fun versionStage(versionStage: String) {
        cdkBuilder.versionStage(versionStage)
    }

    public fun build(): SecretVersionInfo = cdkBuilder.build()
}
