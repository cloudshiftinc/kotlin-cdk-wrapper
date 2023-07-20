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
import kotlin.String

@CdkDslMarker
public class CfnRuleBatchParametersPropertyDsl {
    private val cdkBuilder: CfnRule.BatchParametersProperty.Builder =
        CfnRule.BatchParametersProperty.builder()

    public fun arrayProperties(arrayProperties: IResolvable) {
        cdkBuilder.arrayProperties(arrayProperties)
    }

    public fun arrayProperties(arrayProperties: CfnRule.BatchArrayPropertiesProperty) {
        cdkBuilder.arrayProperties(arrayProperties)
    }

    public fun jobDefinition(jobDefinition: String) {
        cdkBuilder.jobDefinition(jobDefinition)
    }

    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    public fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy)
    }

    public fun retryStrategy(retryStrategy: CfnRule.BatchRetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy)
    }

    public fun build(): CfnRule.BatchParametersProperty = cdkBuilder.build()
}
