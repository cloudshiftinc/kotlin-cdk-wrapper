@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

@CdkDslMarker
public class CfnLifecyclePolicyArchiveRetainRulePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.ArchiveRetainRuleProperty.Builder =
      CfnLifecyclePolicy.ArchiveRetainRuleProperty.builder()

  public fun retentionArchiveTier(retentionArchiveTier: IResolvable) {
    cdkBuilder.retentionArchiveTier(retentionArchiveTier)
  }

  public
      fun retentionArchiveTier(retentionArchiveTier: CfnLifecyclePolicy.RetentionArchiveTierProperty) {
    cdkBuilder.retentionArchiveTier(retentionArchiveTier)
  }

  public fun build(): CfnLifecyclePolicy.ArchiveRetainRuleProperty = cdkBuilder.build()
}
