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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceAmazonOpenSearchParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.AmazonOpenSearchParametersProperty.Builder =
        CfnDataSource.AmazonOpenSearchParametersProperty.builder()

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun build(): CfnDataSource.AmazonOpenSearchParametersProperty = cdkBuilder.build()
}
