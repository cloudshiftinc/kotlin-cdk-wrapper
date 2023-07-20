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
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import kotlin.String

@CdkDslMarker
public class CfnDomainIdpPropertyDsl {
    private val cdkBuilder: CfnDomain.IdpProperty.Builder = CfnDomain.IdpProperty.builder()

    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    public fun metadataContent(metadataContent: String) {
        cdkBuilder.metadataContent(metadataContent)
    }

    public fun build(): CfnDomain.IdpProperty = cdkBuilder.build()
}
