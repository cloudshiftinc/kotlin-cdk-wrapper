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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.CfnDomainNameApiAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDomainNameApiAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomainNameApiAssociation.Builder =
        CfnDomainNameApiAssociation.Builder.create(scope, id)

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun build(): CfnDomainNameApiAssociation = cdkBuilder.build()
}
