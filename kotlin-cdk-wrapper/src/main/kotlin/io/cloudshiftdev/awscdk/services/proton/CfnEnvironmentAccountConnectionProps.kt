@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.proton

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnvironmentAccountConnectionProps {
  public fun codebuildRoleArn(): String? = unwrap(this).getCodebuildRoleArn()

  public fun componentRoleArn(): String? = unwrap(this).getComponentRoleArn()

  public fun environmentAccountId(): String? = unwrap(this).getEnvironmentAccountId()

  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public fun managementAccountId(): String? = unwrap(this).getManagementAccountId()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps.Builder =
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps,
  ) : CdkObject(cdkObject), CfnEnvironmentAccountConnectionProps {
    override fun codebuildRoleArn(): String? = unwrap(this).getCodebuildRoleArn()

    override fun componentRoleArn(): String? = unwrap(this).getComponentRoleArn()

    override fun environmentAccountId(): String? = unwrap(this).getEnvironmentAccountId()

    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    override fun managementAccountId(): String? = unwrap(this).getManagementAccountId()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnEnvironmentAccountConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps):
        CfnEnvironmentAccountConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentAccountConnectionProps):
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.proton.CfnEnvironmentAccountConnectionProps
  }
}
