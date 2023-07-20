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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CfnResolver
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResolverPipelineConfigPropertyDsl {
    private val cdkBuilder: CfnResolver.PipelineConfigProperty.Builder =
        CfnResolver.PipelineConfigProperty.builder()

    private val _functions: MutableList<String> = mutableListOf()

    public fun functions(vararg functions: String) {
        _functions.addAll(listOf(*functions))
    }

    public fun functions(functions: Collection<String>) {
        _functions.addAll(functions)
    }

    public fun build(): CfnResolver.PipelineConfigProperty {
        if (_functions.isNotEmpty()) cdkBuilder.functions(_functions)
        return cdkBuilder.build()
    }
}
