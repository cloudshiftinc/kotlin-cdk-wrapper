package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LambdaDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSource,
) : BackedDataSource(cdkObject) {
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun description(description: String)

    public fun lambdaFunction(lambdaFunction: IFunction)

    public fun name(name: String)

    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LambdaDataSource.Builder =
        software.amazon.awscdk.services.appsync.LambdaDataSource.Builder.create(scope, id)

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun lambdaFunction(lambdaFunction: IFunction) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IFunction::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.LambdaDataSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LambdaDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LambdaDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LambdaDataSource):
        LambdaDataSource = LambdaDataSource(cdkObject)

    internal fun unwrap(wrapped: LambdaDataSource):
        software.amazon.awscdk.services.appsync.LambdaDataSource = wrapped.cdkObject
  }
}
