@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * S3-customer-managed;
 *
 * When you choose customer-managed storage, the `retentionPeriod` parameter is ignored. You can't
 * change the choice of Amazon S3 storage after your data store is created.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * CustomerManagedS3Property customerManagedS3Property = CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html)
 */
@CdkDslMarker
public class CfnDatastoreCustomerManagedS3PropertyDsl {
  private val cdkBuilder: CfnDatastore.CustomerManagedS3Property.Builder =
      CfnDatastore.CustomerManagedS3Property.builder()

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

  /**
   * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact with
   * your Amazon S3 resources. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDatastore.CustomerManagedS3Property = cdkBuilder.build()
}
