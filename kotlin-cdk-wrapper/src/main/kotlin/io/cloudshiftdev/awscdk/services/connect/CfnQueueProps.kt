@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnQueueProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun hoursOfOperationArn(): String

  public fun instanceArn(): String

  public fun maxContacts(): Number? = unwrap(this).getMaxContacts()

  public fun name(): String

  public fun outboundCallerConfig(): Any? = unwrap(this).getOutboundCallerConfig()

  public fun quickConnectArns(): List<String> = unwrap(this).getQuickConnectArns() ?: emptyList()

  public fun status(): String? = unwrap(this).getStatus()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun hoursOfOperationArn(hoursOfOperationArn: String)

    public fun instanceArn(instanceArn: String)

    public fun maxContacts(maxContacts: Number)

    public fun name(name: String)

    public fun outboundCallerConfig(outboundCallerConfig: IResolvable)

    public fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16880054666c2efa682ec1fe91fbb9db3ee063e4717a75239d9deb55b1db742a")
    public
        fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty.Builder.() -> Unit)

    public fun quickConnectArns(quickConnectArns: List<String>)

    public fun quickConnectArns(vararg quickConnectArns: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQueueProps.Builder =
        software.amazon.awscdk.services.connect.CfnQueueProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hoursOfOperationArn(hoursOfOperationArn: String) {
      cdkBuilder.hoursOfOperationArn(hoursOfOperationArn)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun maxContacts(maxContacts: Number) {
      cdkBuilder.maxContacts(maxContacts)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outboundCallerConfig(outboundCallerConfig: IResolvable) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(IResolvable::unwrap))
    }

    override fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty) {
      cdkBuilder.outboundCallerConfig(outboundCallerConfig.let(CfnQueue.OutboundCallerConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16880054666c2efa682ec1fe91fbb9db3ee063e4717a75239d9deb55b1db742a")
    override
        fun outboundCallerConfig(outboundCallerConfig: CfnQueue.OutboundCallerConfigProperty.Builder.() -> Unit):
        Unit = outboundCallerConfig(CfnQueue.OutboundCallerConfigProperty(outboundCallerConfig))

    override fun quickConnectArns(quickConnectArns: List<String>) {
      cdkBuilder.quickConnectArns(quickConnectArns)
    }

    override fun quickConnectArns(vararg quickConnectArns: String): Unit =
        quickConnectArns(quickConnectArns.toList())

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnQueueProps,
  ) : CdkObject(cdkObject), CfnQueueProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun hoursOfOperationArn(): String = unwrap(this).getHoursOfOperationArn()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun maxContacts(): Number? = unwrap(this).getMaxContacts()

    override fun name(): String = unwrap(this).getName()

    override fun outboundCallerConfig(): Any? = unwrap(this).getOutboundCallerConfig()

    override fun quickConnectArns(): List<String> = unwrap(this).getQuickConnectArns() ?:
        emptyList()

    override fun status(): String? = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQueueProps):
        CfnQueueProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueProps):
        software.amazon.awscdk.services.connect.CfnQueueProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnQueueProps
  }
}
