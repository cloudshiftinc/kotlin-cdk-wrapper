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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import kotlin.String

@CdkDslMarker
public class CfnIntegrationS3SourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.S3SourcePropertiesProperty.Builder =
        CfnIntegration.S3SourcePropertiesProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun build(): CfnIntegration.S3SourcePropertiesProperty = cdkBuilder.build()
}
