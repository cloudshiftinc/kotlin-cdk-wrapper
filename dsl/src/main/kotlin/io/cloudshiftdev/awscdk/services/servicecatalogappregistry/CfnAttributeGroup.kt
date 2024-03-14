package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAttributeGroup internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon resource name (ARN) that specifies the attribute group across services.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The globally unique attribute group identifier of the attribute group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A nested object in a JSON or YAML template that supports arbitrary definitions.
   */
  public open fun attributes(): Any = unwrap(this).getAttributes()

  /**
   * A nested object in a JSON or YAML template that supports arbitrary definitions.
   */
  public open fun attributes(`value`: Any) {
    unwrap(this).setAttributes(`value`)
  }

  /**
   * The description of the attribute group that the user provides.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the attribute group that the user provides.
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
   * The name of the attribute group.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the attribute group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs you can use to associate with the attribute group.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * Key-value pairs you can use to associate with the attribute group.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.servicecatalogappregistry.CfnAttributeGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A nested object in a JSON or YAML template that supports arbitrary definitions.
     *
     * Represents the attributes in an attribute group that describes an application and its
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-attributes)
     * @param attributes A nested object in a JSON or YAML template that supports arbitrary
     * definitions. 
     */
    public fun attributes(attributes: Any)

    /**
     * The description of the attribute group that the user provides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-description)
     * @param description The description of the attribute group that the user provides. 
     */
    public fun description(description: String)

    /**
     * The name of the attribute group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-name)
     * @param name The name of the attribute group. 
     */
    public fun name(name: String)

    /**
     * Key-value pairs you can use to associate with the attribute group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-tags)
     * @param tags Key-value pairs you can use to associate with the attribute group. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup.Builder =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup.Builder.create(scope,
        id)

    /**
     * A nested object in a JSON or YAML template that supports arbitrary definitions.
     *
     * Represents the attributes in an attribute group that describes an application and its
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-attributes)
     * @param attributes A nested object in a JSON or YAML template that supports arbitrary
     * definitions. 
     */
    override fun attributes(attributes: Any) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * The description of the attribute group that the user provides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-description)
     * @param description The description of the attribute group that the user provides. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the attribute group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-name)
     * @param name The name of the attribute group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Key-value pairs you can use to associate with the attribute group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-tags)
     * @param tags Key-value pairs you can use to associate with the attribute group. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAttributeGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAttributeGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup):
        CfnAttributeGroup = CfnAttributeGroup(cdkObject)

    internal fun unwrap(wrapped: CfnAttributeGroup):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup =
        wrapped.cdkObject
  }
}
