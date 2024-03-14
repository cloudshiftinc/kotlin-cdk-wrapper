package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStackFleetAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun fleetName(): String = unwrap(this).getFleetName()

  public open fun fleetName(`value`: String) {
    unwrap(this).setFleetName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun stackName(`value`: String) {
    unwrap(this).setStackName(`value`)
  }

  public interface Builder {
    public fun fleetName(fleetName: String)

    public fun stackName(stackName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation.Builder =
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation.Builder.create(scope, id)

    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackFleetAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStackFleetAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStackFleetAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackFleetAssociation):
        CfnStackFleetAssociation = CfnStackFleetAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnStackFleetAssociation):
        software.amazon.awscdk.services.appstream.CfnStackFleetAssociation = wrapped.cdkObject
  }
}
