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

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.location.CfnPlaceIndex
import software.amazon.awscdk.services.location.CfnPlaceIndexProps
import kotlin.String

@CdkDslMarker
public class CfnPlaceIndexPropsDsl {
    private val cdkBuilder: CfnPlaceIndexProps.Builder = CfnPlaceIndexProps.builder()

    public fun dataSource(dataSource: String) {
        cdkBuilder.dataSource(dataSource)
    }

    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
        cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
    }

    public fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty) {
        cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    public fun build(): CfnPlaceIndexProps = cdkBuilder.build()
}
