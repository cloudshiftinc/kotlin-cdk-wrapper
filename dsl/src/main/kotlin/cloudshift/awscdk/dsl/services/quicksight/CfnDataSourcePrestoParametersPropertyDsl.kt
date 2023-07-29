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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for Presto.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PrestoParametersProperty prestoParametersProperty = PrestoParametersProperty.builder()
 * .catalog("catalog")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-prestoparameters.html)
 */
@CdkDslMarker
public class CfnDataSourcePrestoParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.PrestoParametersProperty.Builder =
        CfnDataSource.PrestoParametersProperty.builder()

    /** @param catalog Catalog. */
    public fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
    }

    /** @param host Host. */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /** @param port Port. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.PrestoParametersProperty = cdkBuilder.build()
}
