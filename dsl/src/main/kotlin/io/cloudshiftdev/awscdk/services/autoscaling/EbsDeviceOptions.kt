package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface EbsDeviceOptions : EbsDeviceOptionsBase {
    /**
     * Specifies whether the EBS volume is encrypted.
     *
     * Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
     */
    public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    /** A builder for [EbsDeviceOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param deleteOnTermination Indicates whether to delete the volume when the instance is
         *   terminated.
         */
        public fun deleteOnTermination(deleteOnTermination: Boolean)

        /**
         * @param encrypted Specifies whether the EBS volume is encrypted. Encrypted EBS volumes can
         *   only be attached to instances that support Amazon EBS encryption
         */
        public fun encrypted(encrypted: Boolean)

        /**
         * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
         *   Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
         *
         * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
         * you need at least 100 GiB storage on the volume.
         */
        public fun iops(iops: Number)

        /**
         * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of
         *   125 and maximum of 1000.
         */
        public fun throughput(throughput: Number)

        /** @param volumeType The EBS volume type. */
        public fun volumeType(volumeType: EbsDeviceVolumeType)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.autoscaling.EbsDeviceOptions.Builder =
            software.amazon.awscdk.services.autoscaling.EbsDeviceOptions.builder()

        /**
         * @param deleteOnTermination Indicates whether to delete the volume when the instance is
         *   terminated.
         */
        override fun deleteOnTermination(deleteOnTermination: Boolean) {
            cdkBuilder.deleteOnTermination(deleteOnTermination)
        }

        /**
         * @param encrypted Specifies whether the EBS volume is encrypted. Encrypted EBS volumes can
         *   only be attached to instances that support Amazon EBS encryption
         */
        override fun encrypted(encrypted: Boolean) {
            cdkBuilder.encrypted(encrypted)
        }

        /**
         * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
         *   Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
         *
         * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
         * you need at least 100 GiB storage on the volume.
         */
        override fun iops(iops: Number) {
            cdkBuilder.iops(iops)
        }

        /**
         * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of
         *   125 and maximum of 1000.
         */
        override fun throughput(throughput: Number) {
            cdkBuilder.throughput(throughput)
        }

        /** @param volumeType The EBS volume type. */
        override fun volumeType(volumeType: EbsDeviceVolumeType) {
            cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.autoscaling.EbsDeviceOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceOptions,
    ) : EbsDeviceOptions {
        /**
         * Indicates whether to delete the volume when the instance is terminated.
         *
         * Default: - true for Amazon EC2 Auto Scaling, false otherwise (e.g. EBS)
         */
        override fun deleteOnTermination(): Boolean? = unwrap(this).getDeleteOnTermination()

        /**
         * Specifies whether the EBS volume is encrypted.
         *
         * Encrypted EBS volumes can only be attached to instances that support Amazon EBS
         * encryption
         *
         * Default: false
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
         */
        override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

        /**
         * The number of I/O operations per second (IOPS) to provision for the volume.
         *
         * Must only be set for `volumeType`: `EbsDeviceVolumeType.IO1`
         *
         * The maximum ratio of IOPS to volume size (in GiB) is 50:1, so for 5,000 provisioned IOPS,
         * you need at least 100 GiB storage on the volume.
         *
         * Default: - none, required for `EbsDeviceVolumeType.IO1`
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
         */
        override fun iops(): Number? = unwrap(this).getIops()

        /**
         * The throughput that the volume supports, in MiB/s Takes a minimum of 125 and maximum
         * of 1000.
         *
         * Default: - 125 MiB/s. Only valid on gp3 volumes.
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
         */
        override fun throughput(): Number? = unwrap(this).getThroughput()

        /**
         * The EBS volume type.
         *
         * Default: `EbsDeviceVolumeType.GP2`
         *
         * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
         */
        override fun volumeType(): EbsDeviceVolumeType? =
            unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): EbsDeviceOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.EbsDeviceOptions
        ): EbsDeviceOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: EbsDeviceOptions
        ): software.amazon.awscdk.services.autoscaling.EbsDeviceOptions =
            (wrapped as Wrapper).cdkObject
    }
}
