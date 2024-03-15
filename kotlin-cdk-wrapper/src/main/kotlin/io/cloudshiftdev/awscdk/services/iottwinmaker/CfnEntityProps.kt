@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnEntityProps {
  public fun components(): Any? = unwrap(this).getComponents()

  public fun compositeComponents(): Any? = unwrap(this).getCompositeComponents()

  public fun description(): String? = unwrap(this).getDescription()

  public fun entityId(): String? = unwrap(this).getEntityId()

  public fun entityName(): String

  public fun parentEntityId(): String? = unwrap(this).getParentEntityId()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun workspaceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun components(components: IResolvable)

    public fun components(components: Map<String, Any>)

    public fun compositeComponents(compositeComponents: IResolvable)

    public fun compositeComponents(compositeComponents: Map<String, Any>)

    public fun description(description: String)

    public fun entityId(entityId: String)

    public fun entityName(entityName: String)

    public fun parentEntityId(parentEntityId: String)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnEntityProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnEntityProps.builder()

    override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    override fun components(components: Map<String, Any>) {
      cdkBuilder.components(components)
    }

    override fun compositeComponents(compositeComponents: IResolvable) {
      cdkBuilder.compositeComponents(compositeComponents.let(IResolvable::unwrap))
    }

    override fun compositeComponents(compositeComponents: Map<String, Any>) {
      cdkBuilder.compositeComponents(compositeComponents)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun entityId(entityId: String) {
      cdkBuilder.entityId(entityId)
    }

    override fun entityName(entityName: String) {
      cdkBuilder.entityName(entityName)
    }

    override fun parentEntityId(parentEntityId: String) {
      cdkBuilder.parentEntityId(parentEntityId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnEntityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntityProps,
  ) : CdkObject(cdkObject), CfnEntityProps {
    override fun components(): Any? = unwrap(this).getComponents()

    override fun compositeComponents(): Any? = unwrap(this).getCompositeComponents()

    override fun description(): String? = unwrap(this).getDescription()

    override fun entityId(): String? = unwrap(this).getEntityId()

    override fun entityName(): String = unwrap(this).getEntityName()

    override fun parentEntityId(): String? = unwrap(this).getParentEntityId()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEntityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnEntityProps):
        CfnEntityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEntityProps):
        software.amazon.awscdk.services.iottwinmaker.CfnEntityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnEntityProps
  }
}
