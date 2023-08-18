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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.rds.PostgresEngineFeatures

/**
 * Features supported by the Postgres database engine.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * PostgresEngineFeatures postgresEngineFeatures = PostgresEngineFeatures.builder()
 * .s3Export(false)
 * .s3Import(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class PostgresEngineFeaturesDsl {
    private val cdkBuilder: PostgresEngineFeatures.Builder = PostgresEngineFeatures.builder()

    /**
     * @param s3Export Whether this version of the Postgres engine supports the S3 data export
     *   feature.
     */
    public fun s3Export(s3Export: Boolean) {
        cdkBuilder.s3Export(s3Export)
    }

    /**
     * @param s3Import Whether this version of the Postgres engine supports the S3 data import
     *   feature.
     */
    public fun s3Import(s3Import: Boolean) {
        cdkBuilder.s3Import(s3Import)
    }

    public fun build(): PostgresEngineFeatures = cdkBuilder.build()
}
