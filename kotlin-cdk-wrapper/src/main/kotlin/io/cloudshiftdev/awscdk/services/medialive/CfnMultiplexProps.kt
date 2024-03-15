@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMultiplex`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnMultiplexProps cfnMultiplexProps = CfnMultiplexProps.builder()
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
public interface CfnMultiplexProps {
  /**
   * A list of availability zones for the multiplex.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
   */
  public fun availabilityZones(): List<String>

  /**
   * A list of the multiplex output destinations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
   */
  public fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * Configuration for a multiplex event.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
   */
  public fun multiplexSettings(): Any

  /**
   * The name of the multiplex.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-name)
   */
  public fun name(): String

  /**
   * A collection of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMultiplexProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param destinations A list of the multiplex output destinations.
     */
    public fun destinations(destinations: IResolvable)

    /**
     * @param destinations A list of the multiplex output destinations.
     */
    public fun destinations(destinations: List<Any>)

    /**
     * @param destinations A list of the multiplex output destinations.
     */
    public fun destinations(vararg destinations: Any)

    /**
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    public fun multiplexSettings(multiplexSettings: IResolvable)

    /**
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    public fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty)

    /**
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ad23f995956dc7a5262c76ffaca7cfa3a03a3dee7e17e7697ed70942ba63fd")
    public
        fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty.Builder.() -> Unit)

    /**
     * @param name The name of the multiplex. 
     */
    public fun name(name: String)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnMultiplexProps.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplexProps.builder()

    /**
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones A list of availability zones for the multiplex. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param destinations A list of the multiplex output destinations.
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    /**
     * @param destinations A list of the multiplex output destinations.
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    /**
     * @param destinations A list of the multiplex output destinations.
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    override fun multiplexSettings(multiplexSettings: IResolvable) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(IResolvable::unwrap))
    }

    /**
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    override fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty) {
      cdkBuilder.multiplexSettings(multiplexSettings.let(CfnMultiplex.MultiplexSettingsProperty::unwrap))
    }

    /**
     * @param multiplexSettings Configuration for a multiplex event. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25ad23f995956dc7a5262c76ffaca7cfa3a03a3dee7e17e7697ed70942ba63fd")
    override
        fun multiplexSettings(multiplexSettings: CfnMultiplex.MultiplexSettingsProperty.Builder.() -> Unit):
        Unit = multiplexSettings(CfnMultiplex.MultiplexSettingsProperty(multiplexSettings))

    /**
     * @param name The name of the multiplex. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexProps,
  ) : CdkObject(cdkObject), CfnMultiplexProps {
    /**
     * A list of availability zones for the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-availabilityzones)
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    /**
     * A list of the multiplex output destinations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-destinations)
     */
    override fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * Configuration for a multiplex event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-multiplexsettings)
     */
    override fun multiplexSettings(): Any = unwrap(this).getMultiplexSettings()

    /**
     * The name of the multiplex.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-multiplex.html#cfn-medialive-multiplex-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMultiplexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexProps):
        CfnMultiplexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMultiplexProps):
        software.amazon.awscdk.services.medialive.CfnMultiplexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnMultiplexProps
  }
}
