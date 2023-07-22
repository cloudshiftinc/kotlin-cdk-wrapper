@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnSourceApiAssociation

@CdkDslMarker
public class CfnSourceApiAssociationSourceApiAssociationConfigPropertyDsl {
  private val cdkBuilder: CfnSourceApiAssociation.SourceApiAssociationConfigProperty.Builder =
      CfnSourceApiAssociation.SourceApiAssociationConfigProperty.builder()

  /**
   * @param mergeType The property that indicates which merging option is enabled in the source API
   * association.
   * Valid merge types are `MANUAL_MERGE` (default) and `AUTO_MERGE` . Manual merges are the default
   * behavior and require the user to trigger any changes from the source APIs to the merged API
   * manually. Auto merges subscribe the merged API to the changes performed on the source APIs so that
   * any change in the source APIs are also made to the merged API. Auto merges use
   * `MergedApiExecutionRoleArn` to perform merge operations.
   *
   * The following values are valid:
   *
   * `MANUAL_MERGE | AUTO_MERGE`
   */
  public fun mergeType(mergeType: String) {
    cdkBuilder.mergeType(mergeType)
  }

  public fun build(): CfnSourceApiAssociation.SourceApiAssociationConfigProperty =
      cdkBuilder.build()
}
