@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.resourceexplorer2.CfnIndex
import software.constructs.Construct

@CdkDslMarker
public class CfnIndexDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnIndex.Builder = CfnIndex.Builder.create(scope, id)

  /**
   * The specified tags are attached to only the index created in this AWS Region .
   *
   * The tags don't attach to any of the resources listed in the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-tags)
   * @param tags The specified tags are attached to only the index created in this AWS Region . 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * Specifies the type of the index in this Region.
   *
   * For information about the aggregator index and how it differs from a local index, see [Turning
   * on cross-Region search by creating an aggregator
   * index](https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html)
   * in the *AWS Resource Explorer User Guide.* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-resourceexplorer2-index.html#cfn-resourceexplorer2-index-type)
   * @param type Specifies the type of the index in this Region. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnIndex = cdkBuilder.build()
}
