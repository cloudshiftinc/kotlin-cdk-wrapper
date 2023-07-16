@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnSimpleTable

@CdkDslMarker
public class CfnSimpleTablePrimaryKeyPropertyDsl {
  private val cdkBuilder: CfnSimpleTable.PrimaryKeyProperty.Builder =
      CfnSimpleTable.PrimaryKeyProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSimpleTable.PrimaryKeyProperty = cdkBuilder.build()
}
