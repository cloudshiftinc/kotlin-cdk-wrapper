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

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary

@CdkDslMarker
public class CfnCanaryArtifactConfigPropertyDsl {
    private val cdkBuilder: CfnCanary.ArtifactConfigProperty.Builder =
        CfnCanary.ArtifactConfigProperty.builder()

    public fun s3Encryption(s3Encryption: IResolvable) {
        cdkBuilder.s3Encryption(s3Encryption)
    }

    public fun s3Encryption(s3Encryption: CfnCanary.S3EncryptionProperty) {
        cdkBuilder.s3Encryption(s3Encryption)
    }

    public fun build(): CfnCanary.ArtifactConfigProperty = cdkBuilder.build()
}
