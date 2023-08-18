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
 * DomainSAMPTProperty domainSAMPTProperty = DomainSAMPTProperty.builder()
 * .domainName("domainName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-domainsampt.html)
 */
@CdkDslMarker
public class CfnFunctionDomainSAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.DomainSAMPTProperty.Builder =
        CfnFunction.DomainSAMPTProperty.builder()

    /** @param domainName the value to be set. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CfnFunction.DomainSAMPTProperty = cdkBuilder.build()
}
