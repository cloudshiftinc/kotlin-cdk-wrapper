@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMitigationActionProps {
  public fun actionName(): String? = unwrap(this).getActionName()

  public fun actionParams(): Any

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun actionName(actionName: String)

    public fun actionParams(actionParams: IResolvable)

    public fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35cc1d0a71f0eff3eeb5b2f9fe494460406c77c1061e477305c310c139fc20c")
    public
        fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnMitigationActionProps.Builder =
        software.amazon.awscdk.services.iot.CfnMitigationActionProps.builder()

    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    override fun actionParams(actionParams: IResolvable) {
      cdkBuilder.actionParams(actionParams.let(IResolvable::unwrap))
    }

    override fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty) {
      cdkBuilder.actionParams(actionParams.let(CfnMitigationAction.ActionParamsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d35cc1d0a71f0eff3eeb5b2f9fe494460406c77c1061e477305c310c139fc20c")
    override
        fun actionParams(actionParams: CfnMitigationAction.ActionParamsProperty.Builder.() -> Unit):
        Unit = actionParams(CfnMitigationAction.ActionParamsProperty(actionParams))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnMitigationActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnMitigationActionProps,
  ) : CdkObject(cdkObject), CfnMitigationActionProps {
    override fun actionName(): String? = unwrap(this).getActionName()

    override fun actionParams(): Any = unwrap(this).getActionParams()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMitigationActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationActionProps):
        CfnMitigationActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMitigationActionProps):
        software.amazon.awscdk.services.iot.CfnMitigationActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnMitigationActionProps
  }
}
