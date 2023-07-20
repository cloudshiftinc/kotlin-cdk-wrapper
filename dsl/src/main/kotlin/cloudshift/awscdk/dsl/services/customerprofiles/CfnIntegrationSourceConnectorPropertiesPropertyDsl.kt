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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationSourceConnectorPropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.SourceConnectorPropertiesProperty.Builder =
        CfnIntegration.SourceConnectorPropertiesProperty.builder()

    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    public fun marketo(marketo: CfnIntegration.MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo)
    }

    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    public fun s3(s3: CfnIntegration.S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3)
    }

    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    public fun salesforce(salesforce: CfnIntegration.SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce)
    }

    public fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow)
    }

    public fun serviceNow(serviceNow: CfnIntegration.ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow)
    }

    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun zendesk(zendesk: CfnIntegration.ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnIntegration.SourceConnectorPropertiesProperty = cdkBuilder.build()
}
