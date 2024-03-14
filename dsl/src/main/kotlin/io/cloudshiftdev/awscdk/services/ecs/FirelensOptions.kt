package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface FirelensOptions {
    /**
     * Custom configuration file, s3 or file.
     *
     * Both configFileType and configFileValue must be used together to define a custom
     * configuration source.
     *
     * Default: - determined by checking configFileValue with S3 ARN.
     */
    public fun configFileType(): FirelensConfigFileType? =
        unwrap(this).getConfigFileType()?.let(FirelensConfigFileType::wrap)

    /**
     * Custom configuration file, S3 ARN or a file path Both configFileType and configFileValue must
     * be used together to define a custom configuration source.
     *
     * Default: - no config file value
     */
    public fun configFileValue(): String? = unwrap(this).getConfigFileValue()

    /**
     * By default, Amazon ECS adds additional fields in your log entries that help identify the
     * source of the logs.
     *
     * You can disable this action by setting enable-ecs-log-metadata to false.
     *
     * Default: - true
     */
    public fun enableEcsLogMetadata(): Boolean? = unwrap(this).getEnableECSLogMetadata()

    /** A builder for [FirelensOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param configFileType Custom configuration file, s3 or file. Both configFileType and
         *   configFileValue must be used together to define a custom configuration source.
         */
        public fun configFileType(configFileType: FirelensConfigFileType)

        /**
         * @param configFileValue Custom configuration file, S3 ARN or a file path Both
         *   configFileType and configFileValue must be used together to define a custom
         *   configuration source.
         */
        public fun configFileValue(configFileValue: String)

        /**
         * @param enableEcsLogMetadata By default, Amazon ECS adds additional fields in your log
         *   entries that help identify the source of the logs. You can disable this action by
         *   setting enable-ecs-log-metadata to false.
         */
        public fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensOptions.Builder =
            software.amazon.awscdk.services.ecs.FirelensOptions.builder()

        /**
         * @param configFileType Custom configuration file, s3 or file. Both configFileType and
         *   configFileValue must be used together to define a custom configuration source.
         */
        override fun configFileType(configFileType: FirelensConfigFileType) {
            cdkBuilder.configFileType(configFileType.let(FirelensConfigFileType::unwrap))
        }

        /**
         * @param configFileValue Custom configuration file, S3 ARN or a file path Both
         *   configFileType and configFileValue must be used together to define a custom
         *   configuration source.
         */
        override fun configFileValue(configFileValue: String) {
            cdkBuilder.configFileValue(configFileValue)
        }

        /**
         * @param enableEcsLogMetadata By default, Amazon ECS adds additional fields in your log
         *   entries that help identify the source of the logs. You can disable this action by
         *   setting enable-ecs-log-metadata to false.
         */
        override fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean) {
            cdkBuilder.enableEcsLogMetadata(enableEcsLogMetadata)
        }

        public fun build(): software.amazon.awscdk.services.ecs.FirelensOptions = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.FirelensOptions,
    ) : FirelensOptions {
        /**
         * Custom configuration file, s3 or file.
         *
         * Both configFileType and configFileValue must be used together to define a custom
         * configuration source.
         *
         * Default: - determined by checking configFileValue with S3 ARN.
         */
        override fun configFileType(): FirelensConfigFileType? =
            unwrap(this).getConfigFileType()?.let(FirelensConfigFileType::wrap)

        /**
         * Custom configuration file, S3 ARN or a file path Both configFileType and configFileValue
         * must be used together to define a custom configuration source.
         *
         * Default: - no config file value
         */
        override fun configFileValue(): String? = unwrap(this).getConfigFileValue()

        /**
         * By default, Amazon ECS adds additional fields in your log entries that help identify the
         * source of the logs.
         *
         * You can disable this action by setting enable-ecs-log-metadata to false.
         *
         * Default: - true
         */
        override fun enableEcsLogMetadata(): Boolean? = unwrap(this).getEnableECSLogMetadata()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): FirelensOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.FirelensOptions
        ): FirelensOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: FirelensOptions
        ): software.amazon.awscdk.services.ecs.FirelensOptions = (wrapped as Wrapper).cdkObject
    }
}
