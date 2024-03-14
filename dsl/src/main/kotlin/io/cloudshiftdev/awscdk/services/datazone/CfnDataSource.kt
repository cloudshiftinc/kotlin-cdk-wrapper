package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
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
  private val cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource,
) : CfnResource(cdkObject), IInspectable {
  public open fun assetFormsInput(): Any? = unwrap(this).getAssetFormsInput()

  public open fun assetFormsInput(`value`: IResolvable) {
    unwrap(this).setAssetFormsInput(`value`.let(IResolvable::unwrap))
  }

  public open fun assetFormsInput(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssetFormsInput(__idx_ac66f0)
  }

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastRunAssetCount(): IResolvable =
      unwrap(this).getAttrLastRunAssetCount().let(IResolvable::wrap)

  public open fun attrLastRunAt(): String = unwrap(this).getAttrLastRunAt()

  public open fun attrLastRunStatus(): String = unwrap(this).getAttrLastRunStatus()

  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: DataSourceConfigurationInputProperty) {
    unwrap(this).setConfiguration(`value`.let(DataSourceConfigurationInputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23b4051c1a319603050c0235cda556c33622a62ffcf8784254deb3d0e9bfd7e8")
  public open fun configuration(`value`: DataSourceConfigurationInputProperty.Builder.() -> Unit):
      Unit = configuration(DataSourceConfigurationInputProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  public open fun enableSetting(): String? = unwrap(this).getEnableSetting()

  public open fun enableSetting(`value`: String) {
    unwrap(this).setEnableSetting(`value`)
  }

  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

  public open fun projectIdentifier(`value`: String) {
    unwrap(this).setProjectIdentifier(`value`)
  }

  public open fun publishOnImport(): Any? = unwrap(this).getPublishOnImport()

  public open fun publishOnImport(`value`: Boolean) {
    unwrap(this).setPublishOnImport(`value`)
  }

  public open fun publishOnImport(`value`: IResolvable) {
    unwrap(this).setPublishOnImport(`value`.let(IResolvable::unwrap))
  }

  public open fun recommendation(): Any? = unwrap(this).getRecommendation()

  public open fun recommendation(`value`: IResolvable) {
    unwrap(this).setRecommendation(`value`.let(IResolvable::unwrap))
  }

  public open fun recommendation(`value`: RecommendationConfigurationProperty) {
    unwrap(this).setRecommendation(`value`.let(RecommendationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b42873feb3db6a62be7fc275fe424110c04f542fb609fa60c14b23afc37166a")
  public open fun recommendation(`value`: RecommendationConfigurationProperty.Builder.() -> Unit):
      Unit = recommendation(RecommendationConfigurationProperty(`value`))

  public open fun schedule(): Any? = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: ScheduleConfigurationProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d7339bb1c06d83211c549862cee9136ff322fbc1d1047d67810e164c4ca512ad")
  public open fun schedule(`value`: ScheduleConfigurationProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleConfigurationProperty(`value`))

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun assetFormsInput(assetFormsInput: IResolvable)

    public fun assetFormsInput(assetFormsInput: List<Any>)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: DataSourceConfigurationInputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ec791e0d25fc33d1ac2eec8eb8fa0593889ce0bdc6dfff97ba69776a29daa5")
    public fun configuration(configuration: DataSourceConfigurationInputProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun domainIdentifier(domainIdentifier: String)

    public fun enableSetting(enableSetting: String)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun name(name: String)

    public fun projectIdentifier(projectIdentifier: String)

    public fun publishOnImport(publishOnImport: Boolean)

    public fun publishOnImport(publishOnImport: IResolvable)

    public fun recommendation(recommendation: IResolvable)

    public fun recommendation(recommendation: RecommendationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97fcbea14c52a4d8dafc2e7c2248c163509fe2022ed84f50269dcacc0e347a8")
    public
        fun recommendation(recommendation: RecommendationConfigurationProperty.Builder.() -> Unit)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: ScheduleConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee789eb03243a9d6801ac1d3e58da6f9195671336c08efab3768e4ea970bdbb")
    public fun schedule(schedule: ScheduleConfigurationProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDataSource.Builder =
        software.amazon.awscdk.services.datazone.CfnDataSource.Builder.create(scope, id)

    override fun assetFormsInput(assetFormsInput: IResolvable) {
      cdkBuilder.assetFormsInput(assetFormsInput.let(IResolvable::unwrap))
    }

    override fun assetFormsInput(assetFormsInput: List<Any>) {
      cdkBuilder.assetFormsInput(assetFormsInput)
    }

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: DataSourceConfigurationInputProperty) {
      cdkBuilder.configuration(configuration.let(DataSourceConfigurationInputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3ec791e0d25fc33d1ac2eec8eb8fa0593889ce0bdc6dfff97ba69776a29daa5")
    override
        fun configuration(configuration: DataSourceConfigurationInputProperty.Builder.() -> Unit):
        Unit = configuration(DataSourceConfigurationInputProperty(configuration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    override fun enableSetting(enableSetting: String) {
      cdkBuilder.enableSetting(enableSetting)
    }

    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    override fun publishOnImport(publishOnImport: Boolean) {
      cdkBuilder.publishOnImport(publishOnImport)
    }

    override fun publishOnImport(publishOnImport: IResolvable) {
      cdkBuilder.publishOnImport(publishOnImport.let(IResolvable::unwrap))
    }

    override fun recommendation(recommendation: IResolvable) {
      cdkBuilder.recommendation(recommendation.let(IResolvable::unwrap))
    }

    override fun recommendation(recommendation: RecommendationConfigurationProperty) {
      cdkBuilder.recommendation(recommendation.let(RecommendationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b97fcbea14c52a4d8dafc2e7c2248c163509fe2022ed84f50269dcacc0e347a8")
    override
        fun recommendation(recommendation: RecommendationConfigurationProperty.Builder.() -> Unit):
        Unit = recommendation(RecommendationConfigurationProperty(recommendation))

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: ScheduleConfigurationProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ee789eb03243a9d6801ac1d3e58da6f9195671336c08efab3768e4ea970bdbb")
    override fun schedule(schedule: ScheduleConfigurationProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleConfigurationProperty(schedule))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
    public fun workgroupName(): String

    public interface Builder {
      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty.builder()

      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftServerlessStorageProperty,
    ) : RedshiftServerlessStorageProperty {
      override fun workgroupName(): String = unwrap(this).getWorkgroupName()
    }

    public companion object {
      init {

      }

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
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterExpressionProperty {
    public fun expression(): String

    public fun type(): String

    public interface Builder {
      public fun expression(expression: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty.builder()

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty,
    ) : FilterExpressionProperty {
      override fun expression(): String = unwrap(this).getExpression()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty):
          FilterExpressionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterExpressionProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.FilterExpressionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RecommendationConfigurationProperty {
    public fun enableBusinessNameGeneration(): Any? = unwrap(this).getEnableBusinessNameGeneration()

    public interface Builder {
      public fun enableBusinessNameGeneration(enableBusinessNameGeneration: Boolean)

      public fun enableBusinessNameGeneration(enableBusinessNameGeneration: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty.builder()

      override fun enableBusinessNameGeneration(enableBusinessNameGeneration: Boolean) {
        cdkBuilder.enableBusinessNameGeneration(enableBusinessNameGeneration)
      }

      override fun enableBusinessNameGeneration(enableBusinessNameGeneration: IResolvable) {
        cdkBuilder.enableBusinessNameGeneration(enableBusinessNameGeneration.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RecommendationConfigurationProperty,
    ) : RecommendationConfigurationProperty {
      override fun enableBusinessNameGeneration(): Any? =
          unwrap(this).getEnableBusinessNameGeneration()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RelationalFilterConfigurationProperty {
    public fun databaseName(): String

    public fun filterExpressions(): Any? = unwrap(this).getFilterExpressions()

    public fun schemaName(): String? = unwrap(this).getSchemaName()

    public interface Builder {
      public fun databaseName(databaseName: String)

      public fun filterExpressions(filterExpressions: IResolvable)

      public fun filterExpressions(filterExpressions: List<Any>)

      public fun schemaName(schemaName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty.builder()

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun filterExpressions(filterExpressions: IResolvable) {
        cdkBuilder.filterExpressions(filterExpressions.let(IResolvable::unwrap))
      }

      override fun filterExpressions(filterExpressions: List<Any>) {
        cdkBuilder.filterExpressions(filterExpressions)
      }

      override fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RelationalFilterConfigurationProperty,
    ) : RelationalFilterConfigurationProperty {
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun filterExpressions(): Any? = unwrap(this).getFilterExpressions()

      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftStorageProperty {
    public fun redshiftClusterSource(): Any? = unwrap(this).getRedshiftClusterSource()

    public fun redshiftServerlessSource(): Any? = unwrap(this).getRedshiftServerlessSource()

    public interface Builder {
      public fun redshiftClusterSource(redshiftClusterSource: IResolvable)

      public fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba8616c977c827ba122709ece163c4044a0f88c0eec2a2e168f7c5fb8764a851")
      public
          fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty.Builder.() -> Unit)

      public fun redshiftServerlessSource(redshiftServerlessSource: IResolvable)

      public
          fun redshiftServerlessSource(redshiftServerlessSource: RedshiftServerlessStorageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30d400db2ad3eb359f03e7de3fd458556e7af9b01d3fdd573178e52d2eea73ea")
      public
          fun redshiftServerlessSource(redshiftServerlessSource: RedshiftServerlessStorageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty.builder()

      override fun redshiftClusterSource(redshiftClusterSource: IResolvable) {
        cdkBuilder.redshiftClusterSource(redshiftClusterSource.let(IResolvable::unwrap))
      }

      override fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty) {
        cdkBuilder.redshiftClusterSource(redshiftClusterSource.let(RedshiftClusterStorageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba8616c977c827ba122709ece163c4044a0f88c0eec2a2e168f7c5fb8764a851")
      override
          fun redshiftClusterSource(redshiftClusterSource: RedshiftClusterStorageProperty.Builder.() -> Unit):
          Unit = redshiftClusterSource(RedshiftClusterStorageProperty(redshiftClusterSource))

      override fun redshiftServerlessSource(redshiftServerlessSource: IResolvable) {
        cdkBuilder.redshiftServerlessSource(redshiftServerlessSource.let(IResolvable::unwrap))
      }

      override
          fun redshiftServerlessSource(redshiftServerlessSource: RedshiftServerlessStorageProperty) {
        cdkBuilder.redshiftServerlessSource(redshiftServerlessSource.let(RedshiftServerlessStorageProperty::unwrap))
      }

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty,
    ) : RedshiftStorageProperty {
      override fun redshiftClusterSource(): Any? = unwrap(this).getRedshiftClusterSource()

      override fun redshiftServerlessSource(): Any? = unwrap(this).getRedshiftServerlessSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty):
          RedshiftStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftStorageProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftStorageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ScheduleConfigurationProperty {
    public fun schedule(): String? = unwrap(this).getSchedule()

    public fun timezone(): String? = unwrap(this).getTimezone()

    public interface Builder {
      public fun schedule(schedule: String)

      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty.builder()

      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty,
    ) : ScheduleConfigurationProperty {
      override fun schedule(): String? = unwrap(this).getSchedule()

      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty):
          ScheduleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleConfigurationProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.ScheduleConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataSourceConfigurationInputProperty {
    public fun glueRunConfiguration(): Any? = unwrap(this).getGlueRunConfiguration()

    public fun redshiftRunConfiguration(): Any? = unwrap(this).getRedshiftRunConfiguration()

    public interface Builder {
      public fun glueRunConfiguration(glueRunConfiguration: IResolvable)

      public fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c49eeceba0aa5a83d13ed911660f833c1e5ccdf436d9954e682b7288b79823")
      public
          fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty.Builder.() -> Unit)

      public fun redshiftRunConfiguration(redshiftRunConfiguration: IResolvable)

      public
          fun redshiftRunConfiguration(redshiftRunConfiguration: RedshiftRunConfigurationInputProperty)

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

      override fun glueRunConfiguration(glueRunConfiguration: IResolvable) {
        cdkBuilder.glueRunConfiguration(glueRunConfiguration.let(IResolvable::unwrap))
      }

      override fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty) {
        cdkBuilder.glueRunConfiguration(glueRunConfiguration.let(GlueRunConfigurationInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32c49eeceba0aa5a83d13ed911660f833c1e5ccdf436d9954e682b7288b79823")
      override
          fun glueRunConfiguration(glueRunConfiguration: GlueRunConfigurationInputProperty.Builder.() -> Unit):
          Unit = glueRunConfiguration(GlueRunConfigurationInputProperty(glueRunConfiguration))

      override fun redshiftRunConfiguration(redshiftRunConfiguration: IResolvable) {
        cdkBuilder.redshiftRunConfiguration(redshiftRunConfiguration.let(IResolvable::unwrap))
      }

      override
          fun redshiftRunConfiguration(redshiftRunConfiguration: RedshiftRunConfigurationInputProperty) {
        cdkBuilder.redshiftRunConfiguration(redshiftRunConfiguration.let(RedshiftRunConfigurationInputProperty::unwrap))
      }

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.DataSourceConfigurationInputProperty,
    ) : DataSourceConfigurationInputProperty {
      override fun glueRunConfiguration(): Any? = unwrap(this).getGlueRunConfiguration()

      override fun redshiftRunConfiguration(): Any? = unwrap(this).getRedshiftRunConfiguration()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftClusterStorageProperty {
    public fun clusterName(): String

    public interface Builder {
      public fun clusterName(clusterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty.builder()

      override fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty,
    ) : RedshiftClusterStorageProperty {
      override fun clusterName(): String = unwrap(this).getClusterName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftClusterStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty):
          RedshiftClusterStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftClusterStorageProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftClusterStorageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftCredentialConfigurationProperty {
    public fun secretManagerArn(): String

    public interface Builder {
      public fun secretManagerArn(secretManagerArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty.builder()

      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftCredentialConfigurationProperty,
    ) : RedshiftCredentialConfigurationProperty {
      override fun secretManagerArn(): String = unwrap(this).getSecretManagerArn()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftRunConfigurationInputProperty {
    public fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

    public fun redshiftCredentialConfiguration(): Any

    public fun redshiftStorage(): Any

    public fun relationalFilterConfigurations(): Any

    public interface Builder {
      public fun dataAccessRole(dataAccessRole: String)

      public fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: IResolvable)

      public
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e201875d0fa55c8500b08cfe89434f772ef00b245c4a8273ea2ba4ba6fcbc207")
      public
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty.Builder.() -> Unit)

      public fun redshiftStorage(redshiftStorage: IResolvable)

      public fun redshiftStorage(redshiftStorage: RedshiftStorageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c96c9f1fca94be303cefa3be2240a1598e8f221de0dab9360c4273e4ae3ac81b")
      public fun redshiftStorage(redshiftStorage: RedshiftStorageProperty.Builder.() -> Unit)

      public fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable)

      public fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty.builder()

      override fun dataAccessRole(dataAccessRole: String) {
        cdkBuilder.dataAccessRole(dataAccessRole)
      }

      override fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: IResolvable) {
        cdkBuilder.redshiftCredentialConfiguration(redshiftCredentialConfiguration.let(IResolvable::unwrap))
      }

      override
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty) {
        cdkBuilder.redshiftCredentialConfiguration(redshiftCredentialConfiguration.let(RedshiftCredentialConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e201875d0fa55c8500b08cfe89434f772ef00b245c4a8273ea2ba4ba6fcbc207")
      override
          fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: RedshiftCredentialConfigurationProperty.Builder.() -> Unit):
          Unit =
          redshiftCredentialConfiguration(RedshiftCredentialConfigurationProperty(redshiftCredentialConfiguration))

      override fun redshiftStorage(redshiftStorage: IResolvable) {
        cdkBuilder.redshiftStorage(redshiftStorage.let(IResolvable::unwrap))
      }

      override fun redshiftStorage(redshiftStorage: RedshiftStorageProperty) {
        cdkBuilder.redshiftStorage(redshiftStorage.let(RedshiftStorageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c96c9f1fca94be303cefa3be2240a1598e8f221de0dab9360c4273e4ae3ac81b")
      override fun redshiftStorage(redshiftStorage: RedshiftStorageProperty.Builder.() -> Unit):
          Unit = redshiftStorage(RedshiftStorageProperty(redshiftStorage))

      override fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations.let(IResolvable::unwrap))
      }

      override fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.RedshiftRunConfigurationInputProperty,
    ) : RedshiftRunConfigurationInputProperty {
      override fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

      override fun redshiftCredentialConfiguration(): Any =
          unwrap(this).getRedshiftCredentialConfiguration()

      override fun redshiftStorage(): Any = unwrap(this).getRedshiftStorage()

      override fun relationalFilterConfigurations(): Any =
          unwrap(this).getRelationalFilterConfigurations()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GlueRunConfigurationInputProperty {
    public fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

    public fun relationalFilterConfigurations(): Any

    public interface Builder {
      public fun dataAccessRole(dataAccessRole: String)

      public fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable)

      public fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty.builder()

      override fun dataAccessRole(dataAccessRole: String) {
        cdkBuilder.dataAccessRole(dataAccessRole)
      }

      override fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations.let(IResolvable::unwrap))
      }

      override fun relationalFilterConfigurations(relationalFilterConfigurations: List<Any>) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.GlueRunConfigurationInputProperty,
    ) : GlueRunConfigurationInputProperty {
      override fun dataAccessRole(): String? = unwrap(this).getDataAccessRole()

      override fun relationalFilterConfigurations(): Any =
          unwrap(this).getRelationalFilterConfigurations()
    }

    public companion object {
      init {

      }

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
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FormInputProperty {
    public fun content(): String? = unwrap(this).getContent()

    public fun formName(): String

    public fun typeIdentifier(): String? = unwrap(this).getTypeIdentifier()

    public fun typeRevision(): String? = unwrap(this).getTypeRevision()

    public interface Builder {
      public fun content(content: String)

      public fun formName(formName: String)

      public fun typeIdentifier(typeIdentifier: String)

      public fun typeRevision(typeRevision: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty.builder()

      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      override fun formName(formName: String) {
        cdkBuilder.formName(formName)
      }

      override fun typeIdentifier(typeIdentifier: String) {
        cdkBuilder.typeIdentifier(typeIdentifier)
      }

      override fun typeRevision(typeRevision: String) {
        cdkBuilder.typeRevision(typeRevision)
      }

      public fun build(): software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty,
    ) : FormInputProperty {
      override fun content(): String? = unwrap(this).getContent()

      override fun formName(): String = unwrap(this).getFormName()

      override fun typeIdentifier(): String? = unwrap(this).getTypeIdentifier()

      override fun typeRevision(): String? = unwrap(this).getTypeRevision()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FormInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty):
          FormInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormInputProperty):
          software.amazon.awscdk.services.datazone.CfnDataSource.FormInputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
