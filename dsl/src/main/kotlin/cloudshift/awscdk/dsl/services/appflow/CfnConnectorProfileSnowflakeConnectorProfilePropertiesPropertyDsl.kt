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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnConnectorProfile
import kotlin.String

@CdkDslMarker
public class CfnConnectorProfileSnowflakeConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder: CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.builder()

    public fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
    }

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun privateLinkServiceName(privateLinkServiceName: String) {
        cdkBuilder.privateLinkServiceName(privateLinkServiceName)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    public fun warehouse(warehouse: String) {
        cdkBuilder.warehouse(warehouse)
    }

    public fun build(): CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
