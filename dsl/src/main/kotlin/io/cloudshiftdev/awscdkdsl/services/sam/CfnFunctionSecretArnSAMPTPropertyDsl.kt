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
 * SecretArnSAMPTProperty secretArnSAMPTProperty = SecretArnSAMPTProperty.builder()
 * .secretArn("secretArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-secretarnsampt.html)
 */
@CdkDslMarker
public class CfnFunctionSecretArnSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.SecretArnSAMPTProperty.Builder =
        CfnFunction.SecretArnSAMPTProperty.builder()

    /** @param secretArn the value to be set. */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnFunction.SecretArnSAMPTProperty = cdkBuilder.build()
}
