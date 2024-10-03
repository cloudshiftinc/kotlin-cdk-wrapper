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
 * Create a store for variant data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * CfnVariantStore cfnVariantStore = CfnVariantStore.Builder.create(this, "MyCfnVariantStore")
 * .name("name")
 * .reference(ReferenceItemProperty.builder()
 * .referenceArn("referenceArn")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .sseConfig(SseConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html)
 */
public open class CfnVariantStore(
  cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVariantStoreProps,
  ) :
      this(software.amazon.awscdk.services.omics.CfnVariantStore(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVariantStoreProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVariantStoreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVariantStoreProps(props)
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A name for the store.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the store.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The genome reference for the store's variants.
   */
  public open fun reference(): Any = unwrap(this).getReference()

  /**
   * The genome reference for the store's variants.
   */
  public open fun reference(`value`: IResolvable) {
    unwrap(this).setReference(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The genome reference for the store's variants.
   */
  public open fun reference(`value`: ReferenceItemProperty) {
    unwrap(this).setReference(`value`.let(ReferenceItemProperty.Companion::unwrap))
  }

  /**
   * The genome reference for the store's variants.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e041845eebfa928d45781331f20ec3a225ba47d29f1c6d6518b60070cf6bd1b")
  public open fun reference(`value`: ReferenceItemProperty.Builder.() -> Unit): Unit =
      reference(ReferenceItemProperty(`value`))

  /**
   * Server-side encryption (SSE) settings for the store.
   */
  public open fun sseConfig(): Any? = unwrap(this).getSseConfig()

  /**
   * Server-side encryption (SSE) settings for the store.
   */
  public open fun sseConfig(`value`: IResolvable) {
    unwrap(this).setSseConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   */
  public open fun sseConfig(`value`: SseConfigProperty) {
    unwrap(this).setSseConfig(`value`.let(SseConfigProperty.Companion::unwrap))
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c682aa4ae4b204175f8226ff468036d94d65cfc832c6afbf260bfe47504106c6")
  public open fun sseConfig(`value`: SseConfigProperty.Builder.() -> Unit): Unit =
      sseConfig(SseConfigProperty(`value`))

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.omics.CfnVariantStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-description)
     * @param description A description for the store. 
     */
    public fun description(description: String)

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-name)
     * @param name A name for the store. 
     */
    public fun name(name: String)

    /**
     * The genome reference for the store's variants.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
     * @param reference The genome reference for the store's variants. 
     */
    public fun reference(reference: IResolvable)

    /**
     * The genome reference for the store's variants.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
     * @param reference The genome reference for the store's variants. 
     */
    public fun reference(reference: ReferenceItemProperty)

    /**
     * The genome reference for the store's variants.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
     * @param reference The genome reference for the store's variants. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bad7d77455224cc7c3ebfb552a282ce4210a14bd1e17965b10826a8b341188e3")
    public fun reference(reference: ReferenceItemProperty.Builder.() -> Unit)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    public fun sseConfig(sseConfig: SseConfigProperty)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8ac15b344a45f91b8dd63c865bc33d644e6e7fa6d7bbd6c76750a2a941227bf")
    public fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit)

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-tags)
     * @param tags Tags for the store. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnVariantStore.Builder =
        software.amazon.awscdk.services.omics.CfnVariantStore.Builder.create(scope, id)

    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-description)
     * @param description A description for the store. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-name)
     * @param name A name for the store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The genome reference for the store's variants.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
     * @param reference The genome reference for the store's variants. 
     */
    override fun reference(reference: IResolvable) {
      cdkBuilder.reference(reference.let(IResolvable.Companion::unwrap))
    }

    /**
     * The genome reference for the store's variants.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
     * @param reference The genome reference for the store's variants. 
     */
    override fun reference(reference: ReferenceItemProperty) {
      cdkBuilder.reference(reference.let(ReferenceItemProperty.Companion::unwrap))
    }

    /**
     * The genome reference for the store's variants.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-reference)
     * @param reference The genome reference for the store's variants. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bad7d77455224cc7c3ebfb552a282ce4210a14bd1e17965b10826a8b341188e3")
    override fun reference(reference: ReferenceItemProperty.Builder.() -> Unit): Unit =
        reference(ReferenceItemProperty(reference))

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    override fun sseConfig(sseConfig: SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(SseConfigProperty.Companion::unwrap))
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8ac15b344a45f91b8dd63c865bc33d644e6e7fa6d7bbd6c76750a2a941227bf")
    override fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(SseConfigProperty(sseConfig))

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html#cfn-omics-variantstore-tags)
     * @param tags Tags for the store. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnVariantStore = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnVariantStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVariantStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVariantStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore):
        CfnVariantStore = CfnVariantStore(cdkObject)

    internal fun unwrap(wrapped: CfnVariantStore):
        software.amazon.awscdk.services.omics.CfnVariantStore = wrapped.cdkObject as
        software.amazon.awscdk.services.omics.CfnVariantStore
  }

  /**
   * The read set's genome reference ARN.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-referenceitem.html)
   */
  public interface ReferenceItemProperty {
    /**
     * The reference's ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-referenceitem.html#cfn-omics-variantstore-referenceitem-referencearn)
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
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty.Builder =
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty.builder()

      /**
       * @param referenceArn The reference's ARN. 
       */
      override fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty,
    ) : CdkObject(cdkObject),
        ReferenceItemProperty {
      /**
       * The reference's ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-referenceitem.html#cfn-omics-variantstore-referenceitem-referencearn)
       */
      override fun referenceArn(): String = unwrap(this).getReferenceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty):
          ReferenceItemProperty = CdkObjectWrappers.wrap(cdkObject) as? ReferenceItemProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceItemProperty):
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-sseconfig.html)
   */
  public interface SseConfigProperty {
    /**
     * An encryption key ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-sseconfig.html#cfn-omics-variantstore-sseconfig-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The encryption type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-sseconfig.html#cfn-omics-variantstore-sseconfig-type)
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
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty.Builder =
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty,
    ) : CdkObject(cdkObject),
        SseConfigProperty {
      /**
       * An encryption key ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-sseconfig.html#cfn-omics-variantstore-sseconfig-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * The encryption type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-sseconfig.html#cfn-omics-variantstore-sseconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty):
          SseConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SseConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigProperty):
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty
    }
  }
}
