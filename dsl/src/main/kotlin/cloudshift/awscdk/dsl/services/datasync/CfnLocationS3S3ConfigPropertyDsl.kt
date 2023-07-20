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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.datasync.CfnLocationS3
import kotlin.String

@CdkDslMarker
public class CfnLocationS3S3ConfigPropertyDsl {
    private val cdkBuilder: CfnLocationS3.S3ConfigProperty.Builder =
        CfnLocationS3.S3ConfigProperty.builder()

    public fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
    }

    public fun build(): CfnLocationS3.S3ConfigProperty = cdkBuilder.build()
}
