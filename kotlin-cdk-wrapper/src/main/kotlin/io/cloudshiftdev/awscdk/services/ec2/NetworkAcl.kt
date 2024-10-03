@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new custom network ACL.
 *
 * By default, will deny all inbound and outbound traffic unless entries are
 * added explicitly allowing it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * NetworkAcl networkAcl = NetworkAcl.Builder.create(this, "MyNetworkAcl")
 * .vpc(vpc)
 * // the properties below are optional
 * .networkAclName("networkAclName")
 * .subnetSelection(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
public open class NetworkAcl(
  cdkObject: software.amazon.awscdk.services.ec2.NetworkAcl,
) : Resource(cdkObject),
    INetworkAcl {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkAclProps,
  ) :
      this(software.amazon.awscdk.services.ec2.NetworkAcl(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(NetworkAclProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NetworkAclProps.Builder.() -> Unit,
  ) : this(scope, id, NetworkAclProps(props)
  )

  /**
   * Add a new entry to the ACL.
   *
   * @param id 
   * @param options 
   */
  public override fun addEntry(id: String, options: CommonNetworkAclEntryOptions): NetworkAclEntry =
      unwrap(this).addEntry(id,
      options.let(CommonNetworkAclEntryOptions.Companion::unwrap)).let(NetworkAclEntry::wrap)

  /**
   * Add a new entry to the ACL.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
  public override fun addEntry(id: String,
      options: CommonNetworkAclEntryOptions.Builder.() -> Unit): NetworkAclEntry = addEntry(id,
      CommonNetworkAclEntryOptions(options))

  /**
   * Associate the ACL with a given set of subnets.
   *
   * @param id 
   * @param selection 
   */
  public open fun associateWithSubnet(id: String, selection: SubnetSelection) {
    unwrap(this).associateWithSubnet(id, selection.let(SubnetSelection.Companion::unwrap))
  }

  /**
   * Associate the ACL with a given set of subnets.
   *
   * @param id 
   * @param selection 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95778a2bcdf528def03cc5a57de958b58ac082ab5d7c7db85370a29a716de73e")
  public open fun associateWithSubnet(id: String, selection: SubnetSelection.Builder.() -> Unit):
      Unit = associateWithSubnet(id, SubnetSelection(selection))

  /**
   * The ID of the NetworkACL.
   */
  public override fun networkAclId(): String = unwrap(this).getNetworkAclId()

  /**
   * The VPC ID for this NetworkACL.
   */
  public open fun networkAclVpcId(): String = unwrap(this).getNetworkAclVpcId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.NetworkAcl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the NetworkAcl.
     *
     * Since the NetworkAcl resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag.
     *
     * Default: CDK generated name
     *
     * @param networkAclName The name of the NetworkAcl. 
     */
    public fun networkAclName(networkAclName: String)

    /**
     * Subnets in the given VPC to associate the ACL with.
     *
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     *
     * Default: - No subnets associated
     *
     * @param subnetSelection Subnets in the given VPC to associate the ACL with. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * Subnets in the given VPC to associate the ACL with.
     *
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     *
     * Default: - No subnets associated
     *
     * @param subnetSelection Subnets in the given VPC to associate the ACL with. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("affa603912ddd5a21e35e10d48f164a621395d13f19b3892d23cd279360d51b5")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * The VPC in which to create the NetworkACL.
     *
     * @param vpc The VPC in which to create the NetworkACL. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NetworkAcl.Builder =
        software.amazon.awscdk.services.ec2.NetworkAcl.Builder.create(scope, id)

    /**
     * The name of the NetworkAcl.
     *
     * Since the NetworkAcl resource doesn't support providing a physical name, the value provided
     * here will be recorded in the `Name` tag.
     *
     * Default: CDK generated name
     *
     * @param networkAclName The name of the NetworkAcl. 
     */
    override fun networkAclName(networkAclName: String) {
      cdkBuilder.networkAclName(networkAclName)
    }

    /**
     * Subnets in the given VPC to associate the ACL with.
     *
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     *
     * Default: - No subnets associated
     *
     * @param subnetSelection Subnets in the given VPC to associate the ACL with. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Subnets in the given VPC to associate the ACL with.
     *
     * More subnets can always be added later by calling
     * `associateWithSubnets()`.
     *
     * Default: - No subnets associated
     *
     * @param subnetSelection Subnets in the given VPC to associate the ACL with. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("affa603912ddd5a21e35e10d48f164a621395d13f19b3892d23cd279360d51b5")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * The VPC in which to create the NetworkACL.
     *
     * @param vpc The VPC in which to create the NetworkACL. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NetworkAcl = cdkBuilder.build()
  }

  public companion object {
    public fun fromNetworkAclId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      networkAclId: String,
    ): INetworkAcl =
        software.amazon.awscdk.services.ec2.NetworkAcl.fromNetworkAclId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, networkAclId).let(INetworkAcl::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkAcl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkAcl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NetworkAcl): NetworkAcl =
        NetworkAcl(cdkObject)

    internal fun unwrap(wrapped: NetworkAcl): software.amazon.awscdk.services.ec2.NetworkAcl =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.NetworkAcl
  }
}
