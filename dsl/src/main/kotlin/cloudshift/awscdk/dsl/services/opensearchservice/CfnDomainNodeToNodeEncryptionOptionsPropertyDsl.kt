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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import kotlin.Boolean

@CdkDslMarker
public class CfnDomainNodeToNodeEncryptionOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder =
        CfnDomain.NodeToNodeEncryptionOptionsProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnDomain.NodeToNodeEncryptionOptionsProperty = cdkBuilder.build()
}
