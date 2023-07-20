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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnResolverRuleAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnResolverRuleAssociation.Builder =
        CfnResolverRuleAssociation.Builder.create(scope, id)

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun resolverRuleId(resolverRuleId: String) {
        cdkBuilder.resolverRuleId(resolverRuleId)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnResolverRuleAssociation = cdkBuilder.build()
}
