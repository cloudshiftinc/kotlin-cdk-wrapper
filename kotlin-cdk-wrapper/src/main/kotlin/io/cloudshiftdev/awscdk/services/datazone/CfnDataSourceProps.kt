@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataSourceProps {
  public fun assetFormsInput(): Any? = unwrap(this).getAssetFormsInput()

  public fun configuration(): Any? = unwrap(this).getConfiguration()

  public fun description(): String? = unwrap(this).getDescription()

  public fun domainIdentifier(): String

  public fun enableSetting(): String? = unwrap(this).getEnableSetting()

  public fun environmentIdentifier(): String

  public fun name(): String

  public fun projectIdentifier(): String

  public fun publishOnImport(): Any? = unwrap(this).getPublishOnImport()

  public fun recommendation(): Any? = unwrap(this).getRecommendation()

  public fun schedule(): Any? = unwrap(this).getSchedule()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun assetFormsInput(assetFormsInput: IResolvable)

    public fun assetFormsInput(assetFormsInput: List<Any>)

    public fun assetFormsInput(vararg assetFormsInput: Any)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0016b04b4be124afd6b341aac632d6598f1ce95011b1880b9e9358e38d0035cd")
    public
        fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun domainIdentifier(domainIdentifier: String)

    public fun enableSetting(enableSetting: String)

    public fun environmentIdentifier(environmentIdentifier: String)

    public fun name(name: String)

    public fun projectIdentifier(projectIdentifier: String)

    public fun publishOnImport(publishOnImport: Boolean)

    public fun publishOnImport(publishOnImport: IResolvable)

    public fun recommendation(recommendation: IResolvable)

    public fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("215e29011739ca758010099cbcf0d9b951d098862a1cabdd7cffe28008bf1adc")
    public
        fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty.Builder.() -> Unit)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eb698c1109d325f3b545a9f3b1663c913546988570c35b97ceac9540a08e756")
    public fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty.Builder.() -> Unit)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.datazone.CfnDataSourceProps.builder()

    override fun assetFormsInput(assetFormsInput: IResolvable) {
      cdkBuilder.assetFormsInput(assetFormsInput.let(IResolvable::unwrap))
    }

    override fun assetFormsInput(assetFormsInput: List<Any>) {
      cdkBuilder.assetFormsInput(assetFormsInput)
    }

    override fun assetFormsInput(vararg assetFormsInput: Any): Unit =
        assetFormsInput(assetFormsInput.toList())

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty) {
      cdkBuilder.configuration(configuration.let(CfnDataSource.DataSourceConfigurationInputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0016b04b4be124afd6b341aac632d6598f1ce95011b1880b9e9358e38d0035cd")
    override
        fun configuration(configuration: CfnDataSource.DataSourceConfigurationInputProperty.Builder.() -> Unit):
        Unit = configuration(CfnDataSource.DataSourceConfigurationInputProperty(configuration))

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

    override fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty) {
      cdkBuilder.recommendation(recommendation.let(CfnDataSource.RecommendationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("215e29011739ca758010099cbcf0d9b951d098862a1cabdd7cffe28008bf1adc")
    override
        fun recommendation(recommendation: CfnDataSource.RecommendationConfigurationProperty.Builder.() -> Unit):
        Unit = recommendation(CfnDataSource.RecommendationConfigurationProperty(recommendation))

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty) {
      cdkBuilder.schedule(schedule.let(CfnDataSource.ScheduleConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7eb698c1109d325f3b545a9f3b1663c913546988570c35b97ceac9540a08e756")
    override fun schedule(schedule: CfnDataSource.ScheduleConfigurationProperty.Builder.() -> Unit):
        Unit = schedule(CfnDataSource.ScheduleConfigurationProperty(schedule))

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    override fun assetFormsInput(): Any? = unwrap(this).getAssetFormsInput()

    override fun configuration(): Any? = unwrap(this).getConfiguration()

    override fun description(): String? = unwrap(this).getDescription()

    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    override fun enableSetting(): String? = unwrap(this).getEnableSetting()

    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    override fun name(): String = unwrap(this).getName()

    override fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

    override fun publishOnImport(): Any? = unwrap(this).getPublishOnImport()

    override fun recommendation(): Any? = unwrap(this).getRecommendation()

    override fun schedule(): Any? = unwrap(this).getSchedule()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDataSourceProps):
        CfnDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.datazone.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnDataSourceProps
  }
}
