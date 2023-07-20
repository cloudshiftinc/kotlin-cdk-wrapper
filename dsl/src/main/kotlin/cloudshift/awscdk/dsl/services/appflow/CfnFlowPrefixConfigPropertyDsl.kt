@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlowPrefixConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.PrefixConfigProperty.Builder =
        CfnFlow.PrefixConfigProperty.builder()

    private val _pathPrefixHierarchy: MutableList<String> = mutableListOf()

    public fun pathPrefixHierarchy(vararg pathPrefixHierarchy: String) {
        _pathPrefixHierarchy.addAll(listOf(*pathPrefixHierarchy))
    }

    public fun pathPrefixHierarchy(pathPrefixHierarchy: Collection<String>) {
        _pathPrefixHierarchy.addAll(pathPrefixHierarchy)
    }

    public fun prefixFormat(prefixFormat: String) {
        cdkBuilder.prefixFormat(prefixFormat)
    }

    public fun prefixType(prefixType: String) {
        cdkBuilder.prefixType(prefixType)
    }

    public fun build(): CfnFlow.PrefixConfigProperty {
        if (_pathPrefixHierarchy.isNotEmpty()) cdkBuilder.pathPrefixHierarchy(_pathPrefixHierarchy)
        return cdkBuilder.build()
    }
}
