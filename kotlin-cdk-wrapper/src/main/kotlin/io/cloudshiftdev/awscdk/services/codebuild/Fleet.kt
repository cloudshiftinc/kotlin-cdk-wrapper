@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Fleet for a reserved capacity CodeBuild project.
 *
 * Fleets allow for process builds or tests to run immediately and reduces build durations,
 * by reserving compute resources for your projects.
 *
 * You will be charged for the resources in the fleet, even if they are idle.
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
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/fleets.html)
 */
public open class Fleet(
  cdkObject: software.amazon.awscdk.services.codebuild.Fleet,
) : Resource(cdkObject),
    IFleet {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FleetProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.Fleet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FleetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FleetProps.Builder.() -> Unit,
  ) : this(scope, id, FleetProps(props)
  )

  /**
   * The compute type of the fleet.
   *
   * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.ComputeType.html)
   */
  public override fun computeType(): FleetComputeType =
      unwrap(this).getComputeType().let(FleetComputeType::wrap)

  /**
   * The build environment (operating system/architecture/accelerator) type made available to
   * projects using this fleet.
   */
  public override fun environmentType(): EnvironmentType =
      unwrap(this).getEnvironmentType().let(EnvironmentType::wrap)

  /**
   * The ARN of the fleet.
   */
  public override fun fleetArn(): String = unwrap(this).getFleetArn()

  /**
   * The name of the fleet.
   */
  public override fun fleetName(): String = unwrap(this).getFleetName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.Fleet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of machines allocated to the compute ﬂeet. Deﬁnes the number of builds that can
     * run in parallel.
     *
     * Minimum value of 1.
     *
     * @param baseCapacity The number of machines allocated to the compute ﬂeet. Deﬁnes the number
     * of builds that can run in parallel. 
     */
    public fun baseCapacity(baseCapacity: Number)

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     *
     * Default: - do not specify compute configuration
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    public fun computeConfiguration(computeConfiguration: ComputeConfiguration)

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     *
     * Default: - do not specify compute configuration
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e19357beb2e4993eae29d1a908da630a03b91a5919240b8b6c5f2af3211142d")
    public fun computeConfiguration(computeConfiguration: ComputeConfiguration.Builder.() -> Unit)

    /**
     * The instance type of the compute fleet.
     *
     * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.ComputeType.html)
     * @param computeType The instance type of the compute fleet. 
     */
    public fun computeType(computeType: FleetComputeType)

    /**
     * The build environment (operating system/architecture/accelerator) type made available to
     * projects using this fleet.
     *
     * @param environmentType The build environment (operating system/architecture/accelerator) type
     * made available to projects using this fleet. 
     */
    public fun environmentType(environmentType: EnvironmentType)

    /**
     * The name of the Fleet.
     *
     * Default: - CloudFormation generated name
     *
     * @param fleetName The name of the Fleet. 
     */
    public fun fleetName(fleetName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.Fleet.Builder =
        software.amazon.awscdk.services.codebuild.Fleet.Builder.create(scope, id)

    /**
     * The number of machines allocated to the compute ﬂeet. Deﬁnes the number of builds that can
     * run in parallel.
     *
     * Minimum value of 1.
     *
     * @param baseCapacity The number of machines allocated to the compute ﬂeet. Deﬁnes the number
     * of builds that can run in parallel. 
     */
    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     *
     * Default: - do not specify compute configuration
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    override fun computeConfiguration(computeConfiguration: ComputeConfiguration) {
      cdkBuilder.computeConfiguration(computeConfiguration.let(ComputeConfiguration.Companion::unwrap))
    }

    /**
     * The compute configuration of the compute fleet.
     *
     * This is only required if `computeType` is set to ATTRIBUTE_BASED.
     *
     * Default: - do not specify compute configuration
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html#environment-reserved-capacity.types)
     * @param computeConfiguration The compute configuration of the compute fleet. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e19357beb2e4993eae29d1a908da630a03b91a5919240b8b6c5f2af3211142d")
    override
        fun computeConfiguration(computeConfiguration: ComputeConfiguration.Builder.() -> Unit):
        Unit = computeConfiguration(ComputeConfiguration(computeConfiguration))

    /**
     * The instance type of the compute fleet.
     *
     * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_codebuild.ComputeType.html)
     * @param computeType The instance type of the compute fleet. 
     */
    override fun computeType(computeType: FleetComputeType) {
      cdkBuilder.computeType(computeType.let(FleetComputeType.Companion::unwrap))
    }

    /**
     * The build environment (operating system/architecture/accelerator) type made available to
     * projects using this fleet.
     *
     * @param environmentType The build environment (operating system/architecture/accelerator) type
     * made available to projects using this fleet. 
     */
    override fun environmentType(environmentType: EnvironmentType) {
      cdkBuilder.environmentType(environmentType.let(EnvironmentType.Companion::unwrap))
    }

    /**
     * The name of the Fleet.
     *
     * Default: - CloudFormation generated name
     *
     * @param fleetName The name of the Fleet. 
     */
    override fun fleetName(fleetName: String) {
      cdkBuilder.fleetName(fleetName)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.Fleet = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.codebuild.Fleet.PROPERTY_INJECTION_ID

    public fun fromFleetArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fleetArn: String,
    ): IFleet =
        software.amazon.awscdk.services.codebuild.Fleet.fromFleetArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, fleetArn).let(IFleet::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Fleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Fleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.Fleet): Fleet =
        Fleet(cdkObject)

    internal fun unwrap(wrapped: Fleet): software.amazon.awscdk.services.codebuild.Fleet =
        wrapped.cdkObject as software.amazon.awscdk.services.codebuild.Fleet
  }
}
