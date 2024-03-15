@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnExtensionProps {
  public fun actions(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public fun name(): String

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: Any)

    public fun description(description: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun name(name: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, Any>)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnExtensionProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnExtensionProps.builder()

    override fun actions(actions: Any) {
      cdkBuilder.actions(actions)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnExtensionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionProps,
  ) : CdkObject(cdkObject), CfnExtensionProps {
    override fun actions(): Any = unwrap(this).getActions()

    override fun description(): String? = unwrap(this).getDescription()

    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    override fun name(): String = unwrap(this).getName()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExtensionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionProps):
        CfnExtensionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExtensionProps):
        software.amazon.awscdk.services.appconfig.CfnExtensionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.CfnExtensionProps
  }
}
