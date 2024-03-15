@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataProviderProps {
  public fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

  public fun dataProviderName(): String? = unwrap(this).getDataProviderName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun engine(): String

  public fun exactSettings(): Any? = unwrap(this).getExactSettings()

  public fun settings(): Any? = unwrap(this).getSettings()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dataProviderIdentifier(dataProviderIdentifier: String)

    public fun dataProviderName(dataProviderName: String)

    public fun description(description: String)

    public fun engine(engine: String)

    public fun exactSettings(exactSettings: Boolean)

    public fun exactSettings(exactSettings: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tings(settings: IResolvable)

    public fun tings(settings: CfnDataProvider.SettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b475e46ec9dab9f70be7a140914ccb0cd1bf64c0975e2d522e33f8d3266511")
    public fun tings(settings: CfnDataProvider.SettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnDataProviderProps.Builder =
        software.amazon.awscdk.services.dms.CfnDataProviderProps.builder()

    override fun dataProviderIdentifier(dataProviderIdentifier: String) {
      cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
    }

    override fun dataProviderName(dataProviderName: String) {
      cdkBuilder.dataProviderName(dataProviderName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun exactSettings(exactSettings: Boolean) {
      cdkBuilder.exactSettings(exactSettings)
    }

    override fun exactSettings(exactSettings: IResolvable) {
      cdkBuilder.exactSettings(exactSettings.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tings(settings: IResolvable) {
      cdkBuilder.settings(settings.let(IResolvable::unwrap))
    }

    override fun tings(settings: CfnDataProvider.SettingsProperty) {
      cdkBuilder.settings(settings.let(CfnDataProvider.SettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09b475e46ec9dab9f70be7a140914ccb0cd1bf64c0975e2d522e33f8d3266511")
    override fun tings(settings: CfnDataProvider.SettingsProperty.Builder.() -> Unit): Unit =
        tings(CfnDataProvider.SettingsProperty(settings))

    public fun build(): software.amazon.awscdk.services.dms.CfnDataProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnDataProviderProps,
  ) : CdkObject(cdkObject), CfnDataProviderProps {
    override fun dataProviderIdentifier(): String? = unwrap(this).getDataProviderIdentifier()

    override fun dataProviderName(): String? = unwrap(this).getDataProviderName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun engine(): String = unwrap(this).getEngine()

    override fun exactSettings(): Any? = unwrap(this).getExactSettings()

    override fun settings(): Any? = unwrap(this).getSettings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnDataProviderProps):
        CfnDataProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataProviderProps):
        software.amazon.awscdk.services.dms.CfnDataProviderProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dms.CfnDataProviderProps
  }
}
