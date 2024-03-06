@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters that are required to connect to a Starburst data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * StarburstParametersProperty starburstParametersProperty = StarburstParametersProperty.builder()
 * .catalog("catalog")
 * .host("host")
 * .port(123)
 * // the properties below are optional
 * .productType("productType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-starburstparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceStarburstParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.StarburstParametersProperty.Builder =
        CfnDataSource.StarburstParametersProperty.builder()

    /** @param catalog The catalog name for the Starburst data source. */
    public fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
    }

    /** @param host The host name of the Starburst data source. */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /** @param port The port for the Starburst data source. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param productType The product type for the Starburst data source. */
    public fun productType(productType: String) {
        cdkBuilder.productType(productType)
    }

    public fun build(): CfnDataSource.StarburstParametersProperty = cdkBuilder.build()
}
