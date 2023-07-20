@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.fsx.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemSelfManagedActiveDirectoryConfigurationPropertyDsl {
  private val cdkBuilder: CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty.Builder =
      CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty.builder()

  private val _dnsIps: MutableList<String> = mutableListOf()

  public fun dnsIps(vararg dnsIps: String) {
    _dnsIps.addAll(listOf(*dnsIps))
  }

  public fun dnsIps(dnsIps: Collection<String>) {
    _dnsIps.addAll(dnsIps)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun fileSystemAdministratorsGroup(fileSystemAdministratorsGroup: String) {
    cdkBuilder.fileSystemAdministratorsGroup(fileSystemAdministratorsGroup)
  }

  public fun organizationalUnitDistinguishedName(organizationalUnitDistinguishedName: String) {
    cdkBuilder.organizationalUnitDistinguishedName(organizationalUnitDistinguishedName)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty {
    if(_dnsIps.isNotEmpty()) cdkBuilder.dnsIps(_dnsIps)
    return cdkBuilder.build()
  }
}
