package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Unit

public interface LoadBalancerTargetProps {
    /**
     * JSON representing the target's direct addition to the TargetGroup list.
     *
     * May be omitted if the target is going to register itself later.
     */
    public fun targetJson(): Any? = unwrap(this).getTargetJson()

    /** What kind of target this is. */
    public fun targetType(): TargetType

    /** A builder for [LoadBalancerTargetProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param targetJson JSON representing the target's direct addition to the TargetGroup list.
         *   May be omitted if the target is going to register itself later.
         */
        public fun targetJson(targetJson: Any)

        /** @param targetType What kind of target this is. */
        public fun targetType(targetType: TargetType)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.Builder =
            software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.builder()

        /**
         * @param targetJson JSON representing the target's direct addition to the TargetGroup list.
         *   May be omitted if the target is going to register itself later.
         */
        override fun targetJson(targetJson: Any) {
            cdkBuilder.targetJson(targetJson)
        }

        /** @param targetType What kind of target this is. */
        override fun targetType(targetType: TargetType) {
            cdkBuilder.targetType(targetType.let(TargetType::unwrap))
        }

        public fun build():
            software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps,
    ) : LoadBalancerTargetProps {
        /**
         * JSON representing the target's direct addition to the TargetGroup list.
         *
         * May be omitted if the target is going to register itself later.
         */
        override fun targetJson(): Any? = unwrap(this).getTargetJson()

        /** What kind of target this is. */
        override fun targetType(): TargetType = unwrap(this).getTargetType().let(TargetType::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerTargetProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
        ): LoadBalancerTargetProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: LoadBalancerTargetProps
        ): software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps =
            (wrapped as Wrapper).cdkObject
    }
}
