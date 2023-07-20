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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import kotlin.String

@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentRoleMappingPropertyDsl {
    private val cdkBuilder: CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder =
        CfnIdentityPoolRoleAttachment.RoleMappingProperty.builder()

    public fun ambiguousRoleResolution(ambiguousRoleResolution: String) {
        cdkBuilder.ambiguousRoleResolution(ambiguousRoleResolution)
    }

    public fun identityProvider(identityProvider: String) {
        cdkBuilder.identityProvider(identityProvider)
    }

    public fun rulesConfiguration(rulesConfiguration: IResolvable) {
        cdkBuilder.rulesConfiguration(rulesConfiguration)
    }

    public fun rulesConfiguration(rulesConfiguration: CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty) {
        cdkBuilder.rulesConfiguration(rulesConfiguration)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnIdentityPoolRoleAttachment.RoleMappingProperty = cdkBuilder.build()
}
