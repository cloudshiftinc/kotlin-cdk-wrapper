@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IInterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SecretRotationProps {
  public fun application(): SecretRotationApplication

  public fun automaticallyAfter(): Duration? =
      unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

  public fun endpoint(): IInterfaceVpcEndpoint? =
      unwrap(this).getEndpoint()?.let(IInterfaceVpcEndpoint::wrap)

  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

  public fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

  public fun secret(): ISecret

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun target(): IConnectable

  public fun vpc(): IVpc

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun application(application: SecretRotationApplication)

    public fun automaticallyAfter(automaticallyAfter: Duration)

    public fun endpoint(endpoint: IInterfaceVpcEndpoint)

    public fun excludeCharacters(excludeCharacters: String)

    public fun masterSecret(masterSecret: ISecret)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    public fun secret(secret: ISecret)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun target(target: IConnectable)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08e6521951ebfb68ba16766c4654abe8eb935963f2e5e8eb407ccfd22f4c5f0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretRotationProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretRotationProps.builder()

    override fun application(application: SecretRotationApplication) {
      cdkBuilder.application(application.let(SecretRotationApplication::unwrap))
    }

    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    override fun endpoint(endpoint: IInterfaceVpcEndpoint) {
      cdkBuilder.endpoint(endpoint.let(IInterfaceVpcEndpoint::unwrap))
    }

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret::unwrap))
    }

    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun target(target: IConnectable) {
      cdkBuilder.target(target.let(IConnectable::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08e6521951ebfb68ba16766c4654abe8eb935963f2e5e8eb407ccfd22f4c5f0")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretRotationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationProps,
  ) : CdkObject(cdkObject), SecretRotationProps {
    override fun application(): SecretRotationApplication =
        unwrap(this).getApplication().let(SecretRotationApplication::wrap)

    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    override fun endpoint(): IInterfaceVpcEndpoint? =
        unwrap(this).getEndpoint()?.let(IInterfaceVpcEndpoint::wrap)

    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

    override fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun target(): IConnectable = unwrap(this).getTarget().let(IConnectable::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretRotationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationProps):
        SecretRotationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretRotationProps):
        software.amazon.awscdk.services.secretsmanager.SecretRotationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.SecretRotationProps
  }
}
