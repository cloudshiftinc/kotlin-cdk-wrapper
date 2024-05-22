@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync dummy datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * GraphqlApi graphqlApi;
 * NoneDataSource noneDataSource = NoneDataSource.Builder.create(this, "MyNoneDataSource")
 * .api(graphqlApi)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .build();
 * ```
 */
public open class NoneDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.NoneDataSource,
) : BaseDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NoneDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.NoneDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(NoneDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NoneDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, NoneDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.NoneDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    public fun description(description: String)

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.NoneDataSource.Builder =
        software.amazon.awscdk.services.appsync.NoneDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi.Companion::unwrap))
    }

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.NoneDataSource = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NoneDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NoneDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.NoneDataSource):
        NoneDataSource = NoneDataSource(cdkObject)

    internal fun unwrap(wrapped: NoneDataSource):
        software.amazon.awscdk.services.appsync.NoneDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.NoneDataSource
  }
}
