@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The multiplex object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnMultiplex cfnMultiplex = CfnMultiplex.Builder.create(this, "MyCfnMultiplex")
 * .availabilityZones(List.of("availabilityZones"))
 * .multiplexSettings(MultiplexSettingsProperty.builder()
 * .transportStreamBitrate(123)
 * .transportStreamId(123)
 * // the properties below are optional
 * .maximumVideoBufferDelayMilliseconds(123)
 * .transportStreamReservedBitrate(123)
 * .build())
 * .name("name")
 * // the properties below are optional
 * .destinations(List.of(MultiplexOutputDestinationProperty.builder()
 * .multiplexMediaConnectOutputDestinationSettings(MultiplexMediaConnectOutputDestinationSettingsProperty.builder()
 * .entitlementArn("entitlementArn")
 * .build())
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html)
 */
public open class CfnMultiplex internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The unique arn of the multiplex.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique id of the multiplex.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The number of currently healthy pipelines.
   */
  public open fun attrPipelinesRunningCount(): Number = unwrap(this).getAttrPipelinesRunningCount()

  /**
   * The number of programs in the multiplex.
   */
  public open fun attrProgramCount(): Number = unwrap(this).getAttrProgramCount()

  /**
   * The current state of the multiplex.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * A list of availability zones for the multiplex.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

  /**
   * A list of availability zones for the multiplex.
   */
  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  /**
   * A list of availability zones for the multiplex.
   */
  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A list of the multiplex output destinations.
   */
  public open fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * A list of the multiplex output destinations.
   */
  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of the multiplex output destinations.
   */
  public open fun destinations(`value`: List<Any>) {
    unwrap(this).setDestinations(`value`)
  }

  /**
   * A list of the multiplex output destinations.
   */
  public open fun destinations(vararg `value`: Any): Unit = destinations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Configuration for a multiplex event.
   */
  public open fun multiplexSettings(): Any = unwrap(this).getMultiplexSettings()

  /**
   * Configuration for a multiplex event.
   */
  public open fun multiplexSettings(`value`: IResolvable) {
    unwrap(this).setMultiplexSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration for a multiplex event.
   */
  public open fun multiplexSettings(`value`: MultiplexSettingsProperty) {
    unwrap(this).setMultiplexSettings(`value`.let(MultiplexSettingsProperty::unwrap))
  }

  /**
   * Configuration for a multiplex event.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d77642a3d1aff7c1c2b69132c9bec5fe92ded4de3ec1940e2e187944f6361c1d")
  public open fun multiplexSettings(`value`: MultiplexSettingsProperty.Builder.() -> Unit): Unit =
      multiplexSettings(MultiplexSettingsProperty(`value`))

  /**
   * The name of the multiplex.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the multiplex.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnMultiplex].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of availability zones for the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * A list of availability zones for the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     * @param destinations A list of the multiplex output destinations. 
     */
    public fun destinations(destinations: IResolvable)

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     * @param destinations A list of the multiplex output destinations. 
     */
    public fun destinations(destinations: List<Any>)

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     * @param destinations A list of the multiplex output destinations. 
     */
    public fun destinations(vararg destinations: Any)

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    public fun multiplexSettings(multiplexSettings: IResolvable)

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    public fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty)

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f48a3161dab0e0572a7a8b048700145d2d36e6dc63d0a03419f9b9db2492680c")
    public fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty.Builder.() -> Unit)

    /**
     * The name of the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-name)
     * @param name The name of the multiplex. 
     */
    public fun name(name: String)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnMultiplex.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplex.Builder.create(scope, id)

    /**
     * A list of availability zones for the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * A list of availability zones for the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     * @param destinations A list of the multiplex output destinations. 
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     * @param destinations A list of the multiplex output destinations. 
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     * @param destinations A list of the multiplex output destinations. 
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    override fun multiplexSettings(multiplexSettings: IResolvable) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(IResolvable::unwrap))
    }

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    override fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(MultiplexSettingsProperty::unwrap))
    }

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f48a3161dab0e0572a7a8b048700145d2d36e6dc63d0a03419f9b9db2492680c")
    override fun multiplexSettings(multiplexSettings: MultiplexSettingsProperty.Builder.() -> Unit):
        Unit = multiplexSettings(MultiplexSettingsProperty(multiplexSettings))

    /**
     * The name of the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-name)
     * @param name The name of the multiplex. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplex = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnMultiplex.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiplex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiplex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex):
        CfnMultiplex = CfnMultiplex(cdkObject)

    internal fun unwrap(wrapped: CfnMultiplex):
        software.amazon.awscdk.services.medialive.CfnMultiplex = wrapped.cdkObject
  }

  /**
   * Multiplex MediaConnect output destination settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MultiplexMediaConnectOutputDestinationSettingsProperty
   * multiplexMediaConnectOutputDestinationSettingsProperty =
   * MultiplexMediaConnectOutputDestinationSettingsProperty.builder()
   * .entitlementArn("entitlementArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexmediaconnectoutputdestinationsettings.html)
   */
  public interface MultiplexMediaConnectOutputDestinationSettingsProperty {
    /**
     * The MediaConnect entitlement ARN available as a Flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexmediaconnectoutputdestinationsettings.html#cfn-medialive-multiplex-multiplexmediaconnectoutputdestinationsettings-entitlementarn)
     */
    public fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

    /**
     * A builder for [MultiplexMediaConnectOutputDestinationSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entitlementArn The MediaConnect entitlement ARN available as a Flow source.
       */
      public fun entitlementArn(entitlementArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty.builder()

      /**
       * @param entitlementArn The MediaConnect entitlement ARN available as a Flow source.
       */
      override fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexMediaConnectOutputDestinationSettingsProperty {
      /**
       * The MediaConnect entitlement ARN available as a Flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexmediaconnectoutputdestinationsettings.html#cfn-medialive-multiplex-multiplexmediaconnectoutputdestinationsettings-entitlementarn)
       */
      override fun entitlementArn(): String? = unwrap(this).getEntitlementArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexMediaConnectOutputDestinationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty):
          MultiplexMediaConnectOutputDestinationSettingsProperty = CdkObjectWrappers.wrap(cdkObject)
          as MultiplexMediaConnectOutputDestinationSettingsProperty

      internal fun unwrap(wrapped: MultiplexMediaConnectOutputDestinationSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexMediaConnectOutputDestinationSettingsProperty
    }
  }

  /**
   * Contains configuration for a Multiplex event.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MultiplexSettingsProperty multiplexSettingsProperty = MultiplexSettingsProperty.builder()
   * .transportStreamBitrate(123)
   * .transportStreamId(123)
   * // the properties below are optional
   * .maximumVideoBufferDelayMilliseconds(123)
   * .transportStreamReservedBitrate(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html)
   */
  public interface MultiplexSettingsProperty {
    /**
     * Maximum video buffer delay in milliseconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-maximumvideobufferdelaymilliseconds)
     */
    public fun maximumVideoBufferDelayMilliseconds(): Number? =
        unwrap(this).getMaximumVideoBufferDelayMilliseconds()

    /**
     * Transport stream bit rate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-transportstreambitrate)
     */
    public fun transportStreamBitrate(): Number

    /**
     * Transport stream ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-transportstreamid)
     */
    public fun transportStreamId(): Number

    /**
     * Transport stream reserved bit rate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-transportstreamreservedbitrate)
     */
    public fun transportStreamReservedBitrate(): Number? =
        unwrap(this).getTransportStreamReservedBitrate()

    /**
     * A builder for [MultiplexSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumVideoBufferDelayMilliseconds Maximum video buffer delay in milliseconds.
       */
      public fun maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds: Number)

      /**
       * @param transportStreamBitrate Transport stream bit rate. 
       */
      public fun transportStreamBitrate(transportStreamBitrate: Number)

      /**
       * @param transportStreamId Transport stream ID. 
       */
      public fun transportStreamId(transportStreamId: Number)

      /**
       * @param transportStreamReservedBitrate Transport stream reserved bit rate.
       */
      public fun transportStreamReservedBitrate(transportStreamReservedBitrate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty.builder()

      /**
       * @param maximumVideoBufferDelayMilliseconds Maximum video buffer delay in milliseconds.
       */
      override
          fun maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds: Number) {
        cdkBuilder.maximumVideoBufferDelayMilliseconds(maximumVideoBufferDelayMilliseconds)
      }

      /**
       * @param transportStreamBitrate Transport stream bit rate. 
       */
      override fun transportStreamBitrate(transportStreamBitrate: Number) {
        cdkBuilder.transportStreamBitrate(transportStreamBitrate)
      }

      /**
       * @param transportStreamId Transport stream ID. 
       */
      override fun transportStreamId(transportStreamId: Number) {
        cdkBuilder.transportStreamId(transportStreamId)
      }

      /**
       * @param transportStreamReservedBitrate Transport stream reserved bit rate.
       */
      override fun transportStreamReservedBitrate(transportStreamReservedBitrate: Number) {
        cdkBuilder.transportStreamReservedBitrate(transportStreamReservedBitrate)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexSettingsProperty {
      /**
       * Maximum video buffer delay in milliseconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-maximumvideobufferdelaymilliseconds)
       */
      override fun maximumVideoBufferDelayMilliseconds(): Number? =
          unwrap(this).getMaximumVideoBufferDelayMilliseconds()

      /**
       * Transport stream bit rate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-transportstreambitrate)
       */
      override fun transportStreamBitrate(): Number = unwrap(this).getTransportStreamBitrate()

      /**
       * Transport stream ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-transportstreamid)
       */
      override fun transportStreamId(): Number = unwrap(this).getTransportStreamId()

      /**
       * Transport stream reserved bit rate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexsettings.html#cfn-medialive-multiplex-multiplexsettings-transportstreamreservedbitrate)
       */
      override fun transportStreamReservedBitrate(): Number? =
          unwrap(this).getTransportStreamReservedBitrate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty):
          MultiplexSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as MultiplexSettingsProperty

      internal fun unwrap(wrapped: MultiplexSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexSettingsProperty
    }
  }

  /**
   * Multiplex output destination settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MultiplexOutputDestinationProperty multiplexOutputDestinationProperty =
   * MultiplexOutputDestinationProperty.builder()
   * .multiplexMediaConnectOutputDestinationSettings(MultiplexMediaConnectOutputDestinationSettingsProperty.builder()
   * .entitlementArn("entitlementArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexoutputdestination.html)
   */
  public interface MultiplexOutputDestinationProperty {
    /**
     * Multiplex MediaConnect output destination settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexoutputdestination.html#cfn-medialive-multiplex-multiplexoutputdestination-multiplexmediaconnectoutputdestinationsettings)
     */
    public fun multiplexMediaConnectOutputDestinationSettings(): Any? =
        unwrap(this).getMultiplexMediaConnectOutputDestinationSettings()

    /**
     * A builder for [MultiplexOutputDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
       * destination settings.
       */
      public
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: IResolvable)

      /**
       * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
       * destination settings.
       */
      public
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty)

      /**
       * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
       * destination settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2569c3f12cb772a27991b1621a83c9f430ff4d781d3da6fbd420a85060180260")
      public
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty.builder()

      /**
       * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
       * destination settings.
       */
      override
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: IResolvable) {
        cdkBuilder.multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings.let(IResolvable::unwrap))
      }

      /**
       * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
       * destination settings.
       */
      override
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty) {
        cdkBuilder.multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings.let(MultiplexMediaConnectOutputDestinationSettingsProperty::unwrap))
      }

      /**
       * @param multiplexMediaConnectOutputDestinationSettings Multiplex MediaConnect output
       * destination settings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2569c3f12cb772a27991b1621a83c9f430ff4d781d3da6fbd420a85060180260")
      override
          fun multiplexMediaConnectOutputDestinationSettings(multiplexMediaConnectOutputDestinationSettings: MultiplexMediaConnectOutputDestinationSettingsProperty.Builder.() -> Unit):
          Unit =
          multiplexMediaConnectOutputDestinationSettings(MultiplexMediaConnectOutputDestinationSettingsProperty(multiplexMediaConnectOutputDestinationSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty,
    ) : CdkObject(cdkObject), MultiplexOutputDestinationProperty {
      /**
       * Multiplex MediaConnect output destination settings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplex-multiplexoutputdestination.html#cfn-medialive-multiplex-multiplexoutputdestination-multiplexmediaconnectoutputdestinationsettings)
       */
      override fun multiplexMediaConnectOutputDestinationSettings(): Any? =
          unwrap(this).getMultiplexMediaConnectOutputDestinationSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexOutputDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty):
          MultiplexOutputDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as
          MultiplexOutputDestinationProperty

      internal fun unwrap(wrapped: MultiplexOutputDestinationProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplex.MultiplexOutputDestinationProperty
    }
  }
}
