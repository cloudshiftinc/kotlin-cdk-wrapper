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
 * The parameters that are required to connect to a Trino data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TrinoParametersProperty trinoParametersProperty = TrinoParametersProperty.builder()
 * .catalog("catalog")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-trinoparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceTrinoParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.TrinoParametersProperty.Builder =
        CfnDataSource.TrinoParametersProperty.builder()

    /** @param catalog The catalog name for the Trino data source. */
    public fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
    }

    /** @param host The host name of the Trino data source. */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /** @param port The port for the Trino data source. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.TrinoParametersProperty = cdkBuilder.build()
}
