@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketInventoryConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.InventoryConfigurationProperty.Builder =
      CfnBucket.InventoryConfigurationProperty.builder()

  private val _optionalFields: MutableList<String> = mutableListOf()

  /**
   * @param destination Contains information about where to publish the inventory results. 
   */
  public fun destination(destination: IResolvable) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destination Contains information about where to publish the inventory results. 
   */
  public fun destination(destination: CfnBucket.DestinationProperty) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param enabled Specifies whether the inventory is enabled or disabled. 
   * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
   * generated.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether the inventory is enabled or disabled. 
   * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
   * generated.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param id The ID used to identify the inventory configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param includedObjectVersions Object versions to include in the inventory list. 
   * If set to `All` , the list includes all the object versions, which adds the version-related
   * fields `VersionId` , `IsLatest` , and `DeleteMarker` to the list. If set to `Current` , the list
   * does not contain these version-related fields.
   */
  public fun includedObjectVersions(includedObjectVersions: String) {
    cdkBuilder.includedObjectVersions(includedObjectVersions)
  }

  /**
   * @param optionalFields Contains the optional fields that are included in the inventory results.
   * *Valid values* : `Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded |
   * ReplicationStatus | EncryptionStatus | ObjectLockRetainUntilDate | ObjectLockMode |
   * ObjectLockLegalHoldStatus | IntelligentTieringAccessTier | BucketKeyStatus`
   */
  public fun optionalFields(vararg optionalFields: String) {
    _optionalFields.addAll(listOf(*optionalFields))
  }

  /**
   * @param optionalFields Contains the optional fields that are included in the inventory results.
   * *Valid values* : `Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded |
   * ReplicationStatus | EncryptionStatus | ObjectLockRetainUntilDate | ObjectLockMode |
   * ObjectLockLegalHoldStatus | IntelligentTieringAccessTier | BucketKeyStatus`
   */
  public fun optionalFields(optionalFields: Collection<String>) {
    _optionalFields.addAll(optionalFields)
  }

  /**
   * @param prefix Specifies the inventory filter prefix.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param scheduleFrequency Specifies the schedule for generating inventory results. 
   * *Allowed values* : `Daily` | `Weekly`
   */
  public fun scheduleFrequency(scheduleFrequency: String) {
    cdkBuilder.scheduleFrequency(scheduleFrequency)
  }

  public fun build(): CfnBucket.InventoryConfigurationProperty {
    if(_optionalFields.isNotEmpty()) cdkBuilder.optionalFields(_optionalFields)
    return cdkBuilder.build()
  }
}
