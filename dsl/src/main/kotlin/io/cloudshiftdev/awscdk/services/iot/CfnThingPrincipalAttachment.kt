package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnThingPrincipalAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun principal(): String = unwrap(this).getPrincipal()

  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  public open fun thingName(): String = unwrap(this).getThingName()

  public open fun thingName(`value`: String) {
    unwrap(this).setThingName(`value`)
  }

  public interface Builder {
    public fun principal(principal: String)

    public fun thingName(thingName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.Builder
        = software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.Builder.create(scope, id)

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnThingPrincipalAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnThingPrincipalAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment):
        CfnThingPrincipalAttachment = CfnThingPrincipalAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnThingPrincipalAttachment):
        software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment = wrapped.cdkObject
  }
}
