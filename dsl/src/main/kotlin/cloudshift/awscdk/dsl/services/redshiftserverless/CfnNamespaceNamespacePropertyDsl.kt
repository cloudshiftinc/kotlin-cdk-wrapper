@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.redshiftserverless.CfnNamespace

@CdkDslMarker
public class CfnNamespaceNamespacePropertyDsl {
  private val cdkBuilder: CfnNamespace.NamespaceProperty.Builder =
      CfnNamespace.NamespaceProperty.builder()

  private val _iamRoles: MutableList<String> = mutableListOf()

  private val _logExports: MutableList<String> = mutableListOf()

  public fun adminUsername(adminUsername: String) {
    cdkBuilder.adminUsername(adminUsername)
  }

  public fun creationDate(creationDate: String) {
    cdkBuilder.creationDate(creationDate)
  }

  public fun dbName(dbName: String) {
    cdkBuilder.dbName(dbName)
  }

  public fun defaultIamRoleArn(defaultIamRoleArn: String) {
    cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
  }

  public fun iamRoles(vararg iamRoles: String) {
    _iamRoles.addAll(listOf(*iamRoles))
  }

  public fun iamRoles(iamRoles: Collection<String>) {
    _iamRoles.addAll(iamRoles)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun logExports(vararg logExports: String) {
    _logExports.addAll(listOf(*logExports))
  }

  public fun logExports(logExports: Collection<String>) {
    _logExports.addAll(logExports)
  }

  public fun namespaceArn(namespaceArn: String) {
    cdkBuilder.namespaceArn(namespaceArn)
  }

  public fun namespaceId(namespaceId: String) {
    cdkBuilder.namespaceId(namespaceId)
  }

  public fun namespaceName(namespaceName: String) {
    cdkBuilder.namespaceName(namespaceName)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnNamespace.NamespaceProperty {
    if(_iamRoles.isNotEmpty()) cdkBuilder.iamRoles(_iamRoles)
    if(_logExports.isNotEmpty()) cdkBuilder.logExports(_logExports)
    return cdkBuilder.build()
  }
}
