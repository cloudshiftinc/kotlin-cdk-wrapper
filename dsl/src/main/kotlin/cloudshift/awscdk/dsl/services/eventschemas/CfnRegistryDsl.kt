@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eventschemas.CfnRegistry
import software.constructs.Construct

/**
 * Use the `AWS::EventSchemas::Registry` to specify a schema registry.
 *
 * Schema registries are containers for Schemas. Registries collect and organize schemas so that
 * your schemas are in logical groups.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * CfnRegistry cfnRegistry = CfnRegistry.Builder.create(this, "MyCfnRegistry")
 * .description("description")
 * .registryName("registryName")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html)
 */
@CdkDslMarker
public class CfnRegistryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRegistry.Builder = CfnRegistry.Builder.create(scope, id)

  private val _tags: MutableList<CfnRegistry.TagsEntryProperty> = mutableListOf()

  /**
   * A description of the registry to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-description)
   * @param description A description of the registry to be created. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the schema registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-registryname)
   * @param registryName The name of the schema registry. 
   */
  public fun registryName(registryName: String) {
    cdkBuilder.registryName(registryName)
  }

  /**
   * Tags to associate with the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-tags)
   * @param tags Tags to associate with the registry. 
   */
  public fun tags(tags: CfnRegistryTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnRegistryTagsEntryPropertyDsl().apply(tags).build())
  }

  /**
   * Tags to associate with the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-tags)
   * @param tags Tags to associate with the registry. 
   */
  public fun tags(tags: Collection<CfnRegistry.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRegistry {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
