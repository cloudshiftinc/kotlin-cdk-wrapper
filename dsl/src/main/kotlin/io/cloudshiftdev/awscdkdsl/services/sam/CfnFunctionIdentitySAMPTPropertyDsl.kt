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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * IdentitySAMPTProperty identitySAMPTProperty = IdentitySAMPTProperty.builder()
 * .identityName("identityName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-identitysampt.html)
 */
@CdkDslMarker
public class CfnFunctionIdentitySAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.IdentitySAMPTProperty.Builder =
        CfnFunction.IdentitySAMPTProperty.builder()

    /** @param identityName the value to be set. */
    public fun identityName(identityName: String) {
        cdkBuilder.identityName(identityName)
    }

    public fun build(): CfnFunction.IdentitySAMPTProperty = cdkBuilder.build()
}
