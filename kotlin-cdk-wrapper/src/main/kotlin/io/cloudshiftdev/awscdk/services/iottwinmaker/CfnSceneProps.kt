@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnSceneProps {
  public fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  public fun contentLocation(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun sceneId(): String

  public fun sceneMetadata(): Any? = unwrap(this).getSceneMetadata()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun workspaceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun capabilities(capabilities: List<String>)

    public fun capabilities(vararg capabilities: String)

    public fun contentLocation(contentLocation: String)

    public fun description(description: String)

    public fun sceneId(sceneId: String)

    public fun sceneMetadata(sceneMetadata: IResolvable)

    public fun sceneMetadata(sceneMetadata: Map<String, String>)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnSceneProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnSceneProps.builder()

    override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    override fun capabilities(vararg capabilities: String): Unit =
        capabilities(capabilities.toList())

    override fun contentLocation(contentLocation: String) {
      cdkBuilder.contentLocation(contentLocation)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun sceneId(sceneId: String) {
      cdkBuilder.sceneId(sceneId)
    }

    override fun sceneMetadata(sceneMetadata: IResolvable) {
      cdkBuilder.sceneMetadata(sceneMetadata.let(IResolvable::unwrap))
    }

    override fun sceneMetadata(sceneMetadata: Map<String, String>) {
      cdkBuilder.sceneMetadata(sceneMetadata)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnSceneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSceneProps,
  ) : CdkObject(cdkObject), CfnSceneProps {
    override fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

    override fun contentLocation(): String = unwrap(this).getContentLocation()

    override fun description(): String? = unwrap(this).getDescription()

    override fun sceneId(): String = unwrap(this).getSceneId()

    override fun sceneMetadata(): Any? = unwrap(this).getSceneMetadata()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSceneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnSceneProps):
        CfnSceneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSceneProps):
        software.amazon.awscdk.services.iottwinmaker.CfnSceneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnSceneProps
  }
}
