package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface SubnetGroupProps {
  /**
   * Description of the subnet group.
   */
  public fun description(): String

  /**
   * The removal policy to apply when the subnet group are removed from the stack or replaced during
   * an update.
   *
   * Default: RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The name of the subnet group.
   *
   * Default: - a name is generated
   */
  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  /**
   * The VPC to place the subnet group in.
   */
  public fun vpc(): IVpc

  /**
   * Which subnets within the VPC to associate with this group.
   *
   * Default: - private subnets
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [SubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Description of the subnet group. 
     */
    public fun description(description: String)

    /**
     * @param removalPolicy The removal policy to apply when the subnet group are removed from the
     * stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param subnetGroupName The name of the subnet group.
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * @param vpc The VPC to place the subnet group in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets within the VPC to associate with this group.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets within the VPC to associate with this group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9ccc0bb2dcacd4b1fadbc1b629313b6304dc62ccc203f68f5d2dfee690a8720")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.SubnetGroupProps.Builder =
        software.amazon.awscdk.services.rds.SubnetGroupProps.builder()

    /**
     * @param description Description of the subnet group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param removalPolicy The removal policy to apply when the subnet group are removed from the
     * stack or replaced during an update.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param subnetGroupName The name of the subnet group.
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param vpc The VPC to place the subnet group in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets within the VPC to associate with this group.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets within the VPC to associate with this group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9ccc0bb2dcacd4b1fadbc1b629313b6304dc62ccc203f68f5d2dfee690a8720")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.SubnetGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.SubnetGroupProps,
  ) : CdkObject(cdkObject), SubnetGroupProps {
    /**
     * Description of the subnet group.
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The removal policy to apply when the subnet group are removed from the stack or replaced
     * during an update.
     *
     * Default: RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The name of the subnet group.
     *
     * Default: - a name is generated
     */
    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    /**
     * The VPC to place the subnet group in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Which subnets within the VPC to associate with this group.
     *
     * Default: - private subnets
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SubnetGroupProps):
        SubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetGroupProps):
        software.amazon.awscdk.services.rds.SubnetGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.SubnetGroupProps
  }
}
