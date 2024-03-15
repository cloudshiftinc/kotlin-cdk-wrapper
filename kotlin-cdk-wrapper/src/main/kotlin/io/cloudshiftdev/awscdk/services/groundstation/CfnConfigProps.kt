@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfigProps {
  public fun configData(): Any

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun configData(configData: IResolvable)

    public fun configData(configData: CfnConfig.ConfigDataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3aa406290fe9e03b6d375c472620e0af2bd3dcd2531c9dc5b24304c0018eea")
    public fun configData(configData: CfnConfig.ConfigDataProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.groundstation.CfnConfigProps.Builder =
        software.amazon.awscdk.services.groundstation.CfnConfigProps.builder()

    override fun configData(configData: IResolvable) {
      cdkBuilder.configData(configData.let(IResolvable::unwrap))
    }

    override fun configData(configData: CfnConfig.ConfigDataProperty) {
      cdkBuilder.configData(configData.let(CfnConfig.ConfigDataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3aa406290fe9e03b6d375c472620e0af2bd3dcd2531c9dc5b24304c0018eea")
    override fun configData(configData: CfnConfig.ConfigDataProperty.Builder.() -> Unit): Unit =
        configData(CfnConfig.ConfigDataProperty(configData))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.groundstation.CfnConfigProps,
  ) : CdkObject(cdkObject), CfnConfigProps {
    override fun configData(): Any = unwrap(this).getConfigData()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfigProps):
        CfnConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigProps):
        software.amazon.awscdk.services.groundstation.CfnConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.groundstation.CfnConfigProps
  }
}
