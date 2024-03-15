@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.proton

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironmentAccountConnection internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun codebuildRoleArn(): String? = unwrap(this).getCodebuildRoleArn()

  public open fun codebuildRoleArn(`value`: String) {
    unwrap(this).setCodebuildRoleArn(`value`)
  }

  public open fun componentRoleArn(): String? = unwrap(this).getComponentRoleArn()

  public open fun componentRoleArn(`value`: String) {
    unwrap(this).setComponentRoleArn(`value`)
  }

  public open fun environmentAccountId(): String? = unwrap(this).getEnvironmentAccountId()

  public open fun environmentAccountId(`value`: String) {
    unwrap(this).setEnvironmentAccountId(`value`)
  }

  public open fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public open fun environmentName(`value`: String) {
    unwrap(this).setEnvironmentName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun managementAccountId(): String? = unwrap(this).getManagementAccountId()

  public open fun managementAccountId(`value`: String) {
    unwrap(this).setManagementAccountId(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun codebuildRoleArn(codebuildRoleArn: String)

    public fun componentRoleArn(componentRoleArn: String)

    public fun environmentAccountId(environmentAccountId: String)

    public fun environmentName(environmentName: String)

    public fun managementAccountId(managementAccountId: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection.Builder =
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection.Builder.create(scope,
        id)

    override fun codebuildRoleArn(codebuildRoleArn: String) {
      cdkBuilder.codebuildRoleArn(codebuildRoleArn)
    }

    override fun componentRoleArn(componentRoleArn: String) {
      cdkBuilder.componentRoleArn(componentRoleArn)
    }

    override fun environmentAccountId(environmentAccountId: String) {
      cdkBuilder.environmentAccountId(environmentAccountId)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun managementAccountId(managementAccountId: String) {
      cdkBuilder.managementAccountId(managementAccountId)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentAccountConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentAccountConnection(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection):
        CfnEnvironmentAccountConnection = CfnEnvironmentAccountConnection(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentAccountConnection):
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnection = wrapped.cdkObject
  }
}
