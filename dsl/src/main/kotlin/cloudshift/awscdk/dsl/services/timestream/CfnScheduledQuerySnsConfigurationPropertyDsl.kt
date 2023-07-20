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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import kotlin.String

@CdkDslMarker
public class CfnScheduledQuerySnsConfigurationPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.SnsConfigurationProperty.Builder =
        CfnScheduledQuery.SnsConfigurationProperty.builder()

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnScheduledQuery.SnsConfigurationProperty = cdkBuilder.build()
}
