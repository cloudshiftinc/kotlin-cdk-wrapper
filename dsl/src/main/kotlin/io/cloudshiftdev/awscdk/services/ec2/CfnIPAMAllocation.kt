package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPAMAllocation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMAllocation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrIpamPoolAllocationId(): String = unwrap(this).getAttrIpamPoolAllocationId()

  public open fun cidr(): String? = unwrap(this).getCidr()

  public open fun cidr(`value`: String) {
    unwrap(this).setCidr(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipamPoolId(): String = unwrap(this).getIpamPoolId()

  public open fun ipamPoolId(`value`: String) {
    unwrap(this).setIpamPoolId(`value`)
  }

  public open fun netmaskLength(): Number? = unwrap(this).getNetmaskLength()

  public open fun netmaskLength(`value`: Number) {
    unwrap(this).setNetmaskLength(`value`)
  }

  public interface Builder {
    public fun cidr(cidr: String)

    public fun description(description: String)

    public fun ipamPoolId(ipamPoolId: String)

    public fun netmaskLength(netmaskLength: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMAllocation.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMAllocation.Builder.create(scope, id)

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ipamPoolId(ipamPoolId: String) {
      cdkBuilder.ipamPoolId(ipamPoolId)
    }

    override fun netmaskLength(netmaskLength: Number) {
      cdkBuilder.netmaskLength(netmaskLength)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMAllocation = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPAMAllocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPAMAllocation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMAllocation):
        CfnIPAMAllocation = CfnIPAMAllocation(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMAllocation):
        software.amazon.awscdk.services.ec2.CfnIPAMAllocation = wrapped.cdkObject
  }
}
