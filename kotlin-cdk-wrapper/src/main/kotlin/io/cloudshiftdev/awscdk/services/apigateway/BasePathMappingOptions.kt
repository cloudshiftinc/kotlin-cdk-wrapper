@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * DomainName domain;
 * RestApi api1;
 * RestApi api2;
 * domain.addBasePathMapping(api1, BasePathMappingOptions.builder().basePath("go-to-api1").build());
 * domain.addBasePathMapping(api2, BasePathMappingOptions.builder().basePath("boom").build());
 * ```
 */
public interface BasePathMappingOptions {
  /**
   * Whether to attach the base path mapping to a stage.
   *
   * Use this property to create a base path mapping without attaching it to the Rest API default
   * stage.
   * This property is ignored if `stage` is provided.
   *
   * Default: - true
   */
  public fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

  /**
   * The base path name that callers of the API must provide in the URL after the domain name (e.g.
   * `example.com/base-path`). If you specify this property, it can't be an empty string.
   *
   * Default: - map requests from the domain root (e.g. `example.com`). If this
   * is undefined, no additional mappings will be allowed on this domain name.
   */
  public fun basePath(): String? = unwrap(this).getBasePath()

  /**
   * The Deployment stage of API [disable-awslint:ref-via-interface].
   *
   * Default: - map to deploymentStage of restApi otherwise stage needs to pass in URL
   */
  public fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)

  /**
   * A builder for [BasePathMappingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attachToStage Whether to attach the base path mapping to a stage.
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     */
    public fun attachToStage(attachToStage: Boolean)

    /**
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     */
    public fun basePath(basePath: String)

    /**
     * @param stage The Deployment stage of API [disable-awslint:ref-via-interface].
     */
    public fun stage(stage: Stage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions.Builder =
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions.builder()

    /**
     * @param attachToStage Whether to attach the base path mapping to a stage.
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     */
    override fun attachToStage(attachToStage: Boolean) {
      cdkBuilder.attachToStage(attachToStage)
    }

    /**
     * @param basePath The base path name that callers of the API must provide in the URL after the
     * domain name (e.g. `example.com/base-path`). If you specify this property, it can't be an empty
     * string.
     */
    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    /**
     * @param stage The Deployment stage of API [disable-awslint:ref-via-interface].
     */
    override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.BasePathMappingOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingOptions,
  ) : CdkObject(cdkObject), BasePathMappingOptions {
    /**
     * Whether to attach the base path mapping to a stage.
     *
     * Use this property to create a base path mapping without attaching it to the Rest API default
     * stage.
     * This property is ignored if `stage` is provided.
     *
     * Default: - true
     */
    override fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

    /**
     * The base path name that callers of the API must provide in the URL after the domain name
     * (e.g. `example.com/base-path`). If you specify this property, it can't be an empty string.
     *
     * Default: - map requests from the domain root (e.g. `example.com`). If this
     * is undefined, no additional mappings will be allowed on this domain name.
     */
    override fun basePath(): String? = unwrap(this).getBasePath()

    /**
     * The Deployment stage of API [disable-awslint:ref-via-interface].
     *
     * Default: - map to deploymentStage of restApi otherwise stage needs to pass in URL
     */
    override fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BasePathMappingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingOptions):
        BasePathMappingOptions = CdkObjectWrappers.wrap(cdkObject) as? BasePathMappingOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasePathMappingOptions):
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.BasePathMappingOptions
  }
}
