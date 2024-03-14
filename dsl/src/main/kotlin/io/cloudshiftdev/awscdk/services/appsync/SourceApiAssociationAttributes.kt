package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes,
  ) : SourceApiAssociationAttributes {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiAssociationAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes):
        SourceApiAssociationAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiAssociationAttributes):
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
