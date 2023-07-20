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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.transfer.CfnConnector
import kotlin.String

@CdkDslMarker
public class CfnConnectorAs2ConfigPropertyDsl {
    private val cdkBuilder: CfnConnector.As2ConfigProperty.Builder =
        CfnConnector.As2ConfigProperty.builder()

    public fun compression(compression: String) {
        cdkBuilder.compression(compression)
    }

    public fun encryptionAlgorithm(encryptionAlgorithm: String) {
        cdkBuilder.encryptionAlgorithm(encryptionAlgorithm)
    }

    public fun localProfileId(localProfileId: String) {
        cdkBuilder.localProfileId(localProfileId)
    }

    public fun mdnResponse(mdnResponse: String) {
        cdkBuilder.mdnResponse(mdnResponse)
    }

    public fun mdnSigningAlgorithm(mdnSigningAlgorithm: String) {
        cdkBuilder.mdnSigningAlgorithm(mdnSigningAlgorithm)
    }

    public fun messageSubject(messageSubject: String) {
        cdkBuilder.messageSubject(messageSubject)
    }

    public fun partnerProfileId(partnerProfileId: String) {
        cdkBuilder.partnerProfileId(partnerProfileId)
    }

    public fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    public fun build(): CfnConnector.As2ConfigProperty = cdkBuilder.build()
}
