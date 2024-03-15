@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClusterSecurityGroupIngress internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cidrip(): String? = unwrap(this).getCidrip()

  public open fun cidrip(`value`: String) {
    unwrap(this).setCidrip(`value`)
  }

  public open fun clusterSecurityGroupName(): String = unwrap(this).getClusterSecurityGroupName()

  public open fun clusterSecurityGroupName(`value`: String) {
    unwrap(this).setClusterSecurityGroupName(`value`)
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

  @CdkDslMarker
  public interface Builder {
    public fun cidrip(cidrip: String)

    public fun clusterSecurityGroupName(clusterSecurityGroupName: String)

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress.Builder.create(scope,
        id)

    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    override fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
      cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
    }

    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress):
        CfnClusterSecurityGroupIngress = CfnClusterSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSecurityGroupIngress):
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress = wrapped.cdkObject
  }
}
