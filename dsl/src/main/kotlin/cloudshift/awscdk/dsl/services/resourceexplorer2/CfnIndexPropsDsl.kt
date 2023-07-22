@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps

/**
 * Properties for defining a `CfnIndex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * CfnIndexProps cfnIndexProps = CfnIndexProps.builder()
 * .type("type")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html)
 */
@CdkDslMarker
public class CfnIndexPropsDsl {
  private val cdkBuilder: CfnIndexProps.Builder = CfnIndexProps.builder()

  /**
   * @param tags The specified tags are attached to only the index created in this AWS Region .
   * The tags don't attach to any of the resources listed in the index.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param type Specifies the type of the index in this Region. 
   * For information about the aggregator index and how it differs from a local index, see [Turning
   * on cross-Region search by creating an aggregator
   * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
   * in the *AWS Resource Explorer User Guide.* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnIndexProps = cdkBuilder.build()
}
