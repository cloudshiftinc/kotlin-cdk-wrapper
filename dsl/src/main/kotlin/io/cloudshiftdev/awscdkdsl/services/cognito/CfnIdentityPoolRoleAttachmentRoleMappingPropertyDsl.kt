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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment

/**
 * One of a set of `RoleMappings` , a property of the
 * [AWS::Cognito::IdentityPoolRoleAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
 * resource that defines the role-mapping attributes of an Amazon Cognito identity pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * RoleMappingProperty roleMappingProperty = RoleMappingProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .ambiguousRoleResolution("ambiguousRoleResolution")
 * .identityProvider("identityProvider")
 * .rulesConfiguration(RulesConfigurationTypeProperty.builder()
 * .rules(List.of(MappingRuleProperty.builder()
 * .claim("claim")
 * .matchType("matchType")
 * .roleArn("roleArn")
 * .value("value")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
 */
@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentRoleMappingPropertyDsl {
    private val cdkBuilder: CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder =
        CfnIdentityPoolRoleAttachment.RoleMappingProperty.builder()

    /**
     * @param ambiguousRoleResolution If you specify Token or Rules as the `Type` ,
     *   `AmbiguousRoleResolution` is required. Specifies the action to be taken if either no rules
     *   match the claim value for the `Rules` type, or there is no `cognito:preferred_role` claim
     *   and there are multiple `cognito:roles` matches for the `Token` type.
     */
    public fun ambiguousRoleResolution(ambiguousRoleResolution: String) {
        cdkBuilder.ambiguousRoleResolution(ambiguousRoleResolution)
    }

    /**
     * @param identityProvider Identifier for the identity provider for which the role is mapped.
     *   For example: `graph.facebook.com` or
     *   `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id
     *   (http://cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id)` . This is
     *   the identity provider that is used by the user for authentication.
     *
     * If the identity provider property isn't provided, the key of the entry in the `RoleMappings`
     * map is used as the identity provider.
     */
    public fun identityProvider(identityProvider: String) {
        cdkBuilder.identityProvider(identityProvider)
    }

    /**
     * @param rulesConfiguration The rules to be used for mapping users to roles. If you specify
     *   "Rules" as the role-mapping type, RulesConfiguration is required.
     */
    public fun rulesConfiguration(rulesConfiguration: IResolvable) {
        cdkBuilder.rulesConfiguration(rulesConfiguration)
    }

    /**
     * @param rulesConfiguration The rules to be used for mapping users to roles. If you specify
     *   "Rules" as the role-mapping type, RulesConfiguration is required.
     */
    public fun rulesConfiguration(
        rulesConfiguration: CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty
    ) {
        cdkBuilder.rulesConfiguration(rulesConfiguration)
    }

    /**
     * @param type The role mapping type. Token will use `cognito:roles` and
     *   `cognito:preferred_role` claims from the Cognito identity provider token to map groups to
     *   roles. Rules will attempt to match claims from the token to map to a role.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnIdentityPoolRoleAttachment.RoleMappingProperty = cdkBuilder.build()
}
