@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public open class HttpIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegration,
) : Integration(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun httpMethod(httpMethod: String)

    public fun options(options: IntegrationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e99b87b56780b593ff5ee05aeaa9155ae3f328109f4ed9ba5f84ddf2afac8e")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    public fun proxy(proxy: Boolean)
  }

  private class BuilderImpl(
    url: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.HttpIntegration.Builder =
        software.amazon.awscdk.services.apigateway.HttpIntegration.Builder.create(url)

    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52e99b87b56780b593ff5ee05aeaa9155ae3f328109f4ed9ba5f84ddf2afac8e")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.HttpIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(url: String, block: Builder.() -> Unit = {}): HttpIntegration {
      val builderImpl = BuilderImpl(url)
      return HttpIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.HttpIntegration):
        HttpIntegration = HttpIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpIntegration):
        software.amazon.awscdk.services.apigateway.HttpIntegration = wrapped.cdkObject
  }
}
