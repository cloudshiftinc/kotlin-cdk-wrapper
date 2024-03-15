@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Unit

public interface EncryptionConfiguration {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun encryptionOption(): EncryptionOption

  @CdkDslMarker
  public interface Builder {
    public fun encryptionKey(encryptionKey: IKey)

    public fun encryptionOption(encryptionOption: EncryptionOption)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration.builder()

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun encryptionOption(encryptionOption: EncryptionOption) {
      cdkBuilder.encryptionOption(encryptionOption.let(EncryptionOption::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration,
  ) : CdkObject(cdkObject), EncryptionConfiguration {
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun encryptionOption(): EncryptionOption =
        unwrap(this).getEncryptionOption().let(EncryptionOption::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration):
        EncryptionConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncryptionConfiguration):
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration
  }
}
