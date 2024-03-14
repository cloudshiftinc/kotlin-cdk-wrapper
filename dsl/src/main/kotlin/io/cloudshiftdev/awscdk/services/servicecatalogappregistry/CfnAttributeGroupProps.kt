package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnAttributeGroupProps {
  /**
   * A nested object in a JSON or YAML template that supports arbitrary definitions.
   *
   * Represents the attributes in an attribute group that describes an application and its
   * components.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-attributes)
   */
  public fun attributes(): Any

  /**
   * The description of the attribute group that the user provides.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the attribute group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-name)
   */
  public fun name(): String

  /**
   * Key-value pairs you can use to associate with the attribute group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnAttributeGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributes A nested object in a JSON or YAML template that supports arbitrary
     * definitions. 
     * Represents the attributes in an attribute group that describes an application and its
     * components.
     */
    public fun attributes(attributes: Any)

    /**
     * @param description The description of the attribute group that the user provides.
     */
    public fun description(description: String)

    /**
     * @param name The name of the attribute group. 
     */
    public fun name(name: String)

    /**
     * @param tags Key-value pairs you can use to associate with the attribute group.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps.Builder =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps.builder()

    /**
     * @param attributes A nested object in a JSON or YAML template that supports arbitrary
     * definitions. 
     * Represents the attributes in an attribute group that describes an application and its
     * components.
     */
    override fun attributes(attributes: Any) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param description The description of the attribute group that the user provides.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the attribute group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Key-value pairs you can use to associate with the attribute group.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps,
  ) : CdkObject(cdkObject), CfnAttributeGroupProps {
    /**
     * A nested object in a JSON or YAML template that supports arbitrary definitions.
     *
     * Represents the attributes in an attribute group that describes an application and its
     * components.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-attributes)
     */
    override fun attributes(): Any = unwrap(this).getAttributes()

    /**
     * The description of the attribute group that the user provides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the attribute group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Key-value pairs you can use to associate with the attribute group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAttributeGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps):
        CfnAttributeGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAttributeGroupProps):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps
  }
}
