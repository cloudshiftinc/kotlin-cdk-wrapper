package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReferenceStore internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.omics.CfnReferenceStore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The store's ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When the store was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The store's ID.
   */
  public open fun attrReferenceStoreId(): String = unwrap(this).getAttrReferenceStoreId()

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
   * Server-side encryption (SSE) settings for the store.
   */
  public open fun sseConfig(): Any? = unwrap(this).getSseConfig()

  /**
   * Server-side encryption (SSE) settings for the store.
   */
  public open fun sseConfig(`value`: IResolvable) {
    unwrap(this).setSseConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   */
  public open fun sseConfig(`value`: SseConfigProperty) {
    unwrap(this).setSseConfig(`value`.let(SseConfigProperty::unwrap))
  }

  /**
   * Server-side encryption (SSE) settings for the store.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("741f3b3a0279161d1b557cfcbbfccf7b1c8e19fefd52928b12a9aa3bd1efb7b6")
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.omics.CfnReferenceStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-description)
     * @param description A description for the store. 
     */
    public fun description(description: String)

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-name)
     * @param name A name for the store. 
     */
    public fun name(name: String)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    public fun sseConfig(sseConfig: SseConfigProperty)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e6cb074959c824aab16ee53e3e8044999811fadf8351acad653171cbac47f11")
    public fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit)

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-tags)
     * @param tags Tags for the store. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnReferenceStore.Builder =
        software.amazon.awscdk.services.omics.CfnReferenceStore.Builder.create(scope, id)

    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-description)
     * @param description A description for the store. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-name)
     * @param name A name for the store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    override fun sseConfig(sseConfig: SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(SseConfigProperty::unwrap))
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e6cb074959c824aab16ee53e3e8044999811fadf8351acad653171cbac47f11")
    override fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(SseConfigProperty(sseConfig))

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html#cfn-omics-referencestore-tags)
     * @param tags Tags for the store. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnReferenceStore = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnReferenceStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReferenceStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReferenceStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnReferenceStore):
        CfnReferenceStore = CfnReferenceStore(cdkObject)

    internal fun unwrap(wrapped: CfnReferenceStore):
        software.amazon.awscdk.services.omics.CfnReferenceStore = wrapped.cdkObject
  }

  public interface SseConfigProperty {
    /**
     * An encryption key ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-referencestore-sseconfig.html#cfn-omics-referencestore-sseconfig-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The encryption type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-referencestore-sseconfig.html#cfn-omics-referencestore-sseconfig-type)
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
          software.amazon.awscdk.services.omics.CfnReferenceStore.SseConfigProperty.Builder =
          software.amazon.awscdk.services.omics.CfnReferenceStore.SseConfigProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.omics.CfnReferenceStore.SseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnReferenceStore.SseConfigProperty,
    ) : CdkObject(cdkObject), SseConfigProperty {
      /**
       * An encryption key ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-referencestore-sseconfig.html#cfn-omics-referencestore-sseconfig-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * The encryption type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-referencestore-sseconfig.html#cfn-omics-referencestore-sseconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnReferenceStore.SseConfigProperty):
          SseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigProperty):
          software.amazon.awscdk.services.omics.CfnReferenceStore.SseConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnReferenceStore.SseConfigProperty
    }
  }
}
