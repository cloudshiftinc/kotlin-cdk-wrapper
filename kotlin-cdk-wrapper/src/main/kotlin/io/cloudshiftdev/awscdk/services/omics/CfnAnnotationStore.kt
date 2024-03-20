@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an annotation store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * Object schema;
 * CfnAnnotationStore cfnAnnotationStore = CfnAnnotationStore.Builder.create(this,
 * "MyCfnAnnotationStore")
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
public open class CfnAnnotationStore internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnnotationStoreProps,
  ) :
      this(software.amazon.awscdk.services.omics.CfnAnnotationStore(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAnnotationStoreProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAnnotationStoreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAnnotationStoreProps(props)
  )

  /**
   * When the store was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The store's ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The store's status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The store's status message.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * The store's ARN.
   */
  public open fun attrStoreArn(): String = unwrap(this).getAttrStoreArn()

  /**
   * The store's size in bytes.
   */
  public open fun attrStoreSizeBytes(): IResolvable =
      unwrap(this).getAttrStoreSizeBytes().let(IResolvable::wrap)

  /**
   * When the store was updated.
   */
  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  /**
   * A description for the store.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the store.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the Annotation Store.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the Annotation Store.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The genome reference for the store's annotations.
   */
  public open fun reference(): Any? = unwrap(this).getReference()

  /**
   * The genome reference for the store's annotations.
   */
  public open fun reference(`value`: IResolvable) {
    unwrap(this).setReference(`value`.let(IResolvable::unwrap))
  }

  /**
   * The genome reference for the store's annotations.
   */
  public open fun reference(`value`: ReferenceItemProperty) {
    unwrap(this).setReference(`value`.let(ReferenceItemProperty::unwrap))
  }

  /**
   * The genome reference for the store's annotations.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fd83254e2bd0fd0afa244a3ac8186d4e3eb6bb60009220e32fab605786b0bc5")
  public open fun reference(`value`: ReferenceItemProperty.Builder.() -> Unit): Unit =
      reference(ReferenceItemProperty(`value`))

  /**
   * The store's server-side encryption (SSE) settings.
   */
  public open fun sseConfig(): Any? = unwrap(this).getSseConfig()

  /**
   * The store's server-side encryption (SSE) settings.
   */
  public open fun sseConfig(`value`: IResolvable) {
    unwrap(this).setSseConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The store's server-side encryption (SSE) settings.
   */
  public open fun sseConfig(`value`: SseConfigProperty) {
    unwrap(this).setSseConfig(`value`.let(SseConfigProperty::unwrap))
  }

  /**
   * The store's server-side encryption (SSE) settings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80afde8fe85a68acbfb18efefc53f47af970c76603c8038fbb3d02c2673e8ff2")
  public open fun sseConfig(`value`: SseConfigProperty.Builder.() -> Unit): Unit =
      sseConfig(SseConfigProperty(`value`))

  /**
   * The annotation file format of the store.
   */
  public open fun storeFormat(): String = unwrap(this).getStoreFormat()

  /**
   * The annotation file format of the store.
   */
  public open fun storeFormat(`value`: String) {
    unwrap(this).setStoreFormat(`value`)
  }

  /**
   * File parsing options for the annotation store.
   */
  public open fun storeOptions(): Any? = unwrap(this).getStoreOptions()

  /**
   * File parsing options for the annotation store.
   */
  public open fun storeOptions(`value`: IResolvable) {
    unwrap(this).setStoreOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * File parsing options for the annotation store.
   */
  public open fun storeOptions(`value`: StoreOptionsProperty) {
    unwrap(this).setStoreOptions(`value`.let(StoreOptionsProperty::unwrap))
  }

  /**
   * File parsing options for the annotation store.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70a993ece6290faebfc74a8e370effbf8fc6d3722406b7fa47e292f3144f171b")
  public open fun storeOptions(`value`: StoreOptionsProperty.Builder.() -> Unit): Unit =
      storeOptions(StoreOptionsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags for the store.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Tags for the store.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.omics.CfnAnnotationStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-description)
     * @param description A description for the store. 
     */
    public fun description(description: String)

    /**
     * The name of the Annotation Store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-name)
     * @param name The name of the Annotation Store. 
     */
    public fun name(name: String)

    /**
     * The genome reference for the store's annotations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
     * @param reference The genome reference for the store's annotations. 
     */
    public fun reference(reference: IResolvable)

    /**
     * The genome reference for the store's annotations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
     * @param reference The genome reference for the store's annotations. 
     */
    public fun reference(reference: ReferenceItemProperty)

    /**
     * The genome reference for the store's annotations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
     * @param reference The genome reference for the store's annotations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b22f41b8a821fe302ac46e3b1913c8d8308a0c128f5983ae28a00c1e4338e220")
    public fun reference(reference: ReferenceItemProperty.Builder.() -> Unit)

    /**
     * The store's server-side encryption (SSE) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
     * @param sseConfig The store's server-side encryption (SSE) settings. 
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * The store's server-side encryption (SSE) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
     * @param sseConfig The store's server-side encryption (SSE) settings. 
     */
    public fun sseConfig(sseConfig: SseConfigProperty)

    /**
     * The store's server-side encryption (SSE) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
     * @param sseConfig The store's server-side encryption (SSE) settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742026332c2b98f1f2e17b196108d72301db805af046abb664e8285bdfee8680")
    public fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit)

    /**
     * The annotation file format of the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeformat)
     * @param storeFormat The annotation file format of the store. 
     */
    public fun storeFormat(storeFormat: String)

    /**
     * File parsing options for the annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
     * @param storeOptions File parsing options for the annotation store. 
     */
    public fun storeOptions(storeOptions: IResolvable)

    /**
     * File parsing options for the annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
     * @param storeOptions File parsing options for the annotation store. 
     */
    public fun storeOptions(storeOptions: StoreOptionsProperty)

    /**
     * File parsing options for the annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
     * @param storeOptions File parsing options for the annotation store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("beb1462e4842546350e44250c96c6d60a6a58edea24c6780a368fe4b701e385d")
    public fun storeOptions(storeOptions: StoreOptionsProperty.Builder.() -> Unit)

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-tags)
     * @param tags Tags for the store. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnAnnotationStore.Builder =
        software.amazon.awscdk.services.omics.CfnAnnotationStore.Builder.create(scope, id)

    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-description)
     * @param description A description for the store. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the Annotation Store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-name)
     * @param name The name of the Annotation Store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The genome reference for the store's annotations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
     * @param reference The genome reference for the store's annotations. 
     */
    override fun reference(reference: IResolvable) {
      cdkBuilder.reference(reference.let(IResolvable::unwrap))
    }

    /**
     * The genome reference for the store's annotations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
     * @param reference The genome reference for the store's annotations. 
     */
    override fun reference(reference: ReferenceItemProperty) {
      cdkBuilder.reference(reference.let(ReferenceItemProperty::unwrap))
    }

    /**
     * The genome reference for the store's annotations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-reference)
     * @param reference The genome reference for the store's annotations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b22f41b8a821fe302ac46e3b1913c8d8308a0c128f5983ae28a00c1e4338e220")
    override fun reference(reference: ReferenceItemProperty.Builder.() -> Unit): Unit =
        reference(ReferenceItemProperty(reference))

    /**
     * The store's server-side encryption (SSE) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
     * @param sseConfig The store's server-side encryption (SSE) settings. 
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    /**
     * The store's server-side encryption (SSE) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
     * @param sseConfig The store's server-side encryption (SSE) settings. 
     */
    override fun sseConfig(sseConfig: SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(SseConfigProperty::unwrap))
    }

    /**
     * The store's server-side encryption (SSE) settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-sseconfig)
     * @param sseConfig The store's server-side encryption (SSE) settings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742026332c2b98f1f2e17b196108d72301db805af046abb664e8285bdfee8680")
    override fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(SseConfigProperty(sseConfig))

    /**
     * The annotation file format of the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeformat)
     * @param storeFormat The annotation file format of the store. 
     */
    override fun storeFormat(storeFormat: String) {
      cdkBuilder.storeFormat(storeFormat)
    }

    /**
     * File parsing options for the annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
     * @param storeOptions File parsing options for the annotation store. 
     */
    override fun storeOptions(storeOptions: IResolvable) {
      cdkBuilder.storeOptions(storeOptions.let(IResolvable::unwrap))
    }

    /**
     * File parsing options for the annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
     * @param storeOptions File parsing options for the annotation store. 
     */
    override fun storeOptions(storeOptions: StoreOptionsProperty) {
      cdkBuilder.storeOptions(storeOptions.let(StoreOptionsProperty::unwrap))
    }

    /**
     * File parsing options for the annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-storeoptions)
     * @param storeOptions File parsing options for the annotation store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("beb1462e4842546350e44250c96c6d60a6a58edea24c6780a368fe4b701e385d")
    override fun storeOptions(storeOptions: StoreOptionsProperty.Builder.() -> Unit): Unit =
        storeOptions(StoreOptionsProperty(storeOptions))

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html#cfn-omics-annotationstore-tags)
     * @param tags Tags for the store. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnAnnotationStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnAnnotationStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnnotationStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnnotationStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore):
        CfnAnnotationStore = CfnAnnotationStore(cdkObject)

    internal fun unwrap(wrapped: CfnAnnotationStore):
        software.amazon.awscdk.services.omics.CfnAnnotationStore = wrapped.cdkObject
  }

  /**
   * A genome reference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.omics.*;
   * ReferenceItemProperty referenceItemProperty = ReferenceItemProperty.builder()
   * .referenceArn("referenceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-referenceitem.html)
   */
  public interface ReferenceItemProperty {
    /**
     * The reference's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-referenceitem.html#cfn-omics-annotationstore-referenceitem-referencearn)
     */
    public fun referenceArn(): String

    /**
     * A builder for [ReferenceItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param referenceArn The reference's ARN. 
       */
      public fun referenceArn(referenceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty.builder()

      /**
       * @param referenceArn The reference's ARN. 
       */
      override fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty,
    ) : CdkObject(cdkObject), ReferenceItemProperty {
      /**
       * The reference's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-referenceitem.html#cfn-omics-annotationstore-referenceitem-referencearn)
       */
      override fun referenceArn(): String = unwrap(this).getReferenceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty):
          ReferenceItemProperty = CdkObjectWrappers.wrap(cdkObject) as? ReferenceItemProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceItemProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty
    }
  }

  /**
   * The store's file parsing options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.omics.*;
   * Object schema;
   * StoreOptionsProperty storeOptionsProperty = StoreOptionsProperty.builder()
   * .tsvStoreOptions(TsvStoreOptionsProperty.builder()
   * .annotationType("annotationType")
   * .formatToHeader(Map.of(
   * "formatToHeaderKey", "formatToHeader"))
   * .schema(schema)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-storeoptions.html)
   */
  public interface StoreOptionsProperty {
    /**
     * Formatting options for a TSV file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-storeoptions.html#cfn-omics-annotationstore-storeoptions-tsvstoreoptions)
     */
    public fun tsvStoreOptions(): Any

    /**
     * A builder for [StoreOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param tsvStoreOptions Formatting options for a TSV file. 
       */
      public fun tsvStoreOptions(tsvStoreOptions: IResolvable)

      /**
       * @param tsvStoreOptions Formatting options for a TSV file. 
       */
      public fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty)

      /**
       * @param tsvStoreOptions Formatting options for a TSV file. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da03542bf298b1170fb52c32eea77b038cc256601686481b3dc9a051bd3305e1")
      public fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty.builder()

      /**
       * @param tsvStoreOptions Formatting options for a TSV file. 
       */
      override fun tsvStoreOptions(tsvStoreOptions: IResolvable) {
        cdkBuilder.tsvStoreOptions(tsvStoreOptions.let(IResolvable::unwrap))
      }

      /**
       * @param tsvStoreOptions Formatting options for a TSV file. 
       */
      override fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty) {
        cdkBuilder.tsvStoreOptions(tsvStoreOptions.let(TsvStoreOptionsProperty::unwrap))
      }

      /**
       * @param tsvStoreOptions Formatting options for a TSV file. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da03542bf298b1170fb52c32eea77b038cc256601686481b3dc9a051bd3305e1")
      override fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty.Builder.() -> Unit):
          Unit = tsvStoreOptions(TsvStoreOptionsProperty(tsvStoreOptions))

      public fun build():
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty,
    ) : CdkObject(cdkObject), StoreOptionsProperty {
      /**
       * Formatting options for a TSV file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-storeoptions.html#cfn-omics-annotationstore-storeoptions-tsvstoreoptions)
       */
      override fun tsvStoreOptions(): Any = unwrap(this).getTsvStoreOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StoreOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty):
          StoreOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? StoreOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoreOptionsProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty
    }
  }

  /**
   * Server-side encryption (SSE) settings for a store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.omics.*;
   * SseConfigProperty sseConfigProperty = SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-sseconfig.html)
   */
  public interface SseConfigProperty {
    /**
     * An encryption key ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-sseconfig.html#cfn-omics-annotationstore-sseconfig-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The encryption type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-sseconfig.html#cfn-omics-annotationstore-sseconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [SseConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyArn An encryption key ARN.
       */
      public fun keyArn(keyArn: String)

      /**
       * @param type The encryption type. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty.builder()

      /**
       * @param keyArn An encryption key ARN.
       */
      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      /**
       * @param type The encryption type. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty,
    ) : CdkObject(cdkObject), SseConfigProperty {
      /**
       * An encryption key ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-sseconfig.html#cfn-omics-annotationstore-sseconfig-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * The encryption type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-sseconfig.html#cfn-omics-annotationstore-sseconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty):
          SseConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SseConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty
    }
  }

  /**
   * The store's parsing options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.omics.*;
   * Object schema;
   * TsvStoreOptionsProperty tsvStoreOptionsProperty = TsvStoreOptionsProperty.builder()
   * .annotationType("annotationType")
   * .formatToHeader(Map.of(
   * "formatToHeaderKey", "formatToHeader"))
   * .schema(schema)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html)
   */
  public interface TsvStoreOptionsProperty {
    /**
     * The store's annotation type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html#cfn-omics-annotationstore-tsvstoreoptions-annotationtype)
     */
    public fun annotationType(): String? = unwrap(this).getAnnotationType()

    /**
     * The store's header key to column name mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html#cfn-omics-annotationstore-tsvstoreoptions-formattoheader)
     */
    public fun formatToHeader(): Any? = unwrap(this).getFormatToHeader()

    /**
     * The schema of an annotation store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html#cfn-omics-annotationstore-tsvstoreoptions-schema)
     */
    public fun schema(): Any? = unwrap(this).getSchema()

    /**
     * A builder for [TsvStoreOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param annotationType The store's annotation type.
       */
      public fun annotationType(annotationType: String)

      /**
       * @param formatToHeader The store's header key to column name mapping.
       */
      public fun formatToHeader(formatToHeader: IResolvable)

      /**
       * @param formatToHeader The store's header key to column name mapping.
       */
      public fun formatToHeader(formatToHeader: Map<String, String>)

      /**
       * @param schema The schema of an annotation store.
       */
      public fun schema(schema: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty.builder()

      /**
       * @param annotationType The store's annotation type.
       */
      override fun annotationType(annotationType: String) {
        cdkBuilder.annotationType(annotationType)
      }

      /**
       * @param formatToHeader The store's header key to column name mapping.
       */
      override fun formatToHeader(formatToHeader: IResolvable) {
        cdkBuilder.formatToHeader(formatToHeader.let(IResolvable::unwrap))
      }

      /**
       * @param formatToHeader The store's header key to column name mapping.
       */
      override fun formatToHeader(formatToHeader: Map<String, String>) {
        cdkBuilder.formatToHeader(formatToHeader)
      }

      /**
       * @param schema The schema of an annotation store.
       */
      override fun schema(schema: Any) {
        cdkBuilder.schema(schema)
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty,
    ) : CdkObject(cdkObject), TsvStoreOptionsProperty {
      /**
       * The store's annotation type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html#cfn-omics-annotationstore-tsvstoreoptions-annotationtype)
       */
      override fun annotationType(): String? = unwrap(this).getAnnotationType()

      /**
       * The store's header key to column name mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html#cfn-omics-annotationstore-tsvstoreoptions-formattoheader)
       */
      override fun formatToHeader(): Any? = unwrap(this).getFormatToHeader()

      /**
       * The schema of an annotation store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html#cfn-omics-annotationstore-tsvstoreoptions-schema)
       */
      override fun schema(): Any? = unwrap(this).getSchema()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TsvStoreOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty):
          TsvStoreOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? TsvStoreOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TsvStoreOptionsProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty
    }
  }
}
