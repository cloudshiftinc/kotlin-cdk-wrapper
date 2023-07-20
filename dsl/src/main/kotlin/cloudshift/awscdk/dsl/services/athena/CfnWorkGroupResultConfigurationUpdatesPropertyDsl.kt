@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupResultConfigurationUpdatesPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.ResultConfigurationUpdatesProperty.Builder =
      CfnWorkGroup.ResultConfigurationUpdatesProperty.builder()

  public fun aclConfiguration(aclConfiguration: IResolvable) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  public fun aclConfiguration(aclConfiguration: CfnWorkGroup.AclConfigurationProperty) {
    cdkBuilder.aclConfiguration(aclConfiguration)
  }

  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public
      fun encryptionConfiguration(encryptionConfiguration: CfnWorkGroup.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  public fun expectedBucketOwner(expectedBucketOwner: String) {
    cdkBuilder.expectedBucketOwner(expectedBucketOwner)
  }

  public fun outputLocation(outputLocation: String) {
    cdkBuilder.outputLocation(outputLocation)
  }

  public fun removeAclConfiguration(removeAclConfiguration: Boolean) {
    cdkBuilder.removeAclConfiguration(removeAclConfiguration)
  }

  public fun removeAclConfiguration(removeAclConfiguration: IResolvable) {
    cdkBuilder.removeAclConfiguration(removeAclConfiguration)
  }

  public fun removeEncryptionConfiguration(removeEncryptionConfiguration: Boolean) {
    cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
  }

  public fun removeEncryptionConfiguration(removeEncryptionConfiguration: IResolvable) {
    cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
  }

  public fun removeExpectedBucketOwner(removeExpectedBucketOwner: Boolean) {
    cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
  }

  public fun removeExpectedBucketOwner(removeExpectedBucketOwner: IResolvable) {
    cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
  }

  public fun removeOutputLocation(removeOutputLocation: Boolean) {
    cdkBuilder.removeOutputLocation(removeOutputLocation)
  }

  public fun removeOutputLocation(removeOutputLocation: IResolvable) {
    cdkBuilder.removeOutputLocation(removeOutputLocation)
  }

  public fun build(): CfnWorkGroup.ResultConfigurationUpdatesProperty = cdkBuilder.build()
}
