@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnBackupVaultProps {
  public fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

  public fun backupVaultName(): String

  public fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
      emptyMap()

  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

  public fun notifications(): Any? = unwrap(this).getNotifications()

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicy(accessPolicy: Any)

    public fun backupVaultName(backupVaultName: String)

    public fun backupVaultTags(backupVaultTags: Map<String, String>)

    public fun encryptionKeyArn(encryptionKeyArn: String)

    public fun lockConfiguration(lockConfiguration: IResolvable)

    public fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b12854a83d82c7db8221c5c5eb0aabd4fd69d163615fc7b6713f10b51fc8b59b")
    public
        fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty.Builder.() -> Unit)

    public fun notifications(notifications: IResolvable)

    public fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29aa0e09e1ef908d0b104d072a254efdd1ba75409e20f44d06e4a8feee593d2a")
    public
        fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupVaultProps.Builder =
        software.amazon.awscdk.services.backup.CfnBackupVaultProps.builder()

    override fun accessPolicy(accessPolicy: Any) {
      cdkBuilder.accessPolicy(accessPolicy)
    }

    override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    override fun backupVaultTags(backupVaultTags: Map<String, String>) {
      cdkBuilder.backupVaultTags(backupVaultTags)
    }

    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    override fun lockConfiguration(lockConfiguration: IResolvable) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(CfnBackupVault.LockConfigurationTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b12854a83d82c7db8221c5c5eb0aabd4fd69d163615fc7b6713f10b51fc8b59b")
    override
        fun lockConfiguration(lockConfiguration: CfnBackupVault.LockConfigurationTypeProperty.Builder.() -> Unit):
        Unit = lockConfiguration(CfnBackupVault.LockConfigurationTypeProperty(lockConfiguration))

    override fun notifications(notifications: IResolvable) {
      cdkBuilder.notifications(notifications.let(IResolvable::unwrap))
    }

    override fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty) {
      cdkBuilder.notifications(notifications.let(CfnBackupVault.NotificationObjectTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29aa0e09e1ef908d0b104d072a254efdd1ba75409e20f44d06e4a8feee593d2a")
    override
        fun notifications(notifications: CfnBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit):
        Unit = notifications(CfnBackupVault.NotificationObjectTypeProperty(notifications))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupVaultProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnBackupVaultProps,
  ) : CdkObject(cdkObject), CfnBackupVaultProps {
    override fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

    override fun backupVaultName(): String = unwrap(this).getBackupVaultName()

    override fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
        emptyMap()

    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    override fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

    override fun notifications(): Any? = unwrap(this).getNotifications()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBackupVaultProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVaultProps):
        CfnBackupVaultProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBackupVaultProps):
        software.amazon.awscdk.services.backup.CfnBackupVaultProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.CfnBackupVaultProps
  }
}
