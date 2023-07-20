@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@CdkDslMarker
public class CfnResourceSetR53ResourceRecordPropertyDsl {
  private val cdkBuilder: CfnResourceSet.R53ResourceRecordProperty.Builder =
      CfnResourceSet.R53ResourceRecordProperty.builder()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun recordSetId(recordSetId: String) {
    cdkBuilder.recordSetId(recordSetId)
  }

  public fun build(): CfnResourceSet.R53ResourceRecordProperty = cdkBuilder.build()
}
