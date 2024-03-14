package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The metadata forms attached to the assets that the data source works with.
   */
  public open fun assetFormsInput(): Any? = unwrap(this).getAssetFormsInput()

  /**
   * The metadata forms attached to the assets that the data source works with.
   */
  public open fun assetFormsInput(`value`: IResolvable) {
    unwrap(this).setAssetFormsInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * The metadata forms attached to the assets that the data source works with.
   */
  public open fun assetFormsInput(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssetFormsInput(__idx_ac66f0)
  }

  /**
   * The metadata forms attached to the assets that the data source works with.
   */
  public open fun assetFormsInput(vararg __idx_ac66f0: Any): Unit =
      assetFormsInput(__idx_ac66f0.toList())

  /**
   * The timestamp of when the data source was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ID of the Amazon DataZone domain in which the data source exists.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The ID of the environment in which the data source exists.
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * The identifier of the data source run.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The count of the assets created during the last data source run.
   */
  public open fun attrLastRunAssetCount(): IResolvable =
      unwrap(this).getAttrLastRunAssetCount().let(IResolvable::wrap)

  /**
   * The timestamp of when the data source run was last performed.
   */
  public open fun attrLastRunAt(): String = unwrap(this).getAttrLastRunAt()

  /**
   * The status of the last data source run.
   */
  public open fun attrLastRunStatus(): String = unwrap(this).getAttrLastRunStatus()

  /**
   * The project ID included in the data source run activity.
   */
  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  /**
   * The status of the data source.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The timestamp of when the data source was updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The configuration of the data source.
   */
  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The configuration of the data source.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The configuration of the data source.
   */
  public open fun configuration(`value`: DataSourceConfigurationInputProperty) {
    unwrap(this).setConfiguration(`value`.let(DataSourceConfigurationInputProperty::unwrap))
  }

  /**
   * The configuration of the data source.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23b4051c1a319603050c0235cda556c33622a62ffcf8784254deb3d0e9bfd7e8")
  public open fun configuration(`value`: DataSourceConfigurationInputProperty.Builder.() -> Unit):
      Unit = configuration(DataSourceConfigurationInputProperty(`value`))

  /**
   * The description of the data source.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the data source.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the Amazon DataZone domain where the data source is created.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The ID of the Amazon DataZone domain where the data source is created.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * Specifies whether the data source is enabled.
   */
  public open fun enableSetting(): String? = unwrap(this).getEnableSetting()

  /**
   * Specifies whether the data source is enabled.
   */
  public open fun enableSetting(`value`: String) {
    unwrap(this).setEnableSetting(`value`)
  }

  /**
   * The unique identifier of the Amazon DataZone environment to which the data source publishes
   * assets.
   */
  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  /**
   * The unique identifier of the Amazon DataZone environment to which the data source publishes
   * assets.
   */
  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
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
   * The name of the data source.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the data source.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The identifier of the Amazon DataZone project in which you want to add this data source.
   */
  public open fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

  /**
   * The identifier of the Amazon DataZone project in which you want to add this data source.
   */
  public open fun projectIdentifier(`value`: String) {
    unwrap(this).setProjectIdentifier(`value`)
  }

  /**
   * Specifies whether the assets that this data source creates in the inventory are to be also
   * automatically published to the catalog.
   */
  public open fun publishOnImport(): Any? = unwrap(this).getPublishOnImport()

  /**
   * Specifies whether the assets that this data source creates in the inventory are to be also
   * automatically published to the catalog.
   */
  public open fun publishOnImport(`value`: Boolean) {
    unwrap(this).setPublishOnImport(`value`)
  }

  /**
   * Specifies whether the assets that this data source creates in the inventory are to be also
   * automatically published to the catalog.
   */
  public open fun publishOnImport(`value`: IResolvable) {
    unwrap(this).setPublishOnImport(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the business name generation is to be enabled for this data source.
   */
  public open fun recommendation(): Any? = unwrap(this).getRecommendation()

  /**
   * Specifies whether the business name generation is to be enabled for this data source.
   */
  public open fun recommendation(`value`: IResolvable) {
    unwrap(this).setRecommendation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the business name generation is to be enabled for this data source.
   */
  public open fun recommendation(`value`: RecommendationConfigurationProperty) {
    unwrap(this).setRecommendation(`value`.let(RecommendationConfigurationProperty::unwrap))
  }

  /**
   * Specifies whether the business name generation is to be enabled for this data source.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b42873feb3db6a62be7fc275fe424110c04f542fb609fa60c14b23afc37166a")
  public open fun recommendation(`value`: RecommendationConfigurationProperty.Builder.() -> Unit):
      Unit = recommendation(RecommendationConfigurationProperty(`value`))

  /**
   * The schedule of the data source runs.
   */
  public open fun schedule(): Any? = unwrap(this).getSchedule()

  /**
   * The schedule of the data source runs.
   */
  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  /**
   * The schedule of the data source runs.
   */
  public open fun schedule(`value`: ScheduleConfigurationProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleConfigurationProperty::unwrap))
  }

  /**
   * The schedule of the data source runs.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7339bb1c06d83211c549862cee9136ff322fbc1d1047d67810e164c4ca512ad")
  public open fun schedule(`value`: ScheduleConfigurationProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleConfigurationProperty(`value`))

  /**
   * The type of the data source.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the data source.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with. 
     */
    public fun assetFormsInput(assetFormsInput: IResolvable)

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with. 
     */
    public fun assetFormsInput(assetFormsInput: List<Any>)

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with. 
     */
    public fun assetFormsInput(vararg assetFormsInput: Any)

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     * @param configuration The configuration of the data source. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     * @param configuration The configuration of the data source. 
     */
    public fun configuration(configuration: DataSourceConfigurationInputProperty)

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     * @param configuration The configuration of the data source. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ec791e0d25fc33d1ac2eec8eb8fa0593889ce0bdc6dfff97ba69776a29daa5")
    public fun configuration(configuration: DataSourceConfigurationInputProperty.Builder.() -> Unit)

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-description)
     * @param description The description of the data source. 
     */
    public fun description(description: String)

    /**
     * The ID of the Amazon DataZone domain where the data source is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-domainidentifier)
     * @param domainIdentifier The ID of the Amazon DataZone domain where the data source is
     * created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * Specifies whether the data source is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-enablesetting)
     * @param enableSetting Specifies whether the data source is enabled. 
     */
    public fun enableSetting(enableSetting: String)

    /**
     * The unique identifier of the Amazon DataZone environment to which the data source publishes
     * assets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the Amazon DataZone environment to
     * which the data source publishes assets. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-name)
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-projectidentifier)
     * @param projectIdentifier The identifier of the Amazon DataZone project in which you want to
     * add this data source. 
     */
    public fun projectIdentifier(projectIdentifier: String)

    /**
     * Specifies whether the assets that this data source creates in the inventory are to be also
     * automatically published to the catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog. 
     */
    public fun publishOnImport(publishOnImport: Boolean)

    /**
     * Specifies whether the assets that this data source creates in the inventory are to be also
     * automatically published to the catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog. 
     */
    public fun publishOnImport(publishOnImport: IResolvable)

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source. 
     */
    public fun recommendation(recommendation: IResolvable)

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source. 
     */
    public fun recommendation(recommendation: RecommendationConfigurationProperty)

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97fcbea14c52a4d8dafc2e7c2248c163509fe2022ed84f50269dcacc0e347a8")
    public
        fun recommendation(recommendation: RecommendationConfigurationProperty.Builder.() -> Unit)

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     * @param schedule The schedule of the data source runs. 
     */
    public fun schedule(schedule: IResolvable)

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     * @param schedule The schedule of the data source runs. 
     */
    public fun schedule(schedule: ScheduleConfigurationProperty)

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     * @param schedule The schedule of the data source runs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee789eb03243a9d6801ac1d3e58da6f9195671336c08efab3768e4ea970bdbb")
    public fun schedule(schedule: ScheduleConfigurationProperty.Builder.() -> Unit)

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-type)
     * @param type The type of the data source. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDataSource.Builder =
        software.amazon.awscdk.services.datazone.CfnDataSource.Builder.create(scope, id)

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with. 
     */
    override fun assetFormsInput(assetFormsInput: IResolvable) {
      cdkBuilder.assetFormsInput(assetFormsInput.let(IResolvable::unwrap))
    }

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with. 
     */
    override fun assetFormsInput(assetFormsInput: List<Any>) {
      cdkBuilder.assetFormsInput(assetFormsInput)
    }

    /**
     * The metadata forms attached to the assets that the data source works with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-assetformsinput)
     * @param assetFormsInput The metadata forms attached to the assets that the data source works
     * with. 
     */
    override fun assetFormsInput(vararg assetFormsInput: Any): Unit =
        assetFormsInput(assetFormsInput.toList())

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     * @param configuration The configuration of the data source. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     * @param configuration The configuration of the data source. 
     */
    override fun configuration(configuration: DataSourceConfigurationInputProperty) {
      cdkBuilder.configuration(configuration.let(DataSourceConfigurationInputProperty::unwrap))
    }

    /**
     * The configuration of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-configuration)
     * @param configuration The configuration of the data source. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ec791e0d25fc33d1ac2eec8eb8fa0593889ce0bdc6dfff97ba69776a29daa5")
    override
        fun configuration(configuration: DataSourceConfigurationInputProperty.Builder.() -> Unit):
        Unit = configuration(DataSourceConfigurationInputProperty(configuration))

    /**
     * The description of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-description)
     * @param description The description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the Amazon DataZone domain where the data source is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-domainidentifier)
     * @param domainIdentifier The ID of the Amazon DataZone domain where the data source is
     * created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * Specifies whether the data source is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-enablesetting)
     * @param enableSetting Specifies whether the data source is enabled. 
     */
    override fun enableSetting(enableSetting: String) {
      cdkBuilder.enableSetting(enableSetting)
    }

    /**
     * The unique identifier of the Amazon DataZone environment to which the data source publishes
     * assets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-environmentidentifier)
     * @param environmentIdentifier The unique identifier of the Amazon DataZone environment to
     * which the data source publishes assets. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-name)
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The identifier of the Amazon DataZone project in which you want to add this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-projectidentifier)
     * @param projectIdentifier The identifier of the Amazon DataZone project in which you want to
     * add this data source. 
     */
    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    /**
     * Specifies whether the assets that this data source creates in the inventory are to be also
     * automatically published to the catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog. 
     */
    override fun publishOnImport(publishOnImport: Boolean) {
      cdkBuilder.publishOnImport(publishOnImport)
    }

    /**
     * Specifies whether the assets that this data source creates in the inventory are to be also
     * automatically published to the catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-publishonimport)
     * @param publishOnImport Specifies whether the assets that this data source creates in the
     * inventory are to be also automatically published to the catalog. 
     */
    override fun publishOnImport(publishOnImport: IResolvable) {
      cdkBuilder.publishOnImport(publishOnImport.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source. 
     */
    override fun recommendation(recommendation: IResolvable) {
      cdkBuilder.recommendation(recommendation.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source. 
     */
    override fun recommendation(recommendation: RecommendationConfigurationProperty) {
      cdkBuilder.recommendation(recommendation.let(RecommendationConfigurationProperty::unwrap))
    }

    /**
     * Specifies whether the business name generation is to be enabled for this data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-recommendation)
     * @param recommendation Specifies whether the business name generation is to be enabled for
     * this data source. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97fcbea14c52a4d8dafc2e7c2248c163509fe2022ed84f50269dcacc0e347a8")
    override
        fun recommendation(recommendation: RecommendationConfigurationProperty.Builder.() -> Unit):
        Unit = recommendation(RecommendationConfigurationProperty(recommendation))

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     * @param schedule The schedule of the data source runs. 
     */
    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     * @param schedule The schedule of the data source runs. 
     */
    override fun schedule(schedule: ScheduleConfigurationProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleConfigurationProperty::unwrap))
    }

    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-schedule)
     * @param schedule The schedule of the data source runs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee789eb03243a9d6801ac1d3e58da6f9195671336c08efab3768e4ea970bdbb")
    override fun schedule(schedule: ScheduleConfigurationProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleConfigurationProperty(schedule))

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-datasource.html#cfn-datazone-datasource-type)
     * @param type The type of the data source. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.datazone.CfnDataSource = wrapped.cdkObject
  }

  public interface RedshiftServerlessStorageProperty {
    /**
     * The name of the Amazon Redshift Serverless workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftserverlessstorage.html#cfn-datazone-datasource-redshiftserverlessstorage-workgroupname)
     */
    public fun workgroupName(): String

    /**
     * A builder for [RedshiftServerlessStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param workgroupName The name of the Amazon Redshift Serverless workgroup. 
       */
      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty.builder()

      /**
       * @param workgroupName The name of the Amazon Redshift Serverless workgroup. 
       */
      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty,
    ) : CdkObject(cdkObject), RedshiftServerlessStorageProperty {
      /**
       * The name of the Amazon Redshift Serverless workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftserverlessstorage.html#cfn-datazone-datasource-redshiftserverlessstorage-workgroupname)
       */
      override fun workgroupName(): String = unwrap(this).getWorkgroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftServerlessStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty):
          RedshiftServerlessStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftServerlessStorageProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty
    }
  }

  public interface FilterExpressionProperty {
    /**
     * The search filter expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-filterexpression.html#cfn-datazone-datasource-filterexpression-expression)
     */
    public fun expression(): String

    /**
     * The search filter explresison type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-filterexpression.html#cfn-datazone-datasource-filterexpression-type)
     */
    public fun type(): String

    /**
     * A builder for [FilterExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression The search filter expression. 
       */
      public fun expression(expression: String)

      /**
       * @param type The search filter explresison type. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty.builder()

      /**
       * @param expression The search filter expression. 
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param type The search filter explresison type. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty,
    ) : CdkObject(cdkObject), FilterExpressionProperty {
      /**
       * The search filter expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-filterexpression.html#cfn-datazone-datasource-filterexpression-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * The search filter explresison type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-filterexpression.html#cfn-datazone-datasource-filterexpression-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty):
          FilterExpressionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterExpressionProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty
    }
  }

  public interface RecommendationConfigurationProperty {
    /**
     * Specifies whether automatic business name generation is to be enabled or not as part of the
     * recommendation configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-recommendationconfiguration.html#cfn-datazone-datasource-recommendationconfiguration-enablebusinessnamegeneration)
     */
    public fun enableBusinessNameGeneration(): Any? = unwrap(this).getEnableBusinessNameGeneration()

    /**
     * A builder for [RecommendationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableBusinessNameGeneration Specifies whether automatic business name generation is
       * to be enabled or not as part of the recommendation configuration.
       */
      public fun enableBusinessNameGeneration(enableBusinessNameGeneration: Boolean)

      /**
       * @param enableBusinessNameGeneration Specifies whether automatic business name generation is
       * to be enabled or not as part of the recommendation configuration.
       */
      public fun enableBusinessNameGeneration(enableBusinessNameGeneration: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty.builder()

      /**
       * @param enableBusinessNameGeneration Specifies whether automatic business name generation is
       * to be enabled or not as part of the recommendation configuration.
       */
      override fun enableBusinessNameGeneration(enableBusinessNameGeneration: Boolean) {
        cdkBuilder.enableBusinessNameGeneration(enableBusinessNameGeneration)
      }

      /**
       * @param enableBusinessNameGeneration Specifies whether automatic business name generation is
       * to be enabled or not as part of the recommendation configuration.
       */
      override fun enableBusinessNameGeneration(enableBusinessNameGeneration: IResolvable) {
        cdkBuilder.enableBusinessNameGeneration(enableBusinessNameGeneration.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty,
    ) : CdkObject(cdkObject), RecommendationConfigurationProperty {
      /**
       * Specifies whether automatic business name generation is to be enabled or not as part of the
       * recommendation configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-recommendationconfiguration.html#cfn-datazone-datasource-recommendationconfiguration-enablebusinessnamegeneration)
       */
      override fun enableBusinessNameGeneration(): Any? =
          unwrap(this).getEnableBusinessNameGeneration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RecommendationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty):
          RecommendationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecommendationConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty
    }
  }

  public interface RelationalFilterConfigurationProperty {
    /**
     * The database name specified in the relational filter configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html#cfn-datazone-datasource-relationalfilterconfiguration-databasename)
     */
    public fun databaseName(): String

    /**
     * The filter expressions specified in the relational filter configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html#cfn-datazone-datasource-relationalfilterconfiguration-filterexpressions)
     */
    public fun filterExpressions(): Any? = unwrap(this).getFilterExpressions()

    /**
     * The schema name specified in the relational filter configuration for the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html#cfn-datazone-datasource-relationalfilterconfiguration-schemaname)
     */
    public fun schemaName(): String? = unwrap(this).getSchemaName()

    /**
     * A builder for [RelationalFilterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseName The database name specified in the relational filter configuration for
       * the data source. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param filterExpressions The filter expressions specified in the relational filter
       * configuration for the data source.
       */
      public fun filterExpressions(filterExpressions: IResolvable)

      /**
       * @param filterExpressions The filter expressions specified in the relational filter
       * configuration for the data source.
       */
      public fun filterExpressions(filterExpressions: List<Any>)

      /**
       * @param filterExpressions The filter expressions specified in the relational filter
       * configuration for the data source.
       */
      public fun filterExpressions(vararg filterExpressions: Any)

      /**
       * @param schemaName The schema name specified in the relational filter configuration for the
       * data source.
       */
      public fun schemaName(schemaName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty.builder()

      /**
       * @param databaseName The database name specified in the relational filter configuration for
       * the data source. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param filterExpressions The filter expressions specified in the relational filter
       * configuration for the data source.
       */
      override fun filterExpressions(filterExpressions: IResolvable) {
        cdkBuilder.filterExpressions(filterExpressions.let(IResolvable::unwrap))
      }

      /**
       * @param filterExpressions The filter expressions specified in the relational filter
       * configuration for the data source.
       */
      override fun filterExpressions(filterExpressions: List<Any>) {
        cdkBuilder.filterExpressions(filterExpressions)
      }

      /**
       * @param filterExpressions The filter expressions specified in the relational filter
       * configuration for the data source.
       */
      override fun filterExpressions(vararg filterExpressions: Any): Unit =
          filterExpressions(filterExpressions.toList())

      /**
       * @param schemaName The schema name specified in the relational filter configuration for the
       * data source.
       */
      override fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty,
    ) : CdkObject(cdkObject), RelationalFilterConfigurationProperty {
      /**
       * The database name specified in the relational filter configuration for the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html#cfn-datazone-datasource-relationalfilterconfiguration-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The filter expressions specified in the relational filter configuration for the data
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html#cfn-datazone-datasource-relationalfilterconfiguration-filterexpressions)
       */
      override fun filterExpressions(): Any? = unwrap(this).getFilterExpressions()

      /**
       * The schema name specified in the relational filter configuration for the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-relationalfilterconfiguration.html#cfn-datazone-datasource-relationalfilterconfiguration-schemaname)
       */
      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RelationalFilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty):
          RelationalFilterConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationalFilterConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty
    }
  }

  public interface RedshiftStorageProperty {
    /**
     * The details of the Amazon Redshift cluster source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftstorage.html#cfn-datazone-datasource-redshiftstorage-redshiftclustersource)
     */
    public fun redshiftClusterSource(): Any? = unwrap(this).getRedshiftClusterSource()

    /**
     * The details of the Amazon Redshift Serverless workgroup source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftstorage.html#cfn-datazone-datasource-redshiftstorage-redshiftserverlesssource)
     */
    public fun redshiftServerlessSource(): Any? = unwrap(this).getRedshiftServerlessSource()

    /**
     * A builder for [RedshiftStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param redshiftClusterSource The details of the Amazon Redshift cluster source.
       */
      public fun redshiftClusterSource(redshiftClusterSource: IResolvable)

      /**
       * @param redshiftClusterSource The details of the Amazon Redshift cluster source.
       */
      public fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty)

      /**
       * @param redshiftClusterSource The details of the Amazon Redshift cluster source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba8616c977c827ba122709ece163c4044a0f88c0eec2a2e168f7c5fb8764a851")
      public
          fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty.Builder.() -> Unit)

      /**
       * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
       * source.
       */
      public fun redshiftServerlessSource(redshiftServerlessSource: IResolvable)

      /**
       * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
       * source.
       */
      public
          fun redshiftServerlessSource(redshiftServerlessSource: RedshiftServerlessStorageProperty)

      /**
       * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
       * source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30d400db2ad3eb359f03e7de3fd458556e7af9b01d3fdd573178e52d2eea73ea")
      public
          fun redshiftServerlessSource(redshiftServerlessSource: RedshiftServerlessStorageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty.builder()

      /**
       * @param redshiftClusterSource The details of the Amazon Redshift cluster source.
       */
      override fun redshiftClusterSource(redshiftClusterSource: IResolvable) {
        cdkBuilder.redshiftClusterSource(redshiftClusterSource.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftClusterSource The details of the Amazon Redshift cluster source.
       */
      override fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty) {
        cdkBuilder.redshiftClusterSource(redshiftClusterSource.let(RedshiftClusterStorageProperty::unwrap))
      }

      /**
       * @param redshiftClusterSource The details of the Amazon Redshift cluster source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba8616c977c827ba122709ece163c4044a0f88c0eec2a2e168f7c5fb8764a851")
      override
          fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty.Builder.() -> Unit):
          Unit = redshiftClusterSource(RedshiftClusterStorageProperty(redshiftClusterSource))

      /**
       * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
       * source.
       */
      override fun redshiftServerlessSource(redshiftServerlessSource: IResolvable) {
        cdkBuilder.redshiftServerlessSource(redshiftServerlessSource.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
       * source.
       */
      override
          fun redshiftServerlessSource(redshiftServerlessSource: RedshiftServerlessStorageProperty) {
        cdkBuilder.redshiftServerlessSource(redshiftServerlessSource.let(RedshiftServerlessStorageProperty::unwrap))
      }

      /**
       * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
       * source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30d400db2ad3eb359f03e7de3fd458556e7af9b01d3fdd573178e52d2eea73ea")
      override
          fun redshiftServerlessSource(redshiftServerlessSource: RedshiftServerlessStorageProperty.Builder.() -> Unit):
          Unit =
          redshiftServerlessSource(RedshiftServerlessStorageProperty(redshiftServerlessSource))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty,
    ) : CdkObject(cdkObject), RedshiftStorageProperty {
      /**
       * The details of the Amazon Redshift cluster source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftstorage.html#cfn-datazone-datasource-redshiftstorage-redshiftclustersource)
       */
      override fun redshiftClusterSource(): Any? = unwrap(this).getRedshiftClusterSource()

      /**
       * The details of the Amazon Redshift Serverless workgroup source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftstorage.html#cfn-datazone-datasource-redshiftstorage-redshiftserverlesssource)
       */
      override fun redshiftServerlessSource(): Any? = unwrap(this).getRedshiftServerlessSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty):
          RedshiftStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftStorageProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty
    }
  }

  public interface ScheduleConfigurationProperty {
    /**
     * The schedule of the data source runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-scheduleconfiguration.html#cfn-datazone-datasource-scheduleconfiguration-schedule)
     */
    public fun schedule(): String? = unwrap(this).getSchedule()

    /**
     * The timezone of the data source run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-scheduleconfiguration.html#cfn-datazone-datasource-scheduleconfiguration-timezone)
     */
    public fun timezone(): String? = unwrap(this).getTimezone()

    /**
     * A builder for [ScheduleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param schedule The schedule of the data source runs.
       */
      public fun schedule(schedule: String)

      /**
       * @param timezone The timezone of the data source run.
       */
      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty.builder()

      /**
       * @param schedule The schedule of the data source runs.
       */
      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      /**
       * @param timezone The timezone of the data source run.
       */
      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty,
    ) : CdkObject(cdkObject), ScheduleConfigurationProperty {
      /**
       * The schedule of the data source runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-scheduleconfiguration.html#cfn-datazone-datasource-scheduleconfiguration-schedule)
       */
      override fun schedule(): String? = unwrap(this).getSchedule()

      /**
       * The timezone of the data source run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-scheduleconfiguration.html#cfn-datazone-datasource-scheduleconfiguration-timezone)
       */
      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty):
          ScheduleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty
    }
  }

  public interface DataSourceConfigurationInputProperty {
    /**
     * The configuration of the AWS Glue data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-datasourceconfigurationinput.html#cfn-datazone-datasource-datasourceconfigurationinput-gluerunconfiguration)
     */
    public fun glueRunConfiguration(): Any? = unwrap(this).getGlueRunConfiguration()

    /**
     * The configuration of the Amazon Redshift data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-datasourceconfigurationinput.html#cfn-datazone-datasource-datasourceconfigurationinput-redshiftrunconfiguration)
     */
    public fun redshiftRunConfiguration(): Any? = unwrap(this).getRedshiftRunConfiguration()

    /**
     * A builder for [DataSourceConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueRunConfiguration The configuration of the AWS Glue data source.
       */
      public fun glueRunConfiguration(glueRunConfiguration: IResolvable)

      /**
       * @param glueRunConfiguration The configuration of the AWS Glue data source.
       */
      public fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty)

      /**
       * @param glueRunConfiguration The configuration of the AWS Glue data source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c49eeceba0aa5a83d13ed911660f833c1e5ccdf436d9954e682b7288b79823")
      public
          fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty.Builder.() -> Unit)

      /**
       * @param redshiftRunConfiguration The configuration of the Amazon Redshift data source.
       */
      public fun redshiftRunConfiguration(redshiftRunConfiguration: IResolvable)

      /**
       * @param redshiftRunConfiguration The configuration of the Amazon Redshift data source.
       */
      public
          fun redshiftRunConfiguration(redshiftRunConfiguration: RedshiftRunConfigurationInputProperty)

      /**
       * @param redshiftRunConfiguration The configuration of the Amazon Redshift data source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea29d27e9f07fa556b546a5850087d69a993ce39f2c81674d2c99b16b76a8a")
      public
          fun redshiftRunConfiguration(redshiftRunConfiguration: RedshiftRunConfigurationInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty.builder()

      /**
       * @param glueRunConfiguration The configuration of the AWS Glue data source.
       */
      override fun glueRunConfiguration(glueRunConfiguration: IResolvable) {
        cdkBuilder.glueRunConfiguration(glueRunConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param glueRunConfiguration The configuration of the AWS Glue data source.
       */
      override fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty) {
        cdkBuilder.glueRunConfiguration(glueRunConfiguration.let(GlueRunConfigurationInputProperty::unwrap))
      }

      /**
       * @param glueRunConfiguration The configuration of the AWS Glue data source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c49eeceba0aa5a83d13ed911660f833c1e5ccdf436d9954e682b7288b79823")
      override
          fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty.Builder.() -> Unit):
          Unit = glueRunConfiguration(GlueRunConfigurationInputProperty(glueRunConfiguration))

      /**
       * @param redshiftRunConfiguration The configuration of the Amazon Redshift data source.
       */
      override fun redshiftRunConfiguration(redshiftRunConfiguration: IResolvable) {
        cdkBuilder.redshiftRunConfiguration(redshiftRunConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftRunConfiguration The configuration of the Amazon Redshift data source.
       */
      override
          fun redshiftRunConfiguration(redshiftRunConfiguration: RedshiftRunConfigurationInputProperty) {
        cdkBuilder.redshiftRunConfiguration(redshiftRunConfiguration.let(RedshiftRunConfigurationInputProperty::unwrap))
      }

      /**
       * @param redshiftRunConfiguration The configuration of the Amazon Redshift data source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("87ea29d27e9f07fa556b546a5850087d69a993ce39f2c81674d2c99b16b76a8a")
      override
          fun redshiftRunConfiguration(redshiftRunConfiguration: RedshiftRunConfigurationInputProperty.Builder.() -> Unit):
          Unit =
          redshiftRunConfiguration(RedshiftRunConfigurationInputProperty(redshiftRunConfiguration))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty,
    ) : CdkObject(cdkObject), DataSourceConfigurationInputProperty {
      /**
       * The configuration of the AWS Glue data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-datasourceconfigurationinput.html#cfn-datazone-datasource-datasourceconfigurationinput-gluerunconfiguration)
       */
      override fun glueRunConfiguration(): Any? = unwrap(this).getGlueRunConfiguration()

      /**
       * The configuration of the Amazon Redshift data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-datasourceconfigurationinput.html#cfn-datazone-datasource-datasourceconfigurationinput-redshiftrunconfiguration)
       */
      override fun redshiftRunConfiguration(): Any? = unwrap(this).getRedshiftRunConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSourceConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty):
          DataSourceConfigurationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceConfigurationInputProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty
    }
  }

  public interface RedshiftClusterStorageProperty {
    /**
     * The name of an Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftclusterstorage.html#cfn-datazone-datasource-redshiftclusterstorage-clustername)
     */
    public fun clusterName(): String

    /**
     * A builder for [RedshiftClusterStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterName The name of an Amazon Redshift cluster. 
       */
      public fun clusterName(clusterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty.builder()

      /**
       * @param clusterName The name of an Amazon Redshift cluster. 
       */
      override fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty,
    ) : CdkObject(cdkObject), RedshiftClusterStorageProperty {
      /**
       * The name of an Amazon Redshift cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftclusterstorage.html#cfn-datazone-datasource-redshiftclusterstorage-clustername)
       */
      override fun clusterName(): String = unwrap(this).getClusterName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftClusterStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty):
          RedshiftClusterStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftClusterStorageProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty
    }
  }

  public interface RedshiftCredentialConfigurationProperty {
    /**
     * The ARN of a secret manager for an Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftcredentialconfiguration.html#cfn-datazone-datasource-redshiftcredentialconfiguration-secretmanagerarn)
     */
    public fun secretManagerArn(): String

    /**
     * A builder for [RedshiftCredentialConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretManagerArn The ARN of a secret manager for an Amazon Redshift cluster. 
       */
      public fun secretManagerArn(secretManagerArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty.builder()

      /**
       * @param secretManagerArn The ARN of a secret manager for an Amazon Redshift cluster. 
       */
      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty,
    ) : CdkObject(cdkObject), RedshiftCredentialConfigurationProperty {
      /**
       * The ARN of a secret manager for an Amazon Redshift cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftcredentialconfiguration.html#cfn-datazone-datasource-redshiftcredentialconfiguration-secretmanagerarn)
       */
      override fun secretManagerArn(): String = unwrap(this).getSecretManagerArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftCredentialConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty):
          RedshiftCredentialConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftCredentialConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty
    }
  }

  public interface RedshiftRunConfigurationInputProperty {
    /**
     * The data access role included in the configuration details of the Amazon Redshift data
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-dataaccessrole)
     */
    public fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

    /**
     * The details of the credentials required to access an Amazon Redshift cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-redshiftcredentialconfiguration)
     */
    public fun redshiftCredentialConfiguration(): Any

    /**
     * The details of the Amazon Redshift storage as part of the configuration of an Amazon Redshift
     * data source run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-redshiftstorage)
     */
    public fun redshiftStorage(): Any

    /**
     * The relational filter configurations included in the configuration details of the AWS Glue
     * data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-relationalfilterconfigurations)
     */
    public fun relationalFilterConfigurations(): Any

    /**
     * A builder for [RedshiftRunConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataAccessRole The data access role included in the configuration details of the
       * Amazon Redshift data source.
       */
      public fun dataAccessRole(dataAccessRole: String)

      /**
       * @param redshiftCredentialConfiguration The details of the credentials required to access an
       * Amazon Redshift cluster. 
       */
      public fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: IResolvable)

      /**
       * @param redshiftCredentialConfiguration The details of the credentials required to access an
       * Amazon Redshift cluster. 
       */
      public
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty)

      /**
       * @param redshiftCredentialConfiguration The details of the credentials required to access an
       * Amazon Redshift cluster. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e201875d0fa55c8500b08cfe89434f772ef00b245c4a8273ea2ba4ba6fcbc207")
      public
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty.Builder.() -> Unit)

      /**
       * @param redshiftStorage The details of the Amazon Redshift storage as part of the
       * configuration of an Amazon Redshift data source run. 
       */
      public fun redshiftStorage(redshiftStorage: IResolvable)

      /**
       * @param redshiftStorage The details of the Amazon Redshift storage as part of the
       * configuration of an Amazon Redshift data source run. 
       */
      public fun redshiftStorage(redshiftStorage: RedshiftStorageProperty)

      /**
       * @param redshiftStorage The details of the Amazon Redshift storage as part of the
       * configuration of an Amazon Redshift data source run. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c96c9f1fca94be303cefa3be2240a1598e8f221de0dab9360c4273e4ae3ac81b")
      public fun redshiftStorage(redshiftStorage: RedshiftStorageProperty.Builder.() -> Unit)

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      public fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable)

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      public fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>)

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      public fun relationalFilterConfigurations(vararg relationalFilterConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty.builder()

      /**
       * @param dataAccessRole The data access role included in the configuration details of the
       * Amazon Redshift data source.
       */
      override fun dataAccessRole(dataAccessRole: String) {
        cdkBuilder.dataAccessRole(dataAccessRole)
      }

      /**
       * @param redshiftCredentialConfiguration The details of the credentials required to access an
       * Amazon Redshift cluster. 
       */
      override fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: IResolvable) {
        cdkBuilder.redshiftCredentialConfiguration(redshiftCredentialConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftCredentialConfiguration The details of the credentials required to access an
       * Amazon Redshift cluster. 
       */
      override
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty) {
        cdkBuilder.redshiftCredentialConfiguration(redshiftCredentialConfiguration.let(RedshiftCredentialConfigurationProperty::unwrap))
      }

      /**
       * @param redshiftCredentialConfiguration The details of the credentials required to access an
       * Amazon Redshift cluster. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e201875d0fa55c8500b08cfe89434f772ef00b245c4a8273ea2ba4ba6fcbc207")
      override
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty.Builder.() -> Unit):
          Unit =
          redshiftCredentialConfiguration(RedshiftCredentialConfigurationProperty(redshiftCredentialConfiguration))

      /**
       * @param redshiftStorage The details of the Amazon Redshift storage as part of the
       * configuration of an Amazon Redshift data source run. 
       */
      override fun redshiftStorage(redshiftStorage: IResolvable) {
        cdkBuilder.redshiftStorage(redshiftStorage.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftStorage The details of the Amazon Redshift storage as part of the
       * configuration of an Amazon Redshift data source run. 
       */
      override fun redshiftStorage(redshiftStorage: RedshiftStorageProperty) {
        cdkBuilder.redshiftStorage(redshiftStorage.let(RedshiftStorageProperty::unwrap))
      }

      /**
       * @param redshiftStorage The details of the Amazon Redshift storage as part of the
       * configuration of an Amazon Redshift data source run. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c96c9f1fca94be303cefa3be2240a1598e8f221de0dab9360c4273e4ae3ac81b")
      override fun redshiftStorage(redshiftStorage: RedshiftStorageProperty.Builder.() -> Unit):
          Unit = redshiftStorage(RedshiftStorageProperty(redshiftStorage))

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      override fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      override fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations)
      }

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      override fun relationalFilterConfigurations(vararg relationalFilterConfigurations: Any): Unit
          = relationalFilterConfigurations(relationalFilterConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty,
    ) : CdkObject(cdkObject), RedshiftRunConfigurationInputProperty {
      /**
       * The data access role included in the configuration details of the Amazon Redshift data
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-dataaccessrole)
       */
      override fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

      /**
       * The details of the credentials required to access an Amazon Redshift cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-redshiftcredentialconfiguration)
       */
      override fun redshiftCredentialConfiguration(): Any =
          unwrap(this).getRedshiftCredentialConfiguration()

      /**
       * The details of the Amazon Redshift storage as part of the configuration of an Amazon
       * Redshift data source run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-redshiftstorage)
       */
      override fun redshiftStorage(): Any = unwrap(this).getRedshiftStorage()

      /**
       * The relational filter configurations included in the configuration details of the AWS Glue
       * data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html#cfn-datazone-datasource-redshiftrunconfigurationinput-relationalfilterconfigurations)
       */
      override fun relationalFilterConfigurations(): Any =
          unwrap(this).getRelationalFilterConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftRunConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty):
          RedshiftRunConfigurationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftRunConfigurationInputProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty
    }
  }

  public interface GlueRunConfigurationInputProperty {
    /**
     * The data access role included in the configuration details of the AWS Glue data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-gluerunconfigurationinput.html#cfn-datazone-datasource-gluerunconfigurationinput-dataaccessrole)
     */
    public fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

    /**
     * The relational filter configurations included in the configuration details of the AWS Glue
     * data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-gluerunconfigurationinput.html#cfn-datazone-datasource-gluerunconfigurationinput-relationalfilterconfigurations)
     */
    public fun relationalFilterConfigurations(): Any

    /**
     * A builder for [GlueRunConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataAccessRole The data access role included in the configuration details of the AWS
       * Glue data source.
       */
      public fun dataAccessRole(dataAccessRole: String)

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      public fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable)

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      public fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>)

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      public fun relationalFilterConfigurations(vararg relationalFilterConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty.builder()

      /**
       * @param dataAccessRole The data access role included in the configuration details of the AWS
       * Glue data source.
       */
      override fun dataAccessRole(dataAccessRole: String) {
        cdkBuilder.dataAccessRole(dataAccessRole)
      }

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      override fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      override fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations)
      }

      /**
       * @param relationalFilterConfigurations The relational filter configurations included in the
       * configuration details of the AWS Glue data source. 
       */
      override fun relationalFilterConfigurations(vararg relationalFilterConfigurations: Any): Unit
          = relationalFilterConfigurations(relationalFilterConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty,
    ) : CdkObject(cdkObject), GlueRunConfigurationInputProperty {
      /**
       * The data access role included in the configuration details of the AWS Glue data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-gluerunconfigurationinput.html#cfn-datazone-datasource-gluerunconfigurationinput-dataaccessrole)
       */
      override fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

      /**
       * The relational filter configurations included in the configuration details of the AWS Glue
       * data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-gluerunconfigurationinput.html#cfn-datazone-datasource-gluerunconfigurationinput-relationalfilterconfigurations)
       */
      override fun relationalFilterConfigurations(): Any =
          unwrap(this).getRelationalFilterConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GlueRunConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty):
          GlueRunConfigurationInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueRunConfigurationInputProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty
    }
  }

  public interface FormInputProperty {
    /**
     * The content of the metadata form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-content)
     */
    public fun content(): String? = unwrap(this).getContent()

    /**
     * The name of the metadata form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-formname)
     */
    public fun formName(): String

    /**
     * The ID of the metadata form type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-typeidentifier)
     */
    public fun typeIdentifier(): String? = unwrap(this).getTypeIdentifier()

    /**
     * The revision of the metadata form type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-typerevision)
     */
    public fun typeRevision(): String? = unwrap(this).getTypeRevision()

    /**
     * A builder for [FormInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content The content of the metadata form.
       */
      public fun content(content: String)

      /**
       * @param formName The name of the metadata form. 
       */
      public fun formName(formName: String)

      /**
       * @param typeIdentifier The ID of the metadata form type.
       */
      public fun typeIdentifier(typeIdentifier: String)

      /**
       * @param typeRevision The revision of the metadata form type.
       */
      public fun typeRevision(typeRevision: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty.builder()

      /**
       * @param content The content of the metadata form.
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      /**
       * @param formName The name of the metadata form. 
       */
      override fun formName(formName: String) {
        cdkBuilder.formName(formName)
      }

      /**
       * @param typeIdentifier The ID of the metadata form type.
       */
      override fun typeIdentifier(typeIdentifier: String) {
        cdkBuilder.typeIdentifier(typeIdentifier)
      }

      /**
       * @param typeRevision The revision of the metadata form type.
       */
      override fun typeRevision(typeRevision: String) {
        cdkBuilder.typeRevision(typeRevision)
      }

      public fun build(): software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty,
    ) : CdkObject(cdkObject), FormInputProperty {
      /**
       * The content of the metadata form.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-content)
       */
      override fun content(): String? = unwrap(this).getContent()

      /**
       * The name of the metadata form.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-formname)
       */
      override fun formName(): String = unwrap(this).getFormName()

      /**
       * The ID of the metadata form type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-typeidentifier)
       */
      override fun typeIdentifier(): String? = unwrap(this).getTypeIdentifier()

      /**
       * The revision of the metadata form type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-forminput.html#cfn-datazone-datasource-forminput-typerevision)
       */
      override fun typeRevision(): String? = unwrap(this).getTypeRevision()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FormInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty):
          FormInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty
    }
  }
}
