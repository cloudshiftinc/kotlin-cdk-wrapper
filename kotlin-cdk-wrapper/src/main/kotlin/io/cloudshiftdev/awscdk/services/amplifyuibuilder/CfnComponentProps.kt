@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amplifyuibuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnComponentProps {
  public fun appId(): String? = unwrap(this).getAppId()

  public fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

  public fun children(): Any? = unwrap(this).getChildren()

  public fun collectionProperties(): Any? = unwrap(this).getCollectionProperties()

  public fun componentType(): String? = unwrap(this).getComponentType()

  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public fun events(): Any? = unwrap(this).getEvents()

  public fun name(): String? = unwrap(this).getName()

  public fun overrides(): Any? = unwrap(this).getOverrides()

  public fun properties(): Any? = unwrap(this).getProperties()

  public fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

  public fun sourceId(): String? = unwrap(this).getSourceId()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun variants(): Any? = unwrap(this).getVariants()

  @CdkDslMarker
  public interface Builder {
    public fun appId(appId: String)

    public fun bindingProperties(bindingProperties: IResolvable)

    public fun bindingProperties(bindingProperties: Map<String, Any>)

    public fun children(children: IResolvable)

    public fun children(children: List<Any>)

    public fun children(vararg children: Any)

    public fun collectionProperties(collectionProperties: IResolvable)

    public fun collectionProperties(collectionProperties: Map<String, Any>)

    public fun componentType(componentType: String)

    public fun environmentName(environmentName: String)

    public fun events(events: IResolvable)

    public fun events(events: Map<String, Any>)

    public fun name(name: String)

    public fun overrides(overrides: Any)

    public fun properties(properties: IResolvable)

    public fun properties(properties: Map<String, Any>)

    public fun schemaVersion(schemaVersion: String)

    public fun sourceId(sourceId: String)

    public fun tags(tags: Map<String, String>)

    public fun variants(variants: IResolvable)

    public fun variants(variants: List<Any>)

    public fun variants(vararg variants: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps.builder()

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun bindingProperties(bindingProperties: IResolvable) {
      cdkBuilder.bindingProperties(bindingProperties.let(IResolvable::unwrap))
    }

    override fun bindingProperties(bindingProperties: Map<String, Any>) {
      cdkBuilder.bindingProperties(bindingProperties)
    }

    override fun children(children: IResolvable) {
      cdkBuilder.children(children.let(IResolvable::unwrap))
    }

    override fun children(children: List<Any>) {
      cdkBuilder.children(children)
    }

    override fun children(vararg children: Any): Unit = children(children.toList())

    override fun collectionProperties(collectionProperties: IResolvable) {
      cdkBuilder.collectionProperties(collectionProperties.let(IResolvable::unwrap))
    }

    override fun collectionProperties(collectionProperties: Map<String, Any>) {
      cdkBuilder.collectionProperties(collectionProperties)
    }

    override fun componentType(componentType: String) {
      cdkBuilder.componentType(componentType)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun overrides(overrides: Any) {
      cdkBuilder.overrides(overrides)
    }

    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    override fun schemaVersion(schemaVersion: String) {
      cdkBuilder.schemaVersion(schemaVersion)
    }

    override fun sourceId(sourceId: String) {
      cdkBuilder.sourceId(sourceId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun variants(variants: IResolvable) {
      cdkBuilder.variants(variants.let(IResolvable::unwrap))
    }

    override fun variants(variants: List<Any>) {
      cdkBuilder.variants(variants)
    }

    override fun variants(vararg variants: Any): Unit = variants(variants.toList())

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps,
  ) : CdkObject(cdkObject), CfnComponentProps {
    override fun appId(): String? = unwrap(this).getAppId()

    override fun bindingProperties(): Any? = unwrap(this).getBindingProperties()

    override fun children(): Any? = unwrap(this).getChildren()

    override fun collectionProperties(): Any? = unwrap(this).getCollectionProperties()

    override fun componentType(): String? = unwrap(this).getComponentType()

    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    override fun events(): Any? = unwrap(this).getEvents()

    override fun name(): String? = unwrap(this).getName()

    override fun overrides(): Any? = unwrap(this).getOverrides()

    override fun properties(): Any? = unwrap(this).getProperties()

    override fun schemaVersion(): String? = unwrap(this).getSchemaVersion()

    override fun sourceId(): String? = unwrap(this).getSourceId()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun variants(): Any? = unwrap(this).getVariants()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps):
        CfnComponentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComponentProps):
        software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amplifyuibuilder.CfnComponentProps
  }
}
