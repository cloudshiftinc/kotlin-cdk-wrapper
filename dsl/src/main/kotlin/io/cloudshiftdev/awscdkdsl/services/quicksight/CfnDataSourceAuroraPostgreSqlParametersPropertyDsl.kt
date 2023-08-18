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
 * Parameters for Amazon Aurora PostgreSQL-Compatible Edition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AuroraPostgreSqlParametersProperty auroraPostgreSqlParametersProperty =
 * AuroraPostgreSqlParametersProperty.builder()
 * .database("database")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-aurorapostgresqlparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceAuroraPostgreSqlParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.AuroraPostgreSqlParametersProperty.Builder =
        CfnDataSource.AuroraPostgreSqlParametersProperty.builder()

    /** @param database The Amazon Aurora PostgreSQL database to connect to. */
    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    /** @param host The Amazon Aurora PostgreSQL-Compatible host to connect to. */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /** @param port The port that Amazon Aurora PostgreSQL is listening on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.AuroraPostgreSqlParametersProperty = cdkBuilder.build()
}
