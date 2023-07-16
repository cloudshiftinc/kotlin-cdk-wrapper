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

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnIndex = cdkBuilder.build()
}
