@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appintegrations

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
 * Properties for defining a `CfnDataIntegration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appintegrations.*;
 * Object filters;
 * Object objectConfiguration;
 * CfnDataIntegrationProps cfnDataIntegrationProps = CfnDataIntegrationProps.builder()
 * .kmsKey("kmsKey")
 * .name("name")
 * .sourceUri("sourceUri")
 * // the properties below are optional
 * .description("description")
 * .fileConfiguration(FileConfigurationProperty.builder()
 * .folders(List.of("folders"))
 * // the properties below are optional
 * .filters(filters)
 * .build())
 * .objectConfiguration(objectConfiguration)
 * .scheduleConfig(ScheduleConfigProperty.builder()
 * .scheduleExpression("scheduleExpression")
 * // the properties below are optional
 * .firstExecutionFrom("firstExecutionFrom")
 * .object("object")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html)
 */
public interface CfnDataIntegrationProps {
  /**
   * A description of the DataIntegration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration for what files should be pulled from the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
   */
  public fun fileConfiguration(): Any? = unwrap(this).getFileConfiguration()

  /**
   * The KMS key for the DataIntegration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-kmskey)
   */
  public fun kmsKey(): String

  /**
   * The name of the DataIntegration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-name)
   */
  public fun name(): String

  /**
   * The configuration for what data should be pulled from the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-objectconfiguration)
   */
  public fun objectConfiguration(): Any? = unwrap(this).getObjectConfiguration()

  /**
   * The name of the data and how often it should be pulled from the source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
   */
  public fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

  /**
   * The URI of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-sourceuri)
   */
  public fun sourceUri(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDataIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the DataIntegration.
     */
    public fun description(description: String)

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    public fun fileConfiguration(fileConfiguration: IResolvable)

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    public fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty)

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4403c1068c1d47f5e843f2bc6b1f277d0d4e15175f0a2a24c70f4e75469d4e29")
    public
        fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty.Builder.() -> Unit)

    /**
     * @param kmsKey The KMS key for the DataIntegration. 
     */
    public fun kmsKey(kmsKey: String)

    /**
     * @param name The name of the DataIntegration. 
     */
    public fun name(name: String)

    /**
     * @param objectConfiguration The configuration for what data should be pulled from the source.
     */
    public fun objectConfiguration(objectConfiguration: Any)

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    public fun scheduleConfig(scheduleConfig: IResolvable)

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    public fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty)

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d365c235953f8290fdd74cd163ee38eeeb6cfdef8dc1e42f1b89575e68c24b17")
    public
        fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty.Builder.() -> Unit)

    /**
     * @param sourceUri The URI of the data source. 
     */
    public fun sourceUri(sourceUri: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps.Builder =
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps.builder()

    /**
     * @param description A description of the DataIntegration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    override fun fileConfiguration(fileConfiguration: IResolvable) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    override
        fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty) {
      cdkBuilder.fileConfiguration(fileConfiguration.let(CfnDataIntegration.FileConfigurationProperty::unwrap))
    }

    /**
     * @param fileConfiguration The configuration for what files should be pulled from the source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4403c1068c1d47f5e843f2bc6b1f277d0d4e15175f0a2a24c70f4e75469d4e29")
    override
        fun fileConfiguration(fileConfiguration: CfnDataIntegration.FileConfigurationProperty.Builder.() -> Unit):
        Unit = fileConfiguration(CfnDataIntegration.FileConfigurationProperty(fileConfiguration))

    /**
     * @param kmsKey The KMS key for the DataIntegration. 
     */
    override fun kmsKey(kmsKey: String) {
      cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * @param name The name of the DataIntegration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param objectConfiguration The configuration for what data should be pulled from the source.
     */
    override fun objectConfiguration(objectConfiguration: Any) {
      cdkBuilder.objectConfiguration(objectConfiguration)
    }

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    override fun scheduleConfig(scheduleConfig: IResolvable) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(IResolvable::unwrap))
    }

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    override fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty) {
      cdkBuilder.scheduleConfig(scheduleConfig.let(CfnDataIntegration.ScheduleConfigProperty::unwrap))
    }

    /**
     * @param scheduleConfig The name of the data and how often it should be pulled from the source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d365c235953f8290fdd74cd163ee38eeeb6cfdef8dc1e42f1b89575e68c24b17")
    override
        fun scheduleConfig(scheduleConfig: CfnDataIntegration.ScheduleConfigProperty.Builder.() -> Unit):
        Unit = scheduleConfig(CfnDataIntegration.ScheduleConfigProperty(scheduleConfig))

    /**
     * @param sourceUri The URI of the data source. 
     */
    override fun sourceUri(sourceUri: String) {
      cdkBuilder.sourceUri(sourceUri)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps,
  ) : CdkObject(cdkObject), CfnDataIntegrationProps {
    /**
     * A description of the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The configuration for what files should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-fileconfiguration)
     */
    override fun fileConfiguration(): Any? = unwrap(this).getFileConfiguration()

    /**
     * The KMS key for the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-kmskey)
     */
    override fun kmsKey(): String = unwrap(this).getKmsKey()

    /**
     * The name of the DataIntegration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The configuration for what data should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-objectconfiguration)
     */
    override fun objectConfiguration(): Any? = unwrap(this).getObjectConfiguration()

    /**
     * The name of the data and how often it should be pulled from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-scheduleconfig)
     */
    override fun scheduleConfig(): Any? = unwrap(this).getScheduleConfig()

    /**
     * The URI of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-sourceuri)
     */
    override fun sourceUri(): String = unwrap(this).getSourceUri()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-dataintegration.html#cfn-appintegrations-dataintegration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps):
        CfnDataIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataIntegrationProps):
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps
  }
}
