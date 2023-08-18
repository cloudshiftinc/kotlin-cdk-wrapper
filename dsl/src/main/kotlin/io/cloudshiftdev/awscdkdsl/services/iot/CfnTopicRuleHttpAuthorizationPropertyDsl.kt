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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * The authorization method used to send messages.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * HttpAuthorizationProperty httpAuthorizationProperty = HttpAuthorizationProperty.builder()
 * .sigv4(SigV4AuthorizationProperty.builder()
 * .roleArn("roleArn")
 * .serviceName("serviceName")
 * .signingRegion("signingRegion")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html)
 */
@CdkDslMarker
public class CfnTopicRuleHttpAuthorizationPropertyDsl {
    private val cdkBuilder: CfnTopicRule.HttpAuthorizationProperty.Builder =
        CfnTopicRule.HttpAuthorizationProperty.builder()

    /**
     * @param sigv4 Use Sig V4 authorization. For more information, see
     *   [Signature Version 4 Signing Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)
     *   .
     */
    public fun sigv4(sigv4: IResolvable) {
        cdkBuilder.sigv4(sigv4)
    }

    /**
     * @param sigv4 Use Sig V4 authorization. For more information, see
     *   [Signature Version 4 Signing Process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)
     *   .
     */
    public fun sigv4(sigv4: CfnTopicRule.SigV4AuthorizationProperty) {
        cdkBuilder.sigv4(sigv4)
    }

    public fun build(): CfnTopicRule.HttpAuthorizationProperty = cdkBuilder.build()
}
