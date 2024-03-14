package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface NetworkAclProps {
  /**
   * The name of the NetworkAcl.
   *
   * Since the NetworkAcl resource doesn't support providing a physical name, the value provided
   * here will be recorded in the `Name` tag.
   *
   * Default: CDK generated name
   */
  public fun networkAclName(): String? = unwrap(this).getNetworkAclName()

  /**
   * Subnets in the given VPC to associate the ACL with.
   *
   * More subnets can always be added later by calling
   * `associateWithSubnets()`.
   *
   * Default: - No subnets associated
   */
  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * The VPC in which to create the NetworkACL.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [NetworkAclProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param networkAclName The name of the NetworkAcl.
     * Since the NetworkAcl resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag.
     */
    public fun networkAclName(networkAclName: String)

    /**
     * @param subnetSelection Subnets in the given VPC to associate the ACL with.
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection Subnets in the given VPC to associate the ACL with.
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eb2e633b623463e31e7a88e7ea7113354fa79ea564bb62440d54a7280447001")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param vpc The VPC in which to create the NetworkACL. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NetworkAclProps.Builder =
        software.amazon.awscdk.services.ec2.NetworkAclProps.builder()

    /**
     * @param networkAclName The name of the NetworkAcl.
     * Since the NetworkAcl resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag.
     */
    override fun networkAclName(networkAclName: String) {
      cdkBuilder.networkAclName(networkAclName)
    }

    /**
     * @param subnetSelection Subnets in the given VPC to associate the ACL with.
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection Subnets in the given VPC to associate the ACL with.
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eb2e633b623463e31e7a88e7ea7113354fa79ea564bb62440d54a7280447001")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param vpc The VPC in which to create the NetworkACL. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NetworkAclProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.NetworkAclProps,
  ) : CdkObject(cdkObject), NetworkAclProps {
    /**
     * The name of the NetworkAcl.
     *
     * Since the NetworkAcl resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag.
     *
     * Default: CDK generated name
     */
    override fun networkAclName(): String? = unwrap(this).getNetworkAclName()

    /**
     * Subnets in the given VPC to associate the ACL with.
     *
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     *
     * Default: - No subnets associated
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * The VPC in which to create the NetworkACL.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkAclProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NetworkAclProps):
        NetworkAclProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkAclProps):
        software.amazon.awscdk.services.ec2.NetworkAclProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.NetworkAclProps
  }
}
