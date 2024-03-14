package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBSecurityGroupIngress internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cidrip(): String? = unwrap(this).getCidrip()

  public open fun cidrip(`value`: String) {
    unwrap(this).setCidrip(`value`)
  }

  public open fun dbSecurityGroupName(): String = unwrap(this).getDbSecurityGroupName()

  public open fun dbSecurityGroupName(`value`: String) {
    unwrap(this).setDbSecurityGroupName(`value`)
  }

  public open fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

  public open fun ec2SecurityGroupId(`value`: String) {
    unwrap(this).setEc2SecurityGroupId(`value`)
  }

  public open fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

  public open fun ec2SecurityGroupName(`value`: String) {
    unwrap(this).setEc2SecurityGroupName(`value`)
  }

  public open fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  public open fun ec2SecurityGroupOwnerId(`value`: String) {
    unwrap(this).setEc2SecurityGroupOwnerId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun cidrip(cidrip: String)

    public fun dbSecurityGroupName(dbSecurityGroupName: String)

    public fun ec2SecurityGroupId(ec2SecurityGroupId: String)

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress.Builder.create(scope, id)

    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    override fun dbSecurityGroupName(dbSecurityGroupName: String) {
      cdkBuilder.dbSecurityGroupName(dbSecurityGroupName)
    }

    override fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
      cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
    }

    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress):
        CfnDBSecurityGroupIngress = CfnDBSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroupIngress):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress = wrapped.cdkObject
  }
}
