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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenames.html)
 */
@CdkDslMarker
public class CfnVirtualNodeSubjectAlternativeNamesPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.SubjectAlternativeNamesProperty.Builder =
        CfnVirtualNode.SubjectAlternativeNamesProperty.builder()

    /** @param match An object that represents the criteria for determining a SANs match. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match An object that represents the criteria for determining a SANs match. */
    public fun match(match: CfnVirtualNode.SubjectAlternativeNameMatchersProperty) {
        cdkBuilder.match(match)
    }

    public fun build(): CfnVirtualNode.SubjectAlternativeNamesProperty = cdkBuilder.build()
}
