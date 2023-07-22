@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures

/**
 * Features supported by this version of the Aurora Postgres cluster engine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * AuroraPostgresEngineFeatures auroraPostgresEngineFeatures =
 * AuroraPostgresEngineFeatures.builder()
 * .s3Export(false)
 * .s3Import(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class AuroraPostgresEngineFeaturesDsl {
  private val cdkBuilder: AuroraPostgresEngineFeatures.Builder =
      AuroraPostgresEngineFeatures.builder()

  /**
   * @param s3Export Whether this version of the Aurora Postgres cluster engine supports the S3 data
   * export feature.
   */
  public fun s3Export(s3Export: Boolean) {
    cdkBuilder.s3Export(s3Export)
  }

  /**
   * @param s3Import Whether this version of the Aurora Postgres cluster engine supports the S3 data
   * import feature.
   */
  public fun s3Import(s3Import: Boolean) {
    cdkBuilder.s3Import(s3Import)
  }

  public fun build(): AuroraPostgresEngineFeatures = cdkBuilder.build()
}
