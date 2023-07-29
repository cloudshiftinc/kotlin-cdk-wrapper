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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents the subject alternative names secured by the certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * SubjectAlternativeNamesProperty subjectAlternativeNamesProperty =
 * SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenames.html)
 */
@CdkDslMarker
public class CfnVirtualGatewaySubjectAlternativeNamesPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.SubjectAlternativeNamesProperty.Builder =
        CfnVirtualGateway.SubjectAlternativeNamesProperty.builder()

    /** @param match An object that represents the criteria for determining a SANs match. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match An object that represents the criteria for determining a SANs match. */
    public fun match(match: CfnVirtualGateway.SubjectAlternativeNameMatchersProperty) {
        cdkBuilder.match(match)
    }

    public fun build(): CfnVirtualGateway.SubjectAlternativeNamesProperty = cdkBuilder.build()
}
