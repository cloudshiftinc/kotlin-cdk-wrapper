@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Configuration of source API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * GraphqlApi graphqlApi;
 * SourceApi sourceApi = SourceApi.builder()
 * .sourceApi(graphqlApi)
 * // the properties below are optional
 * .description("description")
 * .mergeType(MergeType.MANUAL_MERGE)
 * .build();
 * ```
 */
public interface SourceApi {
  /**
   * Description of the Source API asssociation.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Merging option used to associate the source API to the Merged API.
   *
   * Default: - Auto merge. The merge is triggered automatically when the source API has changed
   */
  public fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

  /**
   * Source API that is associated with the merged API.
   */
  public fun sourceApi(): IGraphqlApi

  /**
   * A builder for [SourceApi]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Description of the Source API asssociation.
     */
    public fun description(description: String)

    /**
     * @param mergeType Merging option used to associate the source API to the Merged API.
     */
    public fun mergeType(mergeType: MergeType)

    /**
     * @param sourceApi Source API that is associated with the merged API. 
     */
    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApi.Builder =
        software.amazon.awscdk.services.appsync.SourceApi.builder()

    /**
     * @param description Description of the Source API asssociation.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param mergeType Merging option used to associate the source API to the Merged API.
     */
    override fun mergeType(mergeType: MergeType) {
      cdkBuilder.mergeType(mergeType.let(MergeType::unwrap))
    }

    /**
     * @param sourceApi Source API that is associated with the merged API. 
     */
    override fun sourceApi(sourceApi: IGraphqlApi) {
      cdkBuilder.sourceApi(sourceApi.let(IGraphqlApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.SourceApi = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SourceApi,
  ) : CdkObject(cdkObject), SourceApi {
    /**
     * Description of the Source API asssociation.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Merging option used to associate the source API to the Merged API.
     *
     * Default: - Auto merge. The merge is triggered automatically when the source API has changed
     */
    override fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

    /**
     * Source API that is associated with the merged API.
     */
    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApi {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApi): SourceApi =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApi): software.amazon.awscdk.services.appsync.SourceApi =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.SourceApi
  }
}
