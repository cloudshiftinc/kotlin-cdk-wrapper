@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIndex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * PropertyMappingProperty propertyMappingProperty_;
 * CfnIndexProps cfnIndexProps = CfnIndexProps.builder()
 * .collectionEndpoint("collectionEndpoint")
 * .indexName("indexName")
 * // the properties below are optional
 * .mappings(MappingsProperty.builder()
 * .properties(Map.of(
 * "propertiesKey", PropertyMappingProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .dimension(123)
 * .index(false)
 * .method(MethodProperty.builder()
 * .engine("engine")
 * .name("name")
 * // the properties below are optional
 * .parameters(ParametersProperty.builder()
 * .efConstruction(123)
 * .m(123)
 * .build())
 * .spaceType("spaceType")
 * .build())
 * .properties(Map.of(
 * "propertiesKey", propertyMappingProperty_))
 * .value("value")
 * .build()))
 * .build())
 * .settings(IndexSettingsProperty.builder()
 * .index(IndexProperty.builder()
 * .knn(false)
 * .knnAlgoParamEfSearch(123)
 * .refreshInterval("refreshInterval")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html)
 */
public interface CfnIndexProps {
  /**
   * The endpoint for the collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-collectionendpoint)
   */
  public fun collectionEndpoint(): String

  /**
   * The name of the OpenSearch Serverless index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-indexname)
   */
  public fun indexName(): String

  /**
   * Index mappings for the OpenSearch Serverless index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
   */
  public fun mappings(): Any? = unwrap(this).getMappings()

  /**
   * Index settings for the OpenSearch Serverless index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
   */
  public fun settings(): Any? = unwrap(this).getSettings()

  /**
   * A builder for [CfnIndexProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param collectionEndpoint The endpoint for the collection. 
     */
    public fun collectionEndpoint(collectionEndpoint: String)

    /**
     * @param indexName The name of the OpenSearch Serverless index. 
     */
    public fun indexName(indexName: String)

    /**
     * @param mappings Index mappings for the OpenSearch Serverless index.
     */
    public fun mappings(mappings: IResolvable)

    /**
     * @param mappings Index mappings for the OpenSearch Serverless index.
     */
    public fun mappings(mappings: CfnIndex.MappingsProperty)

    /**
     * @param mappings Index mappings for the OpenSearch Serverless index.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7d4fb1681390b0e73de63c95a0fed09888fdd9ac6af0ef8ce3d6da09fa6057f")
    public fun mappings(mappings: CfnIndex.MappingsProperty.Builder.() -> Unit)

    /**
     * @param settings Index settings for the OpenSearch Serverless index.
     */
    public fun settings(settings: IResolvable)

    /**
     * @param settings Index settings for the OpenSearch Serverless index.
     */
    public fun settings(settings: CfnIndex.IndexSettingsProperty)

    /**
     * @param settings Index settings for the OpenSearch Serverless index.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d254cfe9daaaae8e8c26b3223b71895f4aaa56599bebf43098db87251b4b6196")
    public fun settings(settings: CfnIndex.IndexSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchserverless.CfnIndexProps.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnIndexProps.builder()

    /**
     * @param collectionEndpoint The endpoint for the collection. 
     */
    override fun collectionEndpoint(collectionEndpoint: String) {
      cdkBuilder.collectionEndpoint(collectionEndpoint)
    }

    /**
     * @param indexName The name of the OpenSearch Serverless index. 
     */
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * @param mappings Index mappings for the OpenSearch Serverless index.
     */
    override fun mappings(mappings: IResolvable) {
      cdkBuilder.mappings(mappings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mappings Index mappings for the OpenSearch Serverless index.
     */
    override fun mappings(mappings: CfnIndex.MappingsProperty) {
      cdkBuilder.mappings(mappings.let(CfnIndex.MappingsProperty.Companion::unwrap))
    }

    /**
     * @param mappings Index mappings for the OpenSearch Serverless index.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7d4fb1681390b0e73de63c95a0fed09888fdd9ac6af0ef8ce3d6da09fa6057f")
    override fun mappings(mappings: CfnIndex.MappingsProperty.Builder.() -> Unit): Unit =
        mappings(CfnIndex.MappingsProperty(mappings))

    /**
     * @param settings Index settings for the OpenSearch Serverless index.
     */
    override fun settings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param settings Index settings for the OpenSearch Serverless index.
     */
    override fun settings(settings: CfnIndex.IndexSettingsProperty) {
      cdkBuilder.settings(settings.let(CfnIndex.IndexSettingsProperty.Companion::unwrap))
    }

    /**
     * @param settings Index settings for the OpenSearch Serverless index.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d254cfe9daaaae8e8c26b3223b71895f4aaa56599bebf43098db87251b4b6196")
    override fun settings(settings: CfnIndex.IndexSettingsProperty.Builder.() -> Unit): Unit =
        settings(CfnIndex.IndexSettingsProperty(settings))

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndexProps,
  ) : CdkObject(cdkObject),
      CfnIndexProps {
    /**
     * The endpoint for the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-collectionendpoint)
     */
    override fun collectionEndpoint(): String = unwrap(this).getCollectionEndpoint()

    /**
     * The name of the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-indexname)
     */
    override fun indexName(): String = unwrap(this).getIndexName()

    /**
     * Index mappings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
     */
    override fun mappings(): Any? = unwrap(this).getMappings()

    /**
     * Index settings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
     */
    override fun settings(): Any? = unwrap(this).getSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndexProps):
        CfnIndexProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIndexProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIndexProps):
        software.amazon.awscdk.services.opensearchserverless.CfnIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchserverless.CfnIndexProps
  }
}
