@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnTagOption
import software.constructs.Construct

@CdkDslMarker
public class CfnTagOptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTagOption.Builder = CfnTagOption.Builder.create(scope, id)

  public fun active(active: Boolean) {
    cdkBuilder.active(active)
  }

  public fun active(active: IResolvable) {
    cdkBuilder.active(active)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTagOption = cdkBuilder.build()
}
