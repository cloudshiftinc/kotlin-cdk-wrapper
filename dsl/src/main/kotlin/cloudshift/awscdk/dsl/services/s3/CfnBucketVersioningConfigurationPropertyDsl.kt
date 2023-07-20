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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.String

@CdkDslMarker
public class CfnBucketVersioningConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.VersioningConfigurationProperty.Builder =
        CfnBucket.VersioningConfigurationProperty.builder()

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.VersioningConfigurationProperty = cdkBuilder.build()
}
