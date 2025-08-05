@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::UserPoolResourceServer` resource creates a new OAuth2.0 resource server and
 * defines custom scopes in it.
 *
 *
 * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
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
public open class CfnUserPoolResourceServer(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolResourceServerProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserPoolResourceServerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolResourceServerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolResourceServerProps(props)
  )

  /**
   * A unique resource server identifier for the resource server.
   */
  public open fun identifier(): String = unwrap(this).getIdentifier()

  /**
   * A unique resource server identifier for the resource server.
   */
  public open fun identifier(`value`: String) {
    unwrap(this).setIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A friendly name for the resource server.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A friendly name for the resource server.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of scopes.
   */
  public open fun scopes(): Any? = unwrap(this).getScopes()

  /**
   * A list of scopes.
   */
  public open fun scopes(`value`: IResolvable) {
    unwrap(this).setScopes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of scopes.
   */
  public open fun scopes(`value`: List<Any>) {
    unwrap(this).setScopes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of scopes.
   */
  public open fun scopes(vararg `value`: Any): Unit = scopes(`value`.toList())

  /**
   * The ID of the user pool where you want to create a resource server.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The ID of the user pool where you want to create a resource server.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolResourceServer].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param identifier A unique resource server identifier for the resource server. 
     */
    public fun identifier(identifier: String)

    /**
     * A friendly name for the resource server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-name)
     * @param name A friendly name for the resource server. 
     */
    public fun name(name: String)

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     * @param scopes A list of scopes. 
     */
    public fun scopes(scopes: IResolvable)

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     * @param scopes A list of scopes. 
     */
    public fun scopes(scopes: List<Any>)

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     * @param scopes A list of scopes. 
     */
    public fun scopes(vararg scopes: Any)

    /**
     * The ID of the user pool where you want to create a resource server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-userpoolid)
     * @param userPoolId The ID of the user pool where you want to create a resource server. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.Builder.create(scope, id)

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
     * @param identifier A unique resource server identifier for the resource server. 
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * A friendly name for the resource server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-name)
     * @param name A friendly name for the resource server. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     * @param scopes A list of scopes. 
     */
    override fun scopes(scopes: IResolvable) {
      cdkBuilder.scopes(scopes.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     * @param scopes A list of scopes. 
     */
    override fun scopes(scopes: List<Any>) {
      cdkBuilder.scopes(scopes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of scopes.
     *
     * Each scope is a map with keys `ScopeName` and `ScopeDescription` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-scopes)
     * @param scopes A list of scopes. 
     */
    override fun scopes(vararg scopes: Any): Unit = scopes(scopes.toList())

    /**
     * The ID of the user pool where you want to create a resource server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-userpoolid)
     * @param userPoolId The ID of the user pool where you want to create a resource server. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolResourceServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolResourceServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer):
        CfnUserPoolResourceServer = CfnUserPoolResourceServer(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolResourceServer):
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
  }

  /**
   * One custom scope associated with a user pool resource server.
   *
   * This data type is a member of `ResourceServerScopeType` . For more information, see [Scopes,
   * M2M, and API authorization with resource
   * servers](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-define-resource-servers.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * ResourceServerScopeTypeProperty resourceServerScopeTypeProperty =
   * ResourceServerScopeTypeProperty.builder()
   * .scopeDescription("scopeDescription")
   * .scopeName("scopeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html)
   */
  public interface ResourceServerScopeTypeProperty {
    /**
     * A friendly description of a custom scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription)
     */
    public fun scopeDescription(): String

    /**
     * The name of the scope.
     *
     * Amazon Cognito renders custom scopes in the format `resourceServerIdentifier/ScopeName` . For
     * example, if this parameter is `exampleScope` in the resource server with the identifier
     * `exampleResourceServer` , you request and receive the scope `exampleResourceServer/exampleScope`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopename)
     */
    public fun scopeName(): String

    /**
     * A builder for [ResourceServerScopeTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scopeDescription A friendly description of a custom scope. 
       */
      public fun scopeDescription(scopeDescription: String)

      /**
       * @param scopeName The name of the scope. 
       * Amazon Cognito renders custom scopes in the format `resourceServerIdentifier/ScopeName` .
       * For example, if this parameter is `exampleScope` in the resource server with the identifier
       * `exampleResourceServer` , you request and receive the scope
       * `exampleResourceServer/exampleScope` .
       */
      public fun scopeName(scopeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.builder()

      /**
       * @param scopeDescription A friendly description of a custom scope. 
       */
      override fun scopeDescription(scopeDescription: String) {
        cdkBuilder.scopeDescription(scopeDescription)
      }

      /**
       * @param scopeName The name of the scope. 
       * Amazon Cognito renders custom scopes in the format `resourceServerIdentifier/ScopeName` .
       * For example, if this parameter is `exampleScope` in the resource server with the identifier
       * `exampleResourceServer` , you request and receive the scope
       * `exampleResourceServer/exampleScope` .
       */
      override fun scopeName(scopeName: String) {
        cdkBuilder.scopeName(scopeName)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty,
    ) : CdkObject(cdkObject),
        ResourceServerScopeTypeProperty {
      /**
       * A friendly description of a custom scope.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription)
       */
      override fun scopeDescription(): String = unwrap(this).getScopeDescription()

      /**
       * The name of the scope.
       *
       * Amazon Cognito renders custom scopes in the format `resourceServerIdentifier/ScopeName` .
       * For example, if this parameter is `exampleScope` in the resource server with the identifier
       * `exampleResourceServer` , you request and receive the scope
       * `exampleResourceServer/exampleScope` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopename)
       */
      override fun scopeName(): String = unwrap(this).getScopeName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceServerScopeTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty):
          ResourceServerScopeTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceServerScopeTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceServerScopeTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
    }
  }
}
