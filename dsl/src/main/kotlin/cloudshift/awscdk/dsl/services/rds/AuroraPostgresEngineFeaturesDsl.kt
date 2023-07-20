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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures
import kotlin.Boolean

@CdkDslMarker
public class AuroraPostgresEngineFeaturesDsl {
    private val cdkBuilder: AuroraPostgresEngineFeatures.Builder =
        AuroraPostgresEngineFeatures.builder()

    public fun s3Export(s3Export: Boolean) {
        cdkBuilder.s3Export(s3Export)
    }

    public fun s3Import(s3Import: Boolean) {
        cdkBuilder.s3Import(s3Import)
    }

    public fun build(): AuroraPostgresEngineFeatures = cdkBuilder.build()
}
