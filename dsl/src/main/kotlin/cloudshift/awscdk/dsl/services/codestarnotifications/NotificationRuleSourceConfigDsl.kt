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

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import kotlin.String

@CdkDslMarker
public class NotificationRuleSourceConfigDsl {
    private val cdkBuilder: NotificationRuleSourceConfig.Builder =
        NotificationRuleSourceConfig.builder()

    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): NotificationRuleSourceConfig = cdkBuilder.build()
}
