package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SubnetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.SubnetGroup,
) : Resource(cdkObject), ISubnetGroup {
  public override fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

  public interface Builder {
    public fun description(description: String) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun subnetGroupName(subnetGroupName: String) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc43ba71fcd5d7da42950c84c82c8e9a17faeac7b43457e594c395c8ef038fd9")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.SubnetGroup.Builder =
        software.amazon.awscdk.services.rds.SubnetGroup.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc43ba71fcd5d7da42950c84c82c8e9a17faeac7b43457e594c395c8ef038fd9")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.SubnetGroup = cdkBuilder.build()
  }

  public companion object {
    public open fun fromSubnetGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      subnetGroupName: String,
    ): ISubnetGroup =
        software.amazon.awscdk.services.rds.SubnetGroup.fromSubnetGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, subnetGroupName).let(ISubnetGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SubnetGroup): SubnetGroup =
        SubnetGroup(cdkObject)

    internal fun unwrap(wrapped: SubnetGroup): software.amazon.awscdk.services.rds.SubnetGroup =
        wrapped.cdkObject
  }
}
