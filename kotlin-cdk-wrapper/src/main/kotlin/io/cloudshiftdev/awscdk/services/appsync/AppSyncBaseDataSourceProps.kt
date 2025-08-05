@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Base properties for an AppSync datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * IApi api;
 * AppSyncBaseDataSourceProps appSyncBaseDataSourceProps = AppSyncBaseDataSourceProps.builder()
 * .api(api)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
public interface AppSyncBaseDataSourceProps {
  /**
   * The API to attach this data source to.
   */
  public fun api(): IApi

  /**
   * The description of the data source.
   *
   * Default: - None
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the data source.
   *
   * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
   * Any invalid characters will be automatically removed.
   *
   * Default: - id of data source
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [AppSyncBaseDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * @param description The description of the data source.
     */
    public fun description(description: String)

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppSyncBaseDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.AppSyncBaseDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * @param description The description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncBaseDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncBaseDataSourceProps,
  ) : CdkObject(cdkObject),
      AppSyncBaseDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IApi = unwrap(this).getApi().let(IApi::wrap)

    /**
     * The description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncBaseDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncBaseDataSourceProps):
        AppSyncBaseDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        AppSyncBaseDataSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncBaseDataSourceProps):
        software.amazon.awscdk.services.appsync.AppSyncBaseDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncBaseDataSourceProps
  }
}
