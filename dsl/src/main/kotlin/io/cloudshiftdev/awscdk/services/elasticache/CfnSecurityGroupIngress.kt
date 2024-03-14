package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityGroupIngress internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cacheSecurityGroupName(): String = unwrap(this).getCacheSecurityGroupName()

  public open fun cacheSecurityGroupName(`value`: String) {
    unwrap(this).setCacheSecurityGroupName(`value`)
  }

  public open fun ec2SecurityGroupName(): String = unwrap(this).getEc2SecurityGroupName()

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
    public fun cacheSecurityGroupName(cacheSecurityGroupName: String)

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress.Builder.create(scope,
        id)

    override fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
      cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
    }

    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress):
        CfnSecurityGroupIngress = CfnSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngress):
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress = wrapped.cdkObject
  }
}
