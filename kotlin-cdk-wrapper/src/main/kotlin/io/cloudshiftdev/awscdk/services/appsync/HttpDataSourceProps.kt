@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpDataSourceProps : BaseDataSourceProps {
  public fun authorizationConfig(): AwsIamConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

  public fun endpoint(): String

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun authorizationConfig(authorizationConfig: AwsIamConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de9fa1e6af3efb8418623f7fbc22fde7f58e0c75cb0de3d75daa8f6dc94af34")
    public fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit)

    public fun description(description: String)

    public fun endpoint(endpoint: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.HttpDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.HttpDataSourceProps.builder()

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun authorizationConfig(authorizationConfig: AwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AwsIamConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de9fa1e6af3efb8418623f7fbc22fde7f58e0c75cb0de3d75daa8f6dc94af34")
    override fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit): Unit =
        authorizationConfig(AwsIamConfig(authorizationConfig))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.HttpDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceProps,
  ) : CdkObject(cdkObject), HttpDataSourceProps {
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    override fun authorizationConfig(): AwsIamConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun endpoint(): String = unwrap(this).getEndpoint()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceProps):
        HttpDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpDataSourceProps):
        software.amazon.awscdk.services.appsync.HttpDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.HttpDataSourceProps
  }
}
