@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationSalesforceSourcePropertiesPropertyDsl {
  private val cdkBuilder: CfnIntegration.SalesforceSourcePropertiesProperty.Builder =
      CfnIntegration.SalesforceSourcePropertiesProperty.builder()

  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: Boolean) {
    cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
  }

  public fun enableDynamicFieldUpdate(enableDynamicFieldUpdate: IResolvable) {
    cdkBuilder.enableDynamicFieldUpdate(enableDynamicFieldUpdate)
  }

  public fun includeDeletedRecords(includeDeletedRecords: Boolean) {
    cdkBuilder.includeDeletedRecords(includeDeletedRecords)
  }

  public fun includeDeletedRecords(includeDeletedRecords: IResolvable) {
    cdkBuilder.includeDeletedRecords(includeDeletedRecords)
  }

  public fun build(): CfnIntegration.SalesforceSourcePropertiesProperty = cdkBuilder.build()
}
