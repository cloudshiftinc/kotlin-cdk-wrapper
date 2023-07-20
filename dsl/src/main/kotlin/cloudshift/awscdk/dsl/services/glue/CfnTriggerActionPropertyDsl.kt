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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTrigger
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnTriggerActionPropertyDsl {
    private val cdkBuilder: CfnTrigger.ActionProperty.Builder = CfnTrigger.ActionProperty.builder()

    public fun arguments(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.arguments(builder.map)
    }

    public fun arguments(arguments: Any) {
        cdkBuilder.arguments(arguments)
    }

    public fun crawlerName(crawlerName: String) {
        cdkBuilder.crawlerName(crawlerName)
    }

    public fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
    }

    public fun notificationProperty(notificationProperty: IResolvable) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    public fun notificationProperty(notificationProperty: CfnTrigger.NotificationPropertyProperty) {
        cdkBuilder.notificationProperty(notificationProperty)
    }

    public fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): CfnTrigger.ActionProperty = cdkBuilder.build()
}
