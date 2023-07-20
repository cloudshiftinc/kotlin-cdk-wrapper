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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.waf.regional.CfnWebACLAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnWebACLAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWebACLAssociation.Builder = CfnWebACLAssociation.Builder.create(
        scope,
        id,
    )

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
    }

    public fun build(): CfnWebACLAssociation = cdkBuilder.build()
}
