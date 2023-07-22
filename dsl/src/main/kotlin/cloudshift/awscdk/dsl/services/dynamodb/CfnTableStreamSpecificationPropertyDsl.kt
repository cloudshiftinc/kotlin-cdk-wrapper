@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableStreamSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.StreamSpecificationProperty.Builder =
      CfnTable.StreamSpecificationProperty.builder()

  /**
   * @param streamViewType When an item in the table is modified, `StreamViewType` determines what
   * information is written to the stream for this table. 
   * Valid values for `StreamViewType` are:
   *
   * * `KEYS_ONLY` - Only the key attributes of the modified item are written to the stream.
   * * `NEW_IMAGE` - The entire item, as it appears after it was modified, is written to the stream.
   * * `OLD_IMAGE` - The entire item, as it appeared before it was modified, is written to the
   * stream.
   * * `NEW_AND_OLD_IMAGES` - Both the new and the old item images of the item are written to the
   * stream.
   */
  public fun streamViewType(streamViewType: String) {
    cdkBuilder.streamViewType(streamViewType)
  }

  public fun build(): CfnTable.StreamSpecificationProperty = cdkBuilder.build()
}
