@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLRequestBodyAssociatedResourceTypeConfigPropertyDsl {
  private val cdkBuilder: CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.Builder =
      CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty.builder()

  public fun defaultSizeInspectionLimit(defaultSizeInspectionLimit: String) {
    cdkBuilder.defaultSizeInspectionLimit(defaultSizeInspectionLimit)
  }

  public fun build(): CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty = cdkBuilder.build()
}
