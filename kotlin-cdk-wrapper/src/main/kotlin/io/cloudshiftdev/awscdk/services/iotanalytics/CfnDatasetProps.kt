@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDatasetProps {
  public fun actions(): Any

  public fun contentDeliveryRules(): Any? = unwrap(this).getContentDeliveryRules()

  public fun datasetName(): String? = unwrap(this).getDatasetName()

  public fun lateDataRules(): Any? = unwrap(this).getLateDataRules()

  public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun triggers(): Any? = unwrap(this).getTriggers()

  public fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: IResolvable)

    public fun actions(actions: List<Any>)

    public fun actions(vararg actions: Any)

    public fun contentDeliveryRules(contentDeliveryRules: IResolvable)

    public fun contentDeliveryRules(contentDeliveryRules: List<Any>)

    public fun contentDeliveryRules(vararg contentDeliveryRules: Any)

    public fun datasetName(datasetName: String)

    public fun lateDataRules(lateDataRules: IResolvable)

    public fun lateDataRules(lateDataRules: List<Any>)

    public fun lateDataRules(vararg lateDataRules: Any)

    public fun retentionPeriod(retentionPeriod: IResolvable)

    public fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e585be29460628514dd7c49d16aa9175c576b146ac1679502f3c11a5226d6dd8")
    public
        fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun triggers(triggers: IResolvable)

    public fun triggers(triggers: List<Any>)

    public fun triggers(vararg triggers: Any)

    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    public
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60fe6e1ca66d647f6b7daa88db7f0eb648db412759da79cd3f78dc68a5416f66")
    public
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDatasetProps.builder()

    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    override fun contentDeliveryRules(contentDeliveryRules: IResolvable) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules.let(IResolvable::unwrap))
    }

    override fun contentDeliveryRules(contentDeliveryRules: List<Any>) {
      cdkBuilder.contentDeliveryRules(contentDeliveryRules)
    }

    override fun contentDeliveryRules(vararg contentDeliveryRules: Any): Unit =
        contentDeliveryRules(contentDeliveryRules.toList())

    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    override fun lateDataRules(lateDataRules: IResolvable) {
      cdkBuilder.lateDataRules(lateDataRules.let(IResolvable::unwrap))
    }

    override fun lateDataRules(lateDataRules: List<Any>) {
      cdkBuilder.lateDataRules(lateDataRules)
    }

    override fun lateDataRules(vararg lateDataRules: Any): Unit =
        lateDataRules(lateDataRules.toList())

    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(CfnDataset.RetentionPeriodProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e585be29460628514dd7c49d16aa9175c576b146ac1679502f3c11a5226d6dd8")
    override
        fun retentionPeriod(retentionPeriod: CfnDataset.RetentionPeriodProperty.Builder.() -> Unit):
        Unit = retentionPeriod(CfnDataset.RetentionPeriodProperty(retentionPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    override fun triggers(triggers: List<Any>) {
      cdkBuilder.triggers(triggers)
    }

    override fun triggers(vararg triggers: Any): Unit = triggers(triggers.toList())

    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable::unwrap))
    }

    override
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(CfnDataset.VersioningConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60fe6e1ca66d647f6b7daa88db7f0eb648db412759da79cd3f78dc68a5416f66")
    override
        fun versioningConfiguration(versioningConfiguration: CfnDataset.VersioningConfigurationProperty.Builder.() -> Unit):
        Unit =
        versioningConfiguration(CfnDataset.VersioningConfigurationProperty(versioningConfiguration))

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    override fun actions(): Any = unwrap(this).getActions()

    override fun contentDeliveryRules(): Any? = unwrap(this).getContentDeliveryRules()

    override fun datasetName(): String? = unwrap(this).getDatasetName()

    override fun lateDataRules(): Any? = unwrap(this).getLateDataRules()

    override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun triggers(): Any? = unwrap(this).getTriggers()

    override fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatasetProps):
        CfnDatasetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.iotanalytics.CfnDatasetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotanalytics.CfnDatasetProps
  }
}
