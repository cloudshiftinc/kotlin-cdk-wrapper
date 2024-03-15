@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LogGroupProps {
  public fun dataProtectionPolicy(): DataProtectionPolicy? =
      unwrap(this).getDataProtectionPolicy()?.let(DataProtectionPolicy::wrap)

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun logGroupClass(): LogGroupClass? =
      unwrap(this).getLogGroupClass()?.let(LogGroupClass::wrap)

  public fun logGroupName(): String? = unwrap(this).getLogGroupName()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23c975333c66f98e22b4bdd5260945068df979b1fd575fe24db11a4f0d82a331")
    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit)

    public fun encryptionKey(encryptionKey: IKey)

    public fun logGroupClass(logGroupClass: LogGroupClass)

    public fun logGroupName(logGroupName: String)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun retention(retention: RetentionDays)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.LogGroupProps.Builder =
        software.amazon.awscdk.services.logs.LogGroupProps.builder()

    override fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy.let(DataProtectionPolicy::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23c975333c66f98e22b4bdd5260945068df979b1fd575fe24db11a4f0d82a331")
    override
        fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy.Builder.() -> Unit):
        Unit = dataProtectionPolicy(DataProtectionPolicy(dataProtectionPolicy))

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun logGroupClass(logGroupClass: LogGroupClass) {
      cdkBuilder.logGroupClass(logGroupClass.let(LogGroupClass::unwrap))
    }

    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.LogGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.LogGroupProps,
  ) : CdkObject(cdkObject), LogGroupProps {
    override fun dataProtectionPolicy(): DataProtectionPolicy? =
        unwrap(this).getDataProtectionPolicy()?.let(DataProtectionPolicy::wrap)

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun logGroupClass(): LogGroupClass? =
        unwrap(this).getLogGroupClass()?.let(LogGroupClass::wrap)

    override fun logGroupName(): String? = unwrap(this).getLogGroupName()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.LogGroupProps): LogGroupProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupProps): software.amazon.awscdk.services.logs.LogGroupProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.LogGroupProps
  }
}
