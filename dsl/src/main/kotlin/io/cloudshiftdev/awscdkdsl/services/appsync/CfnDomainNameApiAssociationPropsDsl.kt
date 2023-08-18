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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociationProps

/**
 * Properties for defining a `CfnDomainNameApiAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnDomainNameApiAssociationProps cfnDomainNameApiAssociationProps =
 * CfnDomainNameApiAssociationProps.builder()
 * .apiId("apiId")
 * .domainName("domainName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html)
 */
@CdkDslMarker
public class CfnDomainNameApiAssociationPropsDsl {
    private val cdkBuilder: CfnDomainNameApiAssociationProps.Builder =
        CfnDomainNameApiAssociationProps.builder()

    /** @param apiId The API ID. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /** @param domainName The domain name. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CfnDomainNameApiAssociationProps = cdkBuilder.build()
}
