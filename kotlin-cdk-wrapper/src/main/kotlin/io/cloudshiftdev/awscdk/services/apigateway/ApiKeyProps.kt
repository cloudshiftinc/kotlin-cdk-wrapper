@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ApiKeyProps : ApiKeyOptions {
  public fun customerId(): String? = unwrap(this).getCustomerId()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun generateDistinctId(): Boolean? = unwrap(this).getGenerateDistinctId()

  @Deprecated(message = "deprecated in CDK")
  public fun resources(): List<IRestApi> = unwrap(this).getResources()?.map(IRestApi::wrap) ?:
      emptyList()

  public fun stages(): List<IStage> = unwrap(this).getStages()?.map(IStage::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyName(apiKeyName: String)

    public fun customerId(customerId: String)

    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0505410c94eff681cc452b76055bbbe10c30d2330d41d57f71de4569d641e533")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: Integration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a80f1c78c50186af838b8ae2b9a5dfdab34b7d909ac7b8661cf876516d6acb80")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83261c2b54df25214169d1340f32139c54811994df74e520d45f7148f47f0668")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun enabled(enabled: Boolean)

    public fun generateDistinctId(generateDistinctId: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(resources: List<IRestApi>)

    @Deprecated(message = "deprecated in CDK")
    public fun resources(vararg resources: IRestApi)

    public fun stages(stages: List<IStage>)

    public fun stages(vararg stages: IStage)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiKeyProps.Builder =
        software.amazon.awscdk.services.apigateway.ApiKeyProps.builder()

    override fun apiKeyName(apiKeyName: String) {
      cdkBuilder.apiKeyName(apiKeyName)
    }

    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0505410c94eff681cc452b76055bbbe10c30d2330d41d57f71de4569d641e533")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a80f1c78c50186af838b8ae2b9a5dfdab34b7d909ac7b8661cf876516d6acb80")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("83261c2b54df25214169d1340f32139c54811994df74e520d45f7148f47f0668")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun resources(resources: List<IRestApi>) {
      cdkBuilder.resources(resources.map(IRestApi::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun resources(vararg resources: IRestApi): Unit = resources(resources.toList())

    override fun stages(stages: List<IStage>) {
      cdkBuilder.stages(stages.map(IStage::unwrap))
    }

    override fun stages(vararg stages: IStage): Unit = stages(stages.toList())

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ApiKeyProps,
  ) : CdkObject(cdkObject), ApiKeyProps {
    override fun apiKeyName(): String? = unwrap(this).getApiKeyName()

    override fun customerId(): String? = unwrap(this).getCustomerId()

    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun generateDistinctId(): Boolean? = unwrap(this).getGenerateDistinctId()

    @Deprecated(message = "deprecated in CDK")
    override fun resources(): List<IRestApi> = unwrap(this).getResources()?.map(IRestApi::wrap) ?:
        emptyList()

    override fun stages(): List<IStage> = unwrap(this).getStages()?.map(IStage::wrap) ?: emptyList()

    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiKeyProps):
        ApiKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiKeyProps):
        software.amazon.awscdk.services.apigateway.ApiKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.ApiKeyProps
  }
}
