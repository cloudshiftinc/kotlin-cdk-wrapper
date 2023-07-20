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

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEndpointNeptuneSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.NeptuneSettingsProperty.Builder =
        CfnEndpoint.NeptuneSettingsProperty.builder()

    public fun errorRetryDuration(errorRetryDuration: Number) {
        cdkBuilder.errorRetryDuration(errorRetryDuration)
    }

    public fun iamAuthEnabled(iamAuthEnabled: Boolean) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled)
    }

    public fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
        cdkBuilder.iamAuthEnabled(iamAuthEnabled)
    }

    public fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
    }

    public fun maxRetryCount(maxRetryCount: Number) {
        cdkBuilder.maxRetryCount(maxRetryCount)
    }

    public fun s3BucketFolder(s3BucketFolder: String) {
        cdkBuilder.s3BucketFolder(s3BucketFolder)
    }

    public fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
    }

    public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
    }

    public fun build(): CfnEndpoint.NeptuneSettingsProperty = cdkBuilder.build()
}
