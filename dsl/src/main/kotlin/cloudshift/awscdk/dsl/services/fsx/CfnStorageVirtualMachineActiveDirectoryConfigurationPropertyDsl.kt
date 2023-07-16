@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine

@CdkDslMarker
public class CfnStorageVirtualMachineActiveDirectoryConfigurationPropertyDsl {
  private val cdkBuilder: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder =
      CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.builder()

  public fun netBiosName(netBiosName: String) {
    cdkBuilder.netBiosName(netBiosName)
  }

  public
      fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: IResolvable) {
    cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
  }

  public
      fun selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration: CfnStorageVirtualMachine.SelfManagedActiveDirectoryConfigurationProperty) {
    cdkBuilder.selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration)
  }

  public fun build(): CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty =
      cdkBuilder.build()
}
