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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2CatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.CatalogConfigurationProperty.Builder =
        CfnApplicationV2.CatalogConfigurationProperty.builder()

    public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
    }

    public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: CfnApplicationV2.GlueDataCatalogConfigurationProperty) {
        cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
    }

    public fun build(): CfnApplicationV2.CatalogConfigurationProperty = cdkBuilder.build()
}
