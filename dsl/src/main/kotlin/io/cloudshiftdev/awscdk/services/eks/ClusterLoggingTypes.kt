package io.cloudshiftdev.awscdk.services.eks

public enum class ClusterLoggingTypes(
    private val cdkObject: software.amazon.awscdk.services.eks.ClusterLoggingTypes,
) {
    API(software.amazon.awscdk.services.eks.ClusterLoggingTypes.API),
    AUDIT(software.amazon.awscdk.services.eks.ClusterLoggingTypes.AUDIT),
    AUTHENTICATOR(software.amazon.awscdk.services.eks.ClusterLoggingTypes.AUTHENTICATOR),
    CONTROLLER_MANAGER(software.amazon.awscdk.services.eks.ClusterLoggingTypes.CONTROLLER_MANAGER),
    SCHEDULER(software.amazon.awscdk.services.eks.ClusterLoggingTypes.SCHEDULER),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.eks.ClusterLoggingTypes
        ): ClusterLoggingTypes =
            when (cdkObject) {
                software.amazon.awscdk.services.eks.ClusterLoggingTypes.API ->
                    ClusterLoggingTypes.API
                software.amazon.awscdk.services.eks.ClusterLoggingTypes.AUDIT ->
                    ClusterLoggingTypes.AUDIT
                software.amazon.awscdk.services.eks.ClusterLoggingTypes.AUTHENTICATOR ->
                    ClusterLoggingTypes.AUTHENTICATOR
                software.amazon.awscdk.services.eks.ClusterLoggingTypes.CONTROLLER_MANAGER ->
                    ClusterLoggingTypes.CONTROLLER_MANAGER
                software.amazon.awscdk.services.eks.ClusterLoggingTypes.SCHEDULER ->
                    ClusterLoggingTypes.SCHEDULER
            }

        internal fun unwrap(
            wrapped: ClusterLoggingTypes
        ): software.amazon.awscdk.services.eks.ClusterLoggingTypes = wrapped.cdkObject
    }
}
