package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ResourceProps : ResourceOptions {
  /**
   * The parent resource of this resource.
   *
   * You can either pass another
   * `Resource` object or a `RestApi` object here.
   */
  public fun parent(): IResource

  /**
   * A path name for the resource.
   */
  public fun pathPart(): String

  /**
   * A builder for [ResourceProps]
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482451f25262f7cfac5648ca01c62c216c891bd185e6db0549df95ad525aff3a")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3396b97f02ea8d0184c33c841e196f309f11bf5ee74fde65b2d9b6116d9b8341")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60206646a6bd4a3671d4af51ea26910ea3719d83b4de2d628a489efc6cf9c271")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    /**
     * @param parent The parent resource of this resource. 
     * You can either pass another
     * `Resource` object or a `RestApi` object here.
     */
    public fun parent(parent: IResource)

    /**
     * @param pathPart A path name for the resource. 
     */
    public fun pathPart(pathPart: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ResourceProps.Builder =
        software.amazon.awscdk.services.apigateway.ResourceProps.builder()

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("482451f25262f7cfac5648ca01c62c216c891bd185e6db0549df95ad525aff3a")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3396b97f02ea8d0184c33c841e196f309f11bf5ee74fde65b2d9b6116d9b8341")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60206646a6bd4a3671d4af51ea26910ea3719d83b4de2d628a489efc6cf9c271")
    override fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit): Unit
        = defaultMethodOptions(MethodOptions(defaultMethodOptions))

    /**
     * @param parent The parent resource of this resource. 
     * You can either pass another
     * `Resource` object or a `RestApi` object here.
     */
    override fun parent(parent: IResource) {
      cdkBuilder.parent(parent.let(IResource::unwrap))
    }

    /**
     * @param pathPart A path name for the resource. 
     */
    override fun pathPart(pathPart: String) {
      cdkBuilder.pathPart(pathPart)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ResourceProps,
  ) : CdkObject(cdkObject), ResourceProps {
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

    /**
     * The parent resource of this resource.
     *
     * You can either pass another
     * `Resource` object or a `RestApi` object here.
     */
    override fun parent(): IResource = unwrap(this).getParent().let(IResource::wrap)

    /**
     * A path name for the resource.
     */
    override fun pathPart(): String = unwrap(this).getPathPart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResourceProps):
        ResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceProps):
        software.amazon.awscdk.services.apigateway.ResourceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.ResourceProps
  }
}
