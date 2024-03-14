package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNamespace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun adminPasswordSecretKmsKeyId(): String? =
      unwrap(this).getAdminPasswordSecretKmsKeyId()

  public open fun adminPasswordSecretKmsKeyId(`value`: String) {
    unwrap(this).setAdminPasswordSecretKmsKeyId(`value`)
  }

  public open fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

  public open fun adminUserPassword(`value`: String) {
    unwrap(this).setAdminUserPassword(`value`)
  }

  public open fun adminUsername(): String? = unwrap(this).getAdminUsername()

  public open fun adminUsername(`value`: String) {
    unwrap(this).setAdminUsername(`value`)
  }

  public open fun attrNamespace(): IResolvable =
      unwrap(this).getAttrNamespace().let(IResolvable::wrap)

  public open fun attrNamespaceAdminUsername(): String =
      unwrap(this).getAttrNamespaceAdminUsername()

  public open fun attrNamespaceCreationDate(): String = unwrap(this).getAttrNamespaceCreationDate()

  public open fun attrNamespaceDbName(): String = unwrap(this).getAttrNamespaceDbName()

  public open fun attrNamespaceDefaultIamRoleArn(): String =
      unwrap(this).getAttrNamespaceDefaultIamRoleArn()

  public open fun attrNamespaceIamRoles(): List<String> = unwrap(this).getAttrNamespaceIamRoles() ?:
      emptyList()

  public open fun attrNamespaceKmsKeyId(): String = unwrap(this).getAttrNamespaceKmsKeyId()

  public open fun attrNamespaceLogExports(): List<String> =
      unwrap(this).getAttrNamespaceLogExports() ?: emptyList()

  public open fun attrNamespaceNamespaceArn(): String = unwrap(this).getAttrNamespaceNamespaceArn()

  public open fun attrNamespaceNamespaceId(): String = unwrap(this).getAttrNamespaceNamespaceId()

  public open fun attrNamespaceNamespaceName(): String =
      unwrap(this).getAttrNamespaceNamespaceName()

  public open fun attrNamespaceStatus(): String = unwrap(this).getAttrNamespaceStatus()

  public open fun dbName(): String? = unwrap(this).getDbName()

  public open fun dbName(`value`: String) {
    unwrap(this).setDbName(`value`)
  }

  public open fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

  public open fun defaultIamRoleArn(`value`: String) {
    unwrap(this).setDefaultIamRoleArn(`value`)
  }

  public open fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  public open fun finalSnapshotName(`value`: String) {
    unwrap(this).setFinalSnapshotName(`value`)
  }

  public open fun finalSnapshotRetentionPeriod(): Number? =
      unwrap(this).getFinalSnapshotRetentionPeriod()

  public open fun finalSnapshotRetentionPeriod(`value`: Number) {
    unwrap(this).setFinalSnapshotRetentionPeriod(`value`)
  }

  public open fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

  public open fun iamRoles(`value`: List<String>) {
    unwrap(this).setIamRoles(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

  public open fun logExports(`value`: List<String>) {
    unwrap(this).setLogExports(`value`)
  }

  public open fun manageAdminPassword(): Any? = unwrap(this).getManageAdminPassword()

  public open fun manageAdminPassword(`value`: Boolean) {
    unwrap(this).setManageAdminPassword(`value`)
  }

  public open fun manageAdminPassword(`value`: IResolvable) {
    unwrap(this).setManageAdminPassword(`value`.let(IResolvable::unwrap))
  }

  public open fun namespaceName(): String = unwrap(this).getNamespaceName()

  public open fun namespaceName(`value`: String) {
    unwrap(this).setNamespaceName(`value`)
  }

  public open fun namespaceResourcePolicy(): Any? = unwrap(this).getNamespaceResourcePolicy()

  public open fun namespaceResourcePolicy(`value`: Any) {
    unwrap(this).setNamespaceResourcePolicy(`value`)
  }

  public open fun redshiftIdcApplicationArn(): String? = unwrap(this).getRedshiftIdcApplicationArn()

  public open fun redshiftIdcApplicationArn(`value`: String) {
    unwrap(this).setRedshiftIdcApplicationArn(`value`)
  }

  public open fun snapshotCopyConfigurations(): Any? = unwrap(this).getSnapshotCopyConfigurations()

  public open fun snapshotCopyConfigurations(`value`: IResolvable) {
    unwrap(this).setSnapshotCopyConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun snapshotCopyConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setSnapshotCopyConfigurations(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String)

    public fun adminUserPassword(adminUserPassword: String)

    public fun adminUsername(adminUsername: String)

    public fun dbName(dbName: String)

    public fun defaultIamRoleArn(defaultIamRoleArn: String)

    public fun finalSnapshotName(finalSnapshotName: String)

    public fun finalSnapshotRetentionPeriod(finalSnapshotRetentionPeriod: Number)

    public fun iamRoles(iamRoles: List<String>)

    public fun kmsKeyId(kmsKeyId: String)

    public fun logExports(logExports: List<String>)

    public fun manageAdminPassword(manageAdminPassword: Boolean)

    public fun manageAdminPassword(manageAdminPassword: IResolvable)

    public fun namespaceName(namespaceName: String)

    public fun namespaceResourcePolicy(namespaceResourcePolicy: Any)

    public fun redshiftIdcApplicationArn(redshiftIdcApplicationArn: String)

    public fun snapshotCopyConfigurations(snapshotCopyConfigurations: IResolvable)

    public fun snapshotCopyConfigurations(snapshotCopyConfigurations: List<Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshiftserverless.CfnNamespace.Builder
        = software.amazon.awscdk.services.redshiftserverless.CfnNamespace.Builder.create(scope, id)

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

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun logExports(logExports: List<String>) {
      cdkBuilder.logExports(logExports)
    }

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

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnNamespace =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace):
        CfnNamespace = CfnNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnNamespace):
        software.amazon.awscdk.services.redshiftserverless.CfnNamespace = wrapped.cdkObject
  }

  public interface NamespaceProperty {
    public fun adminPasswordSecretArn(): String? = unwrap(this).getAdminPasswordSecretArn()

    public fun adminPasswordSecretKmsKeyId(): String? =
        unwrap(this).getAdminPasswordSecretKmsKeyId()

    public fun adminUsername(): String? = unwrap(this).getAdminUsername()

    public fun creationDate(): String? = unwrap(this).getCreationDate()

    public fun dbName(): String? = unwrap(this).getDbName()

    public fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

    public fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

    public fun namespaceArn(): String? = unwrap(this).getNamespaceArn()

    public fun namespaceId(): String? = unwrap(this).getNamespaceId()

    public fun namespaceName(): String? = unwrap(this).getNamespaceName()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun adminPasswordSecretArn(adminPasswordSecretArn: String)

      public fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String)

      public fun adminUsername(adminUsername: String)

      public fun creationDate(creationDate: String)

      public fun dbName(dbName: String)

      public fun defaultIamRoleArn(defaultIamRoleArn: String)

      public fun iamRoles(iamRoles: List<String>)

      public fun kmsKeyId(kmsKeyId: String)

      public fun logExports(logExports: List<String>)

      public fun namespaceArn(namespaceArn: String)

      public fun namespaceId(namespaceId: String)

      public fun namespaceName(namespaceName: String)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty.builder()

      override fun adminPasswordSecretArn(adminPasswordSecretArn: String) {
        cdkBuilder.adminPasswordSecretArn(adminPasswordSecretArn)
      }

      override fun adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId: String) {
        cdkBuilder.adminPasswordSecretKmsKeyId(adminPasswordSecretKmsKeyId)
      }

      override fun adminUsername(adminUsername: String) {
        cdkBuilder.adminUsername(adminUsername)
      }

      override fun creationDate(creationDate: String) {
        cdkBuilder.creationDate(creationDate)
      }

      override fun dbName(dbName: String) {
        cdkBuilder.dbName(dbName)
      }

      override fun defaultIamRoleArn(defaultIamRoleArn: String) {
        cdkBuilder.defaultIamRoleArn(defaultIamRoleArn)
      }

      override fun iamRoles(iamRoles: List<String>) {
        cdkBuilder.iamRoles(iamRoles)
      }

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun logExports(logExports: List<String>) {
        cdkBuilder.logExports(logExports)
      }

      override fun namespaceArn(namespaceArn: String) {
        cdkBuilder.namespaceArn(namespaceArn)
      }

      override fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
      }

      override fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty,
    ) : NamespaceProperty {
      override fun adminPasswordSecretArn(): String? = unwrap(this).getAdminPasswordSecretArn()

      override fun adminPasswordSecretKmsKeyId(): String? =
          unwrap(this).getAdminPasswordSecretKmsKeyId()

      override fun adminUsername(): String? = unwrap(this).getAdminUsername()

      override fun creationDate(): String? = unwrap(this).getCreationDate()

      override fun dbName(): String? = unwrap(this).getDbName()

      override fun defaultIamRoleArn(): String? = unwrap(this).getDefaultIamRoleArn()

      override fun iamRoles(): List<String> = unwrap(this).getIamRoles() ?: emptyList()

      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun logExports(): List<String> = unwrap(this).getLogExports() ?: emptyList()

      override fun namespaceArn(): String? = unwrap(this).getNamespaceArn()

      override fun namespaceId(): String? = unwrap(this).getNamespaceId()

      override fun namespaceName(): String? = unwrap(this).getNamespaceName()

      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NamespaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty):
          NamespaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamespaceProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.NamespaceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnapshotCopyConfigurationProperty {
    public fun destinationKmsKeyId(): String? = unwrap(this).getDestinationKmsKeyId()

    public fun destinationRegion(): String

    public fun snapshotRetentionPeriod(): Number? = unwrap(this).getSnapshotRetentionPeriod()

    public interface Builder {
      public fun destinationKmsKeyId(destinationKmsKeyId: String)

      public fun destinationRegion(destinationRegion: String)

      public fun snapshotRetentionPeriod(snapshotRetentionPeriod: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.SnapshotCopyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.SnapshotCopyConfigurationProperty.builder()

      override fun destinationKmsKeyId(destinationKmsKeyId: String) {
        cdkBuilder.destinationKmsKeyId(destinationKmsKeyId)
      }

      override fun destinationRegion(destinationRegion: String) {
        cdkBuilder.destinationRegion(destinationRegion)
      }

      override fun snapshotRetentionPeriod(snapshotRetentionPeriod: Number) {
        cdkBuilder.snapshotRetentionPeriod(snapshotRetentionPeriod)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.SnapshotCopyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.SnapshotCopyConfigurationProperty,
    ) : SnapshotCopyConfigurationProperty {
      override fun destinationKmsKeyId(): String? = unwrap(this).getDestinationKmsKeyId()

      override fun destinationRegion(): String = unwrap(this).getDestinationRegion()

      override fun snapshotRetentionPeriod(): Number? = unwrap(this).getSnapshotRetentionPeriod()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnapshotCopyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnNamespace.SnapshotCopyConfigurationProperty):
          SnapshotCopyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapshotCopyConfigurationProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnNamespace.SnapshotCopyConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
