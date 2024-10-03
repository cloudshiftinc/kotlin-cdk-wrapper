@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * Resource resource;
 * Resource subtree = resource.addResource("subtree", ResourceOptions.builder()
 * .defaultCorsPreflightOptions(CorsOptions.builder()
 * .allowOrigins(List.of("https://amazon.com"))
 * .build())
 * .build());
 * ```
 */
public interface ResourceOptions {
  /**
   * Adds a CORS preflight OPTIONS method to this resource and all child resources.
   *
   * You can add CORS at the resource-level using `addCorsPreflight`.
   *
   * Default: - CORS is disabled
   */
  public fun defaultCorsPreflightOptions(): CorsOptions? =
      unwrap(this).getDefaultCorsPreflightOptions()?.let(CorsOptions::wrap)

  /**
   * An integration to use as a default for all methods created within this API unless an
   * integration is specified.
   *
   * Default: - Inherited from parent.
   */
  public fun defaultIntegration(): Integration? =
      unwrap(this).getDefaultIntegration()?.let(Integration::wrap)

  /**
   * Method options to use as a default for all methods created within this API unless custom
   * options are specified.
   *
   * Default: - Inherited from parent.
   */
  public fun defaultMethodOptions(): MethodOptions? =
      unwrap(this).getDefaultMethodOptions()?.let(MethodOptions::wrap)

  /**
   * A builder for [ResourceOptions]
   */
  @CdkDslMarker
  public interface Builder {
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
    @JvmName("88f3885d7453d7fd0ea3579159b3ea02d7b9742425b496f79080a3e768736e3a")
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
    @JvmName("1a7bf78ab48f2267d93eae73f9a1e12954cb5b4e2ce073a6001f9e184e12156d")
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
    @JvmName("7dc0b133223007d5d53df6d4cdbce08a01190ca0aede2e5aaa589b0079b88599")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ResourceOptions.Builder =
        software.amazon.awscdk.services.apigateway.ResourceOptions.builder()

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
      cdkBuilder.defaultCorsPreflightOptions(defaultCorsPreflightOptions.let(CorsOptions.Companion::unwrap))
    }

    /**
     * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource and
     * all child resources.
     * You can add CORS at the resource-level using `addCorsPreflight`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88f3885d7453d7fd0ea3579159b3ea02d7b9742425b496f79080a3e768736e3a")
    override
        fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit):
        Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    override fun defaultIntegration(defaultIntegration: Integration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(Integration.Companion::unwrap))
    }

    /**
     * @param defaultIntegration An integration to use as a default for all methods created within
     * this API unless an integration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7bf78ab48f2267d93eae73f9a1e12954cb5b4e2ce073a6001f9e184e12156d")
    override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
        defaultIntegration(Integration(defaultIntegration))

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
      cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions.Companion::unwrap))
    }

    /**
     * @param defaultMethodOptions Method options to use as a default for all methods created within
     * this API unless custom options are specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7dc0b133223007d5d53df6d4cdbce08a01190ca0aede2e5aaa589b0079b88599")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    public fun build(): software.amazon.awscdk.services.apigateway.ResourceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.ResourceOptions,
  ) : CdkObject(cdkObject),
      ResourceOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResourceOptions):
        ResourceOptions = CdkObjectWrappers.wrap(cdkObject) as? ResourceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceOptions):
        software.amazon.awscdk.services.apigateway.ResourceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ResourceOptions
  }
}
