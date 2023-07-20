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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnQueryDefinitionPropsDsl {
    private val cdkBuilder: CfnQueryDefinitionProps.Builder = CfnQueryDefinitionProps.builder()

    private val _logGroupNames: MutableList<String> = mutableListOf()

    public fun logGroupNames(vararg logGroupNames: String) {
        _logGroupNames.addAll(listOf(*logGroupNames))
    }

    public fun logGroupNames(logGroupNames: Collection<String>) {
        _logGroupNames.addAll(logGroupNames)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun build(): CfnQueryDefinitionProps {
        if (_logGroupNames.isNotEmpty()) cdkBuilder.logGroupNames(_logGroupNames)
        return cdkBuilder.build()
    }
}
