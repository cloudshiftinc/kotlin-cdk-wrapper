@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Expiration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ApiKeyConfig {
  public fun description(): String? = unwrap(this).getDescription()

  public fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

  public fun name(): String? = unwrap(this).getName()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun expires(expires: Expiration)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.ApiKeyConfig.Builder =
        software.amazon.awscdk.services.appsync.ApiKeyConfig.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun expires(expires: Expiration) {
      cdkBuilder.expires(expires.let(Expiration::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.ApiKeyConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.ApiKeyConfig,
  ) : CdkObject(cdkObject), ApiKeyConfig {
    override fun description(): String? = unwrap(this).getDescription()

    override fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ApiKeyConfig): ApiKeyConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiKeyConfig): software.amazon.awscdk.services.appsync.ApiKeyConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.ApiKeyConfig
  }
}
