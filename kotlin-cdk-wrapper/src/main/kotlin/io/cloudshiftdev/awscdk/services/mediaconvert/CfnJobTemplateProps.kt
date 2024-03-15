@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnJobTemplateProps {
  public fun accelerationSettings(): Any? = unwrap(this).getAccelerationSettings()

  public fun category(): String? = unwrap(this).getCategory()

  public fun description(): String? = unwrap(this).getDescription()

  public fun hopDestinations(): Any? = unwrap(this).getHopDestinations()

  public fun name(): String? = unwrap(this).getName()

  public fun priority(): Number? = unwrap(this).getPriority()

  public fun queue(): String? = unwrap(this).getQueue()

  public fun settingsJson(): Any

  public fun statusUpdateInterval(): String? = unwrap(this).getStatusUpdateInterval()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun accelerationSettings(accelerationSettings: IResolvable)

    public
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81f50cb740f06aac97b14b5fd72439bffb9b230d195ea991791ad6883ac3618")
    public
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty.Builder.() -> Unit)

    public fun category(category: String)

    public fun description(description: String)

    public fun hopDestinations(hopDestinations: IResolvable)

    public fun hopDestinations(hopDestinations: List<Any>)

    public fun hopDestinations(vararg hopDestinations: Any)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun queue(queue: String)

    public fun statusUpdateInterval(statusUpdateInterval: String)

    public fun tags(tags: Any)

    public fun tingsJson(settingsJson: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps.Builder
        = software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps.builder()

    override fun accelerationSettings(accelerationSettings: IResolvable) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(IResolvable::unwrap))
    }

    override
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(CfnJobTemplate.AccelerationSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81f50cb740f06aac97b14b5fd72439bffb9b230d195ea991791ad6883ac3618")
    override
        fun accelerationSettings(accelerationSettings: CfnJobTemplate.AccelerationSettingsProperty.Builder.() -> Unit):
        Unit =
        accelerationSettings(CfnJobTemplate.AccelerationSettingsProperty(accelerationSettings))

    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hopDestinations(hopDestinations: IResolvable) {
      cdkBuilder.hopDestinations(hopDestinations.let(IResolvable::unwrap))
    }

    override fun hopDestinations(hopDestinations: List<Any>) {
      cdkBuilder.hopDestinations(hopDestinations)
    }

    override fun hopDestinations(vararg hopDestinations: Any): Unit =
        hopDestinations(hopDestinations.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun queue(queue: String) {
      cdkBuilder.queue(queue)
    }

    override fun statusUpdateInterval(statusUpdateInterval: String) {
      cdkBuilder.statusUpdateInterval(statusUpdateInterval)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun tingsJson(settingsJson: Any) {
      cdkBuilder.settingsJson(settingsJson)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps,
  ) : CdkObject(cdkObject), CfnJobTemplateProps {
    override fun accelerationSettings(): Any? = unwrap(this).getAccelerationSettings()

    override fun category(): String? = unwrap(this).getCategory()

    override fun description(): String? = unwrap(this).getDescription()

    override fun hopDestinations(): Any? = unwrap(this).getHopDestinations()

    override fun name(): String? = unwrap(this).getName()

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun queue(): String? = unwrap(this).getQueue()

    override fun settingsJson(): Any = unwrap(this).getSettingsJson()

    override fun statusUpdateInterval(): String? = unwrap(this).getStatusUpdateInterval()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps):
        CfnJobTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobTemplateProps):
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps
  }
}
