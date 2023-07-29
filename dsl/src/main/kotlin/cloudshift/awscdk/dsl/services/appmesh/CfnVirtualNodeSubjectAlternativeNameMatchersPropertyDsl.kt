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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenamematchers.html)
 */
@CdkDslMarker
public class CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.SubjectAlternativeNameMatchersProperty.Builder =
        CfnVirtualNode.SubjectAlternativeNameMatchersProperty.builder()

    private val _exact: MutableList<String> = mutableListOf()

    /** @param exact The values sent must match the specified values exactly. */
    public fun exact(vararg exact: String) {
        _exact.addAll(listOf(*exact))
    }

    /** @param exact The values sent must match the specified values exactly. */
    public fun exact(exact: Collection<String>) {
        _exact.addAll(exact)
    }

    public fun build(): CfnVirtualNode.SubjectAlternativeNameMatchersProperty {
        if (_exact.isNotEmpty()) cdkBuilder.exact(_exact)
        return cdkBuilder.build()
    }
}
