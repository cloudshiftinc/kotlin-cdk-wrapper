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
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a sequence store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.omics.*;
 * Object s3AccessPolicy;
 * CfnSequenceStore cfnSequenceStore = CfnSequenceStore.Builder.create(this, "MyCfnSequenceStore")
 * .name("name")
 * // the properties below are optional
 * .accessLogLocation("accessLogLocation")
 * .description("description")
 * .eTagAlgorithmFamily("eTagAlgorithmFamily")
 * .fallbackLocation("fallbackLocation")
 * .propagatedSetLevelTags(List.of("propagatedSetLevelTags"))
 * .s3AccessPolicy(s3AccessPolicy)
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html)
 */
public open class CfnSequenceStore(
  cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStore,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSequenceStoreProps,
  ) :
      this(software.amazon.awscdk.services.omics.CfnSequenceStore(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSequenceStoreProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSequenceStoreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSequenceStoreProps(props)
  )

  /**
   * Location of the access logs.
   */
  public open fun accessLogLocation(): String? = unwrap(this).getAccessLogLocation()

  /**
   * Location of the access logs.
   */
  public open fun accessLogLocation(`value`: String) {
    unwrap(this).setAccessLogLocation(`value`)
  }

  /**
   * The store's ARN.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When the store was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * This is ARN of the access point associated with the S3 bucket storing read sets.
   */
  public open fun attrS3AccessPointArn(): String = unwrap(this).getAttrS3AccessPointArn()

  /**
   * The S3 URI of the sequence store.
   */
  public open fun attrS3Uri(): String = unwrap(this).getAttrS3Uri()

  /**
   * The store's ID.
   */
  public open fun attrSequenceStoreId(): String = unwrap(this).getAttrSequenceStoreId()

  /**
   * Status of the sequence store.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The status message of the sequence store.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * The last-updated time of the Sequence Store.
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
   * The algorithm family of the ETag.
   */
  public open fun eTagAlgorithmFamily(): String? = unwrap(this).getETagAlgorithmFamily()

  /**
   * The algorithm family of the ETag.
   */
  public open fun eTagAlgorithmFamily(`value`: String) {
    unwrap(this).setETagAlgorithmFamily(`value`)
  }

  /**
   * An S3 location that is used to store files that have failed a direct upload.
   */
  public open fun fallbackLocation(): String? = unwrap(this).getFallbackLocation()

  /**
   * An S3 location that is used to store files that have failed a direct upload.
   */
  public open fun fallbackLocation(`value`: String) {
    unwrap(this).setFallbackLocation(`value`)
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
   * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
   */
  public open fun propagatedSetLevelTags(): List<String> = unwrap(this).getPropagatedSetLevelTags()
      ?: emptyList()

  /**
   * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
   */
  public open fun propagatedSetLevelTags(`value`: List<String>) {
    unwrap(this).setPropagatedSetLevelTags(`value`)
  }

  /**
   * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
   */
  public open fun propagatedSetLevelTags(vararg `value`: String): Unit =
      propagatedSetLevelTags(`value`.toList())

  /**
   * The resource policy that controls S3 access on the store.
   */
  public open fun s3AccessPolicy(): Any? = unwrap(this).getS3AccessPolicy()

  /**
   * The resource policy that controls S3 access on the store.
   */
  public open fun s3AccessPolicy(`value`: Any) {
    unwrap(this).setS3AccessPolicy(`value`)
  }

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
  @JvmName("2e3069760e93fdc1453ea8e86a8230dbdeb8b27e31adb510fa6b7986aa6b3002")
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.omics.CfnSequenceStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Location of the access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-accessloglocation)
     * @param accessLogLocation Location of the access logs. 
     */
    public fun accessLogLocation(accessLogLocation: String)

    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-description)
     * @param description A description for the store. 
     */
    public fun description(description: String)

    /**
     * The algorithm family of the ETag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-etagalgorithmfamily)
     * @param eTagAlgorithmFamily The algorithm family of the ETag. 
     */
    public fun eTagAlgorithmFamily(eTagAlgorithmFamily: String)

    /**
     * An S3 location that is used to store files that have failed a direct upload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-fallbacklocation)
     * @param fallbackLocation An S3 location that is used to store files that have failed a direct
     * upload. 
     */
    public fun fallbackLocation(fallbackLocation: String)

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-name)
     * @param name A name for the store. 
     */
    public fun name(name: String)

    /**
     * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-propagatedsetleveltags)
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store. 
     */
    public fun propagatedSetLevelTags(propagatedSetLevelTags: List<String>)

    /**
     * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-propagatedsetleveltags)
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store. 
     */
    public fun propagatedSetLevelTags(vararg propagatedSetLevelTags: String)

    /**
     * The resource policy that controls S3 access on the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-s3accesspolicy)
     * @param s3AccessPolicy The resource policy that controls S3 access on the store. 
     */
    public fun s3AccessPolicy(s3AccessPolicy: Any)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    public fun sseConfig(sseConfig: IResolvable)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    public fun sseConfig(sseConfig: SseConfigProperty)

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5054d3a312f35f864b6398f168248b335cf44ed2e39da07fcbc901f9f91d5d54")
    public fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit)

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-tags)
     * @param tags Tags for the store. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnSequenceStore.Builder =
        software.amazon.awscdk.services.omics.CfnSequenceStore.Builder.create(scope, id)

    /**
     * Location of the access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-accessloglocation)
     * @param accessLogLocation Location of the access logs. 
     */
    override fun accessLogLocation(accessLogLocation: String) {
      cdkBuilder.accessLogLocation(accessLogLocation)
    }

    /**
     * A description for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-description)
     * @param description A description for the store. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The algorithm family of the ETag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-etagalgorithmfamily)
     * @param eTagAlgorithmFamily The algorithm family of the ETag. 
     */
    override fun eTagAlgorithmFamily(eTagAlgorithmFamily: String) {
      cdkBuilder.eTagAlgorithmFamily(eTagAlgorithmFamily)
    }

    /**
     * An S3 location that is used to store files that have failed a direct upload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-fallbacklocation)
     * @param fallbackLocation An S3 location that is used to store files that have failed a direct
     * upload. 
     */
    override fun fallbackLocation(fallbackLocation: String) {
      cdkBuilder.fallbackLocation(fallbackLocation)
    }

    /**
     * A name for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-name)
     * @param name A name for the store. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-propagatedsetleveltags)
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store. 
     */
    override fun propagatedSetLevelTags(propagatedSetLevelTags: List<String>) {
      cdkBuilder.propagatedSetLevelTags(propagatedSetLevelTags)
    }

    /**
     * The tags keys to propagate to the S3 objects associated with read sets in the sequence store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-propagatedsetleveltags)
     * @param propagatedSetLevelTags The tags keys to propagate to the S3 objects associated with
     * read sets in the sequence store. 
     */
    override fun propagatedSetLevelTags(vararg propagatedSetLevelTags: String): Unit =
        propagatedSetLevelTags(propagatedSetLevelTags.toList())

    /**
     * The resource policy that controls S3 access on the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-s3accesspolicy)
     * @param s3AccessPolicy The resource policy that controls S3 access on the store. 
     */
    override fun s3AccessPolicy(s3AccessPolicy: Any) {
      cdkBuilder.s3AccessPolicy(s3AccessPolicy)
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    override fun sseConfig(sseConfig: SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(SseConfigProperty.Companion::unwrap))
    }

    /**
     * Server-side encryption (SSE) settings for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-sseconfig)
     * @param sseConfig Server-side encryption (SSE) settings for the store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5054d3a312f35f864b6398f168248b335cf44ed2e39da07fcbc901f9f91d5d54")
    override fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(SseConfigProperty(sseConfig))

    /**
     * Tags for the store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html#cfn-omics-sequencestore-tags)
     * @param tags Tags for the store. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnSequenceStore = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnSequenceStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSequenceStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSequenceStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStore):
        CfnSequenceStore = CfnSequenceStore(cdkObject)

    internal fun unwrap(wrapped: CfnSequenceStore):
        software.amazon.awscdk.services.omics.CfnSequenceStore = wrapped.cdkObject as
        software.amazon.awscdk.services.omics.CfnSequenceStore
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-sequencestore-sseconfig.html)
   */
  public interface SseConfigProperty {
    /**
     * An encryption key ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-sequencestore-sseconfig.html#cfn-omics-sequencestore-sseconfig-keyarn)
     */
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    /**
     * The encryption type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-sequencestore-sseconfig.html#cfn-omics-sequencestore-sseconfig-type)
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
          software.amazon.awscdk.services.omics.CfnSequenceStore.SseConfigProperty.Builder =
          software.amazon.awscdk.services.omics.CfnSequenceStore.SseConfigProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.omics.CfnSequenceStore.SseConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStore.SseConfigProperty,
    ) : CdkObject(cdkObject),
        SseConfigProperty {
      /**
       * An encryption key ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-sequencestore-sseconfig.html#cfn-omics-sequencestore-sseconfig-keyarn)
       */
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      /**
       * The encryption type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-sequencestore-sseconfig.html#cfn-omics-sequencestore-sseconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStore.SseConfigProperty):
          SseConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SseConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigProperty):
          software.amazon.awscdk.services.omics.CfnSequenceStore.SseConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnSequenceStore.SseConfigProperty
    }
  }
}
