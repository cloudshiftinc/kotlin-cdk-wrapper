@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * Resource resource;
 * Function handler;
 * ProxyResource proxy = resource.addProxy(ProxyResourceOptions.builder()
 * .defaultIntegration(new LambdaIntegration(handler))
 * // "false" will require explicitly adding methods on the `proxy` resource
 * .anyMethod(true)
 * .build());
 * ```
 */
public interface ProxyResourceOptions : ResourceOptions {
  /**
   * Adds an "ANY" method to this resource.
   *
   * If set to `false`, you will have to explicitly
   * add methods to this resource after it's created.
   *
   * Default: true
   */
  public fun anyMethod(): Boolean? = unwrap(this).getAnyMethod()

  /**
   * A builder for [ProxyResourceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param anyMethod Adds an "ANY" method to this resource.
     * If set to `false`, you will have to explicitly
     * add methods to this resource after it's created.
     */
    public fun anyMethod(anyMethod: Boolean)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e151382df0c851b3ddf006133fee29eab092530e27fe393dd9f9af288f2b0c39")
    public
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    public fun defaultIntegration(defaultIntegration: Integration)

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515a82bc88058a7cb28cdd5615e50a9b89cae9951829f41bb311bf96f48320cb")
    public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443689287b59c52a05c959c5696ae42ca2386111cfe7d9ddb62e63d8b60b38f9")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ProxyResourceOptions.Builder
        = software.amazon.awscdk.services.apigateway.ProxyResourceOptions.builder()

    /**
     * @param anyMethod Adds an "ANY" method to this resource.
     * If set to `false`, you will have to explicitly
     * add methods to this resource after it's created.
     */
    override fun anyMethod(anyMethod: Boolean) {
      cdkBuilder.anyMethod(anyMethod)
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e151382df0c851b3ddf006133fee29eab092530e27fe393dd9f9af288f2b0c39")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("515a82bc88058a7cb28cdd5615e50a9b89cae9951829f41bb311bf96f48320cb")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("443689287b59c52a05c959c5696ae42ca2386111cfe7d9ddb62e63d8b60b38f9")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public fun build(): software.amazon.awscdk.services.apigateway.ProxyResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.ProxyResourceOptions,
  ) : CdkObject(cdkObject), ProxyResourceOptions {
    /**
     * Adds an "ANY" method to this resource.
     *
     * If set to `false`, you will have to explicitly
     * add methods to this resource after it's created.
     *
     * Default: true
     */
    override fun anyMethod(): Boolean? = unwrap(this).getAnyMethod()

    /**
     * Adds a CORS preflight OPTIONS method to this resource and all child resources.
     *
     * You can add CORS at the resource-level using `addCorsPreflight`.
     *
     * Default: - CORS is disabled
     */
    override fun defaultCorsPreflightOptions(): CorsOptions? =
        unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

    /**
     * An integration to use as a default for all methods created within this API unless an
     * integration is specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultIntegration(): Integration? =
        unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

    /**
     * Method options to use as a default for all methods created within this API unless custom
     * options are specified.
     *
     * Default: - Inherited from parent.
     */
    override fun defaultMethodOptions(): MethodOptions? =
        unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProxyResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ProxyResourceOptions):
        ProxyResourceOptions = CdkObjectWrappers.wrap(cdkObject) as? ProxyResourceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyResourceOptions):
        software.amazon.awscdk.services.apigateway.ProxyResourceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ProxyResourceOptions
  }
}
