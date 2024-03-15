@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.personalize.CfnDataset,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDatasetArn(): String = unwrap(this).getAttrDatasetArn()

  public open fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

  public open fun datasetGroupArn(`value`: String) {
    unwrap(this).setDatasetGroupArn(`value`)
  }

  public open fun datasetImportJob(): Any? = unwrap(this).getDatasetImportJob()

  public open fun datasetImportJob(`value`: IResolvable) {
    unwrap(this).setDatasetImportJob(`value`.let(IResolvable::unwrap))
  }

  public open fun datasetImportJob(`value`: DatasetImportJobProperty) {
    unwrap(this).setDatasetImportJob(`value`.let(DatasetImportJobProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f15d07ac00955cce01882cc4201ca99e654195c75998b1ea270ffb9363fcfd8")
  public open fun datasetImportJob(`value`: DatasetImportJobProperty.Builder.() -> Unit): Unit =
      datasetImportJob(DatasetImportJobProperty(`value`))

  public open fun datasetType(): String = unwrap(this).getDatasetType()

  public open fun datasetType(`value`: String) {
    unwrap(this).setDatasetType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun schemaArn(): String = unwrap(this).getSchemaArn()

  public open fun schemaArn(`value`: String) {
    unwrap(this).setSchemaArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun datasetGroupArn(datasetGroupArn: String)

    public fun datasetImportJob(datasetImportJob: IResolvable)

    public fun datasetImportJob(datasetImportJob: DatasetImportJobProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00047c50505b44a350b3b5aa2091fd9d26178e854fdd5befa5ed5863515933a6")
    public fun datasetImportJob(datasetImportJob: DatasetImportJobProperty.Builder.() -> Unit)

    public fun datasetType(datasetType: String)

    public fun name(name: String)

    public fun schemaArn(schemaArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDataset.Builder =
        software.amazon.awscdk.services.personalize.CfnDataset.Builder.create(scope, id)

    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    override fun datasetImportJob(datasetImportJob: IResolvable) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(IResolvable::unwrap))
    }

    override fun datasetImportJob(datasetImportJob: DatasetImportJobProperty) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(DatasetImportJobProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00047c50505b44a350b3b5aa2091fd9d26178e854fdd5befa5ed5863515933a6")
    override fun datasetImportJob(datasetImportJob: DatasetImportJobProperty.Builder.() -> Unit):
        Unit = datasetImportJob(DatasetImportJobProperty(datasetImportJob))

    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schemaArn(schemaArn: String) {
      cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.personalize.CfnDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset): CfnDataset
        = CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.personalize.CfnDataset
        = wrapped.cdkObject
  }

  public interface DataSourceProperty {
    public fun dataLocation(): String? = unwrap(this).getDataLocation()

    @CdkDslMarker
    public interface Builder {
      public fun dataLocation(dataLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty.builder()

      override fun dataLocation(dataLocation: String) {
        cdkBuilder.dataLocation(dataLocation)
      }

      public fun build(): software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty,
    ) : CdkObject(cdkObject), DataSourceProperty {
      override fun dataLocation(): String? = unwrap(this).getDataLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty):
          DataSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnDataset.DataSourceProperty
    }
  }

  public interface DatasetImportJobProperty {
    public fun dataSource(): Any? = unwrap(this).getDataSource()

    public fun datasetArn(): String? = unwrap(this).getDatasetArn()

    public fun datasetImportJobArn(): String? = unwrap(this).getDatasetImportJobArn()

    public fun jobName(): String? = unwrap(this).getJobName()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    @CdkDslMarker
    public interface Builder {
      public fun dataSource(dataSource: Any)

      public fun datasetArn(datasetArn: String)

      public fun datasetImportJobArn(datasetImportJobArn: String)

      public fun jobName(jobName: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty.Builder =
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty.builder()

      override fun dataSource(dataSource: Any) {
        cdkBuilder.dataSource(dataSource)
      }

      override fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
      }

      override fun datasetImportJobArn(datasetImportJobArn: String) {
        cdkBuilder.datasetImportJobArn(datasetImportJobArn)
      }

      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty,
    ) : CdkObject(cdkObject), DatasetImportJobProperty {
      override fun dataSource(): Any? = unwrap(this).getDataSource()

      override fun datasetArn(): String? = unwrap(this).getDatasetArn()

      override fun datasetImportJobArn(): String? = unwrap(this).getDatasetImportJobArn()

      override fun jobName(): String? = unwrap(this).getJobName()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetImportJobProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty):
          DatasetImportJobProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetImportJobProperty):
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.personalize.CfnDataset.DatasetImportJobProperty
    }
  }
}
