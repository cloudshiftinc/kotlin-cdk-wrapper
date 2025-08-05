@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * The compute configuration for the fleet.
 *
 * Despite what the CloudFormation schema says, the numeric properties (disk, memory, vCpu) are not
 * optional.
 * An `undefined` value will cause the CloudFormation deployment to fail, e.g.
 *
 *
 * Cannot invoke "java.lang.Integer.intValue()" because the return value of
 * "software.amazon.codebuild.fleet.ComputeConfiguration.getMemory()" is null
 * Therefore, these properties default value is set to 0.
 *
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.Size;
 * Fleet fleet = Fleet.Builder.create(this, "MyFleet")
 * .baseCapacity(1)
 * .computeType(FleetComputeType.ATTRIBUTE_BASED)
 * .environmentType(EnvironmentType.LINUX_CONTAINER)
 * .computeConfiguration(ComputeConfiguration.builder()
 * .vCpu(2)
 * .memory(Size.gibibytes(4))
 * .disk(Size.gibibytes(10))
 * .machineType(MachineType.GENERAL)
 * .build())
 * .build();
 * ```
 */
public interface ComputeConfiguration {
  /**
   * The amount of disk space of the instance type included in your fleet.
   *
   * Default: - No requirement, the actual value will be based on the other selected configuration
   * properties
   */
  public fun disk(): Size? = unwrap(this).getDisk()?.let(Size::wrap)

  /**
   * The machine type of the instance type included in your fleet.
   *
   * Default: - No requirement, the actual value will be based on the other selected configuration
   * properties
   */
  public fun machineType(): MachineType? = unwrap(this).getMachineType()?.let(MachineType::wrap)

  /**
   * The amount of memory of the instance type included in your fleet.
   *
   * Default: - No requirement, the actual value will be based on the other selected configuration
   * properties
   */
  public fun memory(): Size? = unwrap(this).getMemory()?.let(Size::wrap)

  /**
   * The number of vCPUs of the instance type included in your fleet.
   *
   * Default: - No requirement, the actual value will be based on the other selected configuration
   * properties
   */
  public fun vCpu(): Number? = unwrap(this).getVCpu()

  /**
   * A builder for [ComputeConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param disk The amount of disk space of the instance type included in your fleet.
     */
    public fun disk(disk: Size)

    /**
     * @param machineType The machine type of the instance type included in your fleet.
     */
    public fun machineType(machineType: MachineType)

    /**
     * @param memory The amount of memory of the instance type included in your fleet.
     */
    public fun memory(memory: Size)

    /**
     * @param vCpu The number of vCPUs of the instance type included in your fleet.
     */
    public fun vCpu(vCpu: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.ComputeConfiguration.Builder =
        software.amazon.awscdk.services.codebuild.ComputeConfiguration.builder()

    /**
     * @param disk The amount of disk space of the instance type included in your fleet.
     */
    override fun disk(disk: Size) {
      cdkBuilder.disk(disk.let(Size.Companion::unwrap))
    }

    /**
     * @param machineType The machine type of the instance type included in your fleet.
     */
    override fun machineType(machineType: MachineType) {
      cdkBuilder.machineType(machineType.let(MachineType.Companion::unwrap))
    }

    /**
     * @param memory The amount of memory of the instance type included in your fleet.
     */
    override fun memory(memory: Size) {
      cdkBuilder.memory(memory.let(Size.Companion::unwrap))
    }

    /**
     * @param vCpu The number of vCPUs of the instance type included in your fleet.
     */
    override fun vCpu(vCpu: Number) {
      cdkBuilder.vCpu(vCpu)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.ComputeConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.ComputeConfiguration,
  ) : CdkObject(cdkObject),
      ComputeConfiguration {
    /**
     * The amount of disk space of the instance type included in your fleet.
     *
     * Default: - No requirement, the actual value will be based on the other selected configuration
     * properties
     */
    override fun disk(): Size? = unwrap(this).getDisk()?.let(Size::wrap)

    /**
     * The machine type of the instance type included in your fleet.
     *
     * Default: - No requirement, the actual value will be based on the other selected configuration
     * properties
     */
    override fun machineType(): MachineType? = unwrap(this).getMachineType()?.let(MachineType::wrap)

    /**
     * The amount of memory of the instance type included in your fleet.
     *
     * Default: - No requirement, the actual value will be based on the other selected configuration
     * properties
     */
    override fun memory(): Size? = unwrap(this).getMemory()?.let(Size::wrap)

    /**
     * The number of vCPUs of the instance type included in your fleet.
     *
     * Default: - No requirement, the actual value will be based on the other selected configuration
     * properties
     */
    override fun vCpu(): Number? = unwrap(this).getVCpu()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ComputeConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ComputeConfiguration):
        ComputeConfiguration = CdkObjectWrappers.wrap(cdkObject) as? ComputeConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ComputeConfiguration):
        software.amazon.awscdk.services.codebuild.ComputeConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.ComputeConfiguration
  }
}
