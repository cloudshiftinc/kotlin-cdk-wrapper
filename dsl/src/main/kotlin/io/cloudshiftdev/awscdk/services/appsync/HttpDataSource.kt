package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.HttpDataSource,
) : BackedDataSource(cdkObject) {
  public interface Builder {
    public fun api(api: IGraphqlApi) {
    }

    public fun authorizationConfig(authorizationConfig: AwsIamConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f376646fae9366c6dc1996db9382743e6137ede550ab0f4f9184b191739c3321")
    public fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun endpoint(endpoint: String) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.HttpDataSource.Builder =
        software.amazon.awscdk.services.appsync.HttpDataSource.Builder.create(scope, id)

    public override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    public override fun authorizationConfig(authorizationConfig: AwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AwsIamConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f376646fae9366c6dc1996db9382743e6137ede550ab0f4f9184b191739c3321")
    public override fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AwsIamConfig(authorizationConfig))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.HttpDataSource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HttpDataSource):
        HttpDataSource = HttpDataSource(cdkObject)

    internal fun unwrap(wrapped: HttpDataSource):
        software.amazon.awscdk.services.appsync.HttpDataSource = wrapped.cdkObject
  }
}
