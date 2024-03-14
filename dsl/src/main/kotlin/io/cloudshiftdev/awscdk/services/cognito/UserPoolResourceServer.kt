package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolResourceServer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServer,
) : Resource(cdkObject), IUserPoolResourceServer {
  public override fun userPoolResourceServerId(): String =
      unwrap(this).getUserPoolResourceServerId()

  public interface Builder {
    public fun identifier(identifier: String)

    public fun scopes(scopes: List<ResourceServerScope>)

    public fun userPool(userPool: IUserPool)

    public fun userPoolResourceServerName(userPoolResourceServerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolResourceServer.Builder =
        software.amazon.awscdk.services.cognito.UserPoolResourceServer.Builder.create(scope, id)

    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    override fun scopes(scopes: List<ResourceServerScope>) {
      cdkBuilder.scopes(scopes.map(ResourceServerScope::unwrap))
    }

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    override fun userPoolResourceServerName(userPoolResourceServerName: String) {
      cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolResourceServer =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromUserPoolResourceServerId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolResourceServerId: String,
    ): IUserPoolResourceServer =
        software.amazon.awscdk.services.cognito.UserPoolResourceServer.fromUserPoolResourceServerId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userPoolResourceServerId).let(IUserPoolResourceServer::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolResourceServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolResourceServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolResourceServer):
        UserPoolResourceServer = UserPoolResourceServer(cdkObject)

    internal fun unwrap(wrapped: UserPoolResourceServer):
        software.amazon.awscdk.services.cognito.UserPoolResourceServer = wrapped.cdkObject
  }
}
