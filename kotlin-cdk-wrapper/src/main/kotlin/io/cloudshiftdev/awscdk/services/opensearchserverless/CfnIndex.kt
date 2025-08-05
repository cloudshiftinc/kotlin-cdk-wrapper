@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An OpenSearch Serverless index resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
 * PropertyMappingProperty propertyMappingProperty_;
 * CfnIndex cfnIndex = CfnIndex.Builder.create(this, "MyCfnIndex")
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
public open class CfnIndex(
  cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIndexProps,
  ) :
      this(software.amazon.awscdk.services.opensearchserverless.CfnIndex(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIndexProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIndexProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIndexProps(props)
  )

  /**
   * The unique identifier for the index.
   */
  public open fun attrUuid(): String = unwrap(this).getAttrUuid()

  /**
   * The endpoint for the collection.
   */
  public open fun collectionEndpoint(): String = unwrap(this).getCollectionEndpoint()

  /**
   * The endpoint for the collection.
   */
  public open fun collectionEndpoint(`value`: String) {
    unwrap(this).setCollectionEndpoint(`value`)
  }

  /**
   * The name of the OpenSearch Serverless index.
   */
  public open fun indexName(): String = unwrap(this).getIndexName()

  /**
   * The name of the OpenSearch Serverless index.
   */
  public open fun indexName(`value`: String) {
    unwrap(this).setIndexName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Index mappings for the OpenSearch Serverless index.
   */
  public open fun mappings(): Any? = unwrap(this).getMappings()

  /**
   * Index mappings for the OpenSearch Serverless index.
   */
  public open fun mappings(`value`: IResolvable) {
    unwrap(this).setMappings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Index mappings for the OpenSearch Serverless index.
   */
  public open fun mappings(`value`: MappingsProperty) {
    unwrap(this).setMappings(`value`.let(MappingsProperty.Companion::unwrap))
  }

  /**
   * Index mappings for the OpenSearch Serverless index.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("62a02d3223738ffddf0f1b337fa04c01f9404c7bc0d6488edbfded01e12fe3e2")
  public open fun mappings(`value`: MappingsProperty.Builder.() -> Unit): Unit =
      mappings(MappingsProperty(`value`))

  /**
   * Index settings for the OpenSearch Serverless index.
   */
  public open fun settings(): Any? = unwrap(this).getSettings()

  /**
   * Index settings for the OpenSearch Serverless index.
   */
  public open fun settings(`value`: IResolvable) {
    unwrap(this).setSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Index settings for the OpenSearch Serverless index.
   */
  public open fun settings(`value`: IndexSettingsProperty) {
    unwrap(this).setSettings(`value`.let(IndexSettingsProperty.Companion::unwrap))
  }

  /**
   * Index settings for the OpenSearch Serverless index.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("76162d4c3b5f634f60e62a35461bea2c6ea432ea1df7e2a57f7c329e549df898")
  public open fun settings(`value`: IndexSettingsProperty.Builder.() -> Unit): Unit =
      settings(IndexSettingsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchserverless.CfnIndex].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The endpoint for the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-collectionendpoint)
     * @param collectionEndpoint The endpoint for the collection. 
     */
    public fun collectionEndpoint(collectionEndpoint: String)

    /**
     * The name of the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-indexname)
     * @param indexName The name of the OpenSearch Serverless index. 
     */
    public fun indexName(indexName: String)

    /**
     * Index mappings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
     * @param mappings Index mappings for the OpenSearch Serverless index. 
     */
    public fun mappings(mappings: IResolvable)

    /**
     * Index mappings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
     * @param mappings Index mappings for the OpenSearch Serverless index. 
     */
    public fun mappings(mappings: MappingsProperty)

    /**
     * Index mappings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
     * @param mappings Index mappings for the OpenSearch Serverless index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("688e741608dd522044d0307c20fcf0308f42e5e83d64d2465042ea1c86cfe5c8")
    public fun mappings(mappings: MappingsProperty.Builder.() -> Unit)

    /**
     * Index settings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
     * @param settings Index settings for the OpenSearch Serverless index. 
     */
    public fun settings(settings: IResolvable)

    /**
     * Index settings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
     * @param settings Index settings for the OpenSearch Serverless index. 
     */
    public fun settings(settings: IndexSettingsProperty)

    /**
     * Index settings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
     * @param settings Index settings for the OpenSearch Serverless index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cab16668efc2f729a508bfb0a66006a0d84c2a2068928c4558092e4a53392d2e")
    public fun settings(settings: IndexSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchserverless.CfnIndex.Builder =
        software.amazon.awscdk.services.opensearchserverless.CfnIndex.Builder.create(scope, id)

    /**
     * The endpoint for the collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-collectionendpoint)
     * @param collectionEndpoint The endpoint for the collection. 
     */
    override fun collectionEndpoint(collectionEndpoint: String) {
      cdkBuilder.collectionEndpoint(collectionEndpoint)
    }

    /**
     * The name of the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-indexname)
     * @param indexName The name of the OpenSearch Serverless index. 
     */
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * Index mappings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
     * @param mappings Index mappings for the OpenSearch Serverless index. 
     */
    override fun mappings(mappings: IResolvable) {
      cdkBuilder.mappings(mappings.let(IResolvable.Companion::unwrap))
    }

    /**
     * Index mappings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
     * @param mappings Index mappings for the OpenSearch Serverless index. 
     */
    override fun mappings(mappings: MappingsProperty) {
      cdkBuilder.mappings(mappings.let(MappingsProperty.Companion::unwrap))
    }

    /**
     * Index mappings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-mappings)
     * @param mappings Index mappings for the OpenSearch Serverless index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("688e741608dd522044d0307c20fcf0308f42e5e83d64d2465042ea1c86cfe5c8")
    override fun mappings(mappings: MappingsProperty.Builder.() -> Unit): Unit =
        mappings(MappingsProperty(mappings))

    /**
     * Index settings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
     * @param settings Index settings for the OpenSearch Serverless index. 
     */
    override fun settings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable.Companion::unwrap))
    }

    /**
     * Index settings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
     * @param settings Index settings for the OpenSearch Serverless index. 
     */
    override fun settings(settings: IndexSettingsProperty) {
      cdkBuilder.settings(settings.let(IndexSettingsProperty.Companion::unwrap))
    }

    /**
     * Index settings for the OpenSearch Serverless index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-index.html#cfn-opensearchserverless-index-settings)
     * @param settings Index settings for the OpenSearch Serverless index. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cab16668efc2f729a508bfb0a66006a0d84c2a2068928c4558092e4a53392d2e")
    override fun settings(settings: IndexSettingsProperty.Builder.() -> Unit): Unit =
        settings(IndexSettingsProperty(settings))

    public fun build(): software.amazon.awscdk.services.opensearchserverless.CfnIndex =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchserverless.CfnIndex.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIndex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIndex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex):
        CfnIndex = CfnIndex(cdkObject)

    internal fun unwrap(wrapped: CfnIndex):
        software.amazon.awscdk.services.opensearchserverless.CfnIndex = wrapped.cdkObject as
        software.amazon.awscdk.services.opensearchserverless.CfnIndex
  }

  /**
   * An OpenSearch Serverless index resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * IndexProperty indexProperty = IndexProperty.builder()
   * .knn(false)
   * .knnAlgoParamEfSearch(123)
   * .refreshInterval("refreshInterval")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-index.html)
   */
  public interface IndexProperty {
    /**
     * Enable or disable k-nearest neighbor search capability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-index.html#cfn-opensearchserverless-index-index-knn)
     */
    public fun knn(): Any? = unwrap(this).getKnn()

    /**
     * The size of the dynamic list for the nearest neighbors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-index.html#cfn-opensearchserverless-index-index-knnalgoparamefsearch)
     */
    public fun knnAlgoParamEfSearch(): Number? = unwrap(this).getKnnAlgoParamEfSearch()

    /**
     * How often to perform a refresh operation.
     *
     * For example, 1s or 5s.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-index.html#cfn-opensearchserverless-index-index-refreshinterval)
     */
    public fun refreshInterval(): String? = unwrap(this).getRefreshInterval()

    /**
     * A builder for [IndexProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param knn Enable or disable k-nearest neighbor search capability.
       */
      public fun knn(knn: Boolean)

      /**
       * @param knn Enable or disable k-nearest neighbor search capability.
       */
      public fun knn(knn: IResolvable)

      /**
       * @param knnAlgoParamEfSearch The size of the dynamic list for the nearest neighbors.
       */
      public fun knnAlgoParamEfSearch(knnAlgoParamEfSearch: Number)

      /**
       * @param refreshInterval How often to perform a refresh operation.
       * For example, 1s or 5s.
       */
      public fun refreshInterval(refreshInterval: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexProperty.Builder =
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexProperty.builder()

      /**
       * @param knn Enable or disable k-nearest neighbor search capability.
       */
      override fun knn(knn: Boolean) {
        cdkBuilder.knn(knn)
      }

      /**
       * @param knn Enable or disable k-nearest neighbor search capability.
       */
      override fun knn(knn: IResolvable) {
        cdkBuilder.knn(knn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param knnAlgoParamEfSearch The size of the dynamic list for the nearest neighbors.
       */
      override fun knnAlgoParamEfSearch(knnAlgoParamEfSearch: Number) {
        cdkBuilder.knnAlgoParamEfSearch(knnAlgoParamEfSearch)
      }

      /**
       * @param refreshInterval How often to perform a refresh operation.
       * For example, 1s or 5s.
       */
      override fun refreshInterval(refreshInterval: String) {
        cdkBuilder.refreshInterval(refreshInterval)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexProperty,
    ) : CdkObject(cdkObject),
        IndexProperty {
      /**
       * Enable or disable k-nearest neighbor search capability.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-index.html#cfn-opensearchserverless-index-index-knn)
       */
      override fun knn(): Any? = unwrap(this).getKnn()

      /**
       * The size of the dynamic list for the nearest neighbors.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-index.html#cfn-opensearchserverless-index-index-knnalgoparamefsearch)
       */
      override fun knnAlgoParamEfSearch(): Number? = unwrap(this).getKnnAlgoParamEfSearch()

      /**
       * How often to perform a refresh operation.
       *
       * For example, 1s or 5s.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-index.html#cfn-opensearchserverless-index-index-refreshinterval)
       */
      override fun refreshInterval(): String? = unwrap(this).getRefreshInterval()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IndexProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexProperty):
          IndexProperty = CdkObjectWrappers.wrap(cdkObject) as? IndexProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IndexProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexProperty
    }
  }

  /**
   * Index settings for the OpenSearch Serverless index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * IndexSettingsProperty indexSettingsProperty = IndexSettingsProperty.builder()
   * .index(IndexProperty.builder()
   * .knn(false)
   * .knnAlgoParamEfSearch(123)
   * .refreshInterval("refreshInterval")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-indexsettings.html)
   */
  public interface IndexSettingsProperty {
    /**
     * Index settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-indexsettings.html#cfn-opensearchserverless-index-indexsettings-index)
     */
    public fun index(): Any? = unwrap(this).getIndex()

    /**
     * A builder for [IndexSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param index Index settings.
       */
      public fun index(index: IResolvable)

      /**
       * @param index Index settings.
       */
      public fun index(index: IndexProperty)

      /**
       * @param index Index settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fc3d992eb96a5838c3712bd7d9023a02b0d051fefea98eb86cc7345de902a14")
      public fun index(index: IndexProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexSettingsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexSettingsProperty.builder()

      /**
       * @param index Index settings.
       */
      override fun index(index: IResolvable) {
        cdkBuilder.index(index.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param index Index settings.
       */
      override fun index(index: IndexProperty) {
        cdkBuilder.index(index.let(IndexProperty.Companion::unwrap))
      }

      /**
       * @param index Index settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fc3d992eb96a5838c3712bd7d9023a02b0d051fefea98eb86cc7345de902a14")
      override fun index(index: IndexProperty.Builder.() -> Unit): Unit =
          index(IndexProperty(index))

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexSettingsProperty,
    ) : CdkObject(cdkObject),
        IndexSettingsProperty {
      /**
       * Index settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-indexsettings.html#cfn-opensearchserverless-index-indexsettings-index)
       */
      override fun index(): Any? = unwrap(this).getIndex()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IndexSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexSettingsProperty):
          IndexSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? IndexSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IndexSettingsProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.IndexSettingsProperty
    }
  }

  /**
   * Index mappings for the OpenSearch Serverless index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * PropertyMappingProperty propertyMappingProperty_;
   * MappingsProperty mappingsProperty = MappingsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-mappings.html)
   */
  public interface MappingsProperty {
    /**
     * Nested fields within an object or nested field type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-mappings.html#cfn-opensearchserverless-index-mappings-properties)
     */
    public fun properties(): Any? = unwrap(this).getProperties()

    /**
     * A builder for [MappingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param properties Nested fields within an object or nested field type.
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties Nested fields within an object or nested field type.
       */
      public fun properties(properties: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MappingsProperty.Builder =
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MappingsProperty.builder()

      /**
       * @param properties Nested fields within an object or nested field type.
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param properties Nested fields within an object or nested field type.
       */
      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MappingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.MappingsProperty,
    ) : CdkObject(cdkObject),
        MappingsProperty {
      /**
       * Nested fields within an object or nested field type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-mappings.html#cfn-opensearchserverless-index-mappings-properties)
       */
      override fun properties(): Any? = unwrap(this).getProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.MappingsProperty):
          MappingsProperty = CdkObjectWrappers.wrap(cdkObject) as? MappingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingsProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MappingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MappingsProperty
    }
  }

  /**
   * Configuration for k-NN search method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * MethodProperty methodProperty = MethodProperty.builder()
   * .engine("engine")
   * .name("name")
   * // the properties below are optional
   * .parameters(ParametersProperty.builder()
   * .efConstruction(123)
   * .m(123)
   * .build())
   * .spaceType("spaceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html)
   */
  public interface MethodProperty {
    /**
     * The k-NN search engine to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-engine)
     */
    public fun engine(): String

    /**
     * The algorithm name for k-NN search.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-name)
     */
    public fun name(): String

    /**
     * Additional parameters for the k-NN algorithm.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The distance function used for k-NN search.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-spacetype)
     */
    public fun spaceType(): String? = unwrap(this).getSpaceType()

    /**
     * A builder for [MethodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param engine The k-NN search engine to use. 
       */
      public fun engine(engine: String)

      /**
       * @param name The algorithm name for k-NN search. 
       */
      public fun name(name: String)

      /**
       * @param parameters Additional parameters for the k-NN algorithm.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters Additional parameters for the k-NN algorithm.
       */
      public fun parameters(parameters: ParametersProperty)

      /**
       * @param parameters Additional parameters for the k-NN algorithm.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81f4f098e0e13b7d3cfb42a820273422435c6295b92c4d67bf8a03b4d1404d30")
      public fun parameters(parameters: ParametersProperty.Builder.() -> Unit)

      /**
       * @param spaceType The distance function used for k-NN search.
       */
      public fun spaceType(spaceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MethodProperty.Builder =
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MethodProperty.builder()

      /**
       * @param engine The k-NN search engine to use. 
       */
      override fun engine(engine: String) {
        cdkBuilder.engine(engine)
      }

      /**
       * @param name The algorithm name for k-NN search. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param parameters Additional parameters for the k-NN algorithm.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameters Additional parameters for the k-NN algorithm.
       */
      override fun parameters(parameters: ParametersProperty) {
        cdkBuilder.parameters(parameters.let(ParametersProperty.Companion::unwrap))
      }

      /**
       * @param parameters Additional parameters for the k-NN algorithm.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81f4f098e0e13b7d3cfb42a820273422435c6295b92c4d67bf8a03b4d1404d30")
      override fun parameters(parameters: ParametersProperty.Builder.() -> Unit): Unit =
          parameters(ParametersProperty(parameters))

      /**
       * @param spaceType The distance function used for k-NN search.
       */
      override fun spaceType(spaceType: String) {
        cdkBuilder.spaceType(spaceType)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MethodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.MethodProperty,
    ) : CdkObject(cdkObject),
        MethodProperty {
      /**
       * The k-NN search engine to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-engine)
       */
      override fun engine(): String = unwrap(this).getEngine()

      /**
       * The algorithm name for k-NN search.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Additional parameters for the k-NN algorithm.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * The distance function used for k-NN search.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-method.html#cfn-opensearchserverless-index-method-spacetype)
       */
      override fun spaceType(): String? = unwrap(this).getSpaceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.MethodProperty):
          MethodProperty = CdkObjectWrappers.wrap(cdkObject) as? MethodProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MethodProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MethodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.MethodProperty
    }
  }

  /**
   * Additional parameters for the k-NN algorithm.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * ParametersProperty parametersProperty = ParametersProperty.builder()
   * .efConstruction(123)
   * .m(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-parameters.html)
   */
  public interface ParametersProperty {
    /**
     * The size of the dynamic list used during k-NN graph creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-parameters.html#cfn-opensearchserverless-index-parameters-efconstruction)
     */
    public fun efConstruction(): Number? = unwrap(this).getEfConstruction()

    /**
     * Number of neighbors to consider during k-NN search.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-parameters.html#cfn-opensearchserverless-index-parameters-m)
     */
    public fun m(): Number? = unwrap(this).getM()

    /**
     * A builder for [ParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param efConstruction The size of the dynamic list used during k-NN graph creation.
       */
      public fun efConstruction(efConstruction: Number)

      /**
       * @param m Number of neighbors to consider during k-NN search.
       */
      public fun m(m: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.ParametersProperty.Builder =
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.ParametersProperty.builder()

      /**
       * @param efConstruction The size of the dynamic list used during k-NN graph creation.
       */
      override fun efConstruction(efConstruction: Number) {
        cdkBuilder.efConstruction(efConstruction)
      }

      /**
       * @param m Number of neighbors to consider during k-NN search.
       */
      override fun m(m: Number) {
        cdkBuilder.m(m)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.ParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.ParametersProperty,
    ) : CdkObject(cdkObject),
        ParametersProperty {
      /**
       * The size of the dynamic list used during k-NN graph creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-parameters.html#cfn-opensearchserverless-index-parameters-efconstruction)
       */
      override fun efConstruction(): Number? = unwrap(this).getEfConstruction()

      /**
       * Number of neighbors to consider during k-NN search.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-parameters.html#cfn-opensearchserverless-index-parameters-m)
       */
      override fun m(): Number? = unwrap(this).getM()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.ParametersProperty):
          ParametersProperty = CdkObjectWrappers.wrap(cdkObject) as? ParametersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParametersProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.ParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.ParametersProperty
    }
  }

  /**
   * Property mappings for the OpenSearch Serverless index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchserverless.*;
   * PropertyMappingProperty propertyMappingProperty_;
   * PropertyMappingProperty propertyMappingProperty = PropertyMappingProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html)
   */
  public interface PropertyMappingProperty {
    /**
     * Dimension size for vector fields, defines the number of dimensions in the vector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-dimension)
     */
    public fun dimension(): Number? = unwrap(this).getDimension()

    /**
     * Whether a field should be indexed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-index)
     */
    public fun index(): Any? = unwrap(this).getIndex()

    /**
     * Configuration for k-NN search method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-method)
     */
    public fun method(): Any? = unwrap(this).getMethod()

    /**
     * Defines the fields within the mapping, including their types and configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-properties)
     */
    public fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The field data type.
     *
     * Must be a valid OpenSearch field type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-type)
     */
    public fun type(): String

    /**
     * Default value for the field when not specified in a document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [PropertyMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimension Dimension size for vector fields, defines the number of dimensions in the
       * vector.
       */
      public fun dimension(dimension: Number)

      /**
       * @param index Whether a field should be indexed.
       */
      public fun index(index: Boolean)

      /**
       * @param index Whether a field should be indexed.
       */
      public fun index(index: IResolvable)

      /**
       * @param method Configuration for k-NN search method.
       */
      public fun method(method: IResolvable)

      /**
       * @param method Configuration for k-NN search method.
       */
      public fun method(method: MethodProperty)

      /**
       * @param method Configuration for k-NN search method.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8afdf7f24bbd34f484b03914f399863dcc3e129e70d74bc080d8cb3a26df01e6")
      public fun method(method: MethodProperty.Builder.() -> Unit)

      /**
       * @param properties Defines the fields within the mapping, including their types and
       * configurations.
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties Defines the fields within the mapping, including their types and
       * configurations.
       */
      public fun properties(properties: Map<String, Any>)

      /**
       * @param type The field data type. 
       * Must be a valid OpenSearch field type.
       */
      public fun type(type: String)

      /**
       * @param value Default value for the field when not specified in a document.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.PropertyMappingProperty.Builder
          =
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.PropertyMappingProperty.builder()

      /**
       * @param dimension Dimension size for vector fields, defines the number of dimensions in the
       * vector.
       */
      override fun dimension(dimension: Number) {
        cdkBuilder.dimension(dimension)
      }

      /**
       * @param index Whether a field should be indexed.
       */
      override fun index(index: Boolean) {
        cdkBuilder.index(index)
      }

      /**
       * @param index Whether a field should be indexed.
       */
      override fun index(index: IResolvable) {
        cdkBuilder.index(index.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param method Configuration for k-NN search method.
       */
      override fun method(method: IResolvable) {
        cdkBuilder.method(method.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param method Configuration for k-NN search method.
       */
      override fun method(method: MethodProperty) {
        cdkBuilder.method(method.let(MethodProperty.Companion::unwrap))
      }

      /**
       * @param method Configuration for k-NN search method.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8afdf7f24bbd34f484b03914f399863dcc3e129e70d74bc080d8cb3a26df01e6")
      override fun method(method: MethodProperty.Builder.() -> Unit): Unit =
          method(MethodProperty(method))

      /**
       * @param properties Defines the fields within the mapping, including their types and
       * configurations.
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param properties Defines the fields within the mapping, including their types and
       * configurations.
       */
      override fun properties(properties: Map<String, Any>) {
        cdkBuilder.properties(properties.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param type The field data type. 
       * Must be a valid OpenSearch field type.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value Default value for the field when not specified in a document.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.PropertyMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.PropertyMappingProperty,
    ) : CdkObject(cdkObject),
        PropertyMappingProperty {
      /**
       * Dimension size for vector fields, defines the number of dimensions in the vector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-dimension)
       */
      override fun dimension(): Number? = unwrap(this).getDimension()

      /**
       * Whether a field should be indexed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-index)
       */
      override fun index(): Any? = unwrap(this).getIndex()

      /**
       * Configuration for k-NN search method.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-method)
       */
      override fun method(): Any? = unwrap(this).getMethod()

      /**
       * Defines the fields within the mapping, including their types and configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-properties)
       */
      override fun properties(): Any? = unwrap(this).getProperties()

      /**
       * The field data type.
       *
       * Must be a valid OpenSearch field type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Default value for the field when not specified in a document.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-index-propertymapping.html#cfn-opensearchserverless-index-propertymapping-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PropertyMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchserverless.CfnIndex.PropertyMappingProperty):
          PropertyMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? PropertyMappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PropertyMappingProperty):
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.PropertyMappingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchserverless.CfnIndex.PropertyMappingProperty
    }
  }
}
