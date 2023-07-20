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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationCatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.CatalogConfigurationProperty.Builder =
        CfnApplication.CatalogConfigurationProperty.builder()

    public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
    }

    public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: CfnApplication.GlueDataCatalogConfigurationProperty) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
    }

    public fun build(): CfnApplication.CatalogConfigurationProperty = cdkBuilder.build()
}
