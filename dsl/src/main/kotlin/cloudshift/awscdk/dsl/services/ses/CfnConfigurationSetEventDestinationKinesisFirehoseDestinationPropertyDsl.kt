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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetEventDestinationKinesisFirehoseDestinationPropertyDsl {
    private val cdkBuilder:
        CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder =
        CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

    public fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
    }

    public fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
    }

    public fun build(): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
        cdkBuilder.build()
}
