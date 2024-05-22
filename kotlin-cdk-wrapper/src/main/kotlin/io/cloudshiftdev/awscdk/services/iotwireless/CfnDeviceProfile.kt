@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new device profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotwireless.*;
 * CfnDeviceProfile cfnDeviceProfile = CfnDeviceProfile.Builder.create(this, "MyCfnDeviceProfile")
 * .loRaWan(LoRaWANDeviceProfileProperty.builder()
 * .classBTimeout(123)
 * .classCTimeout(123)
 * .factoryPresetFreqsList(List.of(123))
 * .macVersion("macVersion")
 * .maxDutyCycle(123)
 * .maxEirp(123)
 * .pingSlotDr(123)
 * .pingSlotFreq(123)
 * .pingSlotPeriod(123)
 * .regParamsRevision("regParamsRevision")
 * .rfRegion("rfRegion")
 * .rxDataRate2(123)
 * .rxDelay1(123)
 * .rxDrOffset1(123)
 * .rxFreq2(123)
 * .supports32BitFCnt(false)
 * .supportsClassB(false)
 * .supportsClassC(false)
 * .supportsJoin(false)
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html)
 */
public open class CfnDeviceProfile(
  cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iotwireless.CfnDeviceProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceProfileProps,
  ) :
      this(software.amazon.awscdk.services.iotwireless.CfnDeviceProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeviceProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeviceProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeviceProfileProps(props)
  )

  /**
   * The ARN of the device profile created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the device profile created.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * LoRaWAN device profile object.
   */
  public open fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  /**
   * LoRaWAN device profile object.
   */
  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * LoRaWAN device profile object.
   */
  public open fun loRaWan(`value`: LoRaWANDeviceProfileProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANDeviceProfileProperty.Companion::unwrap))
  }

  /**
   * LoRaWAN device profile object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9694f3d903c8ae2dd619dac8bae1b4904683a5da9eab72ac4356d10d2dfd339")
  public open fun loRaWan(`value`: LoRaWANDeviceProfileProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANDeviceProfileProperty(`value`))

  /**
   * The name of the new resource.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the new resource.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotwireless.CfnDeviceProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object. 
     */
    public fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty)

    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43d18a99c6fb09138d364c62a84567fa24f505a0db0725063028f05af9e6abe6")
    public fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty.Builder.() -> Unit)

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-name)
     * @param name The name of the new resource. 
     */
    public fun name(name: String)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.Builder =
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.Builder.create(scope, id)

    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable.Companion::unwrap))
    }

    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object. 
     */
    override fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANDeviceProfileProperty.Companion::unwrap))
    }

    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43d18a99c6fb09138d364c62a84567fa24f505a0db0725063028f05af9e6abe6")
    override fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANDeviceProfileProperty(loRaWan))

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-name)
     * @param name The name of the new resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnDeviceProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile):
        CfnDeviceProfile = CfnDeviceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProfile):
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
  }

  /**
   * LoRaWAN device profile object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotwireless.*;
   * LoRaWANDeviceProfileProperty loRaWANDeviceProfileProperty =
   * LoRaWANDeviceProfileProperty.builder()
   * .classBTimeout(123)
   * .classCTimeout(123)
   * .factoryPresetFreqsList(List.of(123))
   * .macVersion("macVersion")
   * .maxDutyCycle(123)
   * .maxEirp(123)
   * .pingSlotDr(123)
   * .pingSlotFreq(123)
   * .pingSlotPeriod(123)
   * .regParamsRevision("regParamsRevision")
   * .rfRegion("rfRegion")
   * .rxDataRate2(123)
   * .rxDelay1(123)
   * .rxDrOffset1(123)
   * .rxFreq2(123)
   * .supports32BitFCnt(false)
   * .supportsClassB(false)
   * .supportsClassC(false)
   * .supportsJoin(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html)
   */
  public interface LoRaWANDeviceProfileProperty {
    /**
     * The ClassBTimeout value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-classbtimeout)
     */
    public fun classBTimeout(): Number? = unwrap(this).getClassBTimeout()

    /**
     * The ClassCTimeout value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-classctimeout)
     */
    public fun classCTimeout(): Number? = unwrap(this).getClassCTimeout()

    /**
     * The list of values that make up the FactoryPresetFreqs value.
     *
     * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-factorypresetfreqslist)
     */
    public fun factoryPresetFreqsList(): Any? = unwrap(this).getFactoryPresetFreqsList()

    /**
     * The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-macversion)
     */
    public fun macVersion(): String? = unwrap(this).getMacVersion()

    /**
     * The MaxDutyCycle value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-maxdutycycle)
     */
    public fun maxDutyCycle(): Number? = unwrap(this).getMaxDutyCycle()

    /**
     * The MaxEIRP value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-maxeirp)
     */
    public fun maxEirp(): Number? = unwrap(this).getMaxEirp()

    /**
     * The PingSlotDR value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-pingslotdr)
     */
    public fun pingSlotDr(): Number? = unwrap(this).getPingSlotDr()

    /**
     * The PingSlotFreq value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-pingslotfreq)
     */
    public fun pingSlotFreq(): Number? = unwrap(this).getPingSlotFreq()

    /**
     * The PingSlotPeriod value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-pingslotperiod)
     */
    public fun pingSlotPeriod(): Number? = unwrap(this).getPingSlotPeriod()

    /**
     * The version of regional parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-regparamsrevision)
     */
    public fun regParamsRevision(): String? = unwrap(this).getRegParamsRevision()

    /**
     * The frequency band (RFRegion) value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rfregion)
     */
    public fun rfRegion(): String? = unwrap(this).getRfRegion()

    /**
     * The RXDataRate2 value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxdatarate2)
     */
    public fun rxDataRate2(): Number? = unwrap(this).getRxDataRate2()

    /**
     * The RXDelay1 value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxdelay1)
     */
    public fun rxDelay1(): Number? = unwrap(this).getRxDelay1()

    /**
     * The RXDROffset1 value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxdroffset1)
     */
    public fun rxDrOffset1(): Number? = unwrap(this).getRxDrOffset1()

    /**
     * The RXFreq2 value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxfreq2)
     */
    public fun rxFreq2(): Number? = unwrap(this).getRxFreq2()

    /**
     * The Supports32BitFCnt value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supports32bitfcnt)
     */
    public fun supports32BitFCnt(): Any? = unwrap(this).getSupports32BitFCnt()

    /**
     * The SupportsClassB value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supportsclassb)
     */
    public fun supportsClassB(): Any? = unwrap(this).getSupportsClassB()

    /**
     * The SupportsClassC value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supportsclassc)
     */
    public fun supportsClassC(): Any? = unwrap(this).getSupportsClassC()

    /**
     * The SupportsJoin value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supportsjoin)
     */
    public fun supportsJoin(): Any? = unwrap(this).getSupportsJoin()

    /**
     * A builder for [LoRaWANDeviceProfileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param classBTimeout The ClassBTimeout value.
       */
      public fun classBTimeout(classBTimeout: Number)

      /**
       * @param classCTimeout The ClassCTimeout value.
       */
      public fun classCTimeout(classCTimeout: Number)

      /**
       * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
       * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
       */
      public fun factoryPresetFreqsList(factoryPresetFreqsList: IResolvable)

      /**
       * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
       * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
       */
      public fun factoryPresetFreqsList(factoryPresetFreqsList: List<Number>)

      /**
       * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
       * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
       */
      public fun factoryPresetFreqsList(vararg factoryPresetFreqsList: Number)

      /**
       * @param macVersion The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device
       * profile.
       */
      public fun macVersion(macVersion: String)

      /**
       * @param maxDutyCycle The MaxDutyCycle value.
       */
      public fun maxDutyCycle(maxDutyCycle: Number)

      /**
       * @param maxEirp The MaxEIRP value.
       */
      public fun maxEirp(maxEirp: Number)

      /**
       * @param pingSlotDr The PingSlotDR value.
       */
      public fun pingSlotDr(pingSlotDr: Number)

      /**
       * @param pingSlotFreq The PingSlotFreq value.
       */
      public fun pingSlotFreq(pingSlotFreq: Number)

      /**
       * @param pingSlotPeriod The PingSlotPeriod value.
       */
      public fun pingSlotPeriod(pingSlotPeriod: Number)

      /**
       * @param regParamsRevision The version of regional parameters.
       */
      public fun regParamsRevision(regParamsRevision: String)

      /**
       * @param rfRegion The frequency band (RFRegion) value.
       */
      public fun rfRegion(rfRegion: String)

      /**
       * @param rxDataRate2 The RXDataRate2 value.
       */
      public fun rxDataRate2(rxDataRate2: Number)

      /**
       * @param rxDelay1 The RXDelay1 value.
       */
      public fun rxDelay1(rxDelay1: Number)

      /**
       * @param rxDrOffset1 The RXDROffset1 value.
       */
      public fun rxDrOffset1(rxDrOffset1: Number)

      /**
       * @param rxFreq2 The RXFreq2 value.
       */
      public fun rxFreq2(rxFreq2: Number)

      /**
       * @param supports32BitFCnt The Supports32BitFCnt value.
       */
      public fun supports32BitFCnt(supports32BitFCnt: Boolean)

      /**
       * @param supports32BitFCnt The Supports32BitFCnt value.
       */
      public fun supports32BitFCnt(supports32BitFCnt: IResolvable)

      /**
       * @param supportsClassB The SupportsClassB value.
       */
      public fun supportsClassB(supportsClassB: Boolean)

      /**
       * @param supportsClassB The SupportsClassB value.
       */
      public fun supportsClassB(supportsClassB: IResolvable)

      /**
       * @param supportsClassC The SupportsClassC value.
       */
      public fun supportsClassC(supportsClassC: Boolean)

      /**
       * @param supportsClassC The SupportsClassC value.
       */
      public fun supportsClassC(supportsClassC: IResolvable)

      /**
       * @param supportsJoin The SupportsJoin value.
       */
      public fun supportsJoin(supportsJoin: Boolean)

      /**
       * @param supportsJoin The SupportsJoin value.
       */
      public fun supportsJoin(supportsJoin: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty.builder()

      /**
       * @param classBTimeout The ClassBTimeout value.
       */
      override fun classBTimeout(classBTimeout: Number) {
        cdkBuilder.classBTimeout(classBTimeout)
      }

      /**
       * @param classCTimeout The ClassCTimeout value.
       */
      override fun classCTimeout(classCTimeout: Number) {
        cdkBuilder.classCTimeout(classCTimeout)
      }

      /**
       * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
       * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
       */
      override fun factoryPresetFreqsList(factoryPresetFreqsList: IResolvable) {
        cdkBuilder.factoryPresetFreqsList(factoryPresetFreqsList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
       * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
       */
      override fun factoryPresetFreqsList(factoryPresetFreqsList: List<Number>) {
        cdkBuilder.factoryPresetFreqsList(factoryPresetFreqsList)
      }

      /**
       * @param factoryPresetFreqsList The list of values that make up the FactoryPresetFreqs value.
       * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
       */
      override fun factoryPresetFreqsList(vararg factoryPresetFreqsList: Number): Unit =
          factoryPresetFreqsList(factoryPresetFreqsList.toList())

      /**
       * @param macVersion The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device
       * profile.
       */
      override fun macVersion(macVersion: String) {
        cdkBuilder.macVersion(macVersion)
      }

      /**
       * @param maxDutyCycle The MaxDutyCycle value.
       */
      override fun maxDutyCycle(maxDutyCycle: Number) {
        cdkBuilder.maxDutyCycle(maxDutyCycle)
      }

      /**
       * @param maxEirp The MaxEIRP value.
       */
      override fun maxEirp(maxEirp: Number) {
        cdkBuilder.maxEirp(maxEirp)
      }

      /**
       * @param pingSlotDr The PingSlotDR value.
       */
      override fun pingSlotDr(pingSlotDr: Number) {
        cdkBuilder.pingSlotDr(pingSlotDr)
      }

      /**
       * @param pingSlotFreq The PingSlotFreq value.
       */
      override fun pingSlotFreq(pingSlotFreq: Number) {
        cdkBuilder.pingSlotFreq(pingSlotFreq)
      }

      /**
       * @param pingSlotPeriod The PingSlotPeriod value.
       */
      override fun pingSlotPeriod(pingSlotPeriod: Number) {
        cdkBuilder.pingSlotPeriod(pingSlotPeriod)
      }

      /**
       * @param regParamsRevision The version of regional parameters.
       */
      override fun regParamsRevision(regParamsRevision: String) {
        cdkBuilder.regParamsRevision(regParamsRevision)
      }

      /**
       * @param rfRegion The frequency band (RFRegion) value.
       */
      override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      /**
       * @param rxDataRate2 The RXDataRate2 value.
       */
      override fun rxDataRate2(rxDataRate2: Number) {
        cdkBuilder.rxDataRate2(rxDataRate2)
      }

      /**
       * @param rxDelay1 The RXDelay1 value.
       */
      override fun rxDelay1(rxDelay1: Number) {
        cdkBuilder.rxDelay1(rxDelay1)
      }

      /**
       * @param rxDrOffset1 The RXDROffset1 value.
       */
      override fun rxDrOffset1(rxDrOffset1: Number) {
        cdkBuilder.rxDrOffset1(rxDrOffset1)
      }

      /**
       * @param rxFreq2 The RXFreq2 value.
       */
      override fun rxFreq2(rxFreq2: Number) {
        cdkBuilder.rxFreq2(rxFreq2)
      }

      /**
       * @param supports32BitFCnt The Supports32BitFCnt value.
       */
      override fun supports32BitFCnt(supports32BitFCnt: Boolean) {
        cdkBuilder.supports32BitFCnt(supports32BitFCnt)
      }

      /**
       * @param supports32BitFCnt The Supports32BitFCnt value.
       */
      override fun supports32BitFCnt(supports32BitFCnt: IResolvable) {
        cdkBuilder.supports32BitFCnt(supports32BitFCnt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param supportsClassB The SupportsClassB value.
       */
      override fun supportsClassB(supportsClassB: Boolean) {
        cdkBuilder.supportsClassB(supportsClassB)
      }

      /**
       * @param supportsClassB The SupportsClassB value.
       */
      override fun supportsClassB(supportsClassB: IResolvable) {
        cdkBuilder.supportsClassB(supportsClassB.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param supportsClassC The SupportsClassC value.
       */
      override fun supportsClassC(supportsClassC: Boolean) {
        cdkBuilder.supportsClassC(supportsClassC)
      }

      /**
       * @param supportsClassC The SupportsClassC value.
       */
      override fun supportsClassC(supportsClassC: IResolvable) {
        cdkBuilder.supportsClassC(supportsClassC.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param supportsJoin The SupportsJoin value.
       */
      override fun supportsJoin(supportsJoin: Boolean) {
        cdkBuilder.supportsJoin(supportsJoin)
      }

      /**
       * @param supportsJoin The SupportsJoin value.
       */
      override fun supportsJoin(supportsJoin: IResolvable) {
        cdkBuilder.supportsJoin(supportsJoin.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty,
    ) : CdkObject(cdkObject), LoRaWANDeviceProfileProperty {
      /**
       * The ClassBTimeout value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-classbtimeout)
       */
      override fun classBTimeout(): Number? = unwrap(this).getClassBTimeout()

      /**
       * The ClassCTimeout value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-classctimeout)
       */
      override fun classCTimeout(): Number? = unwrap(this).getClassCTimeout()

      /**
       * The list of values that make up the FactoryPresetFreqs value.
       *
       * Valid range of values include a minimum value of 1000000 and a maximum value of 16700000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-factorypresetfreqslist)
       */
      override fun factoryPresetFreqsList(): Any? = unwrap(this).getFactoryPresetFreqsList()

      /**
       * The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-macversion)
       */
      override fun macVersion(): String? = unwrap(this).getMacVersion()

      /**
       * The MaxDutyCycle value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-maxdutycycle)
       */
      override fun maxDutyCycle(): Number? = unwrap(this).getMaxDutyCycle()

      /**
       * The MaxEIRP value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-maxeirp)
       */
      override fun maxEirp(): Number? = unwrap(this).getMaxEirp()

      /**
       * The PingSlotDR value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-pingslotdr)
       */
      override fun pingSlotDr(): Number? = unwrap(this).getPingSlotDr()

      /**
       * The PingSlotFreq value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-pingslotfreq)
       */
      override fun pingSlotFreq(): Number? = unwrap(this).getPingSlotFreq()

      /**
       * The PingSlotPeriod value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-pingslotperiod)
       */
      override fun pingSlotPeriod(): Number? = unwrap(this).getPingSlotPeriod()

      /**
       * The version of regional parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-regparamsrevision)
       */
      override fun regParamsRevision(): String? = unwrap(this).getRegParamsRevision()

      /**
       * The frequency band (RFRegion) value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rfregion)
       */
      override fun rfRegion(): String? = unwrap(this).getRfRegion()

      /**
       * The RXDataRate2 value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxdatarate2)
       */
      override fun rxDataRate2(): Number? = unwrap(this).getRxDataRate2()

      /**
       * The RXDelay1 value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxdelay1)
       */
      override fun rxDelay1(): Number? = unwrap(this).getRxDelay1()

      /**
       * The RXDROffset1 value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxdroffset1)
       */
      override fun rxDrOffset1(): Number? = unwrap(this).getRxDrOffset1()

      /**
       * The RXFreq2 value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-rxfreq2)
       */
      override fun rxFreq2(): Number? = unwrap(this).getRxFreq2()

      /**
       * The Supports32BitFCnt value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supports32bitfcnt)
       */
      override fun supports32BitFCnt(): Any? = unwrap(this).getSupports32BitFCnt()

      /**
       * The SupportsClassB value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supportsclassb)
       */
      override fun supportsClassB(): Any? = unwrap(this).getSupportsClassB()

      /**
       * The SupportsClassC value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supportsclassc)
       */
      override fun supportsClassC(): Any? = unwrap(this).getSupportsClassC()

      /**
       * The SupportsJoin value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-deviceprofile-lorawandeviceprofile.html#cfn-iotwireless-deviceprofile-lorawandeviceprofile-supportsjoin)
       */
      override fun supportsJoin(): Any? = unwrap(this).getSupportsJoin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANDeviceProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty):
          LoRaWANDeviceProfileProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoRaWANDeviceProfileProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANDeviceProfileProperty):
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty
    }
  }
}
