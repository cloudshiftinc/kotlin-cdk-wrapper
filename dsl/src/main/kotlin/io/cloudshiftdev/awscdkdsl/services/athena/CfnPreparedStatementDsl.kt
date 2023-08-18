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

package io.cloudshiftdev.awscdkdsl.services.athena

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnPreparedStatement
import software.constructs.Construct

/**
 * Specifies a prepared statement for use with SQL queries in Athena.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CfnPreparedStatement cfnPreparedStatement = CfnPreparedStatement.Builder.create(this,
 * "MyCfnPreparedStatement")
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
public class CfnPreparedStatementDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPreparedStatement.Builder =
        CfnPreparedStatement.Builder.create(scope, id)

    /**
     * The description of the prepared statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-description)
     *
     * @param description The description of the prepared statement.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The query string for the prepared statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-querystatement)
     *
     * @param queryStatement The query string for the prepared statement.
     */
    public fun queryStatement(queryStatement: String) {
        cdkBuilder.queryStatement(queryStatement)
    }

    /**
     * The name of the prepared statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-statementname)
     *
     * @param statementName The name of the prepared statement.
     */
    public fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
    }

    /**
     * The workgroup to which the prepared statement belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-preparedstatement.html#cfn-athena-preparedstatement-workgroup)
     *
     * @param workGroup The workgroup to which the prepared statement belongs.
     */
    public fun workGroup(workGroup: String) {
        cdkBuilder.workGroup(workGroup)
    }

    public fun build(): CfnPreparedStatement = cdkBuilder.build()
}
