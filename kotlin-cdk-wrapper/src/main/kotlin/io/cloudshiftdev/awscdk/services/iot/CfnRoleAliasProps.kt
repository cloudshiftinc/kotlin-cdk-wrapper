@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRoleAliasProps {
  public fun credentialDurationSeconds(): Number? = unwrap(this).getCredentialDurationSeconds()

  public fun roleAlias(): String? = unwrap(this).getRoleAlias()

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun credentialDurationSeconds(credentialDurationSeconds: Number)

    public fun roleAlias(roleAlias: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnRoleAliasProps.Builder =
        software.amazon.awscdk.services.iot.CfnRoleAliasProps.builder()

    override fun credentialDurationSeconds(credentialDurationSeconds: Number) {
      cdkBuilder.credentialDurationSeconds(credentialDurationSeconds)
    }

    override fun roleAlias(roleAlias: String) {
      cdkBuilder.roleAlias(roleAlias)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnRoleAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnRoleAliasProps,
  ) : CdkObject(cdkObject), CfnRoleAliasProps {
    override fun credentialDurationSeconds(): Number? = unwrap(this).getCredentialDurationSeconds()

    override fun roleAlias(): String? = unwrap(this).getRoleAlias()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoleAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnRoleAliasProps):
        CfnRoleAliasProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoleAliasProps):
        software.amazon.awscdk.services.iot.CfnRoleAliasProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnRoleAliasProps
  }
}
