package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServiceProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the service profile created.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the service profile created.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ChannelMask value.
   */
  public open fun attrLoRaWanChannelMask(): String = unwrap(this).getAttrLoRaWanChannelMask()

  /**
   * The DevStatusReqFreq value.
   */
  public open fun attrLoRaWanDevStatusReqFreq(): Number =
      unwrap(this).getAttrLoRaWanDevStatusReqFreq()

  /**
   * The DLBucketSize value.
   */
  public open fun attrLoRaWanDlBucketSize(): Number = unwrap(this).getAttrLoRaWanDlBucketSize()

  /**
   * The DLRate value.
   */
  public open fun attrLoRaWanDlRate(): Number = unwrap(this).getAttrLoRaWanDlRate()

  /**
   * The DLRatePolicy value.
   */
  public open fun attrLoRaWanDlRatePolicy(): String = unwrap(this).getAttrLoRaWanDlRatePolicy()

  /**
   * The DRMax value.
   */
  public open fun attrLoRaWanDrMax(): Number = unwrap(this).getAttrLoRaWanDrMax()

  /**
   * The DRMin value.
   */
  public open fun attrLoRaWanDrMin(): Number = unwrap(this).getAttrLoRaWanDrMin()

  /**
   * The HRAllowed value that describes whether handover roaming is allowed.
   */
  public open fun attrLoRaWanHrAllowed(): IResolvable =
      unwrap(this).getAttrLoRaWanHrAllowed().let(IResolvable::wrap)

  /**
   * The MinGwDiversity value.
   */
  public open fun attrLoRaWanMinGwDiversity(): Number = unwrap(this).getAttrLoRaWanMinGwDiversity()

  /**
   * The NwkGeoLoc value.
   */
  public open fun attrLoRaWanNwkGeoLoc(): IResolvable =
      unwrap(this).getAttrLoRaWanNwkGeoLoc().let(IResolvable::wrap)

  /**
   * The ReportDevStatusBattery value.
   */
  public open fun attrLoRaWanReportDevStatusBattery(): IResolvable =
      unwrap(this).getAttrLoRaWanReportDevStatusBattery().let(IResolvable::wrap)

  /**
   * The ReportDevStatusMargin value.
   */
  public open fun attrLoRaWanReportDevStatusMargin(): IResolvable =
      unwrap(this).getAttrLoRaWanReportDevStatusMargin().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrLoRaWanResponse(): IResolvable =
      unwrap(this).getAttrLoRaWanResponse().let(IResolvable::wrap)

  /**
   * The TargetPer value.
   */
  public open fun attrLoRaWanTargetPer(): Number = unwrap(this).getAttrLoRaWanTargetPer()

  /**
   * The UlBucketSize value.
   */
  public open fun attrLoRaWanUlBucketSize(): Number = unwrap(this).getAttrLoRaWanUlBucketSize()

  /**
   * The ULRate value.
   */
  public open fun attrLoRaWanUlRate(): Number = unwrap(this).getAttrLoRaWanUlRate()

  /**
   * The ULRatePolicy value.
   */
  public open fun attrLoRaWanUlRatePolicy(): String = unwrap(this).getAttrLoRaWanUlRatePolicy()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * LoRaWAN service profile object.
   */
  public open fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  /**
   * LoRaWAN service profile object.
   */
  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable::unwrap))
  }

  /**
   * LoRaWAN service profile object.
   */
  public open fun loRaWan(`value`: LoRaWANServiceProfileProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANServiceProfileProperty::unwrap))
  }

  /**
   * LoRaWAN service profile object.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a90efb522269a4bef1cf7a8897f6cb01d2c8bc254c78d95f85206f6426485b2")
  public open fun loRaWan(`value`: LoRaWANServiceProfileProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANServiceProfileProperty(`value`))

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotwireless.CfnServiceProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     * @param loRaWan LoRaWAN service profile object. 
     */
    public fun loRaWan(loRaWan: IResolvable)

    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     * @param loRaWan LoRaWAN service profile object. 
     */
    public fun loRaWan(loRaWan: LoRaWANServiceProfileProperty)

    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     * @param loRaWan LoRaWAN service profile object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982f9e5497357dc9cc9cb2cf985bb6a1f014c6ac8fb5fe941b4bc0ee586ce8f")
    public fun loRaWan(loRaWan: LoRaWANServiceProfileProperty.Builder.() -> Unit)

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-name)
     * @param name The name of the new resource. 
     */
    public fun name(name: String)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnServiceProfile.Builder =
        software.amazon.awscdk.services.iotwireless.CfnServiceProfile.Builder.create(scope, id)

    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     * @param loRaWan LoRaWAN service profile object. 
     */
    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     * @param loRaWan LoRaWAN service profile object. 
     */
    override fun loRaWan(loRaWan: LoRaWANServiceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANServiceProfileProperty::unwrap))
    }

    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     * @param loRaWan LoRaWAN service profile object. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982f9e5497357dc9cc9cb2cf985bb6a1f014c6ac8fb5fe941b4bc0ee586ce8f")
    override fun loRaWan(loRaWan: LoRaWANServiceProfileProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANServiceProfileProperty(loRaWan))

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-name)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnServiceProfile =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfile):
        CfnServiceProfile = CfnServiceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProfile):
        software.amazon.awscdk.services.iotwireless.CfnServiceProfile = wrapped.cdkObject
  }

  public interface LoRaWANServiceProfileProperty {
    /**
     * The AddGWMetaData value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-addgwmetadata)
     */
    public fun addGwMetadata(): Any? = unwrap(this).getAddGwMetadata()

    /**
     * The ChannelMask value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-channelmask)
     */
    public fun channelMask(): String? = unwrap(this).getChannelMask()

    /**
     * The DevStatusReqFreq value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-devstatusreqfreq)
     */
    public fun devStatusReqFreq(): Number? = unwrap(this).getDevStatusReqFreq()

    /**
     * The DLBucketSize value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-dlbucketsize)
     */
    public fun dlBucketSize(): Number? = unwrap(this).getDlBucketSize()

    /**
     * The DLRate value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-dlrate)
     */
    public fun dlRate(): Number? = unwrap(this).getDlRate()

    /**
     * The DLRatePolicy value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-dlratepolicy)
     */
    public fun dlRatePolicy(): String? = unwrap(this).getDlRatePolicy()

    /**
     * The DRMax value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-drmax)
     */
    public fun drMax(): Number? = unwrap(this).getDrMax()

    /**
     * The DRMin value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-drmin)
     */
    public fun drMin(): Number? = unwrap(this).getDrMin()

    /**
     * The HRAllowed value that describes whether handover roaming is allowed.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-hrallowed)
     */
    public fun hrAllowed(): Any? = unwrap(this).getHrAllowed()

    /**
     * The MinGwDiversity value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-mingwdiversity)
     */
    public fun minGwDiversity(): Number? = unwrap(this).getMinGwDiversity()

    /**
     * The NwkGeoLoc value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-nwkgeoloc)
     */
    public fun nwkGeoLoc(): Any? = unwrap(this).getNwkGeoLoc()

    /**
     * The PRAllowed value that describes whether passive roaming is allowed.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-prallowed)
     */
    public fun prAllowed(): Any? = unwrap(this).getPrAllowed()

    /**
     * The RAAllowed value that describes whether roaming activation is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-raallowed)
     */
    public fun raAllowed(): Any? = unwrap(this).getRaAllowed()

    /**
     * The ReportDevStatusBattery value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-reportdevstatusbattery)
     */
    public fun reportDevStatusBattery(): Any? = unwrap(this).getReportDevStatusBattery()

    /**
     * The ReportDevStatusMargin value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-reportdevstatusmargin)
     */
    public fun reportDevStatusMargin(): Any? = unwrap(this).getReportDevStatusMargin()

    /**
     * The TargetPer value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-targetper)
     */
    public fun targetPer(): Number? = unwrap(this).getTargetPer()

    /**
     * The UlBucketSize value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-ulbucketsize)
     */
    public fun ulBucketSize(): Number? = unwrap(this).getUlBucketSize()

    /**
     * The ULRate value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-ulrate)
     */
    public fun ulRate(): Number? = unwrap(this).getUlRate()

    /**
     * The ULRatePolicy value.
     *
     * This property is `ReadOnly` and can't be inputted for create. It's returned with `Fn::GetAtt`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-ulratepolicy)
     */
    public fun ulRatePolicy(): String? = unwrap(this).getUlRatePolicy()

    /**
     * A builder for [LoRaWANServiceProfileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addGwMetadata The AddGWMetaData value.
       */
      public fun addGwMetadata(addGwMetadata: Boolean)

      /**
       * @param addGwMetadata The AddGWMetaData value.
       */
      public fun addGwMetadata(addGwMetadata: IResolvable)

      /**
       * @param channelMask The ChannelMask value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun channelMask(channelMask: String)

      /**
       * @param devStatusReqFreq The DevStatusReqFreq value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun devStatusReqFreq(devStatusReqFreq: Number)

      /**
       * @param dlBucketSize The DLBucketSize value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun dlBucketSize(dlBucketSize: Number)

      /**
       * @param dlRate The DLRate value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun dlRate(dlRate: Number)

      /**
       * @param dlRatePolicy The DLRatePolicy value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun dlRatePolicy(dlRatePolicy: String)

      /**
       * @param drMax The DRMax value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun drMax(drMax: Number)

      /**
       * @param drMin The DRMin value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun drMin(drMin: Number)

      /**
       * @param hrAllowed The HRAllowed value that describes whether handover roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun hrAllowed(hrAllowed: Boolean)

      /**
       * @param hrAllowed The HRAllowed value that describes whether handover roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun hrAllowed(hrAllowed: IResolvable)

      /**
       * @param minGwDiversity The MinGwDiversity value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun minGwDiversity(minGwDiversity: Number)

      /**
       * @param nwkGeoLoc The NwkGeoLoc value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun nwkGeoLoc(nwkGeoLoc: Boolean)

      /**
       * @param nwkGeoLoc The NwkGeoLoc value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun nwkGeoLoc(nwkGeoLoc: IResolvable)

      /**
       * @param prAllowed The PRAllowed value that describes whether passive roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun prAllowed(prAllowed: Boolean)

      /**
       * @param prAllowed The PRAllowed value that describes whether passive roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun prAllowed(prAllowed: IResolvable)

      /**
       * @param raAllowed The RAAllowed value that describes whether roaming activation is allowed.
       */
      public fun raAllowed(raAllowed: Boolean)

      /**
       * @param raAllowed The RAAllowed value that describes whether roaming activation is allowed.
       */
      public fun raAllowed(raAllowed: IResolvable)

      /**
       * @param reportDevStatusBattery The ReportDevStatusBattery value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun reportDevStatusBattery(reportDevStatusBattery: Boolean)

      /**
       * @param reportDevStatusBattery The ReportDevStatusBattery value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun reportDevStatusBattery(reportDevStatusBattery: IResolvable)

      /**
       * @param reportDevStatusMargin The ReportDevStatusMargin value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun reportDevStatusMargin(reportDevStatusMargin: Boolean)

      /**
       * @param reportDevStatusMargin The ReportDevStatusMargin value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun reportDevStatusMargin(reportDevStatusMargin: IResolvable)

      /**
       * @param targetPer The TargetPer value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun targetPer(targetPer: Number)

      /**
       * @param ulBucketSize The UlBucketSize value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun ulBucketSize(ulBucketSize: Number)

      /**
       * @param ulRate The ULRate value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun ulRate(ulRate: Number)

      /**
       * @param ulRatePolicy The ULRatePolicy value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      public fun ulRatePolicy(ulRatePolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty.builder()

      /**
       * @param addGwMetadata The AddGWMetaData value.
       */
      override fun addGwMetadata(addGwMetadata: Boolean) {
        cdkBuilder.addGwMetadata(addGwMetadata)
      }

      /**
       * @param addGwMetadata The AddGWMetaData value.
       */
      override fun addGwMetadata(addGwMetadata: IResolvable) {
        cdkBuilder.addGwMetadata(addGwMetadata.let(IResolvable::unwrap))
      }

      /**
       * @param channelMask The ChannelMask value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun channelMask(channelMask: String) {
        cdkBuilder.channelMask(channelMask)
      }

      /**
       * @param devStatusReqFreq The DevStatusReqFreq value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun devStatusReqFreq(devStatusReqFreq: Number) {
        cdkBuilder.devStatusReqFreq(devStatusReqFreq)
      }

      /**
       * @param dlBucketSize The DLBucketSize value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun dlBucketSize(dlBucketSize: Number) {
        cdkBuilder.dlBucketSize(dlBucketSize)
      }

      /**
       * @param dlRate The DLRate value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun dlRate(dlRate: Number) {
        cdkBuilder.dlRate(dlRate)
      }

      /**
       * @param dlRatePolicy The DLRatePolicy value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun dlRatePolicy(dlRatePolicy: String) {
        cdkBuilder.dlRatePolicy(dlRatePolicy)
      }

      /**
       * @param drMax The DRMax value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun drMax(drMax: Number) {
        cdkBuilder.drMax(drMax)
      }

      /**
       * @param drMin The DRMin value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun drMin(drMin: Number) {
        cdkBuilder.drMin(drMin)
      }

      /**
       * @param hrAllowed The HRAllowed value that describes whether handover roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun hrAllowed(hrAllowed: Boolean) {
        cdkBuilder.hrAllowed(hrAllowed)
      }

      /**
       * @param hrAllowed The HRAllowed value that describes whether handover roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun hrAllowed(hrAllowed: IResolvable) {
        cdkBuilder.hrAllowed(hrAllowed.let(IResolvable::unwrap))
      }

      /**
       * @param minGwDiversity The MinGwDiversity value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun minGwDiversity(minGwDiversity: Number) {
        cdkBuilder.minGwDiversity(minGwDiversity)
      }

      /**
       * @param nwkGeoLoc The NwkGeoLoc value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun nwkGeoLoc(nwkGeoLoc: Boolean) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc)
      }

      /**
       * @param nwkGeoLoc The NwkGeoLoc value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun nwkGeoLoc(nwkGeoLoc: IResolvable) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc.let(IResolvable::unwrap))
      }

      /**
       * @param prAllowed The PRAllowed value that describes whether passive roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun prAllowed(prAllowed: Boolean) {
        cdkBuilder.prAllowed(prAllowed)
      }

      /**
       * @param prAllowed The PRAllowed value that describes whether passive roaming is allowed.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun prAllowed(prAllowed: IResolvable) {
        cdkBuilder.prAllowed(prAllowed.let(IResolvable::unwrap))
      }

      /**
       * @param raAllowed The RAAllowed value that describes whether roaming activation is allowed.
       */
      override fun raAllowed(raAllowed: Boolean) {
        cdkBuilder.raAllowed(raAllowed)
      }

      /**
       * @param raAllowed The RAAllowed value that describes whether roaming activation is allowed.
       */
      override fun raAllowed(raAllowed: IResolvable) {
        cdkBuilder.raAllowed(raAllowed.let(IResolvable::unwrap))
      }

      /**
       * @param reportDevStatusBattery The ReportDevStatusBattery value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun reportDevStatusBattery(reportDevStatusBattery: Boolean) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery)
      }

      /**
       * @param reportDevStatusBattery The ReportDevStatusBattery value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun reportDevStatusBattery(reportDevStatusBattery: IResolvable) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery.let(IResolvable::unwrap))
      }

      /**
       * @param reportDevStatusMargin The ReportDevStatusMargin value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun reportDevStatusMargin(reportDevStatusMargin: Boolean) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin)
      }

      /**
       * @param reportDevStatusMargin The ReportDevStatusMargin value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun reportDevStatusMargin(reportDevStatusMargin: IResolvable) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin.let(IResolvable::unwrap))
      }

      /**
       * @param targetPer The TargetPer value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun targetPer(targetPer: Number) {
        cdkBuilder.targetPer(targetPer)
      }

      /**
       * @param ulBucketSize The UlBucketSize value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun ulBucketSize(ulBucketSize: Number) {
        cdkBuilder.ulBucketSize(ulBucketSize)
      }

      /**
       * @param ulRate The ULRate value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun ulRate(ulRate: Number) {
        cdkBuilder.ulRate(ulRate)
      }

      /**
       * @param ulRatePolicy The ULRatePolicy value.
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       */
      override fun ulRatePolicy(ulRatePolicy: String) {
        cdkBuilder.ulRatePolicy(ulRatePolicy)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty,
    ) : CdkObject(cdkObject), LoRaWANServiceProfileProperty {
      /**
       * The AddGWMetaData value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-addgwmetadata)
       */
      override fun addGwMetadata(): Any? = unwrap(this).getAddGwMetadata()

      /**
       * The ChannelMask value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-channelmask)
       */
      override fun channelMask(): String? = unwrap(this).getChannelMask()

      /**
       * The DevStatusReqFreq value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-devstatusreqfreq)
       */
      override fun devStatusReqFreq(): Number? = unwrap(this).getDevStatusReqFreq()

      /**
       * The DLBucketSize value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-dlbucketsize)
       */
      override fun dlBucketSize(): Number? = unwrap(this).getDlBucketSize()

      /**
       * The DLRate value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-dlrate)
       */
      override fun dlRate(): Number? = unwrap(this).getDlRate()

      /**
       * The DLRatePolicy value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-dlratepolicy)
       */
      override fun dlRatePolicy(): String? = unwrap(this).getDlRatePolicy()

      /**
       * The DRMax value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-drmax)
       */
      override fun drMax(): Number? = unwrap(this).getDrMax()

      /**
       * The DRMin value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-drmin)
       */
      override fun drMin(): Number? = unwrap(this).getDrMin()

      /**
       * The HRAllowed value that describes whether handover roaming is allowed.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-hrallowed)
       */
      override fun hrAllowed(): Any? = unwrap(this).getHrAllowed()

      /**
       * The MinGwDiversity value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-mingwdiversity)
       */
      override fun minGwDiversity(): Number? = unwrap(this).getMinGwDiversity()

      /**
       * The NwkGeoLoc value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-nwkgeoloc)
       */
      override fun nwkGeoLoc(): Any? = unwrap(this).getNwkGeoLoc()

      /**
       * The PRAllowed value that describes whether passive roaming is allowed.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-prallowed)
       */
      override fun prAllowed(): Any? = unwrap(this).getPrAllowed()

      /**
       * The RAAllowed value that describes whether roaming activation is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-raallowed)
       */
      override fun raAllowed(): Any? = unwrap(this).getRaAllowed()

      /**
       * The ReportDevStatusBattery value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-reportdevstatusbattery)
       */
      override fun reportDevStatusBattery(): Any? = unwrap(this).getReportDevStatusBattery()

      /**
       * The ReportDevStatusMargin value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-reportdevstatusmargin)
       */
      override fun reportDevStatusMargin(): Any? = unwrap(this).getReportDevStatusMargin()

      /**
       * The TargetPer value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-targetper)
       */
      override fun targetPer(): Number? = unwrap(this).getTargetPer()

      /**
       * The UlBucketSize value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-ulbucketsize)
       */
      override fun ulBucketSize(): Number? = unwrap(this).getUlBucketSize()

      /**
       * The ULRate value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-ulrate)
       */
      override fun ulRate(): Number? = unwrap(this).getUlRate()

      /**
       * The ULRatePolicy value.
       *
       * This property is `ReadOnly` and can't be inputted for create. It's returned with
       * `Fn::GetAtt`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-serviceprofile-lorawanserviceprofile.html#cfn-iotwireless-serviceprofile-lorawanserviceprofile-ulratepolicy)
       */
      override fun ulRatePolicy(): String? = unwrap(this).getUlRatePolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANServiceProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty):
          LoRaWANServiceProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANServiceProfileProperty):
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty
    }
  }
}
