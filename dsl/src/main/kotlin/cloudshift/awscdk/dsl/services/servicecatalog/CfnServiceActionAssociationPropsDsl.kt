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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnServiceActionAssociationPropsDsl {
    private val cdkBuilder: CfnServiceActionAssociationProps.Builder =
        CfnServiceActionAssociationProps.builder()

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    public fun serviceActionId(serviceActionId: String) {
        cdkBuilder.serviceActionId(serviceActionId)
    }

    public fun build(): CfnServiceActionAssociationProps = cdkBuilder.build()
}
