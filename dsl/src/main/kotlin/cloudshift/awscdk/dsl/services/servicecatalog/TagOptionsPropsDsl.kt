@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import software.amazon.awscdk.services.servicecatalog.TagOptionsProps

@CdkDslMarker
public class TagOptionsPropsDsl {
  private val cdkBuilder: TagOptionsProps.Builder = TagOptionsProps.builder()

  public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
    cdkBuilder.allowedValuesForTags(allowedValuesForTags)
  }

  public fun build(): TagOptionsProps = cdkBuilder.build()
}
