@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnStackProps {
  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  public fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  @CdkDslMarker
  public interface Builder {
    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: Map<String, String>)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateUrl(templateUrl: String)

    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnStackProps.Builder =
        software.amazon.awscdk.CfnStackProps.builder()

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

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.CfnStackProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnStackProps,
  ) : CdkObject(cdkObject), CfnStackProps {
    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun templateUrl(): String? = unwrap(this).getTemplateUrl()

    override fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnStackProps): CfnStackProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackProps): software.amazon.awscdk.CfnStackProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnStackProps
  }
}
