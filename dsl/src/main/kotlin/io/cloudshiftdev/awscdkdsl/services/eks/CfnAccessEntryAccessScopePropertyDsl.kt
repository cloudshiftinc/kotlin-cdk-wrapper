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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eks.CfnAccessEntry

/**
 * The scope of an `AccessPolicy` that's associated to an `AccessEntry` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * AccessScopeProperty accessScopeProperty = AccessScopeProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .namespaces(List.of("namespaces"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accessscope.html)
 */
@CdkDslMarker
public class CfnAccessEntryAccessScopePropertyDsl {
    private val cdkBuilder: CfnAccessEntry.AccessScopeProperty.Builder =
        CfnAccessEntry.AccessScopeProperty.builder()

    private val _namespaces: MutableList<String> = mutableListOf()

    /**
     * @param namespaces A Kubernetes `namespace` that an access policy is scoped to. A value is
     *   required if you specified `namespace` for `Type` .
     */
    public fun namespaces(vararg namespaces: String) {
        _namespaces.addAll(listOf(*namespaces))
    }

    /**
     * @param namespaces A Kubernetes `namespace` that an access policy is scoped to. A value is
     *   required if you specified `namespace` for `Type` .
     */
    public fun namespaces(namespaces: Collection<String>) {
        _namespaces.addAll(namespaces)
    }

    /** @param type The scope type of an access policy. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAccessEntry.AccessScopeProperty {
        if (_namespaces.isNotEmpty()) cdkBuilder.namespaces(_namespaces)
        return cdkBuilder.build()
    }
}
