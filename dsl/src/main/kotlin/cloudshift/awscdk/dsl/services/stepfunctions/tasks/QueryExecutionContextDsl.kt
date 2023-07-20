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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext
import kotlin.String

@CdkDslMarker
public class QueryExecutionContextDsl {
    private val cdkBuilder: QueryExecutionContext.Builder = QueryExecutionContext.builder()

    public fun catalogName(catalogName: String) {
        cdkBuilder.catalogName(catalogName)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun build(): QueryExecutionContext = cdkBuilder.build()
}
