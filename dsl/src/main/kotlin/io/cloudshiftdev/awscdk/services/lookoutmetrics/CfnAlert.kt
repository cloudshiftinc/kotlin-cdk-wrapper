package io.cloudshiftdev.awscdk.services.lookoutmetrics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlert internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert,
) : CfnResource(cdkObject), IInspectable {
  public open fun action(): Any = unwrap(this).getAction()

  public open fun action(`value`: IResolvable) {
    unwrap(this).setAction(`value`.let(IResolvable::unwrap))
  }

  public open fun action(`value`: ActionProperty) {
    unwrap(this).setAction(`value`.let(ActionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b95d6b99fb4f0256195cb6943042dccba07e9fb979866e2e1df086fbcd3fa028")
  public open fun action(`value`: ActionProperty.Builder.() -> Unit): Unit =
      action(ActionProperty(`value`))

  public open fun alertDescription(): String? = unwrap(this).getAlertDescription()

  public open fun alertDescription(`value`: String) {
    unwrap(this).setAlertDescription(`value`)
  }

  public open fun alertName(): String? = unwrap(this).getAlertName()

  public open fun alertName(`value`: String) {
    unwrap(this).setAlertName(`value`)
  }

  public open fun alertSensitivityThreshold(): Number = unwrap(this).getAlertSensitivityThreshold()

  public open fun alertSensitivityThreshold(`value`: Number) {
    unwrap(this).setAlertSensitivityThreshold(`value`)
  }

  public open fun anomalyDetectorArn(): String = unwrap(this).getAnomalyDetectorArn()

  public open fun anomalyDetectorArn(`value`: String) {
    unwrap(this).setAnomalyDetectorArn(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun action(action: IResolvable) {
    }

    public fun action(action: ActionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("278d5b12b8e89982419453ae1ea077de5bb3941638eeabea7724e0a04e604d45")
    public fun action(action: ActionProperty.Builder.() -> Unit) {
    }

    public fun alertDescription(alertDescription: String) {
    }

    public fun alertName(alertName: String) {
    }

    public fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
    }

    public fun anomalyDetectorArn(anomalyDetectorArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.Builder =
        software.amazon.awscdk.services.lookoutmetrics.CfnAlert.Builder.create(scope, id)

    public override fun action(action: IResolvable) {
      cdkBuilder.action(action.let(IResolvable::unwrap))
    }

    public override fun action(action: ActionProperty) {
      cdkBuilder.action(action.let(ActionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("278d5b12b8e89982419453ae1ea077de5bb3941638eeabea7724e0a04e604d45")
    public override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
        action(ActionProperty(action))

    public override fun alertDescription(alertDescription: String) {
      cdkBuilder.alertDescription(alertDescription)
    }

    public override fun alertName(alertName: String) {
      cdkBuilder.alertName(alertName)
    }

    public override fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
      cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
    }

    public override fun anomalyDetectorArn(anomalyDetectorArn: String) {
      cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
    }

    public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAlert = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlert {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlert(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert): CfnAlert
        = CfnAlert(cdkObject)

    internal fun unwrap(wrapped: CfnAlert): software.amazon.awscdk.services.lookoutmetrics.CfnAlert
        = wrapped.cdkObject
  }

  public interface ActionProperty {
    public fun lambdaConfiguration(): Any? = unwrap(this).getLambdaConfiguration()

    public fun snsConfiguration(): Any? = unwrap(this).getSnsConfiguration()

    public interface Builder {
      public fun lambdaConfiguration(lambdaConfiguration: IResolvable) {
      }

      public fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a3986527e9aa6ec69402be8b4e46fed80a6999a2031ccfe032e4b81c8bdbba2")
      public
          fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty.Builder.() -> Unit) {
      }

      public fun snsConfiguration(snsConfiguration: IResolvable) {
      }

      public fun snsConfiguration(snsConfiguration: SNSConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63e72e0610e94a8ffa8307fe364f6918789fc16738b62a3a110b3403b0808faa")
      public fun snsConfiguration(snsConfiguration: SNSConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty.Builder =
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty.builder()

      public override fun lambdaConfiguration(lambdaConfiguration: IResolvable) {
        cdkBuilder.lambdaConfiguration(lambdaConfiguration.let(IResolvable::unwrap))
      }

      public override fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty) {
        cdkBuilder.lambdaConfiguration(lambdaConfiguration.let(LambdaConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a3986527e9aa6ec69402be8b4e46fed80a6999a2031ccfe032e4b81c8bdbba2")
      public override
          fun lambdaConfiguration(lambdaConfiguration: LambdaConfigurationProperty.Builder.() -> Unit):
          Unit = lambdaConfiguration(LambdaConfigurationProperty(lambdaConfiguration))

      public override fun snsConfiguration(snsConfiguration: IResolvable) {
        cdkBuilder.snsConfiguration(snsConfiguration.let(IResolvable::unwrap))
      }

      public override fun snsConfiguration(snsConfiguration: SNSConfigurationProperty) {
        cdkBuilder.snsConfiguration(snsConfiguration.let(SNSConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("63e72e0610e94a8ffa8307fe364f6918789fc16738b62a3a110b3403b0808faa")
      public override
          fun snsConfiguration(snsConfiguration: SNSConfigurationProperty.Builder.() -> Unit): Unit
          = snsConfiguration(SNSConfigurationProperty(snsConfiguration))

      public fun build(): software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty,
    ) : ActionProperty {
      public override fun lambdaConfiguration(): Any? = unwrap(this).getLambdaConfiguration()

      public override fun snsConfiguration(): Any? = unwrap(this).getSnsConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaConfigurationProperty {
    public fun lambdaArn(): String

    public fun roleArn(): String

    public interface Builder {
      public fun lambdaArn(lambdaArn: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty.builder()

      public override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty,
    ) : LambdaConfigurationProperty {
      public override fun lambdaArn(): String = unwrap(this).getLambdaArn()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty):
          LambdaConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigurationProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SNSConfigurationProperty {
    public fun roleArn(): String

    public fun snsTopicArn(): String

    public interface Builder {
      public fun roleArn(roleArn: String) {
      }

      public fun snsTopicArn(snsTopicArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty.Builder =
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty.builder()

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty,
    ) : SNSConfigurationProperty {
      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SNSConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty):
          SNSConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SNSConfigurationProperty):
          software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
