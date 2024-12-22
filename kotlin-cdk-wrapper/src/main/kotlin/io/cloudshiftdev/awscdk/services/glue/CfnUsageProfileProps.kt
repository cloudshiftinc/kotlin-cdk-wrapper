@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUsageProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnUsageProfileProps cfnUsageProfileProps = CfnUsageProfileProps.builder()
 * .name("name")
 * // the properties below are optional
 * .configuration(ProfileConfigurationProperty.builder()
 * .jobConfiguration(Map.of(
 * "jobConfigurationKey", ConfigurationObjectProperty.builder()
 * .allowedValues(List.of("allowedValues"))
 * .defaultValue("defaultValue")
 * .maxValue("maxValue")
 * .minValue("minValue")
 * .build()))
 * .sessionConfiguration(Map.of(
 * "sessionConfigurationKey", ConfigurationObjectProperty.builder()
 * .allowedValues(List.of("allowedValues"))
 * .defaultValue("defaultValue")
 * .maxValue("maxValue")
 * .minValue("minValue")
 * .build()))
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html)
 */
public interface CfnUsageProfileProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * A description of the usage profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the usage profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-name)
   */
  public fun name(): String

  /**
   * The tags to be applied to this UsageProfiles.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnUsageProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuration the value to be set.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration the value to be set.
     */
    public fun configuration(configuration: CfnUsageProfile.ProfileConfigurationProperty)

    /**
     * @param configuration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7847ebcf4d2251e7eafff8de0f87381c020386a3eb4e38896ab44243bea0e0a2")
    public
        fun configuration(configuration: CfnUsageProfile.ProfileConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description of the usage profile.
     */
    public fun description(description: String)

    /**
     * @param name The name of the usage profile. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags to be applied to this UsageProfiles.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be applied to this UsageProfiles.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnUsageProfileProps.Builder =
        software.amazon.awscdk.services.glue.CfnUsageProfileProps.builder()

    /**
     * @param configuration the value to be set.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configuration the value to be set.
     */
    override fun configuration(configuration: CfnUsageProfile.ProfileConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnUsageProfile.ProfileConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param configuration the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7847ebcf4d2251e7eafff8de0f87381c020386a3eb4e38896ab44243bea0e0a2")
    override
        fun configuration(configuration: CfnUsageProfile.ProfileConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnUsageProfile.ProfileConfigurationProperty(configuration))

    /**
     * @param description A description of the usage profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the usage profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to be applied to this UsageProfiles.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to be applied to this UsageProfiles.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.glue.CfnUsageProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfileProps,
  ) : CdkObject(cdkObject),
      CfnUsageProfileProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * A description of the usage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the usage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags to be applied to this UsageProfiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUsageProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfileProps):
        CfnUsageProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUsageProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUsageProfileProps):
        software.amazon.awscdk.services.glue.CfnUsageProfileProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnUsageProfileProps
  }
}
