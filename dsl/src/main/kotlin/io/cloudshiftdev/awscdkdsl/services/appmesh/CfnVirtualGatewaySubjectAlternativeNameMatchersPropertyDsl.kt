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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents the methods by which a subject alternative name on a peer Transport
 * Layer Security (TLS) certificate can be matched.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * SubjectAlternativeNameMatchersProperty subjectAlternativeNameMatchersProperty =
 * SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenamematchers.html)
 */
@CdkDslMarker
public class CfnVirtualGatewaySubjectAlternativeNameMatchersPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.SubjectAlternativeNameMatchersProperty.Builder =
        CfnVirtualGateway.SubjectAlternativeNameMatchersProperty.builder()

    private val _exact: MutableList<String> = mutableListOf()

    /** @param exact The values sent must match the specified values exactly. */
    public fun exact(vararg exact: String) {
        _exact.addAll(listOf(*exact))
    }

    /** @param exact The values sent must match the specified values exactly. */
    public fun exact(exact: Collection<String>) {
        _exact.addAll(exact)
    }

    public fun build(): CfnVirtualGateway.SubjectAlternativeNameMatchersProperty {
        if (_exact.isNotEmpty()) cdkBuilder.exact(_exact)
        return cdkBuilder.build()
    }
}
