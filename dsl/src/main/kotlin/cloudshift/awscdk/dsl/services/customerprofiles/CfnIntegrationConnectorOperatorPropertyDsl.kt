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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import kotlin.String

@CdkDslMarker
public class CfnIntegrationConnectorOperatorPropertyDsl {
    private val cdkBuilder: CfnIntegration.ConnectorOperatorProperty.Builder =
        CfnIntegration.ConnectorOperatorProperty.builder()

    public fun marketo(marketo: String) {
        cdkBuilder.marketo(marketo)
    }

    public fun s3(s3: String) {
        cdkBuilder.s3(s3)
    }

    public fun salesforce(salesforce: String) {
        cdkBuilder.salesforce(salesforce)
    }

    public fun serviceNow(serviceNow: String) {
        cdkBuilder.serviceNow(serviceNow)
    }

    public fun zendesk(zendesk: String) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnIntegration.ConnectorOperatorProperty = cdkBuilder.build()
}
