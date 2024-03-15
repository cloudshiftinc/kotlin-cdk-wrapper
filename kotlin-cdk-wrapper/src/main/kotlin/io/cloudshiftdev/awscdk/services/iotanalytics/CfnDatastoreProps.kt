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

public interface CfnDatastoreProps {
  public fun datastoreName(): String? = unwrap(this).getDatastoreName()

  public fun datastorePartitions(): Any? = unwrap(this).getDatastorePartitions()

  public fun datastoreStorage(): Any? = unwrap(this).getDatastoreStorage()

  public fun fileFormatConfiguration(): Any? = unwrap(this).getFileFormatConfiguration()

  public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun datastoreName(datastoreName: String)

    public fun datastorePartitions(datastorePartitions: IResolvable)

    public fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f0ac83ab97b1504cef312121377d4bef13fd46a4f32fc68286bd43cb2a8242")
    public
        fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty.Builder.() -> Unit)

    public fun datastoreStorage(datastoreStorage: IResolvable)

    public fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e498cf0ceaa1cd82eeb06ab6292e74be224928891f182b35eda1b010f8e6562")
    public
        fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty.Builder.() -> Unit)

    public fun fileFormatConfiguration(fileFormatConfiguration: IResolvable)

    public
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9acf619de45a2e839534ca2943c618eee0c3517feb3b300e93d93e4a66eea0e5")
    public
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty.Builder.() -> Unit)

    public fun retentionPeriod(retentionPeriod: IResolvable)

    public fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cefa71ee5ce5f90b4e003eac364b0e3318029a58f1c07eeef2312851775b81c7")
    public
        fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.builder()

    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    override fun datastorePartitions(datastorePartitions: IResolvable) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(IResolvable::unwrap))
    }

    override
        fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(CfnDatastore.DatastorePartitionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f0ac83ab97b1504cef312121377d4bef13fd46a4f32fc68286bd43cb2a8242")
    override
        fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty.Builder.() -> Unit):
        Unit = datastorePartitions(CfnDatastore.DatastorePartitionsProperty(datastorePartitions))

    override fun datastoreStorage(datastoreStorage: IResolvable) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(IResolvable::unwrap))
    }

    override fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(CfnDatastore.DatastoreStorageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e498cf0ceaa1cd82eeb06ab6292e74be224928891f182b35eda1b010f8e6562")
    override
        fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty.Builder.() -> Unit):
        Unit = datastoreStorage(CfnDatastore.DatastoreStorageProperty(datastoreStorage))

    override fun fileFormatConfiguration(fileFormatConfiguration: IResolvable) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(IResolvable::unwrap))
    }

    override
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(CfnDatastore.FileFormatConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9acf619de45a2e839534ca2943c618eee0c3517feb3b300e93d93e4a66eea0e5")
    override
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty.Builder.() -> Unit):
        Unit =
        fileFormatConfiguration(CfnDatastore.FileFormatConfigurationProperty(fileFormatConfiguration))

    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(CfnDatastore.RetentionPeriodProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cefa71ee5ce5f90b4e003eac364b0e3318029a58f1c07eeef2312851775b81c7")
    override
        fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty.Builder.() -> Unit):
        Unit = retentionPeriod(CfnDatastore.RetentionPeriodProperty(retentionPeriod))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps,
  ) : CdkObject(cdkObject), CfnDatastoreProps {
    override fun datastoreName(): String? = unwrap(this).getDatastoreName()

    override fun datastorePartitions(): Any? = unwrap(this).getDatastorePartitions()

    override fun datastoreStorage(): Any? = unwrap(this).getDatastoreStorage()

    override fun fileFormatConfiguration(): Any? = unwrap(this).getFileFormatConfiguration()

    override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatastoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps):
        CfnDatastoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatastoreProps):
        software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps
  }
}
