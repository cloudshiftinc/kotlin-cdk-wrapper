@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnComponentTypeProps {
  public fun componentTypeId(): String

  public fun compositeComponentTypes(): Any? = unwrap(this).getCompositeComponentTypes()

  public fun description(): String? = unwrap(this).getDescription()

  public fun extendsFrom(): List<String> = unwrap(this).getExtendsFrom() ?: emptyList()

  public fun functions(): Any? = unwrap(this).getFunctions()

  public fun isSingleton(): Any? = unwrap(this).getIsSingleton()

  public fun propertyDefinitions(): Any? = unwrap(this).getPropertyDefinitions()

  public fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun workspaceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun componentTypeId(componentTypeId: String)

    public fun compositeComponentTypes(compositeComponentTypes: IResolvable)

    public fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>)

    public fun description(description: String)

    public fun extendsFrom(extendsFrom: List<String>)

    public fun extendsFrom(vararg extendsFrom: String)

    public fun functions(functions: IResolvable)

    public fun functions(functions: Map<String, Any>)

    public fun isSingleton(isSingleton: Boolean)

    public fun isSingleton(isSingleton: IResolvable)

    public fun propertyDefinitions(propertyDefinitions: IResolvable)

    public fun propertyDefinitions(propertyDefinitions: Map<String, Any>)

    public fun propertyGroups(propertyGroups: IResolvable)

    public fun propertyGroups(propertyGroups: Map<String, Any>)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps.builder()

    override fun componentTypeId(componentTypeId: String) {
      cdkBuilder.componentTypeId(componentTypeId)
    }

    override fun compositeComponentTypes(compositeComponentTypes: IResolvable) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes.let(IResolvable::unwrap))
    }

    override fun compositeComponentTypes(compositeComponentTypes: Map<String, Any>) {
      cdkBuilder.compositeComponentTypes(compositeComponentTypes)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun extendsFrom(extendsFrom: List<String>) {
      cdkBuilder.extendsFrom(extendsFrom)
    }

    override fun extendsFrom(vararg extendsFrom: String): Unit = extendsFrom(extendsFrom.toList())

    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable::unwrap))
    }

    override fun functions(functions: Map<String, Any>) {
      cdkBuilder.functions(functions)
    }

    override fun isSingleton(isSingleton: Boolean) {
      cdkBuilder.isSingleton(isSingleton)
    }

    override fun isSingleton(isSingleton: IResolvable) {
      cdkBuilder.isSingleton(isSingleton.let(IResolvable::unwrap))
    }

    override fun propertyDefinitions(propertyDefinitions: IResolvable) {
      cdkBuilder.propertyDefinitions(propertyDefinitions.let(IResolvable::unwrap))
    }

    override fun propertyDefinitions(propertyDefinitions: Map<String, Any>) {
      cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    override fun propertyGroups(propertyGroups: IResolvable) {
      cdkBuilder.propertyGroups(propertyGroups.let(IResolvable::unwrap))
    }

    override fun propertyGroups(propertyGroups: Map<String, Any>) {
      cdkBuilder.propertyGroups(propertyGroups)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps,
  ) : CdkObject(cdkObject), CfnComponentTypeProps {
    override fun componentTypeId(): String = unwrap(this).getComponentTypeId()

    override fun compositeComponentTypes(): Any? = unwrap(this).getCompositeComponentTypes()

    override fun description(): String? = unwrap(this).getDescription()

    override fun extendsFrom(): List<String> = unwrap(this).getExtendsFrom() ?: emptyList()

    override fun functions(): Any? = unwrap(this).getFunctions()

    override fun isSingleton(): Any? = unwrap(this).getIsSingleton()

    override fun propertyDefinitions(): Any? = unwrap(this).getPropertyDefinitions()

    override fun propertyGroups(): Any? = unwrap(this).getPropertyGroups()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun workspaceId(): String = unwrap(this).getWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComponentTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps):
        CfnComponentTypeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComponentTypeProps):
        software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iottwinmaker.CfnComponentTypeProps
  }
}
