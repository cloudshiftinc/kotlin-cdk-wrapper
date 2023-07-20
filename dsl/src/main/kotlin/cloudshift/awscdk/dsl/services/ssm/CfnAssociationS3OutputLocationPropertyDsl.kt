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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.CfnAssociation
import kotlin.String

@CdkDslMarker
public class CfnAssociationS3OutputLocationPropertyDsl {
    private val cdkBuilder: CfnAssociation.S3OutputLocationProperty.Builder =
        CfnAssociation.S3OutputLocationProperty.builder()

    public fun outputS3BucketName(outputS3BucketName: String) {
        cdkBuilder.outputS3BucketName(outputS3BucketName)
    }

    public fun outputS3KeyPrefix(outputS3KeyPrefix: String) {
        cdkBuilder.outputS3KeyPrefix(outputS3KeyPrefix)
    }

    public fun outputS3Region(outputS3Region: String) {
        cdkBuilder.outputS3Region(outputS3Region)
    }

    public fun build(): CfnAssociation.S3OutputLocationProperty = cdkBuilder.build()
}
