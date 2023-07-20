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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.redshift.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterLoggingPropertiesPropertyDsl {
    private val cdkBuilder: CfnCluster.LoggingPropertiesProperty.Builder =
        CfnCluster.LoggingPropertiesProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnCluster.LoggingPropertiesProperty = cdkBuilder.build()
}
