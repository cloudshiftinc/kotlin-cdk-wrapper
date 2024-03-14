package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDecoderManifest
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The Amazon Resource Name (ARN) of the decoder manifest. */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight
     * UTC time).
     */
    public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

    /**
     * The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at
     * midnight UTC time).
     */
    public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

    /** (Optional) A brief description of the decoder manifest. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** (Optional) A brief description of the decoder manifest. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of a vehicle model (model manifest) associated with the
     * decoder manifest.
     */
    public open fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

    /**
     * The Amazon Resource Name (ARN) of a vehicle model (model manifest) associated with the
     * decoder manifest.
     */
    public open fun modelManifestArn(`value`: String) {
        unwrap(this).setModelManifestArn(`value`)
    }

    /** The name of the decoder manifest. */
    public open fun name(): String = unwrap(this).getName()

    /** The name of the decoder manifest. */
    public open fun name(`value`: String) {
        unwrap(this).setName(`value`)
    }

    /** (Optional) A list of information about available network interfaces. */
    public open fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /** (Optional) A list of information about available network interfaces. */
    public open fun networkInterfaces(`value`: IResolvable) {
        unwrap(this).setNetworkInterfaces(`value`.let(IResolvable::unwrap))
    }

    /** (Optional) A list of information about available network interfaces. */
    public open fun networkInterfaces(__idx_ac66f0: List<Any>) {
        unwrap(this).setNetworkInterfaces(__idx_ac66f0)
    }

    /** (Optional) A list of information about available network interfaces. */
    public open fun networkInterfaces(vararg __idx_ac66f0: Any): Unit =
        networkInterfaces(__idx_ac66f0.toList())

    /** (Optional) A list of information about signal decoders. */
    public open fun signalDecoders(): Any? = unwrap(this).getSignalDecoders()

    /** (Optional) A list of information about signal decoders. */
    public open fun signalDecoders(`value`: IResolvable) {
        unwrap(this).setSignalDecoders(`value`.let(IResolvable::unwrap))
    }

    /** (Optional) A list of information about signal decoders. */
    public open fun signalDecoders(__idx_ac66f0: List<Any>) {
        unwrap(this).setSignalDecoders(__idx_ac66f0)
    }

    /** (Optional) A list of information about signal decoders. */
    public open fun signalDecoders(vararg __idx_ac66f0: Any): Unit =
        signalDecoders(__idx_ac66f0.toList())

    /** (Optional) The state of the decoder manifest. */
    public open fun status(): String? = unwrap(this).getStatus()

    /** (Optional) The state of the decoder manifest. */
    public open fun status(`value`: String) {
        unwrap(this).setStatus(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** (Optional) Metadata that can be used to manage the decoder manifest. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** (Optional) Metadata that can be used to manage the decoder manifest. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** (Optional) Metadata that can be used to manage the decoder manifest. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleetwise.CfnDecoderManifest]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * (Optional) A brief description of the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-description)
         *
         * @param description (Optional) A brief description of the decoder manifest.
         */
        public fun description(description: String)

        /**
         * The Amazon Resource Name (ARN) of a vehicle model (model manifest) associated with the
         * decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-modelmanifestarn)
         *
         * @param modelManifestArn The Amazon Resource Name (ARN) of a vehicle model (model
         *   manifest) associated with the decoder manifest.
         */
        public fun modelManifestArn(modelManifestArn: String)

        /**
         * The name of the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-name)
         *
         * @param name The name of the decoder manifest.
         */
        public fun name(name: String)

        /**
         * (Optional) A list of information about available network interfaces.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
         *
         * @param networkInterfaces (Optional) A list of information about available network
         *   interfaces.
         */
        public fun networkInterfaces(networkInterfaces: IResolvable)

        /**
         * (Optional) A list of information about available network interfaces.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
         *
         * @param networkInterfaces (Optional) A list of information about available network
         *   interfaces.
         */
        public fun networkInterfaces(networkInterfaces: List<Any>)

        /**
         * (Optional) A list of information about available network interfaces.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
         *
         * @param networkInterfaces (Optional) A list of information about available network
         *   interfaces.
         */
        public fun networkInterfaces(vararg networkInterfaces: Any)

        /**
         * (Optional) A list of information about signal decoders.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
         *
         * @param signalDecoders (Optional) A list of information about signal decoders.
         */
        public fun signalDecoders(signalDecoders: IResolvable)

        /**
         * (Optional) A list of information about signal decoders.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
         *
         * @param signalDecoders (Optional) A list of information about signal decoders.
         */
        public fun signalDecoders(signalDecoders: List<Any>)

        /**
         * (Optional) A list of information about signal decoders.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
         *
         * @param signalDecoders (Optional) A list of information about signal decoders.
         */
        public fun signalDecoders(vararg signalDecoders: Any)

        /**
         * (Optional) The state of the decoder manifest.
         *
         * If the status is `ACTIVE` , the decoder manifest can't be edited. If the status is marked
         * `DRAFT` , you can edit the decoder manifest.
         *
         * Default: - "DRAFT"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-status)
         *
         * @param status (Optional) The state of the decoder manifest.
         */
        public fun status(status: String)

        /**
         * (Optional) Metadata that can be used to manage the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-tags)
         *
         * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * (Optional) Metadata that can be used to manage the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-tags)
         *
         * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.Builder =
            software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.Builder.create(
                scope,
                id
            )

        /**
         * (Optional) A brief description of the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-description)
         *
         * @param description (Optional) A brief description of the decoder manifest.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * The Amazon Resource Name (ARN) of a vehicle model (model manifest) associated with the
         * decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-modelmanifestarn)
         *
         * @param modelManifestArn The Amazon Resource Name (ARN) of a vehicle model (model
         *   manifest) associated with the decoder manifest.
         */
        override fun modelManifestArn(modelManifestArn: String) {
            cdkBuilder.modelManifestArn(modelManifestArn)
        }

        /**
         * The name of the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-name)
         *
         * @param name The name of the decoder manifest.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * (Optional) A list of information about available network interfaces.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
         *
         * @param networkInterfaces (Optional) A list of information about available network
         *   interfaces.
         */
        override fun networkInterfaces(networkInterfaces: IResolvable) {
            cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
        }

        /**
         * (Optional) A list of information about available network interfaces.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
         *
         * @param networkInterfaces (Optional) A list of information about available network
         *   interfaces.
         */
        override fun networkInterfaces(networkInterfaces: List<Any>) {
            cdkBuilder.networkInterfaces(networkInterfaces)
        }

        /**
         * (Optional) A list of information about available network interfaces.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
         *
         * @param networkInterfaces (Optional) A list of information about available network
         *   interfaces.
         */
        override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
            networkInterfaces(networkInterfaces.toList())

        /**
         * (Optional) A list of information about signal decoders.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
         *
         * @param signalDecoders (Optional) A list of information about signal decoders.
         */
        override fun signalDecoders(signalDecoders: IResolvable) {
            cdkBuilder.signalDecoders(signalDecoders.let(IResolvable::unwrap))
        }

        /**
         * (Optional) A list of information about signal decoders.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
         *
         * @param signalDecoders (Optional) A list of information about signal decoders.
         */
        override fun signalDecoders(signalDecoders: List<Any>) {
            cdkBuilder.signalDecoders(signalDecoders)
        }

        /**
         * (Optional) A list of information about signal decoders.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
         *
         * @param signalDecoders (Optional) A list of information about signal decoders.
         */
        override fun signalDecoders(vararg signalDecoders: Any): Unit =
            signalDecoders(signalDecoders.toList())

        /**
         * (Optional) The state of the decoder manifest.
         *
         * If the status is `ACTIVE` , the decoder manifest can't be edited. If the status is marked
         * `DRAFT` , you can edit the decoder manifest.
         *
         * Default: - "DRAFT"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-status)
         *
         * @param status (Optional) The state of the decoder manifest.
         */
        override fun status(status: String) {
            cdkBuilder.status(status)
        }

        /**
         * (Optional) Metadata that can be used to manage the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-tags)
         *
         * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * (Optional) Metadata that can be used to manage the decoder manifest.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-tags)
         *
         * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnDecoderManifest {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnDecoderManifest(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
        ): CfnDecoderManifest = CfnDecoderManifest(cdkObject)

        internal fun unwrap(
            wrapped: CfnDecoderManifest
        ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest = wrapped.cdkObject
    }

    public interface CanInterfaceProperty {
        /**
         * The unique name of the interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-caninterface.html#cfn-iotfleetwise-decodermanifest-caninterface-name)
         */
        public fun name(): String

        /**
         * (Optional) The name of the communication protocol for the interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-caninterface.html#cfn-iotfleetwise-decodermanifest-caninterface-protocolname)
         */
        public fun protocolName(): String? = unwrap(this).getProtocolName()

        /**
         * (Optional) The version of the communication protocol for the interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-caninterface.html#cfn-iotfleetwise-decodermanifest-caninterface-protocolversion)
         */
        public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

        /** A builder for [CanInterfaceProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param name The unique name of the interface. */
            public fun name(name: String)

            /**
             * @param protocolName (Optional) The name of the communication protocol for the
             *   interface.
             */
            public fun protocolName(protocolName: String)

            /**
             * @param protocolVersion (Optional) The version of the communication protocol for the
             *   interface.
             */
            public fun protocolVersion(protocolVersion: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty
                    .builder()

            /** @param name The unique name of the interface. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param protocolName (Optional) The name of the communication protocol for the
             *   interface.
             */
            override fun protocolName(protocolName: String) {
                cdkBuilder.protocolName(protocolName)
            }

            /**
             * @param protocolVersion (Optional) The version of the communication protocol for the
             *   interface.
             */
            override fun protocolVersion(protocolVersion: String) {
                cdkBuilder.protocolVersion(protocolVersion)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty,
        ) : CanInterfaceProperty {
            /**
             * The unique name of the interface.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-caninterface.html#cfn-iotfleetwise-decodermanifest-caninterface-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * (Optional) The name of the communication protocol for the interface.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-caninterface.html#cfn-iotfleetwise-decodermanifest-caninterface-protocolname)
             */
            override fun protocolName(): String? = unwrap(this).getProtocolName()

            /**
             * (Optional) The version of the communication protocol for the interface.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-caninterface.html#cfn-iotfleetwise-decodermanifest-caninterface-protocolversion)
             */
            override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CanInterfaceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty
            ): CanInterfaceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CanInterfaceProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ObdSignalProperty {
        /**
         * (Optional) The number of bits to mask in a message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-bitmasklength)
         */
        public fun bitMaskLength(): String? = unwrap(this).getBitMaskLength()

        /**
         * (Optional) The number of positions to shift bits in the message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-bitrightshift)
         */
        public fun bitRightShift(): String? = unwrap(this).getBitRightShift()

        /**
         * The length of a message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-bytelength)
         */
        public fun byteLength(): String

        /**
         * The offset used to calculate the signal value.
         *
         * Combined with scaling, the calculation is `value = raw_value * scaling + offset` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-offset)
         */
        public fun offset(): String

        /**
         * The diagnostic code used to request data from a vehicle for this signal.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-pid)
         */
        public fun pid(): String

        /**
         * The length of the requested data.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-pidresponselength)
         */
        public fun pidResponseLength(): String

        /**
         * A multiplier used to decode the message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-scaling)
         */
        public fun scaling(): String

        /**
         * The mode of operation (diagnostic service) in a message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-servicemode)
         */
        public fun serviceMode(): String

        /**
         * Indicates the beginning of the message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-startbyte)
         */
        public fun startByte(): String

        /** A builder for [ObdSignalProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param bitMaskLength (Optional) The number of bits to mask in a message. */
            public fun bitMaskLength(bitMaskLength: String)

            /**
             * @param bitRightShift (Optional) The number of positions to shift bits in the message.
             */
            public fun bitRightShift(bitRightShift: String)

            /** @param byteLength The length of a message. */
            public fun byteLength(byteLength: String)

            /**
             * @param offset The offset used to calculate the signal value. Combined with scaling,
             *   the calculation is `value = raw_value * scaling + offset` .
             */
            public fun offset(offset: String)

            /**
             * @param pid The diagnostic code used to request data from a vehicle for this signal.
             */
            public fun pid(pid: String)

            /** @param pidResponseLength The length of the requested data. */
            public fun pidResponseLength(pidResponseLength: String)

            /** @param scaling A multiplier used to decode the message. */
            public fun scaling(scaling: String)

            /** @param serviceMode The mode of operation (diagnostic service) in a message. */
            public fun serviceMode(serviceMode: String)

            /** @param startByte Indicates the beginning of the message. */
            public fun startByte(startByte: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty
                    .builder()

            /** @param bitMaskLength (Optional) The number of bits to mask in a message. */
            override fun bitMaskLength(bitMaskLength: String) {
                cdkBuilder.bitMaskLength(bitMaskLength)
            }

            /**
             * @param bitRightShift (Optional) The number of positions to shift bits in the message.
             */
            override fun bitRightShift(bitRightShift: String) {
                cdkBuilder.bitRightShift(bitRightShift)
            }

            /** @param byteLength The length of a message. */
            override fun byteLength(byteLength: String) {
                cdkBuilder.byteLength(byteLength)
            }

            /**
             * @param offset The offset used to calculate the signal value. Combined with scaling,
             *   the calculation is `value = raw_value * scaling + offset` .
             */
            override fun offset(offset: String) {
                cdkBuilder.offset(offset)
            }

            /**
             * @param pid The diagnostic code used to request data from a vehicle for this signal.
             */
            override fun pid(pid: String) {
                cdkBuilder.pid(pid)
            }

            /** @param pidResponseLength The length of the requested data. */
            override fun pidResponseLength(pidResponseLength: String) {
                cdkBuilder.pidResponseLength(pidResponseLength)
            }

            /** @param scaling A multiplier used to decode the message. */
            override fun scaling(scaling: String) {
                cdkBuilder.scaling(scaling)
            }

            /** @param serviceMode The mode of operation (diagnostic service) in a message. */
            override fun serviceMode(serviceMode: String) {
                cdkBuilder.serviceMode(serviceMode)
            }

            /** @param startByte Indicates the beginning of the message. */
            override fun startByte(startByte: String) {
                cdkBuilder.startByte(startByte)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty,
        ) : ObdSignalProperty {
            /**
             * (Optional) The number of bits to mask in a message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-bitmasklength)
             */
            override fun bitMaskLength(): String? = unwrap(this).getBitMaskLength()

            /**
             * (Optional) The number of positions to shift bits in the message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-bitrightshift)
             */
            override fun bitRightShift(): String? = unwrap(this).getBitRightShift()

            /**
             * The length of a message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-bytelength)
             */
            override fun byteLength(): String = unwrap(this).getByteLength()

            /**
             * The offset used to calculate the signal value.
             *
             * Combined with scaling, the calculation is `value = raw_value * scaling + offset` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-offset)
             */
            override fun offset(): String = unwrap(this).getOffset()

            /**
             * The diagnostic code used to request data from a vehicle for this signal.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-pid)
             */
            override fun pid(): String = unwrap(this).getPid()

            /**
             * The length of the requested data.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-pidresponselength)
             */
            override fun pidResponseLength(): String = unwrap(this).getPidResponseLength()

            /**
             * A multiplier used to decode the message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-scaling)
             */
            override fun scaling(): String = unwrap(this).getScaling()

            /**
             * The mode of operation (diagnostic service) in a message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-servicemode)
             */
            override fun serviceMode(): String = unwrap(this).getServiceMode()

            /**
             * Indicates the beginning of the message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignal.html#cfn-iotfleetwise-decodermanifest-obdsignal-startbyte)
             */
            override fun startByte(): String = unwrap(this).getStartByte()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ObdSignalProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty
            ): ObdSignalProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ObdSignalProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ObdNetworkInterfaceProperty {
        /**
         * The ID of the network interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html#cfn-iotfleetwise-decodermanifest-obdnetworkinterface-interfaceid)
         */
        public fun interfaceId(): String

        /**
         * (Optional) Information about a network interface specified by the On-board diagnostic
         * (OBD) II protocol.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html#cfn-iotfleetwise-decodermanifest-obdnetworkinterface-obdinterface)
         */
        public fun obdInterface(): Any

        /**
         * The network protocol for the vehicle.
         *
         * For example, `CAN_SIGNAL` specifies a protocol that defines how data is communicated
         * between electronic control units (ECUs). `OBD_SIGNAL` specifies a protocol that defines
         * how self-diagnostic data is communicated between ECUs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html#cfn-iotfleetwise-decodermanifest-obdnetworkinterface-type)
         */
        public fun type(): String

        /** A builder for [ObdNetworkInterfaceProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param interfaceId The ID of the network interface. */
            public fun interfaceId(interfaceId: String)

            /**
             * @param obdInterface (Optional) Information about a network interface specified by the
             *   On-board diagnostic (OBD) II protocol.
             */
            public fun obdInterface(obdInterface: IResolvable)

            /**
             * @param obdInterface (Optional) Information about a network interface specified by the
             *   On-board diagnostic (OBD) II protocol.
             */
            public fun obdInterface(obdInterface: ObdInterfaceProperty)

            /**
             * @param obdInterface (Optional) Information about a network interface specified by the
             *   On-board diagnostic (OBD) II protocol.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0b4e925efad6770cab1c4f601f1ca931315944f146f2e4ff09af99a7ecf270c6")
            public fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit)

            /**
             * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies
             *   a protocol that defines how data is communicated between electronic control units
             *   (ECUs). `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is
             *   communicated between ECUs.
             */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
                    .ObdNetworkInterfaceProperty
                    .builder()

            /** @param interfaceId The ID of the network interface. */
            override fun interfaceId(interfaceId: String) {
                cdkBuilder.interfaceId(interfaceId)
            }

            /**
             * @param obdInterface (Optional) Information about a network interface specified by the
             *   On-board diagnostic (OBD) II protocol.
             */
            override fun obdInterface(obdInterface: IResolvable) {
                cdkBuilder.obdInterface(obdInterface.let(IResolvable::unwrap))
            }

            /**
             * @param obdInterface (Optional) Information about a network interface specified by the
             *   On-board diagnostic (OBD) II protocol.
             */
            override fun obdInterface(obdInterface: ObdInterfaceProperty) {
                cdkBuilder.obdInterface(obdInterface.let(ObdInterfaceProperty::unwrap))
            }

            /**
             * @param obdInterface (Optional) Information about a network interface specified by the
             *   On-board diagnostic (OBD) II protocol.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("0b4e925efad6770cab1c4f601f1ca931315944f146f2e4ff09af99a7ecf270c6")
            override fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit): Unit =
                obdInterface(ObdInterfaceProperty(obdInterface))

            /**
             * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies
             *   a protocol that defines how data is communicated between electronic control units
             *   (ECUs). `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is
             *   communicated between ECUs.
             */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty,
        ) : ObdNetworkInterfaceProperty {
            /**
             * The ID of the network interface.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html#cfn-iotfleetwise-decodermanifest-obdnetworkinterface-interfaceid)
             */
            override fun interfaceId(): String = unwrap(this).getInterfaceId()

            /**
             * (Optional) Information about a network interface specified by the On-board diagnostic
             * (OBD) II protocol.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html#cfn-iotfleetwise-decodermanifest-obdnetworkinterface-obdinterface)
             */
            override fun obdInterface(): Any = unwrap(this).getObdInterface()

            /**
             * The network protocol for the vehicle.
             *
             * For example, `CAN_SIGNAL` specifies a protocol that defines how data is communicated
             * between electronic control units (ECUs). `OBD_SIGNAL` specifies a protocol that
             * defines how self-diagnostic data is communicated between ECUs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdnetworkinterface.html#cfn-iotfleetwise-decodermanifest-obdnetworkinterface-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ObdNetworkInterfaceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty
            ): ObdNetworkInterfaceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ObdNetworkInterfaceProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ObdSignalDecoderProperty {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-fullyqualifiedname)
         */
        public fun fullyQualifiedName(): String

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-interfaceid)
         */
        public fun interfaceId(): String

        /**
         * Information about signal messages using the on-board diagnostics (OBD) II protocol in a
         * vehicle.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-obdsignal)
         */
        public fun obdSignal(): Any

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-type)
         */
        public fun type(): String

        /** A builder for [ObdSignalDecoderProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param fullyQualifiedName the value to be set. */
            public fun fullyQualifiedName(fullyQualifiedName: String)

            /** @param interfaceId the value to be set. */
            public fun interfaceId(interfaceId: String)

            /**
             * @param obdSignal Information about signal messages using the on-board diagnostics
             *   (OBD) II protocol in a vehicle.
             */
            public fun obdSignal(obdSignal: IResolvable)

            /**
             * @param obdSignal Information about signal messages using the on-board diagnostics
             *   (OBD) II protocol in a vehicle.
             */
            public fun obdSignal(obdSignal: ObdSignalProperty)

            /**
             * @param obdSignal Information about signal messages using the on-board diagnostics
             *   (OBD) II protocol in a vehicle.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("545450d963d2c02495fc803f670fba23cdd13545e14eb56d63ec0a8a0ac6c982")
            public fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit)

            /** @param type the value to be set. */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
                    .ObdSignalDecoderProperty
                    .builder()

            /** @param fullyQualifiedName the value to be set. */
            override fun fullyQualifiedName(fullyQualifiedName: String) {
                cdkBuilder.fullyQualifiedName(fullyQualifiedName)
            }

            /** @param interfaceId the value to be set. */
            override fun interfaceId(interfaceId: String) {
                cdkBuilder.interfaceId(interfaceId)
            }

            /**
             * @param obdSignal Information about signal messages using the on-board diagnostics
             *   (OBD) II protocol in a vehicle.
             */
            override fun obdSignal(obdSignal: IResolvable) {
                cdkBuilder.obdSignal(obdSignal.let(IResolvable::unwrap))
            }

            /**
             * @param obdSignal Information about signal messages using the on-board diagnostics
             *   (OBD) II protocol in a vehicle.
             */
            override fun obdSignal(obdSignal: ObdSignalProperty) {
                cdkBuilder.obdSignal(obdSignal.let(ObdSignalProperty::unwrap))
            }

            /**
             * @param obdSignal Information about signal messages using the on-board diagnostics
             *   (OBD) II protocol in a vehicle.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("545450d963d2c02495fc803f670fba23cdd13545e14eb56d63ec0a8a0ac6c982")
            override fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit): Unit =
                obdSignal(ObdSignalProperty(obdSignal))

            /** @param type the value to be set. */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty,
        ) : ObdSignalDecoderProperty {
            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-fullyqualifiedname)
             */
            override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-interfaceid)
             */
            override fun interfaceId(): String = unwrap(this).getInterfaceId()

            /**
             * Information about signal messages using the on-board diagnostics (OBD) II protocol in
             * a vehicle.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-obdsignal)
             */
            override fun obdSignal(): Any = unwrap(this).getObdSignal()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdsignaldecoder.html#cfn-iotfleetwise-decodermanifest-obdsignaldecoder-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ObdSignalDecoderProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty
            ): ObdSignalDecoderProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ObdSignalDecoderProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ObdInterfaceProperty {
        /**
         * (Optional) The maximum number message requests per diagnostic trouble code per second.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-dtcrequestintervalseconds)
         */
        public fun dtcRequestIntervalSeconds(): String? =
            unwrap(this).getDtcRequestIntervalSeconds()

        /**
         * (Optional) Whether the vehicle has a transmission control module (TCM).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-hastransmissionecu)
         */
        public fun hasTransmissionEcu(): String? = unwrap(this).getHasTransmissionEcu()

        /**
         * The name of the interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-name)
         */
        public fun name(): String

        /**
         * (Optional) The standard OBD II PID.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-obdstandard)
         */
        public fun obdStandard(): String? = unwrap(this).getObdStandard()

        /**
         * (Optional) The maximum number message requests per second.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-pidrequestintervalseconds)
         */
        public fun pidRequestIntervalSeconds(): String? =
            unwrap(this).getPidRequestIntervalSeconds()

        /**
         * The ID of the message requesting vehicle data.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-requestmessageid)
         */
        public fun requestMessageId(): String

        /**
         * (Optional) Whether to use extended IDs in the message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-useextendedids)
         */
        public fun useExtendedIds(): String? = unwrap(this).getUseExtendedIds()

        /** A builder for [ObdInterfaceProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param dtcRequestIntervalSeconds (Optional) The maximum number message requests per
             *   diagnostic trouble code per second.
             */
            public fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String)

            /**
             * @param hasTransmissionEcu (Optional) Whether the vehicle has a transmission control
             *   module (TCM).
             */
            public fun hasTransmissionEcu(hasTransmissionEcu: String)

            /** @param name The name of the interface. */
            public fun name(name: String)

            /** @param obdStandard (Optional) The standard OBD II PID. */
            public fun obdStandard(obdStandard: String)

            /**
             * @param pidRequestIntervalSeconds (Optional) The maximum number message requests per
             *   second.
             */
            public fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String)

            /** @param requestMessageId The ID of the message requesting vehicle data. */
            public fun requestMessageId(requestMessageId: String)

            /** @param useExtendedIds (Optional) Whether to use extended IDs in the message. */
            public fun useExtendedIds(useExtendedIds: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty
                    .builder()

            /**
             * @param dtcRequestIntervalSeconds (Optional) The maximum number message requests per
             *   diagnostic trouble code per second.
             */
            override fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String) {
                cdkBuilder.dtcRequestIntervalSeconds(dtcRequestIntervalSeconds)
            }

            /**
             * @param hasTransmissionEcu (Optional) Whether the vehicle has a transmission control
             *   module (TCM).
             */
            override fun hasTransmissionEcu(hasTransmissionEcu: String) {
                cdkBuilder.hasTransmissionEcu(hasTransmissionEcu)
            }

            /** @param name The name of the interface. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /** @param obdStandard (Optional) The standard OBD II PID. */
            override fun obdStandard(obdStandard: String) {
                cdkBuilder.obdStandard(obdStandard)
            }

            /**
             * @param pidRequestIntervalSeconds (Optional) The maximum number message requests per
             *   second.
             */
            override fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String) {
                cdkBuilder.pidRequestIntervalSeconds(pidRequestIntervalSeconds)
            }

            /** @param requestMessageId The ID of the message requesting vehicle data. */
            override fun requestMessageId(requestMessageId: String) {
                cdkBuilder.requestMessageId(requestMessageId)
            }

            /** @param useExtendedIds (Optional) Whether to use extended IDs in the message. */
            override fun useExtendedIds(useExtendedIds: String) {
                cdkBuilder.useExtendedIds(useExtendedIds)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty,
        ) : ObdInterfaceProperty {
            /**
             * (Optional) The maximum number message requests per diagnostic trouble code per
             * second.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-dtcrequestintervalseconds)
             */
            override fun dtcRequestIntervalSeconds(): String? =
                unwrap(this).getDtcRequestIntervalSeconds()

            /**
             * (Optional) Whether the vehicle has a transmission control module (TCM).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-hastransmissionecu)
             */
            override fun hasTransmissionEcu(): String? = unwrap(this).getHasTransmissionEcu()

            /**
             * The name of the interface.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * (Optional) The standard OBD II PID.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-obdstandard)
             */
            override fun obdStandard(): String? = unwrap(this).getObdStandard()

            /**
             * (Optional) The maximum number message requests per second.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-pidrequestintervalseconds)
             */
            override fun pidRequestIntervalSeconds(): String? =
                unwrap(this).getPidRequestIntervalSeconds()

            /**
             * The ID of the message requesting vehicle data.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-requestmessageid)
             */
            override fun requestMessageId(): String = unwrap(this).getRequestMessageId()

            /**
             * (Optional) Whether to use extended IDs in the message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-obdinterface.html#cfn-iotfleetwise-decodermanifest-obdinterface-useextendedids)
             */
            override fun useExtendedIds(): String? = unwrap(this).getUseExtendedIds()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ObdInterfaceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty
            ): ObdInterfaceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ObdInterfaceProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CanSignalDecoderProperty {
        /**
         * Information about a single controller area network (CAN) signal and the messages it
         * receives and transmits.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-cansignal)
         */
        public fun canSignal(): Any

        /**
         * The fully qualified name of a signal decoder as defined in a vehicle model.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-fullyqualifiedname)
         */
        public fun fullyQualifiedName(): String

        /**
         * The ID of a network interface that specifies what network protocol a vehicle follows.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-interfaceid)
         */
        public fun interfaceId(): String

        /**
         * The network protocol for the vehicle.
         *
         * For example, `CAN_SIGNAL` specifies a protocol that defines how data is communicated
         * between electronic control units (ECUs). `OBD_SIGNAL` specifies a protocol that defines
         * how self-diagnostic data is communicated between ECUs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-type)
         */
        public fun type(): String

        /** A builder for [CanSignalDecoderProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param canSignal Information about a single controller area network (CAN) signal and
             *   the messages it receives and transmits.
             */
            public fun canSignal(canSignal: IResolvable)

            /**
             * @param canSignal Information about a single controller area network (CAN) signal and
             *   the messages it receives and transmits.
             */
            public fun canSignal(canSignal: CanSignalProperty)

            /**
             * @param canSignal Information about a single controller area network (CAN) signal and
             *   the messages it receives and transmits.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1f2a1842cbcac4f2b866b161094e72b63d3112354f748ef6d99bc66cf3d200f3")
            public fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit)

            /**
             * @param fullyQualifiedName The fully qualified name of a signal decoder as defined in
             *   a vehicle model.
             */
            public fun fullyQualifiedName(fullyQualifiedName: String)

            /**
             * @param interfaceId The ID of a network interface that specifies what network protocol
             *   a vehicle follows.
             */
            public fun interfaceId(interfaceId: String)

            /**
             * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies
             *   a protocol that defines how data is communicated between electronic control units
             *   (ECUs). `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is
             *   communicated between ECUs.
             */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
                    .CanSignalDecoderProperty
                    .builder()

            /**
             * @param canSignal Information about a single controller area network (CAN) signal and
             *   the messages it receives and transmits.
             */
            override fun canSignal(canSignal: IResolvable) {
                cdkBuilder.canSignal(canSignal.let(IResolvable::unwrap))
            }

            /**
             * @param canSignal Information about a single controller area network (CAN) signal and
             *   the messages it receives and transmits.
             */
            override fun canSignal(canSignal: CanSignalProperty) {
                cdkBuilder.canSignal(canSignal.let(CanSignalProperty::unwrap))
            }

            /**
             * @param canSignal Information about a single controller area network (CAN) signal and
             *   the messages it receives and transmits.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("1f2a1842cbcac4f2b866b161094e72b63d3112354f748ef6d99bc66cf3d200f3")
            override fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit): Unit =
                canSignal(CanSignalProperty(canSignal))

            /**
             * @param fullyQualifiedName The fully qualified name of a signal decoder as defined in
             *   a vehicle model.
             */
            override fun fullyQualifiedName(fullyQualifiedName: String) {
                cdkBuilder.fullyQualifiedName(fullyQualifiedName)
            }

            /**
             * @param interfaceId The ID of a network interface that specifies what network protocol
             *   a vehicle follows.
             */
            override fun interfaceId(interfaceId: String) {
                cdkBuilder.interfaceId(interfaceId)
            }

            /**
             * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies
             *   a protocol that defines how data is communicated between electronic control units
             *   (ECUs). `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is
             *   communicated between ECUs.
             */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty,
        ) : CanSignalDecoderProperty {
            /**
             * Information about a single controller area network (CAN) signal and the messages it
             * receives and transmits.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-cansignal)
             */
            override fun canSignal(): Any = unwrap(this).getCanSignal()

            /**
             * The fully qualified name of a signal decoder as defined in a vehicle model.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-fullyqualifiedname)
             */
            override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

            /**
             * The ID of a network interface that specifies what network protocol a vehicle follows.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-interfaceid)
             */
            override fun interfaceId(): String = unwrap(this).getInterfaceId()

            /**
             * The network protocol for the vehicle.
             *
             * For example, `CAN_SIGNAL` specifies a protocol that defines how data is communicated
             * between electronic control units (ECUs). `OBD_SIGNAL` specifies a protocol that
             * defines how self-diagnostic data is communicated between ECUs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignaldecoder.html#cfn-iotfleetwise-decodermanifest-cansignaldecoder-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CanSignalDecoderProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty
            ): CanSignalDecoderProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CanSignalDecoderProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface NetworkInterfacesItemsProperty {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-caninterface)
         */
        public fun canInterface(): Any? = unwrap(this).getCanInterface()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-interfaceid)
         */
        public fun interfaceId(): String

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-obdinterface)
         */
        public fun obdInterface(): Any? = unwrap(this).getObdInterface()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-type)
         */
        public fun type(): String

        /** A builder for [NetworkInterfacesItemsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param canInterface the value to be set. */
            public fun canInterface(canInterface: IResolvable)

            /** @param canInterface the value to be set. */
            public fun canInterface(canInterface: CanInterfaceProperty)

            /** @param canInterface the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d8562fca49c5ff0d4d8b84f5158b802d27f9e743abe47c01088703b8768d205d")
            public fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit)

            /** @param interfaceId the value to be set. */
            public fun interfaceId(interfaceId: String)

            /** @param obdInterface the value to be set. */
            public fun obdInterface(obdInterface: IResolvable)

            /** @param obdInterface the value to be set. */
            public fun obdInterface(obdInterface: ObdInterfaceProperty)

            /** @param obdInterface the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2f2d33ddb6c1a7eb3c8b36cf64dc8a3941cd226a91a76c00910c2807f6d9ca34")
            public fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit)

            /** @param type the value to be set. */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
                    .NetworkInterfacesItemsProperty
                    .builder()

            /** @param canInterface the value to be set. */
            override fun canInterface(canInterface: IResolvable) {
                cdkBuilder.canInterface(canInterface.let(IResolvable::unwrap))
            }

            /** @param canInterface the value to be set. */
            override fun canInterface(canInterface: CanInterfaceProperty) {
                cdkBuilder.canInterface(canInterface.let(CanInterfaceProperty::unwrap))
            }

            /** @param canInterface the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("d8562fca49c5ff0d4d8b84f5158b802d27f9e743abe47c01088703b8768d205d")
            override fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit): Unit =
                canInterface(CanInterfaceProperty(canInterface))

            /** @param interfaceId the value to be set. */
            override fun interfaceId(interfaceId: String) {
                cdkBuilder.interfaceId(interfaceId)
            }

            /** @param obdInterface the value to be set. */
            override fun obdInterface(obdInterface: IResolvable) {
                cdkBuilder.obdInterface(obdInterface.let(IResolvable::unwrap))
            }

            /** @param obdInterface the value to be set. */
            override fun obdInterface(obdInterface: ObdInterfaceProperty) {
                cdkBuilder.obdInterface(obdInterface.let(ObdInterfaceProperty::unwrap))
            }

            /** @param obdInterface the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2f2d33ddb6c1a7eb3c8b36cf64dc8a3941cd226a91a76c00910c2807f6d9ca34")
            override fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit): Unit =
                obdInterface(ObdInterfaceProperty(obdInterface))

            /** @param type the value to be set. */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty,
        ) : NetworkInterfacesItemsProperty {
            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-caninterface)
             */
            override fun canInterface(): Any? = unwrap(this).getCanInterface()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-interfaceid)
             */
            override fun interfaceId(): String = unwrap(this).getInterfaceId()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-obdinterface)
             */
            override fun obdInterface(): Any? = unwrap(this).getObdInterface()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-networkinterfacesitems.html#cfn-iotfleetwise-decodermanifest-networkinterfacesitems-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): NetworkInterfacesItemsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty
            ): NetworkInterfacesItemsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: NetworkInterfacesItemsProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CanSignalProperty {
        /**
         * A multiplier used to decode the CAN message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-factor)
         */
        public fun factor(): String

        /**
         * Whether the byte ordering of a CAN message is big-endian.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-isbigendian)
         */
        public fun isBigEndian(): String

        /**
         * Whether the message data is specified as a signed value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-issigned)
         */
        public fun isSigned(): String

        /**
         * How many bytes of data are in the message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-length)
         */
        public fun length(): String

        /**
         * The ID of the message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-messageid)
         */
        public fun messageId(): String

        /**
         * (Optional) The name of the signal.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /**
         * The offset used to calculate the signal value.
         *
         * Combined with factor, the calculation is `value = raw_value * factor + offset` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-offset)
         */
        public fun offset(): String

        /**
         * Indicates the beginning of the CAN message.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-startbit)
         */
        public fun startBit(): String

        /** A builder for [CanSignalProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param factor A multiplier used to decode the CAN message. */
            public fun factor(factor: String)

            /** @param isBigEndian Whether the byte ordering of a CAN message is big-endian. */
            public fun isBigEndian(isBigEndian: String)

            /** @param isSigned Whether the message data is specified as a signed value. */
            public fun isSigned(isSigned: String)

            /** @param length How many bytes of data are in the message. */
            public fun length(length: String)

            /** @param messageId The ID of the message. */
            public fun messageId(messageId: String)

            /** @param name (Optional) The name of the signal. */
            public fun name(name: String)

            /**
             * @param offset The offset used to calculate the signal value. Combined with factor,
             *   the calculation is `value = raw_value * factor + offset` .
             */
            public fun offset(offset: String)

            /** @param startBit Indicates the beginning of the CAN message. */
            public fun startBit(startBit: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty
                    .builder()

            /** @param factor A multiplier used to decode the CAN message. */
            override fun factor(factor: String) {
                cdkBuilder.factor(factor)
            }

            /** @param isBigEndian Whether the byte ordering of a CAN message is big-endian. */
            override fun isBigEndian(isBigEndian: String) {
                cdkBuilder.isBigEndian(isBigEndian)
            }

            /** @param isSigned Whether the message data is specified as a signed value. */
            override fun isSigned(isSigned: String) {
                cdkBuilder.isSigned(isSigned)
            }

            /** @param length How many bytes of data are in the message. */
            override fun length(length: String) {
                cdkBuilder.length(length)
            }

            /** @param messageId The ID of the message. */
            override fun messageId(messageId: String) {
                cdkBuilder.messageId(messageId)
            }

            /** @param name (Optional) The name of the signal. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param offset The offset used to calculate the signal value. Combined with factor,
             *   the calculation is `value = raw_value * factor + offset` .
             */
            override fun offset(offset: String) {
                cdkBuilder.offset(offset)
            }

            /** @param startBit Indicates the beginning of the CAN message. */
            override fun startBit(startBit: String) {
                cdkBuilder.startBit(startBit)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty,
        ) : CanSignalProperty {
            /**
             * A multiplier used to decode the CAN message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-factor)
             */
            override fun factor(): String = unwrap(this).getFactor()

            /**
             * Whether the byte ordering of a CAN message is big-endian.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-isbigendian)
             */
            override fun isBigEndian(): String = unwrap(this).getIsBigEndian()

            /**
             * Whether the message data is specified as a signed value.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-issigned)
             */
            override fun isSigned(): String = unwrap(this).getIsSigned()

            /**
             * How many bytes of data are in the message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-length)
             */
            override fun length(): String = unwrap(this).getLength()

            /**
             * The ID of the message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-messageid)
             */
            override fun messageId(): String = unwrap(this).getMessageId()

            /**
             * (Optional) The name of the signal.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-name)
             */
            override fun name(): String? = unwrap(this).getName()

            /**
             * The offset used to calculate the signal value.
             *
             * Combined with factor, the calculation is `value = raw_value * factor + offset` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-offset)
             */
            override fun offset(): String = unwrap(this).getOffset()

            /**
             * Indicates the beginning of the CAN message.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cansignal.html#cfn-iotfleetwise-decodermanifest-cansignal-startbit)
             */
            override fun startBit(): String = unwrap(this).getStartBit()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): CanSignalProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty
            ): CanSignalProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CanSignalProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface SignalDecodersItemsProperty {
        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-cansignal)
         */
        public fun canSignal(): Any? = unwrap(this).getCanSignal()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-fullyqualifiedname)
         */
        public fun fullyQualifiedName(): String

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-interfaceid)
         */
        public fun interfaceId(): String

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-obdsignal)
         */
        public fun obdSignal(): Any? = unwrap(this).getObdSignal()

        /**
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-type)
         */
        public fun type(): String

        /** A builder for [SignalDecodersItemsProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param canSignal the value to be set. */
            public fun canSignal(canSignal: IResolvable)

            /** @param canSignal the value to be set. */
            public fun canSignal(canSignal: CanSignalProperty)

            /** @param canSignal the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c03da5aff98cc945bf7b5a2ff25eb67f4a53368d2e72df6c9ee9ce7fae3fb9e0")
            public fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit)

            /** @param fullyQualifiedName the value to be set. */
            public fun fullyQualifiedName(fullyQualifiedName: String)

            /** @param interfaceId the value to be set. */
            public fun interfaceId(interfaceId: String)

            /** @param obdSignal the value to be set. */
            public fun obdSignal(obdSignal: IResolvable)

            /** @param obdSignal the value to be set. */
            public fun obdSignal(obdSignal: ObdSignalProperty)

            /** @param obdSignal the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f78cea4a7a5bf3090f416aab0c323829366ec9091c55a3229b65fd9ae57a0b33")
            public fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit)

            /** @param type the value to be set. */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
                    .SignalDecodersItemsProperty
                    .builder()

            /** @param canSignal the value to be set. */
            override fun canSignal(canSignal: IResolvable) {
                cdkBuilder.canSignal(canSignal.let(IResolvable::unwrap))
            }

            /** @param canSignal the value to be set. */
            override fun canSignal(canSignal: CanSignalProperty) {
                cdkBuilder.canSignal(canSignal.let(CanSignalProperty::unwrap))
            }

            /** @param canSignal the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("c03da5aff98cc945bf7b5a2ff25eb67f4a53368d2e72df6c9ee9ce7fae3fb9e0")
            override fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit): Unit =
                canSignal(CanSignalProperty(canSignal))

            /** @param fullyQualifiedName the value to be set. */
            override fun fullyQualifiedName(fullyQualifiedName: String) {
                cdkBuilder.fullyQualifiedName(fullyQualifiedName)
            }

            /** @param interfaceId the value to be set. */
            override fun interfaceId(interfaceId: String) {
                cdkBuilder.interfaceId(interfaceId)
            }

            /** @param obdSignal the value to be set. */
            override fun obdSignal(obdSignal: IResolvable) {
                cdkBuilder.obdSignal(obdSignal.let(IResolvable::unwrap))
            }

            /** @param obdSignal the value to be set. */
            override fun obdSignal(obdSignal: ObdSignalProperty) {
                cdkBuilder.obdSignal(obdSignal.let(ObdSignalProperty::unwrap))
            }

            /** @param obdSignal the value to be set. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("f78cea4a7a5bf3090f416aab0c323829366ec9091c55a3229b65fd9ae57a0b33")
            override fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit): Unit =
                obdSignal(ObdSignalProperty(obdSignal))

            /** @param type the value to be set. */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty,
        ) : SignalDecodersItemsProperty {
            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-cansignal)
             */
            override fun canSignal(): Any? = unwrap(this).getCanSignal()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-fullyqualifiedname)
             */
            override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-interfaceid)
             */
            override fun interfaceId(): String = unwrap(this).getInterfaceId()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-obdsignal)
             */
            override fun obdSignal(): Any? = unwrap(this).getObdSignal()

            /**
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-signaldecodersitems.html#cfn-iotfleetwise-decodermanifest-signaldecodersitems-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): SignalDecodersItemsProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty
            ): SignalDecodersItemsProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: SignalDecodersItemsProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface CanNetworkInterfaceProperty {
        /**
         * Information about a network interface specified by the Controller Area Network (CAN)
         * protocol.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html#cfn-iotfleetwise-decodermanifest-cannetworkinterface-caninterface)
         */
        public fun canInterface(): Any

        /**
         * The ID of the network interface.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html#cfn-iotfleetwise-decodermanifest-cannetworkinterface-interfaceid)
         */
        public fun interfaceId(): String

        /**
         * The network protocol for the vehicle.
         *
         * For example, `CAN_SIGNAL` specifies a protocol that defines how data is communicated
         * between electronic control units (ECUs). `OBD_SIGNAL` specifies a protocol that defines
         * how self-diagnostic data is communicated between ECUs.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html#cfn-iotfleetwise-decodermanifest-cannetworkinterface-type)
         */
        public fun type(): String

        /** A builder for [CanNetworkInterfaceProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param canInterface Information about a network interface specified by the Controller
             *   Area Network (CAN) protocol.
             */
            public fun canInterface(canInterface: IResolvable)

            /**
             * @param canInterface Information about a network interface specified by the Controller
             *   Area Network (CAN) protocol.
             */
            public fun canInterface(canInterface: CanInterfaceProperty)

            /**
             * @param canInterface Information about a network interface specified by the Controller
             *   Area Network (CAN) protocol.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2bb3dae54526a244431924d675fa419eff6b69f0d87bbfe3ffc677046131a6f5")
            public fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit)

            /** @param interfaceId The ID of the network interface. */
            public fun interfaceId(interfaceId: String)

            /**
             * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies
             *   a protocol that defines how data is communicated between electronic control units
             *   (ECUs). `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is
             *   communicated between ECUs.
             */
            public fun type(type: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty.Builder =
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest
                    .CanNetworkInterfaceProperty
                    .builder()

            /**
             * @param canInterface Information about a network interface specified by the Controller
             *   Area Network (CAN) protocol.
             */
            override fun canInterface(canInterface: IResolvable) {
                cdkBuilder.canInterface(canInterface.let(IResolvable::unwrap))
            }

            /**
             * @param canInterface Information about a network interface specified by the Controller
             *   Area Network (CAN) protocol.
             */
            override fun canInterface(canInterface: CanInterfaceProperty) {
                cdkBuilder.canInterface(canInterface.let(CanInterfaceProperty::unwrap))
            }

            /**
             * @param canInterface Information about a network interface specified by the Controller
             *   Area Network (CAN) protocol.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("2bb3dae54526a244431924d675fa419eff6b69f0d87bbfe3ffc677046131a6f5")
            override fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit): Unit =
                canInterface(CanInterfaceProperty(canInterface))

            /** @param interfaceId The ID of the network interface. */
            override fun interfaceId(interfaceId: String) {
                cdkBuilder.interfaceId(interfaceId)
            }

            /**
             * @param type The network protocol for the vehicle. For example, `CAN_SIGNAL` specifies
             *   a protocol that defines how data is communicated between electronic control units
             *   (ECUs). `OBD_SIGNAL` specifies a protocol that defines how self-diagnostic data is
             *   communicated between ECUs.
             */
            override fun type(type: String) {
                cdkBuilder.type(type)
            }

            public fun build():
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty,
        ) : CanNetworkInterfaceProperty {
            /**
             * Information about a network interface specified by the Controller Area Network (CAN)
             * protocol.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html#cfn-iotfleetwise-decodermanifest-cannetworkinterface-caninterface)
             */
            override fun canInterface(): Any = unwrap(this).getCanInterface()

            /**
             * The ID of the network interface.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html#cfn-iotfleetwise-decodermanifest-cannetworkinterface-interfaceid)
             */
            override fun interfaceId(): String = unwrap(this).getInterfaceId()

            /**
             * The network protocol for the vehicle.
             *
             * For example, `CAN_SIGNAL` specifies a protocol that defines how data is communicated
             * between electronic control units (ECUs). `OBD_SIGNAL` specifies a protocol that
             * defines how self-diagnostic data is communicated between ECUs.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html#cfn-iotfleetwise-decodermanifest-cannetworkinterface-type)
             */
            override fun type(): String = unwrap(this).getType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): CanNetworkInterfaceProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty
            ): CanNetworkInterfaceProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: CanNetworkInterfaceProperty
            ): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
