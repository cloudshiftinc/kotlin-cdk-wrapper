@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpDataSourceOptions : DataSourceOptions {
  public fun authorizationConfig(): AwsIamConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun authorizationConfig(authorizationConfig: AwsIamConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d553a9e8bba7dd7cadc025198b46f845a52abeaa352034b0f1f270306bbaf1")
    public fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.HttpDataSourceOptions.Builder =
        software.amazon.awscdk.services.appsync.HttpDataSourceOptions.builder()

    override fun authorizationConfig(authorizationConfig: AwsIamConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AwsIamConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17d553a9e8bba7dd7cadc025198b46f845a52abeaa352034b0f1f270306bbaf1")
    override fun authorizationConfig(authorizationConfig: AwsIamConfig.Builder.() -> Unit): Unit =
        authorizationConfig(AwsIamConfig(authorizationConfig))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.HttpDataSourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceOptions,
  ) : CdkObject(cdkObject), HttpDataSourceOptions {
    override fun authorizationConfig(): AwsIamConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AwsIamConfig::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpDataSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HttpDataSourceOptions):
        HttpDataSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpDataSourceOptions):
        software.amazon.awscdk.services.appsync.HttpDataSourceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.HttpDataSourceOptions
  }
}
