@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupResultConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.ResultConfigurationProperty.Builder =
      CfnWorkGroup.ResultConfigurationProperty.builder()

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

  public fun build(): CfnWorkGroup.ResultConfigurationProperty = cdkBuilder.build()
}
