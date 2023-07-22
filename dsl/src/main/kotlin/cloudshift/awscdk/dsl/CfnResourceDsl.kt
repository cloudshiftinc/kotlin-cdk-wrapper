@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnResource
import software.constructs.Construct

/**
 * Represents a CloudFormation resource.
 *
 * Example:
 *
 * ```
 * public class MyConstruct extends Resource implements ITaggable {
 * public final Object tags;
 * public MyConstruct(Construct scope, String id) {
 * super(scope, id);
 * CfnResource.Builder.create(this, "Resource")
 * .type("Whatever::The::Type")
 * .properties(Map.of(
 * // ...
 * "Tags", this.tags.getRenderedTags()))
 * .build();
 * }
 * }
 * ```
 */
@CdkDslMarker
public class CfnResourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResource.Builder = CfnResource.Builder.create(scope, id)

  /**
   * Resource properties.
   *
   * Default: - No resource properties.
   *
   * @param properties Resource properties. 
   */
  public fun properties(properties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(properties)
    cdkBuilder.properties(builder.map)
  }

  /**
   * Resource properties.
   *
   * Default: - No resource properties.
   *
   * @param properties Resource properties. 
   */
  public fun properties(properties: Map<String, Any>) {
    cdkBuilder.properties(properties)
  }

  /**
   * CloudFormation resource type (e.g. `AWS::S3::Bucket`).
   *
   * @param type CloudFormation resource type (e.g. `AWS::S3::Bucket`). 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnResource = cdkBuilder.build()
}
