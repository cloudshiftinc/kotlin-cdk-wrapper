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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnModelBiasJobDefinitionS3OutputPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.S3OutputProperty.Builder =
        CfnModelBiasJobDefinition.S3OutputProperty.builder()

    public fun localPath(localPath: String) {
        cdkBuilder.localPath(localPath)
    }

    public fun s3UploadMode(s3UploadMode: String) {
        cdkBuilder.s3UploadMode(s3UploadMode)
    }

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelBiasJobDefinition.S3OutputProperty = cdkBuilder.build()
}
