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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnRuleRedshiftDataParametersPropertyDsl {
    private val cdkBuilder: CfnRule.RedshiftDataParametersProperty.Builder =
        CfnRule.RedshiftDataParametersProperty.builder()

    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    public fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
    }

    public fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
    }

    public fun sql(sql: String) {
        cdkBuilder.sql(sql)
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

    public fun build(): CfnRule.RedshiftDataParametersProperty = cdkBuilder.build()
}
