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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import kotlin.String

@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentMappingRulePropertyDsl {
    private val cdkBuilder: CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder =
        CfnIdentityPoolRoleAttachment.MappingRuleProperty.builder()

    public fun claim(claim: String) {
        cdkBuilder.claim(claim)
    }

    public fun matchType(matchType: String) {
        cdkBuilder.matchType(matchType)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnIdentityPoolRoleAttachment.MappingRuleProperty = cdkBuilder.build()
}
