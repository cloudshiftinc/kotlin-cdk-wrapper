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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * The SAML Identity Provider's information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * IdpProperty idpProperty = IdpProperty.builder()
 * .entityId("entityId")
 * .metadataContent("metadataContent")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-idp.html)
 */
@CdkDslMarker
public class CfnDomainIdpPropertyDsl {
    private val cdkBuilder: CfnDomain.IdpProperty.Builder = CfnDomain.IdpProperty.builder()

    /** @param entityId The unique entity ID of the application in the SAML identity provider. */
    public fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
    }

    /** @param metadataContent The metadata of the SAML application, in XML format. */
    public fun metadataContent(metadataContent: String) {
        cdkBuilder.metadataContent(metadataContent)
    }

    public fun build(): CfnDomain.IdpProperty = cdkBuilder.build()
}
