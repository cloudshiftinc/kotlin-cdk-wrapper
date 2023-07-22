@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

/**
 * The time that a Data Store was created.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.healthlake.*;
 * CreatedAtProperty createdAtProperty = CreatedAtProperty.builder()
 * .nanos(123)
 * .seconds("seconds")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-createdat.html)
 */
@CdkDslMarker
public class CfnFHIRDatastoreCreatedAtPropertyDsl {
  private val cdkBuilder: CfnFHIRDatastore.CreatedAtProperty.Builder =
      CfnFHIRDatastore.CreatedAtProperty.builder()

  /**
   * @param nanos Nanoseconds. 
   */
  public fun nanos(nanos: Number) {
    cdkBuilder.nanos(nanos)
  }

  /**
   * @param seconds Seconds since epoch. 
   */
  public fun seconds(seconds: String) {
    cdkBuilder.seconds(seconds)
  }

  public fun build(): CfnFHIRDatastore.CreatedAtProperty = cdkBuilder.build()
}
