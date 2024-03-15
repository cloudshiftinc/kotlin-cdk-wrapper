@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * The attributes for imported AppSync Source Api Association.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * GraphqlApi graphqlApi;
 * SourceApiAssociationAttributes sourceApiAssociationAttributes =
 * SourceApiAssociationAttributes.builder()
 * .associationArn("associationArn")
 * .mergedApi(graphqlApi)
 * .sourceApi(graphqlApi)
 * .build();
 * ```
 */
public interface SourceApiAssociationAttributes {
  /**
   * The association arn.
   */
  public fun associationArn(): String

  /**
   * The merged api in the association.
   */
  public fun mergedApi(): IGraphqlApi

  /**
   * The source api in the association.
   */
  public fun sourceApi(): IGraphqlApi

  /**
   * A builder for [SourceApiAssociationAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param associationArn The association arn. 
     */
    public fun associationArn(associationArn: String)

    /**
     * @param mergedApi The merged api in the association. 
     */
    public fun mergedApi(mergedApi: IGraphqlApi)

    /**
     * @param sourceApi The source api in the association. 
     */
    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes.Builder =
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes.builder()

    /**
     * @param associationArn The association arn. 
     */
    override fun associationArn(associationArn: String) {
      cdkBuilder.associationArn(associationArn)
    }

    /**
     * @param mergedApi The merged api in the association. 
     */
    override fun mergedApi(mergedApi: IGraphqlApi) {
      cdkBuilder.mergedApi(mergedApi.let(IGraphqlApi::unwrap))
    }

    /**
     * @param sourceApi The source api in the association. 
     */
    override fun sourceApi(sourceApi: IGraphqlApi) {
      cdkBuilder.sourceApi(sourceApi.let(IGraphqlApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes,
  ) : CdkObject(cdkObject), SourceApiAssociationAttributes {
    /**
     * The association arn.
     */
    override fun associationArn(): String = unwrap(this).getAssociationArn()

    /**
     * The merged api in the association.
     */
    override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

    /**
     * The source api in the association.
     */
    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiAssociationAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes):
        SourceApiAssociationAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiAssociationAttributes):
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes
  }
}
