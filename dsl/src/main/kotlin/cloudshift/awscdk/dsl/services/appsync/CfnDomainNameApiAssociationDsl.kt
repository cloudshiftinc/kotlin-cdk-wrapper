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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation
import software.constructs.Construct

/**
 * The `AWS::AppSync::DomainNameApiAssociation` resource represents the mapping of your custom
 * domain name to the assigned API URL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * CfnDomainNameApiAssociation cfnDomainNameApiAssociation =
 * CfnDomainNameApiAssociation.Builder.create(this, "MyCfnDomainNameApiAssociation")
 * .apiId("apiId")
 * .domainName("domainName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html)
 */
@CdkDslMarker
public class CfnDomainNameApiAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomainNameApiAssociation.Builder =
        CfnDomainNameApiAssociation.Builder.create(scope, id)

    /**
     * The API ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-apiid)
     *
     * @param apiId The API ID.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-domainnameapiassociation.html#cfn-appsync-domainnameapiassociation-domainname)
     *
     * @param domainName The domain name.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CfnDomainNameApiAssociation = cdkBuilder.build()
}
