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
import software.amazon.awscdk.services.glue.CfnCrawler
import kotlin.String

@CdkDslMarker
public class CfnCrawlerSchedulePropertyDsl {
    private val cdkBuilder: CfnCrawler.ScheduleProperty.Builder =
        CfnCrawler.ScheduleProperty.builder()

    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    public fun build(): CfnCrawler.ScheduleProperty = cdkBuilder.build()
}
