@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::EventSchemas::Discoverer` resource to specify a *discoverer* that is associated
 * with an event bus.
 *
 * A discoverer allows the Amazon EventBridge Schema Registry to automatically generate schemas
 * based on events on an event bus.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eventschemas.*;
 * CfnDiscoverer cfnDiscoverer = CfnDiscoverer.Builder.create(this, "MyCfnDiscoverer")
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .crossAccount(false)
 * .description("description")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html)
 */
public open class CfnDiscoverer(
  cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscoverer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDiscovererProps,
  ) :
      this(software.amazon.awscdk.services.eventschemas.CfnDiscoverer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDiscovererProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDiscovererProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDiscovererProps(props)
  )

  /**
   *
   */
  public open fun attrCrossAccount(): IResolvable =
      unwrap(this).getAttrCrossAccount().let(IResolvable::wrap)

  /**
   * The ARN of the discoverer.
   */
  public open fun attrDiscovererArn(): String = unwrap(this).getAttrDiscovererArn()

  /**
   * The ID of the discoverer.
   */
  public open fun attrDiscovererId(): String = unwrap(this).getAttrDiscovererId()

  /**
   * The state of the discoverer.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Allows for the discovery of the event schemas that are sent to the event bus from another
   * account.
   */
  public open fun crossAccount(): Any? = unwrap(this).getCrossAccount()

  /**
   * Allows for the discovery of the event schemas that are sent to the event bus from another
   * account.
   */
  public open fun crossAccount(`value`: Boolean) {
    unwrap(this).setCrossAccount(`value`)
  }

  /**
   * Allows for the discovery of the event schemas that are sent to the event bus from another
   * account.
   */
  public open fun crossAccount(`value`: IResolvable) {
    unwrap(this).setCrossAccount(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A description for the discoverer.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the discoverer.
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
   * The ARN of the event bus.
   */
  public open fun sourceArn(): String = unwrap(this).getSourceArn()

  /**
   * The ARN of the event bus.
   */
  public open fun sourceArn(`value`: String) {
    unwrap(this).setSourceArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags associated with the resource.
   */
  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  /**
   * Tags associated with the resource.
   */
  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty.Companion::unwrap))
  }

  /**
   * Tags associated with the resource.
   */
  public open fun tagsRaw(vararg `value`: TagsEntryProperty): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eventschemas.CfnDiscoverer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Allows for the discovery of the event schemas that are sent to the event bus from another
     * account.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account. 
     */
    public fun crossAccount(crossAccount: Boolean)

    /**
     * Allows for the discovery of the event schemas that are sent to the event bus from another
     * account.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account. 
     */
    public fun crossAccount(crossAccount: IResolvable)

    /**
     * A description for the discoverer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-description)
     * @param description A description for the discoverer. 
     */
    public fun description(description: String)

    /**
     * The ARN of the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-sourcearn)
     * @param sourceArn The ARN of the event bus. 
     */
    public fun sourceArn(sourceArn: String)

    /**
     * Tags associated with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
     * @param tags Tags associated with the resource. 
     */
    public fun tags(tags: List<TagsEntryProperty>)

    /**
     * Tags associated with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
     * @param tags Tags associated with the resource. 
     */
    public fun tags(vararg tags: TagsEntryProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.Builder =
        software.amazon.awscdk.services.eventschemas.CfnDiscoverer.Builder.create(scope, id)

    /**
     * Allows for the discovery of the event schemas that are sent to the event bus from another
     * account.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account. 
     */
    override fun crossAccount(crossAccount: Boolean) {
      cdkBuilder.crossAccount(crossAccount)
    }

    /**
     * Allows for the discovery of the event schemas that are sent to the event bus from another
     * account.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
     * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
     * bus from another account. 
     */
    override fun crossAccount(crossAccount: IResolvable) {
      cdkBuilder.crossAccount(crossAccount.let(IResolvable.Companion::unwrap))
    }

    /**
     * A description for the discoverer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-description)
     * @param description A description for the discoverer. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ARN of the event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-sourcearn)
     * @param sourceArn The ARN of the event bus. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * Tags associated with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
     * @param tags Tags associated with the resource. 
     */
    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty.Companion::unwrap))
    }

    /**
     * Tags associated with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
     * @param tags Tags associated with the resource. 
     */
    override fun tags(vararg tags: TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnDiscoverer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eventschemas.CfnDiscoverer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDiscoverer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDiscoverer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscoverer):
        CfnDiscoverer = CfnDiscoverer(cdkObject)

    internal fun unwrap(wrapped: CfnDiscoverer):
        software.amazon.awscdk.services.eventschemas.CfnDiscoverer = wrapped.cdkObject as
        software.amazon.awscdk.services.eventschemas.CfnDiscoverer
  }

  /**
   * Tags to associate with the discoverer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eventschemas.*;
   * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-discoverer-tagsentry.html)
   */
  public interface TagsEntryProperty {
    /**
     * The key of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-discoverer-tagsentry.html#cfn-eventschemas-discoverer-tagsentry-key)
     */
    public fun key(): String

    /**
     * The value of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-discoverer-tagsentry.html#cfn-eventschemas-discoverer-tagsentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagsEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key of a key-value pair. 
       */
      public fun key(key: String)

      /**
       * @param value The value of a key-value pair. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty.builder()

      /**
       * @param key The key of a key-value pair. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of a key-value pair. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty,
    ) : CdkObject(cdkObject), TagsEntryProperty {
      /**
       * The key of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-discoverer-tagsentry.html#cfn-eventschemas-discoverer-tagsentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-discoverer-tagsentry.html#cfn-eventschemas-discoverer-tagsentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty):
          TagsEntryProperty = CdkObjectWrappers.wrap(cdkObject) as? TagsEntryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty
    }
  }
}
