@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPublishingDestination`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnPublishingDestinationProps cfnPublishingDestinationProps =
 * CfnPublishingDestinationProps.builder()
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
public interface CfnPublishingDestinationProps {
  /**
   * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
   * and the ARN of the KMS key to use to encrypt published findings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
   */
  public fun destinationProperties(): Any

  /**
   * The type of publishing destination.
   *
   * GuardDuty supports Amazon S3 buckets as a publishing destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationtype)
   */
  public fun destinationType(): String

  /**
   * The ID of the GuardDuty detector where the publishing destination exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-detectorid)
   */
  public fun detectorId(): String

  /**
   * Describes a tag.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-tags)
   */
  public fun tags(): List<CfnPublishingDestination.TagItemProperty> =
      unwrap(this).getTags()?.map(CfnPublishingDestination.TagItemProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnPublishingDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    public fun destinationProperties(destinationProperties: IResolvable)

    /**
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    public
        fun destinationProperties(destinationProperties: CfnPublishingDestination.CFNDestinationPropertiesProperty)

    /**
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50bfca73a10a199e24afbf4e1a01f602c50db1438b9e9084dac04e3001e9c4bc")
    public
        fun destinationProperties(destinationProperties: CfnPublishingDestination.CFNDestinationPropertiesProperty.Builder.() -> Unit)

    /**
     * @param destinationType The type of publishing destination. 
     * GuardDuty supports Amazon S3 buckets as a publishing destination.
     */
    public fun destinationType(destinationType: String)

    /**
     * @param detectorId The ID of the GuardDuty detector where the publishing destination exists. 
     */
    public fun detectorId(detectorId: String)

    /**
     * @param tags Describes a tag.
     */
    public fun tags(tags: List<CfnPublishingDestination.TagItemProperty>)

    /**
     * @param tags Describes a tag.
     */
    public fun tags(vararg tags: CfnPublishingDestination.TagItemProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps.builder()

    /**
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    override fun destinationProperties(destinationProperties: IResolvable) {
      cdkBuilder.destinationProperties(destinationProperties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    override
        fun destinationProperties(destinationProperties: CfnPublishingDestination.CFNDestinationPropertiesProperty) {
      cdkBuilder.destinationProperties(destinationProperties.let(CfnPublishingDestination.CFNDestinationPropertiesProperty.Companion::unwrap))
    }

    /**
     * @param destinationProperties Contains the Amazon Resource Name (ARN) of the resource to
     * publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published
     * findings. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50bfca73a10a199e24afbf4e1a01f602c50db1438b9e9084dac04e3001e9c4bc")
    override
        fun destinationProperties(destinationProperties: CfnPublishingDestination.CFNDestinationPropertiesProperty.Builder.() -> Unit):
        Unit =
        destinationProperties(CfnPublishingDestination.CFNDestinationPropertiesProperty(destinationProperties))

    /**
     * @param destinationType The type of publishing destination. 
     * GuardDuty supports Amazon S3 buckets as a publishing destination.
     */
    override fun destinationType(destinationType: String) {
      cdkBuilder.destinationType(destinationType)
    }

    /**
     * @param detectorId The ID of the GuardDuty detector where the publishing destination exists. 
     */
    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    /**
     * @param tags Describes a tag.
     */
    override fun tags(tags: List<CfnPublishingDestination.TagItemProperty>) {
      cdkBuilder.tags(tags.map(CfnPublishingDestination.TagItemProperty.Companion::unwrap))
    }

    /**
     * @param tags Describes a tag.
     */
    override fun tags(vararg tags: CfnPublishingDestination.TagItemProperty): Unit =
        tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps,
  ) : CdkObject(cdkObject),
      CfnPublishingDestinationProps {
    /**
     * Contains the Amazon Resource Name (ARN) of the resource to publish to, such as an S3 bucket,
     * and the ARN of the KMS key to use to encrypt published findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationproperties)
     */
    override fun destinationProperties(): Any = unwrap(this).getDestinationProperties()

    /**
     * The type of publishing destination.
     *
     * GuardDuty supports Amazon S3 buckets as a publishing destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-destinationtype)
     */
    override fun destinationType(): String = unwrap(this).getDestinationType()

    /**
     * The ID of the GuardDuty detector where the publishing destination exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-detectorid)
     */
    override fun detectorId(): String = unwrap(this).getDetectorId()

    /**
     * Describes a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-publishingdestination.html#cfn-guardduty-publishingdestination-tags)
     */
    override fun tags(): List<CfnPublishingDestination.TagItemProperty> =
        unwrap(this).getTags()?.map(CfnPublishingDestination.TagItemProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublishingDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps):
        CfnPublishingDestinationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnPublishingDestinationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublishingDestinationProps):
        software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.guardduty.CfnPublishingDestinationProps
  }
}
