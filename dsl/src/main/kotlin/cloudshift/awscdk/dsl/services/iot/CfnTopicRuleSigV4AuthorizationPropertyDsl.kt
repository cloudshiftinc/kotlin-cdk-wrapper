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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * For more information, see
 * [Signature Version 4 signing process](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * SigV4AuthorizationProperty sigV4AuthorizationProperty = SigV4AuthorizationProperty.builder()
 * .roleArn("roleArn")
 * .serviceName("serviceName")
 * .signingRegion("signingRegion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html)
 */
@CdkDslMarker
public class CfnTopicRuleSigV4AuthorizationPropertyDsl {
    private val cdkBuilder: CfnTopicRule.SigV4AuthorizationProperty.Builder =
        CfnTopicRule.SigV4AuthorizationProperty.builder()

    /** @param roleArn The ARN of the signing role. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param serviceName The service name to use while signing with Sig V4. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /** @param signingRegion The signing region. */
    public fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
    }

    public fun build(): CfnTopicRule.SigV4AuthorizationProperty = cdkBuilder.build()
}
