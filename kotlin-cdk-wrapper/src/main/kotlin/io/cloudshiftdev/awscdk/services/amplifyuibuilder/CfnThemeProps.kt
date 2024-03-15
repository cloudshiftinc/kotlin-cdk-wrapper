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

public interface CfnThemeProps {
  public fun appId(): String? = unwrap(this).getAppId()

  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public fun name(): String? = unwrap(this).getName()

  public fun overrides(): Any? = unwrap(this).getOverrides()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun values(): Any? = unwrap(this).getValues()

  @CdkDslMarker
  public interface Builder {
    public fun appId(appId: String)

    public fun environmentName(environmentName: String)

    public fun name(name: String)

    public fun overrides(overrides: IResolvable)

    public fun overrides(overrides: List<Any>)

    public fun overrides(vararg overrides: Any)

    public fun tags(tags: Map<String, String>)

    public fun values(values: IResolvable)

    public fun values(values: List<Any>)

    public fun values(vararg values: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps.Builder =
        software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps.builder()

    override fun appId(appId: String) {
      cdkBuilder.appId(appId)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun overrides(overrides: IResolvable) {
      cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
    }

    override fun overrides(overrides: List<Any>) {
      cdkBuilder.overrides(overrides)
    }

    override fun overrides(vararg overrides: Any): Unit = overrides(overrides.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    override fun values(values: List<Any>) {
      cdkBuilder.values(values)
    }

    override fun values(vararg values: Any): Unit = values(values.toList())

    public fun build(): software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps,
  ) : CdkObject(cdkObject), CfnThemeProps {
    override fun appId(): String? = unwrap(this).getAppId()

    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    override fun name(): String? = unwrap(this).getName()

    override fun overrides(): Any? = unwrap(this).getOverrides()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun values(): Any? = unwrap(this).getValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThemeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps):
        CfnThemeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThemeProps):
        software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amplifyuibuilder.CfnThemeProps
  }
}
