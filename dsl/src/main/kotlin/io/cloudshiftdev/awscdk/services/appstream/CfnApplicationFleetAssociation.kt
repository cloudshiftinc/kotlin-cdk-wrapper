package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationFleetAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationArn(): String = unwrap(this).getApplicationArn()

  public open fun applicationArn(`value`: String) {
    unwrap(this).setApplicationArn(`value`)
  }

  public open fun fleetName(): String = unwrap(this).getFleetName()

  public open fun fleetName(`value`: String) {
    unwrap(this).setFleetName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun applicationArn(applicationArn: String)

    public fun fleetName(fleetName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation.Builder.create(scope,
        id)

    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationFleetAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationFleetAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation):
        CfnApplicationFleetAssociation = CfnApplicationFleetAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationFleetAssociation):
        software.amazon.awscdk.services.appstream.CfnApplicationFleetAssociation = wrapped.cdkObject
  }
}
