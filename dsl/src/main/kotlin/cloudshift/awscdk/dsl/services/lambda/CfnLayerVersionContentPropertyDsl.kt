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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import kotlin.String

@CdkDslMarker
public class CfnLayerVersionContentPropertyDsl {
    private val cdkBuilder: CfnLayerVersion.ContentProperty.Builder =
        CfnLayerVersion.ContentProperty.builder()

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
    }

    public fun build(): CfnLayerVersion.ContentProperty = cdkBuilder.build()
}
