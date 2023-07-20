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

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import kotlin.String

@CdkDslMarker
public class CfnFHIRDatastoreKmsEncryptionConfigPropertyDsl {
    private val cdkBuilder: CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder =
        CfnFHIRDatastore.KmsEncryptionConfigProperty.builder()

    public fun cmkType(cmkType: String) {
        cdkBuilder.cmkType(cmkType)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnFHIRDatastore.KmsEncryptionConfigProperty = cdkBuilder.build()
}
