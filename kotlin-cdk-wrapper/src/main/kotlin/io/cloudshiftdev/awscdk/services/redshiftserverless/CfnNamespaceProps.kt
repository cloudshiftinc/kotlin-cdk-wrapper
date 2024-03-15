@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNamespaceProps {
  public fun adminPasswordSecretKmsKeyId(): String? = unwrap(this).getAdminPasswordSecretKmsKeyId()

  public fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

  public fun adminUsername(): String? = unwrap(this).getAdminUsername()

  public fun dbName(): String? = unwrap(this).getDbName()

  public fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

  public fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  public fun finalSnapshotRetentionPeriod(): Number? =
      unwrap(this).getFinalSnapshotRetentionPeriod()

  public fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

  public fun manageAdminPassword(): Any? = unwrap(this).getManageAdminPassword()

  public fun namespaceName(): String

  public fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  public fun redshiftIdcApplicationArn(): String? = unwrap(this).getRedshiftIdcApplicationArn()

  public fun snapshotCopyConfigurations(): Any? = unwrap(this).getSnapshotCopyConfigurations()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String)

    public fun adminUserPassword(adminUserPassword: String)

    public fun adminUsername(adminUsername: String)

    public fun dbName(dbName: String)

    public fun defaultIamRoleArn(defaultIamRoleArn: String)

    public fun finalSnapshotName(finalSnapshotName: String)

    public fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number)

    public fun iamRoles(iamRoles: List<String>)

    public fun iamRoles(vararg iamRoles: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun logExports(logExports: List<String>)

    public fun logExports(vararg logExports: String)

    public fun manageAdminPassword(manageAdminPassword: Boolean)

    public fun manageAdminPassword(manageAdminPassword: IResolvable)

    public fun namespaceName(namespaceName: String)

    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any)

    public fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String)

    public fun snapshotCopyConfigurations(snapshotCopyConfigurations: IResolvable)

    public fun snapshotCopyConfigurations(snapshotCopyConfigurations: List<Any>)

    public fun snapshotCopyConfigurations(vararg snapshotCopyConfigurations: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps.Builder =
        software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps.builder()

    override fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String) {
      cdkBuilder.adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId)
    }

    override fun adminUserPassword(adminUserPassword: String) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    override fun adminUsername(adminUsername: String) {
      cdkBuilder.adminUsername(adminUsername)
    }

    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    override fun defaultIamRoleArn(defaultIamRoleArn: String) {
      cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
    }

    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    override fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number) {
      cdkBuilder.finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod)
    }

    override fun iamRoles(iamRoles: List<String>) {
      cdkBuilder.iamRoles(iamRoles)
    }

    override fun iamRoles(vararg iamRoles: String): Unit = iamRoles(iamRoles.toList())

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun logExports(logExports: List<String>) {
      cdkBuilder.logExports(logExports)
    }

    override fun logExports(vararg logExports: String): Unit = logExports(logExports.toList())

    override fun manageAdminPassword(manageAdminPassword: Boolean) {
      cdkBuilder.manageAdminPassword(manageAdminPassword)
    }

    override fun manageAdminPassword(manageAdminPassword: IResolvable) {
      cdkBuilder.manageAdminPassword(manageAdminPassword.let(IResolvable::unwrap))
    }

    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    override fun namespaceResourcePolicy(namespaceResourcePolicy: Any) {
      cdkBuilder.namespaceResourcePolicy(namespaceResourcePolicy)
    }

    override fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String) {
      cdkBuilder.redshiftIdcApplicationArn(redshiftIdcApplicationArn)
    }

    override fun snapshotCopyConfigurations(snapshotCopyConfigurations: IResolvable) {
      cdkBuilder.snapshotCopyConfigurations(snapshotCopyConfigurations.let(IResolvable::unwrap))
    }

    override fun snapshotCopyConfigurations(snapshotCopyConfigurations: List<Any>) {
      cdkBuilder.snapshotCopyConfigurations(snapshotCopyConfigurations)
    }

    override fun snapshotCopyConfigurations(vararg snapshotCopyConfigurations: Any): Unit =
        snapshotCopyConfigurations(snapshotCopyConfigurations.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps,
  ) : CdkObject(cdkObject), CfnNamespaceProps {
    override fun adminPasswordSecretKmsKeyId(): String? =
        unwrap(this).getAdminPasswordSecretKmsKeyId()

    override fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

    override fun adminUsername(): String? = unwrap(this).getAdminUsername()

    override fun dbName(): String? = unwrap(this).getDbName()

    override fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

    override fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

    override fun finalSnapshotRetentionPeriod(): Number? =
        unwrap(this).getFinalSnapshotRetentionPeriod()

    override fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

    override fun manageAdminPassword(): Any? = unwrap(this).getManageAdminPassword()

    override fun namespaceName(): String = unwrap(this).getNamespaceName()

    override fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

    override fun redshiftIdcApplicationArn(): String? = unwrap(this).getRedshiftIdcApplicationArn()

    override fun snapshotCopyConfigurations(): Any? = unwrap(this).getSnapshotCopyConfigurations()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps):
        CfnNamespaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNamespaceProps):
        software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshiftserverless.CfnNamespaceProps
  }
}
