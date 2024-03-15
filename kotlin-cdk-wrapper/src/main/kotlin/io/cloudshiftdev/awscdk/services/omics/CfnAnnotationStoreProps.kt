@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAnnotationStore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * Object schema;
 * CfnAnnotationStoreProps cfnAnnotationStoreProps = CfnAnnotationStoreProps.builder()
 * .name("name")
 * .storeFormat("storeFormat")
 * // the properties below are optional
 * .description("description")
 * .reference(ReferenceItemProperty.builder()
 * .referenceArn("referenceArn")
 * .build())
 * .sseConfig(SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .storeOptions(StoreOptionsProperty.builder()
 * .tsvStoreOptions(TsvStoreOptionsProperty.builder()
 * .annotationType("annotationType")
 * .formatToHeader(Map.of(
 * "formatToHeaderKey", "formatToHeader"))
 * .schema(schema)
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html)
 */
public interface CfnAnnotationStoreProps {
  /**
   * A description for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the Annotation Store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-name)
   */
  public fun name(): String

  /**
   * The genome reference for the store's annotations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
   */
  public fun reference(): Any? = unwrap(this).getReference()

  /**
   * The store's server-side encryption (SSE) settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
   */
  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  /**
   * The annotation file format of the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeformat)
   */
  public fun storeFormat(): String

  /**
   * File parsing options for the annotation store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
   */
  public fun storeOptions(): Any? = unwrap(this).getStoreOptions()

  /**
   * Tags for the store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnAnnotationStoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the store.
     */
    public fun description(description: String)

    /**
     * @param name The name of the Annotation Store. 
     */
    public fun name(name: String)

    /**
     * @param reference The genome reference for the store's annotations.
     */
    public fun reference(reference: IResolvable)

    /**
     * @param reference The genome reference for the store's annotations.
     */
    public fun reference(reference: CfnAnnotationStore.ReferenceItemProperty)

    /**
     * @param reference The genome reference for the store's annotations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b311b75f53a798bcf105a53b644a70d582b706e7155a81df86afc84dd1e5247")
    public fun reference(reference: CfnAnnotationStore.ReferenceItemProperty.Builder.() -> Unit)

    /**
     * @param sseConfig The store's server-side encryption (SSE) settings.
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * @param sseConfig The store's server-side encryption (SSE) settings.
     */
    public fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty)

    /**
     * @param sseConfig The store's server-side encryption (SSE) settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349e90bc0b910c760eccd5ac607bb4807c4c2cb32a332e28bfba23869782ea")
    public fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty.Builder.() -> Unit)

    /**
     * @param storeFormat The annotation file format of the store. 
     */
    public fun storeFormat(storeFormat: String)

    /**
     * @param storeOptions File parsing options for the annotation store.
     */
    public fun storeOptions(storeOptions: IResolvable)

    /**
     * @param storeOptions File parsing options for the annotation store.
     */
    public fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty)

    /**
     * @param storeOptions File parsing options for the annotation store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fc5fc9d641ca248b61b5eaf45a09c0f8b380b8cc294d9fe6872b3987a5d4332")
    public
        fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty.Builder.() -> Unit)

    /**
     * @param tags Tags for the store.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnAnnotationStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnAnnotationStoreProps.builder()

    /**
     * @param description A description for the store.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the Annotation Store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param reference The genome reference for the store's annotations.
     */
    override fun reference(reference: IResolvable) {
      cdkBuilder.reference(reference.let(IResolvable::unwrap))
    }

    /**
     * @param reference The genome reference for the store's annotations.
     */
    override fun reference(reference: CfnAnnotationStore.ReferenceItemProperty) {
      cdkBuilder.reference(reference.let(CfnAnnotationStore.ReferenceItemProperty::unwrap))
    }

    /**
     * @param reference The genome reference for the store's annotations.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b311b75f53a798bcf105a53b644a70d582b706e7155a81df86afc84dd1e5247")
    override fun reference(reference: CfnAnnotationStore.ReferenceItemProperty.Builder.() -> Unit):
        Unit = reference(CfnAnnotationStore.ReferenceItemProperty(reference))

    /**
     * @param sseConfig The store's server-side encryption (SSE) settings.
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    /**
     * @param sseConfig The store's server-side encryption (SSE) settings.
     */
    override fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnAnnotationStore.SseConfigProperty::unwrap))
    }

    /**
     * @param sseConfig The store's server-side encryption (SSE) settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349e90bc0b910c760eccd5ac607bb4807c4c2cb32a332e28bfba23869782ea")
    override fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty.Builder.() -> Unit): Unit
        = sseConfig(CfnAnnotationStore.SseConfigProperty(sseConfig))

    /**
     * @param storeFormat The annotation file format of the store. 
     */
    override fun storeFormat(storeFormat: String) {
      cdkBuilder.storeFormat(storeFormat)
    }

    /**
     * @param storeOptions File parsing options for the annotation store.
     */
    override fun storeOptions(storeOptions: IResolvable) {
      cdkBuilder.storeOptions(storeOptions.let(IResolvable::unwrap))
    }

    /**
     * @param storeOptions File parsing options for the annotation store.
     */
    override fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty) {
      cdkBuilder.storeOptions(storeOptions.let(CfnAnnotationStore.StoreOptionsProperty::unwrap))
    }

    /**
     * @param storeOptions File parsing options for the annotation store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fc5fc9d641ca248b61b5eaf45a09c0f8b380b8cc294d9fe6872b3987a5d4332")
    override
        fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty.Builder.() -> Unit):
        Unit = storeOptions(CfnAnnotationStore.StoreOptionsProperty(storeOptions))

    /**
     * @param tags Tags for the store.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnAnnotationStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStoreProps,
  ) : CdkObject(cdkObject), CfnAnnotationStoreProps {
    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the Annotation Store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The genome reference for the store's annotations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
     */
    override fun reference(): Any? = unwrap(this).getReference()

    /**
     * The store's server-side encryption (SSE) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
     */
    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    /**
     * The annotation file format of the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeformat)
     */
    override fun storeFormat(): String = unwrap(this).getStoreFormat()

    /**
     * File parsing options for the annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
     */
    override fun storeOptions(): Any? = unwrap(this).getStoreOptions()

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnnotationStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStoreProps):
        CfnAnnotationStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnnotationStoreProps):
        software.amazon.awscdk.services.omics.CfnAnnotationStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnAnnotationStoreProps
  }
}
