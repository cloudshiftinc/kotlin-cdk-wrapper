@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@CdkDslMarker
public class CfnPackagingConfigurationSpekeKeyProviderPropertyDsl {
  private val cdkBuilder: CfnPackagingConfiguration.SpekeKeyProviderProperty.Builder =
      CfnPackagingConfiguration.SpekeKeyProviderProperty.builder()

  private val _systemIds: MutableList<String> = mutableListOf()

  public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
    cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
  }

  public
      fun encryptionContractConfiguration(encryptionContractConfiguration: CfnPackagingConfiguration.EncryptionContractConfigurationProperty) {
    cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration)
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

  public fun build(): CfnPackagingConfiguration.SpekeKeyProviderProperty {
    if(_systemIds.isNotEmpty()) cdkBuilder.systemIds(_systemIds)
    return cdkBuilder.build()
  }
}
