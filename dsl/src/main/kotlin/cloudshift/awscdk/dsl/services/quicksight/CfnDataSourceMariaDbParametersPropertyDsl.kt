@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.Number
import kotlin.String

/**
 * The parameters for MariaDB.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * MariaDbParametersProperty mariaDbParametersProperty = MariaDbParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-mariadbparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceMariaDbParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.MariaDbParametersProperty.Builder =
        CfnDataSource.MariaDbParametersProperty.builder()

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

    public fun build(): CfnDataSource.MariaDbParametersProperty = cdkBuilder.build()
}
