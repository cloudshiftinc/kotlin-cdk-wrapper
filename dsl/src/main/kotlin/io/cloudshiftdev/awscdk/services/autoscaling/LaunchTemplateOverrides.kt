package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LaunchTemplateOverrides {
    /**
     * The instance requirements.
     *
     * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types. Then, it
     * uses your On-Demand and Spot allocation strategies to launch instances from these instance
     * types.
     *
     * You can specify up to four separate sets of instance requirements per Auto Scaling group.
     * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in the
     * same Auto Scaling group. To do this, create the AMIs and create a new launch template for
     * each AMI. Then, create a compatible set of instance requirements for each launch template.
     *
     * You must specify one of instanceRequirements or instanceType.
     *
     * Default: - Do not override instance type
     */
    public fun instanceRequirements(): CfnAutoScalingGroup.InstanceRequirementsProperty? =
        unwrap(this)
            .getInstanceRequirements()
            ?.let(CfnAutoScalingGroup.InstanceRequirementsProperty::wrap)

    /**
     * The instance type, such as m3.xlarge. You must use an instance type that is supported in your
     * requested Region and Availability Zones.
     *
     * You must specify one of instanceRequirements or instanceType.
     *
     * Default: - Do not override instance type
     */
    public fun instanceType(): InstanceType? =
        unwrap(this).getInstanceType()?.let(InstanceType::wrap)

    /**
     * Provides the launch template to be used when launching the instance type.
     *
     * For example, some instance types might require a launch template with a different AMI. If not
     * provided, Amazon EC2 Auto Scaling uses the launch template that's defined for your mixed
     * instances policy.
     *
     * Default: - Do not override launch template
     */
    public fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    /**
     * The number of capacity units provided by the specified instance type in terms of virtual
     * CPUs, memory, storage, throughput, or other relative performance characteristic.
     *
     * When a Spot or On-Demand Instance is provisioned, the capacity units count toward the desired
     * capacity. Amazon EC2 Auto Scaling provisions instances until the desired capacity is totally
     * fulfilled, even if this results in an overage. Value must be in the range of 1 to 999.
     *
     * For example, If there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto Scaling
     * can only provision an instance with a WeightedCapacity of 5 units, the instance is
     * provisioned, and the desired capacity is exceeded by 3 units.
     *
     * Default: - Do not provide weight
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html)
     */
    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    /** A builder for [LaunchTemplateOverrides] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param instanceRequirements The instance requirements. Amazon EC2 Auto Scaling uses your
         *   specified requirements to identify instance types. Then, it uses your On-Demand and
         *   Spot allocation strategies to launch instances from these instance types.
         *
         * You can specify up to four separate sets of instance requirements per Auto Scaling group.
         * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in
         * the same Auto Scaling group. To do this, create the AMIs and create a new launch template
         * for each AMI. Then, create a compatible set of instance requirements for each launch
         * template.
         *
         * You must specify one of instanceRequirements or instanceType.
         */
        public fun instanceRequirements(
            instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty
        )

        /**
         * @param instanceRequirements The instance requirements. Amazon EC2 Auto Scaling uses your
         *   specified requirements to identify instance types. Then, it uses your On-Demand and
         *   Spot allocation strategies to launch instances from these instance types.
         *
         * You can specify up to four separate sets of instance requirements per Auto Scaling group.
         * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in
         * the same Auto Scaling group. To do this, create the AMIs and create a new launch template
         * for each AMI. Then, create a compatible set of instance requirements for each launch
         * template.
         *
         * You must specify one of instanceRequirements or instanceType.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9c819bf79835396db2722d29a50ca7989f57d065df0557529cc25baad7d0e488")
        public fun instanceRequirements(
            instanceRequirements:
                CfnAutoScalingGroup.InstanceRequirementsProperty.Builder.() -> Unit
        )

        /**
         * @param instanceType The instance type, such as m3.xlarge. You must use an instance type
         *   that is supported in your requested Region and Availability Zones. You must specify one
         *   of instanceRequirements or instanceType.
         */
        public fun instanceType(instanceType: InstanceType)

        /**
         * @param launchTemplate Provides the launch template to be used when launching the instance
         *   type. For example, some instance types might require a launch template with a different
         *   AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template that's defined
         *   for your mixed instances policy.
         */
        public fun launchTemplate(launchTemplate: ILaunchTemplate)

        /**
         * @param weightedCapacity The number of capacity units provided by the specified instance
         *   type in terms of virtual CPUs, memory, storage, throughput, or other relative
         *   performance characteristic. When a Spot or On-Demand Instance is provisioned, the
         *   capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions
         *   instances until the desired capacity is totally fulfilled, even if this results in an
         *   overage. Value must be in the range of 1 to 999.
         *
         * For example, If there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto
         * Scaling can only provision an instance with a WeightedCapacity of 5 units, the instance
         * is provisioned, and the desired capacity is exceeded by 3 units.
         */
        public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides.Builder =
            software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides.builder()

        /**
         * @param instanceRequirements The instance requirements. Amazon EC2 Auto Scaling uses your
         *   specified requirements to identify instance types. Then, it uses your On-Demand and
         *   Spot allocation strategies to launch instances from these instance types.
         *
         * You can specify up to four separate sets of instance requirements per Auto Scaling group.
         * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in
         * the same Auto Scaling group. To do this, create the AMIs and create a new launch template
         * for each AMI. Then, create a compatible set of instance requirements for each launch
         * template.
         *
         * You must specify one of instanceRequirements or instanceType.
         */
        override fun instanceRequirements(
            instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty
        ) {
            cdkBuilder.instanceRequirements(
                instanceRequirements.let(CfnAutoScalingGroup.InstanceRequirementsProperty::unwrap)
            )
        }

        /**
         * @param instanceRequirements The instance requirements. Amazon EC2 Auto Scaling uses your
         *   specified requirements to identify instance types. Then, it uses your On-Demand and
         *   Spot allocation strategies to launch instances from these instance types.
         *
         * You can specify up to four separate sets of instance requirements per Auto Scaling group.
         * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in
         * the same Auto Scaling group. To do this, create the AMIs and create a new launch template
         * for each AMI. Then, create a compatible set of instance requirements for each launch
         * template.
         *
         * You must specify one of instanceRequirements or instanceType.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9c819bf79835396db2722d29a50ca7989f57d065df0557529cc25baad7d0e488")
        override fun instanceRequirements(
            instanceRequirements:
                CfnAutoScalingGroup.InstanceRequirementsProperty.Builder.() -> Unit
        ): Unit =
            instanceRequirements(
                CfnAutoScalingGroup.InstanceRequirementsProperty(instanceRequirements)
            )

        /**
         * @param instanceType The instance type, such as m3.xlarge. You must use an instance type
         *   that is supported in your requested Region and Availability Zones. You must specify one
         *   of instanceRequirements or instanceType.
         */
        override fun instanceType(instanceType: InstanceType) {
            cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
        }

        /**
         * @param launchTemplate Provides the launch template to be used when launching the instance
         *   type. For example, some instance types might require a launch template with a different
         *   AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template that's defined
         *   for your mixed instances policy.
         */
        override fun launchTemplate(launchTemplate: ILaunchTemplate) {
            cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
        }

        /**
         * @param weightedCapacity The number of capacity units provided by the specified instance
         *   type in terms of virtual CPUs, memory, storage, throughput, or other relative
         *   performance characteristic. When a Spot or On-Demand Instance is provisioned, the
         *   capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions
         *   instances until the desired capacity is totally fulfilled, even if this results in an
         *   overage. Value must be in the range of 1 to 999.
         *
         * For example, If there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto
         * Scaling can only provision an instance with a WeightedCapacity of 5 units, the instance
         * is provisioned, and the desired capacity is exceeded by 3 units.
         */
        override fun weightedCapacity(weightedCapacity: Number) {
            cdkBuilder.weightedCapacity(weightedCapacity)
        }

        public fun build(): software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides,
    ) : LaunchTemplateOverrides {
        /**
         * The instance requirements.
         *
         * Amazon EC2 Auto Scaling uses your specified requirements to identify instance types.
         * Then, it uses your On-Demand and Spot allocation strategies to launch instances from
         * these instance types.
         *
         * You can specify up to four separate sets of instance requirements per Auto Scaling group.
         * This is useful for provisioning instances from different Amazon Machine Images (AMIs) in
         * the same Auto Scaling group. To do this, create the AMIs and create a new launch template
         * for each AMI. Then, create a compatible set of instance requirements for each launch
         * template.
         *
         * You must specify one of instanceRequirements or instanceType.
         *
         * Default: - Do not override instance type
         */
        override fun instanceRequirements(): CfnAutoScalingGroup.InstanceRequirementsProperty? =
            unwrap(this)
                .getInstanceRequirements()
                ?.let(CfnAutoScalingGroup.InstanceRequirementsProperty::wrap)

        /**
         * The instance type, such as m3.xlarge. You must use an instance type that is supported in
         * your requested Region and Availability Zones.
         *
         * You must specify one of instanceRequirements or instanceType.
         *
         * Default: - Do not override instance type
         */
        override fun instanceType(): InstanceType? =
            unwrap(this).getInstanceType()?.let(InstanceType::wrap)

        /**
         * Provides the launch template to be used when launching the instance type.
         *
         * For example, some instance types might require a launch template with a different AMI. If
         * not provided, Amazon EC2 Auto Scaling uses the launch template that's defined for your
         * mixed instances policy.
         *
         * Default: - Do not override launch template
         */
        override fun launchTemplate(): ILaunchTemplate? =
            unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

        /**
         * The number of capacity units provided by the specified instance type in terms of virtual
         * CPUs, memory, storage, throughput, or other relative performance characteristic.
         *
         * When a Spot or On-Demand Instance is provisioned, the capacity units count toward the
         * desired capacity. Amazon EC2 Auto Scaling provisions instances until the desired capacity
         * is totally fulfilled, even if this results in an overage. Value must be in the range of 1
         * to 999.
         *
         * For example, If there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto
         * Scaling can only provision an instance with a WeightedCapacity of 5 units, the instance
         * is provisioned, and the desired capacity is exceeded by 3 units.
         *
         * Default: - Do not provide weight
         *
         * [Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html)
         */
        override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateOverrides {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
        ): LaunchTemplateOverrides = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: LaunchTemplateOverrides
        ): software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides =
            (wrapped as Wrapper).cdkObject
    }
}
