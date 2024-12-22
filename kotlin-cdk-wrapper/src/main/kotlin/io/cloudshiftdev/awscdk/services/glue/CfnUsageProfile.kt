@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an AWS Glue usage profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnUsageProfile cfnUsageProfile = CfnUsageProfile.Builder.create(this, "MyCfnUsageProfile")
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
public open class CfnUsageProfile(
  cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfile,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUsageProfileProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnUsageProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUsageProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUsageProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUsageProfileProps(props)
  )

  /**
   * The date and time when the usage profile was created.
   */
  public open fun attrCreatedOn(): String = unwrap(this).getAttrCreatedOn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   *
   */
  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   *
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun configuration(`value`: ProfileConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(ProfileConfigurationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f554aa442b81ced50df7152b1117e596ef92beca366f6a3b832f286b64aa4079")
  public open fun configuration(`value`: ProfileConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(ProfileConfigurationProperty(`value`))

  /**
   * A description of the usage profile.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the usage profile.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the usage profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the usage profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags to be applied to this UsageProfiles.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to be applied to this UsageProfiles.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to be applied to this UsageProfiles.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnUsageProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
     * @param configuration 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
     * @param configuration 
     */
    public fun configuration(configuration: ProfileConfigurationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
     * @param configuration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2835f3410220b8caeb4407f42a9959781674a48d4fb05bcd6d6c58bcaa8b1bad")
    public fun configuration(configuration: ProfileConfigurationProperty.Builder.() -> Unit)

    /**
     * A description of the usage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-description)
     * @param description A description of the usage profile. 
     */
    public fun description(description: String)

    /**
     * The name of the usage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-name)
     * @param name The name of the usage profile. 
     */
    public fun name(name: String)

    /**
     * The tags to be applied to this UsageProfiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-tags)
     * @param tags The tags to be applied to this UsageProfiles. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to be applied to this UsageProfiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-tags)
     * @param tags The tags to be applied to this UsageProfiles. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnUsageProfile.Builder =
        software.amazon.awscdk.services.glue.CfnUsageProfile.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
     * @param configuration 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
     * @param configuration 
     */
    override fun configuration(configuration: ProfileConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(ProfileConfigurationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-configuration)
     * @param configuration 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2835f3410220b8caeb4407f42a9959781674a48d4fb05bcd6d6c58bcaa8b1bad")
    override fun configuration(configuration: ProfileConfigurationProperty.Builder.() -> Unit): Unit
        = configuration(ProfileConfigurationProperty(configuration))

    /**
     * A description of the usage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-description)
     * @param description A description of the usage profile. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the usage profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-name)
     * @param name The name of the usage profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags to be applied to this UsageProfiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-tags)
     * @param tags The tags to be applied to this UsageProfiles. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to be applied to this UsageProfiles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-usageprofile.html#cfn-glue-usageprofile-tags)
     * @param tags The tags to be applied to this UsageProfiles. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.glue.CfnUsageProfile = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnUsageProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUsageProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUsageProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfile):
        CfnUsageProfile = CfnUsageProfile(cdkObject)

    internal fun unwrap(wrapped: CfnUsageProfile):
        software.amazon.awscdk.services.glue.CfnUsageProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.glue.CfnUsageProfile
  }

  /**
   * Specifies the values that an admin sets for each job or session parameter configured in a AWS
   * Glue usage profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * ConfigurationObjectProperty configurationObjectProperty = ConfigurationObjectProperty.builder()
   * .allowedValues(List.of("allowedValues"))
   * .defaultValue("defaultValue")
   * .maxValue("maxValue")
   * .minValue("minValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html)
   */
  public interface ConfigurationObjectProperty {
    /**
     * A list of allowed values for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-allowedvalues)
     */
    public fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

    /**
     * A default value for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-defaultvalue)
     */
    public fun defaultValue(): String? = unwrap(this).getDefaultValue()

    /**
     * A maximum allowed value for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-maxvalue)
     */
    public fun maxValue(): String? = unwrap(this).getMaxValue()

    /**
     * A minimum allowed value for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-minvalue)
     */
    public fun minValue(): String? = unwrap(this).getMinValue()

    /**
     * A builder for [ConfigurationObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedValues A list of allowed values for the parameter.
       */
      public fun allowedValues(allowedValues: List<String>)

      /**
       * @param allowedValues A list of allowed values for the parameter.
       */
      public fun allowedValues(vararg allowedValues: String)

      /**
       * @param defaultValue A default value for the parameter.
       */
      public fun defaultValue(defaultValue: String)

      /**
       * @param maxValue A maximum allowed value for the parameter.
       */
      public fun maxValue(maxValue: String)

      /**
       * @param minValue A minimum allowed value for the parameter.
       */
      public fun minValue(minValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnUsageProfile.ConfigurationObjectProperty.Builder =
          software.amazon.awscdk.services.glue.CfnUsageProfile.ConfigurationObjectProperty.builder()

      /**
       * @param allowedValues A list of allowed values for the parameter.
       */
      override fun allowedValues(allowedValues: List<String>) {
        cdkBuilder.allowedValues(allowedValues)
      }

      /**
       * @param allowedValues A list of allowed values for the parameter.
       */
      override fun allowedValues(vararg allowedValues: String): Unit =
          allowedValues(allowedValues.toList())

      /**
       * @param defaultValue A default value for the parameter.
       */
      override fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param maxValue A maximum allowed value for the parameter.
       */
      override fun maxValue(maxValue: String) {
        cdkBuilder.maxValue(maxValue)
      }

      /**
       * @param minValue A minimum allowed value for the parameter.
       */
      override fun minValue(minValue: String) {
        cdkBuilder.minValue(minValue)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnUsageProfile.ConfigurationObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfile.ConfigurationObjectProperty,
    ) : CdkObject(cdkObject),
        ConfigurationObjectProperty {
      /**
       * A list of allowed values for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-allowedvalues)
       */
      override fun allowedValues(): List<String> = unwrap(this).getAllowedValues() ?: emptyList()

      /**
       * A default value for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-defaultvalue)
       */
      override fun defaultValue(): String? = unwrap(this).getDefaultValue()

      /**
       * A maximum allowed value for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-maxvalue)
       */
      override fun maxValue(): String? = unwrap(this).getMaxValue()

      /**
       * A minimum allowed value for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-configurationobject.html#cfn-glue-usageprofile-configurationobject-minvalue)
       */
      override fun minValue(): String? = unwrap(this).getMinValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfile.ConfigurationObjectProperty):
          ConfigurationObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfigurationObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationObjectProperty):
          software.amazon.awscdk.services.glue.CfnUsageProfile.ConfigurationObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnUsageProfile.ConfigurationObjectProperty
    }
  }

  /**
   * Specifies the job and session values that an admin configures in an AWS Glue usage profile.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * ProfileConfigurationProperty profileConfigurationProperty =
   * ProfileConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-profileconfiguration.html)
   */
  public interface ProfileConfigurationProperty {
    /**
     * A key-value map of configuration parameters for AWS Glue jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-profileconfiguration.html#cfn-glue-usageprofile-profileconfiguration-jobconfiguration)
     */
    public fun jobConfiguration(): Any? = unwrap(this).getJobConfiguration()

    /**
     * A key-value map of configuration parameters for AWS Glue sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-profileconfiguration.html#cfn-glue-usageprofile-profileconfiguration-sessionconfiguration)
     */
    public fun sessionConfiguration(): Any? = unwrap(this).getSessionConfiguration()

    /**
     * A builder for [ProfileConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jobConfiguration A key-value map of configuration parameters for AWS Glue jobs.
       */
      public fun jobConfiguration(jobConfiguration: IResolvable)

      /**
       * @param jobConfiguration A key-value map of configuration parameters for AWS Glue jobs.
       */
      public fun jobConfiguration(jobConfiguration: Map<String, Any>)

      /**
       * @param sessionConfiguration A key-value map of configuration parameters for AWS Glue
       * sessions.
       */
      public fun sessionConfiguration(sessionConfiguration: IResolvable)

      /**
       * @param sessionConfiguration A key-value map of configuration parameters for AWS Glue
       * sessions.
       */
      public fun sessionConfiguration(sessionConfiguration: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnUsageProfile.ProfileConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnUsageProfile.ProfileConfigurationProperty.builder()

      /**
       * @param jobConfiguration A key-value map of configuration parameters for AWS Glue jobs.
       */
      override fun jobConfiguration(jobConfiguration: IResolvable) {
        cdkBuilder.jobConfiguration(jobConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jobConfiguration A key-value map of configuration parameters for AWS Glue jobs.
       */
      override fun jobConfiguration(jobConfiguration: Map<String, Any>) {
        cdkBuilder.jobConfiguration(jobConfiguration.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      /**
       * @param sessionConfiguration A key-value map of configuration parameters for AWS Glue
       * sessions.
       */
      override fun sessionConfiguration(sessionConfiguration: IResolvable) {
        cdkBuilder.sessionConfiguration(sessionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sessionConfiguration A key-value map of configuration parameters for AWS Glue
       * sessions.
       */
      override fun sessionConfiguration(sessionConfiguration: Map<String, Any>) {
        cdkBuilder.sessionConfiguration(sessionConfiguration.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnUsageProfile.ProfileConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfile.ProfileConfigurationProperty,
    ) : CdkObject(cdkObject),
        ProfileConfigurationProperty {
      /**
       * A key-value map of configuration parameters for AWS Glue jobs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-profileconfiguration.html#cfn-glue-usageprofile-profileconfiguration-jobconfiguration)
       */
      override fun jobConfiguration(): Any? = unwrap(this).getJobConfiguration()

      /**
       * A key-value map of configuration parameters for AWS Glue sessions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-usageprofile-profileconfiguration.html#cfn-glue-usageprofile-profileconfiguration-sessionconfiguration)
       */
      override fun sessionConfiguration(): Any? = unwrap(this).getSessionConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProfileConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnUsageProfile.ProfileConfigurationProperty):
          ProfileConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProfileConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProfileConfigurationProperty):
          software.amazon.awscdk.services.glue.CfnUsageProfile.ProfileConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnUsageProfile.ProfileConfigurationProperty
    }
  }
}
