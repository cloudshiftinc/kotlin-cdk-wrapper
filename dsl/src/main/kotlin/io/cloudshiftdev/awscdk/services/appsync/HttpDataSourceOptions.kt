package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpDataSourceOptions : DataSourceOptions {
  public fun authorizationConfig(): AwsIamConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

  public interface Builder {
    public fun authorizationConfig(authorizationConfig: AwsIamConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d553a9e8bba7dd7cadc025198b46f845a52abeaa352034b0f1f270306bbaf1")
    public fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.HttpDataSourceOptions.Builder =
        software.amazon.awscdk.services.appsync.HttpDataSourceOptions.builder()

    public override fun authorizationConfig(authorizationConfig: AwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AwsIamConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d553a9e8bba7dd7cadc025198b46f845a52abeaa352034b0f1f270306bbaf1")
    public override fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AwsIamConfig(authorizationConfig))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.HttpDataSourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceOptions,
  ) : HttpDataSourceOptions {
    public override fun authorizationConfig(): AwsIamConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpDataSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceOptions):
        HttpDataSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpDataSourceOptions):
        software.amazon.awscdk.services.appsync.HttpDataSourceOptions = (wrapped as
        Wrapper).cdkObject
  }
}
