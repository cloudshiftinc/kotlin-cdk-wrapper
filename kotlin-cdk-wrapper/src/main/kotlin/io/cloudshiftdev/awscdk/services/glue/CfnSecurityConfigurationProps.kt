@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSecurityConfigurationProps {
  public fun encryptionConfiguration(): Any

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    public
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bb08deaaa0685773d8142f895b1df0b51953bba1e759a383093230b059c37a")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps.Builder =
        software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps.builder()

    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnSecurityConfiguration.EncryptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bb08deaaa0685773d8142f895b1df0b51953bba1e759a383093230b059c37a")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnSecurityConfiguration.EncryptionConfigurationProperty(encryptionConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps,
  ) : CdkObject(cdkObject), CfnSecurityConfigurationProps {
    override fun encryptionConfiguration(): Any = unwrap(this).getEncryptionConfiguration()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps):
        CfnSecurityConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfigurationProps):
        software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps
  }
}
