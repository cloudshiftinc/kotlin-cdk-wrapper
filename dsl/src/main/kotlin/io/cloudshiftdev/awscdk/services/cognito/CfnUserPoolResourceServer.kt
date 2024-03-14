package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolResourceServer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The resource ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    unwrap(this).setScopes(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of scopes.
   */
  public open fun scopes(__idx_ac66f0: List<Any>) {
    unwrap(this).setScopes(__idx_ac66f0)
  }

  /**
   * A list of scopes.
   */
  public open fun scopes(vararg __idx_ac66f0: Any): Unit = scopes(__idx_ac66f0.toList())

  /**
   * The user pool ID for the user pool.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID for the user pool.
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
     * This could be an HTTPS endpoint where the resource server is located. For example:
     * `https://my-weather-api.example.com` .
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
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
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
     * This could be an HTTPS endpoint where the resource server is located. For example:
     * `https://my-weather-api.example.com` .
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
      cdkBuilder.scopes(scopes.let(IResolvable::unwrap))
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
      cdkBuilder.scopes(scopes)
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
     * The user pool ID for the user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html#cfn-cognito-userpoolresourceserver-userpoolid)
     * @param userPoolId The user pool ID for the user pool. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer =
        cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer = wrapped.cdkObject
  }

  public interface ResourceServerScopeTypeProperty {
    /**
     * A description of the scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription)
     */
    public fun scopeDescription(): String

    /**
     * The name of the scope.
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
       * @param scopeDescription A description of the scope. 
       */
      public fun scopeDescription(scopeDescription: String)

      /**
       * @param scopeName The name of the scope. 
       */
      public fun scopeName(scopeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.builder()

      /**
       * @param scopeDescription A description of the scope. 
       */
      override fun scopeDescription(scopeDescription: String) {
        cdkBuilder.scopeDescription(scopeDescription)
      }

      /**
       * @param scopeName The name of the scope. 
       */
      override fun scopeName(scopeName: String) {
        cdkBuilder.scopeName(scopeName)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty,
    ) : CdkObject(cdkObject), ResourceServerScopeTypeProperty {
      /**
       * A description of the scope.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html#cfn-cognito-userpoolresourceserver-resourceserverscopetype-scopedescription)
       */
      override fun scopeDescription(): String = unwrap(this).getScopeDescription()

      /**
       * The name of the scope.
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
          ResourceServerScopeTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceServerScopeTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
    }
  }
}
