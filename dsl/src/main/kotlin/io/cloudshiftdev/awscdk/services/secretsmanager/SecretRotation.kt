package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IInterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SecretRotation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotation,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public interface Builder {
    public fun application(application: SecretRotationApplication) {
    }

    public fun automaticallyAfter(automaticallyAfter: Duration) {
    }

    public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
    }

    public fun excludeCharacters(excludeCharacters: String) {
    }

    public fun masterSecret(masterSecret: ISecret) {
    }

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
    }

    public fun secret(secret: ISecret) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun target(target: IConnectable) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("136a5ed61cdfb22b58b54793b40c1245b6ae240baad9a465918841ea64c85530")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.SecretRotation.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretRotation.Builder.create(scope, id)

    public override fun application(application: SecretRotationApplication) {
      cdkBuilder.application(application.let(SecretRotationApplication::unwrap))
    }

    public override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    public override fun endpoint(endpoint: IInterfaceVpcEndpoint) {
      cdkBuilder.endpoint(endpoint.let(IInterfaceVpcEndpoint::unwrap))
    }

    public override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret::unwrap))
    }

    public override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    public override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun target(target: IConnectable) {
      cdkBuilder.target(target.let(IConnectable::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("136a5ed61cdfb22b58b54793b40c1245b6ae240baad9a465918841ea64c85530")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretRotation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SecretRotation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SecretRotation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotation):
        SecretRotation = SecretRotation(cdkObject)

    internal fun unwrap(wrapped: SecretRotation):
        software.amazon.awscdk.services.secretsmanager.SecretRotation = wrapped.cdkObject
  }
}
