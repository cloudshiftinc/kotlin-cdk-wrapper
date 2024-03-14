package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface ServerlessScalingOptions {
    /**
     * The time before an Aurora Serverless database cluster is paused.
     *
     * A database cluster can be paused only when it is idle (it has no connections). Auto pause
     * time must be between 5 minutes and 1 day.
     *
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a
     * snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
     *
     * Set to 0 to disable
     *
     * Default: - automatic pause enabled after 5 minutes
     */
    public fun autoPause(): Duration? = unwrap(this).getAutoPause()?.let(Duration::wrap)

    /**
     * The maximum capacity for an Aurora Serverless database cluster.
     *
     * Default: - determined by Aurora based on database engine
     */
    public fun maxCapacity(): AuroraCapacityUnit? =
        unwrap(this).getMaxCapacity()?.let(AuroraCapacityUnit::wrap)

    /**
     * The minimum capacity for an Aurora Serverless database cluster.
     *
     * Default: - determined by Aurora based on database engine
     */
    public fun minCapacity(): AuroraCapacityUnit? =
        unwrap(this).getMinCapacity()?.let(AuroraCapacityUnit::wrap)

    /**
     * The amount of time that Aurora Serverless v1 tries to find a scaling point to perform
     * seamless scaling before enforcing the timeout action.
     *
     * Default: - 5 minutes
     */
    public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The action to take when the timeout is reached.
     *
     * Selecting ForceApplyCapacityChange will force the capacity to the specified value as soon as
     * possible, even without a scaling point. Selecting RollbackCapacityChange will ignore the
     * capacity change if a scaling point is not found. This is the default behavior.
     *
     * Default: - TimeoutAction.ROLLBACK_CAPACITY_CHANGE
     */
    public fun timeoutAction(): TimeoutAction? =
        unwrap(this).getTimeoutAction()?.let(TimeoutAction::wrap)

    /** A builder for [ServerlessScalingOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param autoPause The time before an Aurora Serverless database cluster is paused. A
         *   database cluster can be paused only when it is idle (it has no connections). Auto pause
         *   time must be between 5 minutes and 1 day.
         *
         * If a DB cluster is paused for more than seven days, the DB cluster might be backed up
         * with a snapshot. In this case, the DB cluster is restored when there is a request to
         * connect to it.
         *
         * Set to 0 to disable
         */
        public fun autoPause(autoPause: Duration)

        /** @param maxCapacity The maximum capacity for an Aurora Serverless database cluster. */
        public fun maxCapacity(maxCapacity: AuroraCapacityUnit)

        /** @param minCapacity The minimum capacity for an Aurora Serverless database cluster. */
        public fun minCapacity(minCapacity: AuroraCapacityUnit)

        /**
         * @param timeout The amount of time that Aurora Serverless v1 tries to find a scaling point
         *   to perform seamless scaling before enforcing the timeout action.
         */
        public fun timeout(timeout: Duration)

        /**
         * @param timeoutAction The action to take when the timeout is reached. Selecting
         *   ForceApplyCapacityChange will force the capacity to the specified value as soon as
         *   possible, even without a scaling point. Selecting RollbackCapacityChange will ignore
         *   the capacity change if a scaling point is not found. This is the default behavior.
         */
        public fun timeoutAction(timeoutAction: TimeoutAction)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.rds.ServerlessScalingOptions.Builder =
            software.amazon.awscdk.services.rds.ServerlessScalingOptions.builder()

        /**
         * @param autoPause The time before an Aurora Serverless database cluster is paused. A
         *   database cluster can be paused only when it is idle (it has no connections). Auto pause
         *   time must be between 5 minutes and 1 day.
         *
         * If a DB cluster is paused for more than seven days, the DB cluster might be backed up
         * with a snapshot. In this case, the DB cluster is restored when there is a request to
         * connect to it.
         *
         * Set to 0 to disable
         */
        override fun autoPause(autoPause: Duration) {
            cdkBuilder.autoPause(autoPause.let(Duration::unwrap))
        }

        /** @param maxCapacity The maximum capacity for an Aurora Serverless database cluster. */
        override fun maxCapacity(maxCapacity: AuroraCapacityUnit) {
            cdkBuilder.maxCapacity(maxCapacity.let(AuroraCapacityUnit::unwrap))
        }

        /** @param minCapacity The minimum capacity for an Aurora Serverless database cluster. */
        override fun minCapacity(minCapacity: AuroraCapacityUnit) {
            cdkBuilder.minCapacity(minCapacity.let(AuroraCapacityUnit::unwrap))
        }

        /**
         * @param timeout The amount of time that Aurora Serverless v1 tries to find a scaling point
         *   to perform seamless scaling before enforcing the timeout action.
         */
        override fun timeout(timeout: Duration) {
            cdkBuilder.timeout(timeout.let(Duration::unwrap))
        }

        /**
         * @param timeoutAction The action to take when the timeout is reached. Selecting
         *   ForceApplyCapacityChange will force the capacity to the specified value as soon as
         *   possible, even without a scaling point. Selecting RollbackCapacityChange will ignore
         *   the capacity change if a scaling point is not found. This is the default behavior.
         */
        override fun timeoutAction(timeoutAction: TimeoutAction) {
            cdkBuilder.timeoutAction(timeoutAction.let(TimeoutAction::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.rds.ServerlessScalingOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.rds.ServerlessScalingOptions,
    ) : ServerlessScalingOptions {
        /**
         * The time before an Aurora Serverless database cluster is paused.
         *
         * A database cluster can be paused only when it is idle (it has no connections). Auto pause
         * time must be between 5 minutes and 1 day.
         *
         * If a DB cluster is paused for more than seven days, the DB cluster might be backed up
         * with a snapshot. In this case, the DB cluster is restored when there is a request to
         * connect to it.
         *
         * Set to 0 to disable
         *
         * Default: - automatic pause enabled after 5 minutes
         */
        override fun autoPause(): Duration? = unwrap(this).getAutoPause()?.let(Duration::wrap)

        /**
         * The maximum capacity for an Aurora Serverless database cluster.
         *
         * Default: - determined by Aurora based on database engine
         */
        override fun maxCapacity(): AuroraCapacityUnit? =
            unwrap(this).getMaxCapacity()?.let(AuroraCapacityUnit::wrap)

        /**
         * The minimum capacity for an Aurora Serverless database cluster.
         *
         * Default: - determined by Aurora based on database engine
         */
        override fun minCapacity(): AuroraCapacityUnit? =
            unwrap(this).getMinCapacity()?.let(AuroraCapacityUnit::wrap)

        /**
         * The amount of time that Aurora Serverless v1 tries to find a scaling point to perform
         * seamless scaling before enforcing the timeout action.
         *
         * Default: - 5 minutes
         */
        override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

        /**
         * The action to take when the timeout is reached.
         *
         * Selecting ForceApplyCapacityChange will force the capacity to the specified value as soon
         * as possible, even without a scaling point. Selecting RollbackCapacityChange will ignore
         * the capacity change if a scaling point is not found. This is the default behavior.
         *
         * Default: - TimeoutAction.ROLLBACK_CAPACITY_CHANGE
         */
        override fun timeoutAction(): TimeoutAction? =
            unwrap(this).getTimeoutAction()?.let(TimeoutAction::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessScalingOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.ServerlessScalingOptions
        ): ServerlessScalingOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ServerlessScalingOptions
        ): software.amazon.awscdk.services.rds.ServerlessScalingOptions =
            (wrapped as Wrapper).cdkObject
    }
}
