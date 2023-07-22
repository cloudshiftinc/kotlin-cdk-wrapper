@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup
import software.constructs.Construct

/**
 * Creates a new attribute group as a container for user-defined attributes.
 *
 * This feature enables users to have full control over their cloud application's metadata in a rich
 * machine-readable format to facilitate integration with automated workflows and third-party tools.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalogappregistry.*;
 * Object attributes;
 * CfnAttributeGroup cfnAttributeGroup = CfnAttributeGroup.Builder.create(this,
 * "MyCfnAttributeGroup")
 * .attributes(attributes)
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html)
 */
@CdkDslMarker
public class CfnAttributeGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAttributeGroup.Builder = CfnAttributeGroup.Builder.create(scope, id)

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
  public fun attributes(attributes: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(attributes)
    cdkBuilder.attributes(builder.map)
  }

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
  public fun attributes(attributes: Any) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * The description of the attribute group that the user provides.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-description)
   * @param description The description of the attribute group that the user provides. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the attribute group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-name)
   * @param name The name of the attribute group. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Key-value pairs you can use to associate with the attribute group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-attributegroup.html#cfn-servicecatalogappregistry-attributegroup-tags)
   * @param tags Key-value pairs you can use to associate with the attribute group. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnAttributeGroup = cdkBuilder.build()
}
