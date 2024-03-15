@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lookoutmetrics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAnomalyDetectorProps {
  public fun anomalyDetectorConfig(): Any

  public fun anomalyDetectorDescription(): String? = unwrap(this).getAnomalyDetectorDescription()

  public fun anomalyDetectorName(): String? = unwrap(this).getAnomalyDetectorName()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun metricSetList(): Any

  @CdkDslMarker
  public interface Builder {
    public fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable)

    public
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aabe6e985ec554bb797ab61e903b9fb3011ba807e2ca7ef3ab2efe1fca07d7a3")
    public
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder.() -> Unit)

    public fun anomalyDetectorDescription(anomalyDetectorDescription: String)

    public fun anomalyDetectorName(anomalyDetectorName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun metricSetList(metricSetList: IResolvable)

    public fun metricSetList(metricSetList: List<Any>)

    public fun metricSetList(vararg metricSetList: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps.builder()

    override fun anomalyDetectorConfig(anomalyDetectorConfig: IResolvable) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(IResolvable::unwrap))
    }

    override
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty) {
      cdkBuilder.anomalyDetectorConfig(anomalyDetectorConfig.let(CfnAnomalyDetector.AnomalyDetectorConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aabe6e985ec554bb797ab61e903b9fb3011ba807e2ca7ef3ab2efe1fca07d7a3")
    override
        fun anomalyDetectorConfig(anomalyDetectorConfig: CfnAnomalyDetector.AnomalyDetectorConfigProperty.Builder.() -> Unit):
        Unit =
        anomalyDetectorConfig(CfnAnomalyDetector.AnomalyDetectorConfigProperty(anomalyDetectorConfig))

    override fun anomalyDetectorDescription(anomalyDetectorDescription: String) {
      cdkBuilder.anomalyDetectorDescription(anomalyDetectorDescription)
    }

    override fun anomalyDetectorName(anomalyDetectorName: String) {
      cdkBuilder.anomalyDetectorName(anomalyDetectorName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun metricSetList(metricSetList: IResolvable) {
      cdkBuilder.metricSetList(metricSetList.let(IResolvable::unwrap))
    }

    override fun metricSetList(metricSetList: List<Any>) {
      cdkBuilder.metricSetList(metricSetList)
    }

    override fun metricSetList(vararg metricSetList: Any): Unit =
        metricSetList(metricSetList.toList())

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps,
  ) : CdkObject(cdkObject), CfnAnomalyDetectorProps {
    override fun anomalyDetectorConfig(): Any = unwrap(this).getAnomalyDetectorConfig()

    override fun anomalyDetectorDescription(): String? =
        unwrap(this).getAnomalyDetectorDescription()

    override fun anomalyDetectorName(): String? = unwrap(this).getAnomalyDetectorName()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun metricSetList(): Any = unwrap(this).getMetricSetList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnomalyDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps):
        CfnAnomalyDetectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnomalyDetectorProps):
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps
  }
}
