package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnContactChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannel,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun channelAddress(): String = unwrap(this).getChannelAddress()

  public open fun channelAddress(`value`: String) {
    unwrap(this).setChannelAddress(`value`)
  }

  public open fun channelName(): String = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public open fun channelType(): String = unwrap(this).getChannelType()

  public open fun channelType(`value`: String) {
    unwrap(this).setChannelType(`value`)
  }

  public open fun contactId(): String = unwrap(this).getContactId()

  public open fun contactId(`value`: String) {
    unwrap(this).setContactId(`value`)
  }

  public open fun deferActivation(): Any? = unwrap(this).getDeferActivation()

  public open fun deferActivation(`value`: Boolean) {
    unwrap(this).setDeferActivation(`value`)
  }

  public open fun deferActivation(`value`: IResolvable) {
    unwrap(this).setDeferActivation(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun channelAddress(channelAddress: String)

    public fun channelName(channelName: String)

    public fun channelType(channelType: String)

    public fun contactId(contactId: String)

    public fun deferActivation(deferActivation: Boolean)

    public fun deferActivation(deferActivation: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnContactChannel.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannel.Builder.create(scope, id)

    override fun channelAddress(channelAddress: String) {
      cdkBuilder.channelAddress(channelAddress)
    }

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun channelType(channelType: String) {
      cdkBuilder.channelType(channelType)
    }

    override fun contactId(contactId: String) {
      cdkBuilder.contactId(contactId)
    }

    override fun deferActivation(deferActivation: Boolean) {
      cdkBuilder.deferActivation(deferActivation)
    }

    override fun deferActivation(deferActivation: IResolvable) {
      cdkBuilder.deferActivation(deferActivation.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContactChannel =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContactChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContactChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannel):
        CfnContactChannel = CfnContactChannel(cdkObject)

    internal fun unwrap(wrapped: CfnContactChannel):
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannel = wrapped.cdkObject
  }
}
