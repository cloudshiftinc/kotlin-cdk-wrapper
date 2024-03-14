package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolResourceServer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun identifier(): String = unwrap(this).getIdentifier()

  public open fun identifier(`value`: String) {
    unwrap(this).setIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun scopes(): Any? = unwrap(this).getScopes()

  public open fun scopes(`value`: IResolvable) {
    unwrap(this).setScopes(`value`.let(IResolvable::unwrap))
  }

  public open fun scopes(__idx_ac66f0: List<Any>) {
    unwrap(this).setScopes(__idx_ac66f0)
  }

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  public interface Builder {
    public fun identifier(identifier: String) {
    }

    public fun name(name: String) {
    }

    public fun scopes(scopes: IResolvable) {
    }

    public fun scopes(scopes: List<Any>) {
    }

    public fun userPoolId(userPoolId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.Builder.create(scope, id)

    public override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun scopes(scopes: IResolvable) {
      cdkBuilder.scopes(scopes.let(IResolvable::unwrap))
    }

    public override fun scopes(scopes: List<Any>) {
      cdkBuilder.scopes(scopes)
    }

    public override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
    public fun scopeDescription(): String

    public fun scopeName(): String

    public interface Builder {
      public fun scopeDescription(scopeDescription: String) {
      }

      public fun scopeName(scopeName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.builder()

      public override fun scopeDescription(scopeDescription: String) {
        cdkBuilder.scopeDescription(scopeDescription)
      }

      public override fun scopeName(scopeName: String) {
        cdkBuilder.scopeName(scopeName)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty,
    ) : ResourceServerScopeTypeProperty {
      public override fun scopeDescription(): String = unwrap(this).getScopeDescription()

      public override fun scopeName(): String = unwrap(this).getScopeName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceServerScopeTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty):
          ResourceServerScopeTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceServerScopeTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
