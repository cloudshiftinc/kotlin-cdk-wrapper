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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetEventDestinationSnsDestinationPropertyDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.SnsDestinationProperty.builder()

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnConfigurationSetEventDestination.SnsDestinationProperty =
        cdkBuilder.build()
}
