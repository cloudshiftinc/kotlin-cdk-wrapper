@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lookoutmetrics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAlertProps {
  public fun action(): Any

  public fun alertDescription(): String? = unwrap(this).getAlertDescription()

  public fun alertName(): String? = unwrap(this).getAlertName()

  public fun alertSensitivityThreshold(): Number

  public fun anomalyDetectorArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun action(action: IResolvable)

    public fun action(action: CfnAlert.ActionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("494f3cedb4887c86a44f8656b9aa726dee3d7e02a83082d5e50187568dfda58b")
    public fun action(action: CfnAlert.ActionProperty.Builder.() -> Unit)

    public fun alertDescription(alertDescription: String)

    public fun alertName(alertName: String)

    public fun alertSensitivityThreshold(alertSensitivityThreshold: Number)

    public fun anomalyDetectorArn(anomalyDetectorArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps.builder()

    override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable::unwrap))
    }

    override fun action(action: CfnAlert.ActionProperty) {
      cdkBuilder.action(action.let(CfnAlert.ActionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("494f3cedb4887c86a44f8656b9aa726dee3d7e02a83082d5e50187568dfda58b")
    override fun action(action: CfnAlert.ActionProperty.Builder.() -> Unit): Unit =
        action(CfnAlert.ActionProperty(action))

    override fun alertDescription(alertDescription: String) {
      cdkBuilder.alertDescription(alertDescription)
    }

    override fun alertName(alertName: String) {
      cdkBuilder.alertName(alertName)
    }

    override fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
      cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
    }

    override fun anomalyDetectorArn(anomalyDetectorArn: String) {
      cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
    }

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps,
  ) : CdkObject(cdkObject), CfnAlertProps {
    override fun action(): Any = unwrap(this).getAction()

    override fun alertDescription(): String? = unwrap(this).getAlertDescription()

    override fun alertName(): String? = unwrap(this).getAlertName()

    override fun alertSensitivityThreshold(): Number = unwrap(this).getAlertSensitivityThreshold()

    override fun anomalyDetectorArn(): String = unwrap(this).getAnomalyDetectorArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAlertProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps):
        CfnAlertProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAlertProps):
        software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps
  }
}
