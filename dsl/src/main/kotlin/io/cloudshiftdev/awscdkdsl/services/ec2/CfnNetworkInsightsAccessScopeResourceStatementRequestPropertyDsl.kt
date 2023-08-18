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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

/**
 * Describes a resource statement.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ResourceStatementRequestProperty resourceStatementRequestProperty =
 * ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-resourcestatementrequest.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAccessScopeResourceStatementRequestPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.Builder =
        CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.builder()

    private val _resourceTypes: MutableList<String> = mutableListOf()

    private val _resources: MutableList<String> = mutableListOf()

    /** @param resourceTypes The resource types. */
    public fun resourceTypes(vararg resourceTypes: String) {
        _resourceTypes.addAll(listOf(*resourceTypes))
    }

    /** @param resourceTypes The resource types. */
    public fun resourceTypes(resourceTypes: Collection<String>) {
        _resourceTypes.addAll(resourceTypes)
    }

    /** @param resources The resources. */
    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    /** @param resources The resources. */
    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    public fun build(): CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty {
        if (_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}
