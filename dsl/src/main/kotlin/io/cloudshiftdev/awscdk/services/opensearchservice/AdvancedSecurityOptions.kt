package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AdvancedSecurityOptions {
  /**
   * ARN for the master user.
   *
   * Only specify this or masterUserName, but not both.
   *
   * Default: - fine-grained access control is disabled
   */
  public fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

  /**
   * Username for the master user.
   *
   * Only specify this or masterUserArn, but not both.
   *
   * Default: - fine-grained access control is disabled
   */
  public fun masterUserName(): String? = unwrap(this).getMasterUserName()

  /**
   * Password for the master user.
   *
   * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
   * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
   * Secrets Manager.
   *
   * Default: - A Secrets Manager generated password
   */
  public fun masterUserPassword(): SecretValue? =
      unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

  /**
   * True to enable SAML authentication for a domain.
   *
   * Default: - SAML authentication is disabled. Enabled if `samlAuthenticationOptions` is set.
   *
   * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/saml.html)
   */
  public fun samlAuthenticationEnabled(): Boolean? = unwrap(this).getSamlAuthenticationEnabled()

  /**
   * Container for information about the SAML configuration for OpenSearch Dashboards.
   *
   * If set, `samlAuthenticationEnabled` will be enabled.
   *
   * Default: - no SAML authentication options
   */
  public fun samlAuthenticationOptions(): SAMLOptionsProperty? =
      unwrap(this).getSamlAuthenticationOptions()?.let(SAMLOptionsProperty::wrap)

  /**
   * A builder for [AdvancedSecurityOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param masterUserArn ARN for the master user.
     * Only specify this or masterUserName, but not both.
     */
    public fun masterUserArn(masterUserArn: String)

    /**
     * @param masterUserName Username for the master user.
     * Only specify this or masterUserArn, but not both.
     */
    public fun masterUserName(masterUserName: String)

    /**
     * @param masterUserPassword Password for the master user.
     * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
     * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
     * Secrets Manager.
     */
    public fun masterUserPassword(masterUserPassword: SecretValue)

    /**
     * @param samlAuthenticationEnabled True to enable SAML authentication for a domain.
     */
    public fun samlAuthenticationEnabled(samlAuthenticationEnabled: Boolean)

    /**
     * @param samlAuthenticationOptions Container for information about the SAML configuration for
     * OpenSearch Dashboards.
     * If set, `samlAuthenticationEnabled` will be enabled.
     */
    public fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty)

    /**
     * @param samlAuthenticationOptions Container for information about the SAML configuration for
     * OpenSearch Dashboards.
     * If set, `samlAuthenticationEnabled` will be enabled.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d35bcd5990b82875687519147a3dda825cd7a271485f83779d92ad8484332d")
    public
        fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions.Builder =
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions.builder()

    /**
     * @param masterUserArn ARN for the master user.
     * Only specify this or masterUserName, but not both.
     */
    override fun masterUserArn(masterUserArn: String) {
      cdkBuilder.masterUserArn(masterUserArn)
    }

    /**
     * @param masterUserName Username for the master user.
     * Only specify this or masterUserArn, but not both.
     */
    override fun masterUserName(masterUserName: String) {
      cdkBuilder.masterUserName(masterUserName)
    }

    /**
     * @param masterUserPassword Password for the master user.
     * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
     * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
     * Secrets Manager.
     */
    override fun masterUserPassword(masterUserPassword: SecretValue) {
      cdkBuilder.masterUserPassword(masterUserPassword.let(SecretValue::unwrap))
    }

    /**
     * @param samlAuthenticationEnabled True to enable SAML authentication for a domain.
     */
    override fun samlAuthenticationEnabled(samlAuthenticationEnabled: Boolean) {
      cdkBuilder.samlAuthenticationEnabled(samlAuthenticationEnabled)
    }

    /**
     * @param samlAuthenticationOptions Container for information about the SAML configuration for
     * OpenSearch Dashboards.
     * If set, `samlAuthenticationEnabled` will be enabled.
     */
    override fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty) {
      cdkBuilder.samlAuthenticationOptions(samlAuthenticationOptions.let(SAMLOptionsProperty::unwrap))
    }

    /**
     * @param samlAuthenticationOptions Container for information about the SAML configuration for
     * OpenSearch Dashboards.
     * If set, `samlAuthenticationEnabled` will be enabled.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d35bcd5990b82875687519147a3dda825cd7a271485f83779d92ad8484332d")
    override
        fun samlAuthenticationOptions(samlAuthenticationOptions: SAMLOptionsProperty.Builder.() -> Unit):
        Unit = samlAuthenticationOptions(SAMLOptionsProperty(samlAuthenticationOptions))

    public fun build(): software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions,
  ) : CdkObject(cdkObject), AdvancedSecurityOptions {
    /**
     * ARN for the master user.
     *
     * Only specify this or masterUserName, but not both.
     *
     * Default: - fine-grained access control is disabled
     */
    override fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

    /**
     * Username for the master user.
     *
     * Only specify this or masterUserArn, but not both.
     *
     * Default: - fine-grained access control is disabled
     */
    override fun masterUserName(): String? = unwrap(this).getMasterUserName()

    /**
     * Password for the master user.
     *
     * You can use `SecretValue.unsafePlainText` to specify a password in plain text or
     * use `secretsmanager.Secret.fromSecretAttributes` to reference a secret in
     * Secrets Manager.
     *
     * Default: - A Secrets Manager generated password
     */
    override fun masterUserPassword(): SecretValue? =
        unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

    /**
     * True to enable SAML authentication for a domain.
     *
     * Default: - SAML authentication is disabled. Enabled if `samlAuthenticationOptions` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/saml.html)
     */
    override fun samlAuthenticationEnabled(): Boolean? = unwrap(this).getSamlAuthenticationEnabled()

    /**
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     *
     * If set, `samlAuthenticationEnabled` will be enabled.
     *
     * Default: - no SAML authentication options
     */
    override fun samlAuthenticationOptions(): SAMLOptionsProperty? =
        unwrap(this).getSamlAuthenticationOptions()?.let(SAMLOptionsProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AdvancedSecurityOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions):
        AdvancedSecurityOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdvancedSecurityOptions):
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions
  }
}
