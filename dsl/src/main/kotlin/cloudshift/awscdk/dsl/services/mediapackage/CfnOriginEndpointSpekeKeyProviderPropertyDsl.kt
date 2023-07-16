@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointSpekeKeyProviderPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.SpekeKeyProviderProperty.Builder =
      CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

  private val _systemIds: MutableList<String> = mutableListOf()

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
    cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
  }

  public
      fun encryptionContractConfiguration(encryptionContractConfiguration: CfnOriginEndpoint.EncryptionContractConfigurationProperty) {
    cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun systemIds(vararg systemIds: String) {
    _systemIds.addAll(listOf(*systemIds))
  }

  public fun systemIds(systemIds: Collection<String>) {
    _systemIds.addAll(systemIds)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun build(): CfnOriginEndpoint.SpekeKeyProviderProperty {
    if(_systemIds.isNotEmpty()) cdkBuilder.systemIds(_systemIds)
    return cdkBuilder.build()
  }
}
