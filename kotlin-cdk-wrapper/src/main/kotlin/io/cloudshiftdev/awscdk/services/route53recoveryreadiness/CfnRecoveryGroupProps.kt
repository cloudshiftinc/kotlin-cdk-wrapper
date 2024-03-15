@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRecoveryGroupProps {
  public fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

  public fun recoveryGroupName(): String? = unwrap(this).getRecoveryGroupName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun cells(cells: List<String>)

    public fun cells(vararg cells: String)

    public fun recoveryGroupName(recoveryGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps.builder()

    override fun cells(cells: List<String>) {
      cdkBuilder.cells(cells)
    }

    override fun cells(vararg cells: String): Unit = cells(cells.toList())

    override fun recoveryGroupName(recoveryGroupName: String) {
      cdkBuilder.recoveryGroupName(recoveryGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps,
  ) : CdkObject(cdkObject), CfnRecoveryGroupProps {
    override fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

    override fun recoveryGroupName(): String? = unwrap(this).getRecoveryGroupName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecoveryGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps):
        CfnRecoveryGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecoveryGroupProps):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
  }
}
