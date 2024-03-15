@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnQuickConnectProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceArn(): String

  public fun name(): String

  public fun quickConnectConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun quickConnectConfig(quickConnectConfig: IResolvable)

    public fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0244a371830d2bd8f6d68fd50cc5b98de8ba73b16b3cf604de906c4e52087d91")
    public
        fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQuickConnectProps.Builder =
        software.amazon.awscdk.services.connect.CfnQuickConnectProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun quickConnectConfig(quickConnectConfig: IResolvable) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(IResolvable::unwrap))
    }

    override
        fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(CfnQuickConnect.QuickConnectConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0244a371830d2bd8f6d68fd50cc5b98de8ba73b16b3cf604de906c4e52087d91")
    override
        fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty.Builder.() -> Unit):
        Unit = quickConnectConfig(CfnQuickConnect.QuickConnectConfigProperty(quickConnectConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQuickConnectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnectProps,
  ) : CdkObject(cdkObject), CfnQuickConnectProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun name(): String = unwrap(this).getName()

    override fun quickConnectConfig(): Any = unwrap(this).getQuickConnectConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQuickConnectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnectProps):
        CfnQuickConnectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQuickConnectProps):
        software.amazon.awscdk.services.connect.CfnQuickConnectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnQuickConnectProps
  }
}
