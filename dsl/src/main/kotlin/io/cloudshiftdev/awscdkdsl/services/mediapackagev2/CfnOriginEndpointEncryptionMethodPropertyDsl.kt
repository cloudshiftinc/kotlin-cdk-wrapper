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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * The encryption method associated with the origin endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * EncryptionMethodProperty encryptionMethodProperty = EncryptionMethodProperty.builder()
 * .cmafEncryptionMethod("cmafEncryptionMethod")
 * .tsEncryptionMethod("tsEncryptionMethod")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptionmethod.html)
 */
@CdkDslMarker
public class CfnOriginEndpointEncryptionMethodPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.EncryptionMethodProperty.Builder =
        CfnOriginEndpoint.EncryptionMethodProperty.builder()

    /** @param cmafEncryptionMethod The encryption method to use. */
    public fun cmafEncryptionMethod(cmafEncryptionMethod: String) {
        cdkBuilder.cmafEncryptionMethod(cmafEncryptionMethod)
    }

    /** @param tsEncryptionMethod The encryption method to use. */
    public fun tsEncryptionMethod(tsEncryptionMethod: String) {
        cdkBuilder.tsEncryptionMethod(tsEncryptionMethod)
    }

    public fun build(): CfnOriginEndpoint.EncryptionMethodProperty = cdkBuilder.build()
}
