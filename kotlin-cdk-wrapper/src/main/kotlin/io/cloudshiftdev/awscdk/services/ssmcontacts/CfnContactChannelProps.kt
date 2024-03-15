@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnContactChannelProps {
  public fun channelAddress(): String

  public fun channelName(): String

  public fun channelType(): String

  public fun contactId(): String

  public fun deferActivation(): Any? = unwrap(this).getDeferActivation()

  @CdkDslMarker
  public interface Builder {
    public fun channelAddress(channelAddress: String)

    public fun channelName(channelName: String)

    public fun channelType(channelType: String)

    public fun contactId(contactId: String)

    public fun deferActivation(deferActivation: Boolean)

    public fun deferActivation(deferActivation: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps,
  ) : CdkObject(cdkObject), CfnContactChannelProps {
    override fun channelAddress(): String = unwrap(this).getChannelAddress()

    override fun channelName(): String = unwrap(this).getChannelName()

    override fun channelType(): String = unwrap(this).getChannelType()

    override fun contactId(): String = unwrap(this).getContactId()

    override fun deferActivation(): Any? = unwrap(this).getDeferActivation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps):
        CfnContactChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactChannelProps):
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps
  }
}
