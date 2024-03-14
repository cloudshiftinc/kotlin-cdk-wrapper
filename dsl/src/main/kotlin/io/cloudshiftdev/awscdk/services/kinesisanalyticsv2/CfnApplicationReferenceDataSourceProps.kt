package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationReferenceDataSourceProps {
  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname)
   */
  public fun applicationName(): String

  /**
   * For a SQL-based Managed Service for Apache Flink application, describes the reference data
   * source by providing the source information (Amazon S3 bucket name and object key name), the
   * resulting in-application table name that is created, and the necessary schema to map the data
   * elements in the Amazon S3 object to the in-application table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
   */
  public fun referenceDataSource(): Any

  /**
   * A builder for [CfnApplicationReferenceDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param referenceDataSource For a SQL-based Managed Service for Apache Flink application,
     * describes the reference data source by providing the source information (Amazon S3 bucket name
     * and object key name), the resulting in-application table name that is created, and the necessary
     * schema to map the data elements in the Amazon S3 object to the in-application table. 
     */
    public fun referenceDataSource(referenceDataSource: IResolvable)

    /**
     * @param referenceDataSource For a SQL-based Managed Service for Apache Flink application,
     * describes the reference data source by providing the source information (Amazon S3 bucket name
     * and object key name), the resulting in-application table name that is created, and the necessary
     * schema to map the data elements in the Amazon S3 object to the in-application table. 
     */
    public
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty)

    /**
     * @param referenceDataSource For a SQL-based Managed Service for Apache Flink application,
     * describes the reference data source by providing the source information (Amazon S3 bucket name
     * and object key name), the resulting in-application table name that is created, and the necessary
     * schema to map the data elements in the Amazon S3 object to the in-application table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("973691c4852ea2f53c1aa4037855ba75c59e1f42a701fb36605bda2a6399c052")
    public
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps.Builder
        =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps.builder()

    /**
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param referenceDataSource For a SQL-based Managed Service for Apache Flink application,
     * describes the reference data source by providing the source information (Amazon S3 bucket name
     * and object key name), the resulting in-application table name that is created, and the necessary
     * schema to map the data elements in the Amazon S3 object to the in-application table. 
     */
    override fun referenceDataSource(referenceDataSource: IResolvable) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(IResolvable::unwrap))
    }

    /**
     * @param referenceDataSource For a SQL-based Managed Service for Apache Flink application,
     * describes the reference data source by providing the source information (Amazon S3 bucket name
     * and object key name), the resulting in-application table name that is created, and the necessary
     * schema to map the data elements in the Amazon S3 object to the in-application table. 
     */
    override
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(CfnApplicationReferenceDataSource.ReferenceDataSourceProperty::unwrap))
    }

    /**
     * @param referenceDataSource For a SQL-based Managed Service for Apache Flink application,
     * describes the reference data source by providing the source information (Amazon S3 bucket name
     * and object key name), the resulting in-application table name that is created, and the necessary
     * schema to map the data elements in the Amazon S3 object to the in-application table. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("973691c4852ea2f53c1aa4037855ba75c59e1f42a701fb36605bda2a6399c052")
    override
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder.() -> Unit):
        Unit =
        referenceDataSource(CfnApplicationReferenceDataSource.ReferenceDataSourceProperty(referenceDataSource))

    public fun build():
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps,
  ) : CdkObject(cdkObject), CfnApplicationReferenceDataSourceProps {
    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * For a SQL-based Managed Service for Apache Flink application, describes the reference data
     * source by providing the source information (Amazon S3 bucket name and object key name), the
     * resulting in-application table name that is created, and the necessary schema to map the data
     * elements in the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     */
    override fun referenceDataSource(): Any = unwrap(this).getReferenceDataSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationReferenceDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps):
        CfnApplicationReferenceDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationReferenceDataSourceProps):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSourceProps
  }
}
