@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface AwsIntegrationProps {
  public fun action(): String? = unwrap(this).getAction()

  public fun actionParameters(): Map<String, String> = unwrap(this).getActionParameters() ?:
      emptyMap()

  public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

  public fun options(): IntegrationOptions? =
      unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

  public fun path(): String? = unwrap(this).getPath()

  public fun proxy(): Boolean? = unwrap(this).getProxy()

  public fun region(): String? = unwrap(this).getRegion()

  public fun service(): String

  public fun subdomain(): String? = unwrap(this).getSubdomain()

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun actionParameters(actionParameters: Map<String, String>)

    public fun integrationHttpMethod(integrationHttpMethod: String)

    public fun options(options: IntegrationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01aec5e89ef73ff89679e7c8d6d3287c0c91bd5a53b12f0480b9dec344bfc27d")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    public fun path(path: String)

    public fun proxy(proxy: Boolean)

    public fun region(region: String)

    public fun service(service: String)

    public fun subdomain(subdomain: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AwsIntegrationProps.Builder =
        software.amazon.awscdk.services.apigateway.AwsIntegrationProps.builder()

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun actionParameters(actionParameters: Map<String, String>) {
      cdkBuilder.actionParameters(actionParameters)
    }

    override fun integrationHttpMethod(integrationHttpMethod: String) {
      cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    override fun options(options: IntegrationOptions) {
      cdkBuilder.options(options.let(IntegrationOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01aec5e89ef73ff89679e7c8d6d3287c0c91bd5a53b12f0480b9dec344bfc27d")
    override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
        options(IntegrationOptions(options))

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    override fun subdomain(subdomain: String) {
      cdkBuilder.subdomain(subdomain)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.AwsIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegrationProps,
  ) : CdkObject(cdkObject), AwsIntegrationProps {
    override fun action(): String? = unwrap(this).getAction()

    override fun actionParameters(): Map<String, String> = unwrap(this).getActionParameters() ?:
        emptyMap()

    override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    override fun options(): IntegrationOptions? =
        unwrap(this).getOptions()?.let(IntegrationOptions::wrap)

    override fun path(): String? = unwrap(this).getPath()

    override fun proxy(): Boolean? = unwrap(this).getProxy()

    override fun region(): String? = unwrap(this).getRegion()

    override fun service(): String = unwrap(this).getService()

    override fun subdomain(): String? = unwrap(this).getSubdomain()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegrationProps):
        AwsIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsIntegrationProps):
        software.amazon.awscdk.services.apigateway.AwsIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.AwsIntegrationProps
  }
}
