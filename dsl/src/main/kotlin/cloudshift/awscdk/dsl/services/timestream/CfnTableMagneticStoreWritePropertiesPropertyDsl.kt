@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnTable

@CdkDslMarker
public class CfnTableMagneticStoreWritePropertiesPropertyDsl {
  private val cdkBuilder: CfnTable.MagneticStoreWritePropertiesProperty.Builder =
      CfnTable.MagneticStoreWritePropertiesProperty.builder()

  /**
   * @param enableMagneticStoreWrites A flag to enable magnetic store writes. 
   */
  public fun enableMagneticStoreWrites(enableMagneticStoreWrites: Boolean) {
    cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
  }

  /**
   * @param enableMagneticStoreWrites A flag to enable magnetic store writes. 
   */
  public fun enableMagneticStoreWrites(enableMagneticStoreWrites: IResolvable) {
    cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
  }

  /**
   * @param magneticStoreRejectedDataLocation The location to write error reports for records
   * rejected asynchronously during magnetic store writes.
   */
  public fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: IResolvable) {
    cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation)
  }

  /**
   * @param magneticStoreRejectedDataLocation The location to write error reports for records
   * rejected asynchronously during magnetic store writes.
   */
  public
      fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: CfnTable.MagneticStoreRejectedDataLocationProperty) {
    cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation)
  }

  public fun build(): CfnTable.MagneticStoreWritePropertiesProperty = cdkBuilder.build()
}
