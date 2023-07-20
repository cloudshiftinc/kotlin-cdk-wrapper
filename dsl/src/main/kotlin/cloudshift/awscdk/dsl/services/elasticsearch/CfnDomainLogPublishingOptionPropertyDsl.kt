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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnDomainLogPublishingOptionPropertyDsl {
    private val cdkBuilder: CfnDomain.LogPublishingOptionProperty.Builder =
        CfnDomain.LogPublishingOptionProperty.builder()

    public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnDomain.LogPublishingOptionProperty = cdkBuilder.build()
}
