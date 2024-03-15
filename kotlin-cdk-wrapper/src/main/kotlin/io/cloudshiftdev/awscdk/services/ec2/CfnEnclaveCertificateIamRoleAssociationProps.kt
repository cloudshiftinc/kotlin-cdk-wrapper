@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnEnclaveCertificateIamRoleAssociationProps {
  public fun certificateArn(): String

  public fun roleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun certificateArn(certificateArn: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps.builder()

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps,
  ) : CdkObject(cdkObject), CfnEnclaveCertificateIamRoleAssociationProps {
    override fun certificateArn(): String = unwrap(this).getCertificateArn()

    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnEnclaveCertificateIamRoleAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps):
        CfnEnclaveCertificateIamRoleAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnclaveCertificateIamRoleAssociationProps):
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps
  }
}
