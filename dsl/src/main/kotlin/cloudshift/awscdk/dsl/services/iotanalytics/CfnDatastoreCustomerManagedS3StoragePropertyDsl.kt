@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreCustomerManagedS3StoragePropertyDsl {
  private val cdkBuilder: CfnDatastore.CustomerManagedS3StorageProperty.Builder =
      CfnDatastore.CustomerManagedS3StorageProperty.builder()

  /**
   * @param bucket The name of the Amazon S3 bucket where your data is stored. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param keyPrefix (Optional) The prefix used to create the keys of the data store data objects.
   * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket. Each
   * object in a bucket has exactly one key. The prefix must end with a forward slash (/).
   */
  public fun keyPrefix(keyPrefix: String) {
    cdkBuilder.keyPrefix(keyPrefix)
  }

  public fun build(): CfnDatastore.CustomerManagedS3StorageProperty = cdkBuilder.build()
}
