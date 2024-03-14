package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ProxyResourceProps : ProxyResourceOptions {
  /**
   * The parent resource of this resource.
   *
   * You can either pass another
   * `Resource` object or a `RestApi` object here.
   */
  public fun parent(): IResource

  /**
   * A builder for [ProxyResourceProps]
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2945dc20767a069e2e401203298e6885345e9f1a4e9b805a7e8947ed82e6fd3e")
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
    @JvmName("00f569296160d060f07e44f38e79960137f0cdbbec5363e4ef9c97fe3dcb0610")
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
    @JvmName("7dbf990b20447d94dc7ee8396b64558f93d22e6f75f18de96d4519b69acc519f")
    public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

    /**
     * @param parent The parent resource of this resource. 
     * You can either pass another
     * `Resource` object or a `RestApi` object here.
     */
    public fun parent(parent: IResource)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ProxyResourceProps.Builder =
        software.amazon.awscdk.services.apigateway.ProxyResourceProps.builder()

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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2945dc20767a069e2e401203298e6885345e9f1a4e9b805a7e8947ed82e6fd3e")
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
    @JvmName("00f569296160d060f07e44f38e79960137f0cdbbec5363e4ef9c97fe3dcb0610")
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
    @JvmName("7dbf990b20447d94dc7ee8396b64558f93d22e6f75f18de96d4519b69acc519f")
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

    public fun build(): software.amazon.awscdk.services.apigateway.ProxyResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ProxyResourceProps,
  ) : CdkObject(cdkObject), ProxyResourceProps {
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

    /**
     * The parent resource of this resource.
     *
     * You can either pass another
     * `Resource` object or a `RestApi` object here.
     */
    override fun parent(): IResource = unwrap(this).getParent().let(IResource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ProxyResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ProxyResourceProps):
        ProxyResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyResourceProps):
        software.amazon.awscdk.services.apigateway.ProxyResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ProxyResourceProps
  }
}
