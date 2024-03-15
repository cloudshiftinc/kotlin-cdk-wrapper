@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  public fun location(): Any

  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  @CdkDslMarker
  public interface Builder {
    public fun location(location: String)

    public fun location(location: IResolvable)

    public fun location(location: CfnApplication.ApplicationLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c62d18d357eda3e048804a1bc201023aa933ba84b88e1781a9b9c0a0b0c09")
    public fun location(location: CfnApplication.ApplicationLocationProperty.Builder.() -> Unit)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, String>)

    public fun tags(tags: Map<String, String>)

    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.sam.CfnApplicationProps.builder()

    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: CfnApplication.ApplicationLocationProperty) {
      cdkBuilder.location(location.let(CfnApplication.ApplicationLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("380c62d18d357eda3e048804a1bc201023aa933ba84b88e1781a9b9c0a0b0c09")
    override fun location(location: CfnApplication.ApplicationLocationProperty.Builder.() -> Unit):
        Unit = location(CfnApplication.ApplicationLocationProperty(location))

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnApplicationProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun location(): Any = unwrap(this).getLocation()

    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.sam.CfnApplicationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnApplicationProps
  }
}
