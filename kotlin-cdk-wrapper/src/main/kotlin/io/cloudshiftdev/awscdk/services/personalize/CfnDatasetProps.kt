@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDatasetProps {
  public fun datasetGroupArn(): String

  public fun datasetImportJob(): Any? = unwrap(this).getDatasetImportJob()

  public fun datasetType(): String

  public fun name(): String

  public fun schemaArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun datasetGroupArn(datasetGroupArn: String)

    public fun datasetImportJob(datasetImportJob: IResolvable)

    public fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3997818a8fb3ba48d3370b7fa4764b9e963288673819859cba7b028bc9fd6625")
    public
        fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty.Builder.() -> Unit)

    public fun datasetType(datasetType: String)

    public fun name(name: String)

    public fun schemaArn(schemaArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.personalize.CfnDatasetProps.builder()

    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    override fun datasetImportJob(datasetImportJob: IResolvable) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(IResolvable::unwrap))
    }

    override fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty) {
      cdkBuilder.datasetImportJob(datasetImportJob.let(CfnDataset.DatasetImportJobProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3997818a8fb3ba48d3370b7fa4764b9e963288673819859cba7b028bc9fd6625")
    override
        fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty.Builder.() -> Unit):
        Unit = datasetImportJob(CfnDataset.DatasetImportJobProperty(datasetImportJob))

    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schemaArn(schemaArn: String) {
      cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    override fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

    override fun datasetImportJob(): Any? = unwrap(this).getDatasetImportJob()

    override fun datasetType(): String = unwrap(this).getDatasetType()

    override fun name(): String = unwrap(this).getName()

    override fun schemaArn(): String = unwrap(this).getSchemaArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetProps):
        CfnDatasetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.personalize.CfnDatasetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnDatasetProps
  }
}
