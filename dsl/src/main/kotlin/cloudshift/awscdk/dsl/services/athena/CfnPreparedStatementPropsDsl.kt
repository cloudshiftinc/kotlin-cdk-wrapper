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

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnPreparedStatementProps

/**
 * Properties for defining a `CfnPreparedStatement`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CfnPreparedStatementProps cfnPreparedStatementProps = CfnPreparedStatementProps.builder()
 * .queryStatement("queryStatement")
 * .statementName("statementName")
 * .workGroup("workGroup")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html)
 */
@CdkDslMarker
public class CfnPreparedStatementPropsDsl {
    private val cdkBuilder: CfnPreparedStatementProps.Builder = CfnPreparedStatementProps.builder()

    /** @param description The description of the prepared statement. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param queryStatement The query string for the prepared statement. */
    public fun queryStatement(queryStatement: String) {
        cdkBuilder.queryStatement(queryStatement)
    }

    /** @param statementName The name of the prepared statement. */
    public fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
    }

    /** @param workGroup The workgroup to which the prepared statement belongs. */
    public fun workGroup(workGroup: String) {
        cdkBuilder.workGroup(workGroup)
    }

    public fun build(): CfnPreparedStatementProps = cdkBuilder.build()
}
