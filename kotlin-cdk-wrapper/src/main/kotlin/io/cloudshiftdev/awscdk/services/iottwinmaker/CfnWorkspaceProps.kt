@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnWorkspaceProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun role(): String

  public fun s3Location(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun workspaceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun role(role: String)

    public fun s3Location(s3Location: String)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun s3Location(s3Location: String) {
      cdkBuilder.s3Location(s3Location)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps,
  ) : CdkObject(cdkObject), CfnWorkspaceProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun role(): String = unwrap(this).getRole()

    override fun s3Location(): String = unwrap(this).getS3Location()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps):
        CfnWorkspaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspaceProps):
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps
  }
}
