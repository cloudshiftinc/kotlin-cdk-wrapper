@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationReferenceDataSourceV2Props {
  public fun applicationName(): String

  public fun referenceDataSource(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun referenceDataSource(referenceDataSource: IResolvable)

    public
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("508c0325757aaa27b6e4ab6c3a27227cdb015d60745a26988b93b7c74ac8dc98")
    public
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.Builder
        =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun referenceDataSource(referenceDataSource: IResolvable) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(IResolvable::unwrap))
    }

    override
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("508c0325757aaa27b6e4ab6c3a27227cdb015d60745a26988b93b7c74ac8dc98")
    override
        fun referenceDataSource(referenceDataSource: CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder.() -> Unit):
        Unit =
        referenceDataSource(CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty(referenceDataSource))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props,
  ) : CdkObject(cdkObject), CfnApplicationReferenceDataSourceV2Props {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun referenceDataSource(): Any = unwrap(this).getReferenceDataSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationReferenceDataSourceV2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props):
        CfnApplicationReferenceDataSourceV2Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationReferenceDataSourceV2Props):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2Props
  }
}
