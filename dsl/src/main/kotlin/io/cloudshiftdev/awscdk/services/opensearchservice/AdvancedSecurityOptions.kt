package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.SecretValue
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AdvancedSecurityOptions {
  public fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

  public fun masterUserName(): String? = unwrap(this).getMasterUserName()

  public fun masterUserPassword(): SecretValue? =
      unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

  public fun samlAuthenticationEnabled(): Boolean? = unwrap(this).getSamlAuthenticationEnabled()

  public fun samlAuthenticationOptions(): SAMLOptionsProperty? =
      unwrap(this).getSamlAuthenticationOptions()?.let(SAMLOptionsProperty::wrap)

  public interface Builder {
    public fun masterUserArn(masterUserArn: String)

    public fun masterUserName(masterUserName: String)

    public fun masterUserPassword(masterUserPassword: SecretValue)

    public fun samlAuthenticationEnabled(samlAuthenticationEnabled: Boolean)

    public fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d35bcd5990b82875687519147a3dda825cd7a271485f83779d92ad8484332d")
    public
        fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions.builder()

    override fun masterUserArn(masterUserArn: String) {
      cdkBuilder.masterUserArn(masterUserArn)
    }

    override fun masterUserName(masterUserName: String) {
      cdkBuilder.masterUserName(masterUserName)
    }

    override fun masterUserPassword(masterUserPassword: SecretValue) {
      cdkBuilder.masterUserPassword(masterUserPassword.let(SecretValue::unwrap))
    }

    override fun samlAuthenticationEnabled(samlAuthenticationEnabled: Boolean) {
      cdkBuilder.samlAuthenticationEnabled(samlAuthenticationEnabled)
    }

    override fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty) {
      cdkBuilder.samlAuthenticationOptions(samlAuthenticationOptions.let(SAMLOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d35bcd5990b82875687519147a3dda825cd7a271485f83779d92ad8484332d")
    override
        fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty.Builder.() -> Unit):
        Unit = samlAuthenticationOptions(SAMLOptionsProperty(samlAuthenticationOptions))

    public fun build(): software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions,
  ) : AdvancedSecurityOptions {
    override fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

    override fun masterUserName(): String? = unwrap(this).getMasterUserName()

    override fun masterUserPassword(): SecretValue? =
        unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

    override fun samlAuthenticationEnabled(): Boolean? = unwrap(this).getSamlAuthenticationEnabled()

    override fun samlAuthenticationOptions(): SAMLOptionsProperty? =
        unwrap(this).getSamlAuthenticationOptions()?.let(SAMLOptionsProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedSecurityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions):
        AdvancedSecurityOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdvancedSecurityOptions):
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions = (wrapped as
        Wrapper).cdkObject
  }
}
