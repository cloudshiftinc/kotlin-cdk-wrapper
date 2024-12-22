@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This structure contains information about one *delivery* in your account.
 *
 * A delivery is a connection between a logical *delivery source* and a logical *delivery
 * destination* .
 *
 * For more information, see
 * [CreateDelivery](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html)
 * .
 *
 * To update an existing delivery configuration, use
 * [UpdateDeliveryConfiguration](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateDeliveryConfiguration.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnDelivery cfnDelivery = CfnDelivery.Builder.create(this, "MyCfnDelivery")
 * .deliveryDestinationArn("deliveryDestinationArn")
 * .deliverySourceName("deliverySourceName")
 * // the properties below are optional
 * .fieldDelimiter("fieldDelimiter")
 * .recordFields(List.of("recordFields"))
 * .s3EnableHiveCompatiblePath(false)
 * .s3SuffixPath("s3SuffixPath")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html)
 */
public open class CfnDelivery(
  cdkObject: software.amazon.awscdk.services.logs.CfnDelivery,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryProps,
  ) :
      this(software.amazon.awscdk.services.logs.CfnDelivery(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeliveryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeliveryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeliveryProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) that uniquely identifies this delivery.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Displays whether the delivery destination associated with this delivery is CloudWatch Logs,
   * Amazon S3, or Firehose.
   */
  public open fun attrDeliveryDestinationType(): String =
      unwrap(this).getAttrDeliveryDestinationType()

  /**
   * The unique ID that identifies this delivery in your account.
   */
  public open fun attrDeliveryId(): String = unwrap(this).getAttrDeliveryId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ARN of the delivery destination that is associated with this delivery.
   */
  public open fun deliveryDestinationArn(): String = unwrap(this).getDeliveryDestinationArn()

  /**
   * The ARN of the delivery destination that is associated with this delivery.
   */
  public open fun deliveryDestinationArn(`value`: String) {
    unwrap(this).setDeliveryDestinationArn(`value`)
  }

  /**
   * The name of the delivery source that is associated with this delivery.
   */
  public open fun deliverySourceName(): String = unwrap(this).getDeliverySourceName()

  /**
   * The name of the delivery source that is associated with this delivery.
   */
  public open fun deliverySourceName(`value`: String) {
    unwrap(this).setDeliverySourceName(`value`)
  }

  /**
   * The field delimiter that is used between record fields when the final output format of a
   * delivery is in `Plain` , `W3C` , or `Raw` format.
   */
  public open fun fieldDelimiter(): String? = unwrap(this).getFieldDelimiter()

  /**
   * The field delimiter that is used between record fields when the final output format of a
   * delivery is in `Plain` , `W3C` , or `Raw` format.
   */
  public open fun fieldDelimiter(`value`: String) {
    unwrap(this).setFieldDelimiter(`value`)
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
   * The record fields used in this delivery.
   */
  public open fun recordFields(): List<String> = unwrap(this).getRecordFields() ?: emptyList()

  /**
   * The record fields used in this delivery.
   */
  public open fun recordFields(`value`: List<String>) {
    unwrap(this).setRecordFields(`value`)
  }

  /**
   * The record fields used in this delivery.
   */
  public open fun recordFields(vararg `value`: String): Unit = recordFields(`value`.toList())

  /**
   * This parameter causes the S3 objects that contain delivered logs to use a prefix structure that
   * allows for integration with Apache Hive.
   */
  public open fun s3EnableHiveCompatiblePath(): Any? = unwrap(this).getS3EnableHiveCompatiblePath()

  /**
   * This parameter causes the S3 objects that contain delivered logs to use a prefix structure that
   * allows for integration with Apache Hive.
   */
  public open fun s3EnableHiveCompatiblePath(`value`: Boolean) {
    unwrap(this).setS3EnableHiveCompatiblePath(`value`)
  }

  /**
   * This parameter causes the S3 objects that contain delivered logs to use a prefix structure that
   * allows for integration with Apache Hive.
   */
  public open fun s3EnableHiveCompatiblePath(`value`: IResolvable) {
    unwrap(this).setS3EnableHiveCompatiblePath(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This string allows re-configuring the S3 object prefix to contain either static or variable
   * sections.
   */
  public open fun s3SuffixPath(): String? = unwrap(this).getS3SuffixPath()

  /**
   * This string allows re-configuring the S3 object prefix to contain either static or variable
   * sections.
   */
  public open fun s3SuffixPath(`value`: String) {
    unwrap(this).setS3SuffixPath(`value`)
  }

  /**
   * The tags that have been assigned to this delivery.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags that have been assigned to this delivery.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags that have been assigned to this delivery.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnDelivery].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the delivery destination that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverydestinationarn)
     * @param deliveryDestinationArn The ARN of the delivery destination that is associated with
     * this delivery. 
     */
    public fun deliveryDestinationArn(deliveryDestinationArn: String)

    /**
     * The name of the delivery source that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverysourcename)
     * @param deliverySourceName The name of the delivery source that is associated with this
     * delivery. 
     */
    public fun deliverySourceName(deliverySourceName: String)

    /**
     * The field delimiter that is used between record fields when the final output format of a
     * delivery is in `Plain` , `W3C` , or `Raw` format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-fielddelimiter)
     * @param fieldDelimiter The field delimiter that is used between record fields when the final
     * output format of a delivery is in `Plain` , `W3C` , or `Raw` format. 
     */
    public fun fieldDelimiter(fieldDelimiter: String)

    /**
     * The record fields used in this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-recordfields)
     * @param recordFields The record fields used in this delivery. 
     */
    public fun recordFields(recordFields: List<String>)

    /**
     * The record fields used in this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-recordfields)
     * @param recordFields The record fields used in this delivery. 
     */
    public fun recordFields(vararg recordFields: String)

    /**
     * This parameter causes the S3 objects that contain delivered logs to use a prefix structure
     * that allows for integration with Apache Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3enablehivecompatiblepath)
     * @param s3EnableHiveCompatiblePath This parameter causes the S3 objects that contain delivered
     * logs to use a prefix structure that allows for integration with Apache Hive. 
     */
    public fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: Boolean)

    /**
     * This parameter causes the S3 objects that contain delivered logs to use a prefix structure
     * that allows for integration with Apache Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3enablehivecompatiblepath)
     * @param s3EnableHiveCompatiblePath This parameter causes the S3 objects that contain delivered
     * logs to use a prefix structure that allows for integration with Apache Hive. 
     */
    public fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: IResolvable)

    /**
     * This string allows re-configuring the S3 object prefix to contain either static or variable
     * sections.
     *
     * The valid variables to use in the suffix path will vary by each log source. See
     * ConfigurationTemplate$allowedSuffixPathFields for more info on what values are supported in the
     * suffix path for each log source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3suffixpath)
     * @param s3SuffixPath This string allows re-configuring the S3 object prefix to contain either
     * static or variable sections. 
     */
    public fun s3SuffixPath(s3SuffixPath: String)

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDelivery.Builder =
        software.amazon.awscdk.services.logs.CfnDelivery.Builder.create(scope, id)

    /**
     * The ARN of the delivery destination that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverydestinationarn)
     * @param deliveryDestinationArn The ARN of the delivery destination that is associated with
     * this delivery. 
     */
    override fun deliveryDestinationArn(deliveryDestinationArn: String) {
      cdkBuilder.deliveryDestinationArn(deliveryDestinationArn)
    }

    /**
     * The name of the delivery source that is associated with this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-deliverysourcename)
     * @param deliverySourceName The name of the delivery source that is associated with this
     * delivery. 
     */
    override fun deliverySourceName(deliverySourceName: String) {
      cdkBuilder.deliverySourceName(deliverySourceName)
    }

    /**
     * The field delimiter that is used between record fields when the final output format of a
     * delivery is in `Plain` , `W3C` , or `Raw` format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-fielddelimiter)
     * @param fieldDelimiter The field delimiter that is used between record fields when the final
     * output format of a delivery is in `Plain` , `W3C` , or `Raw` format. 
     */
    override fun fieldDelimiter(fieldDelimiter: String) {
      cdkBuilder.fieldDelimiter(fieldDelimiter)
    }

    /**
     * The record fields used in this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-recordfields)
     * @param recordFields The record fields used in this delivery. 
     */
    override fun recordFields(recordFields: List<String>) {
      cdkBuilder.recordFields(recordFields)
    }

    /**
     * The record fields used in this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-recordfields)
     * @param recordFields The record fields used in this delivery. 
     */
    override fun recordFields(vararg recordFields: String): Unit =
        recordFields(recordFields.toList())

    /**
     * This parameter causes the S3 objects that contain delivered logs to use a prefix structure
     * that allows for integration with Apache Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3enablehivecompatiblepath)
     * @param s3EnableHiveCompatiblePath This parameter causes the S3 objects that contain delivered
     * logs to use a prefix structure that allows for integration with Apache Hive. 
     */
    override fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: Boolean) {
      cdkBuilder.s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath)
    }

    /**
     * This parameter causes the S3 objects that contain delivered logs to use a prefix structure
     * that allows for integration with Apache Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3enablehivecompatiblepath)
     * @param s3EnableHiveCompatiblePath This parameter causes the S3 objects that contain delivered
     * logs to use a prefix structure that allows for integration with Apache Hive. 
     */
    override fun s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath: IResolvable) {
      cdkBuilder.s3EnableHiveCompatiblePath(s3EnableHiveCompatiblePath.let(IResolvable.Companion::unwrap))
    }

    /**
     * This string allows re-configuring the S3 object prefix to contain either static or variable
     * sections.
     *
     * The valid variables to use in the suffix path will vary by each log source. See
     * ConfigurationTemplate$allowedSuffixPathFields for more info on what values are supported in the
     * suffix path for each log source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-s3suffixpath)
     * @param s3SuffixPath This string allows re-configuring the S3 object prefix to contain either
     * static or variable sections. 
     */
    override fun s3SuffixPath(s3SuffixPath: String) {
      cdkBuilder.s3SuffixPath(s3SuffixPath)
    }

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags that have been assigned to this delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html#cfn-logs-delivery-tags)
     * @param tags The tags that have been assigned to this delivery. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnDelivery = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.logs.CfnDelivery.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDelivery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDelivery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDelivery): CfnDelivery =
        CfnDelivery(cdkObject)

    internal fun unwrap(wrapped: CfnDelivery): software.amazon.awscdk.services.logs.CfnDelivery =
        wrapped.cdkObject as software.amazon.awscdk.services.logs.CfnDelivery
  }
}
