package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface CfnResourceAutoScalingCreationPolicy {
    /**
     * Specifies the percentage of instances in an Auto Scaling replacement update that must signal
     * success for the update to succeed.
     *
     * You can specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a
     * percent. For example, if you update five instances with a minimum successful percentage of
     * 50, three instances must signal success. If an instance doesn't send a signal within the time
     * specified by the Timeout property, AWS CloudFormation assumes that the instance wasn't
     * created.
     */
    public fun minSuccessfulInstancesPercent(): Number? =
        unwrap(this).getMinSuccessfulInstancesPercent()

    /** A builder for [CfnResourceAutoScalingCreationPolicy] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param minSuccessfulInstancesPercent Specifies the percentage of instances in an Auto
         *   Scaling replacement update that must signal success for the update to succeed. You can
         *   specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a
         *   percent. For example, if you update five instances with a minimum successful percentage
         *   of 50, three instances must signal success. If an instance doesn't send a signal within
         *   the time specified by the Timeout property, AWS CloudFormation assumes that the
         *   instance wasn't created.
         */
        public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy.Builder =
            software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy.builder()

        /**
         * @param minSuccessfulInstancesPercent Specifies the percentage of instances in an Auto
         *   Scaling replacement update that must signal success for the update to succeed. You can
         *   specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a
         *   percent. For example, if you update five instances with a minimum successful percentage
         *   of 50, three instances must signal success. If an instance doesn't send a signal within
         *   the time specified by the Timeout property, AWS CloudFormation assumes that the
         *   instance wasn't created.
         */
        override fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
            cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
        }

        public fun build(): software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy,
    ) : CfnResourceAutoScalingCreationPolicy {
        /**
         * Specifies the percentage of instances in an Auto Scaling replacement update that must
         * signal success for the update to succeed.
         *
         * You can specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of
         * a percent. For example, if you update five instances with a minimum successful percentage
         * of 50, three instances must signal success. If an instance doesn't send a signal within
         * the time specified by the Timeout property, AWS CloudFormation assumes that the instance
         * wasn't created.
         */
        override fun minSuccessfulInstancesPercent(): Number? =
            unwrap(this).getMinSuccessfulInstancesPercent()
    }

    public companion object {
        init {}

        public operator fun invoke(
            block: Builder.() -> Unit = {}
        ): CfnResourceAutoScalingCreationPolicy {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy
        ): CfnResourceAutoScalingCreationPolicy = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: CfnResourceAutoScalingCreationPolicy
        ): software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy =
            (wrapped as Wrapper).cdkObject
    }
}
