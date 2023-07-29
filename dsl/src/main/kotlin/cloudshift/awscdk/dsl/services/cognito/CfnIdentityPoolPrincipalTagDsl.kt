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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag
import software.constructs.Construct

/**
 * A list of the identity pool principal tag assignments for attributes for access control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * Object principalTags;
 * CfnIdentityPoolPrincipalTag cfnIdentityPoolPrincipalTag =
 * CfnIdentityPoolPrincipalTag.Builder.create(this, "MyCfnIdentityPoolPrincipalTag")
 * .identityPoolId("identityPoolId")
 * .identityProviderName("identityProviderName")
 * // the properties below are optional
 * .principalTags(principalTags)
 * .useDefaults(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html)
 */
@CdkDslMarker
public class CfnIdentityPoolPrincipalTagDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIdentityPoolPrincipalTag.Builder =
        CfnIdentityPoolPrincipalTag.Builder.create(scope, id)

    /**
     * The identity pool that you want to associate with this principal tag map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identitypoolid)
     *
     * @param identityPoolId The identity pool that you want to associate with this principal tag
     *   map.
     */
    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * The identity pool identity provider (IdP) that you want to associate with this principal tag
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-identityprovidername)
     *
     * @param identityProviderName The identity pool identity provider (IdP) that you want to
     *   associate with this principal tag map.
     */
    public fun identityProviderName(identityProviderName: String) {
        cdkBuilder.identityProviderName(identityProviderName)
    }

    /**
     * A JSON-formatted list of user claims and the principal tags that you want to associate with
     * them.
     *
     * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
     * of the user's claim.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-principaltags)
     *
     * @param principalTags A JSON-formatted list of user claims and the principal tags that you
     *   want to associate with them.
     */
    public fun principalTags(principalTags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(principalTags)
        cdkBuilder.principalTags(builder.map)
    }

    /**
     * A JSON-formatted list of user claims and the principal tags that you want to associate with
     * them.
     *
     * When Amazon Cognito requests credentials, it sets the value of the principal tag to the value
     * of the user's claim.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-principaltags)
     *
     * @param principalTags A JSON-formatted list of user claims and the principal tags that you
     *   want to associate with them.
     */
    public fun principalTags(principalTags: Any) {
        cdkBuilder.principalTags(principalTags)
    }

    /**
     * Use a default set of mappings between claims and tags for this provider, instead of a custom
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
     *
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     *   instead of a custom map.
     */
    public fun useDefaults(useDefaults: Boolean) {
        cdkBuilder.useDefaults(useDefaults)
    }

    /**
     * Use a default set of mappings between claims and tags for this provider, instead of a custom
     * map.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html#cfn-cognito-identitypoolprincipaltag-usedefaults)
     *
     * @param useDefaults Use a default set of mappings between claims and tags for this provider,
     *   instead of a custom map.
     */
    public fun useDefaults(useDefaults: IResolvable) {
        cdkBuilder.useDefaults(useDefaults)
    }

    public fun build(): CfnIdentityPoolPrincipalTag = cdkBuilder.build()
}
