@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnThingPrincipalAttachmentProps {
  public fun principal(): String

  public fun thingName(): String

  @CdkDslMarker
  public interface Builder {
    public fun principal(principal: String)

    public fun thingName(thingName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder =
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.builder()

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps,
  ) : CdkObject(cdkObject), CfnThingPrincipalAttachmentProps {
    override fun principal(): String = unwrap(this).getPrincipal()

    override fun thingName(): String = unwrap(this).getThingName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThingPrincipalAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps):
        CfnThingPrincipalAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThingPrincipalAttachmentProps):
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
  }
}
