@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserAccessLoggingSettingsProps {
  public fun kinesisStreamArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun kinesisStreamArn(kinesisStreamArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps.builder()

    override fun kinesisStreamArn(kinesisStreamArn: String) {
      cdkBuilder.kinesisStreamArn(kinesisStreamArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps,
  ) : CdkObject(cdkObject), CfnUserAccessLoggingSettingsProps {
    override fun kinesisStreamArn(): String = unwrap(this).getKinesisStreamArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserAccessLoggingSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps):
        CfnUserAccessLoggingSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserAccessLoggingSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps
  }
}
