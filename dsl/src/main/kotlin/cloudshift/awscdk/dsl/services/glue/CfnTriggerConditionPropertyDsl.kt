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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnTrigger
import kotlin.String

@CdkDslMarker
public class CfnTriggerConditionPropertyDsl {
    private val cdkBuilder: CfnTrigger.ConditionProperty.Builder =
        CfnTrigger.ConditionProperty.builder()

    public fun crawlState(crawlState: String) {
        cdkBuilder.crawlState(crawlState)
    }

    public fun crawlerName(crawlerName: String) {
        cdkBuilder.crawlerName(crawlerName)
    }

    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    public fun logicalOperator(logicalOperator: String) {
        cdkBuilder.logicalOperator(logicalOperator)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnTrigger.ConditionProperty = cdkBuilder.build()
}
