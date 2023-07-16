@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps

@CdkDslMarker
public class CfnIndexPropsDsl {
  private val cdkBuilder: CfnIndexProps.Builder = CfnIndexProps.builder()

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnIndexProps = cdkBuilder.build()
}
