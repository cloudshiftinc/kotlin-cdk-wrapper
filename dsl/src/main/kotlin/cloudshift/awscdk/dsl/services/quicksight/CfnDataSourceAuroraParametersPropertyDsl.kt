@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.Number
import kotlin.String

/**
 * Parameters for Amazon Aurora.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AuroraParametersProperty auroraParametersProperty = AuroraParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-auroraparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceAuroraParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.AuroraParametersProperty.Builder =
        CfnDataSource.AuroraParametersProperty.builder()

    /**
     * @param database Database.
     */
    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    /**
     * @param host Host.
     */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /**
     * @param port Port.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.AuroraParametersProperty = cdkBuilder.build()
}
