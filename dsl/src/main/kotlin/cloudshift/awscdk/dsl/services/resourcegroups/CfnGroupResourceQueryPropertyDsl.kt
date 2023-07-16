@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup

@CdkDslMarker
public class CfnGroupResourceQueryPropertyDsl {
  private val cdkBuilder: CfnGroup.ResourceQueryProperty.Builder =
      CfnGroup.ResourceQueryProperty.builder()

  public fun query(query: IResolvable) {
    cdkBuilder.query(query)
  }

  public fun query(query: CfnGroup.QueryProperty) {
    cdkBuilder.query(query)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnGroup.ResourceQueryProperty = cdkBuilder.build()
}
