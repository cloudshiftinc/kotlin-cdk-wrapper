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

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.athena.CfnPreparedStatementProps
import kotlin.String

@CdkDslMarker
public class CfnPreparedStatementPropsDsl {
    private val cdkBuilder: CfnPreparedStatementProps.Builder = CfnPreparedStatementProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun queryStatement(queryStatement: String) {
        cdkBuilder.queryStatement(queryStatement)
    }

    public fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
    }

    public fun workGroup(workGroup: String) {
        cdkBuilder.workGroup(workGroup)
    }

    public fun build(): CfnPreparedStatementProps = cdkBuilder.build()
}
