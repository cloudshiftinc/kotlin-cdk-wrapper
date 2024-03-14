package io.cloudshiftdev.awscdk.services.ec2

public enum class FlowLogFileFormat(
    private val cdkObject: software.amazon.awscdk.services.ec2.FlowLogFileFormat,
) {
    PLAIN_TEXT(software.amazon.awscdk.services.ec2.FlowLogFileFormat.PLAIN_TEXT),
    PARQUET(software.amazon.awscdk.services.ec2.FlowLogFileFormat.PARQUET),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.FlowLogFileFormat
        ): FlowLogFileFormat =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.FlowLogFileFormat.PLAIN_TEXT ->
                    FlowLogFileFormat.PLAIN_TEXT
                software.amazon.awscdk.services.ec2.FlowLogFileFormat.PARQUET ->
                    FlowLogFileFormat.PARQUET
            }

        internal fun unwrap(
            wrapped: FlowLogFileFormat
        ): software.amazon.awscdk.services.ec2.FlowLogFileFormat = wrapped.cdkObject
    }
}
