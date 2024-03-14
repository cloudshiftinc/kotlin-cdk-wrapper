package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TokenAuthorizer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizer,
) : Authorizer(cdkObject), IAuthorizer {
  public open fun authorizerArn(): String = unwrap(this).getAuthorizerArn()

  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  public interface Builder {
    public fun assumeRole(assumeRole: IRole) {
    }

    public fun authorizerName(authorizerName: String) {
    }

    public fun handler(handler: IFunction) {
    }

    public fun identitySource(identitySource: String) {
    }

    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
    }

    public fun validationRegex(validationRegex: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.TokenAuthorizer.Builder =
        software.amazon.awscdk.services.apigateway.TokenAuthorizer.Builder.create(scope, id)

    public override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    public override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    public override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    public override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    public override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public override fun validationRegex(validationRegex: String) {
      cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.TokenAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TokenAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TokenAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizer):
        TokenAuthorizer = TokenAuthorizer(cdkObject)

    internal fun unwrap(wrapped: TokenAuthorizer):
        software.amazon.awscdk.services.apigateway.TokenAuthorizer = wrapped.cdkObject
  }
}
