@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMultiplexProps {
  public fun availabilityZones(): List<String>

  public fun destinations(): Any? = unwrap(this).getDestinations()

  public fun multiplexSettings(): Any

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun multiplexSettings(multiplexSettings: IResolvable)

    public fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ad23f995956dc7a5262c76ffaca7cfa3a03a3dee7e17e7697ed70942ba63fd")
    public
        fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnMultiplexProps.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplexProps.builder()

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    override fun multiplexSettings(multiplexSettings: IResolvable) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(IResolvable::unwrap))
    }

    override fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(CfnMultiplex.MultiplexSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ad23f995956dc7a5262c76ffaca7cfa3a03a3dee7e17e7697ed70942ba63fd")
    override
        fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty.Builder.() -> Unit):
        Unit = multiplexSettings(CfnMultiplex.MultiplexSettingsProperty(multiplexSettings))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexProps,
  ) : CdkObject(cdkObject), CfnMultiplexProps {
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    override fun destinations(): Any? = unwrap(this).getDestinations()

    override fun multiplexSettings(): Any = unwrap(this).getMultiplexSettings()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMultiplexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexProps):
        CfnMultiplexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiplexProps):
        software.amazon.awscdk.services.medialive.CfnMultiplexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnMultiplexProps
  }
}
