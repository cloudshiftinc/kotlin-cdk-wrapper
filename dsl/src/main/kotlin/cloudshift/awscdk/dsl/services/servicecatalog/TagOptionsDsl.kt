@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.constructs.Construct

@CdkDslMarker
public class TagOptionsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: TagOptions.Builder = TagOptions.Builder.create(scope, id)

  /**
   * The values that are allowed to be set for specific tags.
   *
   * The keys of the map represent the tag keys,
   * and the values of the map are a list of allowed values for that particular tag key.
   *
   * @param allowedValuesForTags The values that are allowed to be set for specific tags. 
   */
  public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
    cdkBuilder.allowedValuesForTags(allowedValuesForTags)
  }

  public fun build(): TagOptions = cdkBuilder.build()
}
