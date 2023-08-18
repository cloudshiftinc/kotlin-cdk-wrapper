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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
import software.constructs.Construct

/**
 * The `AWS::Cognito::UserPoolResourceServer` resource creates a new OAuth2.0 resource server and
 * defines custom scopes in it.
 *
 * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CfnUserPoolResourceServer cfnUserPoolResourceServer =
 * CfnUserPoolResourceServer.Builder.create(this, "MyCfnUserPoolResourceServer")
 * .identifier("identifier")
 * .name("name")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .scopes(List.of(ResourceServerScopeTypeProperty.builder()
 * .scopeDescription("scopeDescription")
 * .scopeName("scopeName")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html)
 */
@CdkDslMarker
public class CfnUserPoolResourceServerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserPoolResourceServer.Builder =
        CfnUserPoolResourceServer.Builder.create(scope, id)

    private val _scopes: MutableList<Any> = mutableListOf()

    /**
     * A unique resource server identifier for the resource server.
     *
     * This could be an HTTPS endpoint where the resource server is located. For example:
     * `https://my-weather-api.example.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-identifier)
     *
     * @param identifier A unique resource server identifier for the resource server.
     */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /**
     * A friendly name for the resource server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-name)
     *
     * @param name A friendly name for the resource server.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     *
     * @param scopes A list of scopes.
     */
    public fun scopes(vararg scopes: Any) {
        _scopes.addAll(listOf(*scopes))
    }

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     *
     * @param scopes A list of scopes.
     */
    public fun scopes(scopes: Collection<Any>) {
        _scopes.addAll(scopes)
    }

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     *
     * @param scopes A list of scopes.
     */
    public fun scopes(scopes: IResolvable) {
        cdkBuilder.scopes(scopes)
    }

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-userpoolid)
     *
     * @param userPoolId The user pool ID for the user pool.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolResourceServer {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        return cdkBuilder.build()
    }
}
