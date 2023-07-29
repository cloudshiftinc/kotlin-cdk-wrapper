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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps

/**
 * Properties for defining a `CfnIdentityPoolRoleAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * Object roles;
 * CfnIdentityPoolRoleAttachmentProps cfnIdentityPoolRoleAttachmentProps =
 * CfnIdentityPoolRoleAttachmentProps.builder()
 * .identityPoolId("identityPoolId")
 * // the properties below are optional
 * .roleMappings(Map.of(
 * "roleMappingsKey", RoleMappingProperty.builder()
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
 * .build()))
 * .roles(roles)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
 */
@CdkDslMarker
public class CfnIdentityPoolRoleAttachmentPropsDsl {
    private val cdkBuilder: CfnIdentityPoolRoleAttachmentProps.Builder =
        CfnIdentityPoolRoleAttachmentProps.builder()

    /** @param identityPoolId An identity pool ID in the format `REGION:GUID` . */
    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param roleMappings How users for a specific identity provider are mapped to roles. This is a
     *   string to the `RoleMapping` object map. The string identifies the identity provider. For
     *   example: `graph.facebook.com` or
     *   `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the
     * [RoleMapping property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     */
    public fun roleMappings(roleMappings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(roleMappings)
        cdkBuilder.roleMappings(builder.map)
    }

    /**
     * @param roleMappings How users for a specific identity provider are mapped to roles. This is a
     *   string to the `RoleMapping` object map. The string identifies the identity provider. For
     *   example: `graph.facebook.com` or
     *   `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the
     * [RoleMapping property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     */
    public fun roleMappings(roleMappings: Map<String, Any>) {
        cdkBuilder.roleMappings(roleMappings)
    }

    /**
     * @param roleMappings How users for a specific identity provider are mapped to roles. This is a
     *   string to the `RoleMapping` object map. The string identifies the identity provider. For
     *   example: `graph.facebook.com` or
     *   `cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id` .
     *
     * If the `IdentityProvider` field isn't provided in this object, the string is used as the
     * identity provider name.
     *
     * For more information, see the
     * [RoleMapping property](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * .
     */
    public fun roleMappings(roleMappings: IResolvable) {
        cdkBuilder.roleMappings(roleMappings)
    }

    /**
     * @param roles The map of the roles associated with this pool. For a given role, the key is
     *   either "authenticated" or "unauthenticated". The value is the role ARN.
     */
    public fun roles(roles: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(roles)
        cdkBuilder.roles(builder.map)
    }

    /**
     * @param roles The map of the roles associated with this pool. For a given role, the key is
     *   either "authenticated" or "unauthenticated". The value is the role ARN.
     */
    public fun roles(roles: Any) {
        cdkBuilder.roles(roles)
    }

    public fun build(): CfnIdentityPoolRoleAttachmentProps = cdkBuilder.build()
}
