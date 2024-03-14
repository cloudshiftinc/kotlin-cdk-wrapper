package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMultiplexprogram
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram,
) : CfnResource(cdkObject), IInspectable {
    /** The unique ID of the channel. */
    public open fun channelId(): String? = unwrap(this).getChannelId()

    /** The unique ID of the channel. */
    public open fun channelId(`value`: String) {
        unwrap(this).setChannelId(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The unique id of the multiplex. */
    public open fun multiplexId(): String? = unwrap(this).getMultiplexId()

    /** The unique id of the multiplex. */
    public open fun multiplexId(`value`: String) {
        unwrap(this).setMultiplexId(`value`)
    }

    /** Multiplex Program settings configuration. */
    public open fun multiplexProgramSettings(): Any? = unwrap(this).getMultiplexProgramSettings()

    /** Multiplex Program settings configuration. */
    public open fun multiplexProgramSettings(`value`: IResolvable) {
        unwrap(this).setMultiplexProgramSettings(`value`.let(IResolvable::unwrap))
    }

    /** Multiplex Program settings configuration. */
    public open fun multiplexProgramSettings(`value`: MultiplexProgramSettingsProperty) {
        unwrap(this)
            .setMultiplexProgramSettings(`value`.let(MultiplexProgramSettingsProperty::unwrap))
    }

    /** Multiplex Program settings configuration. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc3af6786ddb05397b91b61e78dd60ca59cdc384de2e9b6729f383b20e914b76")
    public open fun multiplexProgramSettings(
        `value`: MultiplexProgramSettingsProperty.Builder.() -> Unit
    ): Unit = multiplexProgramSettings(MultiplexProgramSettingsProperty(`value`))

    /** Packet identifiers map for a given Multiplex program. */
    public open fun packetIdentifiersMap(): Any? = unwrap(this).getPacketIdentifiersMap()

    /** Packet identifiers map for a given Multiplex program. */
    public open fun packetIdentifiersMap(`value`: IResolvable) {
        unwrap(this).setPacketIdentifiersMap(`value`.let(IResolvable::unwrap))
    }

    /** Packet identifiers map for a given Multiplex program. */
    public open fun packetIdentifiersMap(`value`: MultiplexProgramPacketIdentifiersMapProperty) {
        unwrap(this)
            .setPacketIdentifiersMap(
                `value`.let(MultiplexProgramPacketIdentifiersMapProperty::unwrap)
            )
    }

    /** Packet identifiers map for a given Multiplex program. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe93c7dc6dd6b1d6747cd2c0636b237c4caf4888d182dd9f11ebb19ca5ec6a7d")
    public open fun packetIdentifiersMap(
        `value`: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit
    ): Unit = packetIdentifiersMap(MultiplexProgramPacketIdentifiersMapProperty(`value`))

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     */
    public open fun pipelineDetails(): Any? = unwrap(this).getPipelineDetails()

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     */
    public open fun pipelineDetails(`value`: IResolvable) {
        unwrap(this).setPipelineDetails(`value`.let(IResolvable::unwrap))
    }

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     */
    public open fun pipelineDetails(__idx_ac66f0: List<Any>) {
        unwrap(this).setPipelineDetails(__idx_ac66f0)
    }

    /**
     * Contains information about the current sources for the specified program in the specified
     * multiplex.
     */
    public open fun pipelineDetails(vararg __idx_ac66f0: Any): Unit =
        pipelineDetails(__idx_ac66f0.toList())

    /** Indicates which pipeline is preferred by the multiplex for program ingest. */
    public open fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

    /** Indicates which pipeline is preferred by the multiplex for program ingest. */
    public open fun preferredChannelPipeline(`value`: String) {
        unwrap(this).setPreferredChannelPipeline(`value`)
    }

    /** The name of the multiplex program. */
    public open fun programName(): String? = unwrap(this).getProgramName()

    /** The name of the multiplex program. */
    public open fun programName(`value`: String) {
        unwrap(this).setProgramName(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnMultiplexprogram]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The unique ID of the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-channelid)
         *
         * @param channelId The unique ID of the channel.
         */
        public fun channelId(channelId: String)

        /**
         * The unique id of the multiplex.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexid)
         *
         * @param multiplexId The unique id of the multiplex.
         */
        public fun multiplexId(multiplexId: String)

        /**
         * Multiplex Program settings configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
         *
         * @param multiplexProgramSettings Multiplex Program settings configuration.
         */
        public fun multiplexProgramSettings(multiplexProgramSettings: IResolvable)

        /**
         * Multiplex Program settings configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
         *
         * @param multiplexProgramSettings Multiplex Program settings configuration.
         */
        public fun multiplexProgramSettings(
            multiplexProgramSettings: MultiplexProgramSettingsProperty
        )

        /**
         * Multiplex Program settings configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
         *
         * @param multiplexProgramSettings Multiplex Program settings configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("be93b333b9815f74414662d77a433705c08246870a2a935d82e52c2097eacd1c")
        public fun multiplexProgramSettings(
            multiplexProgramSettings: MultiplexProgramSettingsProperty.Builder.() -> Unit
        )

        /**
         * Packet identifiers map for a given Multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
         *
         * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
         */
        public fun packetIdentifiersMap(packetIdentifiersMap: IResolvable)

        /**
         * Packet identifiers map for a given Multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
         *
         * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
         */
        public fun packetIdentifiersMap(
            packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty
        )

        /**
         * Packet identifiers map for a given Multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
         *
         * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4fb6bbfbb5908fdf91f3af347ef99f65c1840e420d10eb6be3388a404b36e0fd")
        public fun packetIdentifiersMap(
            packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit
        )

        /**
         * Contains information about the current sources for the specified program in the specified
         * multiplex.
         *
         * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
         * channel (the channel identified by the program). But only one of those channel pipelines
         * is ever active at one time.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
         *
         * @param pipelineDetails Contains information about the current sources for the specified
         *   program in the specified multiplex.
         */
        public fun pipelineDetails(pipelineDetails: IResolvable)

        /**
         * Contains information about the current sources for the specified program in the specified
         * multiplex.
         *
         * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
         * channel (the channel identified by the program). But only one of those channel pipelines
         * is ever active at one time.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
         *
         * @param pipelineDetails Contains information about the current sources for the specified
         *   program in the specified multiplex.
         */
        public fun pipelineDetails(pipelineDetails: List<Any>)

        /**
         * Contains information about the current sources for the specified program in the specified
         * multiplex.
         *
         * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
         * channel (the channel identified by the program). But only one of those channel pipelines
         * is ever active at one time.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
         *
         * @param pipelineDetails Contains information about the current sources for the specified
         *   program in the specified multiplex.
         */
        public fun pipelineDetails(vararg pipelineDetails: Any)

        /**
         * Indicates which pipeline is preferred by the multiplex for program ingest.
         *
         * If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the multiplex to
         * switch to the non-preferred pipeline, it will switch back once that ingest is healthy
         * again. If set to "CURRENTLY_ACTIVE", it will not switch back to the other pipeline based
         * on it recovering to a healthy state, it will only switch if the active pipeline becomes
         * unhealthy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-preferredchannelpipeline)
         *
         * @param preferredChannelPipeline Indicates which pipeline is preferred by the multiplex
         *   for program ingest.
         */
        public fun preferredChannelPipeline(preferredChannelPipeline: String)

        /**
         * The name of the multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-programname)
         *
         * @param programName The name of the multiplex program.
         */
        public fun programName(programName: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.medialive.CfnMultiplexprogram.Builder =
            software.amazon.awscdk.services.medialive.CfnMultiplexprogram.Builder.create(scope, id)

        /**
         * The unique ID of the channel.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-channelid)
         *
         * @param channelId The unique ID of the channel.
         */
        override fun channelId(channelId: String) {
            cdkBuilder.channelId(channelId)
        }

        /**
         * The unique id of the multiplex.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexid)
         *
         * @param multiplexId The unique id of the multiplex.
         */
        override fun multiplexId(multiplexId: String) {
            cdkBuilder.multiplexId(multiplexId)
        }

        /**
         * Multiplex Program settings configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
         *
         * @param multiplexProgramSettings Multiplex Program settings configuration.
         */
        override fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
            cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(IResolvable::unwrap))
        }

        /**
         * Multiplex Program settings configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
         *
         * @param multiplexProgramSettings Multiplex Program settings configuration.
         */
        override fun multiplexProgramSettings(
            multiplexProgramSettings: MultiplexProgramSettingsProperty
        ) {
            cdkBuilder.multiplexProgramSettings(
                multiplexProgramSettings.let(MultiplexProgramSettingsProperty::unwrap)
            )
        }

        /**
         * Multiplex Program settings configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-multiplexprogramsettings)
         *
         * @param multiplexProgramSettings Multiplex Program settings configuration.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("be93b333b9815f74414662d77a433705c08246870a2a935d82e52c2097eacd1c")
        override fun multiplexProgramSettings(
            multiplexProgramSettings: MultiplexProgramSettingsProperty.Builder.() -> Unit
        ): Unit =
            multiplexProgramSettings(MultiplexProgramSettingsProperty(multiplexProgramSettings))

        /**
         * Packet identifiers map for a given Multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
         *
         * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
         */
        override fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
            cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(IResolvable::unwrap))
        }

        /**
         * Packet identifiers map for a given Multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
         *
         * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
         */
        override fun packetIdentifiersMap(
            packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty
        ) {
            cdkBuilder.packetIdentifiersMap(
                packetIdentifiersMap.let(MultiplexProgramPacketIdentifiersMapProperty::unwrap)
            )
        }

        /**
         * Packet identifiers map for a given Multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-packetidentifiersmap)
         *
         * @param packetIdentifiersMap Packet identifiers map for a given Multiplex program.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("4fb6bbfbb5908fdf91f3af347ef99f65c1840e420d10eb6be3388a404b36e0fd")
        override fun packetIdentifiersMap(
            packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit
        ): Unit =
            packetIdentifiersMap(MultiplexProgramPacketIdentifiersMapProperty(packetIdentifiersMap))

        /**
         * Contains information about the current sources for the specified program in the specified
         * multiplex.
         *
         * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
         * channel (the channel identified by the program). But only one of those channel pipelines
         * is ever active at one time.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
         *
         * @param pipelineDetails Contains information about the current sources for the specified
         *   program in the specified multiplex.
         */
        override fun pipelineDetails(pipelineDetails: IResolvable) {
            cdkBuilder.pipelineDetails(pipelineDetails.let(IResolvable::unwrap))
        }

        /**
         * Contains information about the current sources for the specified program in the specified
         * multiplex.
         *
         * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
         * channel (the channel identified by the program). But only one of those channel pipelines
         * is ever active at one time.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
         *
         * @param pipelineDetails Contains information about the current sources for the specified
         *   program in the specified multiplex.
         */
        override fun pipelineDetails(pipelineDetails: List<Any>) {
            cdkBuilder.pipelineDetails(pipelineDetails)
        }

        /**
         * Contains information about the current sources for the specified program in the specified
         * multiplex.
         *
         * Keep in mind that each multiplex pipeline connects to both pipelines in a given source
         * channel (the channel identified by the program). But only one of those channel pipelines
         * is ever active at one time.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-pipelinedetails)
         *
         * @param pipelineDetails Contains information about the current sources for the specified
         *   program in the specified multiplex.
         */
        override fun pipelineDetails(vararg pipelineDetails: Any): Unit =
            pipelineDetails(pipelineDetails.toList())

        /**
         * Indicates which pipeline is preferred by the multiplex for program ingest.
         *
         * If set to "PIPELINE_0" or "PIPELINE_1" and an unhealthy ingest causes the multiplex to
         * switch to the non-preferred pipeline, it will switch back once that ingest is healthy
         * again. If set to "CURRENTLY_ACTIVE", it will not switch back to the other pipeline based
         * on it recovering to a healthy state, it will only switch if the active pipeline becomes
         * unhealthy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-preferredchannelpipeline)
         *
         * @param preferredChannelPipeline Indicates which pipeline is preferred by the multiplex
         *   for program ingest.
         */
        override fun preferredChannelPipeline(preferredChannelPipeline: String) {
            cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
        }

        /**
         * The name of the multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplexprogram.html#cfn-medialive-multiplexprogram-programname)
         *
         * @param programName The name of the multiplex program.
         */
        override fun programName(programName: String) {
            cdkBuilder.programName(programName)
        }

        public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplexprogram =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnMultiplexprogram {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnMultiplexprogram(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram
        ): CfnMultiplexprogram = CfnMultiplexprogram(cdkObject)

        internal fun unwrap(
            wrapped: CfnMultiplexprogram
        ): software.amazon.awscdk.services.medialive.CfnMultiplexprogram = wrapped.cdkObject
    }

    public interface MultiplexProgramPacketIdentifiersMapProperty {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-audiopids)
         */
        public fun audioPids(): Any? = unwrap(this).getAudioPids()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-dvbsubpids)
         */
        public fun dvbSubPids(): Any? = unwrap(this).getDvbSubPids()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-dvbteletextpid)
         */
        public fun dvbTeletextPid(): Number? = unwrap(this).getDvbTeletextPid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-etvplatformpid)
         */
        public fun etvPlatformPid(): Number? = unwrap(this).getEtvPlatformPid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-etvsignalpid)
         */
        public fun etvSignalPid(): Number? = unwrap(this).getEtvSignalPid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-klvdatapids)
         */
        public fun klvDataPids(): Any? = unwrap(this).getKlvDataPids()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-pcrpid)
         */
        public fun pcrPid(): Number? = unwrap(this).getPcrPid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-pmtpid)
         */
        public fun pmtPid(): Number? = unwrap(this).getPmtPid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-privatemetadatapid)
         */
        public fun privateMetadataPid(): Number? = unwrap(this).getPrivateMetadataPid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-scte27pids)
         */
        public fun scte27Pids(): Any? = unwrap(this).getScte27Pids()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-scte35pid)
         */
        public fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-timedmetadatapid)
         */
        public fun timedMetadataPid(): Number? = unwrap(this).getTimedMetadataPid()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-videopid)
         */
        public fun videoPid(): Number? = unwrap(this).getVideoPid()

        /** A builder for [MultiplexProgramPacketIdentifiersMapProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param audioPids the value to be set. */
            public fun audioPids(audioPids: IResolvable)

            /** @param audioPids the value to be set. */
            public fun audioPids(audioPids: List<Number>)

            /** @param audioPids the value to be set. */
            public fun audioPids(vararg audioPids: Number)

            /** @param dvbSubPids the value to be set. */
            public fun dvbSubPids(dvbSubPids: IResolvable)

            /** @param dvbSubPids the value to be set. */
            public fun dvbSubPids(dvbSubPids: List<Number>)

            /** @param dvbSubPids the value to be set. */
            public fun dvbSubPids(vararg dvbSubPids: Number)

            /** @param dvbTeletextPid the value to be set. */
            public fun dvbTeletextPid(dvbTeletextPid: Number)

            /** @param etvPlatformPid the value to be set. */
            public fun etvPlatformPid(etvPlatformPid: Number)

            /** @param etvSignalPid the value to be set. */
            public fun etvSignalPid(etvSignalPid: Number)

            /** @param klvDataPids the value to be set. */
            public fun klvDataPids(klvDataPids: IResolvable)

            /** @param klvDataPids the value to be set. */
            public fun klvDataPids(klvDataPids: List<Number>)

            /** @param klvDataPids the value to be set. */
            public fun klvDataPids(vararg klvDataPids: Number)

            /** @param pcrPid the value to be set. */
            public fun pcrPid(pcrPid: Number)

            /** @param pmtPid the value to be set. */
            public fun pmtPid(pmtPid: Number)

            /** @param privateMetadataPid the value to be set. */
            public fun privateMetadataPid(privateMetadataPid: Number)

            /** @param scte27Pids the value to be set. */
            public fun scte27Pids(scte27Pids: IResolvable)

            /** @param scte27Pids the value to be set. */
            public fun scte27Pids(scte27Pids: List<Number>)

            /** @param scte27Pids the value to be set. */
            public fun scte27Pids(vararg scte27Pids: Number)

            /** @param scte35Pid the value to be set. */
            public fun scte35Pid(scte35Pid: Number)

            /** @param timedMetadataPid the value to be set. */
            public fun timedMetadataPid(timedMetadataPid: Number)

            /** @param videoPid the value to be set. */
            public fun videoPid(videoPid: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder =
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram
                    .MultiplexProgramPacketIdentifiersMapProperty
                    .builder()

            /** @param audioPids the value to be set. */
            override fun audioPids(audioPids: IResolvable) {
                cdkBuilder.audioPids(audioPids.let(IResolvable::unwrap))
            }

            /** @param audioPids the value to be set. */
            override fun audioPids(audioPids: List<Number>) {
                cdkBuilder.audioPids(audioPids)
            }

            /** @param audioPids the value to be set. */
            override fun audioPids(vararg audioPids: Number): Unit = audioPids(audioPids.toList())

            /** @param dvbSubPids the value to be set. */
            override fun dvbSubPids(dvbSubPids: IResolvable) {
                cdkBuilder.dvbSubPids(dvbSubPids.let(IResolvable::unwrap))
            }

            /** @param dvbSubPids the value to be set. */
            override fun dvbSubPids(dvbSubPids: List<Number>) {
                cdkBuilder.dvbSubPids(dvbSubPids)
            }

            /** @param dvbSubPids the value to be set. */
            override fun dvbSubPids(vararg dvbSubPids: Number): Unit =
                dvbSubPids(dvbSubPids.toList())

            /** @param dvbTeletextPid the value to be set. */
            override fun dvbTeletextPid(dvbTeletextPid: Number) {
                cdkBuilder.dvbTeletextPid(dvbTeletextPid)
            }

            /** @param etvPlatformPid the value to be set. */
            override fun etvPlatformPid(etvPlatformPid: Number) {
                cdkBuilder.etvPlatformPid(etvPlatformPid)
            }

            /** @param etvSignalPid the value to be set. */
            override fun etvSignalPid(etvSignalPid: Number) {
                cdkBuilder.etvSignalPid(etvSignalPid)
            }

            /** @param klvDataPids the value to be set. */
            override fun klvDataPids(klvDataPids: IResolvable) {
                cdkBuilder.klvDataPids(klvDataPids.let(IResolvable::unwrap))
            }

            /** @param klvDataPids the value to be set. */
            override fun klvDataPids(klvDataPids: List<Number>) {
                cdkBuilder.klvDataPids(klvDataPids)
            }

            /** @param klvDataPids the value to be set. */
            override fun klvDataPids(vararg klvDataPids: Number): Unit =
                klvDataPids(klvDataPids.toList())

            /** @param pcrPid the value to be set. */
            override fun pcrPid(pcrPid: Number) {
                cdkBuilder.pcrPid(pcrPid)
            }

            /** @param pmtPid the value to be set. */
            override fun pmtPid(pmtPid: Number) {
                cdkBuilder.pmtPid(pmtPid)
            }

            /** @param privateMetadataPid the value to be set. */
            override fun privateMetadataPid(privateMetadataPid: Number) {
                cdkBuilder.privateMetadataPid(privateMetadataPid)
            }

            /** @param scte27Pids the value to be set. */
            override fun scte27Pids(scte27Pids: IResolvable) {
                cdkBuilder.scte27Pids(scte27Pids.let(IResolvable::unwrap))
            }

            /** @param scte27Pids the value to be set. */
            override fun scte27Pids(scte27Pids: List<Number>) {
                cdkBuilder.scte27Pids(scte27Pids)
            }

            /** @param scte27Pids the value to be set. */
            override fun scte27Pids(vararg scte27Pids: Number): Unit =
                scte27Pids(scte27Pids.toList())

            /** @param scte35Pid the value to be set. */
            override fun scte35Pid(scte35Pid: Number) {
                cdkBuilder.scte35Pid(scte35Pid)
            }

            /** @param timedMetadataPid the value to be set. */
            override fun timedMetadataPid(timedMetadataPid: Number) {
                cdkBuilder.timedMetadataPid(timedMetadataPid)
            }

            /** @param videoPid the value to be set. */
            override fun videoPid(videoPid: Number) {
                cdkBuilder.videoPid(videoPid)
            }

            public fun build():
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty,
        ) : MultiplexProgramPacketIdentifiersMapProperty {
            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-audiopids)
             */
            override fun audioPids(): Any? = unwrap(this).getAudioPids()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-dvbsubpids)
             */
            override fun dvbSubPids(): Any? = unwrap(this).getDvbSubPids()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-dvbteletextpid)
             */
            override fun dvbTeletextPid(): Number? = unwrap(this).getDvbTeletextPid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-etvplatformpid)
             */
            override fun etvPlatformPid(): Number? = unwrap(this).getEtvPlatformPid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-etvsignalpid)
             */
            override fun etvSignalPid(): Number? = unwrap(this).getEtvSignalPid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-klvdatapids)
             */
            override fun klvDataPids(): Any? = unwrap(this).getKlvDataPids()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-pcrpid)
             */
            override fun pcrPid(): Number? = unwrap(this).getPcrPid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-pmtpid)
             */
            override fun pmtPid(): Number? = unwrap(this).getPmtPid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-privatemetadatapid)
             */
            override fun privateMetadataPid(): Number? = unwrap(this).getPrivateMetadataPid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-scte27pids)
             */
            override fun scte27Pids(): Any? = unwrap(this).getScte27Pids()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-scte35pid)
             */
            override fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-timedmetadatapid)
             */
            override fun timedMetadataPid(): Number? = unwrap(this).getTimedMetadataPid()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap.html#cfn-medialive-multiplexprogram-multiplexprogrampacketidentifiersmap-videopid)
             */
            override fun videoPid(): Number? = unwrap(this).getVideoPid()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiplexProgramPacketIdentifiersMapProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty
            ): MultiplexProgramPacketIdentifiersMapProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiplexProgramPacketIdentifiersMapProperty
            ): software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MultiplexProgramPipelineDetailProperty {
        /**
         * Identifies the channel pipeline that is currently active for the pipeline (identified by
         * PipelineId) in the multiplex.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampipelinedetail.html#cfn-medialive-multiplexprogram-multiplexprogrampipelinedetail-activechannelpipeline)
         */
        public fun activeChannelPipeline(): String? = unwrap(this).getActiveChannelPipeline()

        /**
         * Identifies a specific pipeline in the multiplex.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampipelinedetail.html#cfn-medialive-multiplexprogram-multiplexprogrampipelinedetail-pipelineid)
         */
        public fun pipelineId(): String? = unwrap(this).getPipelineId()

        /** A builder for [MultiplexProgramPipelineDetailProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param activeChannelPipeline Identifies the channel pipeline that is currently active
             *   for the pipeline (identified by PipelineId) in the multiplex.
             */
            public fun activeChannelPipeline(activeChannelPipeline: String)

            /** @param pipelineId Identifies a specific pipeline in the multiplex. */
            public fun pipelineId(pipelineId: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty.Builder =
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram
                    .MultiplexProgramPipelineDetailProperty
                    .builder()

            /**
             * @param activeChannelPipeline Identifies the channel pipeline that is currently active
             *   for the pipeline (identified by PipelineId) in the multiplex.
             */
            override fun activeChannelPipeline(activeChannelPipeline: String) {
                cdkBuilder.activeChannelPipeline(activeChannelPipeline)
            }

            /** @param pipelineId Identifies a specific pipeline in the multiplex. */
            override fun pipelineId(pipelineId: String) {
                cdkBuilder.pipelineId(pipelineId)
            }

            public fun build():
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty,
        ) : MultiplexProgramPipelineDetailProperty {
            /**
             * Identifies the channel pipeline that is currently active for the pipeline (identified
             * by PipelineId) in the multiplex.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampipelinedetail.html#cfn-medialive-multiplexprogram-multiplexprogrampipelinedetail-activechannelpipeline)
             */
            override fun activeChannelPipeline(): String? = unwrap(this).getActiveChannelPipeline()

            /**
             * Identifies a specific pipeline in the multiplex.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogrampipelinedetail.html#cfn-medialive-multiplexprogram-multiplexprogrampipelinedetail-pipelineid)
             */
            override fun pipelineId(): String? = unwrap(this).getPipelineId()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiplexProgramPipelineDetailProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty
            ): MultiplexProgramPipelineDetailProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiplexProgramPipelineDetailProperty
            ): software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MultiplexVideoSettingsProperty {
        /**
         * The constant bitrate configuration for the video encode.
         *
         * When this field is defined, StatmuxSettings must be undefined.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexvideosettings.html#cfn-medialive-multiplexprogram-multiplexvideosettings-constantbitrate)
         */
        public fun constantBitrate(): Number? = unwrap(this).getConstantBitrate()

        /**
         * Statmux rate control settings.
         *
         * When this field is defined, ConstantBitrate must be undefined.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexvideosettings.html#cfn-medialive-multiplexprogram-multiplexvideosettings-statmuxsettings)
         */
        public fun statmuxSettings(): Any? = unwrap(this).getStatmuxSettings()

        /** A builder for [MultiplexVideoSettingsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param constantBitrate The constant bitrate configuration for the video encode. When
             *   this field is defined, StatmuxSettings must be undefined.
             */
            public fun constantBitrate(constantBitrate: Number)

            /**
             * @param statmuxSettings Statmux rate control settings. When this field is defined,
             *   ConstantBitrate must be undefined.
             */
            public fun statmuxSettings(statmuxSettings: IResolvable)

            /**
             * @param statmuxSettings Statmux rate control settings. When this field is defined,
             *   ConstantBitrate must be undefined.
             */
            public fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty)

            /**
             * @param statmuxSettings Statmux rate control settings. When this field is defined,
             *   ConstantBitrate must be undefined.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("7ddc73ffa0466c7d988ca6e4e973c2f917fd50220bbadb87eb7cb973fb23a464")
            public fun statmuxSettings(
                statmuxSettings: MultiplexStatmuxVideoSettingsProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty.Builder =
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram
                    .MultiplexVideoSettingsProperty
                    .builder()

            /**
             * @param constantBitrate The constant bitrate configuration for the video encode. When
             *   this field is defined, StatmuxSettings must be undefined.
             */
            override fun constantBitrate(constantBitrate: Number) {
                cdkBuilder.constantBitrate(constantBitrate)
            }

            /**
             * @param statmuxSettings Statmux rate control settings. When this field is defined,
             *   ConstantBitrate must be undefined.
             */
            override fun statmuxSettings(statmuxSettings: IResolvable) {
                cdkBuilder.statmuxSettings(statmuxSettings.let(IResolvable::unwrap))
            }

            /**
             * @param statmuxSettings Statmux rate control settings. When this field is defined,
             *   ConstantBitrate must be undefined.
             */
            override fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty) {
                cdkBuilder.statmuxSettings(
                    statmuxSettings.let(MultiplexStatmuxVideoSettingsProperty::unwrap)
                )
            }

            /**
             * @param statmuxSettings Statmux rate control settings. When this field is defined,
             *   ConstantBitrate must be undefined.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("7ddc73ffa0466c7d988ca6e4e973c2f917fd50220bbadb87eb7cb973fb23a464")
            override fun statmuxSettings(
                statmuxSettings: MultiplexStatmuxVideoSettingsProperty.Builder.() -> Unit
            ): Unit = statmuxSettings(MultiplexStatmuxVideoSettingsProperty(statmuxSettings))

            public fun build():
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty,
        ) : MultiplexVideoSettingsProperty {
            /**
             * The constant bitrate configuration for the video encode.
             *
             * When this field is defined, StatmuxSettings must be undefined.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexvideosettings.html#cfn-medialive-multiplexprogram-multiplexvideosettings-constantbitrate)
             */
            override fun constantBitrate(): Number? = unwrap(this).getConstantBitrate()

            /**
             * Statmux rate control settings.
             *
             * When this field is defined, ConstantBitrate must be undefined.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexvideosettings.html#cfn-medialive-multiplexprogram-multiplexvideosettings-statmuxsettings)
             */
            override fun statmuxSettings(): Any? = unwrap(this).getStatmuxSettings()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiplexVideoSettingsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty
            ): MultiplexVideoSettingsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiplexVideoSettingsProperty
            ): software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MultiplexProgramSettingsProperty {
        /**
         * Indicates which pipeline is preferred by the multiplex for program ingest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-preferredchannelpipeline)
         */
        public fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

        /**
         * Unique program number.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-programnumber)
         */
        public fun programNumber(): Number

        /**
         * Transport stream service descriptor configuration for the Multiplex program.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-servicedescriptor)
         */
        public fun serviceDescriptor(): Any? = unwrap(this).getServiceDescriptor()

        /**
         * Program video settings configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-videosettings)
         */
        public fun videoSettings(): Any? = unwrap(this).getVideoSettings()

        /** A builder for [MultiplexProgramSettingsProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param preferredChannelPipeline Indicates which pipeline is preferred by the
             *   multiplex for program ingest.
             */
            public fun preferredChannelPipeline(preferredChannelPipeline: String)

            /** @param programNumber Unique program number. */
            public fun programNumber(programNumber: Number)

            /**
             * @param serviceDescriptor Transport stream service descriptor configuration for the
             *   Multiplex program.
             */
            public fun serviceDescriptor(serviceDescriptor: IResolvable)

            /**
             * @param serviceDescriptor Transport stream service descriptor configuration for the
             *   Multiplex program.
             */
            public fun serviceDescriptor(
                serviceDescriptor: MultiplexProgramServiceDescriptorProperty
            )

            /**
             * @param serviceDescriptor Transport stream service descriptor configuration for the
             *   Multiplex program.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6a6e846fd554323f07f8275310eea9b910309617d1c8b914a665f964a6fc7f59")
            public fun serviceDescriptor(
                serviceDescriptor: MultiplexProgramServiceDescriptorProperty.Builder.() -> Unit
            )

            /** @param videoSettings Program video settings configuration. */
            public fun videoSettings(videoSettings: IResolvable)

            /** @param videoSettings Program video settings configuration. */
            public fun videoSettings(videoSettings: MultiplexVideoSettingsProperty)

            /** @param videoSettings Program video settings configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("70cbefc78833f7ffe5fb191287577c2b3a7c0588ffd239d944a6c3cf3749857c")
            public fun videoSettings(
                videoSettings: MultiplexVideoSettingsProperty.Builder.() -> Unit
            )
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder =
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram
                    .MultiplexProgramSettingsProperty
                    .builder()

            /**
             * @param preferredChannelPipeline Indicates which pipeline is preferred by the
             *   multiplex for program ingest.
             */
            override fun preferredChannelPipeline(preferredChannelPipeline: String) {
                cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
            }

            /** @param programNumber Unique program number. */
            override fun programNumber(programNumber: Number) {
                cdkBuilder.programNumber(programNumber)
            }

            /**
             * @param serviceDescriptor Transport stream service descriptor configuration for the
             *   Multiplex program.
             */
            override fun serviceDescriptor(serviceDescriptor: IResolvable) {
                cdkBuilder.serviceDescriptor(serviceDescriptor.let(IResolvable::unwrap))
            }

            /**
             * @param serviceDescriptor Transport stream service descriptor configuration for the
             *   Multiplex program.
             */
            override fun serviceDescriptor(
                serviceDescriptor: MultiplexProgramServiceDescriptorProperty
            ) {
                cdkBuilder.serviceDescriptor(
                    serviceDescriptor.let(MultiplexProgramServiceDescriptorProperty::unwrap)
                )
            }

            /**
             * @param serviceDescriptor Transport stream service descriptor configuration for the
             *   Multiplex program.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("6a6e846fd554323f07f8275310eea9b910309617d1c8b914a665f964a6fc7f59")
            override fun serviceDescriptor(
                serviceDescriptor: MultiplexProgramServiceDescriptorProperty.Builder.() -> Unit
            ): Unit =
                serviceDescriptor(MultiplexProgramServiceDescriptorProperty(serviceDescriptor))

            /** @param videoSettings Program video settings configuration. */
            override fun videoSettings(videoSettings: IResolvable) {
                cdkBuilder.videoSettings(videoSettings.let(IResolvable::unwrap))
            }

            /** @param videoSettings Program video settings configuration. */
            override fun videoSettings(videoSettings: MultiplexVideoSettingsProperty) {
                cdkBuilder.videoSettings(videoSettings.let(MultiplexVideoSettingsProperty::unwrap))
            }

            /** @param videoSettings Program video settings configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("70cbefc78833f7ffe5fb191287577c2b3a7c0588ffd239d944a6c3cf3749857c")
            override fun videoSettings(
                videoSettings: MultiplexVideoSettingsProperty.Builder.() -> Unit
            ): Unit = videoSettings(MultiplexVideoSettingsProperty(videoSettings))

            public fun build():
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty,
        ) : MultiplexProgramSettingsProperty {
            /**
             * Indicates which pipeline is preferred by the multiplex for program ingest.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-preferredchannelpipeline)
             */
            override fun preferredChannelPipeline(): String? =
                unwrap(this).getPreferredChannelPipeline()

            /**
             * Unique program number.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-programnumber)
             */
            override fun programNumber(): Number = unwrap(this).getProgramNumber()

            /**
             * Transport stream service descriptor configuration for the Multiplex program.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-servicedescriptor)
             */
            override fun serviceDescriptor(): Any? = unwrap(this).getServiceDescriptor()

            /**
             * Program video settings configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramsettings.html#cfn-medialive-multiplexprogram-multiplexprogramsettings-videosettings)
             */
            override fun videoSettings(): Any? = unwrap(this).getVideoSettings()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiplexProgramSettingsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty
            ): MultiplexProgramSettingsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiplexProgramSettingsProperty
            ): software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MultiplexStatmuxVideoSettingsProperty {
        /**
         * Maximum statmux bitrate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexstatmuxvideosettings.html#cfn-medialive-multiplexprogram-multiplexstatmuxvideosettings-maximumbitrate)
         */
        public fun maximumBitrate(): Number? = unwrap(this).getMaximumBitrate()

        /**
         * Minimum statmux bitrate.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexstatmuxvideosettings.html#cfn-medialive-multiplexprogram-multiplexstatmuxvideosettings-minimumbitrate)
         */
        public fun minimumBitrate(): Number? = unwrap(this).getMinimumBitrate()

        /**
         * The purpose of the priority is to use a combination of the\nmultiplex rate control
         * algorithm and the QVBR capability of the\nencoder to prioritize the video quality of some
         * channels in a\nmultiplex over others.
         *
         * Channels that have a higher priority will\nget higher video quality at the expense of the
         * video quality of\nother channels in the multiplex with lower priority.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexstatmuxvideosettings.html#cfn-medialive-multiplexprogram-multiplexstatmuxvideosettings-priority)
         */
        public fun priority(): Number? = unwrap(this).getPriority()

        /** A builder for [MultiplexStatmuxVideoSettingsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param maximumBitrate Maximum statmux bitrate. */
            public fun maximumBitrate(maximumBitrate: Number)

            /** @param minimumBitrate Minimum statmux bitrate. */
            public fun minimumBitrate(minimumBitrate: Number)

            /**
             * @param priority The purpose of the priority is to use a combination of the\nmultiplex
             *   rate control algorithm and the QVBR capability of the\nencoder to prioritize the
             *   video quality of some channels in a\nmultiplex over others. Channels that have a
             *   higher priority will\nget higher video quality at the expense of the video quality
             *   of\nother channels in the multiplex with lower priority.
             */
            public fun priority(priority: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty.Builder =
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram
                    .MultiplexStatmuxVideoSettingsProperty
                    .builder()

            /** @param maximumBitrate Maximum statmux bitrate. */
            override fun maximumBitrate(maximumBitrate: Number) {
                cdkBuilder.maximumBitrate(maximumBitrate)
            }

            /** @param minimumBitrate Minimum statmux bitrate. */
            override fun minimumBitrate(minimumBitrate: Number) {
                cdkBuilder.minimumBitrate(minimumBitrate)
            }

            /**
             * @param priority The purpose of the priority is to use a combination of the\nmultiplex
             *   rate control algorithm and the QVBR capability of the\nencoder to prioritize the
             *   video quality of some channels in a\nmultiplex over others. Channels that have a
             *   higher priority will\nget higher video quality at the expense of the video quality
             *   of\nother channels in the multiplex with lower priority.
             */
            override fun priority(priority: Number) {
                cdkBuilder.priority(priority)
            }

            public fun build():
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty,
        ) : MultiplexStatmuxVideoSettingsProperty {
            /**
             * Maximum statmux bitrate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexstatmuxvideosettings.html#cfn-medialive-multiplexprogram-multiplexstatmuxvideosettings-maximumbitrate)
             */
            override fun maximumBitrate(): Number? = unwrap(this).getMaximumBitrate()

            /**
             * Minimum statmux bitrate.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexstatmuxvideosettings.html#cfn-medialive-multiplexprogram-multiplexstatmuxvideosettings-minimumbitrate)
             */
            override fun minimumBitrate(): Number? = unwrap(this).getMinimumBitrate()

            /**
             * The purpose of the priority is to use a combination of the\nmultiplex rate control
             * algorithm and the QVBR capability of the\nencoder to prioritize the video quality of
             * some channels in a\nmultiplex over others.
             *
             * Channels that have a higher priority will\nget higher video quality at the expense of
             * the video quality of\nother channels in the multiplex with lower priority.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexstatmuxvideosettings.html#cfn-medialive-multiplexprogram-multiplexstatmuxvideosettings-priority)
             */
            override fun priority(): Number? = unwrap(this).getPriority()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiplexStatmuxVideoSettingsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty
            ): MultiplexStatmuxVideoSettingsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiplexStatmuxVideoSettingsProperty
            ): software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MultiplexProgramServiceDescriptorProperty {
        /**
         * Name of the provider.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramservicedescriptor.html#cfn-medialive-multiplexprogram-multiplexprogramservicedescriptor-providername)
         */
        public fun providerName(): String

        /**
         * Name of the service.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramservicedescriptor.html#cfn-medialive-multiplexprogram-multiplexprogramservicedescriptor-servicename)
         */
        public fun serviceName(): String

        /** A builder for [MultiplexProgramServiceDescriptorProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param providerName Name of the provider. */
            public fun providerName(providerName: String)

            /** @param serviceName Name of the service. */
            public fun serviceName(serviceName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty.Builder =
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram
                    .MultiplexProgramServiceDescriptorProperty
                    .builder()

            /** @param providerName Name of the provider. */
            override fun providerName(providerName: String) {
                cdkBuilder.providerName(providerName)
            }

            /** @param serviceName Name of the service. */
            override fun serviceName(serviceName: String) {
                cdkBuilder.serviceName(serviceName)
            }

            public fun build():
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty,
        ) : MultiplexProgramServiceDescriptorProperty {
            /**
             * Name of the provider.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramservicedescriptor.html#cfn-medialive-multiplexprogram-multiplexprogramservicedescriptor-providername)
             */
            override fun providerName(): String = unwrap(this).getProviderName()

            /**
             * Name of the service.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexprogramservicedescriptor.html#cfn-medialive-multiplexprogram-multiplexprogramservicedescriptor-servicename)
             */
            override fun serviceName(): String = unwrap(this).getServiceName()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): MultiplexProgramServiceDescriptorProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty
            ): MultiplexProgramServiceDescriptorProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MultiplexProgramServiceDescriptorProperty
            ): software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
