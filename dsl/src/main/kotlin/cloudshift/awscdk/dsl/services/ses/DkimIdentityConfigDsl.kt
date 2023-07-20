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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.DkimIdentityConfig
import software.amazon.awscdk.services.ses.EasyDkimSigningKeyLength
import kotlin.String

@CdkDslMarker
public class DkimIdentityConfigDsl {
    private val cdkBuilder: DkimIdentityConfig.Builder = DkimIdentityConfig.builder()

    public fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
        cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
    }

    public fun domainSigningSelector(domainSigningSelector: String) {
        cdkBuilder.domainSigningSelector(domainSigningSelector)
    }

    public fun nextSigningKeyLength(nextSigningKeyLength: EasyDkimSigningKeyLength) {
        cdkBuilder.nextSigningKeyLength(nextSigningKeyLength)
    }

    public fun build(): DkimIdentityConfig = cdkBuilder.build()
}
