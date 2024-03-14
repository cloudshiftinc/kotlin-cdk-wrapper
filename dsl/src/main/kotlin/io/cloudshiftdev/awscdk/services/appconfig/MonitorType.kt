package io.cloudshiftdev.awscdk.services.appconfig

public enum class MonitorType(
    private val cdkObject: software.amazon.awscdk.services.appconfig.MonitorType,
) {
    CLOUDWATCH(software.amazon.awscdk.services.appconfig.MonitorType.CLOUDWATCH),
    CFN_MONITORS_PROPERTY(
        software.amazon.awscdk.services.appconfig.MonitorType.CFN_MONITORS_PROPERTY
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.MonitorType
        ): MonitorType =
            when (cdkObject) {
                software.amazon.awscdk.services.appconfig.MonitorType.CLOUDWATCH ->
                    MonitorType.CLOUDWATCH
                software.amazon.awscdk.services.appconfig.MonitorType.CFN_MONITORS_PROPERTY ->
                    MonitorType.CFN_MONITORS_PROPERTY
            }

        internal fun unwrap(
            wrapped: MonitorType
        ): software.amazon.awscdk.services.appconfig.MonitorType = wrapped.cdkObject
    }
}
