@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@CdkDslMarker
public class CfnDomainSnapshotOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.SnapshotOptionsProperty.Builder =
      CfnDomain.SnapshotOptionsProperty.builder()

  public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
    cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
  }

  public fun build(): CfnDomain.SnapshotOptionsProperty = cdkBuilder.build()
}
