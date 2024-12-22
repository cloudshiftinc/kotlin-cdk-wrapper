@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnUserPoolResourceServer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnUserPoolResourceServerProps cfnUserPoolResourceServerProps =
 * CfnUserPoolResourceServerProps.builder()
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
public interface CfnUserPoolResourceServerProps {
  /**
   * A unique resource server identifier for the resource server.
   *
   * The identifier can be an API friendly name like `solar-system-data` . You can also set an API
   * URL like `https://solar-system-data-api.example.com` as your identifier.
   *
   * Amazon Cognito represents scopes in the access token in the format
   * `$resource-server-identifier/$scope` . Longer scope-identifier strings increase the size of your
   * access tokens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-identifier)
   */
  public fun identifier(): String

  /**
   * A friendly name for the resource server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-name)
   */
  public fun name(): String

  /**
   * A list of scopes.
   *
   * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
   */
  public fun scopes(): Any? = unwrap(this).getScopes()

  /**
   * The user pool ID for the user pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-userpoolid)
   */
  public fun userPoolId(): String

  /**
   * A builder for [CfnUserPoolResourceServerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param identifier A unique resource server identifier for the resource server. 
     * The identifier can be an API friendly name like `solar-system-data` . You can also set an API
     * URL like `https://solar-system-data-api.example.com` as your identifier.
     *
     * Amazon Cognito represents scopes in the access token in the format
     * `$resource-server-identifier/$scope` . Longer scope-identifier strings increase the size of your
     * access tokens.
     */
    public fun identifier(identifier: String)

    /**
     * @param name A friendly name for the resource server. 
     */
    public fun name(name: String)

    /**
     * @param scopes A list of scopes.
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     */
    public fun scopes(scopes: IResolvable)

    /**
     * @param scopes A list of scopes.
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     */
    public fun scopes(scopes: List<Any>)

    /**
     * @param scopes A list of scopes.
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     */
    public fun scopes(vararg scopes: Any)

    /**
     * @param userPoolId The user pool ID for the user pool. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps.builder()

    /**
     * @param identifier A unique resource server identifier for the resource server. 
     * The identifier can be an API friendly name like `solar-system-data` . You can also set an API
     * URL like `https://solar-system-data-api.example.com` as your identifier.
     *
     * Amazon Cognito represents scopes in the access token in the format
     * `$resource-server-identifier/$scope` . Longer scope-identifier strings increase the size of your
     * access tokens.
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * @param name A friendly name for the resource server. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param scopes A list of scopes.
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     */
    override fun scopes(scopes: IResolvable) {
      cdkBuilder.scopes(scopes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scopes A list of scopes.
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     */
    override fun scopes(scopes: List<Any>) {
      cdkBuilder.scopes(scopes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param scopes A list of scopes.
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     */
    override fun scopes(vararg scopes: Any): Unit = scopes(scopes.toList())

    /**
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps,
  ) : CdkObject(cdkObject),
      CfnUserPoolResourceServerProps {
    /**
     * A unique resource server identifier for the resource server.
     *
     * The identifier can be an API friendly name like `solar-system-data` . You can also set an API
     * URL like `https://solar-system-data-api.example.com` as your identifier.
     *
     * Amazon Cognito represents scopes in the access token in the format
     * `$resource-server-identifier/$scope` . Longer scope-identifier strings increase the size of your
     * access tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-identifier)
     */
    override fun identifier(): String = unwrap(this).getIdentifier()

    /**
     * A friendly name for the resource server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     */
    override fun scopes(): Any? = unwrap(this).getScopes()

    /**
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-userpoolid)
     */
    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserPoolResourceServerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps):
        CfnUserPoolResourceServerProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnUserPoolResourceServerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolResourceServerProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
  }
}
