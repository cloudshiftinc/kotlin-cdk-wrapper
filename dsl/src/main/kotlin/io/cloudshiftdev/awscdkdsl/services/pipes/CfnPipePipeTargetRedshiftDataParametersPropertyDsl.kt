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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the
 * Amazon Redshift Data API BatchExecuteStatement.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetRedshiftDataParametersProperty pipeTargetRedshiftDataParametersProperty =
 * PipeTargetRedshiftDataParametersProperty.builder()
 * .database("database")
 * .sqls(List.of("sqls"))
 * // the properties below are optional
 * .dbUser("dbUser")
 * .secretManagerArn("secretManagerArn")
 * .statementName("statementName")
 * .withEvent(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetredshiftdataparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetRedshiftDataParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetRedshiftDataParametersProperty.Builder =
        CfnPipe.PipeTargetRedshiftDataParametersProperty.builder()

    private val _sqls: MutableList<String> = mutableListOf()

    /**
     * @param database The name of the database. Required when authenticating using temporary
     *   credentials.
     */
    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    /**
     * @param dbUser The database user name. Required when authenticating using temporary
     *   credentials.
     */
    public fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
    }

    /**
     * @param secretManagerArn The name or ARN of the secret that enables access to the database.
     *   Required when authenticating using Secrets Manager .
     */
    public fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
    }

    /** @param sqls The SQL statement text to run. */
    public fun sqls(vararg sqls: String) {
        _sqls.addAll(listOf(*sqls))
    }

    /** @param sqls The SQL statement text to run. */
    public fun sqls(sqls: Collection<String>) {
        _sqls.addAll(sqls)
    }

    /**
     * @param statementName The name of the SQL statement. You can name the SQL statement when you
     *   create it to identify the query.
     */
    public fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
    }

    /**
     * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
     *   statement runs.
     */
    public fun withEvent(withEvent: Boolean) {
        cdkBuilder.withEvent(withEvent)
    }

    /**
     * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
     *   statement runs.
     */
    public fun withEvent(withEvent: IResolvable) {
        cdkBuilder.withEvent(withEvent)
    }

    public fun build(): CfnPipe.PipeTargetRedshiftDataParametersProperty {
        if (_sqls.isNotEmpty()) cdkBuilder.sqls(_sqls)
        return cdkBuilder.build()
    }
}
