@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface SAMLOptionsProperty {
  public fun idpEntityId(): String

  public fun idpMetadataContent(): String

  public fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

  public fun masterUserName(): String? = unwrap(this).getMasterUserName()

  public fun rolesKey(): String? = unwrap(this).getRolesKey()

  public fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

  public fun subjectKey(): String? = unwrap(this).getSubjectKey()

  @CdkDslMarker
  public interface Builder {
    public fun idpEntityId(idpEntityId: String)

    public fun idpMetadataContent(idpMetadataContent: String)

    public fun masterBackendRole(masterBackendRole: String)

    public fun masterUserName(masterUserName: String)

    public fun rolesKey(rolesKey: String)

    public fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number)

    public fun subjectKey(subjectKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty.Builder =
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty.builder()

    override fun idpEntityId(idpEntityId: String) {
      cdkBuilder.idpEntityId(idpEntityId)
    }

    override fun idpMetadataContent(idpMetadataContent: String) {
      cdkBuilder.idpMetadataContent(idpMetadataContent)
    }

    override fun masterBackendRole(masterBackendRole: String) {
      cdkBuilder.masterBackendRole(masterBackendRole)
    }

    override fun masterUserName(masterUserName: String) {
      cdkBuilder.masterUserName(masterUserName)
    }

    override fun rolesKey(rolesKey: String) {
      cdkBuilder.rolesKey(rolesKey)
    }

    override fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number) {
      cdkBuilder.sessionTimeoutMinutes(sessionTimeoutMinutes)
    }

    override fun subjectKey(subjectKey: String) {
      cdkBuilder.subjectKey(subjectKey)
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty,
  ) : CdkObject(cdkObject), SAMLOptionsProperty {
    override fun idpEntityId(): String = unwrap(this).getIdpEntityId()

    override fun idpMetadataContent(): String = unwrap(this).getIdpMetadataContent()

    override fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

    override fun masterUserName(): String? = unwrap(this).getMasterUserName()

    override fun rolesKey(): String? = unwrap(this).getRolesKey()

    override fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

    override fun subjectKey(): String? = unwrap(this).getSubjectKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SAMLOptionsProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty):
        SAMLOptionsProperty = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SAMLOptionsProperty):
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty
  }
}
