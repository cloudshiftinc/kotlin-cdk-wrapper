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

  /**
   * @param adminUsername The username of the administrator for the first database created in the
   * namespace.
   */
  public fun adminUsername(adminUsername: String) {
    cdkBuilder.adminUsername(adminUsername)
  }

  /**
   * @param creationDate The date of when the namespace was created.
   */
  public fun creationDate(creationDate: String) {
    cdkBuilder.creationDate(creationDate)
  }

  /**
   * @param dbName The name of the first database created in the namespace.
   */
  public fun dbName(dbName: String) {
    cdkBuilder.dbName(dbName)
  }

  /**
   * @param defaultIamRoleArn The Amazon Resource Name (ARN) of the IAM role to set as a default in
   * the namespace.
   */
  public fun defaultIamRoleArn(defaultIamRoleArn: String) {
    cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
  }

  /**
   * @param iamRoles A list of IAM roles to associate with the namespace.
   */
  public fun iamRoles(vararg iamRoles: String) {
    _iamRoles.addAll(listOf(*iamRoles))
  }

  /**
   * @param iamRoles A list of IAM roles to associate with the namespace.
   */
  public fun iamRoles(iamRoles: Collection<String>) {
    _iamRoles.addAll(iamRoles)
  }

  /**
   * @param kmsKeyId The ID of the AWS Key Management Service key used to encrypt your data.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param logExports The types of logs the namespace can export.
   * Available export types are User log, Connection log, and User activity log.
   */
  public fun logExports(vararg logExports: String) {
    _logExports.addAll(listOf(*logExports))
  }

  /**
   * @param logExports The types of logs the namespace can export.
   * Available export types are User log, Connection log, and User activity log.
   */
  public fun logExports(logExports: Collection<String>) {
    _logExports.addAll(logExports)
  }

  /**
   * @param namespaceArn The Amazon Resource Name (ARN) associated with a namespace.
   */
  public fun namespaceArn(namespaceArn: String) {
    cdkBuilder.namespaceArn(namespaceArn)
  }

  /**
   * @param namespaceId The unique identifier of a namespace.
   */
  public fun namespaceId(namespaceId: String) {
    cdkBuilder.namespaceId(namespaceId)
  }

  /**
   * @param namespaceName The name of the namespace.
   * Must be between 3-64 alphanumeric characters in lowercase, and it cannot be a reserved word. A
   * list of reserved words can be found in [Reserved
   * Words](https://docs.aws.amazon.com//redshift/latest/dg/r_pg_keywords.html) in the Amazon Redshift
   * Database Developer Guide.
   */
  public fun namespaceName(namespaceName: String) {
    cdkBuilder.namespaceName(namespaceName)
  }

  /**
   * @param status The status of the namespace.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnNamespace.NamespaceProperty {
    if(_iamRoles.isNotEmpty()) cdkBuilder.iamRoles(_iamRoles)
    if(_logExports.isNotEmpty()) cdkBuilder.logExports(_logExports)
    return cdkBuilder.build()
  }
}
