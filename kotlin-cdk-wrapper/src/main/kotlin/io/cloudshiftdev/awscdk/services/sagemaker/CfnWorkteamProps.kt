@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWorkteamProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun memberDefinitions(): Any? = unwrap(this).getMemberDefinitions()

  public fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workforceName(): String? = unwrap(this).getWorkforceName()

  public fun workteamName(): String? = unwrap(this).getWorkteamName()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun memberDefinitions(memberDefinitions: IResolvable)

    public fun memberDefinitions(memberDefinitions: List<Any>)

    public fun memberDefinitions(vararg memberDefinitions: Any)

    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    public
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1cd934c3bbb5c01df7e69929c175810c0ac4c2cd6b97f60cb64913ab3b71070")
    public
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workforceName(workforceName: String)

    public fun workteamName(workteamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnWorkteamProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnWorkteamProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun memberDefinitions(memberDefinitions: IResolvable) {
      cdkBuilder.memberDefinitions(memberDefinitions.let(IResolvable::unwrap))
    }

    override fun memberDefinitions(memberDefinitions: List<Any>) {
      cdkBuilder.memberDefinitions(memberDefinitions)
    }

    override fun memberDefinitions(vararg memberDefinitions: Any): Unit =
        memberDefinitions(memberDefinitions.toList())

    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnWorkteam.NotificationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1cd934c3bbb5c01df7e69929c175810c0ac4c2cd6b97f60cb64913ab3b71070")
    override
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnWorkteam.NotificationConfigurationProperty(notificationConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workforceName(workforceName: String) {
      cdkBuilder.workforceName(workforceName)
    }

    override fun workteamName(workteamName: String) {
      cdkBuilder.workteamName(workteamName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnWorkteamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteamProps,
  ) : CdkObject(cdkObject), CfnWorkteamProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun memberDefinitions(): Any? = unwrap(this).getMemberDefinitions()

    override fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workforceName(): String? = unwrap(this).getWorkforceName()

    override fun workteamName(): String? = unwrap(this).getWorkteamName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkteamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteamProps):
        CfnWorkteamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkteamProps):
        software.amazon.awscdk.services.sagemaker.CfnWorkteamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
  }
}
