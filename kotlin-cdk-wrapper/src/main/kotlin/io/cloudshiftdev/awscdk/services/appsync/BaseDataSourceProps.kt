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
 * GraphqlApi graphqlApi;
 * BaseDataSourceProps baseDataSourceProps = BaseDataSourceProps.builder()
 * .api(graphqlApi)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
public interface BaseDataSourceProps {
  /**
   * The API to attach this data source to.
   */
  public fun api(): IGraphqlApi

  /**
   * the description of the data source.
   *
   * Default: - None
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the data source.
   *
   * Default: - id of data source
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [BaseDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param description the description of the data source.
     */
    public fun description(description: String)

    /**
     * @param name The name of the data source.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.BaseDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.BaseDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi.Companion::unwrap))
    }

    /**
     * @param description the description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data source.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.BaseDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.BaseDataSourceProps,
  ) : CdkObject(cdkObject),
      BaseDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * the description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BaseDataSourceProps):
        BaseDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? BaseDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDataSourceProps):
        software.amazon.awscdk.services.appsync.BaseDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.BaseDataSourceProps
  }
}
