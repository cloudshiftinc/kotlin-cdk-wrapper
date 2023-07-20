@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnPermissions

@CdkDslMarker
public class CfnPermissionsTableWildcardPropertyDsl {
  private val cdkBuilder: CfnPermissions.TableWildcardProperty.Builder =
      CfnPermissions.TableWildcardProperty.builder()

  public fun build(): CfnPermissions.TableWildcardProperty = cdkBuilder.build()
}
