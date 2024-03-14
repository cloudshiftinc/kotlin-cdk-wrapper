package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RequestAuthorizer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizer,
) : Authorizer(cdkObject), IAuthorizer {
  public open fun authorizerArn(): String = unwrap(this).getAuthorizerArn()

  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  public interface Builder {
    public fun assumeRole(assumeRole: IRole)

    public fun authorizerName(authorizerName: String)

    public fun handler(handler: IFunction)

    public fun identitySources(identitySources: List<String>)

    public fun identitySources(vararg identitySources: String)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RequestAuthorizer.Builder =
        software.amazon.awscdk.services.apigateway.RequestAuthorizer.Builder.create(scope, id)

    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    override fun identitySources(identitySources: List<String>) {
      cdkBuilder.identitySources(identitySources)
    }

    override fun identitySources(vararg identitySources: String): Unit =
        identitySources(identitySources.toList())

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RequestAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RequestAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizer):
        RequestAuthorizer = RequestAuthorizer(cdkObject)

    internal fun unwrap(wrapped: RequestAuthorizer):
        software.amazon.awscdk.services.apigateway.RequestAuthorizer = wrapped.cdkObject
  }
}
