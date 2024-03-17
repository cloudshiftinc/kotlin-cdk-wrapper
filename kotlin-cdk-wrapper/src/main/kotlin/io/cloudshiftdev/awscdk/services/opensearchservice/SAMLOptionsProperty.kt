@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Container for information about the SAML configuration for OpenSearch Dashboards.
 *
 * Example:
 *
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .enforceHttps(true)
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
 * .masterUserName("master-user")
 * .samlAuthenticationEnabled(true)
 * .samlAuthenticationOptions(SAMLOptionsProperty.builder()
 * .idpEntityId("entity-id")
 * .idpMetadataContent("metadata-content-with-quotes-escaped")
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface SAMLOptionsProperty {
  /**
   * The unique entity ID of the application in the SAML identity provider.
   */
  public fun idpEntityId(): String

  /**
   * The metadata of the SAML application, in XML format.
   */
  public fun idpMetadataContent(): String

  /**
   * The backend role that the SAML master user is mapped to.
   *
   * Any users with this backend role receives full permission in OpenSearch Dashboards/Kibana.
   * To use a SAML master backend role, configure the `rolesKey` property.
   *
   * Default: - The master user is not mapped to a backend role
   */
  public fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

  /**
   * The SAML master username, which is stored in the domain's internal user database.
   *
   * This SAML user receives full permission in OpenSearch Dashboards/Kibana.
   * Creating a new master username does not delete any existing master usernames.
   *
   * Default: - No master user name is configured
   */
  public fun masterUserName(): String? = unwrap(this).getMasterUserName()

  /**
   * Element of the SAML assertion to use for backend roles.
   *
   * Default: - roles
   */
  public fun rolesKey(): String? = unwrap(this).getRolesKey()

  /**
   * The duration, in minutes, after which a user session becomes inactive.
   *
   * Default: - 60
   */
  public fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

  /**
   * Element of the SAML assertion to use for the user name.
   *
   * Default: - NameID element of the SAML assertion fot the user name
   */
  public fun subjectKey(): String? = unwrap(this).getSubjectKey()

  /**
   * A builder for [SAMLOptionsProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param idpEntityId The unique entity ID of the application in the SAML identity provider. 
     */
    public fun idpEntityId(idpEntityId: String)

    /**
     * @param idpMetadataContent The metadata of the SAML application, in XML format. 
     */
    public fun idpMetadataContent(idpMetadataContent: String)

    /**
     * @param masterBackendRole The backend role that the SAML master user is mapped to.
     * Any users with this backend role receives full permission in OpenSearch Dashboards/Kibana.
     * To use a SAML master backend role, configure the `rolesKey` property.
     */
    public fun masterBackendRole(masterBackendRole: String)

    /**
     * @param masterUserName The SAML master username, which is stored in the domain's internal user
     * database.
     * This SAML user receives full permission in OpenSearch Dashboards/Kibana.
     * Creating a new master username does not delete any existing master usernames.
     */
    public fun masterUserName(masterUserName: String)

    /**
     * @param rolesKey Element of the SAML assertion to use for backend roles.
     */
    public fun rolesKey(rolesKey: String)

    /**
     * @param sessionTimeoutMinutes The duration, in minutes, after which a user session becomes
     * inactive.
     */
    public fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number)

    /**
     * @param subjectKey Element of the SAML assertion to use for the user name.
     */
    public fun subjectKey(subjectKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty.Builder =
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty.builder()

    /**
     * @param idpEntityId The unique entity ID of the application in the SAML identity provider. 
     */
    override fun idpEntityId(idpEntityId: String) {
      cdkBuilder.idpEntityId(idpEntityId)
    }

    /**
     * @param idpMetadataContent The metadata of the SAML application, in XML format. 
     */
    override fun idpMetadataContent(idpMetadataContent: String) {
      cdkBuilder.idpMetadataContent(idpMetadataContent)
    }

    /**
     * @param masterBackendRole The backend role that the SAML master user is mapped to.
     * Any users with this backend role receives full permission in OpenSearch Dashboards/Kibana.
     * To use a SAML master backend role, configure the `rolesKey` property.
     */
    override fun masterBackendRole(masterBackendRole: String) {
      cdkBuilder.masterBackendRole(masterBackendRole)
    }

    /**
     * @param masterUserName The SAML master username, which is stored in the domain's internal user
     * database.
     * This SAML user receives full permission in OpenSearch Dashboards/Kibana.
     * Creating a new master username does not delete any existing master usernames.
     */
    override fun masterUserName(masterUserName: String) {
      cdkBuilder.masterUserName(masterUserName)
    }

    /**
     * @param rolesKey Element of the SAML assertion to use for backend roles.
     */
    override fun rolesKey(rolesKey: String) {
      cdkBuilder.rolesKey(rolesKey)
    }

    /**
     * @param sessionTimeoutMinutes The duration, in minutes, after which a user session becomes
     * inactive.
     */
    override fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number) {
      cdkBuilder.sessionTimeoutMinutes(sessionTimeoutMinutes)
    }

    /**
     * @param subjectKey Element of the SAML assertion to use for the user name.
     */
    override fun subjectKey(subjectKey: String) {
      cdkBuilder.subjectKey(subjectKey)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty,
  ) : CdkObject(cdkObject), SAMLOptionsProperty {
    /**
     * The unique entity ID of the application in the SAML identity provider.
     */
    override fun idpEntityId(): String = unwrap(this).getIdpEntityId()

    /**
     * The metadata of the SAML application, in XML format.
     */
    override fun idpMetadataContent(): String = unwrap(this).getIdpMetadataContent()

    /**
     * The backend role that the SAML master user is mapped to.
     *
     * Any users with this backend role receives full permission in OpenSearch Dashboards/Kibana.
     * To use a SAML master backend role, configure the `rolesKey` property.
     *
     * Default: - The master user is not mapped to a backend role
     */
    override fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

    /**
     * The SAML master username, which is stored in the domain's internal user database.
     *
     * This SAML user receives full permission in OpenSearch Dashboards/Kibana.
     * Creating a new master username does not delete any existing master usernames.
     *
     * Default: - No master user name is configured
     */
    override fun masterUserName(): String? = unwrap(this).getMasterUserName()

    /**
     * Element of the SAML assertion to use for backend roles.
     *
     * Default: - roles
     */
    override fun rolesKey(): String? = unwrap(this).getRolesKey()

    /**
     * The duration, in minutes, after which a user session becomes inactive.
     *
     * Default: - 60
     */
    override fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

    /**
     * Element of the SAML assertion to use for the user name.
     *
     * Default: - NameID element of the SAML assertion fot the user name
     */
    override fun subjectKey(): String? = unwrap(this).getSubjectKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SAMLOptionsProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty):
        SAMLOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SAMLOptionsProperty ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SAMLOptionsProperty):
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty
  }
}
