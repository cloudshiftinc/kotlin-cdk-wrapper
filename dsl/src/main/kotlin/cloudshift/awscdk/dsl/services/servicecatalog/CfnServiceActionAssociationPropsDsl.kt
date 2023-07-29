@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps

/**
 * Properties for defining a `CfnServiceActionAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnServiceActionAssociationProps cfnServiceActionAssociationProps =
 * CfnServiceActionAssociationProps.builder()
 * .productId("productId")
 * .provisioningArtifactId("provisioningArtifactId")
 * .serviceActionId("serviceActionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html)
 */
@CdkDslMarker
public class CfnServiceActionAssociationPropsDsl {
    private val cdkBuilder: CfnServiceActionAssociationProps.Builder =
        CfnServiceActionAssociationProps.builder()

    /** @param productId The product identifier. For example, `prod-abcdzk7xy33qa` . */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * @param provisioningArtifactId The identifier of the provisioning artifact. For example,
     *   `pa-4abcdjnxjj6ne` .
     */
    public fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    /**
     * @param serviceActionId The self-service action identifier. For example, `act-fs7abcd89wxyz` .
     */
    public fun serviceActionId(serviceActionId: String) {
        cdkBuilder.serviceActionId(serviceActionId)
    }

    public fun build(): CfnServiceActionAssociationProps = cdkBuilder.build()
}
