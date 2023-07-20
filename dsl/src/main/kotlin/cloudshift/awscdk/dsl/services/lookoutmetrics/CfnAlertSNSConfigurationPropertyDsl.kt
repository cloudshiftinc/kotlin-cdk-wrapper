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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import kotlin.String

@CdkDslMarker
public class CfnAlertSNSConfigurationPropertyDsl {
    private val cdkBuilder: CfnAlert.SNSConfigurationProperty.Builder =
        CfnAlert.SNSConfigurationProperty.builder()

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnAlert.SNSConfigurationProperty = cdkBuilder.build()
}
