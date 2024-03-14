package io.cloudshiftdev.awscdk.services.lightsail

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** An array of add-ons for the instance. */
    public open fun addOns(): Any? = unwrap(this).getAddOns()

    /** An array of add-ons for the instance. */
    public open fun addOns(`value`: IResolvable) {
        unwrap(this).setAddOns(`value`.let(IResolvable::unwrap))
    }

    /** An array of add-ons for the instance. */
    public open fun addOns(__idx_ac66f0: List<Any>) {
        unwrap(this).setAddOns(__idx_ac66f0)
    }

    /** An array of add-ons for the instance. */
    public open fun addOns(vararg __idx_ac66f0: Any): Unit = addOns(__idx_ac66f0.toList())

    /** The number of vCPUs the instance has. */
    public open fun attrHardwareCpuCount(): Number = unwrap(this).getAttrHardwareCpuCount()

    /** The amount of RAM in GB on the instance (for example, `1.0` ). */
    public open fun attrHardwareRamSizeInGb(): Number = unwrap(this).getAttrHardwareRamSizeInGb()

    /**
     * The Amazon Resource Name (ARN) of the instance (for example,
     * `arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE` ).
     */
    public open fun attrInstanceArn(): String = unwrap(this).getAttrInstanceArn()

    /** A Boolean value indicating whether the instance has a static IP assigned to it. */
    public open fun attrIsStaticIp(): IResolvable =
        unwrap(this).getAttrIsStaticIp().let(IResolvable::wrap)

    /** The AWS Region and Availability Zone where the instance is located. */
    public open fun attrLocationAvailabilityZone(): String =
        unwrap(this).getAttrLocationAvailabilityZone()

    /** The AWS Region of the instance. */
    public open fun attrLocationRegionName(): String = unwrap(this).getAttrLocationRegionName()

    /** The amount of allocated monthly data transfer (in GB) for an instance. */
    public open fun attrNetworkingMonthlyTransferGbPerMonthAllocated(): String =
        unwrap(this).getAttrNetworkingMonthlyTransferGbPerMonthAllocated()

    /** The private IP address of the instance. */
    public open fun attrPrivateIpAddress(): String = unwrap(this).getAttrPrivateIpAddress()

    /** The public IP address of the instance. */
    public open fun attrPublicIpAddress(): String = unwrap(this).getAttrPublicIpAddress()

    /** The resource type of the instance (for example, `Instance` ). */
    public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

    /** The name of the SSH key pair used by the instance. */
    public open fun attrSshKeyName(): String = unwrap(this).getAttrSshKeyName()

    /** The status code of the instance. */
    public open fun attrStateCode(): Number = unwrap(this).getAttrStateCode()

    /** The state of the instance (for example, `running` or `pending` ). */
    public open fun attrStateName(): String = unwrap(this).getAttrStateName()

    /**
     * The support code of the instance.
     *
     * Include this code in your email to support when you have questions about an instance or
     * another resource in Lightsail . This code helps our support team to look up your Lightsail
     * information.
     */
    public open fun attrSupportCode(): String = unwrap(this).getAttrSupportCode()

    /** The user name for connecting to the instance (for example, `ec2-user` ). */
    public open fun attrUserName(): String = unwrap(this).getAttrUserName()

    /** The Availability Zone for the instance. */
    public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /** The Availability Zone for the instance. */
    public open fun availabilityZone(`value`: String) {
        unwrap(this).setAvailabilityZone(`value`)
    }

    /** The blueprint ID for the instance (for example, `os_amlinux_2016_03` ). */
    public open fun blueprintId(): String = unwrap(this).getBlueprintId()

    /** The blueprint ID for the instance (for example, `os_amlinux_2016_03` ). */
    public open fun blueprintId(`value`: String) {
        unwrap(this).setBlueprintId(`value`)
    }

    /** The bundle ID for the instance (for example, `micro_1_0` ). */
    public open fun bundleId(): String = unwrap(this).getBundleId()

    /** The bundle ID for the instance (for example, `micro_1_0` ). */
    public open fun bundleId(`value`: String) {
        unwrap(this).setBundleId(`value`)
    }

    /**
     * The hardware properties for the instance, such as the vCPU count, attached disks, and amount
     * of RAM.
     */
    public open fun hardware(): Any? = unwrap(this).getHardware()

    /**
     * The hardware properties for the instance, such as the vCPU count, attached disks, and amount
     * of RAM.
     */
    public open fun hardware(`value`: IResolvable) {
        unwrap(this).setHardware(`value`.let(IResolvable::unwrap))
    }

    /**
     * The hardware properties for the instance, such as the vCPU count, attached disks, and amount
     * of RAM.
     */
    public open fun hardware(`value`: HardwareProperty) {
        unwrap(this).setHardware(`value`.let(HardwareProperty::unwrap))
    }

    /**
     * The hardware properties for the instance, such as the vCPU count, attached disks, and amount
     * of RAM.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("210deb4c2b0aede0342e63d6e4a5e864eef3a0af314d56aa5f51aa9cfa65c4d3")
    public open fun hardware(`value`: HardwareProperty.Builder.() -> Unit): Unit =
        hardware(HardwareProperty(`value`))

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The name of the instance. */
    public open fun instanceName(): String = unwrap(this).getInstanceName()

    /** The name of the instance. */
    public open fun instanceName(`value`: String) {
        unwrap(this).setInstanceName(`value`)
    }

    /** The name of the key pair to use for the instance. */
    public open fun keyPairName(): String? = unwrap(this).getKeyPairName()

    /** The name of the key pair to use for the instance. */
    public open fun keyPairName(`value`: String) {
        unwrap(this).setKeyPairName(`value`)
    }

    /** The location for the instance, such as the AWS Region and Availability Zone. */
    public open fun location(): Any? = unwrap(this).getLocation()

    /** The location for the instance, such as the AWS Region and Availability Zone. */
    public open fun location(`value`: IResolvable) {
        unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
    }

    /** The location for the instance, such as the AWS Region and Availability Zone. */
    public open fun location(`value`: LocationProperty) {
        unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
    }

    /** The location for the instance, such as the AWS Region and Availability Zone. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01846ad4723fa2f70217c8c7376dc4f1b9d734cabf99d05f0117540ade67ea69")
    public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(`value`))

    /** The public ports and the monthly amount of data transfer allocated for the instance. */
    public open fun networking(): Any? = unwrap(this).getNetworking()

    /** The public ports and the monthly amount of data transfer allocated for the instance. */
    public open fun networking(`value`: IResolvable) {
        unwrap(this).setNetworking(`value`.let(IResolvable::unwrap))
    }

    /** The public ports and the monthly amount of data transfer allocated for the instance. */
    public open fun networking(`value`: NetworkingProperty) {
        unwrap(this).setNetworking(`value`.let(NetworkingProperty::unwrap))
    }

    /** The public ports and the monthly amount of data transfer allocated for the instance. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbeba1b1ea6a924ec00a10c3e795f79ee2ee162b77c3a604397419da0488f328")
    public open fun networking(`value`: NetworkingProperty.Builder.() -> Unit): Unit =
        networking(NetworkingProperty(`value`))

    /** The status code and the state (for example, `running` ) of the instance. */
    public open fun state(): Any? = unwrap(this).getState()

    /** The status code and the state (for example, `running` ) of the instance. */
    public open fun state(`value`: IResolvable) {
        unwrap(this).setState(`value`.let(IResolvable::unwrap))
    }

    /** The status code and the state (for example, `running` ) of the instance. */
    public open fun state(`value`: StateProperty) {
        unwrap(this).setState(`value`.let(StateProperty::unwrap))
    }

    /** The status code and the state (for example, `running` ) of the instance. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71f52778a298c7ced0660d955eacf298ba159598f4357da8372661d1273f96e2")
    public open fun state(`value`: StateProperty.Builder.() -> Unit): Unit =
        state(StateProperty(`value`))

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** An array of key-value pairs to apply to this resource. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** The optional launch script for the instance. */
    public open fun userData(): String? = unwrap(this).getUserData()

    /** The optional launch script for the instance. */
    public open fun userData(`value`: String) {
        unwrap(this).setUserData(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnInstance]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * An array of add-ons for the instance.
         *
         * If the instance has an add-on enabled when performing a delete instance request, the
         * add-on is automatically disabled before the instance is deleted.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
         *
         * @param addOns An array of add-ons for the instance.
         */
        public fun addOns(addOns: IResolvable)

        /**
         * An array of add-ons for the instance.
         *
         * If the instance has an add-on enabled when performing a delete instance request, the
         * add-on is automatically disabled before the instance is deleted.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
         *
         * @param addOns An array of add-ons for the instance.
         */
        public fun addOns(addOns: List<Any>)

        /**
         * An array of add-ons for the instance.
         *
         * If the instance has an add-on enabled when performing a delete instance request, the
         * add-on is automatically disabled before the instance is deleted.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
         *
         * @param addOns An array of add-ons for the instance.
         */
        public fun addOns(vararg addOns: Any)

        /**
         * The Availability Zone for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-availabilityzone)
         *
         * @param availabilityZone The Availability Zone for the instance.
         */
        public fun availabilityZone(availabilityZone: String)

        /**
         * The blueprint ID for the instance (for example, `os_amlinux_2016_03` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-blueprintid)
         *
         * @param blueprintId The blueprint ID for the instance (for example, `os_amlinux_2016_03`
         *   ).
         */
        public fun blueprintId(blueprintId: String)

        /**
         * The bundle ID for the instance (for example, `micro_1_0` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-bundleid)
         *
         * @param bundleId The bundle ID for the instance (for example, `micro_1_0` ).
         */
        public fun bundleId(bundleId: String)

        /**
         * The hardware properties for the instance, such as the vCPU count, attached disks, and
         * amount of RAM.
         *
         * The instance restarts when performing an attach disk or detach disk request. This resets
         * the public IP address of your instance if a static IP isn't attached to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
         *
         * @param hardware The hardware properties for the instance, such as the vCPU count,
         *   attached disks, and amount of RAM.
         */
        public fun hardware(hardware: IResolvable)

        /**
         * The hardware properties for the instance, such as the vCPU count, attached disks, and
         * amount of RAM.
         *
         * The instance restarts when performing an attach disk or detach disk request. This resets
         * the public IP address of your instance if a static IP isn't attached to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
         *
         * @param hardware The hardware properties for the instance, such as the vCPU count,
         *   attached disks, and amount of RAM.
         */
        public fun hardware(hardware: HardwareProperty)

        /**
         * The hardware properties for the instance, such as the vCPU count, attached disks, and
         * amount of RAM.
         *
         * The instance restarts when performing an attach disk or detach disk request. This resets
         * the public IP address of your instance if a static IP isn't attached to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
         *
         * @param hardware The hardware properties for the instance, such as the vCPU count,
         *   attached disks, and amount of RAM.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("318e4e2265b5093756cd521587cb41ea42228588cc249c960bf5b1098ffb432b")
        public fun hardware(hardware: HardwareProperty.Builder.() -> Unit)

        /**
         * The name of the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-instancename)
         *
         * @param instanceName The name of the instance.
         */
        public fun instanceName(instanceName: String)

        /**
         * The name of the key pair to use for the instance.
         *
         * If no key pair name is specified, the Regional Lightsail default key pair is used.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-keypairname)
         *
         * @param keyPairName The name of the key pair to use for the instance.
         */
        public fun keyPairName(keyPairName: String)

        /**
         * The location for the instance, such as the AWS Region and Availability Zone.
         *
         * The `Location` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
         *
         * @param location The location for the instance, such as the AWS Region and Availability
         *   Zone.
         */
        public fun location(location: IResolvable)

        /**
         * The location for the instance, such as the AWS Region and Availability Zone.
         *
         * The `Location` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
         *
         * @param location The location for the instance, such as the AWS Region and Availability
         *   Zone.
         */
        public fun location(location: LocationProperty)

        /**
         * The location for the instance, such as the AWS Region and Availability Zone.
         *
         * The `Location` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
         *
         * @param location The location for the instance, such as the AWS Region and Availability
         *   Zone.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("36af3fb44c3c13294964cfc4ce38b5c7e11856725f33f26fa2ad1413babf5556")
        public fun location(location: LocationProperty.Builder.() -> Unit)

        /**
         * The public ports and the monthly amount of data transfer allocated for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
         *
         * @param networking The public ports and the monthly amount of data transfer allocated for
         *   the instance.
         */
        public fun networking(networking: IResolvable)

        /**
         * The public ports and the monthly amount of data transfer allocated for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
         *
         * @param networking The public ports and the monthly amount of data transfer allocated for
         *   the instance.
         */
        public fun networking(networking: NetworkingProperty)

        /**
         * The public ports and the monthly amount of data transfer allocated for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
         *
         * @param networking The public ports and the monthly amount of data transfer allocated for
         *   the instance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("80288eca0fcbbedd7b250e3f3f9a35cc5f5a324b591884dc14afe6c9ab68fca8")
        public fun networking(networking: NetworkingProperty.Builder.() -> Unit)

        /**
         * The status code and the state (for example, `running` ) of the instance.
         *
         * The `State` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
         *
         * @param state The status code and the state (for example, `running` ) of the instance.
         */
        public fun state(state: IResolvable)

        /**
         * The status code and the state (for example, `running` ) of the instance.
         *
         * The `State` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
         *
         * @param state The status code and the state (for example, `running` ) of the instance.
         */
        public fun state(state: StateProperty)

        /**
         * The status code and the state (for example, `running` ) of the instance.
         *
         * The `State` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
         *
         * @param state The status code and the state (for example, `running` ) of the instance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e4a829a3ed327c56b1a17ef977c991c5be342ad5f069a80fc12be3e2cb4a07a9")
        public fun state(state: StateProperty.Builder.() -> Unit)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        public fun tags(vararg tags: CfnTag)

        /**
         * The optional launch script for the instance.
         *
         * Specify a launch script to configure an instance with additional user data. For example,
         * you might want to specify `apt-get -y update` as a launch script.
         *
         * Depending on the blueprint of your instance, the command to get software on your instance
         * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD
         * uses `pkg` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-userdata)
         *
         * @param userData The optional launch script for the instance.
         */
        public fun userData(userData: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnInstance.Builder =
            software.amazon.awscdk.services.lightsail.CfnInstance.Builder.create(scope, id)

        /**
         * An array of add-ons for the instance.
         *
         * If the instance has an add-on enabled when performing a delete instance request, the
         * add-on is automatically disabled before the instance is deleted.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
         *
         * @param addOns An array of add-ons for the instance.
         */
        override fun addOns(addOns: IResolvable) {
            cdkBuilder.addOns(addOns.let(IResolvable::unwrap))
        }

        /**
         * An array of add-ons for the instance.
         *
         * If the instance has an add-on enabled when performing a delete instance request, the
         * add-on is automatically disabled before the instance is deleted.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
         *
         * @param addOns An array of add-ons for the instance.
         */
        override fun addOns(addOns: List<Any>) {
            cdkBuilder.addOns(addOns)
        }

        /**
         * An array of add-ons for the instance.
         *
         * If the instance has an add-on enabled when performing a delete instance request, the
         * add-on is automatically disabled before the instance is deleted.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-addons)
         *
         * @param addOns An array of add-ons for the instance.
         */
        override fun addOns(vararg addOns: Any): Unit = addOns(addOns.toList())

        /**
         * The Availability Zone for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-availabilityzone)
         *
         * @param availabilityZone The Availability Zone for the instance.
         */
        override fun availabilityZone(availabilityZone: String) {
            cdkBuilder.availabilityZone(availabilityZone)
        }

        /**
         * The blueprint ID for the instance (for example, `os_amlinux_2016_03` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-blueprintid)
         *
         * @param blueprintId The blueprint ID for the instance (for example, `os_amlinux_2016_03`
         *   ).
         */
        override fun blueprintId(blueprintId: String) {
            cdkBuilder.blueprintId(blueprintId)
        }

        /**
         * The bundle ID for the instance (for example, `micro_1_0` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-bundleid)
         *
         * @param bundleId The bundle ID for the instance (for example, `micro_1_0` ).
         */
        override fun bundleId(bundleId: String) {
            cdkBuilder.bundleId(bundleId)
        }

        /**
         * The hardware properties for the instance, such as the vCPU count, attached disks, and
         * amount of RAM.
         *
         * The instance restarts when performing an attach disk or detach disk request. This resets
         * the public IP address of your instance if a static IP isn't attached to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
         *
         * @param hardware The hardware properties for the instance, such as the vCPU count,
         *   attached disks, and amount of RAM.
         */
        override fun hardware(hardware: IResolvable) {
            cdkBuilder.hardware(hardware.let(IResolvable::unwrap))
        }

        /**
         * The hardware properties for the instance, such as the vCPU count, attached disks, and
         * amount of RAM.
         *
         * The instance restarts when performing an attach disk or detach disk request. This resets
         * the public IP address of your instance if a static IP isn't attached to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
         *
         * @param hardware The hardware properties for the instance, such as the vCPU count,
         *   attached disks, and amount of RAM.
         */
        override fun hardware(hardware: HardwareProperty) {
            cdkBuilder.hardware(hardware.let(HardwareProperty::unwrap))
        }

        /**
         * The hardware properties for the instance, such as the vCPU count, attached disks, and
         * amount of RAM.
         *
         * The instance restarts when performing an attach disk or detach disk request. This resets
         * the public IP address of your instance if a static IP isn't attached to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-hardware)
         *
         * @param hardware The hardware properties for the instance, such as the vCPU count,
         *   attached disks, and amount of RAM.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("318e4e2265b5093756cd521587cb41ea42228588cc249c960bf5b1098ffb432b")
        override fun hardware(hardware: HardwareProperty.Builder.() -> Unit): Unit =
            hardware(HardwareProperty(hardware))

        /**
         * The name of the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-instancename)
         *
         * @param instanceName The name of the instance.
         */
        override fun instanceName(instanceName: String) {
            cdkBuilder.instanceName(instanceName)
        }

        /**
         * The name of the key pair to use for the instance.
         *
         * If no key pair name is specified, the Regional Lightsail default key pair is used.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-keypairname)
         *
         * @param keyPairName The name of the key pair to use for the instance.
         */
        override fun keyPairName(keyPairName: String) {
            cdkBuilder.keyPairName(keyPairName)
        }

        /**
         * The location for the instance, such as the AWS Region and Availability Zone.
         *
         * The `Location` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
         *
         * @param location The location for the instance, such as the AWS Region and Availability
         *   Zone.
         */
        override fun location(location: IResolvable) {
            cdkBuilder.location(location.let(IResolvable::unwrap))
        }

        /**
         * The location for the instance, such as the AWS Region and Availability Zone.
         *
         * The `Location` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
         *
         * @param location The location for the instance, such as the AWS Region and Availability
         *   Zone.
         */
        override fun location(location: LocationProperty) {
            cdkBuilder.location(location.let(LocationProperty::unwrap))
        }

        /**
         * The location for the instance, such as the AWS Region and Availability Zone.
         *
         * The `Location` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-location)
         *
         * @param location The location for the instance, such as the AWS Region and Availability
         *   Zone.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("36af3fb44c3c13294964cfc4ce38b5c7e11856725f33f26fa2ad1413babf5556")
        override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
            location(LocationProperty(location))

        /**
         * The public ports and the monthly amount of data transfer allocated for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
         *
         * @param networking The public ports and the monthly amount of data transfer allocated for
         *   the instance.
         */
        override fun networking(networking: IResolvable) {
            cdkBuilder.networking(networking.let(IResolvable::unwrap))
        }

        /**
         * The public ports and the monthly amount of data transfer allocated for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
         *
         * @param networking The public ports and the monthly amount of data transfer allocated for
         *   the instance.
         */
        override fun networking(networking: NetworkingProperty) {
            cdkBuilder.networking(networking.let(NetworkingProperty::unwrap))
        }

        /**
         * The public ports and the monthly amount of data transfer allocated for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-networking)
         *
         * @param networking The public ports and the monthly amount of data transfer allocated for
         *   the instance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("80288eca0fcbbedd7b250e3f3f9a35cc5f5a324b591884dc14afe6c9ab68fca8")
        override fun networking(networking: NetworkingProperty.Builder.() -> Unit): Unit =
            networking(NetworkingProperty(networking))

        /**
         * The status code and the state (for example, `running` ) of the instance.
         *
         * The `State` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
         *
         * @param state The status code and the state (for example, `running` ) of the instance.
         */
        override fun state(state: IResolvable) {
            cdkBuilder.state(state.let(IResolvable::unwrap))
        }

        /**
         * The status code and the state (for example, `running` ) of the instance.
         *
         * The `State` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
         *
         * @param state The status code and the state (for example, `running` ) of the instance.
         */
        override fun state(state: StateProperty) {
            cdkBuilder.state(state.let(StateProperty::unwrap))
        }

        /**
         * The status code and the state (for example, `running` ) of the instance.
         *
         * The `State` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-state)
         *
         * @param state The status code and the state (for example, `running` ) of the instance.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e4a829a3ed327c56b1a17ef977c991c5be342ad5f069a80fc12be3e2cb4a07a9")
        override fun state(state: StateProperty.Builder.() -> Unit): Unit =
            state(StateProperty(state))

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * An array of key-value pairs to apply to this resource.
         *
         * For more information, see
         * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
         * in the *AWS CloudFormation User Guide* .
         *
         * The `Value` of `Tags` is optional for Lightsail resources.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-tags)
         *
         * @param tags An array of key-value pairs to apply to this resource.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        /**
         * The optional launch script for the instance.
         *
         * Specify a launch script to configure an instance with additional user data. For example,
         * you might want to specify `apt-get -y update` as a launch script.
         *
         * Depending on the blueprint of your instance, the command to get software on your instance
         * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD
         * uses `pkg` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html#cfn-lightsail-instance-userdata)
         *
         * @param userData The optional launch script for the instance.
         */
        override fun userData(userData: String) {
            cdkBuilder.userData(userData)
        }

        public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnInstance {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnInstance(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance
        ): CfnInstance = CfnInstance(cdkObject)

        internal fun unwrap(
            wrapped: CfnInstance
        ): software.amazon.awscdk.services.lightsail.CfnInstance = wrapped.cdkObject
    }

    public interface AutoSnapshotAddOnProperty {
        /**
         * The daily time when an automatic snapshot will be created.
         *
         * Constraints:
         * * Must be in `HH:00` format, and in an hourly increment.
         * * Specified in Coordinated Universal Time (UTC).
         * * The snapshot will be automatically created between the time specified and up to 45
         *   minutes after.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-autosnapshotaddon.html#cfn-lightsail-instance-autosnapshotaddon-snapshottimeofday)
         */
        public fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()

        /** A builder for [AutoSnapshotAddOnProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
             *   Constraints:
             * * Must be in `HH:00` format, and in an hourly increment.
             * * Specified in Coordinated Universal Time (UTC).
             * * The snapshot will be automatically created between the time specified and up to 45
             *   minutes after.
             */
            public fun snapshotTimeOfDay(snapshotTimeOfDay: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty
                    .builder()

            /**
             * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
             *   Constraints:
             * * Must be in `HH:00` format, and in an hourly increment.
             * * Specified in Coordinated Universal Time (UTC).
             * * The snapshot will be automatically created between the time specified and up to 45
             *   minutes after.
             */
            override fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
                cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
            }

            public fun build():
                software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty,
        ) : AutoSnapshotAddOnProperty {
            /**
             * The daily time when an automatic snapshot will be created.
             *
             * Constraints:
             * * Must be in `HH:00` format, and in an hourly increment.
             * * Specified in Coordinated Universal Time (UTC).
             * * The snapshot will be automatically created between the time specified and up to 45
             *   minutes after.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-autosnapshotaddon.html#cfn-lightsail-instance-autosnapshotaddon-snapshottimeofday)
             */
            override fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AutoSnapshotAddOnProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty
            ): AutoSnapshotAddOnProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AutoSnapshotAddOnProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.AutoSnapshotAddOnProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface AddOnProperty {
        /**
         * The add-on type (for example, `AutoSnapshot` ).
         *
         * `AutoSnapshot` is the only add-on that can be enabled for an instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html#cfn-lightsail-instance-addon-addontype)
         */
        public fun addOnType(): String

        /**
         * The parameters for the automatic snapshot add-on, such as the daily time when an
         * automatic snapshot will be created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html#cfn-lightsail-instance-addon-autosnapshotaddonrequest)
         */
        public fun autoSnapshotAddOnRequest(): Any? = unwrap(this).getAutoSnapshotAddOnRequest()

        /**
         * The status of the add-on.
         *
         * Valid Values: `Enabled` | `Disabled`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html#cfn-lightsail-instance-addon-status)
         */
        public fun status(): String? = unwrap(this).getStatus()

        /** A builder for [AddOnProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param addOnType The add-on type (for example, `AutoSnapshot` ).
             *
             * `AutoSnapshot` is the only add-on that can be enabled for an instance.
             */
            public fun addOnType(addOnType: String)

            /**
             * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on,
             *   such as the daily time when an automatic snapshot will be created.
             */
            public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable)

            /**
             * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on,
             *   such as the daily time when an automatic snapshot will be created.
             */
            public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty)

            /**
             * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on,
             *   such as the daily time when an automatic snapshot will be created.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("201312319c3956aadfaafdbc0e0e4e69b6f794a4ae1756e93487eb9d190035f0")
            public fun autoSnapshotAddOnRequest(
                autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit
            )

            /** @param status The status of the add-on. Valid Values: `Enabled` | `Disabled` */
            public fun status(status: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty.builder()

            /**
             * @param addOnType The add-on type (for example, `AutoSnapshot` ).
             *
             * `AutoSnapshot` is the only add-on that can be enabled for an instance.
             */
            override fun addOnType(addOnType: String) {
                cdkBuilder.addOnType(addOnType)
            }

            /**
             * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on,
             *   such as the daily time when an automatic snapshot will be created.
             */
            override fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
                cdkBuilder.autoSnapshotAddOnRequest(
                    autoSnapshotAddOnRequest.let(IResolvable::unwrap)
                )
            }

            /**
             * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on,
             *   such as the daily time when an automatic snapshot will be created.
             */
            override fun autoSnapshotAddOnRequest(
                autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty
            ) {
                cdkBuilder.autoSnapshotAddOnRequest(
                    autoSnapshotAddOnRequest.let(AutoSnapshotAddOnProperty::unwrap)
                )
            }

            /**
             * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on,
             *   such as the daily time when an automatic snapshot will be created.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("201312319c3956aadfaafdbc0e0e4e69b6f794a4ae1756e93487eb9d190035f0")
            override fun autoSnapshotAddOnRequest(
                autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit
            ): Unit = autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty(autoSnapshotAddOnRequest))

            /** @param status The status of the add-on. Valid Values: `Enabled` | `Disabled` */
            override fun status(status: String) {
                cdkBuilder.status(status)
            }

            public fun build():
                software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty,
        ) : AddOnProperty {
            /**
             * The add-on type (for example, `AutoSnapshot` ).
             *
             * `AutoSnapshot` is the only add-on that can be enabled for an instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html#cfn-lightsail-instance-addon-addontype)
             */
            override fun addOnType(): String = unwrap(this).getAddOnType()

            /**
             * The parameters for the automatic snapshot add-on, such as the daily time when an
             * automatic snapshot will be created.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html#cfn-lightsail-instance-addon-autosnapshotaddonrequest)
             */
            override fun autoSnapshotAddOnRequest(): Any? =
                unwrap(this).getAutoSnapshotAddOnRequest()

            /**
             * The status of the add-on.
             *
             * Valid Values: `Enabled` | `Disabled`
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-addon.html#cfn-lightsail-instance-addon-status)
             */
            override fun status(): String? = unwrap(this).getStatus()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): AddOnProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty
            ): AddOnProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: AddOnProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.AddOnProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface LocationProperty {
        /**
         * The Availability Zone for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-location.html#cfn-lightsail-instance-location-availabilityzone)
         */
        public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

        /**
         * The name of the AWS Region for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-location.html#cfn-lightsail-instance-location-regionname)
         */
        public fun regionName(): String? = unwrap(this).getRegionName()

        /** A builder for [LocationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param availabilityZone The Availability Zone for the instance. */
            public fun availabilityZone(availabilityZone: String)

            /** @param regionName The name of the AWS Region for the instance. */
            public fun regionName(regionName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty.builder()

            /** @param availabilityZone The Availability Zone for the instance. */
            override fun availabilityZone(availabilityZone: String) {
                cdkBuilder.availabilityZone(availabilityZone)
            }

            /** @param regionName The name of the AWS Region for the instance. */
            override fun regionName(regionName: String) {
                cdkBuilder.regionName(regionName)
            }

            public fun build():
                software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty,
        ) : LocationProperty {
            /**
             * The Availability Zone for the instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-location.html#cfn-lightsail-instance-location-availabilityzone)
             */
            override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

            /**
             * The name of the AWS Region for the instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-location.html#cfn-lightsail-instance-location-regionname)
             */
            override fun regionName(): String? = unwrap(this).getRegionName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty
            ): LocationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: LocationProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MonthlyTransferProperty {
        /**
         * The amount of allocated monthly data transfer (in GB) for an instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-monthlytransfer.html#cfn-lightsail-instance-monthlytransfer-gbpermonthallocated)
         */
        public fun gbPerMonthAllocated(): String? = unwrap(this).getGbPerMonthAllocated()

        /** A builder for [MonthlyTransferProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param gbPerMonthAllocated The amount of allocated monthly data transfer (in GB) for
             *   an instance.
             */
            public fun gbPerMonthAllocated(gbPerMonthAllocated: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty
                    .builder()

            /**
             * @param gbPerMonthAllocated The amount of allocated monthly data transfer (in GB) for
             *   an instance.
             */
            override fun gbPerMonthAllocated(gbPerMonthAllocated: String) {
                cdkBuilder.gbPerMonthAllocated(gbPerMonthAllocated)
            }

            public fun build():
                software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty,
        ) : MonthlyTransferProperty {
            /**
             * The amount of allocated monthly data transfer (in GB) for an instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-monthlytransfer.html#cfn-lightsail-instance-monthlytransfer-gbpermonthallocated)
             */
            override fun gbPerMonthAllocated(): String? = unwrap(this).getGbPerMonthAllocated()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MonthlyTransferProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty
            ): MonthlyTransferProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MonthlyTransferProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.MonthlyTransferProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface PortProperty {
        /**
         * The access direction ( `inbound` or `outbound` ).
         *
         * Lightsail currently supports only `inbound` access direction.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-accessdirection)
         */
        public fun accessDirection(): String? = unwrap(this).getAccessDirection()

        /**
         * The location from which access is allowed.
         *
         * For example, `Anywhere (0.0.0.0/0)` , or `Custom` if a specific IP address or range of IP
         * addresses is allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-accessfrom)
         */
        public fun accessFrom(): String? = unwrap(this).getAccessFrom()

        /**
         * The type of access ( `Public` or `Private` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-accesstype)
         */
        public fun accessType(): String? = unwrap(this).getAccessType()

        /**
         * An alias that defines access for a preconfigured range of IP addresses.
         *
         * The only alias currently supported is `lightsail-connect` , which allows IP addresses of
         * the browser-based RDP/SSH client in the Lightsail console to connect to your instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-cidrlistaliases)
         */
        public fun cidrListAliases(): List<String> =
            unwrap(this).getCidrListAliases() ?: emptyList()

        /**
         * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to
         * connect to an instance through the ports, and the protocol.
         *
         * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an
         * instance.
         *
         * Examples:
         * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
         * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-cidrs)
         */
        public fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

        /**
         * The common name of the port information.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-commonname)
         */
        public fun commonName(): String? = unwrap(this).getCommonName()

        /**
         * The first port in a range of open ports on an instance.
         *
         * Allowed ports:
         * * TCP and UDP - `0` to `65535`
         * * ICMP - The ICMP type for IPv4 addresses. For example, specify `8` as the `fromPort`
         *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
         * * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify `128` as the `fromPort`
         *   (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-fromport)
         */
        public fun fromPort(): Number? = unwrap(this).getFromPort()

        /**
         * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to
         * connect to an instance through the ports, and the protocol.
         *
         * Only devices with an IPv6 address can connect to an instance through IPv6; otherwise,
         * IPv4 should be used.
         *
         * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an
         * instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-ipv6cidrs)
         */
        public fun ipv6Cidrs(): List<String> = unwrap(this).getIpv6Cidrs() ?: emptyList()

        /**
         * The IP protocol name.
         *
         * The name can be one of the following:
         * * `tcp` - Transmission Control Protocol (TCP) provides reliable, ordered, and
         *   error-checked delivery of streamed data between applications running on hosts
         *   communicating by an IP network. If you have an application that doesn't require
         *   reliable data stream service, use UDP instead.
         * * `all` - All transport layer protocol types.
         * * `udp` - With User Datagram Protocol (UDP), computer applications can send messages (or
         *   datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications
         *   are not required to set up transmission channels or data paths. Applications that don't
         *   require reliable data stream service can use UDP, which provides a connectionless
         *   datagram service that emphasizes reduced latency over reliability. If you do require
         *   reliable data stream service, use TCP instead.
         * * `icmp` - Internet Control Message Protocol (ICMP) is used to send error messages and
         *   operational information indicating success or failure when communicating with an
         *   instance. For example, an error is indicated when an instance could not be reached.
         *   When you specify `icmp` as the `protocol` , you must specify the ICMP type using the
         *   `fromPort` parameter, and ICMP code using the `toPort` parameter.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-protocol)
         */
        public fun protocol(): String? = unwrap(this).getProtocol()

        /**
         * The last port in a range of open ports on an instance.
         *
         * Allowed ports:
         * * TCP and UDP - `0` to `65535`
         * * ICMP - The ICMP code for IPv4 addresses. For example, specify `8` as the `fromPort`
         *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
         * * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify `128` as the `fromPort`
         *   (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-toport)
         */
        public fun toPort(): Number? = unwrap(this).getToPort()

        /** A builder for [PortProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param accessDirection The access direction ( `inbound` or `outbound` ).
             *
             * Lightsail currently supports only `inbound` access direction.
             */
            public fun accessDirection(accessDirection: String)

            /**
             * @param accessFrom The location from which access is allowed. For example, `Anywhere
             *   (0.0.0.0/0)` , or `Custom` if a specific IP address or range of IP addresses is
             *   allowed.
             */
            public fun accessFrom(accessFrom: String)

            /** @param accessType The type of access ( `Public` or `Private` ). */
            public fun accessType(accessType: String)

            /**
             * @param cidrListAliases An alias that defines access for a preconfigured range of IP
             *   addresses. The only alias currently supported is `lightsail-connect` , which allows
             *   IP addresses of the browser-based RDP/SSH client in the Lightsail console to
             *   connect to your instance.
             */
            public fun cidrListAliases(cidrListAliases: List<String>)

            /**
             * @param cidrListAliases An alias that defines access for a preconfigured range of IP
             *   addresses. The only alias currently supported is `lightsail-connect` , which allows
             *   IP addresses of the browser-based RDP/SSH client in the Lightsail console to
             *   connect to your instance.
             */
            public fun cidrListAliases(vararg cidrListAliases: String)

            /**
             * @param cidrs The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are
             *   allowed to connect to an instance through the ports, and the protocol.
             *
             * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an
             * instance.
             *
             * Examples:
             * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
             * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
             */
            public fun cidrs(cidrs: List<String>)

            /**
             * @param cidrs The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are
             *   allowed to connect to an instance through the ports, and the protocol.
             *
             * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an
             * instance.
             *
             * Examples:
             * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
             * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
             */
            public fun cidrs(vararg cidrs: String)

            /** @param commonName The common name of the port information. */
            public fun commonName(commonName: String)

            /**
             * @param fromPort The first port in a range of open ports on an instance. Allowed
             *   ports:
             * * TCP and UDP - `0` to `65535`
             * * ICMP - The ICMP type for IPv4 addresses. For example, specify `8` as the `fromPort`
             *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
             * * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify `128` as the
             *   `fromPort` (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
             */
            public fun fromPort(fromPort: Number)

            /**
             * @param ipv6Cidrs The IPv6 address, or range of IPv6 addresses (in CIDR notation) that
             *   are allowed to connect to an instance through the ports, and the protocol. Only
             *   devices with an IPv6 address can connect to an instance through IPv6; otherwise,
             *   IPv4 should be used.
             *
             * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an
             * instance.
             */
            public fun ipv6Cidrs(ipv6Cidrs: List<String>)

            /**
             * @param ipv6Cidrs The IPv6 address, or range of IPv6 addresses (in CIDR notation) that
             *   are allowed to connect to an instance through the ports, and the protocol. Only
             *   devices with an IPv6 address can connect to an instance through IPv6; otherwise,
             *   IPv4 should be used.
             *
             * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an
             * instance.
             */
            public fun ipv6Cidrs(vararg ipv6Cidrs: String)

            /**
             * @param protocol The IP protocol name. The name can be one of the following:
             * * `tcp` - Transmission Control Protocol (TCP) provides reliable, ordered, and
             *   error-checked delivery of streamed data between applications running on hosts
             *   communicating by an IP network. If you have an application that doesn't require
             *   reliable data stream service, use UDP instead.
             * * `all` - All transport layer protocol types.
             * * `udp` - With User Datagram Protocol (UDP), computer applications can send messages
             *   (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior
             *   communications are not required to set up transmission channels or data paths.
             *   Applications that don't require reliable data stream service can use UDP, which
             *   provides a connectionless datagram service that emphasizes reduced latency over
             *   reliability. If you do require reliable data stream service, use TCP instead.
             * * `icmp` - Internet Control Message Protocol (ICMP) is used to send error messages
             *   and operational information indicating success or failure when communicating with
             *   an instance. For example, an error is indicated when an instance could not be
             *   reached. When you specify `icmp` as the `protocol` , you must specify the ICMP type
             *   using the `fromPort` parameter, and ICMP code using the `toPort` parameter.
             */
            public fun protocol(protocol: String)

            /**
             * @param toPort The last port in a range of open ports on an instance. Allowed ports:
             * * TCP and UDP - `0` to `65535`
             * * ICMP - The ICMP code for IPv4 addresses. For example, specify `8` as the `fromPort`
             *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
             * * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify `128` as the
             *   `fromPort` (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
             */
            public fun toPort(toPort: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty.builder()

            /**
             * @param accessDirection The access direction ( `inbound` or `outbound` ).
             *
             * Lightsail currently supports only `inbound` access direction.
             */
            override fun accessDirection(accessDirection: String) {
                cdkBuilder.accessDirection(accessDirection)
            }

            /**
             * @param accessFrom The location from which access is allowed. For example, `Anywhere
             *   (0.0.0.0/0)` , or `Custom` if a specific IP address or range of IP addresses is
             *   allowed.
             */
            override fun accessFrom(accessFrom: String) {
                cdkBuilder.accessFrom(accessFrom)
            }

            /** @param accessType The type of access ( `Public` or `Private` ). */
            override fun accessType(accessType: String) {
                cdkBuilder.accessType(accessType)
            }

            /**
             * @param cidrListAliases An alias that defines access for a preconfigured range of IP
             *   addresses. The only alias currently supported is `lightsail-connect` , which allows
             *   IP addresses of the browser-based RDP/SSH client in the Lightsail console to
             *   connect to your instance.
             */
            override fun cidrListAliases(cidrListAliases: List<String>) {
                cdkBuilder.cidrListAliases(cidrListAliases)
            }

            /**
             * @param cidrListAliases An alias that defines access for a preconfigured range of IP
             *   addresses. The only alias currently supported is `lightsail-connect` , which allows
             *   IP addresses of the browser-based RDP/SSH client in the Lightsail console to
             *   connect to your instance.
             */
            override fun cidrListAliases(vararg cidrListAliases: String): Unit =
                cidrListAliases(cidrListAliases.toList())

            /**
             * @param cidrs The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are
             *   allowed to connect to an instance through the ports, and the protocol.
             *
             * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an
             * instance.
             *
             * Examples:
             * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
             * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
             */
            override fun cidrs(cidrs: List<String>) {
                cdkBuilder.cidrs(cidrs)
            }

            /**
             * @param cidrs The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are
             *   allowed to connect to an instance through the ports, and the protocol.
             *
             * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an
             * instance.
             *
             * Examples:
             * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
             * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
             */
            override fun cidrs(vararg cidrs: String): Unit = cidrs(cidrs.toList())

            /** @param commonName The common name of the port information. */
            override fun commonName(commonName: String) {
                cdkBuilder.commonName(commonName)
            }

            /**
             * @param fromPort The first port in a range of open ports on an instance. Allowed
             *   ports:
             * * TCP and UDP - `0` to `65535`
             * * ICMP - The ICMP type for IPv4 addresses. For example, specify `8` as the `fromPort`
             *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
             * * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify `128` as the
             *   `fromPort` (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
             */
            override fun fromPort(fromPort: Number) {
                cdkBuilder.fromPort(fromPort)
            }

            /**
             * @param ipv6Cidrs The IPv6 address, or range of IPv6 addresses (in CIDR notation) that
             *   are allowed to connect to an instance through the ports, and the protocol. Only
             *   devices with an IPv6 address can connect to an instance through IPv6; otherwise,
             *   IPv4 should be used.
             *
             * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an
             * instance.
             */
            override fun ipv6Cidrs(ipv6Cidrs: List<String>) {
                cdkBuilder.ipv6Cidrs(ipv6Cidrs)
            }

            /**
             * @param ipv6Cidrs The IPv6 address, or range of IPv6 addresses (in CIDR notation) that
             *   are allowed to connect to an instance through the ports, and the protocol. Only
             *   devices with an IPv6 address can connect to an instance through IPv6; otherwise,
             *   IPv4 should be used.
             *
             * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an
             * instance.
             */
            override fun ipv6Cidrs(vararg ipv6Cidrs: String): Unit = ipv6Cidrs(ipv6Cidrs.toList())

            /**
             * @param protocol The IP protocol name. The name can be one of the following:
             * * `tcp` - Transmission Control Protocol (TCP) provides reliable, ordered, and
             *   error-checked delivery of streamed data between applications running on hosts
             *   communicating by an IP network. If you have an application that doesn't require
             *   reliable data stream service, use UDP instead.
             * * `all` - All transport layer protocol types.
             * * `udp` - With User Datagram Protocol (UDP), computer applications can send messages
             *   (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior
             *   communications are not required to set up transmission channels or data paths.
             *   Applications that don't require reliable data stream service can use UDP, which
             *   provides a connectionless datagram service that emphasizes reduced latency over
             *   reliability. If you do require reliable data stream service, use TCP instead.
             * * `icmp` - Internet Control Message Protocol (ICMP) is used to send error messages
             *   and operational information indicating success or failure when communicating with
             *   an instance. For example, an error is indicated when an instance could not be
             *   reached. When you specify `icmp` as the `protocol` , you must specify the ICMP type
             *   using the `fromPort` parameter, and ICMP code using the `toPort` parameter.
             */
            override fun protocol(protocol: String) {
                cdkBuilder.protocol(protocol)
            }

            /**
             * @param toPort The last port in a range of open ports on an instance. Allowed ports:
             * * TCP and UDP - `0` to `65535`
             * * ICMP - The ICMP code for IPv4 addresses. For example, specify `8` as the `fromPort`
             *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
             * * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify `128` as the
             *   `fromPort` (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
             */
            override fun toPort(toPort: Number) {
                cdkBuilder.toPort(toPort)
            }

            public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty,
        ) : PortProperty {
            /**
             * The access direction ( `inbound` or `outbound` ).
             *
             * Lightsail currently supports only `inbound` access direction.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-accessdirection)
             */
            override fun accessDirection(): String? = unwrap(this).getAccessDirection()

            /**
             * The location from which access is allowed.
             *
             * For example, `Anywhere (0.0.0.0/0)` , or `Custom` if a specific IP address or range
             * of IP addresses is allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-accessfrom)
             */
            override fun accessFrom(): String? = unwrap(this).getAccessFrom()

            /**
             * The type of access ( `Public` or `Private` ).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-accesstype)
             */
            override fun accessType(): String? = unwrap(this).getAccessType()

            /**
             * An alias that defines access for a preconfigured range of IP addresses.
             *
             * The only alias currently supported is `lightsail-connect` , which allows IP addresses
             * of the browser-based RDP/SSH client in the Lightsail console to connect to your
             * instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-cidrlistaliases)
             */
            override fun cidrListAliases(): List<String> =
                unwrap(this).getCidrListAliases() ?: emptyList()

            /**
             * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to
             * connect to an instance through the ports, and the protocol.
             *
             * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an
             * instance.
             *
             * Examples:
             * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
             * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-cidrs)
             */
            override fun cidrs(): List<String> = unwrap(this).getCidrs() ?: emptyList()

            /**
             * The common name of the port information.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-commonname)
             */
            override fun commonName(): String? = unwrap(this).getCommonName()

            /**
             * The first port in a range of open ports on an instance.
             *
             * Allowed ports:
             * * TCP and UDP - `0` to `65535`
             * * ICMP - The ICMP type for IPv4 addresses. For example, specify `8` as the `fromPort`
             *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
             * * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify `128` as the
             *   `fromPort` (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-fromport)
             */
            override fun fromPort(): Number? = unwrap(this).getFromPort()

            /**
             * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to
             * connect to an instance through the ports, and the protocol.
             *
             * Only devices with an IPv6 address can connect to an instance through IPv6; otherwise,
             * IPv4 should be used.
             *
             * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an
             * instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-ipv6cidrs)
             */
            override fun ipv6Cidrs(): List<String> = unwrap(this).getIpv6Cidrs() ?: emptyList()

            /**
             * The IP protocol name.
             *
             * The name can be one of the following:
             * * `tcp` - Transmission Control Protocol (TCP) provides reliable, ordered, and
             *   error-checked delivery of streamed data between applications running on hosts
             *   communicating by an IP network. If you have an application that doesn't require
             *   reliable data stream service, use UDP instead.
             * * `all` - All transport layer protocol types.
             * * `udp` - With User Datagram Protocol (UDP), computer applications can send messages
             *   (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior
             *   communications are not required to set up transmission channels or data paths.
             *   Applications that don't require reliable data stream service can use UDP, which
             *   provides a connectionless datagram service that emphasizes reduced latency over
             *   reliability. If you do require reliable data stream service, use TCP instead.
             * * `icmp` - Internet Control Message Protocol (ICMP) is used to send error messages
             *   and operational information indicating success or failure when communicating with
             *   an instance. For example, an error is indicated when an instance could not be
             *   reached. When you specify `icmp` as the `protocol` , you must specify the ICMP type
             *   using the `fromPort` parameter, and ICMP code using the `toPort` parameter.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-protocol)
             */
            override fun protocol(): String? = unwrap(this).getProtocol()

            /**
             * The last port in a range of open ports on an instance.
             *
             * Allowed ports:
             * * TCP and UDP - `0` to `65535`
             * * ICMP - The ICMP code for IPv4 addresses. For example, specify `8` as the `fromPort`
             *   (ICMP type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
             * * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify `128` as the
             *   `fromPort` (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html#cfn-lightsail-instance-port-toport)
             */
            override fun toPort(): Number? = unwrap(this).getToPort()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PortProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty
            ): PortProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PortProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.PortProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface HardwareProperty {
        /**
         * The number of vCPUs the instance has.
         *
         * The `CpuCount` property is read-only and should not be specified in a create instance or
         * update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html#cfn-lightsail-instance-hardware-cpucount)
         */
        public fun cpuCount(): Number? = unwrap(this).getCpuCount()

        /**
         * The disks attached to the instance.
         *
         * The instance restarts when performing an attach disk or detach disk request. This resets
         * the public IP address of your instance if a static IP isn't attached to it.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html#cfn-lightsail-instance-hardware-disks)
         */
        public fun disks(): Any? = unwrap(this).getDisks()

        /**
         * The amount of RAM in GB on the instance (for example, `1.0` ).
         *
         * The `RamSizeInGb` property is read-only and should not be specified in a create instance
         * or update instance request.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html#cfn-lightsail-instance-hardware-ramsizeingb)
         */
        public fun ramSizeInGb(): Number? = unwrap(this).getRamSizeInGb()

        /** A builder for [HardwareProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param cpuCount The number of vCPUs the instance has.
             *
             * The `CpuCount` property is read-only and should not be specified in a create instance
             * or update instance request.
             */
            public fun cpuCount(cpuCount: Number)

            /**
             * @param disks The disks attached to the instance. The instance restarts when
             *   performing an attach disk or detach disk request. This resets the public IP address
             *   of your instance if a static IP isn't attached to it.
             */
            public fun disks(disks: IResolvable)

            /**
             * @param disks The disks attached to the instance. The instance restarts when
             *   performing an attach disk or detach disk request. This resets the public IP address
             *   of your instance if a static IP isn't attached to it.
             */
            public fun disks(disks: List<Any>)

            /**
             * @param disks The disks attached to the instance. The instance restarts when
             *   performing an attach disk or detach disk request. This resets the public IP address
             *   of your instance if a static IP isn't attached to it.
             */
            public fun disks(vararg disks: Any)

            /**
             * @param ramSizeInGb The amount of RAM in GB on the instance (for example, `1.0` ).
             *
             * The `RamSizeInGb` property is read-only and should not be specified in a create
             * instance or update instance request.
             */
            public fun ramSizeInGb(ramSizeInGb: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty.builder()

            /**
             * @param cpuCount The number of vCPUs the instance has.
             *
             * The `CpuCount` property is read-only and should not be specified in a create instance
             * or update instance request.
             */
            override fun cpuCount(cpuCount: Number) {
                cdkBuilder.cpuCount(cpuCount)
            }

            /**
             * @param disks The disks attached to the instance. The instance restarts when
             *   performing an attach disk or detach disk request. This resets the public IP address
             *   of your instance if a static IP isn't attached to it.
             */
            override fun disks(disks: IResolvable) {
                cdkBuilder.disks(disks.let(IResolvable::unwrap))
            }

            /**
             * @param disks The disks attached to the instance. The instance restarts when
             *   performing an attach disk or detach disk request. This resets the public IP address
             *   of your instance if a static IP isn't attached to it.
             */
            override fun disks(disks: List<Any>) {
                cdkBuilder.disks(disks)
            }

            /**
             * @param disks The disks attached to the instance. The instance restarts when
             *   performing an attach disk or detach disk request. This resets the public IP address
             *   of your instance if a static IP isn't attached to it.
             */
            override fun disks(vararg disks: Any): Unit = disks(disks.toList())

            /**
             * @param ramSizeInGb The amount of RAM in GB on the instance (for example, `1.0` ).
             *
             * The `RamSizeInGb` property is read-only and should not be specified in a create
             * instance or update instance request.
             */
            override fun ramSizeInGb(ramSizeInGb: Number) {
                cdkBuilder.ramSizeInGb(ramSizeInGb)
            }

            public fun build():
                software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty,
        ) : HardwareProperty {
            /**
             * The number of vCPUs the instance has.
             *
             * The `CpuCount` property is read-only and should not be specified in a create instance
             * or update instance request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html#cfn-lightsail-instance-hardware-cpucount)
             */
            override fun cpuCount(): Number? = unwrap(this).getCpuCount()

            /**
             * The disks attached to the instance.
             *
             * The instance restarts when performing an attach disk or detach disk request. This
             * resets the public IP address of your instance if a static IP isn't attached to it.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html#cfn-lightsail-instance-hardware-disks)
             */
            override fun disks(): Any? = unwrap(this).getDisks()

            /**
             * The amount of RAM in GB on the instance (for example, `1.0` ).
             *
             * The `RamSizeInGb` property is read-only and should not be specified in a create
             * instance or update instance request.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html#cfn-lightsail-instance-hardware-ramsizeingb)
             */
            override fun ramSizeInGb(): Number? = unwrap(this).getRamSizeInGb()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): HardwareProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty
            ): HardwareProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: HardwareProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface NetworkingProperty {
        /**
         * The monthly amount of data transfer, in GB, allocated for the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html#cfn-lightsail-instance-networking-monthlytransfer)
         */
        public fun monthlyTransfer(): Any? = unwrap(this).getMonthlyTransfer()

        /**
         * An array of ports to open on the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html#cfn-lightsail-instance-networking-ports)
         */
        public fun ports(): Any

        /** A builder for [NetworkingProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param monthlyTransfer The monthly amount of data transfer, in GB, allocated for the
             *   instance.
             */
            public fun monthlyTransfer(monthlyTransfer: IResolvable)

            /**
             * @param monthlyTransfer The monthly amount of data transfer, in GB, allocated for the
             *   instance.
             */
            public fun monthlyTransfer(monthlyTransfer: MonthlyTransferProperty)

            /**
             * @param monthlyTransfer The monthly amount of data transfer, in GB, allocated for the
             *   instance.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ff4d0c710cbbf74a4e44ae395636ac31094b5f37aa90b66fd7e1eff401f62a7a")
            public fun monthlyTransfer(monthlyTransfer: MonthlyTransferProperty.Builder.() -> Unit)

            /** @param ports An array of ports to open on the instance. */
            public fun ports(ports: IResolvable)

            /** @param ports An array of ports to open on the instance. */
            public fun ports(ports: List<Any>)

            /** @param ports An array of ports to open on the instance. */
            public fun ports(vararg ports: Any)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty.builder()

            /**
             * @param monthlyTransfer The monthly amount of data transfer, in GB, allocated for the
             *   instance.
             */
            override fun monthlyTransfer(monthlyTransfer: IResolvable) {
                cdkBuilder.monthlyTransfer(monthlyTransfer.let(IResolvable::unwrap))
            }

            /**
             * @param monthlyTransfer The monthly amount of data transfer, in GB, allocated for the
             *   instance.
             */
            override fun monthlyTransfer(monthlyTransfer: MonthlyTransferProperty) {
                cdkBuilder.monthlyTransfer(monthlyTransfer.let(MonthlyTransferProperty::unwrap))
            }

            /**
             * @param monthlyTransfer The monthly amount of data transfer, in GB, allocated for the
             *   instance.
             */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("ff4d0c710cbbf74a4e44ae395636ac31094b5f37aa90b66fd7e1eff401f62a7a")
            override fun monthlyTransfer(
                monthlyTransfer: MonthlyTransferProperty.Builder.() -> Unit
            ): Unit = monthlyTransfer(MonthlyTransferProperty(monthlyTransfer))

            /** @param ports An array of ports to open on the instance. */
            override fun ports(ports: IResolvable) {
                cdkBuilder.ports(ports.let(IResolvable::unwrap))
            }

            /** @param ports An array of ports to open on the instance. */
            override fun ports(ports: List<Any>) {
                cdkBuilder.ports(ports)
            }

            /** @param ports An array of ports to open on the instance. */
            override fun ports(vararg ports: Any): Unit = ports(ports.toList())

            public fun build():
                software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty,
        ) : NetworkingProperty {
            /**
             * The monthly amount of data transfer, in GB, allocated for the instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html#cfn-lightsail-instance-networking-monthlytransfer)
             */
            override fun monthlyTransfer(): Any? = unwrap(this).getMonthlyTransfer()

            /**
             * An array of ports to open on the instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html#cfn-lightsail-instance-networking-ports)
             */
            override fun ports(): Any = unwrap(this).getPorts()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): NetworkingProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty
            ): NetworkingProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: NetworkingProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface StateProperty {
        /**
         * The status code of the instance.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-state.html#cfn-lightsail-instance-state-code)
         */
        public fun code(): Number? = unwrap(this).getCode()

        /**
         * The state of the instance (for example, `running` or `pending` ).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-state.html#cfn-lightsail-instance-state-name)
         */
        public fun name(): String? = unwrap(this).getName()

        /** A builder for [StateProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param code The status code of the instance. */
            public fun code(code: Number)

            /** @param name The state of the instance (for example, `running` or `pending` ). */
            public fun name(name: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty.builder()

            /** @param code The status code of the instance. */
            override fun code(code: Number) {
                cdkBuilder.code(code)
            }

            /** @param name The state of the instance (for example, `running` or `pending` ). */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            public fun build():
                software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty,
        ) : StateProperty {
            /**
             * The status code of the instance.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-state.html#cfn-lightsail-instance-state-code)
             */
            override fun code(): Number? = unwrap(this).getCode()

            /**
             * The state of the instance (for example, `running` or `pending` ).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-state.html#cfn-lightsail-instance-state-name)
             */
            override fun name(): String? = unwrap(this).getName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): StateProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty
            ): StateProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: StateProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface DiskProperty {
        /**
         * The resources to which the disk is attached.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-attachedto)
         */
        public fun attachedTo(): String? = unwrap(this).getAttachedTo()

        /**
         * (Deprecated) The attachment state of the disk.
         *
         * In releases prior to November 14, 2017, this parameter returned `attached` for system
         * disks in the API response. It is now deprecated, but still included in the response. Use
         * `isAttached` instead.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-attachmentstate)
         */
        public fun attachmentState(): String? = unwrap(this).getAttachmentState()

        /**
         * The unique name of the disk.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-diskname)
         */
        public fun diskName(): String

        /**
         * The input/output operations per second (IOPS) of the disk.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-iops)
         */
        public fun iops(): Number? = unwrap(this).getIops()

        /**
         * A Boolean value indicating whether this disk is a system disk (has an operating system
         * loaded on it).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-issystemdisk)
         */
        public fun isSystemDisk(): Any? = unwrap(this).getIsSystemDisk()

        /**
         * The disk path.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-path)
         */
        public fun path(): String

        /**
         * The size of the disk in GB.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-sizeingb)
         */
        public fun sizeInGb(): String? = unwrap(this).getSizeInGb()

        /** A builder for [DiskProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param attachedTo The resources to which the disk is attached. */
            public fun attachedTo(attachedTo: String)

            /**
             * @param attachmentState (Deprecated) The attachment state of the disk.
             *
             * In releases prior to November 14, 2017, this parameter returned `attached` for system
             * disks in the API response. It is now deprecated, but still included in the response.
             * Use `isAttached` instead.
             */
            public fun attachmentState(attachmentState: String)

            /** @param diskName The unique name of the disk. */
            public fun diskName(diskName: String)

            /** @param iops The input/output operations per second (IOPS) of the disk. */
            public fun iops(iops: Number)

            /**
             * @param isSystemDisk A Boolean value indicating whether this disk is a system disk
             *   (has an operating system loaded on it).
             */
            public fun isSystemDisk(isSystemDisk: Boolean)

            /**
             * @param isSystemDisk A Boolean value indicating whether this disk is a system disk
             *   (has an operating system loaded on it).
             */
            public fun isSystemDisk(isSystemDisk: IResolvable)

            /** @param path The disk path. */
            public fun path(path: String)

            /** @param sizeInGb The size of the disk in GB. */
            public fun sizeInGb(sizeInGb: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty.Builder =
                software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty.builder()

            /** @param attachedTo The resources to which the disk is attached. */
            override fun attachedTo(attachedTo: String) {
                cdkBuilder.attachedTo(attachedTo)
            }

            /**
             * @param attachmentState (Deprecated) The attachment state of the disk.
             *
             * In releases prior to November 14, 2017, this parameter returned `attached` for system
             * disks in the API response. It is now deprecated, but still included in the response.
             * Use `isAttached` instead.
             */
            override fun attachmentState(attachmentState: String) {
                cdkBuilder.attachmentState(attachmentState)
            }

            /** @param diskName The unique name of the disk. */
            override fun diskName(diskName: String) {
                cdkBuilder.diskName(diskName)
            }

            /** @param iops The input/output operations per second (IOPS) of the disk. */
            override fun iops(iops: Number) {
                cdkBuilder.iops(iops)
            }

            /**
             * @param isSystemDisk A Boolean value indicating whether this disk is a system disk
             *   (has an operating system loaded on it).
             */
            override fun isSystemDisk(isSystemDisk: Boolean) {
                cdkBuilder.isSystemDisk(isSystemDisk)
            }

            /**
             * @param isSystemDisk A Boolean value indicating whether this disk is a system disk
             *   (has an operating system loaded on it).
             */
            override fun isSystemDisk(isSystemDisk: IResolvable) {
                cdkBuilder.isSystemDisk(isSystemDisk.let(IResolvable::unwrap))
            }

            /** @param path The disk path. */
            override fun path(path: String) {
                cdkBuilder.path(path)
            }

            /** @param sizeInGb The size of the disk in GB. */
            override fun sizeInGb(sizeInGb: String) {
                cdkBuilder.sizeInGb(sizeInGb)
            }

            public fun build(): software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty,
        ) : DiskProperty {
            /**
             * The resources to which the disk is attached.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-attachedto)
             */
            override fun attachedTo(): String? = unwrap(this).getAttachedTo()

            /**
             * (Deprecated) The attachment state of the disk.
             *
             * In releases prior to November 14, 2017, this parameter returned `attached` for system
             * disks in the API response. It is now deprecated, but still included in the response.
             * Use `isAttached` instead.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-attachmentstate)
             */
            override fun attachmentState(): String? = unwrap(this).getAttachmentState()

            /**
             * The unique name of the disk.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-diskname)
             */
            override fun diskName(): String = unwrap(this).getDiskName()

            /**
             * The input/output operations per second (IOPS) of the disk.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-iops)
             */
            override fun iops(): Number? = unwrap(this).getIops()

            /**
             * A Boolean value indicating whether this disk is a system disk (has an operating
             * system loaded on it).
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-issystemdisk)
             */
            override fun isSystemDisk(): Any? = unwrap(this).getIsSystemDisk()

            /**
             * The disk path.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-path)
             */
            override fun path(): String = unwrap(this).getPath()

            /**
             * The size of the disk in GB.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html#cfn-lightsail-instance-disk-sizeingb)
             */
            override fun sizeInGb(): String? = unwrap(this).getSizeInGb()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): DiskProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty
            ): DiskProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: DiskProperty
            ): software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
