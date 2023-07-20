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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.RuleScope
import kotlin.String

@CdkDslMarker
public class RuleScopeDsl {
    private val cdkBuilder: RuleScope.Builder = RuleScope.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun scope(scope: ISecurityGroup) {
        cdkBuilder.scope(scope)
    }

    public fun build(): RuleScope = cdkBuilder.build()
}
