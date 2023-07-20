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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipePipeTargetRedshiftDataParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetRedshiftDataParametersProperty.Builder =
        CfnPipe.PipeTargetRedshiftDataParametersProperty.builder()

    private val _sqls: MutableList<String> = mutableListOf()

    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    public fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
    }

    public fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
    }

    public fun sqls(vararg sqls: String) {
        _sqls.addAll(listOf(*sqls))
    }

    public fun sqls(sqls: Collection<String>) {
        _sqls.addAll(sqls)
    }

    public fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
    }

    public fun withEvent(withEvent: Boolean) {
        cdkBuilder.withEvent(withEvent)
    }

    public fun withEvent(withEvent: IResolvable) {
        cdkBuilder.withEvent(withEvent)
    }

    public fun build(): CfnPipe.PipeTargetRedshiftDataParametersProperty {
        if (_sqls.isNotEmpty()) cdkBuilder.sqls(_sqls)
        return cdkBuilder.build()
    }
}
