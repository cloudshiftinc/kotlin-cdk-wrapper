@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a publishing destination where you can export your GuardDuty findings.
 *
 * Before you start exporting the findings, the destination resource must exist.
 *
 * For more information about considerations and permissions, see [Exporting GuardDuty findings to
 * Amazon S3 buckets](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_exportfindings.html) in
 * the *Amazon GuardDuty User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnPublishingDestination cfnPublishingDestination = CfnPublishingDestination.Builder.create(this,
 * "MyCfnPublishingDestination")
 * .destinationProperties(CFNDestinationPropertiesProperty.builder()
 * .destinationArn("destinationArn")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .destinationType("destinationType")
 * .detectorId("detectorId")
 * // the properties below are optional
 * .tags(List.of(TagItemProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html)
 */
public open class CfnPublishingDestination(
  cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestination,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPublishingDestinationProps,
  ) :
      this(software.amazon.awscdk.services.guardduty.CfnPublishingDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPublishingDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPublishingDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPublishingDestinationProps(props)
  )

  /**
   * The ID of the publishing destination.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The time, in epoch millisecond format, at which GuardDuty was first unable to publish findings
   * to the destination.
   */
  public open fun attrPublishingFailureStartTimestamp(): String =
      unwrap(this).getAttrPublishingFailureStartTimestamp()

  /**
   * The status of the publishing destination.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
   * and the ARN of the KMS key to use to encrypt published findings.
   */
  public open fun destinationProperties(): Any = unwrap(this).getDestinationProperties()

  /**
   * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
   * and the ARN of the KMS key to use to encrypt published findings.
   */
  public open fun destinationProperties(`value`: IResolvable) {
    unwrap(this).setDestinationProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
   * and the ARN of the KMS key to use to encrypt published findings.
   */
  public open fun destinationProperties(`value`: CFNDestinationPropertiesProperty) {
    unwrap(this).setDestinationProperties(`value`.let(CFNDestinationPropertiesProperty.Companion::unwrap))
  }

  /**
   * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
   * and the ARN of the KMS key to use to encrypt published findings.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7fd2894d1a2788cc089b93eba2dfd0d2366af35b3a7aaab22266a7a51b188884")
  public open
      fun destinationProperties(`value`: CFNDestinationPropertiesProperty.Builder.() -> Unit): Unit
      = destinationProperties(CFNDestinationPropertiesProperty(`value`))

  /**
   * The type of publishing destination.
   */
  public open fun destinationType(): String = unwrap(this).getDestinationType()

  /**
   * The type of publishing destination.
   */
  public open fun destinationType(`value`: String) {
    unwrap(this).setDestinationType(`value`)
  }

  /**
   * The ID of the GuardDuty detector where the publishing destination exists.
   */
  public open fun detectorId(): String = unwrap(this).getDetectorId()

  /**
   * The ID of the GuardDuty detector where the publishing destination exists.
   */
  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
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
   * Describes a tag.
   */
  public open fun tags(): List<TagItemProperty> = unwrap(this).getTags()?.map(TagItemProperty::wrap)
      ?: emptyList()

  /**
   * Describes a tag.
   */
  public open fun tags(`value`: List<TagItemProperty>) {
    unwrap(this).setTags(`value`.map(TagItemProperty.Companion::unwrap))
  }

  /**
   * Describes a tag.
   */
  public open fun tags(vararg `value`: TagItemProperty): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.guardduty.CfnPublishingDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
     * and the ARN of the KMS key to use to encrypt published findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    public fun destinationProperties(destinationProperties: IResolvable)

    /**
     * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
     * and the ARN of the KMS key to use to encrypt published findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    public fun destinationProperties(destinationProperties: CFNDestinationPropertiesProperty)

    /**
     * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
     * and the ARN of the KMS key to use to encrypt published findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b508e65d2b8bf435d0f8dc5aa3d99b5cbbb9a41e186fc211041378256aced306")
    public
        fun destinationProperties(destinationProperties: CFNDestinationPropertiesProperty.Builder.() -> Unit)

    /**
     * The type of publishing destination.
     *
     * GuardDuty supports Amazon S3 buckets as a publishing destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationtype)
     * @param destinationType The type of publishing destination. 
     */
    public fun destinationType(destinationType: String)

    /**
     * The ID of the GuardDuty detector where the publishing destination exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-detectorid)
     * @param detectorId The ID of the GuardDuty detector where the publishing destination exists. 
     */
    public fun detectorId(detectorId: String)

    /**
     * Describes a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-tags)
     * @param tags Describes a tag. 
     */
    public fun tags(tags: List<TagItemProperty>)

    /**
     * Describes a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-tags)
     * @param tags Describes a tag. 
     */
    public fun tags(vararg tags: TagItemProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.guardduty.CfnPublishingDestination.Builder =
        software.amazon.awscdk.services.guardduty.CfnPublishingDestination.Builder.create(scope, id)

    /**
     * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
     * and the ARN of the KMS key to use to encrypt published findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    override fun destinationProperties(destinationProperties: IResolvable) {
      cdkBuilder.destinationProperties(destinationProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
     * and the ARN of the KMS key to use to encrypt published findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    override fun destinationProperties(destinationProperties: CFNDestinationPropertiesProperty) {
      cdkBuilder.destinationProperties(destinationProperties.let(CFNDestinationPropertiesProperty.Companion::unwrap))
    }

    /**
     * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
     * and the ARN of the KMS key to use to encrypt published findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b508e65d2b8bf435d0f8dc5aa3d99b5cbbb9a41e186fc211041378256aced306")
    override
        fun destinationProperties(destinationProperties: CFNDestinationPropertiesProperty.Builder.() -> Unit):
        Unit = destinationProperties(CFNDestinationPropertiesProperty(destinationProperties))

    /**
     * The type of publishing destination.
     *
     * GuardDuty supports Amazon S3 buckets as a publishing destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationtype)
     * @param destinationType The type of publishing destination. 
     */
    override fun destinationType(destinationType: String) {
      cdkBuilder.destinationType(destinationType)
    }

    /**
     * The ID of the GuardDuty detector where the publishing destination exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-detectorid)
     * @param detectorId The ID of the GuardDuty detector where the publishing destination exists. 
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * Describes a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-tags)
     * @param tags Describes a tag. 
     */
    override fun tags(tags: List<TagItemProperty>) {
      cdkBuilder.tags(tags.map(TagItemProperty.Companion::unwrap))
    }

    /**
     * Describes a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-tags)
     * @param tags Describes a tag. 
     */
    override fun tags(vararg tags: TagItemProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnPublishingDestination =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublishingDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublishingDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestination):
        CfnPublishingDestination = CfnPublishingDestination(cdkObject)

    internal fun unwrap(wrapped: CfnPublishingDestination):
        software.amazon.awscdk.services.guardduty.CfnPublishingDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.guardduty.CfnPublishingDestination
  }

  /**
   * Contains the Amazon Resource Name (ARN) of the resource that receives the published findings,
   * such as an S3 bucket, and the ARN of the KMS key that is used to encrypt these published findings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNDestinationPropertiesProperty cFNDestinationPropertiesProperty =
   * CFNDestinationPropertiesProperty.builder()
   * .destinationArn("destinationArn")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-cfndestinationproperties.html)
   */
  public interface CFNDestinationPropertiesProperty {
    /**
     * The ARN of the resource where the findings are published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-cfndestinationproperties.html#cfn-guardduty-publishingdestination-cfndestinationproperties-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * The ARN of the KMS key to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-cfndestinationproperties.html#cfn-guardduty-publishingdestination-cfndestinationproperties-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * A builder for [CFNDestinationPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationArn The ARN of the resource where the findings are published.
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param kmsKeyArn The ARN of the KMS key to use for encryption.
       */
      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFNDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFNDestinationPropertiesProperty.builder()

      /**
       * @param destinationArn The ARN of the resource where the findings are published.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param kmsKeyArn The ARN of the KMS key to use for encryption.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFNDestinationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFNDestinationPropertiesProperty,
    ) : CdkObject(cdkObject),
        CFNDestinationPropertiesProperty {
      /**
       * The ARN of the resource where the findings are published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-cfndestinationproperties.html#cfn-guardduty-publishingdestination-cfndestinationproperties-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * The ARN of the KMS key to use for encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-cfndestinationproperties.html#cfn-guardduty-publishingdestination-cfndestinationproperties-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CFNDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFNDestinationPropertiesProperty):
          CFNDestinationPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNDestinationPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNDestinationPropertiesProperty):
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFNDestinationPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.CFNDestinationPropertiesProperty
    }
  }

  /**
   * Describes a tag.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * TagItemProperty tagItemProperty = TagItemProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-tagitem.html)
   */
  public interface TagItemProperty {
    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-tagitem.html#cfn-guardduty-publishingdestination-tagitem-key)
     */
    public fun key(): String

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-tagitem.html#cfn-guardduty-publishingdestination-tagitem-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag key. 
       */
      public fun key(key: String)

      /**
       * @param value The tag value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.TagItemProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.TagItemProperty.builder()

      /**
       * @param key The tag key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The tag value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.TagItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestination.TagItemProperty,
    ) : CdkObject(cdkObject),
        TagItemProperty {
      /**
       * The tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-tagitem.html#cfn-guardduty-publishingdestination-tagitem-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The tag value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-publishingdestination-tagitem.html#cfn-guardduty-publishingdestination-tagitem-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestination.TagItemProperty):
          TagItemProperty = CdkObjectWrappers.wrap(cdkObject) as? TagItemProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagItemProperty):
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.TagItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnPublishingDestination.TagItemProperty
    }
  }
}
