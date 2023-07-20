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
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import kotlin.String

@CdkDslMarker
public class CfnEmailIdentityDkimSigningAttributesPropertyDsl {
    private val cdkBuilder: CfnEmailIdentity.DkimSigningAttributesProperty.Builder =
        CfnEmailIdentity.DkimSigningAttributesProperty.builder()

    public fun domainSigningPrivateKey(domainSigningPrivateKey: String) {
        cdkBuilder.domainSigningPrivateKey(domainSigningPrivateKey)
    }

    public fun domainSigningSelector(domainSigningSelector: String) {
        cdkBuilder.domainSigningSelector(domainSigningSelector)
    }

    public fun nextSigningKeyLength(nextSigningKeyLength: String) {
        cdkBuilder.nextSigningKeyLength(nextSigningKeyLength)
    }

    public fun build(): CfnEmailIdentity.DkimSigningAttributesProperty = cdkBuilder.build()
}
