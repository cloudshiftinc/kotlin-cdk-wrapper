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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationGlueDataCatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.GlueDataCatalogConfigurationProperty.Builder =
        CfnApplication.GlueDataCatalogConfigurationProperty.builder()

    public fun databaseArn(databaseArn: String) {
        cdkBuilder.databaseArn(databaseArn)
    }

    public fun build(): CfnApplication.GlueDataCatalogConfigurationProperty = cdkBuilder.build()
}
