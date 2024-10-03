@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a farm to allow space for queues and fleets.
 *
 * Farms are the space where the components of your renders gather and are pieced together in the
 * cloud. Farms contain budgets and allow you to enforce permissions. Deadline Cloud farms are a useful
 * container for large projects.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnFarm cfnFarm = CfnFarm.Builder.create(this, "MyCfnFarm")
 * .displayName("displayName")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyArn("kmsKeyArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html)
 */
public open class CfnFarm(
  cdkObject: software.amazon.awscdk.services.deadline.CfnFarm,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFarmProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnFarm(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFarmProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFarmProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFarmProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) assigned to the farm.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The farm ID.
   */
  public open fun attrFarmId(): String = unwrap(this).getAttrFarmId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the farm that helps identify what the farm is used for.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the farm that helps identify what the farm is used for.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the farm.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The display name of the farm.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
   * The ARN for the KMS key.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The ARN for the KMS key.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * The tags to add to your farm.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to add to your farm.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to add to your farm.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnFarm].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the farm that helps identify what the farm is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-description)
     * @param description A description of the farm that helps identify what the farm is used for. 
     */
    public fun description(description: String)

    /**
     * The display name of the farm.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-displayname)
     * @param displayName The display name of the farm. 
     */
    public fun displayName(displayName: String)

    /**
     * The ARN for the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-kmskeyarn)
     * @param kmsKeyArn The ARN for the KMS key. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * The tags to add to your farm.
     *
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-tags)
     * @param tags The tags to add to your farm. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to your farm.
     *
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-tags)
     * @param tags The tags to add to your farm. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnFarm.Builder =
        software.amazon.awscdk.services.deadline.CfnFarm.Builder.create(scope, id)

    /**
     * A description of the farm that helps identify what the farm is used for.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-description)
     * @param description A description of the farm that helps identify what the farm is used for. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the farm.
     *
     *
     * This field can store any content. Escape or encode this content before displaying it on a
     * webpage or any other system that might interpret the content of this field.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-displayname)
     * @param displayName The display name of the farm. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The ARN for the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-kmskeyarn)
     * @param kmsKeyArn The ARN for the KMS key. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The tags to add to your farm.
     *
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-tags)
     * @param tags The tags to add to your farm. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to add to your farm.
     *
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but
     * tag values can be empty strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-farm.html#cfn-deadline-farm-tags)
     * @param tags The tags to add to your farm. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.deadline.CfnFarm = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnFarm.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFarm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFarm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnFarm): CfnFarm =
        CfnFarm(cdkObject)

    internal fun unwrap(wrapped: CfnFarm): software.amazon.awscdk.services.deadline.CfnFarm =
        wrapped.cdkObject as software.amazon.awscdk.services.deadline.CfnFarm
  }
}
