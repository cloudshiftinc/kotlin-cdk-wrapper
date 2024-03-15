@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLogAnomalyDetectorProps {
  public fun accountId(): String? = unwrap(this).getAccountId()

  public fun anomalyVisibilityTime(): Number? = unwrap(this).getAnomalyVisibilityTime()

  public fun detectorName(): String? = unwrap(this).getDetectorName()

  public fun evaluationFrequency(): String? = unwrap(this).getEvaluationFrequency()

  public fun filterPattern(): String? = unwrap(this).getFilterPattern()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun logGroupArnList(): List<String> = unwrap(this).getLogGroupArnList() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accountId(accountId: String)

    public fun anomalyVisibilityTime(anomalyVisibilityTime: Number)

    public fun detectorName(detectorName: String)

    public fun evaluationFrequency(evaluationFrequency: String)

    public fun filterPattern(filterPattern: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun logGroupArnList(logGroupArnList: List<String>)

    public fun logGroupArnList(vararg logGroupArnList: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps.Builder
        = software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps.builder()

    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    override fun anomalyVisibilityTime(anomalyVisibilityTime: Number) {
      cdkBuilder.anomalyVisibilityTime(anomalyVisibilityTime)
    }

    override fun detectorName(detectorName: String) {
      cdkBuilder.detectorName(detectorName)
    }

    override fun evaluationFrequency(evaluationFrequency: String) {
      cdkBuilder.evaluationFrequency(evaluationFrequency)
    }

    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun logGroupArnList(logGroupArnList: List<String>) {
      cdkBuilder.logGroupArnList(logGroupArnList)
    }

    override fun logGroupArnList(vararg logGroupArnList: String): Unit =
        logGroupArnList(logGroupArnList.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps,
  ) : CdkObject(cdkObject), CfnLogAnomalyDetectorProps {
    override fun accountId(): String? = unwrap(this).getAccountId()

    override fun anomalyVisibilityTime(): Number? = unwrap(this).getAnomalyVisibilityTime()

    override fun detectorName(): String? = unwrap(this).getDetectorName()

    override fun evaluationFrequency(): String? = unwrap(this).getEvaluationFrequency()

    override fun filterPattern(): String? = unwrap(this).getFilterPattern()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun logGroupArnList(): List<String> = unwrap(this).getLogGroupArnList() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLogAnomalyDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps):
        CfnLogAnomalyDetectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLogAnomalyDetectorProps):
        software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps
  }
}
