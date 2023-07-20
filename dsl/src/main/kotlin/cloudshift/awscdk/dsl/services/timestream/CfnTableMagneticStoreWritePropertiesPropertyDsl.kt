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

  public fun enableMagneticStoreWrites(enableMagneticStoreWrites: Boolean) {
    cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
  }

  public fun enableMagneticStoreWrites(enableMagneticStoreWrites: IResolvable) {
    cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
  }

  public fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: IResolvable) {
    cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation)
  }

  public
      fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: CfnTable.MagneticStoreRejectedDataLocationProperty) {
    cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation)
  }

  public fun build(): CfnTable.MagneticStoreWritePropertiesProperty = cdkBuilder.build()
}
