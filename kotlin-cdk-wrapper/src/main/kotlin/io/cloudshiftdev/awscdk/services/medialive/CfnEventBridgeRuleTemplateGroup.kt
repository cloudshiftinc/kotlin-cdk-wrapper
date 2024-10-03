@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Definition of AWS::MediaLive::EventBridgeRuleTemplateGroup Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnEventBridgeRuleTemplateGroup cfnEventBridgeRuleTemplateGroup =
 * CfnEventBridgeRuleTemplateGroup.Builder.create(this, "MyCfnEventBridgeRuleTemplateGroup")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html)
 */
public open class CfnEventBridgeRuleTemplateGroup(
  cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBridgeRuleTemplateGroupProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventBridgeRuleTemplateGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventBridgeRuleTemplateGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventBridgeRuleTemplateGroupProps(props)
  )

  /**
   * An eventbridge rule template group's ARN (Amazon Resource Name).
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time of resource creation.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * An eventbridge rule template group's id.
   *
   * Amazon Web Services provided template groups have ids that start with ``aws-``.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   *
   */
  public open fun attrIdentifier(): String = unwrap(this).getAttrIdentifier()

  /**
   * The date and time of latest resource modification.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A resource's optional description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A resource's optional description.
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
   * A resource's name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A resource's name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Represents the tags associated with a resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-description)
     * @param description A resource's optional description. 
     */
    public fun description(description: String)

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-name)
     * @param name A resource's name. 
     */
    public fun name(name: String)

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup.Builder =
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup.Builder.create(scope,
        id)

    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-description)
     * @param description A resource's optional description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-name)
     * @param name A resource's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-tags)
     * @param tags Represents the tags associated with a resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventBridgeRuleTemplateGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventBridgeRuleTemplateGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup):
        CfnEventBridgeRuleTemplateGroup = CfnEventBridgeRuleTemplateGroup(cdkObject)

    internal fun unwrap(wrapped: CfnEventBridgeRuleTemplateGroup):
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup =
        wrapped.cdkObject as
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup
  }
}
