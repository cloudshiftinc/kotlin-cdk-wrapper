@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnDataSourceProps cfnDataSourceProps = CfnDataSourceProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .name("name")
 * .projectIdentifier("projectIdentifier")
 * .type("type")
 * // the properties below are optional
 * .assetFormsInput(List.of(FormInputProperty.builder()
 * .formName("formName")
 * // the properties below are optional
 * .content("content")
 * .typeIdentifier("typeIdentifier")
 * .typeRevision("typeRevision")
 * .build()))
 * .configuration(DataSourceConfigurationInputProperty.builder()
 * .glueRunConfiguration(GlueRunConfigurationInputProperty.builder()
 * .relationalFilterConfigurations(List.of(RelationalFilterConfigurationProperty.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .filterExpressions(List.of(FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .schemaName("schemaName")
 * .build()))
 * // the properties below are optional
 * .dataAccessRole("dataAccessRole")
 * .build())
 * .redshiftRunConfiguration(RedshiftRunConfigurationInputProperty.builder()
 * .redshiftCredentialConfiguration(RedshiftCredentialConfigurationProperty.builder()
 * .secretManagerArn("secretManagerArn")
 * .build())
 * .redshiftStorage(RedshiftStorageProperty.builder()
 * .redshiftClusterSource(RedshiftClusterStorageProperty.builder()
 * .clusterName("clusterName")
 * .build())
 * .redshiftServerlessSource(RedshiftServerlessStorageProperty.builder()
 * .workgroupName("workgroupName")
 * .build())
 * .build())
 * .relationalFilterConfigurations(List.of(RelationalFilterConfigurationProperty.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .filterExpressions(List.of(FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .schemaName("schemaName")
 * .build()))
 * // the properties below are optional
 * .dataAccessRole("dataAccessRole")
 * .build())
 * .build())
 * .description("description")
 * .enableSetting("enableSetting")
 * .publishOnImport(false)
 * .recommendation(RecommendationConfigurationProperty.builder()
 * .enableBusinessNameGeneration(false)
 * .build())
 * .schedule(ScheduleConfigurationProperty.builder()
 * .schedule("schedule")
 * .timezone("timezone")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html)
 */
public interface CfnDataSourceProps {
  /**
   * The metadata forms attached to the assets that the data source works with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
   */
  public fun assetFormsInput(): Any? = unwrap(this).getAssetFormsInput()

  /**
   * The configuration of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The description of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the Amazon DataZone domain where the data source is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * Specifies whether the data source is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-enablesetting)
   */
  public fun enableSetting(): String? = unwrap(this).getEnableSetting()

  /**
   * The unique identifier of the Amazon DataZone environment to which the data source publishes
   * assets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-environmentidentifier)
   */
  public fun environmentIdentifier(): String

  /**
   * The name of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-name)
   */
  public fun name(): String

  /**
   * The identifier of the Amazon DataZone project in which you want to add this data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-projectidentifier)
   */
  public fun projectIdentifier(): String

  /**
   * Specifies whether the assets that this data source creates in the inventory are to be also
   * automatically published to the catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
   */
  public fun publishOnImport(): Any? = unwrap(this).getPublishOnImport()

  /**
   * Specifies whether the business name generation is to be enabled for this data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
   */
  public fun recommendation(): Any? = unwrap(this).getRecommendation()

  /**
   * The schedule of the data source runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
   */
  public fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The type of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with.
     */
    public fun assetFormsInput(assetFormsInput: IResolvable)

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with.
     */
    public fun assetFormsInput(assetFormsInput: List<Any>)

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with.
     */
    public fun assetFormsInput(vararg assetFormsInput: Any)

    /**
     * @param configuration The configuration of the data source.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration The configuration of the data source.
     */
    public fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty)

    /**
     * @param configuration The configuration of the data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0016b04b4be124afd6b341aac632d6598f1ce95011b1880b9e9358e38d0035cd")
    public
        fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty.Builder.() -> Unit)

    /**
     * @param description The description of the data source.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain where the data source is
     * created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param enableSetting Specifies whether the data source is enabled.
     */
    public fun enableSetting(enableSetting: String)

    /**
     * @param environmentIdentifier The unique identifier of the Amazon DataZone environment to
     * which the data source publishes assets. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * @param projectIdentifier The identifier of the Amazon DataZone project in which you want to
     * add this data source. 
     */
    public fun projectIdentifier(projectIdentifier: String)

    /**
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog.
     */
    public fun publishOnImport(publishOnImport: Boolean)

    /**
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog.
     */
    public fun publishOnImport(publishOnImport: IResolvable)

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source.
     */
    public fun recommendation(recommendation: IResolvable)

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source.
     */
    public fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty)

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("215e29011739ca758010099cbcf0d9b951d098862a1cabdd7cffe28008bf1adc")
    public
        fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param schedule The schedule of the data source runs.
     */
    public fun schedule(schedule: IResolvable)

    /**
     * @param schedule The schedule of the data source runs.
     */
    public fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty)

    /**
     * @param schedule The schedule of the data source runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eb698c1109d325f3b545a9f3b1663c913546988570c35b97ceac9540a08e756")
    public fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty.Builder.() -> Unit)

    /**
     * @param type The type of the data source. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.datazone.CfnDataSourceProps.builder()

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with.
     */
    override fun assetFormsInput(assetFormsInput: IResolvable) {
      cdkBuilder.assetFormsInput(assetFormsInput.let(IResolvable::unwrap))
    }

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with.
     */
    override fun assetFormsInput(assetFormsInput: List<Any>) {
      cdkBuilder.assetFormsInput(assetFormsInput)
    }

    /**
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with.
     */
    override fun assetFormsInput(vararg assetFormsInput: Any): Unit =
        assetFormsInput(assetFormsInput.toList())

    /**
     * @param configuration The configuration of the data source.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration The configuration of the data source.
     */
    override fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty) {
      cdkBuilder.configuration(configuration.let(CfnDataSource.DataSourceConfigurationInputProperty::unwrap))
    }

    /**
     * @param configuration The configuration of the data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0016b04b4be124afd6b341aac632d6598f1ce95011b1880b9e9358e38d0035cd")
    override
        fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty.Builder.() -> Unit):
        Unit = configuration(CfnDataSource.DataSourceConfigurationInputProperty(configuration))

    /**
     * @param description The description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The ID of the Amazon DataZone domain where the data source is
     * created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param enableSetting Specifies whether the data source is enabled.
     */
    override fun enableSetting(enableSetting: String) {
      cdkBuilder.enableSetting(enableSetting)
    }

    /**
     * @param environmentIdentifier The unique identifier of the Amazon DataZone environment to
     * which the data source publishes assets. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param projectIdentifier The identifier of the Amazon DataZone project in which you want to
     * add this data source. 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog.
     */
    override fun publishOnImport(publishOnImport: Boolean) {
      cdkBuilder.publishOnImport(publishOnImport)
    }

    /**
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog.
     */
    override fun publishOnImport(publishOnImport: IResolvable) {
      cdkBuilder.publishOnImport(publishOnImport.let(IResolvable::unwrap))
    }

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source.
     */
    override fun recommendation(recommendation: IResolvable) {
      cdkBuilder.recommendation(recommendation.let(IResolvable::unwrap))
    }

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source.
     */
    override fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty) {
      cdkBuilder.recommendation(recommendation.let(CfnDataSource.RecommendationConfigurationProperty::unwrap))
    }

    /**
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("215e29011739ca758010099cbcf0d9b951d098862a1cabdd7cffe28008bf1adc")
    override
        fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty.Builder.() -> Unit):
        Unit = recommendation(CfnDataSource.RecommendationConfigurationProperty(recommendation))

    /**
     * @param schedule The schedule of the data source runs.
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * @param schedule The schedule of the data source runs.
     */
    override fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty) {
      cdkBuilder.schedule(schedule.let(CfnDataSource.ScheduleConfigurationProperty::unwrap))
    }

    /**
     * @param schedule The schedule of the data source runs.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eb698c1109d325f3b545a9f3b1663c913546988570c35b97ceac9540a08e756")
    override fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty.Builder.() -> Unit):
        Unit = schedule(CfnDataSource.ScheduleConfigurationProperty(schedule))

    /**
     * @param type The type of the data source. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     */
    override fun assetFormsInput(): Any? = unwrap(this).getAssetFormsInput()

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the Amazon DataZone domain where the data source is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * Specifies whether the data source is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-enablesetting)
     */
    override fun enableSetting(): String? = unwrap(this).getEnableSetting()

    /**
     * The unique identifier of the Amazon DataZone environment to which the data source publishes
     * assets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-environmentidentifier)
     */
    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-projectidentifier)
     */
    override fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

    /**
     * Specifies whether the assets that this data source creates in the inventory are to be also
     * automatically published to the catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
     */
    override fun publishOnImport(): Any? = unwrap(this).getPublishOnImport()

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     */
    override fun recommendation(): Any? = unwrap(this).getRecommendation()

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     */
    override fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSourceProps):
        CfnDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.datazone.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnDataSourceProps
  }
}
