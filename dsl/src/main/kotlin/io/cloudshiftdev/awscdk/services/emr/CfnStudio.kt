package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStudio internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnStudio,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStudioId(): String = unwrap(this).getAttrStudioId()

  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  public open fun authMode(): String = unwrap(this).getAuthMode()

  public open fun authMode(`value`: String) {
    unwrap(this).setAuthMode(`value`)
  }

  public open fun defaultS3Location(): String = unwrap(this).getDefaultS3Location()

  public open fun defaultS3Location(`value`: String) {
    unwrap(this).setDefaultS3Location(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  public open fun engineSecurityGroupId(): String = unwrap(this).getEngineSecurityGroupId()

  public open fun engineSecurityGroupId(`value`: String) {
    unwrap(this).setEngineSecurityGroupId(`value`)
  }

  public open fun idcInstanceArn(): String? = unwrap(this).getIdcInstanceArn()

  public open fun idcInstanceArn(`value`: String) {
    unwrap(this).setIdcInstanceArn(`value`)
  }

  public open fun idcUserAssignment(): String? = unwrap(this).getIdcUserAssignment()

  public open fun idcUserAssignment(`value`: String) {
    unwrap(this).setIdcUserAssignment(`value`)
  }

  public open fun idpAuthUrl(): String? = unwrap(this).getIdpAuthUrl()

  public open fun idpAuthUrl(`value`: String) {
    unwrap(this).setIdpAuthUrl(`value`)
  }

  public open fun idpRelayStateParameterName(): String? =
      unwrap(this).getIdpRelayStateParameterName()

  public open fun idpRelayStateParameterName(`value`: String) {
    unwrap(this).setIdpRelayStateParameterName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun trustedIdentityPropagationEnabled(): Any? =
      unwrap(this).getTrustedIdentityPropagationEnabled()

  public open fun trustedIdentityPropagationEnabled(`value`: Boolean) {
    unwrap(this).setTrustedIdentityPropagationEnabled(`value`)
  }

  public open fun trustedIdentityPropagationEnabled(`value`: IResolvable) {
    unwrap(this).setTrustedIdentityPropagationEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun userRole(): String? = unwrap(this).getUserRole()

  public open fun userRole(`value`: String) {
    unwrap(this).setUserRole(`value`)
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public open fun workspaceSecurityGroupId(): String = unwrap(this).getWorkspaceSecurityGroupId()

  public open fun workspaceSecurityGroupId(`value`: String) {
    unwrap(this).setWorkspaceSecurityGroupId(`value`)
  }

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

    public fun tags(tags: List<CfnTag>)

    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: Boolean)

    public fun trustedIdentityPropagationEnabled(trustedIdentityPropagationEnabled: IResolvable)

    public fun userRole(userRole: String)

    public fun vpcId(vpcId: String)

    public fun workspaceSecurityGroupId(workspaceSecurityGroupId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStudio.Builder =
        software.amazon.awscdk.services.emr.CfnStudio.Builder.create(scope, id)

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

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.emr.CfnStudio = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStudio {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStudio(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStudio): CfnStudio =
        CfnStudio(cdkObject)

    internal fun unwrap(wrapped: CfnStudio): software.amazon.awscdk.services.emr.CfnStudio =
        wrapped.cdkObject
  }
}
