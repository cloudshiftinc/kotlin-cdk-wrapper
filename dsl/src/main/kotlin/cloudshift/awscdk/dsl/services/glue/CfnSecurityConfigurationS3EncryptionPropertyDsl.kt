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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import kotlin.String

@CdkDslMarker
public class CfnSecurityConfigurationS3EncryptionPropertyDsl {
    private val cdkBuilder: CfnSecurityConfiguration.S3EncryptionProperty.Builder =
        CfnSecurityConfiguration.S3EncryptionProperty.builder()

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun s3EncryptionMode(s3EncryptionMode: String) {
        cdkBuilder.s3EncryptionMode(s3EncryptionMode)
    }

    public fun build(): CfnSecurityConfiguration.S3EncryptionProperty = cdkBuilder.build()
}
