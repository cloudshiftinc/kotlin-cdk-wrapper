@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnStudioProps {
  public fun authMode(): String

  public fun defaultS3Location(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public fun engineSecurityGroupId(): String

  public fun idcInstanceArn(): String? = unwrap(this).getIdcInstanceArn()

  public fun idcUserAssignment(): String? = unwrap(this).getIdcUserAssignment()

  public fun idpAuthUrl(): String? = unwrap(this).getIdpAuthUrl()

  public fun idpRelayStateParameterName(): String? = unwrap(this).getIdpRelayStateParameterName()

  public fun name(): String

  public fun serviceRole(): String

  public fun subnetIds(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trustedIdentityPropagationEnabled(): Any? =
      unwrap(this).getTrustedIdentityPropagationEnabled()

  public fun userRole(): String? = unwrap(this).getUserRole()

  public fun vpcId(): String

  public fun workspaceSecurityGroupId(): String

  @CdkDslMarker
  public interface Builder {
    public fun authMode(authMode: String)

    public fun defaultS3Location(defaultS3Location: String)

    public fun description(description: String)

    public fun encryptionKeyArn(encryptionKeyArn: String)

    public fun engineSecurityGroupId(engineSecurityGroupId: String)

    public fun idcInstanceArn(idcInstanceArn: String)

    public fun idcUserAssignment(idcUserAssignment: String)

    public fun idpAuthUrl(idpAuthUrl: String)

    public fun idpRelayStateParameterName(idpRelayStateParameterName: String)

    public fun name(name: String)

    public fun serviceRole(serviceRole: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean)

    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable)

    public fun userRole(userRole: String)

    public fun vpcId(vpcId: String)

    public fun workspaceSecurityGroupId(workspaceSecurityGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStudioProps.Builder =
        software.amazon.awscdk.services.emr.CfnStudioProps.builder()

    override fun authMode(authMode: String) {
      cdkBuilder.authMode(authMode)
    }

    override fun defaultS3Location(defaultS3Location: String) {
      cdkBuilder.defaultS3Location(defaultS3Location)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    override fun engineSecurityGroupId(engineSecurityGroupId: String) {
      cdkBuilder.engineSecurityGroupId(engineSecurityGroupId)
    }

    override fun idcInstanceArn(idcInstanceArn: String) {
      cdkBuilder.idcInstanceArn(idcInstanceArn)
    }

    override fun idcUserAssignment(idcUserAssignment: String) {
      cdkBuilder.idcUserAssignment(idcUserAssignment)
    }

    override fun idpAuthUrl(idpAuthUrl: String) {
      cdkBuilder.idpAuthUrl(idpAuthUrl)
    }

    override fun idpRelayStateParameterName(idpRelayStateParameterName: String) {
      cdkBuilder.idpRelayStateParameterName(idpRelayStateParameterName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean) {
      cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled)
    }

    override fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable) {
      cdkBuilder.trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled.let(IResolvable::unwrap))
    }

    override fun userRole(userRole: String) {
      cdkBuilder.userRole(userRole)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    override fun workspaceSecurityGroupId(workspaceSecurityGroupId: String) {
      cdkBuilder.workspaceSecurityGroupId(workspaceSecurityGroupId)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStudioProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnStudioProps,
  ) : CdkObject(cdkObject), CfnStudioProps {
    override fun authMode(): String = unwrap(this).getAuthMode()

    override fun defaultS3Location(): String = unwrap(this).getDefaultS3Location()

    override fun description(): String? = unwrap(this).getDescription()

    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    override fun engineSecurityGroupId(): String = unwrap(this).getEngineSecurityGroupId()

    override fun idcInstanceArn(): String? = unwrap(this).getIdcInstanceArn()

    override fun idcUserAssignment(): String? = unwrap(this).getIdcUserAssignment()

    override fun idpAuthUrl(): String? = unwrap(this).getIdpAuthUrl()

    override fun idpRelayStateParameterName(): String? =
        unwrap(this).getIdpRelayStateParameterName()

    override fun name(): String = unwrap(this).getName()

    override fun serviceRole(): String = unwrap(this).getServiceRole()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trustedIdentityPropagationEnabled(): Any? =
        unwrap(this).getTrustedIdentityPropagationEnabled()

    override fun userRole(): String? = unwrap(this).getUserRole()

    override fun vpcId(): String = unwrap(this).getVpcId()

    override fun workspaceSecurityGroupId(): String = unwrap(this).getWorkspaceSecurityGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStudioProps): CfnStudioProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioProps): software.amazon.awscdk.services.emr.CfnStudioProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStudioProps
  }
}
