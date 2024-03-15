@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class AwsIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegration,
) : Integration(cdkObject) {
  public override fun bind(method: Method): IntegrationConfig =
      unwrap(this).bind(method.let(Method::unwrap)).let(IntegrationConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun actionParameters(actionParameters: Map<String, String>)

    public fun integrationHttpMethod(integrationHttpMethod: String)

    public fun options(options: IntegrationOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ce81aaca0d9bc53166da2caa5cd20f16fc9dbb134d40a08b9c3aa7299dd7fe5")
    public fun options(options: IntegrationOptions.Builder.() -> Unit)

    public fun path(path: String)

    public fun proxy(proxy: Boolean)

    public fun region(region: String)

    public fun service(service: String)

    public fun subdomain(subdomain: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.AwsIntegration.Builder =
        software.amazon.awscdk.services.apigateway.AwsIntegration.Builder.create()

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
    @JvmName("4ce81aaca0d9bc53166da2caa5cd20f16fc9dbb134d40a08b9c3aa7299dd7fe5")
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

    public fun build(): software.amazon.awscdk.services.apigateway.AwsIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIntegration {
      val builderImpl = BuilderImpl()
      return AwsIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.AwsIntegration):
        AwsIntegration = AwsIntegration(cdkObject)

    internal fun unwrap(wrapped: AwsIntegration):
        software.amazon.awscdk.services.apigateway.AwsIntegration = wrapped.cdkObject
  }
}
