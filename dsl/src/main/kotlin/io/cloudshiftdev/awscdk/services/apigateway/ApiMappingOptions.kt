package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ApiMappingOptions {
  /**
   * The api path name that callers of the API must provide in the URL after the domain name (e.g.
   * `example.com/base-path`). If you specify this property, it can't be an empty string.
   *
   * If this is undefined, a mapping will be added for the empty path. Any request
   * that does not match a mapping will get sent to the API that has been mapped
   * to the empty path.
   *
   * Default: - map requests from the domain root (e.g. `example.com`).
   */
  public fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * A builder for [ApiMappingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param basePath The api path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     * If this is undefined, a mapping will be added for the empty path. Any request
     * that does not match a mapping will get sent to the API that has been mapped
     * to the empty path.
     */
    public fun basePath(basePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiMappingOptions.Builder =
        software.amazon.awscdk.services.apigateway.ApiMappingOptions.builder()

    /**
     * @param basePath The api path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     * If this is undefined, a mapping will be added for the empty path. Any request
     * that does not match a mapping will get sent to the API that has been mapped
     * to the empty path.
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiMappingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ApiMappingOptions,
  ) : CdkObject(cdkObject), ApiMappingOptions {
    /**
     * The api path name that callers of the API must provide in the URL after the domain name (e.g.
     * `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * If this is undefined, a mapping will be added for the empty path. Any request
     * that does not match a mapping will get sent to the API that has been mapped
     * to the empty path.
     *
     * Default: - map requests from the domain root (e.g. `example.com`).
     */
    override fun basePath(): String? = unwrap(this).getBasePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiMappingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiMappingOptions):
        ApiMappingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiMappingOptions):
        software.amazon.awscdk.services.apigateway.ApiMappingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ApiMappingOptions
  }
}
