@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BackupVault internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.BackupVault,
) : Resource(cdkObject), IBackupVault {
  public open fun addToAccessPolicy(statement: PolicyStatement) {
    unwrap(this).addToAccessPolicy(statement.let(PolicyStatement::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc0762d9426cc157e5ba4c37c43d819271923214298beb4ea3dcd72232fc6f21")
  public open fun addToAccessPolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToAccessPolicy(PolicyStatement(statement))

  public override fun backupVaultArn(): String = unwrap(this).getBackupVaultArn()

  public override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

  public open fun blockRecoveryPointDeletion() {
    unwrap(this).blockRecoveryPointDeletion()
  }

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicy(accessPolicy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("300aa7cbfdf6d896a21f7e35992336f28e09bd473bace3ea72e84b46ced4a2df")
    public fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit)

    public fun backupVaultName(backupVaultName: String)

    public fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean)

    public fun encryptionKey(encryptionKey: IKey)

    public fun lockConfiguration(lockConfiguration: LockConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8503a03f95ef9fb6ebebe12304a5acfc4e2828a77d35540b88b2695e6c6a92")
    public fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit)

    public fun notificationEvents(notificationEvents: List<BackupVaultEvents>)

    public fun notificationEvents(vararg notificationEvents: BackupVaultEvents)

    public fun notificationTopic(notificationTopic: ITopic)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupVault.Builder =
        software.amazon.awscdk.services.backup.BackupVault.Builder.create(scope, id)

    override fun accessPolicy(accessPolicy: PolicyDocument) {
      cdkBuilder.accessPolicy(accessPolicy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("300aa7cbfdf6d896a21f7e35992336f28e09bd473bace3ea72e84b46ced4a2df")
    override fun accessPolicy(accessPolicy: PolicyDocument.Builder.() -> Unit): Unit =
        accessPolicy(PolicyDocument(accessPolicy))

    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    override fun blockRecoveryPointDeletion(blockRecoveryPointDeletion: Boolean) {
      cdkBuilder.blockRecoveryPointDeletion(blockRecoveryPointDeletion)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun lockConfiguration(lockConfiguration: LockConfiguration) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(LockConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf8503a03f95ef9fb6ebebe12304a5acfc4e2828a77d35540b88b2695e6c6a92")
    override fun lockConfiguration(lockConfiguration: LockConfiguration.Builder.() -> Unit): Unit =
        lockConfiguration(LockConfiguration(lockConfiguration))

    override fun notificationEvents(notificationEvents: List<BackupVaultEvents>) {
      cdkBuilder.notificationEvents(notificationEvents.map(BackupVaultEvents::unwrap))
    }

    override fun notificationEvents(vararg notificationEvents: BackupVaultEvents): Unit =
        notificationEvents(notificationEvents.toList())

    override fun notificationTopic(notificationTopic: ITopic) {
      cdkBuilder.notificationTopic(notificationTopic.let(ITopic::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupVault = cdkBuilder.build()
  }

  public companion object {
    public fun fromBackupVaultArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVaultArn: String,
    ): IBackupVault =
        software.amazon.awscdk.services.backup.BackupVault.fromBackupVaultArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVaultArn).let(IBackupVault::wrap)

    public fun fromBackupVaultName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVaultName: String,
    ): IBackupVault =
        software.amazon.awscdk.services.backup.BackupVault.fromBackupVaultName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVaultName).let(IBackupVault::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BackupVault {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BackupVault(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupVault): BackupVault =
        BackupVault(cdkObject)

    internal fun unwrap(wrapped: BackupVault): software.amazon.awscdk.services.backup.BackupVault =
        wrapped.cdkObject
  }
}
