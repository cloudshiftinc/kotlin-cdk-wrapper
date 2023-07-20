@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreCustomerManagedS3StoragePropertyDsl {
  private val cdkBuilder: CfnDatastore.CustomerManagedS3StorageProperty.Builder =
      CfnDatastore.CustomerManagedS3StorageProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun keyPrefix(keyPrefix: String) {
    cdkBuilder.keyPrefix(keyPrefix)
  }

  public fun build(): CfnDatastore.CustomerManagedS3StorageProperty = cdkBuilder.build()
}
