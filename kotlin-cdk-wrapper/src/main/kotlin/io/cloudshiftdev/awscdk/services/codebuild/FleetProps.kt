@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Construction properties of a CodeBuild [Fleet].
 *
 * Example:
 *
 * ```
 * Fleet fleet = Fleet.Builder.create(this, "Fleet")
 * .computeType(FleetComputeType.MEDIUM)
 * .environmentType(EnvironmentType.LINUX_CONTAINER)
 * .baseCapacity(1)
 * .build();
 * Project.Builder.create(this, "Project")
 * .environment(BuildEnvironment.builder()
 * .fleet(fleet)
 * .buildImage(LinuxBuildImage.STANDARD_7_0)
 * .build())
 * .build();
 * ```
 */
public interface FleetProps {
  /**
   * The number of machines allocated to the compute ﬂeet. Deﬁnes the number of builds that can run
   * in parallel.
   *
   * Minimum value of 1.
   */
  public fun baseCapacity(): Number

  /**
   * The compute configuration of the compute fleet.
   *
   * This is only required if `computeType` is set to ATTRIBUTE_BASED.
   *
   * Default: - do not specify compute configuration
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
   */
  public fun computeConfiguration(): ComputeConfiguration? =
      unwrap(this).getComputeConfiguration()?.let(ComputeConfiguration::wrap)

  /**
   * The instance type of the compute fleet.
   *
   * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.ComputeType.html)
   */
  public fun computeType(): FleetComputeType

  /**
   * The build environment (operating system/architecture/accelerator) type made available to
   * projects using this fleet.
   */
  public fun environmentType(): EnvironmentType

  /**
   * The name of the Fleet.
   *
   * Default: - CloudFormation generated name
   */
  public fun fleetName(): String? = unwrap(this).getFleetName()

  /**
   * A builder for [FleetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param baseCapacity The number of machines allocated to the compute ﬂeet. Deﬁnes the number
     * of builds that can run in parallel. 
     * Minimum value of 1.
     */
    public fun baseCapacity(baseCapacity: Number)

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     */
    public fun computeConfiguration(computeConfiguration: ComputeConfiguration)

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bd09276c80fca6ebda717a1aadcc0c0d64a62acf3e5cb9375a6cb2c9fe532a6")
    public fun computeConfiguration(computeConfiguration: ComputeConfiguration.Builder.() -> Unit)

    /**
     * @param computeType The instance type of the compute fleet. 
     */
    public fun computeType(computeType: FleetComputeType)

    /**
     * @param environmentType The build environment (operating system/architecture/accelerator) type
     * made available to projects using this fleet. 
     */
    public fun environmentType(environmentType: EnvironmentType)

    /**
     * @param fleetName The name of the Fleet.
     */
    public fun fleetName(fleetName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.FleetProps.Builder =
        software.amazon.awscdk.services.codebuild.FleetProps.builder()

    /**
     * @param baseCapacity The number of machines allocated to the compute ﬂeet. Deﬁnes the number
     * of builds that can run in parallel. 
     * Minimum value of 1.
     */
    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     */
    override fun computeConfiguration(computeConfiguration: ComputeConfiguration) {
      cdkBuilder.computeConfiguration(computeConfiguration.let(ComputeConfiguration.Companion::unwrap))
    }

    /**
     * @param computeConfiguration The compute configuration of the compute fleet.
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bd09276c80fca6ebda717a1aadcc0c0d64a62acf3e5cb9375a6cb2c9fe532a6")
    override
        fun computeConfiguration(computeConfiguration: ComputeConfiguration.Builder.() -> Unit):
        Unit = computeConfiguration(ComputeConfiguration(computeConfiguration))

    /**
     * @param computeType The instance type of the compute fleet. 
     */
    override fun computeType(computeType: FleetComputeType) {
      cdkBuilder.computeType(computeType.let(FleetComputeType.Companion::unwrap))
    }

    /**
     * @param environmentType The build environment (operating system/architecture/accelerator) type
     * made available to projects using this fleet. 
     */
    override fun environmentType(environmentType: EnvironmentType) {
      cdkBuilder.environmentType(environmentType.let(EnvironmentType.Companion::unwrap))
    }

    /**
     * @param fleetName The name of the Fleet.
     */
    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.FleetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.FleetProps,
  ) : CdkObject(cdkObject),
      FleetProps {
    /**
     * The number of machines allocated to the compute ﬂeet. Deﬁnes the number of builds that can
     * run in parallel.
     *
     * Minimum value of 1.
     */
    override fun baseCapacity(): Number = unwrap(this).getBaseCapacity()

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     *
     * Default: - do not specify compute configuration
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
     */
    override fun computeConfiguration(): ComputeConfiguration? =
        unwrap(this).getComputeConfiguration()?.let(ComputeConfiguration::wrap)

    /**
     * The instance type of the compute fleet.
     *
     * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.ComputeType.html)
     */
    override fun computeType(): FleetComputeType =
        unwrap(this).getComputeType().let(FleetComputeType::wrap)

    /**
     * The build environment (operating system/architecture/accelerator) type made available to
     * projects using this fleet.
     */
    override fun environmentType(): EnvironmentType =
        unwrap(this).getEnvironmentType().let(EnvironmentType::wrap)

    /**
     * The name of the Fleet.
     *
     * Default: - CloudFormation generated name
     */
    override fun fleetName(): String? = unwrap(this).getFleetName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.FleetProps): FleetProps =
        CdkObjectWrappers.wrap(cdkObject) as? FleetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FleetProps): software.amazon.awscdk.services.codebuild.FleetProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.FleetProps
  }
}
