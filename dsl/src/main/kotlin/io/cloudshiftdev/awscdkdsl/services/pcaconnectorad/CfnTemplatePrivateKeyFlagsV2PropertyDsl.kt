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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Private key flags for v2 templates specify the client compatibility, if the private key can be
 * exported, and if user input is required when using a private key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * PrivateKeyFlagsV2Property privateKeyFlagsV2Property = PrivateKeyFlagsV2Property.builder()
 * .clientVersion("clientVersion")
 * // the properties below are optional
 * .exportableKey(false)
 * .strongKeyProtectionRequired(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv2.html)
 */
@CdkDslMarker
public class CfnTemplatePrivateKeyFlagsV2PropertyDsl {
    private val cdkBuilder: CfnTemplate.PrivateKeyFlagsV2Property.Builder =
        CfnTemplate.PrivateKeyFlagsV2Property.builder()

    /** @param clientVersion Defines the minimum client compatibility. */
    public fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
    }

    /** @param exportableKey Allows the private key to be exported. */
    public fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
    }

    /** @param exportableKey Allows the private key to be exported. */
    public fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey)
    }

    /**
     * @param strongKeyProtectionRequired Require user input when using the private key for
     *   enrollment.
     */
    public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
    }

    /**
     * @param strongKeyProtectionRequired Require user input when using the private key for
     *   enrollment.
     */
    public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
    }

    public fun build(): CfnTemplate.PrivateKeyFlagsV2Property = cdkBuilder.build()
}
