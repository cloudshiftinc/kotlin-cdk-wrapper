package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFleet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnFleet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the created fleet.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the fleet was created in seconds since epoch (January 1, 1970 at midnight UTC time).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The time the fleet was last updated, in seconds since epoch (January 1, 1970 at midnight UTC
   * time).
   */
  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  /**
   * (Optional) A brief description of the fleet.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * (Optional) A brief description of the fleet.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The unique ID of the fleet.
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * The unique ID of the fleet.
   */
  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
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
   * The ARN of the signal catalog associated with the fleet.
   */
  public open fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

  /**
   * The ARN of the signal catalog associated with the fleet.
   */
  public open fun signalCatalogArn(`value`: String) {
    unwrap(this).setSignalCatalogArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * (Optional) Metadata that can be used to manage the fleet.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * (Optional) Metadata that can be used to manage the fleet.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * (Optional) Metadata that can be used to manage the fleet.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnFleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * (Optional) A brief description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-description)
     * @param description (Optional) A brief description of the fleet. 
     */
    public fun description(description: String)

    /**
     * The unique ID of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-id)
     * @param id The unique ID of the fleet. 
     */
    public fun id(id: String)

    /**
     * The ARN of the signal catalog associated with the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-signalcatalogarn)
     * @param signalCatalogArn The ARN of the signal catalog associated with the fleet. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * (Optional) Metadata that can be used to manage the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
     * @param tags (Optional) Metadata that can be used to manage the fleet. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * (Optional) Metadata that can be used to manage the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
     * @param tags (Optional) Metadata that can be used to manage the fleet. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnFleet.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnFleet.Builder.create(scope, id)

    /**
     * (Optional) A brief description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-description)
     * @param description (Optional) A brief description of the fleet. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique ID of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-id)
     * @param id The unique ID of the fleet. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * The ARN of the signal catalog associated with the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-signalcatalogarn)
     * @param signalCatalogArn The ARN of the signal catalog associated with the fleet. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * (Optional) Metadata that can be used to manage the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
     * @param tags (Optional) Metadata that can be used to manage the fleet. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * (Optional) Metadata that can be used to manage the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-fleet.html#cfn-iotfleetwise-fleet-tags)
     * @param tags (Optional) Metadata that can be used to manage the fleet. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnFleet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotfleetwise.CfnFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnFleet): CfnFleet =
        CfnFleet(cdkObject)

    internal fun unwrap(wrapped: CfnFleet): software.amazon.awscdk.services.iotfleetwise.CfnFleet =
        wrapped.cdkObject
  }
}
