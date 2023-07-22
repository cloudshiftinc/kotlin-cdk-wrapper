@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@CdkDslMarker
public class CfnDomainSnapshotOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.SnapshotOptionsProperty.Builder =
      CfnDomain.SnapshotOptionsProperty.builder()

  /**
   * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
   * daily snapshot of the indices in the OpenSearch Service domain.
   * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday between
   * midnight and 1 am. You can specify a value between 0 and 23.
   */
  public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
    cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
  }

  public fun build(): CfnDomain.SnapshotOptionsProperty = cdkBuilder.build()
}
