@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Specifies the VPC that you want your Amazon SageMaker training job to connect to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * VpcConfig vpcConfig = VpcConfig.builder()
 * .vpc(vpc)
 * // the properties below are optional
 * .subnets(SubnetSelection.builder()
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
public interface VpcConfig {
  /**
   * VPC subnets.
   *
   * Default: - Private Subnets are selected
   */
  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  /**
   * VPC.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [VpcConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param subnets VPC subnets.
     */
    public fun subnets(subnets: SubnetSelection)

    /**
     * @param subnets VPC subnets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e50d9188ae71a4d38fd04c5df66494a22082ef9c80cc1796c4342205bc1bbcb9")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    /**
     * @param vpc VPC. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig.builder()

    /**
     * @param subnets VPC subnets.
     */
    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnets VPC subnets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e50d9188ae71a4d38fd04c5df66494a22082ef9c80cc1796c4342205bc1bbcb9")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    /**
     * @param vpc VPC. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig,
  ) : CdkObject(cdkObject), VpcConfig {
    /**
     * VPC subnets.
     *
     * Default: - Private Subnets are selected
     */
    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    /**
     * VPC.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig):
        VpcConfig = CdkObjectWrappers.wrap(cdkObject) as? VpcConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcConfig):
        software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig
  }
}
